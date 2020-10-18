package com.iriusrisk.cli.client;

import com.iriusrisk.ApiClient;

public class IriusApiClient {
    ApiClient apiClient;
    String apiKey = "";
    String url = "";
    final static String APIKEYNAME = "IRIUS_TOKEN";
    final static String URLNAME = "IRIUS_URL";

    public IriusApiClient() {
        apiClient = new ApiClient();
        apiKey = System.getenv(APIKEYNAME);
        url = System.getenv(URLNAME);
        validateSetup();
        apiClient.setAccessToken(apiKey);
    }

    private void validateSetup() {
        boolean exit = false;
        if (apiKey == null || apiKey.equals("")) {
            System.out.println("Set the environment variable: "+APIKEYNAME+" to authenticate to the IriusRisk API");
            exit = true;
        }
        if (url == null || url.equals("")) {
            System.out.println("Set the environment variable: "+URLNAME+" to the URL of the IriusRisk API");
            exit = true;
        }
        if (exit) {
            System.exit(1);
        }

    }


}
