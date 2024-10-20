package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: B59.class */
public final class B59 extends BlP {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ CHD A01;
    public final /* synthetic */ ThreadSummary A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B59(FbUserSession fbUserSession, CHD chd, ThreadSummary threadSummary, String str) {
        super(chd, str);
        this.A01 = chd;
        this.A02 = threadSummary;
        this.A00 = fbUserSession;
        11T.A0D(str);
    }
}
