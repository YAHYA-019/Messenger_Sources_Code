package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* renamed from: X.28m, reason: invalid class name */
/* loaded from: 28m.class */
public final class C28m {
    public final 23F A00;
    public final C28o A01 = (C28o) 1Bi.A03(16909);

    public C28m(FbUserSession fbUserSession) {
        this.A00 = (23F) 1Lo.A06(fbUserSession, 33102);
    }

    public String A00(ParticipantInfo participantInfo) {
        User A00;
        UserKey userKey = participantInfo.A0F;
        String A002 = (userKey == null || (A00 = this.A00.A00(userKey)) == null) ? participantInfo.A09.A00 : A00.A0X.A00();
        if (A002 == null) {
            A002 = participantInfo.A08.A00;
        }
        return A002;
    }

    public String A01(ParticipantInfo participantInfo) {
        UserKey userKey = participantInfo.A0F;
        String A03 = this.A01.A03(userKey != null ? this.A00.A00(userKey) : null);
        if (1JF.A0B(A03)) {
            A03 = participantInfo.A09.A00;
        }
        return A03;
    }

    public String A02(ParticipantInfo participantInfo, boolean z) {
        UserKey userKey = participantInfo.A0F;
        String A04 = this.A01.A04(userKey != null ? this.A00.A00(userKey) : null, z);
        if (1JF.A0B(A04)) {
            A04 = participantInfo.A09.A00;
        }
        return A04;
    }
}
