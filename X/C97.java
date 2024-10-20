package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: C97.class */
public final class C97 {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A06;

    public C97(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A04 = fbUserSession;
        this.A05 = AbG.A0K();
        this.A06 = AbG.A0U();
        this.A00 = -1;
    }

    public final void A00() {
        String str;
        try {
            MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A06(this.A04, 84155);
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            Czj.A01(AQV, 1BK.A0P(AQV), mailboxFeature, 10);
            A01(0);
            this.A02 = true;
        } catch (InterruptedException e) {
            e = e;
            str = "InterruptedException while incrementing the NUX counter.";
            0fH.A0s("NUXUniversalSearchNullState", str, e);
        } catch (ExecutionException e2) {
            e = e2;
            str = "ExecutionException while incrementing the NUX counter.";
            0fH.A0s("NUXUniversalSearchNullState", str, e);
        }
    }

    public final void A01(int i) {
        SettableFuture A0j = 4YU.A0j();
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A06(this.A04, 84155);
        Czk czk = new Czk(A0j, ActionId.DATA_LOAD_START);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, czk);
        1Um.A02(AQV, new Cxo(i, 2, mailboxFeature, A0Q), A0Q, false);
        A0j.addListener(new D9N(this, A0j, i), 4YV.A11(this.A05));
    }

    public final void A02(int i) {
        String str;
        String str2;
        int i2 = 1;
        this.A03 = true;
        int i3 = this.A01;
        if (i3 < i) {
            if (this.A00 == -1) {
                if (i3 != -1) {
                    i2 = i3 + 1;
                }
                try {
                    MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A06(this.A04, 84155);
                    PrivacyContext A00 = AbJ.A0p(this.A06).A00("2971616476299527");
                    1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P = 1BK.A0P(AQV);
                    1Um.A02(AQV, new CzW(i2, 0, A0P, mailboxFeature, A00), A0P, false);
                    A01(1);
                } catch (InterruptedException e) {
                    e = e;
                    str2 = "InterruptedException while setting the firstInteractedWithNux value.";
                    0fH.A0s("NUXUniversalSearchNullState", str2, e);
                    MailboxFeature mailboxFeature2 = (MailboxFeature) 1Lm.A06(this.A04, 84155);
                    PrivacyContext A002 = AbJ.A0p(this.A06).A00("2971616476299527");
                    1Um AQV2 = mailboxFeature2.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P2 = 1BK.A0P(AQV2);
                    1Um.A02(AQV2, Czg.A00(mailboxFeature2, A002, A0P2, 11), A0P2, false);
                    this.A01 = -1;
                } catch (ExecutionException e2) {
                    e = e2;
                    str2 = "ExecutionException while setting the firstInteractedWithNux value.";
                    0fH.A0s("NUXUniversalSearchNullState", str2, e);
                    MailboxFeature mailboxFeature22 = (MailboxFeature) 1Lm.A06(this.A04, 84155);
                    PrivacyContext A0022 = AbJ.A0p(this.A06).A00("2971616476299527");
                    1Um AQV22 = mailboxFeature22.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P22 = 1BK.A0P(AQV22);
                    1Um.A02(AQV22, Czg.A00(mailboxFeature22, A0022, A0P22, 11), A0P22, false);
                    this.A01 = -1;
                }
            }
            try {
                MailboxFeature mailboxFeature222 = (MailboxFeature) 1Lm.A06(this.A04, 84155);
                PrivacyContext A00222 = AbJ.A0p(this.A06).A00("2971616476299527");
                1Um AQV222 = mailboxFeature222.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0P222 = 1BK.A0P(AQV222);
                1Um.A02(AQV222, Czg.A00(mailboxFeature222, A00222, A0P222, 11), A0P222, false);
                this.A01 = -1;
            } catch (InterruptedException e3) {
                e = e3;
                str = "InterruptedException while clearing the NUX counter.";
                0fH.A0s("NUXUniversalSearchNullState", str, e);
            } catch (ExecutionException e4) {
                e = e4;
                str = "ExecutionException while clearing the NUX counter.";
                0fH.A0s("NUXUniversalSearchNullState", str, e);
            }
        }
    }
}
