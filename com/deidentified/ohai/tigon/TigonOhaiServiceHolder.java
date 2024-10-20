package com.deidentified.ohai.tigon;

import X.11T;
import X.C01973te;
import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: TigonOhaiServiceHolder.class */
public final class TigonOhaiServiceHolder extends TigonServiceHolder {
    public static final C01973te Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3te, java.lang.Object] */
    static {
        C0il.A0B("tigonohaiserviceholder-jni");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonOhaiServiceHolder(TigonServiceHolder tigonServiceHolder, String str, String str2) {
        super(initHybrid(tigonServiceHolder, str, str2));
        11T.A0F(tigonServiceHolder, 1);
    }

    public static final native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, String str, String str2);
}
