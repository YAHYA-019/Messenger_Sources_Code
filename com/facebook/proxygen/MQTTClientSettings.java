package com.facebook.proxygen;

import com.facebook.mobileconfig.init.MobileConfigSessionlessInit;

/* loaded from: MQTTClientSettings.class */
public class MQTTClientSettings {
    public String bypassProxyDomains;
    public int connectTimeout;
    public int pingRespTimeout;
    public String proxyAddress;
    public boolean proxyFallbackEnabled;
    public int proxyPort;
    public String proxyUserAgent;
    public String secureProxyAddress;
    public int secureProxyPort;
    public boolean verifyCertificates;
    public boolean zlibCompression;

    /* loaded from: MQTTClientSettings$Builder.class */
    public class Builder {
        public int pingRespTimeout = 0;
        public int connectTimeout = MobileConfigSessionlessInit.SYNC_UPDATE_WAIT_TIME_MS;
        public boolean verifyCertificates = true;
        public boolean zlibCompression = false;
        public String proxyAddress = "";
        public int proxyPort = 0;
        public String secureProxyAddress = "";
        public int secureProxyPort = 0;
        public String bypassProxyDomains = "";
        public String proxyUserAgent = "WhistleClient";
        public boolean proxyFallbackEnabled = true;
        public boolean xplatMqttEnabled = false;

        public MQTTClientSettings build() {
            return new MQTTClientSettings(this.pingRespTimeout, this.connectTimeout, this.verifyCertificates, this.zlibCompression, this.proxyAddress, this.proxyPort, this.secureProxyAddress, this.secureProxyPort, this.bypassProxyDomains, this.proxyUserAgent, this.proxyFallbackEnabled);
        }

        public Builder setBypassProxyDomains(String str) {
            this.bypassProxyDomains = str;
            return this;
        }

        public Builder setConnectTimeout(int i) {
            this.connectTimeout = i;
            return this;
        }

        public Builder setPingRespTimeout(int i) {
            this.pingRespTimeout = i;
            return this;
        }

        public Builder setProxyFallbackEnabled(boolean z) {
            this.proxyFallbackEnabled = z;
            return this;
        }

        public Builder setProxySettings(String str, int i) {
            this.proxyAddress = str;
            this.proxyPort = i;
            return this;
        }

        public Builder setProxyUserAgent(String str) {
            this.proxyUserAgent = str;
            return this;
        }

        public Builder setSecureProxySettings(String str, int i) {
            this.secureProxyAddress = str;
            this.secureProxyPort = i;
            return this;
        }

        public Builder setVerifyCertificates(boolean z) {
            this.verifyCertificates = z;
            return this;
        }

        public Builder setZlibCompression(boolean z) {
            this.zlibCompression = z;
            return this;
        }
    }

    public MQTTClientSettings(int i, int i2, boolean z, boolean z2, String str, int i3, String str2, int i4, String str3, String str4, boolean z3) {
        this.pingRespTimeout = i;
        this.connectTimeout = i2;
        this.verifyCertificates = z;
        this.zlibCompression = z2;
        this.proxyAddress = str;
        this.proxyPort = i3;
        this.secureProxyAddress = str2;
        this.secureProxyPort = i4;
        this.bypassProxyDomains = str3;
        this.proxyUserAgent = str4;
        this.proxyFallbackEnabled = z3;
    }
}
