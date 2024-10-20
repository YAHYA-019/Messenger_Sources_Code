package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C9Z.class */
public final class C9Z {
    public 1BY A00;
    public 6Hx A01;
    public DHT A02;
    public DHU A03;
    public final View.OnClickListener A04;
    public final FbUserSession A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C8o A09;
    public final Buy A0A;
    public final C5xv A0C;
    public final boolean A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final AeL A0H;
    public final B7r A0J = new Object();
    public final B7q A0I = new Object();
    public final 2KE A0B = 2KE.A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.B7r] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.B7q] */
    public C9Z(FbUserSession fbUserSession, 1BO r303, AeL aeL, C8o c8o) {
        1BV A01 = 1BV.A01((1BY) null, 941);
        this.A0E = A01;
        this.A00 = 7zL.A0Q(r303);
        1BV A012 = 1BV.A01((1BY) null, 83719);
        this.A06 = A012;
        this.A05 = fbUserSession;
        this.A0F = AbF.A0Q((Context) A012.get(), 33246);
        1BQ A0X = AbH.A0X();
        this.A0G = A0X;
        this.A09 = c8o;
        this.A0H = aeL;
        this.A07 = 1BV.A01((1BY) null, 67874);
        this.A0C = CxE.A00(this, 83);
        this.A04 = CZF.A00(this, 63);
        C1F6 c1f6 = (C1F6) A01.get();
        Context A04 = AbF.A04((1BY) null);
        Context A013 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            Buy buy = new Buy(A04, fbUserSession, AbG.A0H(c1f6), c8o);
            1Bn.A0K();
            FbInjector.A04(A013);
            this.A0A = buy;
            if (AbJ.A0f(A0X).AZk(36318088837214284L)) {
                this.A01 = (6Hx) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84247);
            }
            this.A0D = AbJ.A0f(A0X).AZk(36316684382710203L);
            this.A08 = AbF.A0B(fbUserSession, (1BY) null, 49481);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A013);
            throw th;
        }
    }

    public 8Zh A00(1Iw r302, Integer num, Integer num2) {
        1BY r0 = this.A00;
        EC2 A01 = ((CFx) 1Bn.A0E((Context) null, r0, 67680)).A01(r302.A0D, new CYr(22, this, num, num2), (MigColorScheme) 1Bn.A0E((Context) null, r0, 16979));
        C00i c00i = this.A06;
        Context A04 = 1BK.A04(c00i);
        boolean A1W = 1BL.A1W(num, A04);
        Integer num3 = 0S2.A01;
        int i = 2131967612;
        if (num == num3) {
            i = 2131966674;
        }
        String A16 = AbG.A16(A04, i);
        Context A042 = 1BK.A04(c00i);
        11T.A0G(A16, A1W ? 1 : 0, A042);
        0Dc A0P = 7zP.A0P(A042);
        A0P.A04(A01, 33);
        SpannableString A0A = 7zS.A0A(A0P, A16);
        Context A043 = 1BK.A04(c00i);
        11T.A0F(A043, A1W ? 1 : 0);
        int i2 = 2131967613;
        if (num == num3) {
            i2 = 2131966675;
        }
        return new 8Zh((LiveData) null, (MigColorScheme) 1Bn.A0E((Context) null, r0, 16979), A0A, AbG.A16(A043, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ac, code lost:
    
        if (r303.A0n.A0y() == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x042e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass544 A01(X.1Iw r302, com.facebook.messaging.model.threads.ThreadSummary r303, com.facebook.messaging.search.lists.model.MessageSearchMessageModel r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9Z.A01(X.1Iw, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.messaging.search.lists.model.MessageSearchMessageModel, java.lang.String):X.544");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0258, code lost:
    
        if (r317 == null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r319v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.55L A02(X.2YJ r302, com.facebook.messaging.search.lists.model.MessageSearchThreadModel r303, java.lang.String r304, int r305) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9Z.A02(X.2YJ, com.facebook.messaging.search.lists.model.MessageSearchThreadModel, java.lang.String, int):X.55L");
    }

    public void A03(ThreadSummary threadSummary, String str) {
        DHT dht;
        6Hx r0 = this.A01;
        if (r0 == null || (dht = this.A02) == null || r0.A02 == null) {
            return;
        }
        ImmutableList Ben = this.A0I.Ben(dht.AqG());
        ArrayList A10 = 1BL.A10(Ben);
        1Du it = Ben.iterator();
        while (it.hasNext()) {
            C2U c2u = (C2U) it.next();
            A10.add(new C1765Arz(threadSummary, 0S2.A01, null, null, c2u.A00, c2u.A01, str));
        }
        r0.A06(A10);
    }

    public void A04(MessageSearchThreadModel messageSearchThreadModel, String str) {
        DHU dhu = this.A03;
        if (dhu == null || dhu.AqG() == null) {
            return;
        }
        ImmutableList Ben = this.A0J.Ben(this.A03.AqG());
        if (Ben.isEmpty()) {
            return;
        }
        AcP acP = (AcP) 1Lo.A04((Context) null, this.A05, this.A00, 84248);
        if (this.A0D && acP.A0G.A03) {
            Cpf cpf = new Cpf("message_search");
            if (acP.A0K) {
                CQb cQb = (CQb) acP.A0D.get();
                FbUserSession fbUserSession = acP.A07;
                if (cQb.A03 == null) {
                    cQb.A03 = fbUserSession;
                }
                AnonymousClass545 anonymousClass545 = (AnonymousClass545) 1Lo.A04((Context) null, fbUserSession, cQb.A04, 49481);
                1Du it = Ben.iterator();
                while (it.hasNext()) {
                    C4U c4u = (C4U) it.next();
                    ThreadSummary threadSummary = c4u.A00;
                    boolean A03 = anonymousClass545.A03(threadSummary);
                    String A17 = messageSearchThreadModel != null ? AbK.A17(messageSearchThreadModel.A02) : null;
                    ThreadKey threadKey = threadSummary.A0n;
                    String A0w = 1BK.A0w(threadKey);
                    53N A01 = 53N.A01(threadSummary);
                    String obj = C6pc.A00(threadKey).toString();
                    Integer num = c4u.A02;
                    CQb.A07(cQb, (RankingLoggingItem) null, ClientDataSourceIdentifier.A0i, A01, (BP5) null, cpf, cpf, (Integer) null, (Integer) null, (Long) null, str, A17, A0w, obj, (String) null, (String) null, num == null ? 0 : num.intValue(), num == null ? 0 : num.intValue(), 0, A03, false, false);
                }
            }
        }
        6Hx r0 = this.A01;
        if (r0 == null || r0.A02 == null) {
            return;
        }
        ArrayList A10 = 1BL.A10(Ben);
        1Du it2 = Ben.iterator();
        while (it2.hasNext()) {
            C4U c4u2 = (C4U) it2.next();
            A10.add(new C1765Arz(c4u2.A00, 0S2.A00, null, null, null, c4u2.A03, str));
        }
        Iterator it3 = A10.iterator();
        while (it3.hasNext()) {
            C1765Arz c1765Arz = (C1765Arz) it3.next();
            String str2 = c1765Arz.A05;
            if (str2 != null) {
                r0.A09.put(str2, c1765Arz);
            }
        }
    }
}
