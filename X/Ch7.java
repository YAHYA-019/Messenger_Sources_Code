package X;

/* loaded from: Ch7.class */
public final class Ch7 implements DEd {
    public final /* synthetic */ AmA A00;

    public Ch7(AmA amA) {
        this.A00 = amA;
    }

    @Override // X.DEd
    public void CJE(Object obj) {
        AmA amA = this.A00;
        C9a c9a = amA.A06;
        if (c9a != null) {
            boolean z = c9a instanceof B8A;
            if (z ? ((B8A) c9a).A00 : ((B8B) c9a).A01) {
                if ((z ? ((B8A) c9a).A02 : ((B8B) c9a).A03) || amA.A05 == null || amA.A00 == null) {
                    return;
                }
                if (z) {
                    ((B8A) c9a).A02 = true;
                } else {
                    ((B8B) c9a).A03 = true;
                }
                AmA.A07(amA);
                1BK.A1E(amA.A0F).execute(new D6X(amA));
            }
        }
    }
}
