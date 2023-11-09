package com.mrsharkus.advancedrifles.client.render.entity;

import com.mrsharkus.advancedrifles.entity.EntityCrossbowDart;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: MrCrayfish
 */
public class RenderCrossbowDart extends Render<EntityCrossbowDart> {
    public RenderCrossbowDart(RenderManager renderManager) {
        super(renderManager);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityCrossbowDart entity) {
        return null;
    }

    @Override
    public void doRender(EntityCrossbowDart entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        {
            GlStateManager.translate(x, y, z);
            GlStateManager.rotate(180F, 0, 1, 0);
            GlStateManager.rotate(entityYaw, 0, 1, 0);
            GlStateManager.rotate(entity.rotationPitch, 1, 0, 0);
            GlStateManager.translate(-0.5, -0.5, -1.0);
            GlStateManager.disableLighting();
            IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelMesher().getItemModel(entity.getItem());
            this.renderBakedModel(model);
            GlStateManager.enableLighting();
        }
        GlStateManager.popMatrix();

        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    private void renderBakedModel(IBakedModel model) {
        this.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder buffer = tessellator.getBuffer();
        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.ITEM);
        for (EnumFacing enumfacing : EnumFacing.values()) {
            this.renderQuads(buffer, model.getQuads(null, enumfacing, 0L));
        }
        this.renderQuads(buffer, model.getQuads(null, null, 0L));
        tessellator.draw();
    }

    private void renderQuads(BufferBuilder buffer, List<BakedQuad> quads) {
        int i = 0;
        for (int j = quads.size(); i < j; ++i) {
            BakedQuad quad = quads.get(i);
            net.minecraftforge.client.model.pipeline.LightUtil.renderQuadColor(buffer, quad, -1);
        }
    }
}
