package X;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* loaded from: L73.class */
public abstract class L73 {
    public static final Interpolator A02 = new LinearInterpolator();
    public static L7T A01 = L7T.A01(new String[]{"t", K93.__redex_internal_original_name, "e", K94.__redex_internal_original_name, "i", "h", "to", "ti"});
    public static L7T A00 = L7T.A00("x", "y");

    /* JADX WARN: Multi-variable type inference failed */
    public static BaseInterpolator A00(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        PointF pointF3 = L9W.A00;
        pointF.x = JQx.A03(1.0f, f, -1.0f);
        pointF.y = JQx.A03(100.0f, pointF.y, -100.0f);
        float A03 = JQx.A03(1.0f, pointF2.x, -1.0f);
        pointF2.x = A03;
        float A032 = JQx.A03(100.0f, pointF2.y, -100.0f);
        pointF2.y = A032;
        try {
            return new PathInterpolator(pointF.x, pointF.y, A03, A032);
        } catch (IllegalArgumentException unused) {
            return "The Path cannot loop back on itself.".equals(pointF2.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r0v66, types: [android.view.animation.Interpolator] */
    public static LCv A01(L4k l4k, MEl mEl, Li5 li5, float f, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        PointF pointF;
        PointF pointF2;
        float f2;
        BaseInterpolator A002;
        LCv lCv;
        if (!z) {
            return new LCv(mEl.CWf(li5, f));
        }
        if (!z2) {
            li5.A0J();
            PointF pointF3 = null;
            PointF pointF4 = null;
            obj = null;
            obj2 = null;
            pointF = null;
            pointF2 = null;
            boolean z3 = false;
            f2 = 0.0f;
            while (li5.A0Q()) {
                switch (li5.A0D(A01)) {
                    case 0:
                        f2 = JQx.A05(li5);
                        break;
                    case 1:
                        obj2 = mEl.CWf(li5, f);
                        break;
                    case 2:
                        obj = mEl.CWf(li5, f);
                        break;
                    case 3:
                        pointF3 = LBm.A02(li5, 1.0f);
                        break;
                    case 4:
                        pointF4 = LBm.A02(li5, 1.0f);
                        break;
                    case 5:
                        z3 = AnonymousClass001.A1Q(li5.A0C(), 1);
                        break;
                    case 6:
                        pointF = LBm.A02(li5, f);
                        break;
                    case 7:
                        pointF2 = LBm.A02(li5, f);
                        break;
                    default:
                        li5.A0N();
                        break;
                }
            }
            li5.A0L();
            if (!z3) {
                if (pointF3 != null && pointF4 != null) {
                    A002 = A00(pointF3, pointF4);
                    lCv = new LCv(A002, l4k, (Float) null, obj2, obj, f2);
                    lCv.A05 = pointF;
                    lCv.A06 = pointF2;
                    return lCv;
                }
                A002 = A02;
                lCv = new LCv(A002, l4k, (Float) null, obj2, obj, f2);
                lCv.A05 = pointF;
                lCv.A06 = pointF2;
                return lCv;
            }
            A002 = A02;
            obj = obj2;
            lCv = new LCv(A002, l4k, (Float) null, obj2, obj, f2);
            lCv.A05 = pointF;
            lCv.A06 = pointF2;
            return lCv;
        }
        li5.A0J();
        pointF2 = null;
        boolean z4 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        obj2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        f2 = 0.0f;
        pointF = null;
        obj = null;
        while (li5.A0Q()) {
            switch (li5.A0D(A01)) {
                case 0:
                    f2 = JQx.A05(li5);
                    continue;
                case 1:
                    obj2 = mEl.CWf(li5, f);
                    continue;
                case 2:
                    obj = mEl.CWf(li5, f);
                    continue;
                case 3:
                    if (li5.A0E() != 0S2.A0C) {
                        pointF5 = LBm.A02(li5, f);
                        break;
                    } else {
                        li5.A0J();
                        float f3 = 0.0f;
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        while (li5.A0Q()) {
                            int A0D = li5.A0D(A00);
                            if (A0D == 0) {
                                Integer A0E = li5.A0E();
                                Integer num = 0S2.A0u;
                                if (A0E == num) {
                                    f5 = JQx.A05(li5);
                                    f3 = f5;
                                } else {
                                    li5.A0I();
                                    f3 = JQx.A05(li5);
                                    f5 = li5.A0E() == num ? JQx.A05(li5) : f3;
                                    li5.A0K();
                                }
                            } else if (A0D != 1) {
                                li5.A0N();
                            } else {
                                Integer A0E2 = li5.A0E();
                                Integer num2 = 0S2.A0u;
                                if (A0E2 == num2) {
                                    f6 = JQx.A05(li5);
                                    f4 = f6;
                                } else {
                                    li5.A0I();
                                    f4 = JQx.A05(li5);
                                    f6 = li5.A0E() == num2 ? JQx.A05(li5) : f4;
                                    li5.A0K();
                                }
                            }
                        }
                        pointF7 = new PointF(f3, f4);
                        pointF8 = new PointF(f5, f6);
                        break;
                    }
                case 4:
                    if (li5.A0E() != 0S2.A0C) {
                        pointF6 = LBm.A02(li5, f);
                        break;
                    } else {
                        li5.A0J();
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        while (li5.A0Q()) {
                            int A0D2 = li5.A0D(A00);
                            if (A0D2 == 0) {
                                Integer A0E3 = li5.A0E();
                                Integer num3 = 0S2.A0u;
                                if (A0E3 == num3) {
                                    f9 = JQx.A05(li5);
                                    f7 = f9;
                                } else {
                                    li5.A0I();
                                    f7 = JQx.A05(li5);
                                    f9 = li5.A0E() == num3 ? JQx.A05(li5) : f7;
                                    li5.A0K();
                                }
                            } else if (A0D2 != 1) {
                                li5.A0N();
                            } else {
                                Integer A0E4 = li5.A0E();
                                Integer num4 = 0S2.A0u;
                                if (A0E4 == num4) {
                                    f10 = JQx.A05(li5);
                                    f8 = f10;
                                } else {
                                    li5.A0I();
                                    f8 = JQx.A05(li5);
                                    f10 = li5.A0E() == num4 ? JQx.A05(li5) : f8;
                                    li5.A0K();
                                }
                            }
                        }
                        pointF9 = new PointF(f7, f8);
                        pointF10 = new PointF(f9, f10);
                        break;
                    }
                case 5:
                    z4 = AnonymousClass001.A1Q(li5.A0C(), 1);
                    continue;
                case 6:
                    pointF = LBm.A02(li5, f);
                    continue;
                case 7:
                    pointF2 = LBm.A02(li5, f);
                    continue;
                default:
                    li5.A0N();
                    continue;
            }
            li5.A0L();
        }
        li5.A0L();
        if (!z4) {
            if (pointF5 != null && pointF6 != null) {
                A002 = A00(pointF5, pointF6);
                lCv = new LCv(A002, l4k, (Float) null, obj2, obj, f2);
                lCv.A05 = pointF;
                lCv.A06 = pointF2;
                return lCv;
            }
            if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                lCv = new LCv(A00(pointF7, pointF9), A00(pointF8, pointF10), l4k, obj2, obj, f2);
                lCv.A05 = pointF;
                lCv.A06 = pointF2;
                return lCv;
            }
            A002 = A02;
            lCv = new LCv(A002, l4k, (Float) null, obj2, obj, f2);
            lCv.A05 = pointF;
            lCv.A06 = pointF2;
            return lCv;
        }
        A002 = A02;
        obj = obj2;
        lCv = new LCv(A002, l4k, (Float) null, obj2, obj, f2);
        lCv.A05 = pointF;
        lCv.A06 = pointF2;
        return lCv;
    }
}
