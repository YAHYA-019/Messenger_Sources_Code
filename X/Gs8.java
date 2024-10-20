package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Set;

/* loaded from: Gs8.class */
public final class Gs8 extends C21h {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs8(FbUserSession fbUserSession, 79P r303, SettableFuture settableFuture, String str) {
        super("sticker_search_status_query");
        this.A01 = fbUserSession;
        this.A03 = r303;
        this.A04 = str;
        this.A02 = settableFuture;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs8(FbUserSession fbUserSession, 79V r303, SettableFuture settableFuture, String str) {
        super("gif_search_status_query");
        this.A01 = fbUserSession;
        this.A03 = r303;
        this.A04 = str;
        this.A02 = settableFuture;
    }

    @Override // X.C21h
    public void A00(Set set) {
        if (this.A00 == 0) {
            FbUserSession fbUserSession = (FbUserSession) this.A01;
            79V r0 = (79V) this.A03;
            MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(r0.A04, fbUserSession, 84157);
            String str = this.A04;
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, new Iar(mailboxFeature, A0P, str, 3), A0P, false);
            r0.A02 = A0P.addResultCallback(new Ib6(fbUserSession, r0, this.A02, str, 2));
            return;
        }
        FbUserSession fbUserSession2 = (FbUserSession) this.A01;
        79P r02 = (79P) this.A03;
        MailboxFeature mailboxFeature2 = (MailboxFeature) 1Lm.A05(r02.A08, fbUserSession2, 82577);
        String str2 = this.A04;
        boolean z = r02.A0D;
        1Um AQV2 = mailboxFeature2.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P2 = 1BK.A0P(AQV2);
        1Um.A02(AQV2, new Ib0(A0P2, mailboxFeature2, str2, 1, z), A0P2, false);
        r02.A03 = A0P2.addResultCallback(new Ib6(fbUserSession2, r02, this.A02, str2, 5));
    }
}
