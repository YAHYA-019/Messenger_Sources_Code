package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.orca.mca.MailboxOrcaJNI;
import com.facebook.sdk.mca.MailboxSDKJNI;
import com.facebook.simplejni.NativeHolder;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Cxw.class */
public final class Cxw implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Cxw(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = i;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Number number;
        int i;
        NativeHolder nativeHolder;
        int i2;
        switch (this.A00) {
            case 0:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, 7zL.A0s((Object) null), 0, 0, null, (PrivacyContext) this.A04, 7zK.A00(63), "AttachmentCtaByCtaId", Czm.A02(this, 9));
                return;
            case 1:
                5P7 r0 = (5P7) this.A02;
                Object obj2 = this.A03;
                SettableFuture settableFuture = (SettableFuture) this.A04;
                int i3 = this.A01;
                BrB brB = (BrB) obj;
                if (brB == null || (number = brB.A00) == null || !brB.A02) {
                    1BK.A09(r0.A01).D0w("MsysSDKCreateEncryptedGroupThread", 0Pz.A0j("Failed to create encrypted thread. - user fbids ", obj2.toString(), brB == null ? ", result is null" : brB.A00 == null ? ", result.threadKey is null" : ", result.operationSuccess is false"), 1);
                    settableFuture.set(1BL.A0T());
                    CQB.A00(i3);
                    return;
                } else {
                    CQB.A03(i3, "thread_fbid", number.longValue());
                    CQB.A02(i3);
                    5P7.A03(r0, settableFuture, number);
                    return;
                }
            case 2:
                i = this.A01;
                nativeHolder = ((1XK) this.A04).A00;
                i2 = 6;
                break;
            case 3:
                i = this.A01;
                nativeHolder = ((1XK) this.A04).A00;
                i2 = 8;
                break;
            case 4:
                Mailbox mailbox = (Mailbox) obj;
                String A1D = 7zM.A1D(AbF.A0r(4YT.A00(ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES), this.A01), 5);
                NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 21);
                7zL.A1O(A00, this.A04, A1D);
                MailboxSDKJNI.dispatchVOOOZ(ActionId.DATA_LOAD_START, mailbox, this.A03, A00, true);
                return;
            case 5:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                PrivacyContext privacyContext = (PrivacyContext) this.A04;
                Czl A002 = Czl.A00(this, 40);
                C1qL c1qL = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, null, privacyContext, "MCAMailboxSearch", "ClearMessageSearchTable", A002);
                return;
            default:
                4uZ.A06("MailboxTam", 4YT.A00(1445), this.A01);
                MailboxFutureImpl mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0s = 7zL.A0s((Object) null);
                PrivacyContext privacyContext2 = (PrivacyContext) this.A04;
                Czl A003 = Czl.A00(this, 87);
                C1qL c1qL2 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl2, A0s, 0, 1, null, privacyContext2, "MCAMailboxTam", "TamClientSpamMessageFetch", A003);
                return;
        }
        MailboxOrcaJNI.dispatchVIOO(i2, i, obj, nativeHolder);
        ((MailboxObservableImpl) this.A03).setResult(null);
    }
}
