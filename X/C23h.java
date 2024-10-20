package X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.23h, reason: invalid class name */
/* loaded from: 23h.class */
public abstract class C23h {
    public static final C23j A00;

    static {
        C23i c23i = new C23i(0);
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(c23i.A00, true);
        YogaNative.jni_YGConfigSetErrataJNI(c23i.A00, 2147483646);
        YogaNative.jni_YGConfigSetExperimentalFeatureEnabledJNI(c23i.A00, 0, C02A.isYogaFlexBasisFixEnabled);
        A00 = c23i;
    }
}
