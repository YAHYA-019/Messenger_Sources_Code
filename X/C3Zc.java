package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.3Zc, reason: invalid class name */
/* loaded from: 3Zc.class */
public final class C3Zc implements 7NA {
    public final /* synthetic */ 37J A00;

    public C3Zc(37J r302) {
        this.A00 = r302;
    }

    public void CQM(ThreadKey threadKey) {
        9He r0 = this.A00.A01;
        if (r0 != null) {
            r0.A00.A1V(threadKey, "leave_conversation");
        }
    }
}
