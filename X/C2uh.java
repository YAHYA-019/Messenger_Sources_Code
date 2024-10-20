package X;

import android.os.Process;
import android.text.TextUtils;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: X.2uh, reason: invalid class name */
/* loaded from: 2uh.class */
public final class C2uh {
    public final String A00;

    public C2uh(String str) {
        this.A00 = 0Pz.A0o("UID: [", "]  PID: [", "] ", Process.myUid(), Process.myPid()).concat(str);
    }

    public static String A00(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                android.util.Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = 0Pz.A0v(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return 0Pz.A0j(str, " : ", str2);
    }

    public final void A01(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 3)) {
            android.util.Log.d("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public final void A02(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public final void A03(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            android.util.Log.i("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public final void A04(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 5)) {
            android.util.Log.w("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public final void A05(Throwable th, String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", A00(this.A00, str, objArr), th);
        }
    }
}
