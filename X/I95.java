package X;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: I95.class */
public final class I95 {
    public static boolean A04 = true;
    public static int A05;
    public static Boolean A06;
    public static String A07;
    public static final HashMap A08 = AnonymousClass001.A0u();
    public static final HashMap A09 = AnonymousClass001.A0u();
    public Hbr A00;
    public final JQ9 A01;
    public final GTN A02;
    public final AtomicBoolean A03 = 7zO.A15();

    public I95(JQ9 jq9, GTN gtn) {
        this.A01 = jq9;
        this.A02 = gtn;
    }

    public static HashMap A00(int i, long j) {
        HashMap A1E = GOn.A1E(3);
        A1E.put("update_description", "SETTINGS");
        A1E.put("timestamp", String.valueOf(j));
        A1E.put("settings_update_id", String.valueOf(i));
        return A1E;
    }

    public void A01(long j) {
        String str;
        JQ9 jq9 = this.A01;
        String activeSessionId = jq9.getActiveSessionId();
        HashMap hashMap = A08;
        AnonymousClass001.A1A(activeSessionId, hashMap, hashMap.get(activeSessionId) != null ? GOq.A0E(activeSessionId, hashMap) + 1 : 1);
        HashMap hashMap2 = A09;
        if (!hashMap2.containsKey(activeSessionId)) {
            AnonymousClass001.A1A(activeSessionId, hashMap2, 0);
        }
        java.util.Map A3w = jq9.A3w();
        A3w.put("session_connect_count", String.valueOf(hashMap.get(activeSessionId)));
        A3w.put("session_disconnect_count", String.valueOf(hashMap2.get(activeSessionId)));
        int i = A05;
        A05 = i + 1;
        A3w.put("open_connections_count", String.valueOf(i));
        AtomicBoolean atomicBoolean = this.A03;
        A3w.put("has_connect_request", String.valueOf(atomicBoolean.get()));
        Boolean bool = A06;
        if (bool == null) {
            try {
                Class.forName("androidx.camera.extensions.impl.ExtensionVersionImpl", false, 4YV.A0e(this));
                bool = true;
                A06 = 1;
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                bool = false;
                A06 = null;
            }
        }
        A3w.put("has_camera_extensions", String.valueOf(bool.booleanValue()));
        if (Build.VERSION.SDK_INT > 30) {
            if (A07 == null) {
                try {
                    str = (String) Class.forName(AnonymousClass000.A00(46)).getMethod("get", String.class).invoke(null, "ro.camerax.extensions.enabled");
                } catch (Exception unused2) {
                    str = null;
                }
                A07 = str;
                if (TextUtils.isEmpty(str)) {
                    A07 = "none";
                }
            }
            A3w.put("has_camera_extensions_prop", A07);
        }
        A3w.put("timestamp", String.valueOf(j));
        jq9.BZh("camera_connect_started", "CameraEventLoggerImpl", A3w, GOn.A0B(this));
        atomicBoolean.set(true);
        jq9.Cco(A3w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0187, code lost:
    
        if (r0 >= 31) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(X.HzC r302, int r303, long r304) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I95.A02(X.HzC, int, long):void");
    }

    public void A03(String str, String str2) {
        0fH.A0d(str, str2, "CameraEventLoggerImpl", "onCameraEvicted from %s to %s");
        JQ9 jq9 = this.A01;
        java.util.Map A3w = jq9.A3w();
        A3w.put("previous_product_name", str);
        A3w.put("new_product_name", str2);
        jq9.BZh("camera_evicted", "CameraEventLoggerImpl", A3w, GOn.A0B(this));
        jq9.Cco(A3w);
    }
}
