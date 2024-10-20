package X;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.016, reason: invalid class name */
/* loaded from: 016.class */
public abstract class AnonymousClass016 {
    public static Context A00(Context context, Class cls) {
        Context baseContext;
        while (!cls.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return context;
    }
}
