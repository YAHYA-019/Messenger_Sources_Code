package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* loaded from: Cy7.class */
public final class Cy7 implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public Cy7(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A05 = obj;
        this.A03 = obj4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                AcC acC = (AcC) obj;
                try {
                    if (1qX.A00(acC.A05) == 0) {
                        ((SettableFuture) this.A04).set(FetchThreadResult.A0C);
                        return;
                    }
                    C5y4 c5y4 = (C5y4) this.A02;
                    int i = this.A01;
                    FbUserSession fbUserSession = c5y4.A02;
                    C1yc A00 = ((C1ya) 1Lo.A04((Context) null, fbUserSession, c5y4.A00, 16886)).A00(i);
                    ThreadKey threadKey = (ThreadKey) this.A05;
                    AbstractMsysMessagesCollectionTranslator A002 = ((C5pd) 1Lo.A04((Context) null, fbUserSession, c5y4.A00, 49840)).A00(threadKey);
                    ImmutableList.Builder builder = ImmutableList.builder();
                    if (((1PG) c5y4.A04.get()).A05()) {
                        if (((1CO) 1Bi.A03(16385)).AZk(36316619962132789L)) {
                            int i2 = 0;
                            while (true) {
                                C07884l6 c07884l6 = acC.A02;
                                if (i2 < 1qX.A00(c07884l6)) {
                                    builder.m11011add((Object) new UserKey(1Js.A03, ((1qX) c07884l6).mResultSet.getString(i2, 0)));
                                    i2++;
                                }
                            }
                        }
                    }
                    ImmutableList build = builder.build();
                    AcD acD = new AcD(threadKey, A002, A00, acC, (SettableFuture) this.A04);
                    ExecutorService executorService = (ExecutorService) this.A03;
                    if (build.isEmpty()) {
                        acD.A00(RegularImmutableMap.A03);
                        return;
                    }
                    ImmutableList.Builder A0h = 4YU.A0h();
                    HashSet A0v = AnonymousClass001.A0v();
                    1Du it = build.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (A0v.contains(next)) {
                            0fH.A0k("MsysLookupService", "Duplicate key found in opFetchUsersByKeys input parameter");
                        } else {
                            A0v.add(next);
                            A0h.m11011add(next);
                        }
                    }
                    5Vw A003 = ((5Vu) c5y4.A09.get()).A00(A0h.build());
                    C00i c00i = c5y4.A0A;
                    C2se c2se = (C2se) c00i.get();
                    AnonymousClass479 anonymousClass479 = (AnonymousClass479) c5y4.A08.get();
                    c00i.get();
                    A003.A01 = new C30U(new C47B(C47A.A00, new C4O1(anonymousClass479, 1)), c2se, 0);
                    A003.A01(new CkB(0, acD, c5y4, executorService));
                    return;
                } catch (Exception e) {
                    ((1FX) this.A04).setException(e);
                    return;
                }
            case 1:
                Mailbox mailbox = (Mailbox) obj;
                String A1D = 7zM.A1D(AbF.A0r(4YT.A00(1037), this.A01), 8);
                NotificationScope A004 = mailbox.getSessionedNotificationCenterCallbackManager().A00(new N89(A1D, this, 20), A1D);
                7zL.A1O(A004, this.A03, A1D);
                MailboxSDKJNI.dispatchVOOOO(76, mailbox, this.A05, this.A04, A004);
                return;
            default:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                N85 n85 = new N85(this, ActionId.RTMP_PACKET_RECEIVED);
                C1qL c1qL = 5P5.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxShim", "SHIMTransportHybridThreadUpdateTypingIndicatorSettings", n85);
                return;
        }
    }
}
