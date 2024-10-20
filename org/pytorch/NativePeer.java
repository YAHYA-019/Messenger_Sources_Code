package org.pytorch;

import X.C0gh;
import X.JHP;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: NativePeer.class */
public abstract class NativePeer implements JHP {
    public final HybridData mHybridData;

    static {
        C0gh.A02("pytorch_jni");
        try {
            C0gh.A02("torch-code-gen");
        } catch (Throwable unused) {
        }
    }

    public static native HybridData initHybrid(String str, Map map, int i);

    public static native HybridData initHybridAndroidAsset(String str, Object obj, int i);

    public native IValue forward(IValue... iValueArr);

    public native IValue runMethod(String str, IValue... iValueArr);
}
