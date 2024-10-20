package X;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.acra.util.StatFsUtil;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.List;

/* renamed from: X.23f, reason: invalid class name */
/* loaded from: 23f.class */
public final class C23f {
    public static final C23f A00 = new Object();

    public static final 25R A00(25R r301, C1sr c1sr, AnonymousClass250 anonymousClass250) {
        AnonymousClass257 anonymousClass257 = r301.A02;
        Rect rect = new Rect(anonymousClass257.A0J);
        float f = anonymousClass257.A0I;
        float f2 = anonymousClass257.A0H;
        int i = anonymousClass257.A01;
        int i2 = anonymousClass257.A00;
        long j = anonymousClass257.A02;
        Object obj = anonymousClass257.A0B;
        25F r0 = anonymousClass257.A07;
        25F r02 = anonymousClass257.A09;
        25F r03 = anonymousClass257.A05;
        25F r04 = anonymousClass257.A08;
        25F r05 = anonymousClass257.A06;
        return c1sr.A07(new AnonymousClass257(rect, anonymousClass257.A03, anonymousClass257.A04, r0, r02, r03, r04, r05, anonymousClass257.A0A, anonymousClass250, obj, f, f2, i, i2, j, true, true));
    }

    private final 25R A01(25R r302, C23d c23d, AnonymousClass250 anonymousClass250, boolean z) {
        C1sr A01 = r302.A01();
        25R A002 = A00(r302, A01, anonymousClass250);
        Pair pair = new Pair(c23d, A002);
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) anonymousClass250;
        yogaNodeJNIBase.mData = pair;
        A04(A002, A01, c23d);
        List list = r302.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return A002;
            }
            25R r0 = (25R) list.get(i2);
            List list2 = yogaNodeJNIBase.mChildren;
            if (list2 == null) {
                throw AnonymousClass001.A0N("YogaNode does not have children");
            }
            AnonymousClass250 anonymousClass2502 = (AnonymousClass250) list2.get(i2);
            11T.A0A(anonymousClass2502);
            A002.A03.add(A01(r0, c23d, anonymousClass2502, z));
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x057b, code lost:
    
        if (r324 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.25R A02(X.C1sr r301, X.C23f r302, X.C23d r303, X.AnonymousClass250 r304) {
        /*
            Method dump skipped, instructions count: 1880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23f.A02(X.1sr, X.23f, X.23d, X.250):X.25R");
    }

    public static final void A03(Rect rect, C1tj c1tj) {
        int i = rect.left;
        if (i > 0) {
            c1tj.CWc(C26z.LEFT, i);
        }
        int i2 = rect.top;
        if (i2 > 0) {
            c1tj.CWc(C26z.TOP, i2);
        }
        int i3 = rect.right;
        if (i3 > 0) {
            c1tj.CWc(C26z.RIGHT, i3);
        }
        int i4 = rect.bottom;
        if (i4 > 0) {
            c1tj.CWc(C26z.BOTTOM, i4);
        }
    }

    public static final void A04(25R r301, C1sr c1sr, C23d c23d) {
        C23a c23a = (C23a) c23d.A06.getValue();
        C23g c23g = new C23g(r301, -1, -1);
        java.util.Map map = c23a.A00;
        map.put(c1sr, c23g);
        Long valueOf = Long.valueOf(c1sr.A02);
        11T.A0F(valueOf, 0);
        map.put(valueOf, c23g);
    }

    public static final void A05(25R r301, AnonymousClass250 anonymousClass250) {
        if (anonymousClass250 == null) {
            AnonymousClass257 anonymousClass257 = r301.A02;
            AnonymousClass250 anonymousClass2502 = anonymousClass257.A0K;
            float f = anonymousClass257.A0I;
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) anonymousClass2502;
            long jni_YGNodeStyleGetWidthJNI = YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase.mNativePointer);
            float intBitsToFloat = Float.intBitsToFloat((int) jni_YGNodeStyleGetWidthJNI);
            int i = (int) (jni_YGNodeStyleGetWidthJNI >> 32);
            if (i != 0 && i != 1 && i != 2 && i != 3) {
                throw 0Pz.A04("Unknown enum value: ", i);
            }
            if (Float.compare(f, intBitsToFloat) != 0) {
                YogaNative.jni_YGNodeStyleSetWidthAutoJNI(yogaNodeJNIBase.mNativePointer);
            }
            float f2 = anonymousClass257.A0H;
            long jni_YGNodeStyleGetHeightJNI = YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase.mNativePointer);
            float intBitsToFloat2 = Float.intBitsToFloat((int) jni_YGNodeStyleGetHeightJNI);
            int i2 = (int) (jni_YGNodeStyleGetHeightJNI >> 32);
            if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
                throw 0Pz.A04("Unknown enum value: ", i2);
            }
            if (Float.compare(f2, intBitsToFloat2) != 0) {
                YogaNative.jni_YGNodeStyleSetHeightAutoJNI(yogaNodeJNIBase.mNativePointer);
            }
        }
    }

    public static final void A06(C1sr c1sr, AnonymousClass252 anonymousClass252) {
        IllegalArgumentException th;
        C26z c26z;
        C26z c26z2;
        List<C26z> list;
        2cN r0;
        2cN r02;
        2cN r03;
        2cN r04;
        2cN r05;
        2cN r06;
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) anonymousClass252.A03;
        YogaNative.jni_YGNodeStyleSetDirectionJNI(yogaNodeJNIBase.mNativePointer, AnonymousClass254.A01(c1sr.A02()).mIntValue);
        1tZ r07 = c1sr.A0V;
        if (r07 != null) {
            YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(yogaNodeJNIBase.mNativePointer, r07.mIntValue);
        }
        C1rp c1rp = c1sr.A0W;
        if (c1rp != null) {
            YogaNative.jni_YGNodeStyleSetJustifyContentJNI(yogaNodeJNIBase.mNativePointer, c1rp.mIntValue);
        }
        C1ro c1ro = c1sr.A0T;
        if (c1ro != null) {
            YogaNative.jni_YGNodeStyleSetAlignContentJNI(yogaNodeJNIBase.mNativePointer, c1ro.mIntValue);
        }
        C1ro c1ro2 = c1sr.A0U;
        if (c1ro2 != null) {
            YogaNative.jni_YGNodeStyleSetAlignItemsJNI(yogaNodeJNIBase.mNativePointer, c1ro2.mIntValue);
        }
        EnumC00743oh enumC00743oh = c1sr.A0X;
        if (enumC00743oh != null) {
            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.mNativePointer, enumC00743oh.mIntValue);
        }
        1LN r08 = c1sr.A0L;
        if (r08 != null) {
            yogaNodeJNIBase.mMeasureFunction = r08;
            YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.mNativePointer, true);
        }
        boolean z = false;
        for (1tT r09 : c1sr.A0s) {
            1LI r010 = r09.A03;
            if (c1sr.A0M == null || !1LI.A0K(r010)) {
                C1ti c1ti = r09.A00;
                if (c1ti != null) {
                    Context context = c1sr.A06().A0D;
                    11T.A0A(context);
                    int i = c1ti.A00;
                    int i2 = c1ti.A01;
                    if (i != 0 || i2 != 0) {
                        try {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C53r.A00, i, i2);
                            int indexCount = obtainStyledAttributes.getIndexCount();
                            for (int i3 = 0; i3 < indexCount; i3++) {
                                int index = obtainStyledAttributes.getIndex(i3);
                                float f = 0.0f / 0.0f;
                                if (index == 7) {
                                    int layoutDimension = obtainStyledAttributes.getLayoutDimension(index, -1);
                                    if (layoutDimension >= 0) {
                                        anonymousClass252.A04(layoutDimension);
                                    }
                                } else if (index == 8) {
                                    int layoutDimension2 = obtainStyledAttributes.getLayoutDimension(index, -1);
                                    if (layoutDimension2 >= 0) {
                                        anonymousClass252.A03(layoutDimension2);
                                    }
                                } else if (index == 16) {
                                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                    if (!(anonymousClass252 instanceof 2kA)) {
                                        float f2 = dimensionPixelSize;
                                        anonymousClass252.A00 = f2;
                                        YogaNative.jni_YGNodeStyleSetMinHeightJNI(yogaNodeJNIBase.mNativePointer, f2);
                                    }
                                } else if (index == 15) {
                                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                    if (!(anonymousClass252 instanceof 2kA)) {
                                        float f3 = dimensionPixelSize2;
                                        anonymousClass252.A01 = f3;
                                        YogaNative.jni_YGNodeStyleSetMinWidthJNI(yogaNodeJNIBase.mNativePointer, f3);
                                    }
                                } else {
                                    if (index == 2) {
                                        c26z = C26z.LEFT;
                                    } else if (index == 3) {
                                        c26z = C26z.TOP;
                                    } else if (index == 4) {
                                        c26z = C26z.RIGHT;
                                    } else if (index == 5) {
                                        c26z = C26z.BOTTOM;
                                    } else if (index == 19) {
                                        c26z = C26z.START;
                                    } else if (index == 20) {
                                        c26z = C26z.END;
                                    } else if (index == 1) {
                                        c26z = C26z.ALL;
                                    } else {
                                        if (index == 10) {
                                            c26z2 = C26z.LEFT;
                                        } else if (index == 11) {
                                            c26z2 = C26z.TOP;
                                        } else if (index == 12) {
                                            c26z2 = C26z.RIGHT;
                                        } else if (index == 13) {
                                            c26z2 = C26z.BOTTOM;
                                        } else if (index == 21) {
                                            c26z2 = C26z.START;
                                        } else if (index == 22) {
                                            c26z2 = C26z.END;
                                        } else if (index == 9) {
                                            c26z2 = C26z.ALL;
                                        }
                                        anonymousClass252.A07(c26z2, obtainStyledAttributes.getDimensionPixelOffset(index, 0));
                                    }
                                    anonymousClass252.CWc(c26z, obtainStyledAttributes.getDimensionPixelOffset(index, 0));
                                }
                            }
                            obtainStyledAttributes.recycle();
                        } finally {
                            th = th;
                            if (r0 != null) {
                            }
                        }
                    }
                    Rect rect = c1ti.A03;
                    if (rect != null) {
                        A03(rect, anonymousClass252);
                    }
                    C1tk c1tk = c1ti.A06;
                    if (c1tk != null) {
                        if ((c1tk.A0I & 1) != 0) {
                            anonymousClass252.A04(c1tk.A0J);
                        }
                        if ((c1tk.A0I & 2) != 0) {
                            anonymousClass252.A02(c1tk.A0A);
                        }
                        if ((c1tk.A0I & 4) != 0) {
                            int i4 = c1tk.A0H;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                float f4 = i4;
                                anonymousClass252.A01 = f4;
                                YogaNative.jni_YGNodeStyleSetMinWidthJNI(yogaNodeJNIBase.mNativePointer, f4);
                            }
                        }
                        if ((c1tk.A0I & 8) != 0) {
                            float f5 = c1tk.A09;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                anonymousClass252.A01 = f5;
                                YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(yogaNodeJNIBase.mNativePointer, f5);
                            }
                        }
                        if ((c1tk.A0I & 16) != 0) {
                            int i5 = c1tk.A0F;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                float f6 = i5;
                                anonymousClass252.A01 = f6;
                                YogaNative.jni_YGNodeStyleSetMaxWidthJNI(yogaNodeJNIBase.mNativePointer, f6);
                            }
                        }
                        if ((c1tk.A0I & 32) != 0) {
                            float f7 = c1tk.A07;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                anonymousClass252.A01 = f7;
                                YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(yogaNodeJNIBase.mNativePointer, f7);
                            }
                        }
                        if ((c1tk.A0I & 64) != 0) {
                            anonymousClass252.A03(c1tk.A0D);
                        }
                        if ((c1tk.A0I & 128) != 0) {
                            float f8 = c1tk.A05;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                anonymousClass252.A00 = f8;
                                YogaNative.jni_YGNodeStyleSetHeightPercentJNI(yogaNodeJNIBase.mNativePointer, f8);
                            }
                        }
                        if ((c1tk.A0I & 256) != 0) {
                            int i6 = c1tk.A0G;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                float f9 = i6;
                                anonymousClass252.A00 = f9;
                                YogaNative.jni_YGNodeStyleSetMinHeightJNI(yogaNodeJNIBase.mNativePointer, f9);
                            }
                        }
                        if ((c1tk.A0I & 512) != 0) {
                            float f10 = c1tk.A08;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                anonymousClass252.A00 = f10;
                                YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(yogaNodeJNIBase.mNativePointer, f10);
                            }
                        }
                        if ((c1tk.A0I & 1024) != 0) {
                            int i7 = c1tk.A0E;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                float f11 = i7;
                                anonymousClass252.A00 = f11;
                                YogaNative.jni_YGNodeStyleSetMaxHeightJNI(yogaNodeJNIBase.mNativePointer, f11);
                            }
                        }
                        if ((c1tk.A0I & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                            float f12 = c1tk.A06;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                anonymousClass252.A00 = f12;
                                YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(yogaNodeJNIBase.mNativePointer, f12);
                            }
                        }
                        if ((c1tk.A0I & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
                            C1tr c1tr = c1tk.A0Q;
                            c1tr.getClass();
                            int i8 = c1tr.A00;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                YogaNative.jni_YGNodeStyleSetDirectionJNI(yogaNodeJNIBase.mNativePointer, AnonymousClass254.A01(i8).mIntValue);
                            }
                        }
                        if ((c1tk.A0I & 8192) != 0) {
                            C1ro c1ro3 = c1tk.A0R;
                            c1ro3.getClass();
                            anonymousClass252.A05(c1ro3);
                        }
                        if ((c1tk.A0I & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
                            float f13 = c1tk.A01;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                YogaNative.jni_YGNodeStyleSetFlexJNI(yogaNodeJNIBase.mNativePointer, f13);
                            }
                        }
                        if ((c1tk.A0I & Constants.LOAD_RESULT_PGO) != 0) {
                            anonymousClass252.A00(c1tk.A03);
                        }
                        if ((c1tk.A0I & 65536) != 0) {
                            anonymousClass252.A01(c1tk.A04);
                        }
                        if ((c1tk.A0I & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
                            int i9 = c1tk.A0B;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                YogaNative.jni_YGNodeStyleSetFlexBasisJNI(yogaNodeJNIBase.mNativePointer, i9);
                            }
                        }
                        if ((c1tk.A0I & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                            float f14 = c1tk.A02;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(yogaNodeJNIBase.mNativePointer, f14);
                            }
                        }
                        if ((c1tk.A0I & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
                            float f15 = c1tk.A00;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                YogaNative.jni_YGNodeStyleSetAspectRatioJNI(yogaNodeJNIBase.mNativePointer, f15);
                            }
                        }
                        if ((c1tk.A0I & 1048576) != 0) {
                            2dP r011 = c1tk.A0T;
                            r011.getClass();
                            anonymousClass252.A09(r011);
                        }
                        if ((c1tk.A0I & 2097152) != 0 && (r06 = c1tk.A0P) != null) {
                            int i10 = 2cN.A03;
                            for (int i11 = 0; i11 < i10; i11++) {
                                float A002 = r06.A00(i11);
                                if (!26R.A00(A002)) {
                                    C26z A003 = C26z.A00(i11);
                                    11T.A0A(A003);
                                    anonymousClass252.A08(A003, (int) A002);
                                }
                            }
                        }
                        if ((c1tk.A0I & 4194304) != 0 && (r05 = c1tk.A0O) != null) {
                            int i12 = 2cN.A03;
                            for (int i13 = 0; i13 < i12; i13++) {
                                float A004 = r05.A00(i13);
                                if (!26R.A00(A004)) {
                                    C26z A005 = C26z.A00(i13);
                                    11T.A0A(A005);
                                    if (!(anonymousClass252 instanceof 2kA)) {
                                        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(yogaNodeJNIBase.mNativePointer, A005.mIntValue, A004);
                                    }
                                }
                            }
                        }
                        if ((c1tk.A0I & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 && (r04 = c1tk.A0N) != null) {
                            int i14 = 2cN.A03;
                            for (int i15 = 0; i15 < i14; i15++) {
                                float A006 = r04.A00(i15);
                                if (!26R.A00(A006)) {
                                    C26z A007 = C26z.A00(i15);
                                    11T.A0A(A007);
                                    anonymousClass252.CWc(A007, (int) A006);
                                }
                            }
                        }
                        if ((c1tk.A0I & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0 && (r03 = c1tk.A0M) != null) {
                            int i16 = 2cN.A03;
                            for (int i17 = 0; i17 < i16; i17++) {
                                float A008 = r03.A00(i17);
                                if (!26R.A00(A008)) {
                                    C26z A009 = C26z.A00(i17);
                                    11T.A0A(A009);
                                    anonymousClass252.A06(A009, A008);
                                }
                            }
                        }
                        if ((c1tk.A0I & 33554432) != 0 && (r02 = c1tk.A0L) != null) {
                            int i18 = 2cN.A03;
                            for (int i19 = 0; i19 < i18; i19++) {
                                float A0010 = r02.A00(i19);
                                if (!26R.A00(A0010)) {
                                    C26z A0011 = C26z.A00(i19);
                                    11T.A0A(A0011);
                                    anonymousClass252.A07(A0011, (int) A0010);
                                }
                            }
                        }
                        if ((c1tk.A0I & 67108864) != 0 && (r0 = c1tk.A0K) != null) {
                            int i20 = 2cN.A03;
                            for (int i21 = 0; i21 < i20; i21++) {
                                float A0012 = r0.A00(i21);
                                if (!26R.A00(A0012)) {
                                    C26z A0013 = C26z.A00(i21);
                                    11T.A0A(A0013);
                                    if (!(anonymousClass252 instanceof 2kA)) {
                                        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(yogaNodeJNIBase.mNativePointer, A0013.mIntValue, A0012);
                                    }
                                }
                            }
                        }
                        if ((c1tk.A0I & 134217728) != 0 && (list = c1tk.A0U) != null) {
                            for (C26z c26z3 : list) {
                                if (!(anonymousClass252 instanceof 2kA)) {
                                    11T.A0F(c26z3, 0);
                                    YogaNative.jni_YGNodeStyleSetMarginAutoJNI(yogaNodeJNIBase.mNativePointer, c26z3.mIntValue);
                                }
                            }
                        }
                        if ((c1tk.A0I & 268435456) != 0) {
                            boolean z2 = c1tk.A0V;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                YogaNative.jni_YGNodeSetIsReferenceBaselineJNI(yogaNodeJNIBase.mNativePointer, z2);
                            }
                        }
                        if (c1tk.A0W && !(anonymousClass252 instanceof 2kA)) {
                            yogaNodeJNIBase.mBaselineFunction = new Object() { // from class: X.3PM
                            };
                            YogaNative.jni_YGNodeSetHasBaselineFuncJNI(yogaNodeJNIBase.mNativePointer, true);
                        }
                        3Dx r012 = c1tk.A0S;
                        if (r012 != null) {
                            int i22 = c1tk.A0C;
                            if (!(anonymousClass252 instanceof 2kA)) {
                                YogaNative.jni_YGNodeStyleSetGapJNI(yogaNodeJNIBase.mNativePointer, r012.mIntValue, i22);
                            }
                        }
                    }
                } else {
                    continue;
                }
            } else if (!z) {
                C1tw c1tw = c1sr.A0M;
                if (c1tw != null) {
                    29K r013 = c1tw.A0N;
                    if (r013 != null) {
                        if (c1sr.A0o || c1sr.A0N != null) {
                            r013.A01(C1sr.A00(c1sr));
                        } else {
                            c1sr.A0N = r013;
                        }
                    }
                    long j = c1sr.A06;
                    if ((j & 128) == 0 || c1sr.A03 == 0) {
                        int i23 = ((C1sr) c1tw).A03;
                        j |= 128;
                        c1sr.A06 = j;
                        c1sr.A03 = i23;
                    }
                    c1sr.A0k = c1tw.A0k;
                    if ((c1tw.A06 & 8589934592L) != 0) {
                        boolean z3 = c1tw.A0j;
                        j |= 8589934592L;
                        c1sr.A06 = j;
                        c1sr.A0j = z3;
                    }
                    if ((c1tw.A06 & 262144) != 0) {
                        Drawable drawable = c1tw.A0B;
                        j |= 262144;
                        c1sr.A06 = j;
                        c1sr.A0B = drawable;
                        c1sr.A0A = c1tw.A0A;
                    }
                    if ((c1tw.A06 & 524288) != 0) {
                        Drawable drawable2 = c1tw.A0C;
                        j |= 524288;
                        c1sr.A06 = j;
                        c1sr.A0C = drawable2;
                    }
                    if (c1tw.A0l) {
                        c1sr.A0l = true;
                    }
                    if ((c1tw.A06 & StatFsUtil.IN_MEGA_BYTE) != 0) {
                        1Im r014 = c1tw.A0K;
                        c1sr.A06 = j | StatFsUtil.IN_MEGA_BYTE;
                        c1sr.A0K = 1tY.A01(c1sr.A0K, r014);
                    }
                    if ((c1tw.A06 & 2097152) != 0) {
                        1Im r015 = c1tw.A0F;
                        c1sr.A06 |= 2097152;
                        c1sr.A0F = 1tY.A01(c1sr.A0F, r015);
                    }
                    if ((c1tw.A06 & 4194304) != 0) {
                        1Im r016 = c1tw.A0G;
                        c1sr.A06 |= 4194304;
                        c1sr.A0G = 1tY.A01(c1sr.A0G, r016);
                    }
                    if ((c1tw.A06 & 8388608) != 0) {
                        1Im r017 = c1tw.A0H;
                        c1sr.A06 |= 8388608;
                        c1sr.A0H = 1tY.A01(c1sr.A0H, r017);
                    }
                    if ((c1tw.A06 & 16777216) != 0) {
                        1Im r018 = c1tw.A0I;
                        c1sr.A06 |= 16777216;
                        c1sr.A0I = 1tY.A01(c1sr.A0I, r018);
                    }
                    if ((c1tw.A06 & 2147483648L) != 0) {
                        1Im r019 = c1tw.A0J;
                        c1sr.A06 |= 2147483648L;
                        c1sr.A0J = 1tY.A01(c1sr.A0J, r019);
                    }
                    String str = c1tw.A0Y;
                    if (str != null) {
                        c1sr.A0Y = str;
                    }
                    int[] iArr = c1tw.A02;
                    if (iArr != null) {
                        c1sr.A0B(c1tw.A09, c1tw.A0t, iArr, c1tw.A0u);
                    }
                    if ((c1tw.A06 & 134217728) != 0) {
                        String str2 = c1tw.A0Z;
                        String str3 = c1tw.A0a;
                        if (str2 != null && str2.length() != 0) {
                            c1sr.A06 |= 134217728;
                            c1sr.A0Z = str2;
                            c1sr.A0a = str3;
                        }
                    }
                    if ((c1tw.A06 & 4294967296L) != 0) {
                        5Rn r020 = c1tw.A0O;
                        c1sr.A06 |= 4294967296L;
                        c1sr.A0O = r020;
                    }
                    float f16 = ((C1sr) c1tw).A00;
                    if (f16 != 0.0f) {
                        c1sr.A00 = f16;
                    }
                    float f17 = ((C1sr) c1tw).A01;
                    if (f17 != 0.0f) {
                        c1sr.A01 = f17;
                    }
                    if ((c1tw.A06 & 536870912) != 0) {
                        StateListAnimator stateListAnimator = c1tw.A07;
                        c1sr.A06 |= 536870912;
                        c1sr.A07 = stateListAnimator;
                        c1sr.A0l = true;
                    }
                    if ((c1tw.A06 & 1073741824) != 0) {
                        int i24 = ((C1sr) c1tw).A05;
                        c1sr.A06 |= 1073741824;
                        c1sr.A05 = i24;
                        c1sr.A0l = true;
                    }
                    int i25 = ((C1sr) c1tw).A04;
                    float f18 = 0.0f / 0.0f;
                    if (i25 != -1) {
                        Paint paint = c1tw.A08;
                        c1sr.A04 = i25;
                        c1sr.A08 = paint;
                    }
                    2cN r021 = c1tw.A01;
                    boolean[] zArr = c1tw.A03;
                    c1sr.A0D = r021;
                    c1sr.A0q = zArr;
                }
                c1sr.A0i = C1sr.A0w.A03(c1sr);
                Rect rect2 = c1sr.A0A;
                if (rect2 != null) {
                    A03(rect2, anonymousClass252);
                }
                z = true;
            }
        }
        if ((c1sr.A06 & 268435456) != 0) {
            int[] iArr2 = c1sr.A0v;
            int i26 = 0;
            loop9: while (true) {
                C26z c26z4 = C26z.LEFT;
                while (true) {
                    C26z c26z5 = c26z4;
                    float f19 = iArr2[i26];
                    if (!(anonymousClass252 instanceof 2kA)) {
                        if (anonymousClass252 instanceof C2qn) {
                            C2qn c2qn = (C2qn) anonymousClass252;
                            int[] iArr3 = c2qn.A01;
                            if (iArr3 == null) {
                                iArr3 = new int[4];
                                c2qn.A01 = iArr3;
                            }
                            C6ni.A04.A02(c26z5, iArr3, (int) f19);
                        } else {
                            YogaNative.jni_YGNodeStyleSetBorderJNI(yogaNodeJNIBase.mNativePointer, c26z5.mIntValue, f19);
                        }
                    }
                    i26++;
                    if (i26 >= 4) {
                        break loop9;
                    }
                    if (i26 < 0) {
                        th = 0Pz.A04("Given index out of range of acceptable edges: ", i26);
                        break loop9;
                    } else if (i26 != 0) {
                        c26z4 = i26 != 1 ? i26 != 2 ? C26z.BOTTOM : C26z.RIGHT : C26z.TOP;
                    }
                }
            }
            throw th;
        }
        2cN r022 = c1sr.A0D;
        if (r022 != null) {
            int i27 = 2cN.A03;
            for (int i28 = 0; i28 < i27; i28++) {
                float A0014 = r022.A00(i28);
                if (!26R.A00(A0014)) {
                    C26z A0015 = C26z.A00(i28);
                    11T.A0A(A0015);
                    boolean[] zArr2 = c1sr.A0q;
                    if (zArr2 == null || Boolean.valueOf(zArr2[A0015.mIntValue]) == null) {
                        anonymousClass252.CWc(A0015, (int) A0014);
                    } else {
                        anonymousClass252.A06(A0015, A0014);
                    }
                }
            }
        }
        c1sr.A0n = anonymousClass252.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x02eb, code lost:
    
        if (r0 == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x05e0, code lost:
    
        com.facebook.litho.ComponentsSystrace.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03a6, code lost:
    
        if (r0.A01.BXQ() != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05dd, code lost:
    
        if (r0 == false) goto L238;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0527 A[Catch: Exception -> 0x05fe, TRY_ENTER, TryCatch #0 {Exception -> 0x05fe, blocks: (B:26:0x01c3, B:27:0x01ca, B:28:0x01cf, B:29:0x01d8, B:31:0x01e6, B:33:0x01ef, B:34:0x01f6, B:35:0x01fd, B:39:0x020d, B:41:0x0214, B:42:0x0219, B:44:0x0224, B:47:0x0230, B:50:0x023c, B:53:0x05e6, B:55:0x05f4, B:57:0x05fd, B:62:0x0271, B:64:0x027a, B:65:0x0281, B:82:0x052c, B:85:0x0536, B:88:0x0545, B:90:0x0551, B:91:0x0559, B:93:0x0566, B:95:0x056e, B:97:0x0575, B:99:0x0582, B:101:0x058a, B:103:0x0591, B:105:0x059e, B:106:0x05a6, B:108:0x05b3, B:110:0x05bb, B:112:0x05c2, B:114:0x05ca, B:115:0x05cf, B:116:0x0527, B:124:0x05e0, B:126:0x0248, B:127:0x0251, B:128:0x0258, B:129:0x02f1, B:131:0x02ff, B:132:0x0309, B:133:0x030e, B:134:0x0317, B:135:0x031e, B:136:0x0325, B:137:0x032c, B:140:0x033b, B:143:0x0347, B:144:0x034e, B:147:0x035c, B:153:0x037a, B:156:0x038d, B:157:0x0394, B:158:0x039b, B:161:0x03a9, B:162:0x03b0, B:163:0x03b7, B:164:0x03be, B:166:0x03c7, B:168:0x03ce, B:169:0x03d5, B:170:0x03da, B:170:0x03da, B:173:0x03e5, B:177:0x03f7, B:179:0x0403, B:180:0x040a, B:209:0x0521), top: B:23:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029a A[Catch: all -> 0x02e7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02e7, blocks: (B:69:0x028e, B:72:0x029a, B:73:0x02a1, B:74:0x02a8, B:75:0x02af, B:76:0x02b6, B:78:0x02c1, B:118:0x02d2, B:120:0x02db), top: B:68:0x028e }] */
    /* JADX WARN: Type inference failed for: r0v101, types: [X.2lx] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.23P, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C2ji A07(X.25R r302, X.C23d r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23f.A07(X.25R, X.23d, int, int):X.2ji");
    }
}
