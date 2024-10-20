package X;

import com.facebook.graphql.enums.GraphQLMessageThreadCannotReplyReason;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* renamed from: X.6lu, reason: invalid class name */
/* loaded from: 6lu.class */
public final class C6lu {
    public final 5PC A00 = (5PC) 1Bn.A0A(82526);

    public final KPP A00(ThreadSummary threadSummary, User user) {
        KPP kpp;
        if (user != null && !user.A0E()) {
            1M1 r0 = user.A0d;
            if (r0 == 1M1.A0C) {
                kpp = KPP.A06;
                return kpp;
            }
            if (r0 == 1M1.A04) {
                return KPP.A08;
            }
        }
        kpp = null;
        if (this.A00.A02()) {
            if (user != null && !user.A0E()) {
                if (user.A0o.A00.get(threadSummary == null ? 0 : 1)) {
                    return null;
                }
                return KPP.A05;
            }
            return kpp;
        }
        if (threadSummary != null) {
            GraphQLMessageThreadCannotReplyReason AbY = threadSummary.AbY();
            if (AbY != GraphQLMessageThreadCannotReplyReason.A08) {
                if (AbY == GraphQLMessageThreadCannotReplyReason.A01) {
                    return KPP.A0K;
                }
            }
            return KPP.A05;
        }
        return kpp;
    }
}
