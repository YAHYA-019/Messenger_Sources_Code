package X;

import android.app.ActivityThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;

/* renamed from: X.0di, reason: invalid class name */
/* loaded from: 0di.class */
public final class C0di {
    public static volatile C0di A02;
    public final String A00;
    public final C0dh A01;

    public C0di() {
        this(null, null);
    }

    public C0di(C0dh c0dh, String str) {
        this.A00 = str;
        this.A01 = c0dh;
    }

    public static C0di A00() {
        C0di c0di;
        C0di c0di2 = A02;
        if (c0di2 != null) {
            return c0di2;
        }
        synchronized (C0di.class) {
            c0di = A02;
            if (c0di == null) {
                ActivityThread A00 = 0Ym.A00();
                if (A00 != null) {
                    c0di = A01(A00.getProcessName());
                    A02 = c0di;
                    if (TextUtils.isEmpty(c0di.A00)) {
                        Pair A002 = C0dl.A00("/proc/self/cmdline");
                        if (TextUtils.isEmpty((CharSequence) A002.first)) {
                            c0di = A02;
                        } else {
                            c0di = A01((String) A002.first);
                            A02 = c0di;
                        }
                    }
                } else {
                    new C0di(null, null);
                }
            }
        }
        return c0di;
    }

    public static C0di A01(String str) {
        String str2;
        if (str == null) {
            return new C0di(null, null);
        }
        String[] split = str.split(":");
        if (split.length > 1) {
            str2 = split[1];
            if (str2 == null) {
                throw AnonymousClass001.A0L("Invalid name");
            }
        } else {
            str2 = "";
        }
        return new C0di("".equals(str2) ? C0dh.A01 : new C0dh(str2), str);
    }

    public static boolean A02() {
        int myUid = Process.myUid() % LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
        return 99000 <= myUid ? myUid <= 99999 : 90000 <= myUid;
    }

    public String A03() {
        if (this.A00 == null) {
            return "<unknown>";
        }
        if (A05()) {
            return "<default>";
        }
        C0dh c0dh = this.A01;
        if (c0dh != null) {
            return c0dh.A00;
        }
        return null;
    }

    public String A04() {
        C0dh c0dh = this.A01;
        if (c0dh != null) {
            return c0dh.A00;
        }
        return null;
    }

    public boolean A05() {
        return C0dh.A01.equals(this.A01);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            boolean z2 = false;
            if (obj != null && getClass() == obj.getClass()) {
                String str = this.A00;
                String str2 = ((C0di) obj).A00;
                if (str != null) {
                    z2 = str.equals(str2);
                } else if (str2 != null) {
                    z = false;
                }
            }
            return z2;
        }
        return z;
    }

    public int hashCode() {
        String str = this.A00;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = this.A00;
        if (str == null) {
            str = "<unknown>";
        }
        return str;
    }
}
