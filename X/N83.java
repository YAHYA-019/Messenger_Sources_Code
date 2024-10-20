package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;
import com.facebook.tam.mca.MailboxTamJNI;

/* loaded from: N83.class */
public final class N83 implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public N83(int i, int i2, long j, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A03 = obj;
        this.A05 = obj2;
        this.A01 = i;
        this.A02 = j;
        this.A04 = obj3;
    }

    public N83(MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, 22C r304, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = r304;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        if (4 - i2 != 0) {
            this.A02 = j;
            this.A05 = privacyContext;
        } else {
            this.A05 = privacyContext;
            this.A02 = j;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        Object n24;
        N85 A00;
        String str;
        String str2;
        int i;
        NotificationScope A002;
        long j;
        Object obj2;
        int i2;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                n24 = new N24(null, null);
                A00 = N85.A00(this, 38);
                str = "MCAMailboxCore";
                str2 = "VerifyThreadView";
                i = 1;
                C1qL c1qL = 1xC.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, n24, 0, i, str, str2, A00);
                return;
            case 1:
                String A1D = 7zM.A1D(AbF.A0r(4YT.A00(1039), this.A01), 45);
                A002 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 8);
                7zL.A1O(A002, this.A04, A1D);
                j = this.A02;
                obj2 = this.A05;
                i2 = 30;
                MailboxSDKJNI.dispatchVJOOO(i2, j, mailbox, obj2, A002);
                return;
            case 2:
                String A1D2 = 7zM.A1D(AbF.A0r(4YT.A00(1390), this.A01), 45);
                A002 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D2, 12);
                7zL.A1O(A002, this.A04, A1D2);
                j = this.A02;
                obj2 = this.A05;
                i2 = 35;
                MailboxSDKJNI.dispatchVJOOO(i2, j, mailbox, obj2, A002);
                return;
            case 3:
                4uZ.A06("MailboxTam", 4YT.A00(1450), this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                n24 = false;
                A00 = N85.A00(this, ActionId.HEADER_DATA_LOADED);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadUpdateEphemeralMediaStatus";
                i = 1;
                C1qL c1qL2 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, n24, 0, i, str, str2, A00);
                return;
            case 4:
                4uZ.A06("MailboxTam", "runTamThreadBannerEnsureRestrictBottomBannerForCanonicalThread", this.A01);
                MailboxFutureImpl mailboxFutureImpl2 = (MailboxFutureImpl) this.A04;
                PrivacyContext privacyContext = (PrivacyContext) this.A05;
                N85 A003 = N85.A00(this, 128);
                C1qL c1qL3 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, false, 0, 1, null, privacyContext, "MCAMailboxTam", "TamThreadBannerEnsureRestrictBottomBannerForCanonicalThread", A003);
                return;
            default:
                4uZ.A06("MailboxTam", 4YT.A00(1215), this.A01);
                String A1D3 = 7zM.A1D(22C.A00, 20);
                NotificationScope CcE = mailbox.getSessionedNotificationCenterCallbackManager().CcE(new N88(this, 2), A1D3, 1);
                7zL.A1O(CcE, this.A04, A1D3);
                MailboxTamJNI.dispatchVJOOO(1, this.A02, mailbox, this.A05, CcE);
                return;
        }
    }
}
