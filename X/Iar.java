package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.memmediautils.mca.MailboxMEMMediaUtilsJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;
import java.util.concurrent.Executor;

/* loaded from: Iar.class */
public final class Iar implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public Iar(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl A0P;
        MailboxCallback iaj;
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object A0T;
        Ic0 A00;
        String A002;
        String str;
        int i;
        Object obj2;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 4);
                A002 = 7zK.A00(63);
                str = "MediaAttachmentInfo";
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = false;
                A00 = Ic0.A00(this, 54);
                A002 = "MCAMailboxFTS";
                str = "MessengerFTSUniversalSearchQueryMessages";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 2:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 58);
                A002 = "MCAMailboxGIF";
                str = "GifSearchResultsQuery";
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 3:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 59);
                A002 = "MCAMailboxGIF";
                str = "GifSearchStatusQuery";
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 4:
                5Qb r0 = (5Qb) obj;
                Hwj hwj = Hwj.A00;
                MailboxFeature mailboxFeature = (MailboxFeature) this.A02;
                String str2 = this.A03;
                1xH r02 = (1xH) this.A01;
                int i2 = r0.A00;
                if (i2 == 0) {
                    1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                    A0P = 1BK.A0P(AQV);
                    1Um.A02(AQV, new Iar(mailboxFeature, A0P, str2, 5), A0P, false);
                    iaj = new Iaj(r02, hwj, 5);
                    A0P.addResultCallback(iaj);
                    return;
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("fetchReceiverFetchCDNUrl, dispatchMediaReceiverFetch taskCompletionState = ");
                A0k.append(i2);
                A0k.append(", errorTitle = ");
                A0k.append(r0.A02);
                A0k.append(", errorCode = ");
                0fH.A0k("[MP] ArmadilloMediaDownloader", AnonymousClass001.A0a(r0.A01, A0k));
                r02.A02();
                return;
            case 5:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 76);
                A002 = AbE.A00(34);
                str = "MediaReceiverFetchTransportFetchMapping";
                C1qL c1qL = GsI.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 6:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 77);
                A002 = AbE.A00(34);
                str = "MediaReceiverFetchTransportFetchPendingRequest";
                C1qL c1qL2 = GsI.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 7:
                AccountSession accountSession = (AccountSession) obj;
                String A1D = 7zM.A1D(GsK.A00, 1);
                NotificationScope CcE = accountSession.getSessionedNotificationCenterCallbackManager().CcE(new Ic4(A1D, this, 6), A1D, 1);
                7zL.A1O(CcE, this.A02, A1D);
                MailboxMEMMediaUtilsJNI.dispatchVOOO(2, accountSession, this.A03, CcE);
                return;
            case 8:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                if (mailboxNullable == null || (obj2 = mailboxNullable.value) == null) {
                    return;
                }
                String str3 = (String) obj2;
                A0P = Cbd.A00((Cbd) this.A01).A00((MailboxCallback) null, this.A03, str3);
                iaj = new Cxh(str3, this, 3);
                A0P.addResultCallback(iaj);
                return;
            case 9:
                ((Executor) this.A02).execute(new Iwj((MailboxNullable) obj, this));
                return;
            case 10:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 87);
                A002 = AbE.A00(300);
                str = "PaymentsGetServerRequestResponse";
                C1qL c1qL3 = GsL.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 11:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = false;
                A00 = Ic0.A00(this, 89);
                A002 = "MCAMailboxPresence";
                str = "UpdatePresenceSyncParams";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 12:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.DATA_LOAD_START);
                A002 = "MCAMailboxReactionV2";
                str = "GetReactionsV2";
                C1qL c1qL4 = GsM.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 13:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.QUERY_READY);
                A002 = "MCAMailboxReactionV2";
                str = "GetReactionsV2FbidFromEmojiLiteral";
                C1qL c1qL42 = GsM.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 14:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = false;
                A00 = Ic0.A00(this, 125);
                A002 = "MCAMailboxSearch";
                str = "DeleteRecentSearch";
                i = 1;
                C1qL c1qL5 = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            case 15:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.MQTT_DISCONNECTED);
                A002 = "MCAMailboxStickerPicker";
                str = "CheckStickerExistsInAttachments";
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, A002, str, A00);
                return;
            default:
                ((MailboxObservableImpl) this.A02).setResult(MailboxTamJNI.dispatchOOOO(10, obj, this.A03, null));
                return;
        }
    }
}
