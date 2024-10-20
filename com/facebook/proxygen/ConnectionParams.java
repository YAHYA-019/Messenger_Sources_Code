package com.facebook.proxygen;

/* loaded from: ConnectionParams.class */
public class ConnectionParams {
    public String clientId;
    public boolean enableTopicEncoding;
    public int keepaliveSecs;
    public PublishFormat publishFormat;

    /* loaded from: ConnectionParams$PublishFormat.class */
    public enum PublishFormat {
        RAW(0),
        ZLIB(1),
        ZLIB_OPTIONAL(2);

        public final int value;

        PublishFormat(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public ConnectionParams setClientId(String str) {
        this.clientId = str;
        return this;
    }

    public ConnectionParams setEnableTopicEncoding(boolean z) {
        this.enableTopicEncoding = z;
        return this;
    }

    public ConnectionParams setKeepaliveSec(int i) {
        this.keepaliveSecs = i;
        return this;
    }

    public ConnectionParams setPublishFormat(PublishFormat publishFormat) {
        this.publishFormat = publishFormat;
        return this;
    }
}
