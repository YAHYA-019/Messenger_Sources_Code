package com.facebook.messaging.analytics.perf.efficiency.connection;

import X.04P;
import X.0Pz;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1HG;
import X.1Od;
import X.1Ug;
import X.2Dv;
import X.2Dy;
import X.2yD;
import X.3XA;
import X.AnonymousClass001;
import X.C00m;
import X.C0s8;
import X.C1h6;
import X.C1h7;
import X.C1h8;
import X.C2y9;
import X.C3Ws;
import android.content.Context;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.efficiency.connection.MessagingConnectionBlackoutLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: MessagingConnectionBlackoutLogger.class */
public final class MessagingConnectionBlackoutLogger {
    public static final 1Br A0Q = 1Bq.A00(16385);
    public String A00;
    public List A01;
    public AtomicReference A02;
    public boolean A03;
    public final 2Dv A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final C1h7 A0B;
    public final C3Ws A0C;
    public final 3XA A0D;
    public final C1h8 A0E;
    public final C1h6 A0F;
    public final C1h6 A0G;
    public final C1h6 A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final Context A0N;
    public final 1Br A0O;
    public final 1Br A0P;

    /* JADX WARN: Type inference failed for: r0v109, types: [X.1h6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v127, types: [X.1h7] */
    /* JADX WARN: Type inference failed for: r0v130, types: [X.1h8] */
    /* JADX WARN: Type inference failed for: r0v73, types: [X.1h6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [X.1h6, java.lang.Object] */
    public MessagingConnectionBlackoutLogger() {
        1Br A00 = 1Bq.A00(16385);
        this.A09 = A00;
        this.A0P = 1Bq.A00(16520);
        this.A05 = 1Bq.A00(16616);
        this.A0K = ((2yD) A00.A00.get()).AZk(36313609185467148L);
        boolean AZk = ((2yD) this.A09.A00.get()).AZk(36313609189333804L);
        this.A0L = AZk;
        this.A0M = ((2yD) this.A09.A00.get()).AZk(36313609189268267L);
        this.A0J = ((2yD) this.A09.A00.get()).AZk(36313609188219679L);
        this.A0I = ((2yD) this.A09.A00.get()).AZk(36313609188547362L);
        this.A0O = 1Bq.A00(16687);
        this.A0A = 1Bq.A00(84488);
        this.A02 = new AtomicReference(null);
        Context A002 = FbInjector.A00();
        11T.A0A(A002);
        this.A0N = A002;
        this.A00 = "";
        this.A06 = 1HG.A00(A002, 65728);
        this.A07 = 1Bq.A00(66385);
        this.A08 = 1Bq.A00(66351);
        this.A04 = 2Dv.A06.A00(A002);
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A0E = null;
        obj.A06 = 0;
        obj.A0B = null;
        obj.A0C = null;
        obj.A01 = 0;
        obj.A03 = 0;
        obj.A07 = 0L;
        obj.A0D = "unknown";
        obj.A02 = 0;
        obj.A04 = 0;
        obj.A05 = 0;
        obj.A0A = null;
        obj.A08 = null;
        obj.A09 = null;
        this.A0F = obj;
        ?? obj2 = new Object();
        obj2.A00 = 0;
        obj2.A0E = null;
        obj2.A06 = 0;
        obj2.A0B = null;
        obj2.A0C = null;
        obj2.A01 = 0;
        obj2.A03 = 0;
        obj2.A07 = 0L;
        obj2.A0D = "unknown";
        obj2.A02 = 0;
        obj2.A04 = 0;
        obj2.A05 = 0;
        obj2.A0A = null;
        obj2.A08 = null;
        obj2.A09 = null;
        this.A0H = obj2;
        ?? obj3 = new Object();
        obj3.A00 = 0;
        obj3.A0E = null;
        obj3.A06 = 0;
        obj3.A0B = null;
        obj3.A0C = null;
        obj3.A01 = 0;
        obj3.A03 = 0;
        obj3.A07 = 0L;
        obj3.A0D = "unknown";
        obj3.A02 = 0;
        obj3.A04 = 0;
        obj3.A05 = 0;
        obj3.A0A = null;
        obj3.A08 = null;
        obj3.A09 = null;
        this.A0G = obj3;
        this.A0B = new 1Ug() { // from class: X.1h7
            public void Bnn(String str, int i, String str2) {
            }

            public void Bno() {
            }

            public void Bnp(String str, int i, int i2, int i3, int i4, int i5) {
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = MessagingConnectionBlackoutLogger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("onChatdNetworkConnectionDisconnect: ");
                C1h6 c1h6 = messagingConnectionBlackoutLogger.A0F;
                sb.append(c1h6.A00);
                sb.append(": stateChangeSource: ");
                sb.append(i);
                sb.append(", stateChangeReason: ");
                sb.append(i2);
                sb.append(", connectionFailureCode: ");
                sb.append(i3);
                sb.append(", disconnectFlag:");
                sb.append(i4);
                sb.append(", dnsResolutionMethod: ");
                sb.append(i5);
                sb.append(", ipAddresses: ");
                sb.append(str);
                0fH.A0m("MessagingConnectionBlackoutLogger", sb.toString());
                MessagingConnectionBlackoutLogger.A05(c1h6, messagingConnectionBlackoutLogger, "start_reason_chatd_disconnected", String.valueOf(i), String.valueOf(i2), String.valueOf(i4), String.valueOf(i3), str, 2, i5);
            }

            public void Bnq(int i, int i2, int i3) {
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = MessagingConnectionBlackoutLogger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("onChatdNetworkConnectionStart: ");
                C1h6 c1h6 = messagingConnectionBlackoutLogger.A0F;
                sb.append(c1h6.A00);
                sb.append(": ");
                sb.append(i);
                sb.append(", startChangeReason:, ");
                sb.append(i2);
                sb.append(", connectReason: ");
                sb.append(i3);
                sb.append(' ');
                0fH.A0m("MessagingConnectionBlackoutLogger", sb.toString());
                MessagingConnectionBlackoutLogger.A06(messagingConnectionBlackoutLogger, new C2y7(messagingConnectionBlackoutLogger, c1h6, String.valueOf(i), String.valueOf(i2), String.valueOf(i3), 2, 0));
            }

            public void Bnr(int i, int i2, String str, int i3, String str2) {
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = MessagingConnectionBlackoutLogger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("onChatdNetworkConnectionSuccess: ");
                C1h6 c1h6 = messagingConnectionBlackoutLogger.A0F;
                sb.append(c1h6.A00);
                sb.append(": ");
                sb.append(i);
                sb.append(", winnerStreamIpAddress: ");
                sb.append(str);
                sb.append(", winnerStreamPort: ");
                sb.append(i2);
                sb.append(", dnsResolutionMethod:");
                sb.append(i3);
                sb.append(", ipAddresses: ");
                sb.append(str2);
                0fH.A0m("MessagingConnectionBlackoutLogger", sb.toString());
                MessagingConnectionBlackoutLogger.A06(messagingConnectionBlackoutLogger, new C2y6(c1h6, messagingConnectionBlackoutLogger, str, str2, i2, i3, 2, i, 0));
            }
        };
        this.A0E = new 04P() { // from class: X.1h8
            public void C7q(String str) {
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = MessagingConnectionBlackoutLogger.this;
                C1h6 c1h6 = messagingConnectionBlackoutLogger.A0H;
                0fH.A0m("MessagingConnectionBlackoutLogger", 0Pz.A0E(c1h6.A00, "onMqttNetworkConnectionFailed: ", ": ", str));
                MessagingConnectionBlackoutLogger.A05(c1h6, messagingConnectionBlackoutLogger, "start_reason_mqtt_disconnected", null, null, "", str, null, 1, -1);
            }

            public void C7r(String str) {
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = MessagingConnectionBlackoutLogger.this;
                C1h6 c1h6 = messagingConnectionBlackoutLogger.A0H;
                0fH.A0m("MessagingConnectionBlackoutLogger", 0Pz.A0E(c1h6.A00, "onMqttNetworkConnectionStart: ", ":  ", str));
                MessagingConnectionBlackoutLogger.A06(messagingConnectionBlackoutLogger, new C2y7(messagingConnectionBlackoutLogger, c1h6, null, null, str, 1, 0));
            }

            public void C7s() {
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = MessagingConnectionBlackoutLogger.this;
                C1h6 c1h6 = messagingConnectionBlackoutLogger.A0H;
                0fH.A0m("MessagingConnectionBlackoutLogger", 0Pz.A0T("onMqttNetworkConnectionSuccess: ", c1h6.A00));
                MessagingConnectionBlackoutLogger.A06(messagingConnectionBlackoutLogger, new C2y6(c1h6, messagingConnectionBlackoutLogger, null, null, -1, -1, 1, -1, 0));
            }

            public void C7t(String str) {
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = MessagingConnectionBlackoutLogger.this;
                C1h6 c1h6 = messagingConnectionBlackoutLogger.A0H;
                0fH.A0m("MessagingConnectionBlackoutLogger", 0Pz.A0E(c1h6.A00, "onMqttNetworkDisconnect: ", ": ", str));
                MessagingConnectionBlackoutLogger.A05(c1h6, messagingConnectionBlackoutLogger, "start_reason_mqtt_disconnected", null, null, str, null, null, 1, -1);
            }

            public void CrL(String str) {
                11T.A0F(str, 0);
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = MessagingConnectionBlackoutLogger.this;
                MessagingConnectionBlackoutLogger.A08(messagingConnectionBlackoutLogger, new J8r(messagingConnectionBlackoutLogger, messagingConnectionBlackoutLogger.A0H, str, 1, 0), 1);
            }

            public void CrM(int i, String str) {
                MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger = MessagingConnectionBlackoutLogger.this;
                MessagingConnectionBlackoutLogger.A08(messagingConnectionBlackoutLogger, new 3kN(messagingConnectionBlackoutLogger, messagingConnectionBlackoutLogger.A0H, str, i, 0), 1);
            }
        };
        this.A0D = new 3XA(this);
        this.A0C = new C3Ws(this);
        ArrayList A11 = C0s8.A11(1, 2);
        this.A01 = A11;
        if (AZk) {
            A11.add(3);
        }
    }

    public static final FbNetworkManager A00(MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger) {
        return (FbNetworkManager) messagingConnectionBlackoutLogger.A0O.A00.get();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1h6, java.lang.Object] */
    public static final C1h6 A01(MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger, int i) {
        if (i == 1) {
            return messagingConnectionBlackoutLogger.A0H;
        }
        if (i == 2) {
            return messagingConnectionBlackoutLogger.A0F;
        }
        if (i == 3) {
            return messagingConnectionBlackoutLogger.A0G;
        }
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A0E = null;
        obj.A06 = 0;
        obj.A0B = null;
        obj.A0C = null;
        obj.A01 = 0;
        obj.A03 = 0;
        obj.A07 = 0L;
        obj.A0D = "unknown";
        obj.A02 = 0;
        obj.A04 = 0;
        obj.A05 = 0;
        obj.A0A = null;
        obj.A08 = null;
        obj.A09 = null;
        return obj;
    }

    public static final QuickPerformanceLogger A02(MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger) {
        return (QuickPerformanceLogger) messagingConnectionBlackoutLogger.A0P.A00.get();
    }

    public static final String A03(int i) {
        return i == 1 ? "mqtt" : i == 2 ? DGWRegionHintManager.SERVICE_KEY_CHATD : i == 3 ? "dgw" : "unknown";
    }

    public static final String A04(2Dy r301) {
        Boolean bool = r301.A03;
        Boolean A0K = AnonymousClass001.A0K();
        String A0j = 0Pz.A0j(11T.A0O(bool, A0K) ? "Metered;" : "NotMetered;", 11T.A0O(r301.A04, A0K) ? "Validated;" : "NotValidated;", 11T.A0O(r301.A02, A0K) ? "Captive;" : "NotCaptive;");
        11T.A0A(A0j);
        return A0j;
    }

    public static final void A05(C1h6 c1h6, MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        A06(messagingConnectionBlackoutLogger, new C2y9(c1h6, messagingConnectionBlackoutLogger, str, str2, str3, str4, str5, str6, i, i2, 0));
    }

    public static final void A06(MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger, C00m c00m) {
        synchronized (messagingConnectionBlackoutLogger) {
            if (messagingConnectionBlackoutLogger.A0K) {
                c00m.invoke();
            }
        }
    }

    public static final void A07(MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger, C00m c00m) {
        synchronized (messagingConnectionBlackoutLogger) {
            if (messagingConnectionBlackoutLogger.A0K && !((1Od) messagingConnectionBlackoutLogger.A05.A00.get()).A0E()) {
                c00m.invoke();
            }
        }
    }

    public static final void A08(MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger, C00m c00m, int i) {
        synchronized (messagingConnectionBlackoutLogger) {
            if (messagingConnectionBlackoutLogger.A0K && A02(messagingConnectionBlackoutLogger).isMarkerOn(729356106, i) && !((1Od) messagingConnectionBlackoutLogger.A05.A00.get()).A0E()) {
                c00m.invoke();
            }
        }
    }
}
