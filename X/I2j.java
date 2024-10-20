package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.user.model.User;

/* loaded from: I2j.class */
public final class I2j {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final Hdw A08;
    public final Gs9 A09;
    public final User A0A;

    public I2j(Context context, FbUserSession fbUserSession, User user, int i) {
        this.A02 = context;
        this.A0A = user;
        this.A01 = i;
        this.A04 = 1Bu.A01(context, 147608);
        this.A05 = 1Lm.A00(context, fbUserSession, 16686);
        this.A07 = 1Lm.A00(context, fbUserSession, 67537);
        1Br.A0C(this.A04);
        this.A08 = new Hdw(context, user, i);
        this.A03 = 7zM.A0Q();
        this.A06 = 1Bq.A00(66774);
        this.A09 = new Gs9(this);
    }

    public static final void A00(I2j i2j) {
        if (i2j.A00) {
            0fH.A0j("HideContactListener", "removeStoreProcedureChangeListener");
            C21S.A01(i2j.A09, (1Uj) 1Br.A0B(i2j.A05));
            i2j.A00 = false;
        }
    }

    public final void A01() {
        0fH.A0j("HideContactListener", "process");
        MailboxFeature A0d = 7zP.A0d(this.A07);
        long A03 = AbG.A03(this.A0A.A13);
        int i = this.A01;
        PrivacyContext A00 = ((AnonymousClass224) 1Br.A0B(this.A06)).A00("335567417973647");
        Iby iby = new Iby(this, 9);
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, iby);
        1Um.A02(AQV, new IbK(i, 5, A03, A0d, A00, A0Q), A0Q, false);
    }
}
