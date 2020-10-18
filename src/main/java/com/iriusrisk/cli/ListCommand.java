package com.iriusrisk.cli;

import com.iriusrisk.cli.client.IriusApiClient;
import picocli.CommandLine;

@CommandLine.Command(name = "list", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable {
    @CommandLine.Spec
    CommandLine.Model.CommandSpec spec;
    IriusApiClient apiClient;

    public ListCommand() {
        apiClient = new IriusApiClient();
    }

    @CommandLine.Command(name = "-a", description = "List all threat models")
    public void listAllModels() {
        System.out.println("Listing all models");
    }

    @Override
    public void run() {
        spec.commandLine().usage(System.out);
    }
}
