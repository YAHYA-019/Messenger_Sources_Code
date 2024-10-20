package X;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: C09.class */
public final class C09 {
    public final Context A00 = 7zP.A0J();

    public void A00() {
        Context context = this.A00;
        String string = context.getResources().getString(2131957317);
        if (TextUtils.isEmpty(string)) {
            A00();
            return;
        }
        C2121Dea c2121Dea = new C2121Dea(context);
        c2121Dea.A0A(string);
        c2121Dea.A0H(CSG.A00(this, 31), context.getResources().getString(2131953645));
        c2121Dea.A0C(true);
        c2121Dea.A04();
    }
}
