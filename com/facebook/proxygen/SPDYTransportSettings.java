package com.facebook.proxygen;

/* loaded from: SPDYTransportSettings.class */
public class SPDYTransportSettings {
    public int customTransactionTimeoutInSeconds;
    public String mergeHost;
    public String mergeHostCname;
    public String originalHost;
    public boolean enableSPDYTransport = false;
    public boolean enableConnectionMerge = false;
    public boolean enableCustomTransactionTimeout = false;

    public SPDYTransportSettings setCustomTransactionTimeoutInSeconds(int i) {
        this.customTransactionTimeoutInSeconds = i;
        return this;
    }

    public SPDYTransportSettings setEnableConnectionMerge(boolean z) {
        this.enableConnectionMerge = z;
        return this;
    }

    public SPDYTransportSettings setEnableCustomTransactionTimeout(boolean z) {
        this.enableCustomTransactionTimeout = z;
        return this;
    }

    public SPDYTransportSettings setEnableSPDYTransport(boolean z) {
        this.enableSPDYTransport = z;
        return this;
    }

    public SPDYTransportSettings setMergeHost(String str) {
        this.mergeHost = str;
        return this;
    }

    public SPDYTransportSettings setMergeHostCname(String str) {
        this.mergeHostCname = str;
        return this;
    }

    public SPDYTransportSettings setOriginalHost(String str) {
        this.originalHost = str;
        return this;
    }
}
