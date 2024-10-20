package X;

import com.facebook.messaging.accountlogin.AccountLoginActivity;

/* loaded from: Czp.class */
public final class Czp implements GI3 {
    public final /* synthetic */ B2Z A00;

    public Czp(B2Z b2z) {
        this.A00 = b2z;
    }

    @Override // X.GI3
    public void Btf() {
        B2Z b2z = this.A00;
        ((AlJ) b2z).A00.A03("rejected_tos_acceptance");
        DE4 de4 = ((AlJ) b2z).A03;
        if (de4 != null) {
            CIw cIw = ((AccountLoginActivity) de4).A04;
            cIw.getClass();
            cIw.A00();
        }
        AbG.A1K(b2z);
    }

    @Override // X.GI3
    public void CQt() {
        this.A00.A1Z();
    }
}
