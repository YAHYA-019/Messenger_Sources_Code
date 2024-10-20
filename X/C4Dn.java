package X;

import android.content.Context;

/* renamed from: X.4Dn, reason: invalid class name */
/* loaded from: 4Dn.class */
public final class C4Dn {
    public final C4Do A00;

    public C4Dn(Context context, String str) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C4Do(context);
    }
}
