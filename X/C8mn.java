package X;

import android.content.res.Resources;

/* renamed from: X.8mn, reason: invalid class name */
/* loaded from: 8mn.class */
public final class C8mn extends C1rj {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public 1LI A09;
    public C1rn A0A;
    public String A0B;
    public boolean A0C;

    public C8mn() {
        super("Card");
        this.A03 = -1;
        this.A04 = (-1) << (-1);
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A05 = -1;
        this.A06 = 50331648;
        this.A02 = -1.0f;
        this.A07 = 922746880;
        this.A08 = -1;
        this.A0C = false;
    }

    public static 8Tk A00(1Iw r301) {
        return new 8Tk(r301, new C8mn());
    }

    public final Object[] A0k() {
        Integer valueOf = Integer.valueOf(this.A03);
        C1rn c1rn = this.A0A;
        String str = this.A0B;
        Integer valueOf2 = Integer.valueOf(this.A04);
        1LI r0 = this.A09;
        Float valueOf3 = Float.valueOf(this.A00);
        Boolean A0d = 1BK.A0d();
        return new Object[]{valueOf, c1rn, str, valueOf2, r0, valueOf3, A0d, A0d, A0d, A0d, Float.valueOf(this.A01), Integer.valueOf(this.A05), Integer.valueOf(this.A06), Float.valueOf(-1.0f), Float.valueOf(this.A02), Integer.valueOf(this.A07), Integer.valueOf(this.A08), Boolean.valueOf(this.A0C)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8mn c8mn = (C8mn) super.A0l();
        c8mn.A09 = 4YV.A0J(c8mn.A09);
        return c8mn;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        double d;
        2dP r337;
        C26z c26z;
        1LI r0 = this.A09;
        String str = this.A0B;
        int i = this.A03;
        C1rn c1rn = this.A0A;
        int i2 = this.A04;
        int i3 = this.A07;
        int i4 = this.A06;
        float f = this.A00;
        float f2 = this.A01;
        int i5 = this.A08;
        int i6 = this.A05;
        float f3 = this.A02;
        boolean z = this.A0C;
        Resources A0E = 4YU.A0E(r302);
        if (f == -1.0f) {
            f = (2.0f * A0E.getDisplayMetrics().density) + 0.5f;
        }
        if (f2 == -1.0f) {
            f2 = (2.0f * A0E.getDisplayMetrics().density) + 0.5f;
        }
        if (i5 == -1) {
            int i7 = (int) (f2 + 0.5f);
            int i8 = i7;
            int i9 = i7 % 2;
            if (i9 == 1) {
                i7--;
            }
            float f4 = i7 * 0.5f;
            if (i9 == 1) {
                i8--;
            }
            i5 = (int) Math.ceil(i8 - f4);
        }
        if (i6 == -1) {
            int i10 = (int) (f2 + 0.5f);
            int i11 = i10;
            int i12 = i10 % 2;
            if (i12 == 1) {
                i10--;
            }
            float f5 = i10 * 0.5f;
            if (i12 == 1) {
                i11--;
            }
            i6 = (int) Math.ceil(i11 + f5);
        }
        int i13 = (int) (0.5f + f2);
        int i14 = i13;
        int i15 = i13 % 2;
        if (i15 == 1) {
            i13--;
        }
        int ceil = (int) Math.ceil(i13 - 0.0f);
        if (f3 == -1.0f) {
            if (i15 == 1) {
                i14--;
            }
            d = i14 + 0.0f;
        } else {
            d = f3;
        }
        int ceil2 = (int) Math.ceil(d);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A2A(C26z.LEFT, ceil);
        A01.A2A(C26z.RIGHT, ceil2);
        A01.A2A(C26z.TOP, i5);
        A01.A2A(C26z.BOTTOM, i6);
        int i16 = (-1) << (-1);
        float f6 = -0.0f;
        if (z) {
            if (i2 == i16) {
                i2 = 0;
            }
            A01.A1H(i2);
            8OE A00 = 8nS.A00(r302);
            8nS r02 = A00.A01;
            r02.A01 = i;
            r02.A03 = c1rn;
            r02.A02 = i2;
            r02.A00 = f;
            r337 = 2dP.A01;
            A00.A0c();
            c26z = C26z.ALL;
            A00.A0b();
            A00.A2L(str);
            A00.A0d();
            A01.A2d(A00);
            A01.A2e(r0);
        } else {
            if (i2 == i16) {
                i2 = -1;
            }
            2cM A012 = 2cK.A01(r302, (String) null, 0);
            A012.A1H(i);
            A012.A0R();
            A012.A0k(0.0f);
            r337 = 2dP.A01;
            A012.A0c();
            c26z = C26z.ALL;
            A012.A0b();
            A012.A2L(str);
            A012.A0d();
            7zL.A1G(A012, A01);
            A01.A2e(r0);
            8O3 A002 = 8nD.A00(r302);
            8nD r03 = A002.A01;
            r03.A01 = i2;
            r03.A00 = f;
            A002.A0c();
            A002.A0b();
            8nD r04 = A002.A01;
            r04.A04 = false;
            r04.A05 = false;
            r04.A02 = false;
            r04.A03 = false;
            A01.A2d(A002);
        }
        8O4 r334 = null;
        if (f2 > 0.0f) {
            r334 = C8n8.A00(r302);
            C8n8 c8n8 = r334.A01;
            c8n8.A06 = i3;
            c8n8.A05 = i4;
            c8n8.A00 = f;
            c8n8.A04 = f2;
            r334.A2H(r337);
            r334.A2E(c26z, 0);
            C8n8 c8n82 = r334.A01;
            c8n82.A02 = -1.0f;
            c8n82.A03 = f3;
        }
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A2d(A01);
        return 7zL.A0U(A013, r334);
    }
}
