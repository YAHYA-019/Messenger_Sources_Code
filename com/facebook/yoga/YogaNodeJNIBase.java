package com.facebook.yoga;

import X.0Pz;
import X.0S2;
import X.11T;
import X.1LN;
import X.25R;
import X.AnonymousClass001;
import X.AnonymousClass250;
import X.AnonymousClass255;
import X.AnonymousClass272;
import X.C23d;
import X.C23f;
import X.C23j;
import X.C26z;
import X.C2ji;
import X.C3PM;
import android.util.Pair;
import android.view.View;
import java.util.List;

/* loaded from: YogaNodeJNIBase.class */
public abstract class YogaNodeJNIBase extends AnonymousClass250 implements Cloneable {
    public float[] arr;
    public C3PM mBaselineFunction;
    public List mChildren;
    public C23j mConfig;
    public Object mData;
    public boolean mHasNewLayout;
    public int mLayoutDirection;
    public 1LN mMeasureFunction;
    public long mNativePointer;
    public YogaNodeJNIBase mOwner;

    public YogaNodeJNIBase() {
        long jni_YGNodeNewJNI = YogaNative.jni_YGNodeNewJNI();
        this.arr = null;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        if (jni_YGNodeNewJNI == 0) {
            throw AnonymousClass001.A0N("Failed to allocate native memory");
        }
        this.mNativePointer = jni_YGNodeNewJNI;
    }

    public static final int A00(Integer num, float f) {
        int A00;
        int i;
        int intValue = num.intValue();
        if (intValue == 1) {
            A00 = AnonymousClass272.A00(f);
            i = 1073741824;
        } else {
            if (intValue == 0) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            if (intValue != 2) {
                throw 0Pz.A05("Unexpected YogaMeasureMode: ", "EXACTLY");
            }
            A00 = AnonymousClass272.A00(f);
            i = (-1) << (-1);
        }
        return View.MeasureSpec.makeMeasureSpec(A00, i);
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.mChildren;
        if (list == null) {
            throw AnonymousClass001.A0N("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.mChildren.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.mOwner = this;
        return yogaNodeJNIBase.mNativePointer;
    }

    public final float baseline(float f, float f2) {
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        r0 = X.AnonymousClass001.A0N("YogaNode does not have children");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.yoga.YogaNodeJNIBase cloneWithChildren() {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNodeJNIBase.cloneWithChildren():com.facebook.yoga.YogaNodeJNIBase");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:228)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:208)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:64)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    @Override // X.AnonymousClass250
    public /* bridge */ /* synthetic */ X.AnonymousClass250 cloneWithoutChildren() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L2c
            r302 = r0
            r0 = r302
            com.facebook.yoga.YogaNodeJNIBase r0 = (com.facebook.yoga.YogaNodeJNIBase) r0     // Catch: java.lang.CloneNotSupportedException -> L2c
            r302 = r0
            r0 = r301
            long r0 = r0.mNativePointer     // Catch: java.lang.CloneNotSupportedException -> L2c
            r303 = r0
            r0 = r303
            long r0 = com.facebook.yoga.YogaNative.jni_YGNodeCloneJNI(r0)     // Catch: java.lang.CloneNotSupportedException -> L2c
            r305 = r0
            r0 = r302
            r1 = 0
            r0.mOwner = r1     // Catch: java.lang.CloneNotSupportedException -> L2c
            r0 = r302
            r1 = r305
            r0.mNativePointer = r1     // Catch: java.lang.CloneNotSupportedException -> L2c
            r0 = r302
            r1 = 0
            r0.mChildren = r1     // Catch: java.lang.CloneNotSupportedException -> L2c
            r0 = r305
            com.facebook.yoga.YogaNative.jni_YGNodeRemoveAllChildrenJNI(r0)     // Catch: java.lang.CloneNotSupportedException -> L2c
            r0 = r302
            return r0
        L2c:
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0U(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNodeJNIBase.cloneWithoutChildren():X.250");
    }

    @Override // X.AnonymousClass250
    public float getLayoutBorder(C26z c26z) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        int i2 = (int) fArr[0];
        if ((i2 & 4) != 4) {
            return 0.0f;
        }
        int i3 = 4;
        if ((i2 & 1) == 1) {
            i3 = 0;
        }
        int i4 = 14 - i3;
        if ((i2 & 2) != 2) {
            i = 4;
        }
        int i5 = i4 - i;
        switch (c26z) {
            case LEFT:
                break;
            case TOP:
                i5++;
                break;
            case RIGHT:
                i5 += 2;
                break;
            default:
                i5 += 3;
                break;
        }
        return fArr[i5];
    }

    @Override // X.AnonymousClass250
    public AnonymousClass255 getLayoutDirection() {
        float[] fArr = this.arr;
        int i = fArr != null ? (int) fArr[5] : this.mLayoutDirection;
        if (i == 0) {
            return AnonymousClass255.INHERIT;
        }
        if (i == 1) {
            return AnonymousClass255.LTR;
        }
        if (i == 2) {
            return AnonymousClass255.RTL;
        }
        throw 0Pz.A04("Unknown enum value: ", i);
    }

    @Override // X.AnonymousClass250
    public float getLayoutPadding(C26z c26z) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        int i2 = (int) fArr[0];
        if ((i2 & 2) != 2) {
            return 0.0f;
        }
        if ((i2 & 1) != 1) {
            i = 4;
        }
        int i3 = 10 - i;
        switch (c26z) {
            case LEFT:
                break;
            case TOP:
                i3++;
                break;
            case RIGHT:
                i3 += 2;
                break;
            default:
                i3 += 3;
                break;
        }
        return fArr[i3];
    }

    public final long measure(float f, int i, float f2, int i2) {
        Integer num;
        Integer num2;
        if (this.mMeasureFunction == null) {
            throw AnonymousClass001.A0T("Measure function isn't defined!");
        }
        if (i == 0) {
            num = 0S2.A00;
        } else if (i == 1) {
            num = 0S2.A01;
        } else {
            if (i != 2) {
                throw 0Pz.A04("Unknown enum value: ", i);
            }
            num = 0S2.A0C;
        }
        if (i2 == 0) {
            num2 = 0S2.A00;
        } else if (i2 == 1) {
            num2 = 0S2.A01;
        } else {
            if (i2 != 2) {
                throw 0Pz.A04("Unknown enum value: ", i2);
            }
            num2 = 0S2.A0C;
        }
        11T.A0F(num, 2);
        11T.A0F(num2, 4);
        C23f c23f = C23f.A00;
        Object obj = this.mData;
        11T.A0I(obj, "null cannot be cast to non-null type android.util.Pair<*, *>");
        Object obj2 = ((Pair) obj).first;
        11T.A0I(obj2, "null cannot be cast to non-null type com.facebook.rendercore.LayoutContext<com.facebook.litho.LithoLayoutContext>");
        C23d c23d = (C23d) obj2;
        Object obj3 = this.mData;
        11T.A0I(obj3, "null cannot be cast to non-null type android.util.Pair<*, *>");
        Object obj4 = ((Pair) obj3).second;
        11T.A0I(obj4, "null cannot be cast to non-null type com.facebook.litho.LithoLayoutResult");
        C2ji A07 = c23f.A07((25R) obj4, c23d, A00(num, f), A00(num2, f2));
        int i3 = A07.A01;
        int i4 = A07.A00;
        float f3 = i3;
        float f4 = i4;
        int floatToRawIntBits = Float.floatToRawIntBits(f3);
        return Float.floatToRawIntBits(f4) | (floatToRawIntBits << 32);
    }
}
