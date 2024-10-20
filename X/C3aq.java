package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.communitymessaging.plugins.communitycontainers.inboxcommunityrowclickhandlerincallback.InboxCommunityRowClickHandlerInCallbackImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.3aq, reason: invalid class name */
/* loaded from: 3aq.class */
public final class C3aq implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public C3aq(int i, long j, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1FX r308;
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object obj2;
        int i;
        A1g a1g;
        String str;
        String str2;
        1qX r0;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = false;
                i = 1;
                a1g = new A1g(this, 1);
                str = "MCAMailboxAccountInformation";
                str2 = "ComputeAccountCapabilities";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, a1g);
                return;
            case 1:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                if (mailboxNullable == null || (r0 = (1qX) mailboxNullable.value) == null) {
                    return;
                }
                if (1qX.A00(r0) != 1) {
                    ((InboxCommunityRowClickHandlerInCallbackImplementation) this.A03).A06.CVi((C4Mh) this.A02);
                    return;
                }
                C1zm c1zm = new C1zm();
                c1zm.A03(ThreadKey.A03(r0.mResultSet.getLong(0, 0)));
                InboxCommunityRowClickHandlerInCallbackImplementation inboxCommunityRowClickHandlerInCallbackImplementation = (InboxCommunityRowClickHandlerInCallbackImplementation) this.A03;
                C2gi c2gi = inboxCommunityRowClickHandlerInCallbackImplementation.A07;
                c1zm.A0l = ThreadKey.A07(c2gi.A01.A0n.A0r());
                long j = this.A01;
                c1zm.A06 = j;
                c1zm.A0g = 1F9.A0B;
                ThreadSummary threadSummary = new ThreadSummary(c1zm);
                ((1SG) 1Br.A0B(((C4Ln) 1Br.A0B(inboxCommunityRowClickHandlerInCallbackImplementation.A01)).A02)).A0Q("Canceling navigation to channel list");
                C3T9 c3t9 = (C3T9) 1Br.A0B(inboxCommunityRowClickHandlerInCallbackImplementation.A02);
                2YQ r02 = inboxCommunityRowClickHandlerInCallbackImplementation.A06;
                7UE A0P = 1BL.A0P(c2gi, j);
                ThreadKey threadKey = threadSummary.A0n;
                11T.A0A(threadKey);
                C3T9.A00(c3t9, r02, threadKey, threadSummary.A0l, threadSummary, null, A0P, null);
                return;
            case 2:
                C2ij c2ij = (C2ij) this.A03;
                0fH.A0h(Long.valueOf(((C0dp) c2ij.A05.A00.get()).now() - this.A01), "InboxFollowupHelperImpl", "fetching last 3 message timestamps took %d ms");
                1qX r03 = (1qX) ((MailboxNullable) obj).value;
                if (r03 != null) {
                    int A00 = 1qX.A00(r03);
                    for (int i2 = 0; i2 < A00; i2++) {
                        c2ij.A0H.put(1BK.A0m(r03.mResultSet, i2, 0), 1BK.A1G(r03.mResultSet.getNullableLong(i2, 1), r03.mResultSet.getNullableLong(i2, 2)));
                    }
                }
                r308 = (1FX) this.A02;
                break;
            case 3:
                C2ij c2ij2 = (C2ij) this.A03;
                0fH.A0g(Long.valueOf(((C0dp) c2ij2.A05.A00.get()).now() - this.A01), "InboxFollowupHelperImpl", "fetching last message type took %d ms");
                1qX r04 = (1qX) ((MailboxNullable) obj).value;
                if (r04 != null) {
                    r308 = (1FX) this.A02;
                    int A002 = 1qX.A00(r04);
                    for (int i3 = 0; i3 < A002; i3++) {
                        java.util.Map map = c2ij2.A0G;
                        Long A0m = 1BK.A0m(r04.mResultSet, i3, 1);
                        Integer nullableInteger = r04.mResultSet.getNullableInteger(i3, 0);
                        Integer valueOf = Integer.valueOf(r04.mResultSet.getInteger(i3, 2));
                        boolean z = true;
                        if (nullableInteger == null || nullableInteger.intValue() != 1 || valueOf == null || valueOf.intValue() != 0) {
                            z = false;
                        }
                        map.put(A0m, Boolean.valueOf(z));
                    }
                    break;
                } else {
                    return;
                }
            case 4:
                C2ij c2ij3 = (C2ij) this.A03;
                0fH.A0g(Long.valueOf(((C0dp) c2ij3.A05.A00.get()).now() - this.A01), "InboxFollowupHelperImpl", "fetching last message type took %d ms");
                1qX r05 = (1qX) ((MailboxNullable) obj).value;
                if (r05 == null) {
                    return;
                }
                r308 = (1FX) this.A02;
                int A003 = 1qX.A00(r05);
                int i4 = 0;
                while (true) {
                    boolean z2 = true;
                    if (i4 >= A003) {
                        break;
                    } else {
                        Integer valueOf2 = Integer.valueOf(r05.mResultSet.getInteger(i4, 0));
                        Integer valueOf3 = Integer.valueOf(r05.mResultSet.getInteger(i4, 2));
                        boolean z3 = valueOf2 != null && valueOf2.intValue() == 1 && valueOf3 != null && valueOf3.intValue() == 0;
                        if (r05.mResultSet.getInteger(i4, 3) != 1) {
                            z2 = false;
                        }
                        c2ij3.A0F.put(1BK.A0m(r05.mResultSet, i4, 1), new C4Fr(r05.mResultSet.getString(i4, 4), z3, z2));
                        i4++;
                    }
                }
                break;
            default:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = 1BL.A0T();
                a1g = new A1g(this, ActionId.MQTT_CONNECTING);
                str = "MCAMailboxThread";
                str2 = "GroupCreationLoggingContextForOptimisticThreadKey";
                C1qL c1qL = C8ya.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, 0, i, str, str2, a1g);
                return;
        }
        r308.A04();
    }
}
