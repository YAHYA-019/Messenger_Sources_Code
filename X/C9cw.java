package X;

import android.content.Intent;
import com.facebook.messaging.memories.model.MemoryMessageContext;
import java.util.ArrayList;

/* renamed from: X.9cw, reason: invalid class name */
/* loaded from: 9cw.class */
public abstract class C9cw {
    public static Object A00(Intent intent, Class cls, String str) {
        return intent.getParcelableExtra(str, cls);
    }

    public static ArrayList A01(Intent intent) {
        return intent.getParcelableArrayListExtra("template_context_messages", MemoryMessageContext.class);
    }
}
