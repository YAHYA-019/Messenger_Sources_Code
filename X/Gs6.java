package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Set;

/* loaded from: Gs6.class */
public final class Gs6 extends C21h {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 79P A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs6(FbUserSession fbUserSession, 79P r303, SettableFuture settableFuture, String str) {
        super("sticker_search_results_query");
        this.A01 = r303;
        this.A00 = fbUserSession;
        this.A03 = str;
        this.A02 = settableFuture;
    }

    @Override // X.C21h
    public void A00(Set set) {
        79P r0 = this.A01;
        FbUserSession fbUserSession = this.A00;
        String str = this.A03;
        SettableFuture settableFuture = this.A02;
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(r0.A08, fbUserSession, 82577);
        long j = r0.A07;
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new Iaz(mailboxFeature, A0P, str, 3, j), A0P, false);
        r0.A02 = A0P.addResultCallback(new Iaj(settableFuture, r0, 28));
    }
}
