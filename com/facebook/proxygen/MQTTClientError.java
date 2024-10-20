package com.facebook.proxygen;

import X.AnonymousClass001;

/* loaded from: MQTTClientError.class */
public class MQTTClientError {
    public int mConnAckCode;
    public String mErrMsg;
    public MQTTErrorType mErrType;

    /* loaded from: MQTTClientError$MQTTErrorType.class */
    public enum MQTTErrorType {
        PARSE_ERROR,
        TRANSPORT_CONNECT_ERROR,
        MQTT_CONNECT_ERROR,
        CONNECTION_CLOSED,
        READ_ERROR,
        WRITE_ERROR,
        EOF,
        PING_TIMEOUT,
        DISCONNECT,
        COMPRESSION_ERROR,
        STOPPED_BEFORE_MQTT_CONNECT,
        UNKNOWN
    }

    public MQTTClientError(MQTTErrorType mQTTErrorType, String str) {
        this.mErrType = mQTTErrorType;
        this.mErrMsg = str;
    }

    public int getConnAckCode() {
        return this.mConnAckCode;
    }

    public String getMessage() {
        return this.mErrMsg;
    }

    public MQTTErrorType getType() {
        return this.mErrType;
    }

    public void setConnAckCode(int i) {
        this.mConnAckCode = i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        int i = this.mConnAckCode;
        if (i != 0) {
            A0k.append("conAckCode=");
            A0k.append(i);
        }
        A0k.append("errType=");
        A0k.append(this.mErrType.name());
        A0k.append("errMsg=");
        return AnonymousClass001.A0d(this.mErrMsg, A0k);
    }
}
