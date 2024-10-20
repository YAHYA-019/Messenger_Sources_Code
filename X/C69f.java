package X;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.69f, reason: invalid class name */
/* loaded from: 69f.class */
public final class C69f {
    public 5SA A00;
    public final Resources A01;
    public final Drawable A02;
    public final 5C0 A03;
    public final 5CC A04;
    public final C69h A05;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0078, code lost:
    
        if (r310 == 0) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v107, types: [X.5CC, X.69h, android.graphics.drawable.Drawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C69f(X.C69e r302) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69f.<init>(X.69e):void");
    }

    public static 5CA A00(C69f c69f, final int i) {
        final 5C0 r0 = c69f.A03;
        boolean z = true;
        boolean z2 = false;
        if (i >= 0) {
            z2 = true;
        }
        C0By.A02(Boolean.valueOf(z2));
        5CA[] r02 = ((5C1) r0).A05;
        if (i >= r02.length) {
            z = false;
        }
        C0By.A02(Boolean.valueOf(z));
        if (r02[i] == null) {
            r02[i] = new 5CA() { // from class: X.69k
                public Drawable AiL() {
                    return r0.A01(i);
                }

                public Drawable CoF(Drawable drawable) {
                    return r0.A02(drawable, i);
                }
            };
        }
        5CA r306 = r02[i];
        r306.AiL();
        if (r306.AiL() instanceof 5CE) {
            r306 = (5CC) r306.AiL();
        }
        return r306;
    }

    public static 5CE A01(C69f c69f, int i) {
        5CE A00 = A00(c69f, i);
        if (A00 instanceof 5CE) {
            return A00;
        }
        5CE A02 = C69g.A02(A00.CoF(C69g.A00), InterfaceC07034in.A08);
        A00.CoF(A02);
        C0By.A03(A02, "Parent has no child drawable!");
        return A02;
    }

    public static void A02(Drawable drawable, C69f c69f, int i) {
        if (drawable == null) {
            c69f.A03.A02((Drawable) null, i);
            return;
        }
        A00(c69f, i).CoF(C69g.A01(c69f.A01, drawable, c69f.A00));
    }

    public static void A03(C69f c69f) {
        5C0 r0 = c69f.A03;
        r0.A06(1);
        r0.A06(2);
        r0.A06(3);
        r0.A06(4);
        r0.A06(5);
    }

    public static void A04(C69f c69f) {
        5C0 r0 = c69f.A03;
        r0.A02++;
        r0.A03 = 0;
        Arrays.fill(r0.A0A, true);
        r0.invalidateSelf();
        A03(c69f);
        A06(c69f, 1);
        r0.A04();
        r0.A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A05(C69f c69f, float f) {
        5C0 r0 = c69f.A03;
        Drawable A01 = r0.A01(3);
        if (A01 != 0) {
            boolean z = A01 instanceof Animatable;
            if (f >= 0.999f) {
                if (z) {
                    ((Animatable) A01).stop();
                }
                r0.A06(3);
            } else {
                if (z) {
                    ((Animatable) A01).start();
                }
                A06(c69f, 3);
            }
            A01.setLevel(Math.round(f * 10000.0f));
        }
    }

    public static void A06(C69f c69f, int i) {
        5C0 r0 = c69f.A03;
        r0.A03 = 0;
        r0.A0A[i] = true;
        r0.invalidateSelf();
    }

    public void A07(Drawable drawable, float f, boolean z) {
        Drawable A01 = C69g.A01(this.A01, drawable, this.A00);
        A01.mutate();
        this.A04.A03(A01);
        5C0 r0 = this.A03;
        r0.A02++;
        A03(this);
        A06(this, 2);
        A05(this, f);
        if (z) {
            r0.A04();
        }
        r0.A03();
    }

    public void A08(Drawable drawable, InterfaceC07034in interfaceC07034in) {
        A02(drawable, this, 1);
        A01(this, 1).A05(interfaceC07034in);
    }

    public void A09(InterfaceC07034in interfaceC07034in) {
        interfaceC07034in.getClass();
        A01(this, 2).A05(interfaceC07034in);
    }

    /* JADX WARN: Type inference failed for: r0v94, types: [X.5CY, X.69j, android.graphics.drawable.Drawable] */
    public void A0A(5SA r302) {
        this.A00 = r302;
        C69h c69h = this.A05;
        Drawable drawable = C69g.A00;
        5CC AiL = c69h.AiL();
        if (r302 == null || r302.A04 != 0S2.A00) {
            if (AiL instanceof C69j) {
                5CC r0 = AiL;
                Drawable drawable2 = C69g.A00;
                c69h.CoF(r0.A03(drawable2));
                drawable2.setCallback(null);
            }
        } else if (AiL instanceof C69j) {
            ?? r02 = (C69j) AiL;
            C69g.A04(r02, r302);
            r02.A00 = r302.A03;
            r02.invalidateSelf();
        } else {
            c69h.CoF(C69g.A03(c69h.CoF(C69g.A00), r302));
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= ((5C1) this.A03).A04.length) {
                return;
            }
            5CA A00 = A00(this, i2);
            5SA r03 = this.A00;
            Resources resources = this.A01;
            while (true) {
                5CA AiL2 = A00.AiL();
                if (AiL2 == A00 || !(AiL2 instanceof 5CA)) {
                    break;
                } else {
                    A00 = AiL2;
                }
            }
            5CY AiL3 = A00.AiL();
            if (r03 == null || r03.A04 != 0S2.A01) {
                if (AiL3 instanceof 5CY) {
                    5CY r04 = AiL3;
                    r04.Cmv(false);
                    r04.Cte(0.0f);
                    r04.CmI(0, 0.0f);
                    r04.CsE(0.0f);
                    r04.CuE(false);
                    r04.Ctx(false);
                }
            } else if (AiL3 instanceof 5CY) {
                C69g.A04(AiL3, r03);
            } else if (AiL3 != null) {
                A00.CoF(C69g.A00);
                A00.CoF(C69g.A00(resources, AiL3, r03));
            }
            i = i2 + 1;
        }
    }
}
