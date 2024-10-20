package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;

/* loaded from: C3u.class */
public final class C3u {
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 67784);
    public final C00i A01 = 1BV.A01((1BY) null, 16979);

    public C3u(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(Context context, String str) {
        View findViewById;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getWindow() == null || (findViewById = activity.getWindow().getDecorView().findViewById(R.id.content)) == null) {
                return;
            }
            ((6LF) this.A02.get()).A02(findViewById, 7zM.A11(this.A01), str);
        }
    }
}
