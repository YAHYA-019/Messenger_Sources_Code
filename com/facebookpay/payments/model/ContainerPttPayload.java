package com.facebookpay.payments.model;

import X.11T;
import X.7zT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ContainerPttPayload.class */
public final class ContainerPttPayload {
    public final List components;
    public final String containerMode;
    public final String contextId;
    public final String credentialId;
    public final String csc;
    public final String expiryMonth;
    public final String expiryYear;
    public final String receiverId;
    public final String securityOrigin;

    public ContainerPttPayload(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8) {
        11T.A0F(str, 1);
        7zT.A11(3, str3, str4, list, str5);
        this.containerMode = str;
        this.securityOrigin = str2;
        this.receiverId = str3;
        this.contextId = str4;
        this.components = list;
        this.credentialId = str5;
        this.expiryMonth = str6;
        this.expiryYear = str7;
        this.csc = str8;
    }

    public /* synthetic */ ContainerPttPayload(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, list, str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }

    public final List getComponents() {
        return this.components;
    }

    public final String getContainerMode() {
        return this.containerMode;
    }

    public final String getContextId() {
        return this.contextId;
    }

    public final String getCredentialId() {
        return this.credentialId;
    }

    public final String getCsc() {
        return this.csc;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getReceiverId() {
        return this.receiverId;
    }

    public final String getSecurityOrigin() {
        return this.securityOrigin;
    }
}
