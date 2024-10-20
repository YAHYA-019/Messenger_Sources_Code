package com.facebookpay.offsite.models.message;

import X.1BL;

/* loaded from: ScriptOverrideRequest.class */
public final class ScriptOverrideRequest {
    public final String messageType;
    public final String script;

    public ScriptOverrideRequest(String str, String str2) {
        1BL.A1F(str, str2);
        this.messageType = str;
        this.script = str2;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getScript() {
        return this.script;
    }
}
