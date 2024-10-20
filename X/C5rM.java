package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.user.model.UserKey;

/* renamed from: X.5rM, reason: invalid class name */
/* loaded from: 5rM.class */
public final class C5rM {
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.9Aa] */
    public static 9Zt A00(Message message) {
        5Pm r0;
        6Ay BCm;
        if (message.A04() != C1q8.A07 || (r0 = message.A08) == null || (BCm = r0.BCm()) == null) {
            return null;
        }
        UserKey userKey = (UserKey) 1Bn.A0A(83436);
        ?? obj = new Object();
        ((9Aa) obj).A00 = userKey;
        obj.A00(BCm.AXb());
        return new 9Zt((9Aa) obj);
    }
}
