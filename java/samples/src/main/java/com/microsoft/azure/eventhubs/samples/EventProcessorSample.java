package com.microsoft.azure.eventhubs.samples;


import com.microsoft.azure.servicebus.ConnectionStringBuilder;
import com.microsoft.azure.eventprocessorhost.*;

public class EventProcessorSample {
    public static void main(String args[])
    {
        ConnectionStringBuilder connStr = new ConnectionStringBuilder("jbirdtest", "learnhub", "allpolicy", "SvgdDB9qala2yLA4YGc/cjxTr52W5zBPpAGYahGEIto=");
        AzureStorageCheckpointLeaseManager combinedManager = new AzureStorageCheckpointLeaseManager("TODO");
        //combinedManager.InitializeCheckpointManager("jbirdTest", "$Default",);
        EventProcessorHost host = new EventProcessorHost(connStr.toString(), "$Default", combinedManager, combinedManager);
    }
}