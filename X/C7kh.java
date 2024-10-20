package X;

import com.facebook.messaging.model.messages.Message;

/* renamed from: X.7kh, reason: invalid class name */
/* loaded from: 7kh.class */
public abstract class C7kh {
    public static final boolean A00(Message message) {
        String str;
        String str2;
        String str3 = message.A1m;
        boolean z = false;
        if (str3 != null && !0CU.A0O(str3) && (str = message.A1n) != null && !0CU.A0O(str) && (str2 = message.A0E().A00) != null && !0CU.A0O(str2)) {
            z = true;
        }
        return z;
    }
}
