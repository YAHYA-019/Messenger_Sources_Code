package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.user.model.UserKey;

/* renamed from: X.7u0, reason: invalid class name */
/* loaded from: 7u0.class */
public final class C7u0 {
    public final long A00;
    public final ThreadKey A01;
    public final ThreadParticipant A02;
    public final UserKey A03;
    public final UserKey A04;
    public final Integer A05;
    public final Integer A06;

    public C7u0(ThreadKey threadKey, ThreadParticipant threadParticipant, Integer num) {
        this.A01 = threadKey;
        this.A02 = threadParticipant;
        this.A06 = num;
        this.A04 = null;
        this.A00 = 0L;
        this.A03 = null;
        this.A05 = null;
    }

    public C7u0(ThreadKey threadKey, UserKey userKey, UserKey userKey2, Integer num, long j) {
        this.A01 = threadKey;
        this.A04 = userKey;
        this.A06 = 0S2.A0C;
        this.A02 = null;
        this.A00 = j;
        this.A03 = userKey2;
        this.A05 = num;
    }
}
