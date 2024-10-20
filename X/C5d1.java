package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.User;

/* renamed from: X.5d1, reason: invalid class name */
/* loaded from: 5d1.class */
public final class C5d1 {
    public 1BY A00;
    public MailboxCallback A01;
    public C21N A02;
    public final C00i A03 = new 1BV((1BY) null, 65708);
    public final C00i A07 = new 1BQ(65755);
    public final C00i A04 = new 1BV((1BY) null, 83277);
    public final 1Mb A05 = (1Mb) 1Bi.A03(66702);
    public final C1qM A06 = new C9zw(this, 1);

    public C5d1(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public void A00() {
        User Auc = ((1Ex) this.A07.get()).Auc();
        if (Auc == null || this.A01 == null) {
            return;
        }
        MailboxFeature mailboxFeature = (MailboxFeature) (((2yD) 1Bi.A03(16385)).AZk(36326360943580667L) ? 1Bn.A0E((Context) null, this.A00, 65708) : this.A03.get());
        long parseLong = Long.parseLong(Auc.A13);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Iao(5, parseLong, mailboxFeature, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(this.A01);
    }

    public void A01(C5d3 c5d3) {
        User Auc = ((1Ex) this.A07.get()).Auc();
        if (Auc != null) {
            MailboxFeature mailboxFeature = (MailboxFeature) (((2yD) 1Bi.A03(16385)).AZk(36326360943580667L) ? 1Bn.A0E((Context) null, this.A00, 65708) : this.A03.get());
            long parseLong = Long.parseLong(Auc.A13);
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
            if (!AQV.Cj2(new Iao(5, parseLong, mailboxFeature, mailboxFutureImpl))) {
                mailboxFutureImpl.cancel(false);
            }
            mailboxFutureImpl.addResultCallback(new Cze(this, c5d3, 3));
        }
    }
}
