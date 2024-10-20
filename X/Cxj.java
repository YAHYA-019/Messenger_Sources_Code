package X;

import android.util.Pair;
import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Cxj.class */
public final class Cxj implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Cxj(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                PrivacyContext privacyContext = (PrivacyContext) this.A03;
                Czm A02 = Czm.A02(this, 83);
                C1qL c1qL = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, null, privacyContext, "MCAMailboxCommunity", "VerifyCommunityListSynced", A02);
                return;
            case 1:
                MailboxFutureImpl mailboxFutureImpl2 = (MailboxFutureImpl) this.A02;
                MailboxNullable A0s = 7zL.A0s((Object) null);
                PrivacyContext privacyContext2 = (PrivacyContext) this.A03;
                Czm A022 = Czm.A02(this, 96);
                C1qL c1qL2 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl2, A0s, 0, 0, null, privacyContext2, "MCAMailboxCommunity", "GetAllCommunityFolders", A022);
                return;
            case 2:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, false, 0, 1, "MCAMailboxCommunityMessagingPresence", "FetchAggregatedUserPresenceCountsForCommunities", Czm.A02(this, ActionId.NEW_START_FOUND));
                return;
            case 3:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                C21O c21o = (C21O) this.A01;
                C5ov c5ov = (C5ov) this.A03;
                ArrayList A023 = C21O.A02(mailboxNullable, (java.util.Map) this.A02);
                Object obj2 = mailboxNullable.value;
                if (obj2 == null || AbM.A04(obj2) < 1) {
                    str = "MsysPushNotificationHandler";
                    str2 = "Got null message for new message notification";
                    0fH.A0j(str, str2);
                    return;
                }
                Iterator it = A023.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    1FV A00 = ((C16) c21o.A0D.get()).A00(c5ov.AzX(AnonymousClass001.A03(pair.second)), (BEV) mailboxNullable.value, AnonymousClass001.A03(pair.first));
                    1Kd.A0D(c21o.A04, new D4H(9, c21o, pair, mailboxNullable), A00);
                }
                return;
            default:
                MailboxNullable mailboxNullable2 = (MailboxNullable) obj;
                C21O c21o2 = (C21O) this.A01;
                C5ov c5ov2 = (C5ov) this.A03;
                ArrayList A024 = C21O.A02(mailboxNullable2, (java.util.Map) this.A02);
                Object obj3 = mailboxNullable2.value;
                if (obj3 == null || AbM.A04(obj3) < 1) {
                    str = "MsysPushNotificationHandler";
                    str2 = "Got null message for new message request notification";
                    0fH.A0j(str, str2);
                    return;
                }
                Iterator it2 = A024.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    C5ow AzX = c5ov2.AzX(AnonymousClass001.A03(pair2.second));
                    1FV A002 = ((C16) c21o2.A0D.get()).A00(AzX, (BEV) mailboxNullable2.value, AnonymousClass001.A03(pair2.first));
                    1Kd.A0D(c21o2.A04, new D4S(6, c21o2, AzX, pair2, mailboxNullable2), A002);
                }
                return;
        }
    }
}
