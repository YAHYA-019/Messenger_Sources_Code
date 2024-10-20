package X;

import android.view.View;

/* loaded from: Dx2.class */
public final class Dx2 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dx2() {
        super("NTRatioLayoutComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        GL7 A02 = GL7.A02(gl7);
        if (A02 == null) {
            return null;
        }
        1LI A01 = FJ9.A01(r302, A02, fyG);
        if (View.MeasureSpec.getMode(i) != 0) {
            float f = -0.0f;
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), (-1) << (-1));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            float f2 = -0.0f;
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), (-1) << (-1));
        }
        C1rs A0p = 7zM.A0p(A01, r302);
        float Amm = gl7.Amm(55, 1.0f);
        ?? obj = new Object();
        C2ra.A02(obj, 1.0f / Amm, i, i2);
        C1rq A0L = AbJ.A0L(r302);
        int i3 = obj.A01;
        A0p.A1U(i3);
        A0p.A1Q(i3);
        int i4 = obj.A00;
        A0p.A1S(i4);
        A0p.A1O(i4);
        A0L.A2e(A0p);
        return A0L.A00;
    }
}
