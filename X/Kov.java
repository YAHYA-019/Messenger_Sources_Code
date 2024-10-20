package X;

import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: Kov.class */
public final class Kov {
    public final String A00;

    public Kov(String str) {
        this.A00 = JQz.A0o(str);
    }

    public final void A00(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            String str2 = this.A00;
            if (objArr.length > 0) {
                try {
                    str = String.format(Locale.US, str, objArr);
                } catch (IllegalFormatException e) {
                    str = JQz.A0s(str, e, objArr);
                }
            }
            android.util.Log.i("PlayCore", 0Pz.A0j(str2, " : ", str));
        }
    }
}
