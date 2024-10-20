package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: C3c.class */
public final class C3c {
    public final C00i A00 = 1BQ.A02(33215);
    public final C00i A01 = AbH.A0X();
    public final C00i A02 = 1BV.A00(116247);

    public void A00(Context context, String str, String str2) {
        if (context == null || !C1gb.A01(this.A01).AZk(36315254159843954L)) {
            return;
        }
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("session_id", str);
        A0u.put("user_id", str2);
        ((2ZM) this.A00.get()).A01(context, new DLK(A0u), (GIf) this.A02.get(), "265189671959136");
    }
}
