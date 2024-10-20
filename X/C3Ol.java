package X;

import android.net.NetworkInfo;

/* renamed from: X.3Ol, reason: invalid class name */
/* loaded from: 3Ol.class */
public abstract class C3Ol {
    public static Integer A00(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            boolean isConnected = networkInfo.isConnected();
            int type = networkInfo.getType();
            if (isConnected) {
                if (type != 0) {
                    if (type == 1) {
                        return 0S2.A01;
                    }
                    if (type != 6) {
                        return 0S2.A0N;
                    }
                }
                return 0S2.A0C;
            }
        }
        return 0S2.A00;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "WIFI";
            case 2:
                return "CELLULAR";
            case 3:
                return "OTHER";
            case 4:
                return "UNINITIALIZED";
            default:
                return "NOCONN";
        }
    }
}
