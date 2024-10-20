package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessageRepliedTo;

/* renamed from: X.7tu, reason: invalid class name */
/* loaded from: 7tu.class */
public final class C7tu {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7tu] */
    public static C7tu A00(Message message) {
        Integer num;
        int i;
        int intValue;
        ?? obj = new Object();
        obj.A02 = message.A1j;
        MessageRepliedTo messageRepliedTo = message.A0F;
        if (messageRepliedTo != null) {
            obj.A03 = messageRepliedTo.A09;
            obj.A00 = 1;
            Integer num2 = message.A1G;
            boolean z = false;
            if (num2 != null && ((intValue = num2.intValue()) == 7 || intValue == 12 || intValue == 16)) {
                z = true;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                obj.A00 = num2;
            }
            num = Integer.valueOf(messageRepliedTo.A05.value);
        } else {
            String str = message.A1Z;
            num = null;
            if (str == null) {
                String str2 = message.A1O;
                if (str2 != null) {
                    obj.A03 = str2;
                    i = 17;
                }
                return obj;
            }
            obj.A03 = str;
            i = 2;
            obj.A00 = Integer.valueOf(i);
        }
        obj.A01 = num;
        return obj;
    }
}
