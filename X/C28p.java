package X;

import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* renamed from: X.28p, reason: invalid class name */
/* loaded from: 28p.class */
public abstract class C28p {
    public static final ThreadParticipant A00(User user) {
        11T.A0F(user, 0);
        ParticipantInfo participantInfo = new ParticipantInfo(user);
        C1zJ c1zJ = new C1zJ();
        c1zJ.A01(participantInfo);
        return new ThreadParticipant(c1zJ);
    }

    public static final UserKey A01(ThreadParticipant threadParticipant) {
        11T.A0F(threadParticipant, 0);
        UserKey userKey = threadParticipant.A05.A0F;
        11T.A09(userKey);
        return userKey;
    }

    public static final String A02(ThreadParticipant threadParticipant) {
        11T.A0F(threadParticipant, 0);
        return threadParticipant.A05.A09.A00;
    }

    public static final String A03(ThreadParticipant threadParticipant) {
        11T.A0F(threadParticipant, 0);
        String A00 = threadParticipant.A05.A00();
        11T.A0D(A00);
        return A00;
    }

    public static final boolean A04(ThreadParticipant threadParticipant) {
        11T.A0F(threadParticipant, 0);
        boolean z = false;
        if (threadParticipant.A05.A07 == 1Kq.A04) {
            z = true;
        }
        return z;
    }
}
