package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.facebook.user.model.User;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: Cju.class */
public final class Cju implements AnonymousClass477 {
    public final /* synthetic */ 1Kq A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ BroadcastFlowMnetItem A02;
    public final /* synthetic */ DFr A03;
    public final /* synthetic */ CCK A04;
    public final /* synthetic */ DJZ A05;
    public final /* synthetic */ CQT A06;
    public final /* synthetic */ ListenableFuture A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public Cju(1Kq r302, ThreadKey threadKey, BroadcastFlowMnetItem broadcastFlowMnetItem, DFr dFr, CCK cck, DJZ djz, CQT cqt, ListenableFuture listenableFuture, String str, String str2) {
        this.A06 = cqt;
        this.A05 = djz;
        this.A07 = listenableFuture;
        this.A08 = str;
        this.A04 = cck;
        this.A03 = dFr;
        this.A09 = str2;
        this.A02 = broadcastFlowMnetItem;
        this.A00 = r302;
        this.A01 = threadKey;
    }

    @Override // X.AnonymousClass477
    public void COj(User user) {
        CQT cqt = this.A06;
        FbUserSession fbUserSession = cqt.A02;
        DJZ djz = this.A05;
        ListenableFuture listenableFuture = this.A07;
        String str = this.A08;
        CCK cck = this.A04;
        DFr dFr = this.A03;
        String str2 = this.A09;
        BroadcastFlowMnetItem broadcastFlowMnetItem = this.A02;
        1Kq r0 = this.A00;
        Executor A1E = AbJ.A1E();
        1FV A03 = ((CNa) cqt.A0I.get()).A03(fbUserSession, user, false);
        A03.addListener(new DAW(r0, broadcastFlowMnetItem, dFr, cck, djz, cqt, A03, listenableFuture, str, str2), A1E);
    }

    @Override // X.AnonymousClass477
    public void onFailure(Throwable th) {
        if (!(th instanceof DBs)) {
            0fH.A0w("BroadcastFlowMessageSender", "Fetch user by userKey failed", th);
            return;
        }
        CQT cqt = this.A06;
        DJZ djz = this.A05;
        ThreadKey threadKey = this.A01;
        ListenableFuture listenableFuture = this.A07;
        String str = this.A08;
        CCK cck = this.A04;
        DFr dFr = this.A03;
        String str2 = this.A09;
        BroadcastFlowMnetItem broadcastFlowMnetItem = this.A02;
        AbG.A1D(cqt.A05).execute(new DAX(this.A00, threadKey, broadcastFlowMnetItem, dFr, cck, djz, cqt, listenableFuture, str2, str));
    }
}
