package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.61v, reason: invalid class name */
/* loaded from: 61v.class */
public final class C61v {
    public static final C61x A00(Message message) {
        Object obj;
        11T.A0F(message, 0);
        ThreadKey threadKey = message.A0V;
        if (threadKey != null) {
            if (threadKey.A1B()) {
                obj = 1Bi.A03(67987);
            } else if (threadKey.A18() || threadKey.A15()) {
                obj = 1Lm.A06(((1Fv) 1Bi.A03(66351)).A04(), 66237);
            }
            return (C61x) obj;
        }
        obj = new Object();
        return (C61x) obj;
    }
}
