package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.8rN, reason: invalid class name */
/* loaded from: 8rN.class */
public final class C8rN extends 37K implements ML5 {
    public 4bM A00;
    public KrE A01;
    public AnonymousClass823 A02;
    public C2403Gc5 A03;

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        2Ob r0 = this.A03;
        if (r0 == null || r0.mView == null) {
            return;
        }
        AnonymousClass823 anonymousClass823 = this.A02;
        if (anonymousClass823 != null) {
            anonymousClass823.A0C.recycle();
            anonymousClass823.A0D.setOnTouchListener(null);
            this.A02 = null;
        }
        AnonymousClass823 anonymousClass8232 = new AnonymousClass823(r0.mView, C09s.A01(this, 2131363731), 0S2.A00);
        this.A02 = anonymousClass8232;
        anonymousClass8232.A05 = new Jvt(this);
        anonymousClass8232.A04 = this.A03;
        anonymousClass8232.A0D.setOnTouchListener(new C9q9(anonymousClass8232, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0X() {
        06Z A0W = A0W();
        if (A0W.A0Y(2131364228) == null) {
            C06c A0G = 7zL.A0G(A0W);
            A0G.A0L(new C2403Gc5(), 2131364228);
            A0G.A04();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0Z(Fragment fragment) {
        if (fragment instanceof C2403Gc5) {
            C2403Gc5 c2403Gc5 = (C2403Gc5) fragment;
            this.A03 = c2403Gc5;
            c2403Gc5.A05 = new 9wU(this);
        }
    }

    @Override // X.ML5
    public String AWi() {
        return "message_montage";
    }

    @Override // X.ML5
    public void Bl6() {
        super/*X.32a*/.Bl6();
        AnonymousClass823 anonymousClass823 = this.A02;
        if (anonymousClass823 == null) {
            A00();
            return;
        }
        anonymousClass823.A09 = false;
        anonymousClass823.A0A = true;
        C66i c66i = anonymousClass823.A0F;
        c66i.A06(0.0d);
        c66i.A02();
    }

    @Override // X.ML5
    public void BrG() {
        A00();
    }
}
