package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: I06.class */
public final class I06 {
    public final 1Br A00 = 1BK.A0E();
    public final 1G2 A01;
    public final 1G2 A02;
    public final 1G2 A03;
    public final 1G2 A04;
    public final 1G2 A05;
    public final 1G2 A06;
    public final 1G2 A07;
    public final 1G2 A08;
    public final 1G2 A09;

    public I06() {
        1G2 A00 = ((3AA) 1Bi.A03(100242)).A00("sharing_bcf_latency_mqtt");
        this.A02 = 1G3.A00(A00, "mqtt_keep_alive_latency");
        this.A01 = 1G3.A00(A00, "mqtt_connect_latency");
        this.A09 = 1G3.A00(A00, "mqtt_publish_latency");
        this.A05 = 1G3.A00(A00, "mqtt_last_keep_alive_latency");
        this.A03 = 1G3.A00(A00, "mqtt_last_connect_latency");
        this.A08 = 1G3.A00(A00, "mqtt_last_publish_latency");
        this.A04 = 1G3.A00(A00, "bcf_last_e2e_latency");
        this.A07 = 1G3.A00(A00, "bcf_last_connect_latency");
        this.A06 = 1G3.A00(A00, "bcf_last_latency");
    }

    public static final FbSharedPreferences A00(I06 i06) {
        return 1Br.A09(i06.A00);
    }
}
