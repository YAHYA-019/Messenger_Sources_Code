package X;

import android.animation.StateListAnimator;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1sr, reason: invalid class name */
/* loaded from: 1sr.class */
public class C1sr implements C1st, Cloneable {
    public static final 1tY A0w = new Object();
    public static final AtomicInteger A0x = new AtomicInteger(1);
    public float A00;
    public float A01;
    public int A03;
    public int A05;
    public long A06;
    public StateListAnimator A07;
    public Paint A08;
    public PathEffect A09;
    public Rect A0A;
    public Drawable A0B;
    public Drawable A0C;
    public 2cN A0D;
    public 2cN A0E;
    public 1Im A0F;
    public 1Im A0G;
    public 1Im A0H;
    public 1Im A0I;
    public 1Im A0J;
    public 1Im A0K;
    public 1LN A0L;
    public C1tw A0M;
    public 29K A0N;
    public 5Rn A0O;
    public C1tu A0P;
    public C1tr A0Q;
    public C1tv A0R;
    public C29l A0S;
    public C1ro A0T;
    public C1ro A0U;
    public 1tZ A0V;
    public C1rp A0W;
    public EnumC00743oh A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public List A0b;
    public List A0c;
    public List A0d;
    public List A0e;
    public java.util.Map A0g;
    public Set A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean[] A0q;
    public boolean A0r;
    public int A02 = A0x.getAndIncrement();
    public List A0f = new ArrayList(4);
    public final int[] A0v = new int[4];
    public final int[] A0u = new int[4];
    public final float[] A0t = new float[4];
    public int A04 = -1;
    public final List A0s = new ArrayList(2);

    public static final 29K A00(C1sr c1sr) {
        29K r303;
        if (c1sr.A0o) {
            r303 = c1sr.A0N;
            if (r303 == null) {
                r303 = new 29K();
            }
        } else {
            c1sr.A0o = true;
            r303 = new 29K();
            29K r0 = c1sr.A0N;
            if (r0 != null) {
                r0.A01(r303);
            }
        }
        c1sr.A0N = r303;
        return r303;
    }

    public static final boolean A01(C1sr c1sr) {
        29K r0;
        if (c1sr.A0E == null || (r0 = c1sr.A0N) == null) {
            return false;
        }
        return (r0.A0I == null && r0.A0M == null && r0.A0X == null && r0.A0L == null) ? false : true;
    }

    public final int A02() {
        C1tr c1tr = this.A0Q;
        if (c1tr != null) {
            return c1tr.A00;
        }
        throw 1BK.A0h();
    }

    public final 1LI A03() {
        return ((1tT) this.A0s.get(r0.size() - 1)).A03;
    }

    public final 1LI A04() {
        return ((1tT) this.A0s.get(0)).A03;
    }

    public final 1Iw A05() {
        return ((1tT) this.A0s.get(r0.size() - 1)).A04;
    }

    public final 1Iw A06() {
        return ((1tT) this.A0s.get(0)).A04;
    }

    public 25R A07(AnonymousClass257 anonymousClass257) {
        return new 25R(A06(), this, anonymousClass257);
    }

    @Override // X.C1st
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public 25R ADH(C23d c23d, long j) {
        float f;
        float f2;
        C23b c23b = (C23b) c23d.A05;
        if (c23b == null) {
            throw AnonymousClass001.A0N("Cannot calculate a layout without RenderContext.");
        }
        if (!(!c23b.A07)) {
            throw AnonymousClass001.A0N("Cannot calculate a layout with a released LayoutStateContext.");
        }
        C23f c23f = C23f.A00;
        boolean BWo = ComponentsSystrace.A00.BWo();
        if (BWo) {
            ComponentsSystrace.A02(0Pz.A0W("buildYogaTree:", A03().A0a()));
        }
        25R A02 = C23f.A02(this, c23f, c23d, null);
        11T.A0F(A02, 0);
        AnonymousClass257 anonymousClass257 = A02.A02;
        AnonymousClass250 anonymousClass250 = anonymousClass257.A0K;
        if (BWo) {
            ComponentsSystrace.A01();
        }
        int A01 = 26N.A01(j);
        int A00 = 26N.A00(j);
        if (A02() == 1) {
            YogaNative.jni_YGNodeStyleSetDirectionJNI(((YogaNodeJNIBase) anonymousClass250).mNativePointer, AnonymousClass255.RTL.mIntValue);
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) anonymousClass250;
        long jni_YGNodeStyleGetWidthJNI = YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase.mNativePointer);
        float intBitsToFloat = Float.intBitsToFloat((int) jni_YGNodeStyleGetWidthJNI);
        int i = (int) (jni_YGNodeStyleGetWidthJNI >> 32);
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw 0Pz.A04("Unknown enum value: ", i);
        }
        if (26R.A00(intBitsToFloat)) {
            int mode = View.MeasureSpec.getMode(A01);
            float f3 = -0.0f;
            if (mode != ((-1) << (-1))) {
                if (mode == 0) {
                    f2 = 0.0f / 0.0f;
                } else if (mode == 1073741824) {
                    f2 = View.MeasureSpec.getSize(A01);
                }
                YogaNative.jni_YGNodeStyleSetWidthJNI(yogaNodeJNIBase.mNativePointer, f2);
            } else {
                YogaNative.jni_YGNodeStyleSetMaxWidthJNI(yogaNodeJNIBase.mNativePointer, View.MeasureSpec.getSize(A01));
            }
        }
        long jni_YGNodeStyleGetHeightJNI = YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase.mNativePointer);
        float intBitsToFloat2 = Float.intBitsToFloat((int) jni_YGNodeStyleGetHeightJNI);
        int i2 = (int) (jni_YGNodeStyleGetHeightJNI >> 32);
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            throw 0Pz.A04("Unknown enum value: ", i2);
        }
        if (26R.A00(intBitsToFloat2)) {
            int mode2 = View.MeasureSpec.getMode(A00);
            float f4 = -0.0f;
            if (mode2 != ((-1) << (-1))) {
                if (mode2 == 0) {
                    f = 0.0f / 0.0f;
                } else if (mode2 == 1073741824) {
                    f = View.MeasureSpec.getSize(A00);
                }
                YogaNative.jni_YGNodeStyleSetHeightJNI(yogaNodeJNIBase.mNativePointer, f);
            } else {
                YogaNative.jni_YGNodeStyleSetMaxHeightJNI(yogaNodeJNIBase.mNativePointer, View.MeasureSpec.getSize(A00));
            }
        }
        float f5 = 0.0f / 0.0f;
        float size = View.MeasureSpec.getMode(A01) == 0 ? 0.0f / 0.0f : View.MeasureSpec.getSize(A01);
        if (View.MeasureSpec.getMode(A00) != 0) {
            f5 = View.MeasureSpec.getSize(A00);
        }
        if (BWo) {
            ComponentsSystrace.A02(0Pz.A0W("yogaCalculateLayout:", A03().A0a()));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(yogaNodeJNIBase);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            List list = ((YogaNodeJNIBase) arrayList.get(i3)).mChildren;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        int length = yogaNodeJNIBaseArr.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = yogaNodeJNIBaseArr[i4].mNativePointer;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(yogaNodeJNIBase.mNativePointer, size, f5, jArr, yogaNodeJNIBaseArr);
        anonymousClass257.A01 = A01;
        anonymousClass257.A00 = A00;
        float[] fArr = yogaNodeJNIBase.arr;
        c23b.A00 = new Point((int) (fArr != null ? fArr[3] : 0.0f), (int) (fArr != null ? fArr[4] : 0.0f));
        if (BWo) {
            ComponentsSystrace.A01();
        }
        return A02;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:228)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:208)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:64)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    public X.C1sr clone() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1f
            r302 = r0
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.litho.LithoNode"
            r303 = r0
            r0 = r302
            r1 = r303
            X.11T.A0I(r0, r1)     // Catch: java.lang.CloneNotSupportedException -> L1f
            r0 = r302
            X.1sr r0 = (X.C1sr) r0     // Catch: java.lang.CloneNotSupportedException -> L1f
            r302 = r0
            r0 = r301
            int r0 = r0.A02     // Catch: java.lang.CloneNotSupportedException -> L1f
            r304 = r0
            r0 = r302
            r1 = r304
            r0.A02 = r1     // Catch: java.lang.CloneNotSupportedException -> L1f
            r0 = r302
            return r0
        L1f:
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0U(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1sr.clone():X.1sr");
    }

    public final String A0A() {
        return ((1tT) this.A0s.get(0)).A04.A0C();
    }

    public void A0B(PathEffect pathEffect, float[] fArr, int[] iArr, int[] iArr2) {
        if (!(this instanceof C1tw)) {
            11T.A0F(iArr2, 1);
            11T.A0F(fArr, 2);
            this.A06 |= 268435456;
            System.arraycopy(iArr, 0, this.A0v, 0, 4);
            System.arraycopy(iArr2, 0, this.A0u, 0, 4);
            System.arraycopy(fArr, 0, this.A0t, 0, 4);
            this.A09 = pathEffect;
            return;
        }
        C1tw c1tw = (C1tw) this;
        11T.A0F(iArr2, 1);
        11T.A0F(fArr, 2);
        int[] iArr3 = new int[4];
        System.arraycopy(iArr, 0, iArr3, 0, 4);
        System.arraycopy(iArr2, 0, c1tw.A0u, 0, 4);
        System.arraycopy(fArr, 0, c1tw.A0t, 0, 4);
        c1tw.A09 = pathEffect;
        c1tw.A02 = iArr3;
    }

    public final void A0C(1tI r302, int i, int i2, int i3, boolean z) {
        int i4;
        int i5 = i;
        if (this.A0r) {
            return;
        }
        boolean z2 = true;
        if (r302.B8E() != A03().A00) {
            z2 = false;
            if (i2 == 8) {
                this.A06 |= 128;
                this.A03 = 4;
            }
            if (i3 == 2) {
                A00(this).A0B = 2;
            }
        }
        this.A0m = this.A0k;
        C1tr c1tr = this.A0Q;
        if (c1tr != null && (i4 = c1tr.A00) != 2) {
            i5 = i4;
        }
        this.A0Q = new C1tr(i5);
        boolean A03 = A0w.A03(this);
        this.A0i = A03;
        this.A0k = A03 || z2 || (z && this.A0k);
        this.A0P = C1tt.A03(this);
        int size = this.A0f.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1sr c1sr = (C1sr) this.A0f.get(i6);
            int A02 = A02();
            int i7 = this.A03;
            29K r0 = this.A0N;
            c1sr.A0C(r302, A02, i7, r0 != null ? r0.A0B : 0, this.A0k);
        }
        1Iw A05 = A05();
        C29l c29l = this.A0S;
        if (c29l != null && this.A0p) {
            C28s A04 = C1tt.A04(A04(), A05, this, this.A03);
            C02A c02a = A05.A03.A01;
            C2lm c2lm = c29l.A01.A02;
            29L r02 = new 29L(C29R.A00, new C29P(A04, c2lm, false, c02a.A0B, c02a.A0V));
            11T.A0I(r02, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any?, kotlin.Any, kotlin.Any>");
            c2lm.A0E(r02);
        }
        this.A0r = true;
    }

    public final void A0D(1LI r302, 1Iw r303, 1tH r304) {
        C1sr A02;
        11T.A0F(r303, 1);
        if (r302 == null || (A02 = 1tL.A02(r302, r303, r304)) == null) {
            return;
        }
        this.A0f.add(this.A0f.size(), A02);
    }

    /* JADX WARN: Type inference failed for: r304v2, types: [X.1tv, java.lang.Object] */
    public final void A0E(final 1tT r302) {
        C3mB c3mB = new C3mB(r302) { // from class: X.66r
            public final 1tT A00;
            public final C66s A01;

            {
                this.A00 = r302;
                this.A01 = new C66s(r302.A04.A0C(), 0);
            }

            @Override // X.C3mB
            public C3s9 ALE(3lE r3022) {
                1tT r0 = this.A00;
                1Iw r02 = r0.A04;
                1LI r03 = r0.A03;
                if (r03 instanceof C1rj) {
                    C1rj c1rj = (C1rj) r03;
                    if (c1rj.A1Y()) {
                        c1rj.A1B(r3022);
                        C3s9 A13 = c1rj.A13(r02);
                        if (A13 != null) {
                            5XD.A01(A13, r02.A0C());
                        }
                        return A13;
                    }
                }
                throw AnonymousClass001.A0L("Trying to apply previous render data to component that doesn't support it");
            }

            @Override // X.C3mB
            public C66s Aps() {
                return this.A01;
            }

            @Override // X.C3mB
            public boolean BDj() {
                return false;
            }

            @Override // X.C3mB
            public 3lE Cba() {
                1tT r0 = this.A00;
                1Iw r02 = r0.A04;
                1LI r03 = r0.A03;
                if (r03 instanceof C1rj) {
                    C1rj c1rj = (C1rj) r03;
                    if (c1rj.A1Y()) {
                        3lE A0w2 = c1rj.A0w(null, r02);
                        if (A0w2 != null) {
                            return A0w2;
                        }
                        throw 1BK.A0e();
                    }
                }
                throw AnonymousClass001.A0L("Trying to record previous render data to component that doesn't support it");
            }
        };
        C1tv c1tv = this.A0R;
        C1tv c1tv2 = c1tv;
        if (c1tv == null) {
            ?? obj = new Object();
            this.A0R = obj;
            c1tv2 = obj;
        }
        c1tv2.A00(null, c3mB);
    }

    public final void A0F(1tT r302) {
        C2lm c2lm;
        List list = this.A0s;
        list.add(r302);
        if (list.size() == 1) {
            C29l c29l = this.A0S;
            boolean z = true;
            if (((c29l == null || (c2lm = c29l.A01.A02) == null) ? null : ((25G) c2lm).A04) != 0S2.A01 && A04().A0m() != 0S2.A0C) {
                z = false;
            }
            this.A0p = z;
        }
    }

    /* JADX WARN: Type inference failed for: r303v2, types: [X.1tv, java.lang.Object] */
    public final void A0G(C3s9 c3s9) {
        C1tv c1tv = this.A0R;
        C1tv c1tv2 = c1tv;
        if (c1tv == null) {
            ?? obj = new Object();
            this.A0R = obj;
            c1tv2 = obj;
        }
        List list = c1tv2.A02;
        if (list == null) {
            list = new ArrayList();
            c1tv2.A02 = list;
        }
        5XD.A02(c3s9, list);
    }

    public final void A0H(java.util.Map map) {
        C29l c29l;
        if (map == null || map.isEmpty()) {
            return;
        }
        this.A06 |= 17179869184L;
        if (!1tY.A02(this) && (c29l = this.A0S) != null) {
            Iterator A1A = 1BK.A1A(map);
            while (A1A.hasNext()) {
                c29l.A01.A02.A0E((29L) A1A.next());
            }
        }
        java.util.Map map2 = this.A0g;
        if (map2 == null) {
            map2 = 1BK.A1C();
            this.A0g = map2;
        }
        map2.putAll(map);
    }

    public final boolean A0I() {
        String A0a;
        if (this.A0r) {
            return this.A0i;
        }
        List list = this.A0s;
        if (list.isEmpty()) {
            A0a = "<null>";
        } else {
            A0a = ((1tT) 1BK.A0r(list)).A03.A0a();
            11T.A0A(A0a);
        }
        throw 0Pz.A07("LithoNode:(", A0a, ") has not been resolved.");
    }

    @Override // X.C1st
    public /* synthetic */ 25P ADG(C23d c23d, int i, int i2) {
        throw AnonymousClass001.A0q("This API must be implemented to be invoked.");
    }
}
