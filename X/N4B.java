package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Calendar;

/* loaded from: N4B.class */
public final class N4B {
    public int A00;
    public int A01;
    public NAL A02;
    public ImmutableList A04;
    public boolean A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A09;
    public final 1Br A0A;
    public final C1qM A0C;
    public final 1K9 A0D;
    public final 1K9 A0E;
    public final Context A0F;
    public final FbUserSession A0G;
    public final C1qM A0H;
    public final C1qM A0I;
    public final 1Br A08 = 1Bq.A00(16477);
    public final 1Br A0B = 1Bq.A00(16456);
    public C95p A03 = C95p.A04;

    public N4B(Context context, FbUserSession fbUserSession) {
        this.A0F = context;
        this.A0G = fbUserSession;
        this.A06 = 1Lm.A00(context, fbUserSession, 82470);
        this.A07 = 1Lm.A00(context, fbUserSession, 33124);
        ImmutableList of = ImmutableList.of();
        11T.A0A(of);
        this.A04 = of;
        this.A01 = -1;
        this.A09 = 1Bq.A00(66774);
        this.A0A = 1Bq.A00(66630);
        this.A0D = new N8a(this, 0);
        this.A0E = new N8a(this, 1);
        this.A0C = new N6n(this, 3);
        this.A0H = new N6n(this, 1);
        this.A0I = new N6n(this, 2);
    }

    public static PrivacyContext A00(N4B n4b) {
        return ((AnonymousClass224) n4b.A09.A00.get()).A00(AbE.A00(228));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public static final 2FT A01(N4B n4b) {
        ?? obj = new Object();
        BDS bds = (BDS) 1Br.A0B(n4b.A06);
        int i = n4b.A00;
        PrivacyContext A00 = A00(n4b);
        N6o n6o = new N6o(obj, 4);
        1Um AQV = bds.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, n6o);
        1Um.A02(AQV, new CzW(A0Q, A00, bds, i, 6), A0Q, false);
        return 2FP.A02(new D3J(n4b, 57), (ListenableFuture) obj, 4YV.A11(n4b.A08));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public static final 2FT A02(N4B n4b) {
        ?? obj = new Object();
        BDS bds = (BDS) 1Br.A0B(n4b.A06);
        int i = n4b.A00;
        PrivacyContext A00 = A00(n4b);
        N6o n6o = new N6o(obj, 6);
        1Um AQV = bds.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, n6o);
        1Um.A02(AQV, new CzW(A0Q, A00, bds, i, 5), A0Q, false);
        return 2FP.A02(new D3J(n4b, 58), (ListenableFuture) obj, 4YV.A11(n4b.A08));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static final SettableFuture A03(N4B n4b) {
        ?? obj = new Object();
        MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(n4b.A06);
        PrivacyContext A00 = A00(n4b);
        N6o n6o = new N6o(obj, 5);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, n6o);
        1Um.A02(AQV, new N6v(11, mailboxFeature, A0Q, A00), A0Q, false);
        return obj;
    }

    public final void A04() {
        this.A03 = C95p.A04;
        this.A05 = false;
        C00i c00i = this.A07.A00;
        ((C21N) c00i.get()).A01(this.A0C);
        ((C21N) c00i.get()).A01(this.A0H);
        ((C21N) c00i.get()).A01(this.A0I);
    }

    public final void A05(int i, boolean z, int i2) {
        C21N c21n;
        C1qM c1qM;
        this.A03 = C95p.A04;
        this.A00 = i;
        this.A05 = true;
        if (i2 == 4) {
            if (((C1gb) 1Br.A0B(this.A0A)).A09()) {
                ((BDS) 1Br.A0B(this.A06)).A00(N80.A00, A00(this), 4);
                c21n = (C21N) 1Br.A0B(this.A07);
                c1qM = this.A0I;
                c21n.A00(c1qM);
                return;
            }
            MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(this.A06);
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            PrivacyContext A00 = A00(this);
            N6o n6o = new N6o(this, 7);
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0Q = 1BK.A0Q(AQV, n6o);
            1Um.A02(AQV, new N73(4, timeInMillis, mailboxFeature, A00, A0Q), A0Q, false);
        }
        if (z) {
            ((BDS) 1Br.A0B(this.A06)).A00(N80.A00, A00(this), i2);
            c21n = (C21N) 1Br.A0B(this.A07);
            c1qM = this.A0H;
            c21n.A00(c1qM);
            return;
        }
        MailboxFeature mailboxFeature2 = (MailboxFeature) 1Br.A0B(this.A06);
        long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
        PrivacyContext A002 = A00(this);
        N6o n6o2 = new N6o(this, 7);
        1Um AQV2 = mailboxFeature2.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q2 = 1BK.A0Q(AQV2, n6o2);
        1Um.A02(AQV2, new N73(4, timeInMillis2, mailboxFeature2, A002, A0Q2), A0Q2, false);
    }
}
