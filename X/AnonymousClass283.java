package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.283, reason: invalid class name */
/* loaded from: 283.class */
public abstract class AnonymousClass283 extends AnonymousClass285 {
    public 2AE A01(Context context, Looper looper, 2A4 r304, 2A6 r305, 2A9 r306, Object obj) {
        return A02(context, looper, r304, r305, r306, obj);
    }

    public 2AE A02(Context context, Looper looper, 2A5 r304, 2A7 r305, 2A9 r306, Object obj) {
        if (this instanceof AnonymousClass282) {
            return new 2AC(context, looper, r304, r305, r306, 258);
        }
        throw AnonymousClass001.A0q("buildClient must be implemented");
    }
}
