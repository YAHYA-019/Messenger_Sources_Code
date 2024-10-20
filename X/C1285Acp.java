package X;

import com.facebook.messaging.communitymessaging.model.Community;
import java.lang.ref.WeakReference;

/* renamed from: X.Acp, reason: case insensitive filesystem */
/* loaded from: Acp.class */
public final class C1285Acp implements MFT {
    public final /* synthetic */ 6Hj A00;

    public C1285Acp(6Hj r302) {
        this.A00 = r302;
    }

    public final void CHT(Community community) {
        Long l;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Sends blocked until = ");
        0fH.A0j("MutedMemberComposerPresenter", AnonymousClass001.A0a(community != null ? community.A0Q : null, A0k));
        if (community == null || (l = community.A0Q) == null) {
            return;
        }
        long longValue = l.longValue();
        6Hj r0 = this.A00;
        if (longValue <= 4YU.A06(7zR.A0G().now()) && longValue != -1) {
            r0.A02 = 1BK.A0d();
            return;
        }
        Boolean bool = r0.A02;
        Boolean A0K = AnonymousClass001.A0K();
        if (11T.A0O(bool, A0K)) {
            return;
        }
        r0.A02 = A0K;
        6Hj.A01(r0);
        WeakReference weakReference = r0.A03;
        if (weakReference == null) {
            11T.A0L("asyncHintCardListener");
            throw 0Q8.createAndThrow();
        }
        6F7 r02 = (6F7) weakReference.get();
        if (r02 != null) {
            r02.A00();
        }
    }
}
