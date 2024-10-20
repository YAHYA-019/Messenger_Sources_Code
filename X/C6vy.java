package X;

import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListOnFrameDrawn;

/* renamed from: X.6vy, reason: invalid class name */
/* loaded from: 6vy.class */
public final class C6vy implements InterfaceC00733og {
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ C6uy A01;

    public C6vy(ThreadKey threadKey, C6uy c6uy) {
        this.A01 = c6uy;
        this.A00 = threadKey;
    }

    @Override // X.InterfaceC00733og
    public final void CCx() {
        C6uy c6uy = this.A01;
        if (c6uy.A05 && !c6uy.A03 && c6uy.A02) {
            c6uy.A03 = true;
            C2rx A00 = C2rv.A00(c6uy.A06);
            MessagingPerformanceLogger messagingPerformanceLogger = (MessagingPerformanceLogger) c6uy.A08.A00.get();
            ThreadKey threadKey = this.A00;
            messagingPerformanceLogger.A0T(threadKey, A00, null, null);
            if (((2yD) c6uy.A09.A00.get()).AZk(36325416051167957L)) {
                1Qd.A01((1Qd) c6uy.A07.A00.get(), 5505032, (short) 2);
            }
            MessageListOnFrameDrawn messageListOnFrameDrawn = new MessageListOnFrameDrawn(false, threadKey.A0u().hashCode());
            6Bw A002 = C6iY.A00();
            A002.A09 = threadKey.A06.toString();
            A002.A05 = A00.name();
            2dU.A01(A002, messageListOnFrameDrawn);
        }
    }
}
