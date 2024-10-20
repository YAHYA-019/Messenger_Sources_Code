package com.facebook.http.networkstatelogger;

import X.1BQ;
import X.1BV;
import X.1HH;
import X.1qC;
import X.2Ar;
import X.2DM;
import X.C00i;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.inject.FbInjector;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* loaded from: NetworkStateLogger.class */
public final class NetworkStateLogger {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public Map A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;
    public final C00i A0M;
    public final C00i A0N;
    public final C00i A0P;
    public final C00i A0Q;
    public final Random A0S;
    public final Context A0T;
    public static final String[] A0W = {"signal_lte_timing_advance", "signal_dbm", "lte_rsrq", "lte_rssnr", "sim_operator_mcc_mnc", "sim_operator_name", "gsm_mcc", "gsm_mnc", "wcdma_mcc", "wcdma_mnc", "lte_mcc", "lte_mnc", "cdma_network_id", "cdma_system_id", "gsm_lac", "wcdma_lac", "lte_tac", TraceFieldType.NetworkType, "network_generation", "cdma_base_station_id", "gsm_cid", "wcdma_cid", "lte_ci", "lte_pci", "extra"};
    public static final String[] A0V = {"signal_dbm", "hardware_address", "frequency", "wifi_standard", "security_type", "access_points"};
    public final C00i A0I = new 1BQ(99390);
    public final C00i A0U = new 1BQ(67199);
    public final C00i A0G = new 1BQ(16616);
    public final C00i A0H = new 1BQ(16918);
    public final C00i A0R = new 1BQ(49776);
    public final C00i A0O = new 1BQ(16385);

    public NetworkStateLogger() {
        Context A00 = FbInjector.A00();
        this.A0T = A00;
        this.A0L = new 1HH(A00, 65728);
        this.A0M = new 1BQ(16687);
        this.A0K = FbInjector.A00;
        this.A0J = new 1HH(A00, 100170);
        this.A0Q = new 1BQ(32862);
        this.A0P = new 1BQ(66767);
        this.A0N = new 1BV(32891);
        this.A02 = -1;
        this.A0A = new HashMap();
        this.A0S = new Random();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (r0.isConnected() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017f, code lost:
    
        if (r0.hasCapability(16) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147 A[Catch: Exception -> 0x05bb, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x05bb, blocks: (B:29:0x0131, B:30:0x0139, B:31:0x013e, B:34:0x0147, B:35:0x014f, B:37:0x0155, B:41:0x0167, B:45:0x0179), top: B:28:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0411  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(com.facebook.http.networkstatelogger.NetworkStateLogger r301) {
        /*
            Method dump skipped, instructions count: 1471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.http.networkstatelogger.NetworkStateLogger.A00(com.facebook.http.networkstatelogger.NetworkStateLogger):void");
    }

    public static void A01(NetworkStateLogger networkStateLogger, Map map) {
        C00i c00i = networkStateLogger.A0H;
        TreeMap A0i = ((2Ar) c00i.get()).A00().A0i(1L);
        if (A0i != null) {
            String[] strArr = A0W;
            int i = 0;
            do {
                String str = strArr[i];
                Object obj = A0i.get(str);
                if (obj != null) {
                    map.put(str, obj.toString());
                }
                i++;
            } while (i < 25);
            1qC r0 = ((2Ar) c00i.get()).A00().A0H;
            if (r0 != null) {
                TelephonyManager telephonyManager = r0.A00;
                map.put("network_operator_mcc_mnc", telephonyManager.getNetworkOperator());
                map.put("network_operator_name", telephonyManager.getNetworkOperatorName());
            }
        }
    }

    public static void A02(2DM r301, String str, Map map) {
        if (map.containsKey(str)) {
            r301.A0o(str, (String) map.get(str));
        }
    }

    public void A03() {
        synchronized (this) {
            if (this.A0D && !this.A0E) {
                this.A07 = "SESSION_END";
                A00(this);
                this.A0D = false;
                this.A0E = true;
                this.A0F = false;
            }
        }
    }
}
