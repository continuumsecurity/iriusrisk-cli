package com.iriusrisk.cli;

import com.iriusrisk.cli.client.IriusApiClient;
import picocli.CommandLine;

@CommandLine.Command(name = "irius", mixinStandardHelpOptions = true,
        subcommands = {
            ListCommand.class,
            ShowCommand.class,
            CommandLine.HelpCommand.class
        }, description = "Interact with threat models on IriusRisk")
public class IriusRiskCLI implements Runnable {
    @CommandLine.Spec
    CommandLine.Model.CommandSpec spec;

    public IriusRiskCLI() {
    }

    private int executionStrategy(CommandLine.ParseResult parseResult) {
        init(); // custom initialization to be done before executing any command or subcommand
        return new CommandLine.RunLast().execute(parseResult); // default execution strategy
    }

    private void init() {
        // ...
    }

    @Override
    public void run() {
        spec.commandLine().usage(System.out);
    }

    public static void main(String[] args) {
        IriusRiskCLI cli = new IriusRiskCLI();
        new CommandLine(cli)
                .setExecutionStrategy(cli::executionStrategy)
                .execute(args);
    }
}