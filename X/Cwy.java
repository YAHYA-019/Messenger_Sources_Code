package X;

import android.view.View;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.facebook.messaging.sharing.broadcastflow.model.SendState;
import com.facebook.user.model.User;

/* loaded from: Cwy.class */
public final /* synthetic */ class Cwy implements AnonymousClass553 {
    public final /* synthetic */ 1Kq A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ ThreadSummary A02;
    public final /* synthetic */ BroadcastFlowMnetItem A03;
    public final /* synthetic */ SendState A04;
    public final /* synthetic */ DIq A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ Cwy(1Kq r302, ThreadKey threadKey, ThreadSummary threadSummary, BroadcastFlowMnetItem broadcastFlowMnetItem, SendState sendState, DIq dIq, User user, String str, boolean z) {
        this.A05 = dIq;
        this.A01 = threadKey;
        this.A04 = sendState;
        this.A07 = str;
        this.A03 = broadcastFlowMnetItem;
        this.A00 = r302;
        this.A08 = z;
        this.A02 = threadSummary;
        this.A06 = user;
    }

    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        DIq dIq = this.A05;
        ThreadKey threadKey = this.A01;
        SendState sendState = this.A04;
        String str = this.A07;
        BroadcastFlowMnetItem broadcastFlowMnetItem = this.A03;
        dIq.Cjk(view, this.A00, threadKey, this.A02, broadcastFlowMnetItem, sendState, this.A06, str, true, this.A08);
    }
}
