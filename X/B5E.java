package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* loaded from: B5E.class */
public final class B5E extends 3ZQ {
    public final /* synthetic */ AmD A00;

    public B5E(AmD amD) {
        this.A00 = amD;
    }

    public void CWM(C2gi c2gi, ThreadViewParams threadViewParams) {
        11T.A0F(threadViewParams, 0);
        if (c2gi == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ThreadSummary threadSummary = c2gi.A01;
        1F9 r0 = threadSummary.A0g;
        if (r0 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AmD amD = this.A00;
        CallerContext callerContext = AmD.A0V;
        C5E c5e = (C5E) 1Br.A0B(amD.A0Q);
        ThreadKey threadKey = threadViewParams.A05;
        11T.A09(threadKey);
        c5e.A00(new C5xd(amD.requireView()), r0, threadKey, threadSummary);
    }
}
