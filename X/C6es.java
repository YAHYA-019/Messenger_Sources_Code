package X;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: X.6es, reason: invalid class name */
/* loaded from: 6es.class */
public abstract class C6es {
    public static final void A00(Activity activity, boolean z, boolean z2) {
        Window window;
        View findViewById;
        ViewGroup.LayoutParams layoutParams;
        if (activity == null || (window = activity.getWindow()) == null || (findViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30 || !z2) {
            0OU.A00(window, true);
            layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                throw AnonymousClass001.A0Q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else if (!z) {
            0OU.A00(window, false);
            0ND.A00(findViewById, 9qV.A00);
            return;
        } else {
            0OU.A00(window, true);
            0ND.A00(findViewById, (0NJ) null);
            layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                throw AnonymousClass001.A0Q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        findViewById.setLayoutParams(marginLayoutParams);
    }
}
