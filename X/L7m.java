package X;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: L7m.class */
public final class L7m {
    public Integer A00;
    public ScanResult A01;
    public final int A02;
    public final long A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;

    public L7m(long j, String str, int i, Integer num, String str2) {
        this.A03 = j;
        this.A05 = str;
        this.A02 = i;
        this.A06 = str2;
        this.A00 = num;
        this.A04 = null;
    }

    public L7m(Boolean bool, Integer num, String str, String str2, int i, long j) {
        this.A03 = j;
        this.A05 = str;
        this.A02 = i;
        this.A06 = str2;
        this.A00 = num;
        this.A04 = bool;
    }

    public static ArrayList A00(C0dp c0dp, C0dr c0dr, List list) {
        if (list == null) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            A0k.setLength(0);
            String str = scanResult.capabilities;
            if (str != null) {
                A0k.append(str);
            }
            CharSequence charSequence = scanResult.operatorFriendlyName;
            if (charSequence != null && charSequence.length() > 0) {
                scanResult.operatorFriendlyName.toString();
            }
            CharSequence charSequence2 = scanResult.venueName;
            if (charSequence2 != null && charSequence2.length() > 0) {
                scanResult.venueName.toString();
            }
            if (scanResult.is80211mcResponder()) {
                A0k.append("[MC]");
            }
            long now = c0dp.now() - (c0dr.now() - 4YU.A06(scanResult.timestamp));
            String str2 = scanResult.BSSID;
            int i = scanResult.level;
            String str3 = scanResult.SSID;
            Integer valueOf = Integer.valueOf(scanResult.frequency);
            A0k.toString();
            L7m l7m = new L7m(now, str2, i, valueOf, str3);
            l7m.A01 = scanResult;
            A0s.add(l7m);
        }
        return A0s;
    }
}
