package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharing.broadcastflow.intent.model.ForwardIntentModel;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: AH9.class */
public final /* synthetic */ class AH9 implements Runnable {
    public static final String __redex_internal_original_name = "MessageForwardUtil$$ExternalSyntheticLambda0";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ ThreadKey A03;
    public final /* synthetic */ 76D A04;
    public final /* synthetic */ C5fv A05;

    public /* synthetic */ AH9(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadKey threadKey2, 76D r306, C5fv c5fv) {
        this.A04 = r306;
        this.A05 = c5fv;
        this.A02 = threadKey;
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A03 = threadKey2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        76D r0 = this.A04;
        C5fv c5fv = this.A05;
        ThreadKey threadKey = this.A02;
        1G1 r02 = this.A01;
        Context context = this.A00;
        ThreadKey threadKey2 = this.A03;
        Message A4v = r0.A4v(threadKey, c5fv);
        if (A4v == null) {
            0fH.A0o("MessageForwardUtil", "No message created to forward");
            return;
        }
        Message A00 = C7kv.A00(A4v, c5fv, r02.A02);
        NavigationTrigger A03 = NavigationTrigger.A03("agent_thread");
        CtU ctU = (CtU) 1Bn.A0E(context, (1BY) null, 84047);
        ForwardIntentModel forwardIntentModel = new ForwardIntentModel(A00, A03);
        ImmutableList A04 = threadKey2.A0z() ? ctU.A04(threadKey2, forwardIntentModel, (String) null) : ctU.A05(threadKey2, forwardIntentModel, (String) null);
        C5Pr c5Pr = (C5Pr) 1Lo.A04(context, r02, (1BY) null, 49712);
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            message.A0S.getClass();
            c5Pr.A0H(5Pz.A0l, message, A03, "MessageForwardUtil");
        }
    }
}
