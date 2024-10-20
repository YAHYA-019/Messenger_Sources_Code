package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6nO, reason: invalid class name */
/* loaded from: 6nO.class */
public final class C6nO {
    public final 1Br A02 = 1Bq.A00(83604);
    public final 1Br A00 = 1Bq.A00(67347);
    public final 1Br A01 = 1Bu.A00(114756);

    public static final boolean A00(C6nO c6nO, Message message) {
        ParticipantInfo participantInfo;
        if (c6nO.A02.A00.get() != C0et.A0P || message.A22) {
            return false;
        }
        if ((C1q7.A08(message) && (participantInfo = message.A0K) != null && participantInfo.A07 == 1Kq.A04 && !1Br.A07(((HRN) 1Br.A0B(c6nO.A01)).A00).AZk(36313119559522058L)) || message.A04() != C1q8.A0N) {
            return false;
        }
        ThreadKey threadKey = message.A0V;
        if (ThreadKey.A0q(threadKey) || C1q7.A0V(message) || C1q7.A0n(message) || C1q7.A0G(message) || C1q7.A0h(message)) {
            return false;
        }
        5yW r0 = (5yW) c6nO.A00.A00.get();
        Integer A0M = ThreadKey.A0M(threadKey);
        11T.A0A(A0M);
        if (r0.A03(A0M)) {
            return false;
        }
        return !C63b.A00(message);
    }
}
