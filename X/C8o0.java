package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.8o0, reason: invalid class name */
/* loaded from: 8o0.class */
public final class C8o0 extends C1rj {
    public static final int[] A07 = {-16777216};
    public float A00;
    public int A01;
    public int A02;
    public 1LI A03;
    public String A04;
    public boolean A05;
    public int[] A06;

    public C8o0() {
        super("DeterminateProgressBar");
        this.A06 = A07;
        this.A01 = -1;
        this.A04 = "progress";
        this.A02 = -7829368;
    }

    public static 8T3 A00(1Iw r301) {
        return new 8T3(new C8o0(), r301);
    }

    public final Object[] A0k() {
        return new Object[]{this.A06, Integer.valueOf(this.A01), this.A04, Integer.valueOf(this.A02), Float.valueOf(this.A00), Boolean.valueOf(this.A05), this.A03, null};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8o0 c8o0 = (C8o0) super.A0l();
        c8o0.A03 = 4YV.A0J(c8o0.A03);
        return c8o0;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        float f = this.A00;
        boolean z = this.A05;
        int i = this.A02;
        int i2 = this.A01;
        int[] iArr = this.A06;
        String str = this.A04;
        2AW r309 = this.A03;
        11T.A0F(r302, 0);
        1BL.A1G(iArr, str);
        float f2 = 0.0f / 0.0f;
        if (i2 == -1) {
            i2 = EVV.A00(7zL.A0A(r302), 10.0f);
        }
        float max = Math.max(0.0f, Math.min(f, 1.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        if (iArr.length == 1) {
            gradientDrawable.setColor(iArr[0]);
        }
        if (z) {
            gradientDrawable.setCornerRadius(i2 / 2.0f);
        }
        int[] iArr2 = {i};
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, iArr2);
        gradientDrawable2.setColor(iArr2[0]);
        if (z) {
            gradientDrawable2.setCornerRadius(i2 / 2.0f);
        }
        C1rq A00 = C1rg.A00(r302);
        A00.A1L(i2);
        C2cq A0u = 7zM.A0u(gradientDrawable, r302, 0);
        A0u.A0j(max);
        A0u.A2L(str);
        A0u.A0d();
        A00.A2e(A0u);
        if (r309 == null) {
            r309 = 7zL.A0Y();
        }
        A00.A2f(r309);
        A00.A0D(gradientDrawable2);
        A00.A2S(r302.A0D.getString(2131952162, AnonymousClass001.A1a(Math.round(max * 100.0f))));
        return A00.A00;
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        String str = this.A04;
        11T.A0F(str, 1);
        5X3 A02 = C3s9.A02(str);
        A02.A03(C2jm.A07);
        return A02;
    }
}
