package com.facebook.acra.info;

import X.11T;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: ExternalProcessInfo.class */
public final class ExternalProcessInfo {
    public final LinkedHashMap acraFields = new LinkedHashMap();
    public String message;
    public Integer pid;

    public final String getAcraField(String str) {
        11T.A0F(str, 0);
        return (String) this.acraFields.get(str);
    }

    public final Map getAcraFields() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.acraFields);
        11T.A0A(unmodifiableMap);
        return unmodifiableMap;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getPid() {
        return this.pid;
    }

    public final void setAcraField(String str, String str2) {
        11T.A0H(str, str2);
        this.acraFields.put(str, str2);
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setPid(Integer num) {
        this.pid = num;
    }
}
