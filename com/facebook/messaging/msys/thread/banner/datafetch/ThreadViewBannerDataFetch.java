package com.facebook.messaging.msys.thread.banner.datafetch;

import X.5Tq;
import X.5iJ;
import X.5iK;
import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadViewBannerDataFetch.class */
public final class ThreadViewBannerDataFetch extends 5iK {
    public Bundle A00;
    public ViewerContext A01;
    public ThreadKey A02;
    public 5iJ A03;
    public 5Tq A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.msys.thread.banner.datafetch.ThreadViewBannerDataFetch, java.lang.Object] */
    public static ThreadViewBannerDataFetch create(5iJ r301, 5Tq r302) {
        ?? obj = new Object();
        obj.A03 = r301;
        obj.A00 = r302.A00;
        obj.A02 = r302.A02;
        obj.A01 = r302.A01;
        obj.A04 = r302;
        return obj;
    }
}
