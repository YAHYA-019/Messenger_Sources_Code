package X;

import android.content.Context;
import com.facebook.payments.p2m.attachreceipt.AttachReceiptActivity;

/* loaded from: Fmb.class */
public final class Fmb implements GK5 {
    public final /* synthetic */ DZM A00;

    public Fmb(DZM dzm) {
        this.A00 = dzm;
    }

    @Override // X.GK5
    public void CF1() {
        ((FG0) 1Br.A0B(this.A00.A0A)).A03(EN1.A02, "qr_code_read_failure");
    }

    @Override // X.GK5
    public void CF2() {
        ((FG0) 1Br.A0B(this.A00.A0A)).A03(EN1.A02, "qr_code_read_success");
    }

    @Override // X.GK5
    public void CSt() {
        DZM dzm = this.A00;
        ((FG0) 1Br.A0B(dzm.A0A)).A03(EN1.A02, "image_upload_failed");
        DMV dmv = dzm.A03;
        if (dmv != null) {
            dmv.hide();
        }
        if (dzm.A02 != null) {
            dzm.A06 = false;
            DZM.A03(dzm);
        }
    }

    @Override // X.GK5
    public void CSy() {
        DZM dzm = this.A00;
        ((FG0) 1Br.A0B(dzm.A0A)).A03(EN1.A02, "image_try_upload");
        Context requireContext = dzm.requireContext();
        C2125Dee c2125Dee = new C2125Dee(requireContext, 7zR.A0c(requireContext).Aho());
        dzm.A03 = c2125Dee;
        c2125Dee.A04(requireContext.getString(2131967754));
        C2125Dee c2125Dee2 = dzm.A03;
        11T.A0D(c2125Dee2);
        c2125Dee2.A05(true);
        C2125Dee c2125Dee3 = dzm.A03;
        11T.A0D(c2125Dee3);
        c2125Dee3.A03 = 0;
        DMV dmv = dzm.A03;
        11T.A0D(dmv);
        dmv.setCancelable(false);
        DMV dmv2 = dzm.A03;
        11T.A0D(dmv2);
        dmv2.show();
        if (dzm.A02 != null) {
            dzm.A06 = false;
            DZM.A03(dzm);
        }
    }

    @Override // X.GK5
    public void CSz() {
        DZM dzm = this.A00;
        ((FG0) 1Br.A0B(dzm.A0A)).A03(EN1.A02, "image_upload_success");
        DMV dmv = dzm.A03;
        if (dmv != null) {
            dmv.hide();
        }
        GCy gCy = dzm.A04;
        if (gCy != null) {
            AttachReceiptActivity.A12((AttachReceiptActivity) gCy);
        }
    }
}
