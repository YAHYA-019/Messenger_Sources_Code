package X;

import android.content.Context;

/* renamed from: X.1v2, reason: invalid class name */
/* loaded from: 1v2.class */
public final class C1v2 {
    public final C1v3 A00;

    public C1v2(Context context, long j, String str) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C1v3(context, j);
    }
}
