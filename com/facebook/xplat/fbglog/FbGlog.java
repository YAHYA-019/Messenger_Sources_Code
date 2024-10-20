package com.facebook.xplat.fbglog;

import X.0fH;
import X.0fI;
import X.19J;
import X.C0gh;
import java.util.List;

/* loaded from: FbGlog.class */
public class FbGlog {
    public static 0fI sCallback;

    static {
        C0gh.A03("fb");
        if (19J.A00) {
            setSkipSubscribe(true);
            ensureSubscribedToBLogLevelChanges();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0fI, java.lang.Object] */
    public static void ensureSubscribedToBLogLevelChanges() {
        synchronized (FbGlog.class) {
            if (sCallback == null) {
                ?? obj = new Object();
                sCallback = obj;
                List list = 0fH.A00;
                synchronized (0fH.class) {
                    list.add(obj);
                }
                setLogLevel(0fH.A01.Axs());
            }
        }
    }

    public static native void setLogLevel(int i);

    public static native void setSkipSubscribe(boolean z);
}
