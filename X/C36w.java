package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.36w, reason: invalid class name */
/* loaded from: 36w.class */
public final class C36w extends 1LH {
    public final FbUserSession A00;
    public final ThreadSummary A01;
    public final MigColorScheme A02;

    public C36w(FbUserSession fbUserSession, ThreadSummary threadSummary, MigColorScheme migColorScheme) {
        1BL.A1F(migColorScheme, fbUserSession);
        this.A02 = migColorScheme;
        this.A00 = fbUserSession;
        this.A01 = threadSummary;
    }
}
