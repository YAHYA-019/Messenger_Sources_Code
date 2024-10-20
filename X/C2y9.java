package X;

import com.facebook.messaging.analytics.perf.efficiency.connection.MessagingConnectionBlackoutLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.Iterator;

/* renamed from: X.2y9, reason: invalid class name */
/* loaded from: 2y9.class */
public final class C2y9 extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2y9(C1h6 c1h6, MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A04 = messagingConnectionBlackoutLogger;
        this.A02 = i;
        this.A03 = c1h6;
        if (i3 != 0) {
            this.A06 = str;
            this.A08 = str2;
            this.A05 = str3;
            this.A0A = str4;
            this.A09 = str5;
        } else {
            this.A08 = str;
            this.A0A = str2;
            this.A09 = str3;
            this.A06 = str4;
            this.A05 = str5;
        }
        this.A01 = i2;
        this.A07 = str6;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        int i = this.A00;
        MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = (MessagingConnectionBlackoutLogger) this.A04;
        if (i != 0) {
            int i2 = this.A02;
            C1h6 c1h6 = (C1h6) this.A03;
            MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerStart(729356106, i2, true);
            MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, "instrumentation_version", ConstantsKt.CAMERA_ID_BACK);
            QuickPerformanceLogger A02 = MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger);
            String A03 = MessagingConnectionBlackoutLogger.A03(i2);
            A02.markerAnnotate(729356106, i2, "transport", A03);
            boolean z = messagingConnectionBlackoutLogger.A0I;
            if (z) {
                0fH.A0m("MessagingConnectionBlackoutLogger", 0Pz.A1C("refreshNetwork using fbNetworkManager.isCurrentlyConnected=", MessagingConnectionBlackoutLogger.A00(messagingConnectionBlackoutLogger).A0P()));
            }
            MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, "force_refresh_network", z);
            C2t7.A00.A02((1Od) messagingConnectionBlackoutLogger.A05.A00.get(), MessagingConnectionBlackoutLogger.A00(messagingConnectionBlackoutLogger), MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger), 729356106, i2);
            QuickPerformanceLogger A022 = MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger);
            if (i2 == 1) {
                str = messagingConnectionBlackoutLogger.A0F.A0D;
                str2 = "chatd_connection_state";
            } else {
                str = messagingConnectionBlackoutLogger.A0H.A0D;
                str2 = "mqtt_connection_state";
            }
            A022.markerAnnotate(729356106, i2, str2, str);
            MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerPoint(729356106, i2, 0Pz.A0m("network_", MessagingConnectionBlackoutLogger.A00(messagingConnectionBlackoutLogger).A0H(), MessagingConnectionBlackoutLogger.A00(messagingConnectionBlackoutLogger).A0M() ? "connected" : "disconnected", '_'));
            MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerPoint(729356106, i2, 0Pz.A0W(A03, "_disconnected"));
            MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_disconnect_reason"), this.A06);
            MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, "marker_start_reason", this.A08);
            String str3 = this.A05;
            if (str3 != null) {
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_connect_fail_reason"), str3);
            }
            if (i2 == 2) {
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_previous_winner_stream_ip_address"), c1h6.A0E);
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_previous_winner_stream_port"), c1h6.A06);
                if (messagingConnectionBlackoutLogger.A0J) {
                    MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_previous_connected_ip_addresses"), c1h6.A0B);
                }
            }
            MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_previous_network_type"), c1h6.A0C);
            String str4 = this.A0A;
            if (str4 != null) {
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_disconnect_change_source"), str4);
            }
            String str5 = this.A09;
            if (str5 != null) {
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_disconnect_change_reason"), str5);
            }
            MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_disconnected_dns_resolution_method"), this.A01);
            if (messagingConnectionBlackoutLogger.A0J) {
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, 0Pz.A0W(A03, "_disconnected_ip_addresses"), this.A07);
            }
            if (messagingConnectionBlackoutLogger.A0M) {
                MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).markerAnnotate(729356106, i2, "network_prop_at_marker_start", MessagingConnectionBlackoutLogger.A04(messagingConnectionBlackoutLogger.A04.A04));
            }
        } else {
            int i3 = this.A02;
            if (!MessagingConnectionBlackoutLogger.A02(messagingConnectionBlackoutLogger).isMarkerOn(729356106, i3)) {
                C1h6 c1h62 = (C1h6) this.A03;
                c1h62.A00 = 0;
                c1h62.A01 = 0;
                c1h62.A04 = 0;
                c1h62.A05 = 0;
                c1h62.A02 = 0;
                c1h62.A07 = ((C0dr) messagingConnectionBlackoutLogger.A0A.A00.get()).now();
                c1h62.A03 = 0;
                c1h62.A08 = null;
                c1h62.A0A = null;
                c1h62.A09 = null;
            }
            C1h6 c1h63 = (C1h6) this.A03;
            c1h63.A0D = "disconnected";
            Iterator it = messagingConnectionBlackoutLogger.A01.iterator();
            while (it.hasNext()) {
                MessagingConnectionBlackoutLogger.A07(messagingConnectionBlackoutLogger, new 31T(c1h63, messagingConnectionBlackoutLogger, this.A08, this.A0A, this.A09, this.A06, this.A05, this.A07, ((Number) it.next()).intValue(), i3, this.A01));
            }
            c1h63.A0E = null;
            c1h63.A06 = 0;
            c1h63.A0B = null;
            c1h63.A0C = null;
        }
        return 04S.A00;
    }
}
