package X;

import com.facebook.messaging.analytics.perf.efficiency.connection.MessagingConnectionBlackoutLogger;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.2xv, reason: invalid class name */
/* loaded from: 2xv.class */
public final class C2xv extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xv(int i, int i2, Object obj, Object obj2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = (MessagingConnectionBlackoutLogger) this.A03;
                QuickPerformanceLogger A02 = MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger);
                int i = this.A01;
                C2t7.A00((1Od) messagingConnectionBlackoutLogger.A05.A00.get(), MessagingConnectionBlackoutLogger.A00(messagingConnectionBlackoutLogger), A02, 729356106, i);
                QuickPerformanceLogger A022 = MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger);
                C1h6 c1h6 = (C1h6) this.A02;
                A022.markerAnnotate(729356106, i, "message_send_attempt_count", c1h6.A02);
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i, "open_push_notification_count", c1h6.A04);
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i, "secure_push_notification_count", c1h6.A05);
                if (messagingConnectionBlackoutLogger.A0M) {
                    MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i, "network_prop_at_marker_end", MessagingConnectionBlackoutLogger.A04(messagingConnectionBlackoutLogger.A04.A04));
                }
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerEnd(729356106, i, (short) 2);
                break;
            case 1:
                C1h6 c1h62 = (C1h6) this.A02;
                if (c1h62.A04 == 0) {
                    MessagingConnectionBlackoutLogger.A02((MessagingConnectionBlackoutLogger) this.A03).markerPoint(729356106, this.A01, "open_message_push_notification_received");
                }
                c1h62.A04++;
                break;
            case 2:
                C1h6 c1h63 = (C1h6) this.A02;
                if (c1h63.A05 == 0) {
                    MessagingConnectionBlackoutLogger.A02((MessagingConnectionBlackoutLogger) this.A03).markerPoint(729356106, this.A01, "secure_message_push_notification_received");
                }
                c1h63.A05++;
                break;
            case 3:
                C1h6 c1h64 = (C1h6) this.A02;
                if (c1h64.A02 == 0) {
                    MessagingConnectionBlackoutLogger.A02((MessagingConnectionBlackoutLogger) this.A03).markerPoint(729356106, this.A01, "message_send_attempt");
                }
                c1h64.A02++;
                break;
            default:
                C1h2 c1h2 = (C1h2) this.A03;
                int i2 = this.A01;
                if (C1h2.A01(c1h2).isMarkerOn(729363290, i2)) {
                    C1h3 c1h3 = (C1h3) this.A02;
                    int i3 = c1h3.A00 + 1;
                    c1h3.A00 = i3;
                    if (i3 <= 5) {
                        C1h2.A01(c1h2).markerPoint(729363290, i2, 0Pz.A0T("act_sync_completed_", c1h3.A00));
                        QuickPerformanceLogger A01 = C1h2.A01(c1h2);
                        String A0T = 0Pz.A0T("time_since_last_secure_noti_recv_ms_", c1h3.A00);
                        C1gm c1gm = (C1gm) c1h2.A07.A00.get();
                        A01.markerAnnotate(729363290, i2, A0T, c1gm.A01 == 0 ? -1 : ((C0dr) c1gm.A03.A00.get()).now() - c1gm.A01);
                        break;
                    }
                }
                break;
        }
        return 04S.A00;
    }
}
