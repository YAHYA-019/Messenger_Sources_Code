package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;

/* renamed from: X.7kv, reason: invalid class name */
/* loaded from: 7kv.class */
public abstract class C7kv {
    public static Message A00(Message message, C5fv c5fv, String str) {
        5uQ AxW = c5fv.AxW(5mB.A00);
        ParticipantInfo participantInfo = message.A0K;
        if ((participantInfo != null && !participantInfo.A0F.id.equals(str)) || (AxW != null && AxW.A04)) {
            5PI r0 = new 5PI(message);
            r0.A20 = true;
            String str2 = null;
            r0.A1T = AxW != null ? AxW.A02 : null;
            if (AxW != null) {
                str2 = AxW.A03;
            }
            r0.A1U = str2;
            message = 4YU.A0U(r0);
        }
        return message;
    }
}
