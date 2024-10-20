package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessageRepliedTo;

/* renamed from: X.63b, reason: invalid class name */
/* loaded from: 63b.class */
public abstract class C63b {
    public static final boolean A00(Message message) {
        MessageRepliedTo messageRepliedTo = message.A0F;
        boolean z = false;
        if ((messageRepliedTo != null ? messageRepliedTo.A05 : null) == C63c.A02) {
            z = true;
        }
        return z;
    }
}
