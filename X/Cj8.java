package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Cj8.class */
public final class Cj8 implements AZE {
    public final /* synthetic */ AcQ A00;
    public final /* synthetic */ AcX A01;

    public Cj8(AcQ acQ, AcX acX) {
        this.A00 = acQ;
        this.A01 = acX;
    }

    @Override // X.AZE
    public void C2x() {
        AbK.A0S(this.A00).A09(this.A01.A0A);
    }

    @Override // X.AZE
    public void CTA() {
        AcP A0S = AbK.A0S(this.A00);
        if (A0S.A0K && A0S.A0I()) {
            CQb A02 = AcP.A02(A0S);
            CQb.A06(BOZ.A0A, A02, A02.A07, (ImmutableList) null);
        }
    }
}
