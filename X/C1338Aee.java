package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aee, reason: case insensitive filesystem */
/* loaded from: Aee.class */
public final class C1338Aee implements DGq {
    public final /* synthetic */ C1337Aed A00;

    public C1338Aee(C1337Aed c1337Aed) {
        this.A00 = c1337Aed;
    }

    @Override // X.DGq
    public void AS4() {
        MailboxFeature mailboxFeature;
        C1337Aed c1337Aed = this.A00;
        C1337Aed.A00(c1337Aed, true);
        C00i c00i = c1337Aed.A0E.A00;
        MailboxFeature mailboxFeature2 = (MailboxFeature) c00i.get();
        if (mailboxFeature2 != null) {
            long A0r = c1337Aed.A0N.A0r();
            1Um AQV = mailboxFeature2.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, Czf.A00(mailboxFeature2, A0P, 11, A0r), A0P, false);
        }
        if (!AbK.A0o(c1337Aed.A07).AZk(36319424570996801L) || (mailboxFeature = (MailboxFeature) c00i.get()) == null) {
            return;
        }
        C0ty c0ty = C0ty.A00;
        long A0r2 = c1337Aed.A0N.A0r();
        1Um AQV2 = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P2 = 1BK.A0P(AQV2);
        1Um.A02(AQV2, new Czh(6, A0r2, A0P2, mailboxFeature, c0ty), A0P2, false);
    }

    @Override // X.DGq
    public void C8r(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        C1337Aed c1337Aed = this.A00;
        c1337Aed.A0R.set(immutableList);
        7zP.A0O(c1337Aed.A0D).A00(c1337Aed, new C1339Aef(AbU.A05, immutableList));
    }
}
