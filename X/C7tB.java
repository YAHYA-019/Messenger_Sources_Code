package X;

import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7tB, reason: invalid class name */
/* loaded from: 7tB.class */
public abstract class C7tB {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    public static boolean A00() {
        List list;
        ?? r0 = "video/av01";
        try {
            r0 = C6ay.A04(r0, false, false);
            list = r0;
        } catch (C7ho unused) {
            C51f.A02("AV1Helper", "Failed to query AV1 decoders on device with exception %s.", r0.getMessage());
            list = null;
        }
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6b1 c6b1 = (C6b1) it.next();
                if (c6b1 != null && c6b1.A03.equals("c2.android.av1-dav1d.decoder")) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public static boolean A01(HashMap hashMap, boolean z) {
        if (!z) {
            return false;
        }
        ?? r0 = "video/av01";
        try {
            r0 = C6ay.A04(r0, false, false);
            if (r0 == 0) {
                return false;
            }
            for (C6b1 c6b1 : r0) {
                if (c6b1 != null) {
                    String str = c6b1.A03;
                    if (!c6b1.A07 && c6b1.A05) {
                        if (hashMap == null || hashMap.isEmpty()) {
                            return true;
                        }
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        if (!hashMap.containsKey(lowerCase)) {
                            return true;
                        }
                        int A03 = AnonymousClass001.A03(hashMap.get(lowerCase));
                        if (A03 != -1 && Build.VERSION.SDK_INT >= A03) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (C7ho unused) {
            C51f.A02("AV1Helper", "Failed to query AV1 decoders on device with exception %s.", r0.getMessage());
            return false;
        }
    }
}
