package X;

import com.facebook.messaging.model.messages.Message;

/* renamed from: X.64c, reason: invalid class name */
/* loaded from: 64c.class */
public final class C64c {
    public static final String A00(AnonymousClass622 anonymousClass622) {
        Message message = anonymousClass622.A03;
        if (message == null) {
            return null;
        }
        String str = message.A1g;
        if (str == null) {
            str = message.A1V;
        }
        return str;
    }
}
