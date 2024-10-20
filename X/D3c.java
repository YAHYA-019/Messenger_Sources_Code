package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.send.PendingSendQueueKey;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3c.class */
public final class D3c implements 2eF {
    public final int A00;
    public final Object A01;
    public final String A02;

    public D3c(C5Pr c5Pr, String str, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = c5Pr;
            this.A02 = str;
        } else {
            this.A01 = c5Pr;
            this.A02 = str;
        }
    }

    public final ListenableFuture A8b(Object obj) {
        if (this.A00 == 0) {
            C5Pr c5Pr = (C5Pr) this.A01;
            String str = this.A02;
            Message message = (Message) obj;
            message.getClass();
            return c5Pr.A0G(message, str);
        }
        Bmw bmw = (Bmw) obj;
        Message message2 = bmw.A00;
        5PI A0d = AbF.A0d(message2);
        ThreadKey threadKey = bmw.A01;
        A0d.A0V = threadKey;
        PendingSendQueueKey pendingSendQueueKey = message2.A0P;
        A0d.A0P = pendingSendQueueKey == null ? null : new PendingSendQueueKey(pendingSendQueueKey.A00, threadKey);
        Message A0U = 4YU.A0U(A0d);
        boolean A0l = ThreadKey.A0l(threadKey);
        C5Pr c5Pr2 = (C5Pr) this.A01;
        if (A0l) {
            return c5Pr2.A0I(5Pz.A0x, A0U, NavigationTrigger.A03("pending_thread_send"), "pending_thread_send", false);
        }
        return c5Pr2.A0G(A0U, this.A02);
    }
}
