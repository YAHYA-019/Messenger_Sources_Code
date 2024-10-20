package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.google.common.collect.ImmutableList;

/* loaded from: B8B.class */
public final class B8B extends C9a {
    public B8C A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final FbUserSession A04;
    public final ThreadSummary A05;
    public final C10264sx A06;
    public final B8D A07;
    public final C1d A08;
    public final String A09;
    public final BhL A0A;

    public B8B(FbUserSession fbUserSession, ThreadSummary threadSummary, C10264sx c10264sx, BhL bhL, String str, boolean z) {
        7zR.A1O(threadSummary, str);
        1BL.A1G(c10264sx, bhL);
        this.A04 = fbUserSession;
        this.A05 = threadSummary;
        this.A09 = str;
        this.A06 = c10264sx;
        this.A0A = bhL;
        C1d c1d = new C1d(this);
        this.A08 = c1d;
        this.A07 = new B8D(fbUserSession, threadSummary, c10264sx, c1d, null, str, z);
    }

    public static final void A00(B8B b8b) {
        ThreadSummary threadSummary = b8b.A05;
        String A0y = 4YU.A0y(threadSummary.A0n);
        if (threadSummary.A2Z) {
            return;
        }
        C10264sx c10264sx = b8b.A06;
        FbUserSession fbUserSession = b8b.A04;
        Long A0n = 1BK.A0n(A0y);
        Cmq cmq = new Cmq(b8b);
        PrivacyContext A0t = AbH.A0t("AdvancedCrypto", "2971616476299527");
        Iby iby = new Iby(cmq, 22);
        C00683ob c00683ob = (C00683ob) 4YU.A0o(fbUserSession, c10264sx.A02, 67629);
        1Um A0O = 1BK.A0O(c00683ob, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new Czi(A0P, A0t, c00683ob, A0n, 14), A0P, false);
        A0P.addResultCallback(iby);
    }

    @Override // X.C9a
    public void A04(Bundle bundle) {
        B8C b8c = this.A00;
        if (b8c != null) {
            b8c.A04(bundle);
        }
        this.A07.A04(bundle);
    }

    @Override // X.C9a
    public void A05(Bundle bundle) {
        11T.A0F(bundle, 0);
        B8C b8c = this.A00;
        if (b8c != null) {
            b8c.A05(bundle);
        }
        this.A07.A05(bundle);
    }

    @Override // X.C9a
    public void A06(ImmutableList immutableList) {
        if (immutableList.isEmpty() && this.A00 == null) {
            A00(this);
            return;
        }
        super.A06(immutableList);
        BhL bhL = this.A0A;
        ImmutableList immutableList2 = super.A00;
        AmA amA = bhL.A00;
        amA.A0D.Ciz(new D8M(amA, immutableList2));
    }
}
