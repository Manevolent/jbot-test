package com.github.manevolent.jbot.plugin.test;

import com.github.manevolent.jbot.command.CommandSender;
import com.github.manevolent.jbot.command.executor.chained.AnnotatedCommandExecutor;
import com.github.manevolent.jbot.plugin.Plugin;
import com.github.manevolent.jbot.plugin.java.PluginEntry;

public class Entry implements PluginEntry {
    @Override
    public Plugin instantiate(Plugin.Builder builder) {
        return builder
                .command("test", new AnnotatedCommandExecutor() {
                    @Command()
                    public void test(CommandSender sender) {
                        sender.sendMessage("Hello from test plugin!");
                    }
                })
                .build();
    }

    @Override
    public void destruct(Plugin plugin) {

    }
}
