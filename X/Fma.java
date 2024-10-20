package X;

import android.content.DialogInterface;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.p2m.attachreceipt.AttachReceiptIntentHandlerActivity;

/* loaded from: Fma.class */
public final class Fma implements GK5 {
    public final /* synthetic */ AttachReceiptIntentHandlerActivity A00;

    public Fma(AttachReceiptIntentHandlerActivity attachReceiptIntentHandlerActivity) {
        this.A00 = attachReceiptIntentHandlerActivity;
    }

    @Override // X.GK5
    public void CF1() {
        ((FG0) 1Br.A0B(this.A00.A08)).A03(EN1.A01, "qr_code_read_failure");
    }

    @Override // X.GK5
    public void CF2() {
        ((FG0) 1Br.A0B(this.A00.A08)).A03(EN1.A01, "qr_code_read_success");
    }

    @Override // X.GK5
    public void CSt() {
        AttachReceiptIntentHandlerActivity attachReceiptIntentHandlerActivity = this.A00;
        ((FG0) 1Br.A0B(attachReceiptIntentHandlerActivity.A08)).A03(EN1.A01, "image_upload_failed");
        DMV dmv = attachReceiptIntentHandlerActivity.A01;
        if (dmv != null) {
            dmv.hide();
        }
        if (attachReceiptIntentHandlerActivity.A02 == null) {
            throw 1BK.A0h();
        }
        MigColorScheme migColorScheme = attachReceiptIntentHandlerActivity.A03;
        if (migColorScheme == null) {
            migColorScheme = 7zR.A0c(attachReceiptIntentHandlerActivity);
        }
        attachReceiptIntentHandlerActivity.A03 = migColorScheme;
        DR6 A01 = C5ic.A01(attachReceiptIntentHandlerActivity, migColorScheme);
        A01.A00(2131967733);
        A01.A06(2131957337);
        A01.A0D((DialogInterface.OnClickListener) null, 2131962432);
        A01.A0H(new FKB(attachReceiptIntentHandlerActivity, 6));
        A01.A05();
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.Dee, android.app.Dialog] */
    @Override // X.GK5
    public void CSy() {
        AttachReceiptIntentHandlerActivity attachReceiptIntentHandlerActivity = this.A00;
        ((FG0) 1Br.A0B(attachReceiptIntentHandlerActivity.A08)).A03(EN1.A01, "image_try_upload");
        MigColorScheme migColorScheme = attachReceiptIntentHandlerActivity.A03;
        if (migColorScheme == null) {
            migColorScheme = 7zR.A0c(attachReceiptIntentHandlerActivity);
        }
        attachReceiptIntentHandlerActivity.A03 = migColorScheme;
        C2125Dee c2125Dee = new C2125Dee(attachReceiptIntentHandlerActivity, migColorScheme.Aho());
        attachReceiptIntentHandlerActivity.A01 = c2125Dee;
        c2125Dee.A04(attachReceiptIntentHandlerActivity.getString(2131967754));
        C2125Dee c2125Dee2 = attachReceiptIntentHandlerActivity.A01;
        if (c2125Dee2 != null) {
            c2125Dee2.A05(true);
        }
        ?? r0 = attachReceiptIntentHandlerActivity.A01;
        if (r0 != 0) {
            r0.A03 = 0;
            r0.setCancelable(false);
        }
        DMV dmv = attachReceiptIntentHandlerActivity.A01;
        if (dmv != null) {
            dmv.setOnCancelListener(new FJm(attachReceiptIntentHandlerActivity, 2));
        }
        DMV dmv2 = attachReceiptIntentHandlerActivity.A01;
        if (dmv2 != null) {
            dmv2.show();
        }
    }

    @Override // X.GK5
    public void CSz() {
        AttachReceiptIntentHandlerActivity attachReceiptIntentHandlerActivity = this.A00;
        ((FG0) 1Br.A0B(attachReceiptIntentHandlerActivity.A08)).A03(EN1.A01, "image_upload_success");
        DMV dmv = attachReceiptIntentHandlerActivity.A01;
        if (dmv != null) {
            dmv.hide();
        }
        AttachReceiptIntentHandlerActivity.A12(attachReceiptIntentHandlerActivity);
    }
}
