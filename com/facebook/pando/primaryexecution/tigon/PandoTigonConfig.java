package com.facebook.pando.primaryexecution.tigon;

import X.11T;
import X.C00m;
import X.JAl;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PandoTigonConfig.class */
public final class PandoTigonConfig {
    public final boolean enableUnsetFieldRemoval;
    public final boolean failNetworkOnZeroTimeout;
    public final Function1 headers;
    public final C00m requestUrl;
    public final boolean shouldGzipCompressBody;

    public PandoTigonConfig() {
        this(JAl.A00, null, false, false, false);
    }

    public PandoTigonConfig(Function1 function1, C00m c00m, boolean z, boolean z2, boolean z3) {
        11T.A0F(function1, 1);
        this.headers = function1;
        this.requestUrl = c00m;
        this.failNetworkOnZeroTimeout = z;
        this.enableUnsetFieldRemoval = z2;
        this.shouldGzipCompressBody = z3;
    }

    public /* synthetic */ PandoTigonConfig(Function1 function1, C00m c00m, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? JAl.A00 : function1, (i & 2) != 0 ? null : c00m, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? z3 : false);
    }

    public final boolean getEnableUnsetFieldRemoval() {
        return this.enableUnsetFieldRemoval;
    }

    public final boolean getFailNetworkOnZeroTimeout() {
        return this.failNetworkOnZeroTimeout;
    }

    public final Map getHeaders(String str) {
        11T.A0F(str, 0);
        return (Map) this.headers.invoke(str);
    }

    public final String getRequestUrl() {
        C00m c00m = this.requestUrl;
        if (c00m != null) {
            return (String) c00m.invoke();
        }
        return null;
    }

    public final boolean getShouldGzipCompressBody() {
        return this.shouldGzipCompressBody;
    }
}
