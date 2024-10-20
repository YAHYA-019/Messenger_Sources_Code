package X;

import com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger;

/* renamed from: X.3Z3, reason: invalid class name */
/* loaded from: 3Z3.class */
public final class C3Z3 implements 1Ug {
    public final int A00;
    public final Object A01;

    public C3Z3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bnn(String str, int i, String str2) {
        switch (this.A00) {
            case 0:
                11T.A0G(str, 0, str2);
                MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = (MessagingStateChangePerformanceLogger) this.A01;
                messagingStateChangePerformanceLogger.A01 = str;
                messagingStateChangePerformanceLogger.A0T = "Login Completed";
                C1gn c1gn = (C1gn) 1Br.A0B(messagingStateChangePerformanceLogger.A0H);
                synchronized (c1gn) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("onChatdConnecting enabled=");
                    A0k.append(c1gn.A04);
                    A0k.append(" isActive=");
                    A0k.append(c1gn.A05);
                    A0k.append(" loginType=");
                    A0k.append(i);
                    0fH.A0j("MPLDataFreshnessTracker", 1BL.A0u(" registrationResult=", str2, A0k));
                    if (c1gn.A04) {
                        if (!c1gn.A05) {
                            C1gn.A03(c1gn, "chatd_loging_complete");
                        }
                        C1gn.A00(c1gn).markerPoint(729359638, "on_chatd_login_complete");
                        C1gn.A00(c1gn).markerAnnotate(729359638, "login_type", i);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "registration_result", str2);
                    }
                }
                MessagingStateChangePerformanceLogger.A04(messagingStateChangePerformanceLogger, "chatd_login_completed");
                if (C1fx.A00()) {
                    0fH.A0g(str, "MessagingStateChangePerformanceLogger", "chatd debug_message=%s");
                    MessagingStateChangePerformanceLogger.A09(messagingStateChangePerformanceLogger, "debug_message", str);
                    return;
                }
                return;
            case 3:
                11T.A0G(str, 0, str2);
                1hD r0 = (1hD) this.A01;
                1Br r02 = 1hC.A05;
                1hD.A01(r0, new 2CE(r0, str, str2, i));
                return;
            case 4:
                1UZ r03 = (1UZ) this.A01;
                1SG r04 = r03.A04;
                if (r04 != null) {
                    r04.A0K("chatd_login_end");
                }
                1SG r05 = r03.A04;
                if (r05 != null) {
                    r05.A0S("chatd_login_type", i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void Bno() {
        switch (this.A00) {
            case 0:
                MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = (MessagingStateChangePerformanceLogger) this.A01;
                messagingStateChangePerformanceLogger.A0T = "Started";
                MessagingStateChangePerformanceLogger.A04(messagingStateChangePerformanceLogger, "chatd_started");
                return;
            case 3:
                1hD r0 = (1hD) this.A01;
                1Br r02 = 1hC.A05;
                1hD.A01(r0, new C2xl(r0, 43));
                return;
            case 4:
                1SG r03 = ((1UZ) this.A01).A04;
                if (r03 != null) {
                    r03.A0K("chatd_login_start");
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void Bnp(String str, int i, int i2, int i3, int i4, int i5) {
        1SG r0;
        switch (this.A00) {
            case 0:
                MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = (MessagingStateChangePerformanceLogger) this.A01;
                C1gn c1gn = (C1gn) 1Br.A0B(messagingStateChangePerformanceLogger.A0H);
                synchronized (c1gn) {
                    C1gn.A01(c1gn, "onChatdDisconnected enabled=");
                    c1gn.A08 = false;
                    if (c1gn.A04 && c1gn.A05) {
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_disconnect_change_source", i);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_disconnect_change_reason", i2);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_connection_failure", i3);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_disconnect_reason", i4);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_disconnected_dns_resolution_method", i5);
                        if (1Br.A06(c1gn.A0G).AZk(36313609188219679L)) {
                            C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_disconnected_ip_addresses", str);
                        }
                        C1gn.A00(c1gn).markerPoint(729359638, "on_chatd_disconnected");
                        C1gn.A02(c1gn, "chatd_disconnected");
                    }
                }
                messagingStateChangePerformanceLogger.A0T = "Disconnected";
                MessagingStateChangePerformanceLogger.A04(messagingStateChangePerformanceLogger, "chatd_disconnected");
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_disconnect_reason", i4);
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_connection_failure", i3);
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_disconnect_change_source", i);
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_disconnect_change_reason", i2);
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_disconnected_dns_resolution_method", i5);
                if (str != null && MessagingStateChangePerformanceLogger.A00(messagingStateChangePerformanceLogger).AZk(36313609188219679L)) {
                    MessagingStateChangePerformanceLogger.A09(messagingStateChangePerformanceLogger, "chatd_disconnected_ip_addresses", str);
                }
                messagingStateChangePerformanceLogger.A01 = null;
                return;
            case 1:
                C1gy c1gy = (C1gy) this.A01;
                C1gy.A04(c1gy, new C2y8(c1gy.A01, c1gy, String.valueOf(i), String.valueOf(i2), str, String.valueOf(i3), String.valueOf(i4), 1, i5, 2), 1);
                return;
            case 2:
                return;
            case 3:
                1hD r02 = (1hD) this.A01;
                1Br r03 = 1hC.A05;
                1hD.A01(r02, new C2xp(r02, i2, i, 1));
                return;
            default:
                1UZ r04 = (1UZ) this.A01;
                int i6 = r04.A00;
                if (i6 <= 5 && (r0 = r04.A04) != null) {
                    1SG.A03(r0, "chatd_disconnected_", i6);
                }
                r04.A00++;
                return;
        }
    }

    public void Bnq(int i, int i2, int i3) {
        1SG r0;
        switch (this.A00) {
            case 0:
                MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = (MessagingStateChangePerformanceLogger) this.A01;
                C1gn c1gn = (C1gn) 1Br.A0B(messagingStateChangePerformanceLogger.A0H);
                synchronized (c1gn) {
                    C1gn.A01(c1gn, "onChatdConnecting enabled=");
                    c1gn.A08 = false;
                    if (c1gn.A04) {
                        if (!c1gn.A05) {
                            C1gn.A03(c1gn, "chatd_connecting");
                        }
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_connect_change_source", i);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_connect_change_reason", i2);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_connect_reason", i3);
                        C1gn.A00(c1gn).markerPoint(729359638, "on_chatd_connecting");
                    }
                }
                MessagingStateChangePerformanceLogger.A04(messagingStateChangePerformanceLogger, "chatd_connecting");
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_connect_reason", i3);
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_connect_change_source", i);
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_connect_change_reason", i2);
                return;
            case 1:
                C1gy c1gy = (C1gy) this.A01;
                C1gy.A04(c1gy, new C2y7(c1gy, c1gy.A01, String.valueOf(i), String.valueOf(i2), String.valueOf(i3), 1, 2), 1);
                return;
            case 2:
                C1gi c1gi = (C1gi) this.A01;
                if (c1gi.A07) {
                    C1gi.A00(c1gi);
                    return;
                }
                return;
            case 3:
                1hD r02 = (1hD) this.A01;
                1Br r03 = 1hC.A05;
                1hD.A01(r02, new C2xp(r02, i2, i, 2));
                return;
            default:
                1UZ r04 = (1UZ) this.A01;
                int i4 = r04.A00;
                if (i4 > 5 || (r0 = r04.A04) == null) {
                    return;
                }
                1SG.A03(r0, "chatd_connecting_", i4);
                return;
        }
    }

    public void Bnr(int i, int i2, String str, int i3, String str2) {
        1SG r0;
        switch (this.A00) {
            case 0:
                MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = (MessagingStateChangePerformanceLogger) this.A01;
                C1gn c1gn = (C1gn) 1Br.A0B(messagingStateChangePerformanceLogger.A0H);
                synchronized (c1gn) {
                    C1gn.A01(c1gn, "onChatdConnected enabled=");
                    c1gn.A08 = true;
                    if (c1gn.A04 && c1gn.A05) {
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_connection_id", i);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_winner_stream_ip_address", str);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_winner_stream_port", i2);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_connected_dns_resolution_method", i3);
                        if (1Br.A06(c1gn.A0G).AZk(36313609188219679L)) {
                            C1gn.A00(c1gn).markerAnnotate(729359638, "chatd_connected_ip_addresses", str2);
                        }
                        C1gn.A00(c1gn).markerPoint(729359638, "on_chatd_connected");
                    }
                }
                messagingStateChangePerformanceLogger.A0T = "Connected";
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_connection_id", i);
                if (str != null) {
                    MessagingStateChangePerformanceLogger.A09(messagingStateChangePerformanceLogger, "chatd_winner_stream_ip_address", str);
                }
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_winner_stream_port", i2);
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "chatd_connected_dns_resolution_method", i3);
                if (str2 != null && MessagingStateChangePerformanceLogger.A00(messagingStateChangePerformanceLogger).AZk(36313609188219679L)) {
                    MessagingStateChangePerformanceLogger.A09(messagingStateChangePerformanceLogger, "chatd_connected_ip_addresses", str2);
                }
                MessagingStateChangePerformanceLogger.A04(messagingStateChangePerformanceLogger, "chatd_connected");
                messagingStateChangePerformanceLogger.A01 = null;
                return;
            case 1:
                C1gy c1gy = (C1gy) this.A01;
                C1gy.A04(c1gy, new C2y6(c1gy.A01, c1gy, str, str2, i2, i3, 1, i, 2), 1);
                return;
            case 2:
                return;
            case 3:
                1hD r02 = (1hD) this.A01;
                1Br r03 = 1hC.A05;
                1hD.A01(r02, new C2xl(r02, 44));
                return;
            default:
                1UZ r04 = (1UZ) this.A01;
                int i4 = r04.A00;
                if (i4 > 5 || (r0 = r04.A04) == null) {
                    return;
                }
                1SG.A03(r0, "chatd_connected_", i4);
                return;
        }
    }
}
