package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadJoinRequest;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: Cjf.class */
public final class Cjf implements C5xz {
    public final int A00;
    public final Object A01;

    public Cjf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C5xz
    public final void CHX(ThreadSummary threadSummary) {
        switch (this.A00) {
            case 0:
                DGn dGn = (DGn) this.A01;
                if (threadSummary != null) {
                    dGn.C4c(threadSummary);
                    return;
                } else {
                    dGn.C4C();
                    return;
                }
            case 1:
                AmK amK = (AmK) this.A01;
                amK.A0C = threadSummary;
                if (threadSummary != null) {
                    if (AbL.A1K(amK)) {
                        AmK.A08(amK);
                        return;
                    }
                    C4e c4e = (C4e) amK.A0Q.get();
                    FbUserSession fbUserSession = amK.A01;
                    fbUserSession.getClass();
                    ImmutableList immutableList = amK.A0C.AoK().A06.A02.A00;
                    ImmutableList.Builder builder = ImmutableList.builder();
                    1Du it = immutableList.iterator();
                    while (it.hasNext()) {
                        builder.m11011add((Object) ((ThreadJoinRequest) it.next()).A03);
                    }
                    c4e.A00(fbUserSession, builder.build());
                    return;
                }
                return;
            default:
                ((IDn) this.A01).A0F.A07 = threadSummary;
                return;
        }
    }
}
