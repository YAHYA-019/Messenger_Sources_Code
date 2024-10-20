package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.1ya, reason: invalid class name */
/* loaded from: 1ya.class */
public final class C1ya {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;

    public C1ya(FbUserSession fbUserSession) {
        Integer num = 1Lo.A05;
        this.A00 = new 1MV(fbUserSession, (1BY) null, 33111);
        this.A02 = new 1MV(fbUserSession, (1BY) null, 82812);
        this.A01 = new 1MV(fbUserSession, (1BY) null, 16887);
    }

    public C1yc A00(int i) {
        C00i c00i;
        if (i == 4096) {
            c00i = this.A00;
        } else if (i == 1024) {
            c00i = this.A02;
        } else {
            if (i != 0) {
                throw AnonymousClass001.A0q(0Pz.A0T("no translator for mailboxType ", i));
            }
            c00i = this.A01;
        }
        return (C1yc) c00i.get();
    }

    public C1yc A01(ThreadKey threadKey) {
        C00i c00i;
        if (threadKey.A12()) {
            c00i = this.A00;
        } else if (threadKey.A19()) {
            c00i = this.A02;
        } else {
            if (!ThreadKey.A0k(threadKey) && !ThreadKey.A0a(threadKey) && !ThreadKey.A0c(threadKey) && !threadKey.A1E() && !ThreadKey.A0R(threadKey)) {
                throw 1BL.A0y(threadKey, "no translator for threadKey type ", AnonymousClass001.A0k());
            }
            c00i = this.A01;
        }
        return (C1yc) c00i.get();
    }
}
