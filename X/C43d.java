package X;

import com.facebook.common.connectionstatus.FbDataConnectionManager;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.fury.context.ReqContext;

/* renamed from: X.43d, reason: invalid class name */
/* loaded from: 43d.class */
public final class C43d {
    public final C00i A04 = new 1BQ(16616);
    public final C00i A01 = new 1BV(32891);
    public final C00i A02 = new 1BQ(16687);
    public final C00i A03 = new 1BQ(66204);
    public final FbDataConnectionManager A00 = (FbDataConnectionManager) 1Bi.A03(32888);

    public static Long A00(String str, java.util.Map map) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (((X.C43q) r301.A01.get()).A02() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C43d r301) {
        /*
            r0 = r301
            X.00i r0 = r0.A04
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.1Od r0 = (X.1Od) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0E()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3d
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.43q r0 = (X.C43q) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A02()
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L41
        L3d:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L41:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43d.A01(X.43d):boolean");
    }

    public 43Z A02() {
        1EK.A09("TigonLogUtils", 4760009080727693L);
        try {
            ReqContext A04 = AnonymousClass018.A04("TigonLogUtils", 0);
            try {
                C00i c00i = this.A03;
                43Z Ayv = c00i.get() != null ? ((2Ag) c00i.get()).Ayv() : null;
                if (A04 != null) {
                    A04.close();
                }
                1EK.A03();
                return Ayv;
            } finally {
            }
        } catch (Throwable th) {
            1EK.A03();
            throw th;
        }
    }

    public boolean A03() {
        1EK.A09("TigonLogUtils", 4760009080727693L);
        try {
            ReqContext A04 = AnonymousClass018.A04("TigonLogUtils", 0);
            try {
                boolean equalsIgnoreCase = "wifi".equalsIgnoreCase(((FbNetworkManager) this.A02.get()).A0H());
                if (A04 != null) {
                    A04.close();
                }
                1EK.A03();
                return equalsIgnoreCase;
            } finally {
            }
        } catch (Throwable th) {
            1EK.A03();
            throw th;
        }
    }
}
