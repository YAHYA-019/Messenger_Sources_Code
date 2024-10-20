package com.facebook.messaging.msys.thread.titlebar.datafetch;

import X.5Tr;
import X.5iJ;
import X.5iK;
import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;

/* loaded from: TitlebarDataFetch.class */
public final class TitlebarDataFetch extends 5iK {
    public Bundle A00;
    public ViewerContext A01;
    public 5iJ A02;
    public String A03;
    public 5Tr A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.messaging.msys.thread.titlebar.datafetch.TitlebarDataFetch] */
    public static TitlebarDataFetch create(5iJ r301, 5Tr r302) {
        ?? obj = new Object();
        obj.A02 = r301;
        obj.A00 = r302.A00;
        obj.A03 = r302.A02;
        obj.A01 = r302.A01;
        obj.A04 = r302;
        return obj;
    }
}
