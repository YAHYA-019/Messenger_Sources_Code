package X;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.252, reason: invalid class name */
/* loaded from: 252.class */
public class AnonymousClass252 implements C1tj {
    public float A00;
    public float A01;
    public boolean A02;
    public final AnonymousClass250 A03;

    public AnonymousClass252(AnonymousClass250 anonymousClass250) {
        this.A03 = anonymousClass250;
        float f = 0.0f / 0.0f;
        this.A01 = f;
        this.A00 = f;
    }

    public void A00(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A01(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A02(float f) {
        this.A01 = f;
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A03(int i) {
        float f = i;
        this.A00 = f;
        YogaNative.jni_YGNodeStyleSetHeightJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A04(int i) {
        float f = i;
        this.A01 = f;
        YogaNative.jni_YGNodeStyleSetWidthJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A05(C1ro c1ro) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(((YogaNodeJNIBase) this.A03).mNativePointer, c1ro.mIntValue);
    }

    public void A06(C26z c26z, float f) {
        if (this instanceof 2kA) {
            return;
        }
        if (!(this instanceof C2qn)) {
            11T.A0F(c26z, 0);
            this.A02 = true;
            YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) this.A03).mNativePointer, c26z.mIntValue, f);
            return;
        }
        C2qn c2qn = (C2qn) this;
        11T.A0F(c26z, 0);
        2cN r306 = c2qn.A00;
        if (r306 == null) {
            r306 = new 2cN();
            c2qn.A00 = r306;
        }
        r306.A02(c26z, f);
        boolean[] zArr = c2qn.A02;
        if (zArr == null) {
            zArr = new boolean[C26z.ALL.mIntValue + 1];
            c2qn.A02 = zArr;
        }
        zArr[c26z.mIntValue] = true;
    }

    public void A07(C26z c26z, int i) {
        11T.A0F(c26z, 0);
        YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) this.A03).mNativePointer, c26z.mIntValue, i);
    }

    public void A08(C26z c26z, int i) {
        11T.A0F(c26z, 0);
        YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) this.A03).mNativePointer, c26z.mIntValue, i);
    }

    public void A09(2dP r302) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(((YogaNodeJNIBase) this.A03).mNativePointer, r302.mIntValue);
    }

    @Override // X.C1tj
    public void CWc(C26z c26z, int i) {
        11T.A0F(c26z, 0);
        this.A02 = true;
        YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) this.A03).mNativePointer, c26z.mIntValue, i);
    }
}
