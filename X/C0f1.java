package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.0f1, reason: invalid class name */
/* loaded from: 0f1.class */
public abstract class C0f1 {
    public static volatile Application A00;
    public static volatile Context A01;

    public static final Context A00() {
        Context context = A01;
        if (context != null) {
            return context;
        }
        throw AnonymousClass001.A0N("AppContext.set has not been invoked");
    }
}
