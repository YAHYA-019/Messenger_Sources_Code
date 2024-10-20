package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.1gx, reason: invalid class name */
/* loaded from: 1gx.class */
public final class C1gx implements 1Ug {
    public int A00;
    public boolean A01;
    public final 1Br A02;
    public final 1Br A03;
    public final boolean A04;
    public final 1Br A05;
    public final boolean A06;

    public C1gx() {
        1Br A00 = 1Bq.A00(16385);
        this.A03 = A00;
        this.A04 = ((2yD) A00.A00.get()).AZk(36313609185467148L);
        this.A06 = ((2yD) this.A03.A00.get()).AZk(36313609188219679L);
        this.A05 = 1Bq.A00(16520);
        this.A02 = 1Bq.A00(66425);
    }

    public static final QuickPerformanceLogger A00(C1gx c1gx) {
        return (QuickPerformanceLogger) c1gx.A05.A00.get();
    }

    public void Bnn(String str, int i, String str2) {
        if (this.A01) {
            A00(this).markerPoint(729356554, "login_end");
        }
    }

    public void Bno() {
        if (this.A01) {
            A00(this).markerPoint(729356554, "login_start");
        }
    }

    public void Bnp(String str, int i, int i2, int i3, int i4, int i5) {
        if (this.A01) {
            A00(this).markerPoint(729356554, 0Pz.A0d("connection_", "_end", this.A00));
            if (this.A00 == 1) {
                A00(this).markerAnnotate(729356554, "first_disconnect_flag", i4);
                A00(this).markerAnnotate(729356554, "first_disconnect_code", i3);
                A00(this).markerAnnotate(729356554, "first_disconnect_state_change_source", i);
                A00(this).markerAnnotate(729356554, "first_disconnect_dns_resolution_method", i5);
                if (this.A06) {
                    A00(this).markerAnnotate(729356554, "first_disconnect_ip_addresses", str);
                }
            }
        }
    }

    public void Bnq(int i, int i2, int i3) {
        if (this.A01) {
            int i4 = this.A00 + 1;
            this.A00 = i4;
            if (i4 <= 20) {
                A00(this).markerPoint(729356554, 0Pz.A0d("connection_", "_start", this.A00));
                A00(this).markerAnnotate(729356554, 0Pz.A0d("connection_", "_hostname", this.A00), ((1hA) this.A02.A00.get()).A01);
                if (this.A00 == 2) {
                    A00(this).markerAnnotate(729356554, "first_reconnect_reason", i3);
                    A00(this).markerAnnotate(729356554, "first_reconnect_state_change_source", i);
                    A00(this).markerAnnotate(729356554, "first_reconnect_state_change_reason", i2);
                    return;
                }
                return;
            }
            1vL r0 = (1vL) 1Bi.A03(33098);
            if (r0 != null) {
                A00(this).markerAnnotate(729356554, "dialtone", r0.A0T());
            }
            A00(this).markerAnnotate(729356554, TraceFieldType.RetryCount, this.A00 - 1);
            A00(this).markerAnnotate(729356554, "state_change_source", i);
            A00(this).markerAnnotate(729356554, "state_change_reason", i2);
            A00(this).markerAnnotate(729356554, "connect_reason", i3);
            A00(this).markerEnd(729356554, (short) 3);
            this.A01 = false;
        }
    }

    public void Bnr(int i, int i2, String str, int i3, String str2) {
        if (this.A01) {
            1vL r0 = (1vL) 1Bi.A03(33098);
            if (r0 != null) {
                A00(this).markerAnnotate(729356554, "dialtone", r0.A0T());
            }
            A00(this).markerPoint(729356554, 0Pz.A0d("connection_", "_end", this.A00));
            A00(this).markerAnnotate(729356554, TraceFieldType.RetryCount, this.A00 - 1);
            A00(this).markerAnnotate(729356554, "connection_id", i);
            A00(this).markerAnnotate(729356554, "winner_stream_ip_address", str);
            A00(this).markerAnnotate(729356554, "winner_stream_port", i2);
            A00(this).markerAnnotate(729356554, "connected_dns_resolution_method", i3);
            if (this.A06) {
                A00(this).markerAnnotate(729356554, "connected_ip_addresses", str2);
            }
            A00(this).markerEnd(729356554, (short) 2);
            this.A01 = false;
        }
    }
}
