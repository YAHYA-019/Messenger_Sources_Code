package X;

import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;

/* renamed from: X.45m, reason: invalid class name */
/* loaded from: 45m.class */
public final class C45m {
    public final C00i A00 = new 1BQ(16687);

    public static HashMap A00(String... strArr) {
        int length = strArr.length;
        if (length % 2 != 0) {
            throw AnonymousClass001.A0L("Map must have an even (or zero) number of parameters");
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return hashMap;
            }
            String str = strArr[i2];
            if (str == null) {
                str = "";
            }
            String str2 = strArr[i2 + 1];
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put(str, str2);
            i = i2 + 2;
        }
    }

    public void A01(java.util.Map map) {
        String str;
        String str2;
        String str3;
        C00i c00i = this.A00;
        NetworkInfo A0A = ((FbNetworkManager) c00i.get()).A0A();
        WifiInfo A0B = ((FbNetworkManager) c00i.get()).A0B();
        String str4 = null;
        if (A0A != null) {
            str2 = A0A.getTypeName();
            str3 = A0A.getSubtypeName();
            str = A0A.getExtraInfo();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (A0B != null) {
            str4 = Integer.toString(A0B.getRssi());
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        map.put("network_is_connected", Boolean.toString(((FbNetworkManager) c00i.get()).A0M()));
        map.put(TraceFieldType.NetworkType, str2);
        map.put("network_subtype", str3);
        map.put("network_extra_info", str);
        map.put("network_wifi_rssi", str4);
    }
}
