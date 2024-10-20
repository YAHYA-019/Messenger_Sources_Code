package com.facebookpay.offsite.models.message;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: StartCheckoutContent.class */
public final class StartCheckoutContent {
    public final List cookieNames;
    public final String handle;

    public StartCheckoutContent() {
        this(null, null);
    }

    public StartCheckoutContent(String str, List list) {
        this.handle = str;
        this.cookieNames = list;
    }

    public /* synthetic */ StartCheckoutContent(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    public final List getCookieNames() {
        return this.cookieNames;
    }

    public final String getHandle() {
        return this.handle;
    }
}
