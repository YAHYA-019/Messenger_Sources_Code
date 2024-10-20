package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.auth.AuthenticationActivity;

/* loaded from: Fkz.class */
public final class Fkz implements GJp {
    public final int A00;
    public final Object A01;

    public Fkz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GJp
    public void C9a() {
        switch (this.A00) {
            case 0:
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) this.A01;
                FI2 fi2 = authenticationActivity.A0B;
                if (authenticationActivity.A06.A04 == null) {
                    0fH.A0k("AuthenticationActivity", "PaymentItemType should not be null!!");
                }
                if (fi2.A04()) {
                    AuthenticationActivity.A16(authenticationActivity, "PIN");
                    return;
                } else {
                    AuthenticationActivity.A1F(authenticationActivity, authenticationActivity.getResources().getString(2131963073), 5002);
                    return;
                }
            case 1:
                FIe fIe = (FIe) this.A01;
                FIe.A04(fIe, fIe.A01.A00.getString(2131963073), 5002);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.GJp
    public void C9b(String str) {
        GL5 gl5;
        switch (this.A00) {
            case 0:
                AuthenticationActivity.A15((AuthenticationActivity) this.A01, str);
                return;
            case 1:
                FIe.A02((FIe) this.A01, str);
                return;
            case 2:
                E55 e55 = (E55) this.A01;
                E5D e5d = (E5D) e55.A01;
                e5d.A0B.A00((FbUserSession) e55.A02, true);
                gl5 = (GL5) e55.A03;
                gl5.CsG(e5d.A03().size() - 1);
                gl5.AGY(-1, str);
                return;
            default:
                gl5 = (GL5) ((E54) this.A01).A02;
                gl5.AGY(-1, str);
                return;
        }
    }

    @Override // X.GJp
    public void CZX() {
        switch (this.A00) {
            case 0:
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) this.A01;
                FI2 fi2 = authenticationActivity.A0B;
                if (authenticationActivity.A06.A04 == null) {
                    0fH.A0k("AuthenticationActivity", "PaymentItemType should not be null!!");
                }
                if (fi2.A04()) {
                    AuthenticationActivity.A16(authenticationActivity, "PIN");
                    return;
                } else {
                    AuthenticationActivity.A1D(authenticationActivity, "VERIFY_BIO_TO_PAY");
                    return;
                }
            case 1:
                FIe.A03((FIe) this.A01, "VERIFY_BIO_TO_PAY");
                return;
            default:
                return;
        }
    }

    @Override // X.GJp
    public void onCancel() {
        switch (this.A00) {
            case 0:
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) this.A01;
                authenticationActivity.A0G.A00();
                AuthenticationActivity.A12(authenticationActivity);
                return;
            case 1:
                FIe fIe = (FIe) this.A01;
                FIe.A01(fIe);
                fIe.A01.A01.A00();
                return;
            case 2:
                E55 e55 = (E55) this.A01;
                ((GL5) e55.A03).AGC(-1, ((E5D) e55.A01).A03);
                return;
            default:
                return;
        }
    }
}
