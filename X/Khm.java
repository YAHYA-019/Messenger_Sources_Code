package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.ExecutorService;

/* loaded from: Khm.class */
public final class Khm {
    public KXN A00;
    public ExecutorService A01;

    public static Activity A00(Context context, Khm khm) {
        Activity activity = null;
        if (context != null && (context instanceof ContextWrapper)) {
            if (!(context instanceof Activity)) {
                return A00(((ContextWrapper) context).getBaseContext(), khm);
            }
            activity = (Activity) context;
        }
        return activity;
    }
}
