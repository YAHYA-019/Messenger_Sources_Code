package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.6kv, reason: invalid class name */
/* loaded from: 6kv.class */
public final class C6kv {
    public final C6kw A00;

    public C6kv(Context context, 2S4 r303, ThreadKey threadKey, 5Sh r305, 64W r306, 6FI r307, Capabilities capabilities, String str) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C6kw(context, r303, threadKey, r305, r306, r307, capabilities);
    }
}
