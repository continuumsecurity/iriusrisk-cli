package com.iriusrisk.cli;

import picocli.CommandLine;

@CommandLine.Command(name = "products", synopsisSubcommandLabel = "(list | get)", mixinStandardHelpOptions = true)
public class ProductsCommand {

    @CommandLine.Command(name = "get")
    public void getCommand() {
        System.out.println("Get");
    }
}
