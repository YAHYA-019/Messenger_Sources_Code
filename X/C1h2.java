package X;

import android.content.Context;
import android.net.NetworkInfo;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.efficiency.connectiontimeline.MessagingConnectionTimelineLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1h2, reason: invalid class name */
/* loaded from: 1h2.class */
public final class C1h2 implements 04P, 1Ug {
    public final C3m3 A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final C1h3 A0A;
    public final C1h3 A0B;
    public final C1h3 A0C;
    public final C1gp A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final Context A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final boolean A0J;

    public C1h2() {
        1Br A00 = 1Bq.A00(16385);
        this.A08 = A00;
        this.A0I = 1Bq.A00(16520);
        this.A02 = 1Bq.A00(16616);
        this.A0F = ((2yD) A00.A00.get()).AZk(36313609185467148L);
        this.A0E = ((2yD) this.A08.A00.get()).AZk(36313609188219679L);
        ((2yD) this.A08.A00.get()).AZk(36310817457243339L);
        this.A0J = ((2yD) this.A08.A00.get()).AZk(36313609189006119L);
        this.A05 = 1Bq.A00(16687);
        this.A09 = 1Bq.A00(84488);
        this.A07 = 1Bq.A00(66428);
        this.A06 = 1Bq.A00(66431);
        this.A01 = 1Bq.A00(66425);
        this.A0H = 1Bq.A00(116324);
        Context A002 = FbInjector.A00();
        11T.A0A(A002);
        this.A0G = A002;
        this.A03 = 1HG.A00(A002, 65728);
        this.A04 = 1Bq.A00(66385);
        this.A0A = new C1h3(null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 262143, 0L, 0L, 0L, 0L, 0L, 0L, false);
        this.A0C = new C1h3(null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 262143, 0L, 0L, 0L, 0L, 0L, 0L, false);
        this.A0B = new C1h3(null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 262143, 0L, 0L, 0L, 0L, 0L, 0L, false);
        this.A00 = new C3m3() { // from class: X.2yg
            @Override // X.C3m3
            public void Bqj(String str) {
                C1h2 c1h2 = C1h2.this;
                C1h2.A05(c1h2.A0B, c1h2, null, null, 3, -1, -1, -1);
            }

            @Override // X.C3m3
            public void Bql(String str) {
                C1h2 c1h2 = C1h2.this;
                C1h2.A06(c1h2.A0B, c1h2, null, null, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 3);
            }

            @Override // X.C3m3
            public void Btw(String str, Integer num, String str2) {
                11T.A0F(num, 1);
                C1h2 c1h2 = C1h2.this;
                C1h2.A07(c1h2.A0B, c1h2, str2, null, 3GF.A00(num), null, null, 3, -1);
            }
        };
        this.A0D = new C1gp() { // from class: X.1h4
            @Override // X.C1gp
            public void BhA(long j, long j2, long j3, long j4) {
                C1h2 c1h2 = C1h2.this;
                C1h2.A09(c1h2, new 3kP(c1h2.A0A, c1h2, 2, j, j2, j3, j4));
                C1h2.A09(c1h2, new 3kP(c1h2.A0C, c1h2, 1, j, j2, j3, j4));
                C1h2.A09(c1h2, new 3kP(c1h2.A0B, c1h2, 3, j, j2, j3, j4));
            }

            @Override // X.C1gp
            public void BhB() {
                C1h2 c1h2 = C1h2.this;
                C1h2.A09(c1h2, new C2xv(2, 4, c1h2.A0A, c1h2));
                C1h2.A09(c1h2, new C2xv(1, 4, c1h2.A0C, c1h2));
                C1h2.A09(c1h2, new C2xv(3, 4, c1h2.A0B, c1h2));
            }

            @Override // X.C1gp
            public void C5S(int i, int i2) {
                C1h2 c1h2 = C1h2.this;
                C1h2.A09(c1h2, new C4Cu(c1h2.A0C, c1h2, 1, i, i2));
                C1h2.A09(c1h2, new C4Cu(c1h2.A0A, c1h2, 2, i, i2));
                C1h2.A09(c1h2, new C4Cu(c1h2.A0B, c1h2, 3, i, i2));
            }

            @Override // X.C1gp
            public void C5T(boolean z, int i) {
                C1h2 c1h2 = C1h2.this;
                C1h2.A09(c1h2, new C2sw(c1h2.A0C, c1h2, 1, i, z));
                C1h2.A09(c1h2, new C2sw(c1h2.A0A, c1h2, 2, i, z));
                C1h2.A09(c1h2, new C2sw(c1h2.A0B, c1h2, 3, i, z));
            }

            @Override // X.C1gp
            public void C9Z(int i) {
                C1h2 c1h2 = C1h2.this;
                C1h2.A09(c1h2, new C4Ct(c1h2.A0C, c1h2, 1, i));
                C1h2.A09(c1h2, new C4Ct(c1h2.A0A, c1h2, 2, i));
                C1h2.A09(c1h2, new C4Ct(c1h2.A0B, c1h2, 3, i));
            }
        };
    }

    public static final MessagingConnectionTimelineLogger A00(C1h2 c1h2) {
        return (MessagingConnectionTimelineLogger) c1h2.A0H.A00.get();
    }

    public static final QuickPerformanceLogger A01(C1h2 c1h2) {
        return (QuickPerformanceLogger) c1h2.A0I.A00.get();
    }

    public static final void A02(C1h3 c1h3) {
        c1h3.A0F = null;
        c1h3.A0D = null;
        c1h3.A02 = 0;
        c1h3.A03 = 0;
        c1h3.A04 = 0;
        c1h3.A05 = 0;
        c1h3.A0H.clear();
        c1h3.A00 = 0;
        c1h3.A0A = 0L;
        c1h3.A07 = 0L;
        c1h3.A09 = 0L;
        c1h3.A08 = 0L;
        c1h3.A0G = false;
    }

    public static final void A03(C1h3 c1h3, C1h2 c1h2, int i) {
        A01(c1h2).markerAnnotate(729363290, i, "mailbox_sync_count", c1h3.A02);
        A01(c1h2).markerAnnotate(729363290, i, "non_mailbox_sync_count", c1h3.A05);
        A01(c1h2).markerAnnotate(729363290, i, "mailbox_sync_paging_total", c1h3.A04);
        A01(c1h2).markerAnnotate(729363290, i, "mailbox_sync_paging_progress_count", c1h3.A03);
        Iterator it = c1h3.A0H.entrySet().iterator();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                A01(c1h2).markerAnnotate(729363290, i, "non_mailbox_sync_group_total", i3);
                A01(c1h2).markerAnnotate(729363290, i, "act_sync_count", c1h3.A00);
                A01(c1h2).markerAnnotate(729363290, i, "act_sync_preview_total_count", c1h3.A0A);
                A01(c1h2).markerAnnotate(729363290, i, "act_sync_preview_message_count", c1h3.A07);
                A01(c1h2).markerAnnotate(729363290, i, "act_sync_preview_receipt_count", c1h3.A09);
                A01(c1h2).markerAnnotate(729363290, i, "act_sync_preview_notification_count", c1h3.A08);
                C2t7.A00((1Od) c1h2.A02.A00.get(), (FbNetworkManager) c1h2.A05.A00.get(), A01(c1h2), 729363290, i);
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            A01(c1h2).markerAnnotate(729363290, i, 0Pz.A0T("non_mailbox_sync_group_", ((Number) entry.getKey()).intValue()), ((Number) entry.getValue()).intValue());
            i2 = i3 + ((Number) entry.getValue()).intValue();
        }
    }

    public static final void A04(C1h3 c1h3, C1h2 c1h2, String str, int i) {
        A01(c1h2).markerAnnotate(729363290, i, "fail_reason", str);
        A03(c1h3, c1h2, i);
        A01(c1h2).markerEnd(729363290, i, (short) 3);
        A02(c1h3);
    }

    public static final void A05(C1h3 c1h3, C1h2 c1h2, String str, String str2, int i, int i2, int i3, int i4) {
        if (A00(c1h2).A0B) {
            MessagingConnectionTimelineLogger A00 = A00(c1h2);
            int i5 = 3;
            if (i == 1) {
                i5 = 1;
            } else if (i == 2) {
                i5 = 2;
            }
            String str3 = null;
            String valueOf = i3 == -1 ? null : String.valueOf(i3);
            if (i4 != -1) {
                str3 = String.valueOf(i4);
            }
            A00.A00(null, null, str, valueOf, str3, str2, null, null, i5, 2);
        }
        if (c1h2.A0J) {
            ((FFb) 1Bi.A03(99408)).A02(i != 1 ? i != 2 ? "DGW" : "CHATD" : "MQTT", "CONNECTED");
        }
        A09(c1h2, new C2y6(c1h3, c1h2, str, str2, i3, i4, i, i2, 1));
    }

    public static final void A06(C1h3 c1h3, C1h2 c1h2, String str, String str2, String str3, int i) {
        if (A00(c1h2).A0B) {
            MessagingConnectionTimelineLogger A00 = A00(c1h2);
            int i2 = 3;
            if (i == 1) {
                i2 = 1;
            } else if (i == 2) {
                i2 = 2;
            }
            A00.A00(null, null, null, null, null, null, null, null, i2, 1);
        }
        if (c1h2.A0J) {
            ((FFb) 1Bi.A03(99408)).A02(i != 1 ? i != 2 ? "DGW" : "CHATD" : "MQTT", "CONNECTING");
        }
        A09(c1h2, new C2y7(c1h2, c1h3, str, str2, str3, i, 1));
    }

    public static final void A07(C1h3 c1h3, C1h2 c1h2, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        if (A00(c1h2).A0B) {
            MessagingConnectionTimelineLogger A00 = A00(c1h2);
            int i3 = 3;
            if (i == 1) {
                i3 = 1;
            } else if (i == 2) {
                i3 = 2;
            }
            A00.A00(str, str2, null, null, i2 == -1 ? null : String.valueOf(i2), str5, str4, str3, i3, 3);
        }
        if (c1h2.A0J) {
            ((FFb) 1Bi.A03(99408)).A02(i != 1 ? i != 2 ? "DGW" : "CHATD" : "MQTT", "DISCONNECTED");
        }
        A09(c1h2, new C2y8(c1h3, c1h2, str, str2, str5, str4, str3, i, i2, 0));
    }

    private final void A08(C1h3 c1h3, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        if (A00(this).A0B) {
            MessagingConnectionTimelineLogger A00 = A00(this);
            int i3 = 1;
            if (i != 1) {
                i3 = 2;
            }
            A00.A00(str, str2, null, null, i2 == -1 ? null : String.valueOf(i2), str5, str4, str3, i3, 3);
        }
        if (this.A0J) {
            ((FFb) 1Bi.A03(99408)).A02(i != 1 ? "CHATD" : "MQTT", "DISCONNECTED");
        }
        A09(this, new C2y8(c1h3, this, str, str2, str5, str4, str3, i, i2, 1));
    }

    public static final void A09(C1h2 c1h2, C00m c00m) {
        synchronized (c1h2) {
            if (c1h2.A0F) {
                c00m.invoke();
            }
        }
    }

    public final void A0A() {
        if (A00(this).A0B) {
            MessagingConnectionTimelineLogger A00 = A00(this);
            NetworkInfo A01 = FbNetworkManager.A01((FbNetworkManager) this.A05.A00.get(), null, false);
            A00.A00(A01 != null ? A01.toString() : null, null, null, null, null, null, null, null, 4, 2);
        }
        if (this.A0J) {
            ((FFb) 1Bi.A03(99408)).A02("MOBILE", "CONNECTED");
        }
    }

    public final void A0B() {
        if (A00(this).A0B) {
            MessagingConnectionTimelineLogger A00 = A00(this);
            NetworkInfo A01 = FbNetworkManager.A01((FbNetworkManager) this.A05.A00.get(), null, false);
            A00.A00(A01 != null ? A01.toString() : null, null, null, null, null, null, null, null, 4, 3);
        }
        if (this.A0J) {
            ((FFb) 1Bi.A03(99408)).A02("MOBILE", "DISCONNECTED");
        }
    }

    public void Bnn(String str, int i, String str2) {
    }

    public void Bno() {
    }

    public void Bnp(String str, int i, int i2, int i3, int i4, int i5) {
        C1h3 c1h3 = this.A0A;
        String valueOf = String.valueOf(i);
        String valueOf2 = String.valueOf(i2);
        String valueOf3 = String.valueOf(i4);
        String valueOf4 = String.valueOf(i3);
        if (i4 == 0) {
            A07(c1h3, this, valueOf, valueOf2, valueOf3, valueOf4, str, 2, i5);
        } else {
            A08(c1h3, valueOf, valueOf2, valueOf3, valueOf4, str, 2, i5);
        }
    }

    public void Bnq(int i, int i2, int i3) {
        A06(this.A0A, this, String.valueOf(i), String.valueOf(i2), String.valueOf(i3), 2);
    }

    public void Bnr(int i, int i2, String str, int i3, String str2) {
        A05(this.A0A, this, str, str2, 2, i, i2, i3);
    }

    public void C7q(String str) {
        A08(this.A0C, null, null, null, str, null, 1, -1);
    }

    public void C7r(String str) {
        A06(this.A0C, this, null, null, str, 1);
    }

    public void C7s() {
        A05(this.A0C, this, null, null, 1, -1, -1, -1);
    }

    public void C7t(String str) {
        A07(this.A0C, this, null, null, str, null, null, 1, -1);
    }

    public void CrL(String str) {
        11T.A0F(str, 0);
        A09(this, new AKY(str, this.A0C, 8));
    }

    public void CrM(int i, String str) {
        A09(this, new 3kN(this, this.A0C, str, i, 1));
    }
}
