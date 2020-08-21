package com.iriusrisk.cli;

import picocli.CommandLine;

@CommandLine.Command(name = "show", mixinStandardHelpOptions = true)
public class ShowCommand implements Runnable {
    @CommandLine.Spec
    CommandLine.Model.CommandSpec spec;



    @Override
    public void run() {
        throw new CommandLine.ParameterException(spec.commandLine(), "Specify a command: (list | show)");
    }
}

