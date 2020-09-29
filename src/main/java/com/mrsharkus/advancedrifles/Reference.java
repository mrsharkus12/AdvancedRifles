package com.mrcrayfish.advancedrifles;

/**
 * Author: MrCrayfish
 */
public class Reference
{
    /* Replace these with your modid, name, version. */
    public static final String MOD_ID = "advancedrifles";
    public static final String MOD_NAME = "Advanced Rifles";
    public static final String MOD_VERSION = "0.6.0";

    /* This version of Minecraft should match the same as the Gun Mod you are developing against */
    public static final String MC_VERSION = "[1.12.2]";

    /* Make sure you keep this. This makes sure that your addon cannot load without MrCrayfish's
     * Gun mod installed. It also makes sure that the MrCrayfish's Gun Mod is loaded first before
     * yours is, otherwise you will get missing class exceptions. */
    public static final String DEPENDENCIES = "required-after:cgm@[0.13.1,);";

    public static final String PROXY_CLIENT = "com.mrcrayfish.advancedrifles.proxy.ClientProxy";
    public static final String PROXY_SERVER = "com.mrcrayfish.advancedrifles.proxy.CommonProxy";
}
