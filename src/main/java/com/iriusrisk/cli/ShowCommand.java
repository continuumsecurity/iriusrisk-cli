package com.iriusrisk.cli;

import com.iriusrisk.cli.client.IriusApiClient;
import picocli.CommandLine;

@CommandLine.Command(name = "show", mixinStandardHelpOptions = true)
public class ShowCommand implements Runnable {
    @CommandLine.Spec
    CommandLine.Model.CommandSpec spec;
    IriusApiClient apiClient;

    public ShowCommand() {
        apiClient = new IriusApiClient();
    }

    @Override
    public void run() {
        throw new CommandLine.ParameterException(spec.commandLine(), "Specify a command: (list | show)");
    }
}

