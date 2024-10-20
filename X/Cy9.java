package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Cy9.class */
public final class Cy9 implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public Cy9(MailboxFutureImpl mailboxFutureImpl, 22C r303, int i, int i2, long j, boolean z) {
        this.A00 = i2;
        this.A03 = r303;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
        this.A05 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        Czl A00;
        String str;
        String str2;
        int i = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i2 = this.A01;
        if (i != 0) {
            4uZ.A06("MailboxTam", "runTamInternalThreadBannerEnsureDisappearingMessageBanner", i2);
            mailboxFutureImpl = (MailboxFutureImpl) this.A04;
            bool = false;
            A00 = Czl.A00(this, 90);
            str = "MCAMailboxTam";
            str2 = "TamInternalThreadBannerEnsureDisappearingMessageBanner";
        } else {
            4uZ.A06("MailboxTam", "runTamClientThreadSetEnableDeviceBackup", i2);
            mailboxFutureImpl = (MailboxFutureImpl) this.A04;
            bool = false;
            A00 = Czl.A00(this, 76);
            str = "MCAMailboxTam";
            str2 = "TamClientThreadSetEnableDeviceBackup";
        }
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, str, str2, A00);
    }
}
