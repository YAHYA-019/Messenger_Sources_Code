package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Locale;

/* loaded from: Krm.class */
public final class Krm {
    public final int A00;
    public final String A01;
    public final String A02;
    public final KRV A03;

    /* JADX WARN: Type inference failed for: r0v21, types: [X.KRV, java.lang.Object] */
    public Krm(String str, String... strArr) {
        String A0d;
        if (strArr.length == 0) {
            A0d = "";
        } else {
            StringBuilder A0u = 7zR.A0u();
            String str2 = strArr[0];
            if (A0u.length() > 1) {
                A0u.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            A0u.append(str2);
            A0d = AnonymousClass001.A0d("] ", A0u);
        }
        this.A02 = A0d;
        this.A01 = str;
        ?? obj = new Object();
        int length = str.length();
        boolean z = false;
        Object[] A1b = AnonymousClass001.A1b(str, 23);
        if (!(length <= 23 ? true : z)) {
            throw 1BK.A0f("tag \"%s\" is longer than the %d character maximum", A1b);
        }
        this.A03 = obj;
        int i = 2;
        while (!android.util.Log.isLoggable(this.A01, i)) {
            i++;
            if (i > 7) {
                break;
            }
        }
        this.A00 = i;
    }

    public void A00(String str) {
        if (this.A00 <= 3) {
            android.util.Log.d(this.A01, this.A02.concat(str));
        }
    }

    public void A01(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        android.util.Log.w("Auth", this.A02.concat(str));
    }
}
