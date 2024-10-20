package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.facebook.messaging.sharing.broadcastflow.model.SendState;
import com.facebook.user.model.User;

/* loaded from: Ck8.class */
public final class Ck8 implements 7Yx {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ ThreadSummary A03;
    public final /* synthetic */ BroadcastFlowIntentModel A04;
    public final /* synthetic */ BroadcastFlowMnetItem A05;
    public final /* synthetic */ SendState A06;
    public final /* synthetic */ CMa A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public Ck8(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, BroadcastFlowIntentModel broadcastFlowIntentModel, BroadcastFlowMnetItem broadcastFlowMnetItem, SendState sendState, CMa cMa, String str, boolean z, boolean z2, boolean z3) {
        this.A07 = cMa;
        this.A00 = context;
        this.A02 = threadKey;
        this.A06 = sendState;
        this.A08 = str;
        this.A0B = z;
        this.A05 = broadcastFlowMnetItem;
        this.A0A = z2;
        this.A04 = broadcastFlowIntentModel;
        this.A03 = threadSummary;
        this.A09 = z3;
        this.A01 = fbUserSession;
    }

    public void CHY(User user) {
        CMa cMa = this.A07;
        Context context = this.A00;
        ThreadKey threadKey = this.A02;
        SendState sendState = this.A06;
        String str = this.A08;
        boolean z = this.A0B;
        BroadcastFlowMnetItem broadcastFlowMnetItem = this.A05;
        1Kq r311 = user == null ? null : user.A0U;
        boolean z2 = this.A0A;
        CMa.A00(context, this.A01, r311, threadKey, this.A03, this.A04, broadcastFlowMnetItem, sendState, cMa, user, str, z, z2, this.A09);
    }
}
