package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* renamed from: X.60d, reason: invalid class name */
/* loaded from: 60d.class */
public final class C60d {
    public 1BY A00;
    public final 1WY A01 = (1WY) 1Bi.A03(66481);
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final boolean A05;

    public C60d(1BO r302, FbUserSession fbUserSession) {
        1BQ r0 = new 1BQ(16909);
        this.A04 = r0;
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A02 = new 1MV(fbUserSession, (1BY) null, 16908);
        this.A03 = new 1MV(fbUserSession, (1BY) null, 16907);
        this.A05 = C28o.A02((C28o) r0.get());
    }

    public static String A00(ParticipantInfo participantInfo, ThreadSummary threadSummary, C60d c60d) {
        String str = null;
        if (participantInfo != null) {
            str = ((AnonymousClass242) c60d.A03.get()).A0D(threadSummary, participantInfo.A0F.id);
            if (str == null) {
                str = ((C28m) c60d.A02.get()).A02(participantInfo, c60d.A05);
            }
        }
        return str;
    }

    public String A01(ThreadSummary threadSummary, User user) {
        String A0D = ((AnonymousClass242) this.A03.get()).A0D(threadSummary, user.A0k.id);
        if (A0D == null) {
            A0D = ((C28o) this.A04.get()).A04(user, this.A05);
        }
        return A0D;
    }
}
