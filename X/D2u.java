package X;

import android.content.Context;
import com.facebook.assistant.stella.ipc.common.model.StellaInboxMessage;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.rtc.incall.impl.active.lobby.views.LobbyRootView;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.messaging.service.model.FetchUnreadMessageResult;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: D2u.class */
public final class D2u implements Function {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public D2u(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v199, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v252, types: [com.facebook.assistant.stella.ipc.common.model.StellaInboxThread, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v294, types: [com.facebook.assistant.stella.ipc.common.model.StellaInboxMessage, java.lang.Object] */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean z;
        HashMap A0u;
        53N r310;
        DataSourceIdentifier dataSourceIdentifier;
        String error;
        switch (this.A00) {
            case 0:
                ImmutableCollection immutableCollection = (ImmutableCollection) obj;
                if (immutableCollection == null) {
                    throw AnonymousClass001.A0T("Failed to load user");
                }
                A0u = AnonymousClass001.A0u();
                1Du it = immutableCollection.iterator();
                while (it.hasNext()) {
                    User A0t = AbG.A0t(it);
                    UserKey userKey = A0t.A0k;
                    2fE r0 = (2fE) this.A02;
                    String A0D = ((AnonymousClass242) r0.A07.get()).A0D((ThreadSummary) this.A03, userKey.id);
                    if (A0D == null) {
                        A0D = ((C28o) r0.A09.get()).A03(A0t);
                    }
                    A0u.put(userKey, A0D);
                }
                break;
            case 1:
                if (AnonymousClass001.A1V(obj)) {
                    ((C67Q) this.A01).A05((Context) this.A02, null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (7zR.A1X(obj)) {
                    QAd qAd = (QAd) this.A01;
                    boolean z2 = qAd.A0C;
                    LobbyRootView lobbyRootView = (LobbyRootView) this.A03;
                    if (z2) {
                        CPV cpv = (CPV) 1Br.A0B(lobbyRootView.A0O);
                        C5k c5k = new C5k();
                        c5k.A00 = BOf.A0C;
                        c5k.A00(BOG.A01);
                        c5k.A02 = BOd.A04;
                        c5k.A05 = qAd.B8C();
                        cpv.A04(new C99(c5k));
                        if (AbJ.A0X(lobbyRootView.A0S).A0J()) {
                            ((C7D) 1Br.A0B(lobbyRootView.A0B)).A00(lobbyRootView.A06);
                        }
                        ((B7e) this.A02).Cx1(lobbyRootView.A04, lobbyRootView, qAd);
                    } else {
                        IFc.A06(AbM.A0b(lobbyRootView.A0T), "milestone_join_session_answer");
                        ((B7e) this.A02).BXb("messenger_lobby", false);
                    }
                }
                return 04S.A00;
            case 3:
                ThreadKey threadKey = (ThreadKey) obj;
                User user = (User) this.A03;
                DK4 dk4 = (DK4) this.A02;
                BOi A00 = BWH.A00(dk4);
                String str = AcW.A01(dk4).loggingName;
                11T.A0A(str);
                Float valueOf = Float.valueOf(user.A08);
                if (dk4 == null) {
                    dk4 = EnumC1297Ada.A1N;
                }
                Bn4 bn4 = (Bn4) this.A01;
                if (bn4 != null) {
                    AcX acX = bn4.A01;
                    r310 = acX.A0A;
                    11T.A09(r310);
                    dataSourceIdentifier = acX.A09;
                    11T.A09(dataSourceIdentifier);
                } else {
                    r310 = 53N.A0R;
                    dataSourceIdentifier = null;
                }
                return new Csw(A00, threadKey, dataSourceIdentifier, r310, dk4, user, valueOf, str);
            default:
                FetchUnreadMessageResult fetchUnreadMessageResult = (FetchUnreadMessageResult) obj;
                if (fetchUnreadMessageResult == null) {
                    return CP4.error(0, "Unkown error");
                }
                ImmutableMap immutableMap = fetchUnreadMessageResult.A00;
                0fH.A08(B9g.class, 1BK.A0k(immutableMap.keySet()), "Fetched message from %d threads");
                1G1 r02 = (FbUserSession) this.A03;
                C7H c7h = (C7H) 1Bn.A0E((Context) this.A02, (1BY) null, 83014);
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator A14 = AbM.A14(immutableMap);
                while (A14.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A14);
                    ThreadSummary threadSummary = (ThreadSummary) A0z.getKey();
                    MessagesCollection messagesCollection = (MessagesCollection) A0z.getValue();
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    String str2 = r02.A05;
                    1Du it2 = messagesCollection.A01.iterator();
                    while (it2.hasNext()) {
                        Message A0V = 4YU.A0V(it2);
                        ImmutableList immutableList = C1q7.A07;
                        String A07 = AnonymousClass001.A1T(A0V.A1m) ? "sticker" : C1q7.A07(A0V, false);
                        ParticipantInfo participantInfo = A0V.A0K;
                        if (participantInfo != null) {
                            String str3 = A0V.A1V;
                            String A01 = c7h.A01(A0V);
                            String str4 = participantInfo.A09.A00;
                            String A002 = participantInfo.A00();
                            long j = A0V.A05;
                            ?? obj2 = new Object();
                            obj2.mid = str3;
                            obj2.prevMid = null;
                            obj2.type = A01;
                            obj2.senderName = str4;
                            obj2.senderId = A002;
                            obj2.timestamp = j;
                            obj2.content = A07;
                            obj2.isAdminMessage = false;
                            obj2.adminMessageContentSubTypeId = 0;
                            obj2.attachments = null;
                            obj2.messageDelivery = null;
                            A0s2.add(obj2);
                        } else {
                            0fH.A0B(B9g.class, "Message without sender info");
                        }
                    }
                    ImmutableList A003 = c7h.A00(r02, threadSummary);
                    ThreadKey threadKey2 = threadSummary.A0n;
                    String A0w = 1BK.A0w(threadKey2);
                    String str5 = threadSummary.A20;
                    StellaInboxMessage[] stellaInboxMessageArr = (StellaInboxMessage[]) A0s2.toArray(new StellaInboxMessage[0]);
                    String[] A1b = 1BK.A1b((AbstractCollection) A003.get(0), 0);
                    String[] A1b2 = 1BK.A1b((AbstractCollection) A003.get(1), 0);
                    boolean A1F = threadKey2.A1F();
                    boolean A12 = threadKey2.A12();
                    long j2 = threadSummary.A0O;
                    ?? obj3 = new Object();
                    obj3.threadId = A0w;
                    obj3.threadName = str5;
                    obj3.messageList = stellaInboxMessageArr;
                    obj3.participantIds = A1b;
                    obj3.participantNames = A1b2;
                    obj3.isE2ee = A12;
                    obj3.isGroup = A1F;
                    obj3.isMuted = false;
                    obj3.viewerId = str2;
                    obj3.unreadCount = j2;
                    A0s.add(obj3);
                }
                try {
                    error = new AnonymousClass244().A0W(A0s);
                } catch (2LD e) {
                    0fH.A0N(B9g.class, "Failed to send inbox messsages to Stella", e, new Object[0]);
                    error = CP4.error(0, "Unkown error");
                }
                A0u = CP4.success(error);
                break;
        }
        return A0u;
    }
}
