package X;

import com.facebook.rsys.tslog.gen.TslogCounterApi;
import com.facebook.rsys.tslog.gen.TslogEngineApi;
import com.facebook.rsys.tslog.gen.TslogStreamApi;

/* loaded from: I0f.class */
public final class I0f {
    public 5YK A00;
    public C03703yt A01;
    public String A02;
    public final TslogCounterApi A05;
    public final TslogCounterApi A06;
    public final TslogCounterApi A07;
    public final TslogCounterApi A08;
    public final TslogCounterApi A09;
    public final TslogCounterApi A0A;
    public final TslogCounterApi A0B;
    public final TslogCounterApi A0C;
    public final TslogCounterApi A0D;
    public final TslogCounterApi A0E;
    public final TslogCounterApi A0F;
    public final TslogCounterApi A0G;
    public final TslogCounterApi A0H;
    public final TslogCounterApi A0I;
    public final TslogCounterApi A0J;
    public final TslogCounterApi A0K;
    public final TslogCounterApi A0L;
    public final TslogCounterApi A0M;
    public final TslogCounterApi A0N;
    public final TslogCounterApi A0O;
    public final TslogCounterApi A0P;
    public final TslogCounterApi A0Q;
    public final TslogCounterApi A0R;
    public final TslogCounterApi A0S;
    public final TslogCounterApi A0T;
    public final TslogCounterApi A0U;
    public final TslogCounterApi A0V;
    public final TslogCounterApi A0W;
    public final TslogCounterApi A0X;
    public final TslogCounterApi A0Y;
    public final TslogCounterApi A0Z;
    public final TslogCounterApi A0a;
    public final TslogCounterApi A0b;
    public final TslogCounterApi A0c;
    public final TslogCounterApi A0d;
    public final TslogStreamApi A0e;
    public final /* synthetic */ IQI A0f;
    public final 1Br A04 = 1Bq.A00(49776);
    public final 1Br A03 = 1Bq.A00(16918);

    public I0f(IQI iqi, TslogEngineApi tslogEngineApi) {
        this.A0f = iqi;
        TslogStreamApi createStream = tslogEngineApi.createStream("radio_signals", 35);
        11T.A0A(createStream);
        this.A0e = createStream;
        this.A0R = A00(createStream, "cell_updates_count", 1);
        this.A0S = A00(createStream, AnonymousClass000.A00(35), 4);
        this.A0B = A00(createStream, "cell_has_identity", 4);
        this.A0E = A00(createStream, "cell_is_congested", 4);
        this.A0Q = A00(createStream, "cell_upstream_kbps", 4);
        this.A0A = A00(createStream, "cell_downstream_kbps", 4);
        this.A08 = A00(createStream, "cell_data_saver", 4);
        this.A09 = A00(createStream, "cell_dbm", 5);
        this.A0I = A00(createStream, "cell_rsrp", 5);
        this.A0J = A00(createStream, "cell_rsrq", 5);
        this.A0L = A00(createStream, "cell_rssnr", 5);
        this.A0K = A00(createStream, "cell_rssi", 5);
        this.A07 = A00(createStream, "cell_cqi", 5);
        this.A0P = A00(createStream, "cell_timing_advance", 5);
        this.A0H = A00(createStream, "cell_pci", 4);
        this.A0O = A00(createStream, "cell_tac", 4);
        this.A05 = A00(createStream, "cell_arfcn", 4);
        this.A06 = A00(createStream, "cell_bandwidth", 4);
        this.A0D = A00(createStream, "cell_id_upper", 4);
        this.A0C = A00(createStream, "cell_id_lower", 4);
        this.A0F = A00(createStream, "cell_mcc", 4);
        this.A0G = A00(createStream, "cell_mnc", 4);
        this.A0M = A00(createStream, "cell_ss_rsrp", 5);
        this.A0N = A00(createStream, "cell_ss_rsrq", 5);
        this.A0X = A00(createStream, "wifi_frequency", 4);
        this.A0Z = A00(createStream, "wifi_rssi", 5);
        this.A0c = A00(createStream, "wifi_tx_mbps", 5);
        this.A0a = A00(createStream, "wifi_rx_mbps", 5);
        this.A0d = A00(createStream, "wifi_upstream_kbps", 5);
        this.A0W = A00(createStream, "wifi_downstream_kbps", 5);
        this.A0b = A00(createStream, "wifi_station_count", 4);
        this.A0V = A00(createStream, "wifi_channel_utilization", 4);
        this.A0T = A00(createStream, "wifi_bss_lower", 4);
        this.A0U = A00(createStream, "wifi_bss_upper", 4);
        this.A0Y = A00(createStream, "wifi_is_congested", 4);
        this.A02 = "unknown";
    }

    public static TslogCounterApi A00(TslogStreamApi tslogStreamApi, String str, int i) {
        TslogCounterApi createCounter = tslogStreamApi.createCounter(str, i);
        11T.A0A(createCounter);
        return createCounter;
    }
}
