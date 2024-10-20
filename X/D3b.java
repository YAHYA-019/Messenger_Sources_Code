package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.send.PendingSendQueueKey;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3b.class */
public final class D3b implements 2eF {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ C5Pr A01;
    public final /* synthetic */ String A02;

    public D3b(Message message, C5Pr c5Pr, String str) {
        this.A01 = c5Pr;
        this.A00 = message;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        Bqb bqb = (Bqb) obj;
        Message message = this.A00;
        PendingSendQueueKey pendingSendQueueKey = message.A0P;
        if (pendingSendQueueKey == null) {
            pendingSendQueueKey = this.A01.A0F(message);
        }
        5PI A0d = AbF.A0d(message);
        ThreadKey threadKey = bqb.A00.A0V;
        A0d.A0V = threadKey;
        A0d.A0P = new PendingSendQueueKey(pendingSendQueueKey.A00, threadKey);
        Message A0U = 4YU.A0U(A0d);
        boolean A0l = ThreadKey.A0l(threadKey);
        C5Pr c5Pr = this.A01;
        if (!A0l) {
            return c5Pr.A0G(A0U, this.A02);
        }
        return c5Pr.A0I(5Pz.A0x, A0U, NavigationTrigger.A03("pending_thread_send"), "pending_thread_send", false);
    }
}
