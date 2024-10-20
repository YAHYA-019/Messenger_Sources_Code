package org.pytorch;

import X.C0gh;
import X.H95;
import X.JHP;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: LiteNativePeer.class */
public class LiteNativePeer implements JHP {
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.0gc] */
    static {
        if (!C0gh.A01()) {
            C0gh.A00(new Object());
        }
        C0gh.A02("pytorch_jni_lite");
        try {
            C0gh.A02("torch-code-gen");
        } catch (Throwable unused) {
        }
    }

    public LiteNativePeer(String str, Map map, H95 h95) {
        this.mHybridData = initHybrid(str, null, h95.jniCode);
    }

    public static native HybridData initHybrid(String str, Map map, int i);

    public static native HybridData initHybridAndroidAsset(String str, Object obj, int i);

    public native IValue forward(IValue... iValueArr);

    public native IValue runMethod(String str, IValue... iValueArr);
}
