package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: D7t.class */
public final class D7t implements Runnable {
    public static final String __redex_internal_original_name = "MessengerMsysSecureMessage$2";
    public final /* synthetic */ Blr A00;
    public final /* synthetic */ Cbd A01;

    public D7t(Blr blr, Cbd cbd) {
        this.A01 = cbd;
        this.A00 = blr;
    }

    @Override // java.lang.Runnable
    public void run() {
        Cbd cbd = this.A01;
        ((5Xc) cbd.A0K.get()).AQX();
        Blr blr = this.A00;
        MailboxFeature mailboxFeature = (MailboxFeature) cbd.A09.get();
        Long A0l = 4YU.A0l(blr.A00);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new N6v(9, mailboxFeature, A0P, A0l), A0P, false);
        A0P.addResultCallback(new Iby(blr, 28));
    }
}
