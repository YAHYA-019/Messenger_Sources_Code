package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/* renamed from: X.545, reason: invalid class name */
/* loaded from: 545.class */
public final class AnonymousClass545 {
    public final 2fE A00;
    public final UserKey A01;
    public final C28o A02;
    public final 23F A03;

    public AnonymousClass545(FbUserSession fbUserSession) {
        UserKey userKey = (UserKey) 1Bn.A0E((Context) null, (1BY) null, 83438);
        C28o c28o = (C28o) 1Bi.A03(16909);
        2fE r0 = (2fE) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 17064);
        23F r02 = (23F) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 33102);
        this.A01 = userKey;
        this.A00 = r0;
        this.A02 = c28o;
        this.A03 = r02;
    }

    public static ImmutableList A00(AnonymousClass545 anonymousClass545, ThreadSummary threadSummary, boolean z) {
        ImmutableList immutableList;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (threadSummary != null && (immutableList = threadSummary.A1L) != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                String A00 = ((ThreadParticipant) it.next()).A05.A00();
                if (A00 != null && (!z || !Objects.equal(anonymousClass545.A01.id, A00))) {
                    builder.m11011add((Object) A00);
                }
            }
        }
        return builder.build();
    }

    public static ImmutableList A01(AnonymousClass545 anonymousClass545, ThreadSummary threadSummary, boolean z) {
        ImmutableList immutableList;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (threadSummary != null && (immutableList = threadSummary.A1L) != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
                UserKey A01 = C28p.A01(threadParticipant);
                if (!z || !Objects.equal(anonymousClass545.A01, A01)) {
                    builder.m11011add((Object) C28p.A01(threadParticipant));
                }
            }
        }
        return anonymousClass545.A03.A01(builder.build());
    }

    public User A02(ThreadKey threadKey) {
        if (!ThreadKey.A0j(threadKey) && !ThreadKey.A0q(threadKey)) {
            return null;
        }
        return this.A03.A00(new UserKey(1Js.A03, Long.toString(threadKey.A02)));
    }

    public boolean A03(ThreadSummary threadSummary) {
        if (threadSummary == null) {
            return false;
        }
        ImmutableList immutableList = threadSummary.A1M;
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                if (it.next() == 1Ks.A02) {
                    return true;
                }
            }
            return false;
        }
        1Du it2 = A01(this, threadSummary, true).iterator();
        while (it2.hasNext()) {
            if (((User) it2.next()).A0p == 1Ks.A02) {
                return true;
            }
        }
        return false;
    }

    public boolean A04(ImmutableList immutableList) {
        if (immutableList.isEmpty()) {
            return false;
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            if (((User) it.next()).A0p == 1Ks.A02) {
                return true;
            }
        }
        return false;
    }
}
