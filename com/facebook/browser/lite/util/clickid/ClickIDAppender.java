package com.facebook.browser.lite.util.clickid;

import X.11T;
import X.C0il;
import X.KWE;
import com.facebook.jni.HybridData;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: ClickIDAppender.class */
public final class ClickIDAppender {
    public static final KWE Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.KWE] */
    static {
        C0il.A0B("clickid");
    }

    public ClickIDAppender(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0(List list, List list2);

    public final native String appendFbclid(String str, String str2);

    public final native String appendParams(String str, Map map);

    public final native String extractDestDomain(String str);

    public final native String extractDestUri(String str);

    public final native String getFbclid(String str);

    public final native Map getParams(String str, Set set);

    public final native String injectFbclidClickTimestamp(String str, long j);

    public final native String removeParams(String str, Set set);

    public final native String setClickTimestamp(String str, long j);
}
