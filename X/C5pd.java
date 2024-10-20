package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator;

/* renamed from: X.5pd, reason: invalid class name */
/* loaded from: 5pd.class */
public final class C5pd {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03 = new 1BQ(66584);
    public final C00i A04;
    public final C00i A05;

    public C5pd(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A05 = new 1MV(fbUserSession, (1BY) null, 82811);
        this.A01 = new 1MV(fbUserSession, (1BY) null, 148098);
        this.A04 = new 1MV(fbUserSession, (1BY) null, 49842);
        this.A02 = new 1MV(fbUserSession, (1BY) null, 49841);
    }

    public AbstractMsysMessagesCollectionTranslator A00(ThreadKey threadKey) {
        C00i c00i;
        if (threadKey.A12()) {
            c00i = this.A01;
        } else if (threadKey.A19()) {
            c00i = this.A05;
        } else {
            boolean A0a = ThreadKey.A0a(threadKey);
            if ((A0a || ThreadKey.A0c(threadKey)) && 1Ux.A00((1Ux) this.A03.get()).AZk(36318698721522602L)) {
                c00i = this.A02;
            } else {
                if (!ThreadKey.A0k(threadKey) && !A0a && !ThreadKey.A0c(threadKey) && !ThreadKey.A0R(threadKey)) {
                    throw AnonymousClass001.A0q("No MessagesCollection translator available for the thread.");
                }
                c00i = this.A04;
            }
        }
        return (AbstractMsysMessagesCollectionTranslator) c00i.get();
    }
}
