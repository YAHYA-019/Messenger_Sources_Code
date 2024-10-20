package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.commmunitymessaging.role.participantmetadata.CommunityRoleParticipantMetadata;

/* renamed from: X.6ll, reason: invalid class name */
/* loaded from: 6ll.class */
public final class C6ll {
    public final 1Br A01 = 1Bu.A00(83430);
    public final 1Br A00 = 1Bu.A00(66479);

    public static final boolean A00(ThreadParticipant threadParticipant) {
        C1zL A00;
        boolean z = false;
        if (threadParticipant != null && (threadParticipant.A0F || (A00 = threadParticipant.A00()) == C1zL.A05 || A00 == C1zL.A02)) {
            z = true;
        }
        return z;
    }

    public final ThreadParticipant A01(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        11T.A0F(fbUserSession, 0);
        ThreadParticipant threadParticipant = null;
        if (threadSummary != null) {
            C00i c00i = this.A01.A00;
            if (c00i.get() != null && c00i.get() != null) {
                1Lm.A05(context, fbUserSession, 16907);
                User user = (User) c00i.get();
                if (user == null) {
                    throw 1BK.A0h();
                }
                threadParticipant = AnonymousClass242.A05(threadSummary, user.A0k);
            }
        }
        return threadParticipant;
    }

    public final boolean A02(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        11T.A0F(fbUserSession, 0);
        return A00(A01(context, fbUserSession, threadSummary));
    }

    public final boolean A03(ThreadParticipant threadParticipant) {
        this.A00.A00.get();
        boolean z = false;
        if (threadParticipant != null) {
            CommunityRoleParticipantMetadata communityRoleParticipantMetadata = (CommunityRoleParticipantMetadata) threadParticipant.A02().A00(CommunityRoleParticipantMetadata.A01);
            if ((communityRoleParticipantMetadata != null ? communityRoleParticipantMetadata.A00 : null) == 5pV.A03) {
                z = true;
            }
        }
        return z;
    }
}
