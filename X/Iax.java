package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Iax.class */
public final class Iax implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    public Iax(int i, int i2, long j, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A04 = obj;
        this.A02 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        MailboxNullable A0T;
        Ic0 A00;
        String str;
        String str2;
        MailboxFutureImpl mailboxFutureImpl2;
        Boolean bool;
        MailboxFeature.DbConnectionResolutionCallback A002;
        String str3;
        String str4;
        int i = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i2 = this.A01;
        switch (i) {
            case 0:
                4uZ.A06("MailboxSDK", 4YT.A00(329), i2);
                String A1D = 7zM.A1D(5P8.A00, 7);
                NotificationScope A003 = Ic4.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 18);
                7zL.A1O(A003, this.A04, A1D);
                MailboxSDKJNI.dispatchVJOO(74, this.A02, mailbox, A003);
                return;
            case 1:
                4uZ.A06("MailboxTam", 4YT.A00(1216), i2);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.FAIL_FILE_TOO_LARGE);
                str = "MCAMailboxTam";
                str2 = "TamClientAttachmentRangeGetRangeInfo";
                break;
            case 2:
                4uZ.A06("MailboxTam", 4YT.A00(1217), i2);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.ON_ATTACH_FRAGMENT);
                str = "MCAMailboxTam";
                str2 = AbE.A00(348);
                break;
            case 3:
                4uZ.A06("MailboxTam", 4YT.A00(1442), i2);
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A04;
                bool = false;
                A002 = Ic0.A00(this, ActionId.VIEW_DID_APPEAR_BEGIN);
                str3 = "MCAMailboxTam";
                str4 = "TamClientMessageRangeForAttachmentLoadMoreBefore";
                C1qL c1qL = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, bool, 0, 1, str3, str4, A002);
                return;
            case 4:
                4uZ.A06("MailboxTam", 4YT.A00(1446), i2);
                MailboxFutureImpl mailboxFutureImpl3 = (MailboxFutureImpl) this.A04;
                Ibz ibz = new Ibz(this, 1);
                C1qL c1qL2 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl3, false, 0, 1, "MCAMailboxTam", "TamClientThreadBannerDismissProactiveWarnings", ibz);
                return;
            case 5:
                4uZ.A06("MailboxTam", 4YT.A00(1440), i2);
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A04;
                bool = false;
                A002 = new Ibz(this, 3);
                str3 = "MCAMailboxTam";
                str4 = "TamClientBottomSheetDismissLocationWarnings";
                C1qL c1qL3 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, bool, 0, 1, str3, str4, A002);
                return;
            default:
                4uZ.A06("MailboxTam", 4YT.A00(1447), i2);
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A04;
                bool = false;
                A002 = new Ibz(this, 8);
                str3 = "MCAMailboxTam";
                str4 = "TamClientThreadClearCustomEmoji";
                C1qL c1qL32 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, bool, 0, 1, str3, str4, A002);
                return;
        }
        C1qL c1qL4 = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A00);
    }
}
