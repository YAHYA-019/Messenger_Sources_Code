package X;

import com.facebook.messaging.analytics.perf.efficiency.connection.MessagingConnectionBlackoutLogger;
import java.util.Iterator;

/* renamed from: X.2y6, reason: invalid class name */
/* loaded from: 2y6.class */
public final class C2y6 extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2y6(Object obj, Object obj2, String str, String str2, int i, int i2, int i3, int i4, int i5) {
        super(0);
        this.A00 = i5;
        this.A05 = obj;
        this.A08 = str;
        this.A04 = i;
        this.A02 = i2;
        this.A07 = str2;
        this.A06 = obj2;
        this.A03 = i3;
        this.A01 = i4;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C1h6 c1h6 = (C1h6) this.A05;
                String str = this.A08;
                c1h6.A0E = str;
                int i = this.A04;
                c1h6.A06 = i;
                int i2 = this.A02;
                String str2 = this.A07;
                c1h6.A0B = str2;
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = (MessagingConnectionBlackoutLogger) this.A06;
                c1h6.A0C = MessagingConnectionBlackoutLogger.A00(messagingConnectionBlackoutLogger).A0E();
                c1h6.A0D = "connected";
                Iterator it = messagingConnectionBlackoutLogger.A01.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    MessagingConnectionBlackoutLogger.A08(messagingConnectionBlackoutLogger, new 3yX(c1h6, messagingConnectionBlackoutLogger, str, str2, intValue, this.A03, this.A01, i, i2), intValue);
                }
                int i3 = this.A03;
                if (MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).isMarkerOn(729356106, i3)) {
                    MessagingConnectionBlackoutLogger.A08(messagingConnectionBlackoutLogger, new C2xv(i3, 0, c1h6, messagingConnectionBlackoutLogger), i3);
                }
                c1h6.A07 = 0L;
                break;
            case 1:
                C1h2 c1h2 = (C1h2) this.A06;
                int i4 = this.A03;
                if (C1h2.A01(c1h2).isMarkerOn(729363290, i4)) {
                    C1h3 c1h3 = (C1h3) this.A05;
                    c1h3.A0G = true;
                    C1h2.A01(c1h2).markerPoint(729363290, i4, "connected");
                    C1h2.A01(c1h2).markerAnnotate(729363290, i4, "connected_time_since_app_launch_ms", ((1Od) c1h2.A02.A00.get()).A05());
                    if (c1h3.A06 != 0) {
                        C1h2.A01(c1h2).markerAnnotate(729363290, i4, "retry_count_for_success_connection", c1h3.A06);
                        C1h2.A01(c1h2).markerAnnotate(729363290, i4, "retry_time_for_success_connection_sec", (((C0dr) c1h2.A09.A00.get()).now() - c1h3.A0C) / 1000);
                    }
                    if (i4 == 2) {
                        C1h2.A01(c1h2).markerAnnotate(729363290, i4, "connection_id", this.A01);
                        C1h2.A01(c1h2).markerAnnotate(729363290, i4, "winner_stream_ip_address", this.A08);
                        C1h2.A01(c1h2).markerAnnotate(729363290, i4, "winner_stream_port", this.A04);
                        C1h2.A01(c1h2).markerAnnotate(729363290, i4, "connected_dns_resolution_method", this.A02);
                        if (c1h2.A0E) {
                            C1h2.A01(c1h2).markerAnnotate(729363290, i4, "connected_ip_addresses", this.A07);
                        }
                    }
                    C1h2.A01(c1h2).markerAnnotate(729363290, i4, "diff_time_from_last_success_connection_sec", c1h3.A0B == 0 ? 0L : (((C0dr) c1h2.A09.A00.get()).now() - c1h3.A0B) / 1000);
                }
                C1h3 c1h32 = (C1h3) this.A05;
                c1h32.A06 = 0;
                c1h32.A0C = 0L;
                c1h32.A0B = ((C0dr) c1h2.A09.A00.get()).now();
                break;
            default:
                C1gz c1gz = (C1gz) this.A05;
                c1gz.A07 = true;
                C1gy c1gy = (C1gy) this.A06;
                c1gz.A03 = ((C0dr) c1gy.A0B.A00.get()).now();
                int i5 = this.A03;
                if (C1gy.A05(c1gy, i5) && c1gz.A00 <= 5) {
                    C1gy.A00(c1gy).markerPoint(729351308, i5, 0Pz.A0T("connected_", c1gz.A00));
                    if (i5 == 1) {
                        C1gy.A00(c1gy).markerAnnotate(729351308, i5, 0Pz.A0T("connection_id", c1gz.A00), this.A01);
                        C1gy.A00(c1gy).markerAnnotate(729351308, i5, 0Pz.A0T("winner_stream_ip_address", c1gz.A00), this.A08);
                        C1gy.A00(c1gy).markerAnnotate(729351308, i5, 0Pz.A0T("winner_stream_port", c1gz.A00), this.A04);
                        C1gy.A00(c1gy).markerAnnotate(729351308, i5, 0Pz.A0T("connected_dns_resolution_method", c1gz.A00), this.A02);
                        if (c1gy.A0G) {
                            C1gy.A00(c1gy).markerAnnotate(729351308, i5, 0Pz.A0T("connected_ip_addresses", c1gz.A00), this.A07);
                            break;
                        }
                    }
                }
                break;
        }
        return 04S.A00;
    }
}
