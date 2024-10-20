package X;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: L5g.class */
public abstract class L5g {
    public static final boolean A00(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        long j2 = Kwy.A00;
        float A00 = DKH.A00(j);
        float A02 = JR1.A02(j);
        return GOp.A1U(((((f5 * f5) / (A00 * A00)) + ((f6 * f6) / (A02 * A02))) > 1.0f ? 1 : ((((f5 * f5) / (A00 * A00)) + ((f6 * f6) / (A02 * A02))) == 1.0f ? 0 : -1)));
    }

    public static final boolean A01(KR7 kr7, float f, float f2) {
        if (kr7 instanceof C2905Jct) {
            L5L l5l = ((C2905Jct) kr7).A00;
            return l5l.A01 <= f && f < l5l.A02 && l5l.A03 <= f2 && f2 < l5l.A00;
        }
        if (!(kr7 instanceof C2906Jcu)) {
            if (kr7 instanceof Jcs) {
                return A02(((Jcs) kr7).A00, f, f2);
            }
            throw 1BK.A1F();
        }
        L4g l4g = ((C2906Jcu) kr7).A00;
        float f3 = l4g.A01;
        if (f < f3) {
            return false;
        }
        float f4 = l4g.A02;
        if (f >= f4) {
            return false;
        }
        float f5 = l4g.A03;
        if (f2 < f5) {
            return false;
        }
        float f6 = l4g.A00;
        if (f2 >= f6) {
            return false;
        }
        long j = l4g.A06;
        long j2 = Kwy.A00;
        float A00 = DKF.A00(j);
        long j3 = l4g.A07;
        float A002 = DKF.A00(j3);
        float f7 = A00 + A002;
        float f8 = f4 - f3;
        if (f7 <= f8) {
            long j4 = l4g.A04;
            float A003 = DKF.A00(j4);
            long j5 = l4g.A05;
            float A004 = DKF.A00(j5);
            if (A003 + A004 <= f8) {
                float A02 = JR1.A02(j);
                float A022 = JR1.A02(j4);
                float f9 = A02 + A022;
                float f10 = f6 - f5;
                if (f9 <= f10) {
                    float A023 = JR1.A02(j3);
                    float A024 = JR1.A02(j5);
                    if (A023 + A024 <= f10) {
                        float f11 = A00 + f3;
                        float f12 = A02 + f5;
                        float f13 = f4 - A002;
                        float f14 = A023 + f5;
                        float f15 = f4 - A004;
                        float f16 = f6 - A024;
                        float f17 = f6 - A022;
                        float f18 = A003 + f3;
                        if (f < f11 && f2 < f12) {
                            return A00(f, f2, f11, f12, j);
                        }
                        if (f < f18 && f2 > f17) {
                            return A00(f, f2, f18, f17, j4);
                        }
                        if (f > f13 && f2 < f14) {
                            return A00(f, f2, f13, f14, j3);
                        }
                        if (f <= f15 || f2 <= f16) {
                            return true;
                        }
                        return A00(f, f2, f15, f16, j5);
                    }
                }
            }
        }
        LOR A005 = LOR.A00();
        A005.A7F(l4g, 0S2.A00);
        return A02(A005, f, f2);
    }

    public static final boolean A02(MLe mLe, float f, float f2) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        Path A0B = DKC.A0B();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            throw AnonymousClass001.A0N("Invalid rectangle, make sure no value is NaN");
        }
        RectF A0D = DKC.A0D();
        A0D.set(f3, f4, f5, f6);
        11T.A0D(A0D);
        A0B.addRect(A0D, Path.Direction.CCW);
        Path A0B2 = DKC.A0B();
        Path.Op op = Path.Op.INTERSECT;
        if (!(mLe instanceof LOR)) {
            throw AnonymousClass001.A0q("Unable to obtain android.graphics.Path");
        }
        A0B2.op(((LOR) mLe).A03, A0B, op);
        boolean isEmpty = A0B2.isEmpty();
        A0B2.reset();
        A0B.reset();
        return !isEmpty;
    }
}
