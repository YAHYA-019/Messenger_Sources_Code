package X;

/* renamed from: X.GiP, reason: case insensitive filesystem */
/* loaded from: GiP.class */
public final class C2587GiP extends AbstractC04664bm {
    public 2EU A00;
    public boolean A01;
    public final /* synthetic */ C5q5 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2587GiP(5qA r302, C5q5 c5q5, InterfaceC04374as interfaceC04374as, C5q8 c5q8) {
        super(r302);
        this.A02 = c5q5;
        this.A01 = false;
        this.A00 = null;
        c5q8.CmS(this);
        interfaceC04374as.A5P(new C2585GiM(this, c5q5, 3));
    }

    public static void A00(C2587GiP c2587GiP) {
        synchronized (c2587GiP) {
            if (c2587GiP.A01) {
                return;
            }
            2EU r0 = c2587GiP.A00;
            2EU A08 = r0 != null ? r0.A08() : null;
            try {
                ((AbstractC04664bm) c2587GiP).A00.C9C(A08, 0);
                2EU.A04(A08);
            } catch (Throwable th) {
                2EU.A04(A08);
                throw th;
            }
        }
    }

    public static boolean A01(C2587GiP c2587GiP) {
        synchronized (c2587GiP) {
            if (c2587GiP.A01) {
                return false;
            }
            2EU r0 = c2587GiP.A00;
            c2587GiP.A00 = null;
            c2587GiP.A01 = true;
            2EU.A04(r0);
            return true;
        }
    }

    @Override // X.AbstractC04434ay
    public void A03() {
        if (A01(this)) {
            ((AbstractC04664bm) this).A00.Bn2();
        }
    }

    @Override // X.AbstractC04434ay
    public /* bridge */ /* synthetic */ void A05(Object obj, int i) {
        2EU r0 = (2EU) obj;
        if ((i & 1) == 1) {
            synchronized (this) {
                if (!this.A01) {
                    2EU r02 = this.A00;
                    this.A00 = r0 != null ? r0.A08() : null;
                    2EU.A04(r02);
                }
            }
            A00(this);
        }
    }

    @Override // X.AbstractC04434ay
    public void A06(Throwable th) {
        if (A01(this)) {
            ((AbstractC04664bm) this).A00.onFailure(th);
        }
    }
}
