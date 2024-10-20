package X;

import com.facebook.messaging.analytics.perf.efficiency.connection.MessagingConnectionBlackoutLogger;
import java.util.Iterator;

/* renamed from: X.3Ws, reason: invalid class name */
/* loaded from: 3Ws.class */
public final class C3Ws implements C3lN {
    public final /* synthetic */ MessagingConnectionBlackoutLogger A00;

    public C3Ws(MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger) {
        this.A00 = messagingConnectionBlackoutLogger;
    }

    @Override // X.C3lN
    public void C8o(2Dy r302) {
        11T.A0F(r302, 0);
        MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = this.A00;
        0fH.A0m("MessagingConnectionBlackoutLogger", "NetworkPropertiesListener onNetworkPropertiesChanged() triggered");
        Iterator it = messagingConnectionBlackoutLogger.A01.iterator();
        while (it.hasNext()) {
            int A03 = AnonymousClass001.A03(it.next());
            C1h6 A01 = MessagingConnectionBlackoutLogger.A01(messagingConnectionBlackoutLogger, A03);
            11T.A0F(A01, 1);
            MessagingConnectionBlackoutLogger.A08(messagingConnectionBlackoutLogger, new AQi(A03, 0, A01, messagingConnectionBlackoutLogger, r302), A03);
        }
    }
}
