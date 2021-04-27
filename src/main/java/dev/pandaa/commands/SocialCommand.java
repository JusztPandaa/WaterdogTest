package dev.pandaa.commands;

import dev.waterdog.command.Command;
import dev.waterdog.command.CommandSender;
import dev.waterdog.command.CommandSettings;

public class SocialCommand extends Command {

    public SocialCommand() {
        super("social", CommandSettings.builder()
                .setDescription("Brings up all of the servers social media")
                .build());

    }

    @Override
    public boolean onExecute(CommandSender commandSender, String s, String[] strings) {

        commandSender.sendMessage("##############\nWebsite: skypixelmc.tk\nStore: store.skypixelmc.tk\n##############");
      return false;
    }

}
