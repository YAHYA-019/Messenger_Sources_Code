package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.3Wj, reason: invalid class name */
/* loaded from: 3Wj.class */
public final class C3Wj implements 2oD {
    public final Context A00;
    public final FbUserSession A01;
    public final 1YC A02 = 1YC.A03;

    public C3Wj(Context context, FbUserSession fbUserSession) {
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    public String BFw(0Da r302, ThreadSummary threadSummary) {
        int A00 = 1BK.A00();
        1YC r0 = this.A02;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadtimestamp.ThreadTimestampInterfaceSpec", "messaging.threadlist.threadtimestamp.ThreadTimestampInterfaceSpec", "getTimestampString", A00);
        r0.A02((Exception) null, "messaging.threadlist.threadtimestamp.ThreadTimestampInterfaceSpec", "getTimestampString", A00);
        return null;
    }

    public C2xe BFx(0Da r302, ThreadSummary threadSummary) {
        return 1BL.A0N(this.A02, 1BK.A00());
    }
}
