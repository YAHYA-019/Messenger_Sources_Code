package X;

import androidx.fragment.app.Fragment;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: D8i.class */
public final class D8i implements Runnable {
    public static final String __redex_internal_original_name = "GroupInviteFragment$joinGroupMessageRequestCallback$1$1";
    public final /* synthetic */ AbstractC1533Akm A00;
    public final /* synthetic */ MailboxNullable A01;

    public D8i(AbstractC1533Akm abstractC1533Akm, MailboxNullable mailboxNullable) {
        this.A01 = mailboxNullable;
        this.A00 = abstractC1533Akm;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Akm, androidx.fragment.app.Fragment] */
    @Override // java.lang.Runnable
    public final void run() {
        Number number;
        MailboxNullable mailboxNullable = this.A01;
        if (mailboxNullable != null && (number = (Number) mailboxNullable.value) != null && number.intValue() > 0) {
            BBn bBn = this.A00;
            bBn.A0C = true;
            BBn bBn2 = bBn;
            ((6HS) 1Br.A0B(bBn2.A00)).A07(bBn2.A1Y().A0n, "message_requests");
            return;
        }
        ?? r0 = this.A00;
        CfG cfG = r0.A02;
        if (cfG != null) {
            cfG.D2v();
        }
        6HM r02 = (6HM) 7zO.A0m((Fragment) r0, 50020);
        r02.A02(r02.A04(ServiceException.A00(AbF.A1D("Failed to join group invite."))));
    }
}
