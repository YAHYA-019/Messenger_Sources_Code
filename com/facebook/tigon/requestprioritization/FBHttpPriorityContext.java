package com.facebook.tigon.requestprioritization;

import X.11T;
import X.1BK;
import X.AnonymousClass409;
import X.C0il;
import X.C3P3;
import X.EnumC04093zx;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.HttpPriorityContext;

/* loaded from: FBHttpPriorityContext.class */
public final class FBHttpPriorityContext extends HttpPriorityContext {
    public static final C3P3 Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3P3] */
    static {
        C0il.A0B("fbhttpprioritycontext");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBHttpPriorityContext(EnumC04093zx enumC04093zx, RequestPriority requestPriority, String str) {
        super(null);
        11T.A0F(enumC04093zx, 1);
        1BK.A1J(requestPriority, 2, str);
        int i = 1;
        int ordinal = requestPriority.ordinal();
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 0) {
                i = 0;
            }
        }
        this.mHybridData = initHybrid(enumC04093zx.value, i, str);
    }

    public static final FBHttpPriorityContext contextFromRequest(AnonymousClass409 anonymousClass409) {
        return C3P3.A00(anonymousClass409);
    }

    public static final native HybridData initHybrid(int i, int i2, String str);

    public final native void setDistanceToViewport(int i);

    public final native void setEnableShadowModeOnUpdate(boolean z);

    public final native void setVideoAsPlaying();

    public final native void setVideoPriorityFields(long j, int i);
}
