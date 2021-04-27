package dev.pandaa;


import dev.waterdog.plugin.Plugin;
import dev.pandaa.commands.*;



public class Test extends Plugin {


    @Override
    public void onEnable() {
        // Plugin startup logic


        getProxy().getCommandMap().registerCommand("social", new SocialCommand());
        this.getLogger().info("The Completely  idk what the frick to name it has loaded");

    }




}
