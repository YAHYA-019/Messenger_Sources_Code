package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;

/* loaded from: Cpy.class */
public final class Cpy implements DIW {
    public 5O6 A00;
    public Long A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 53M A07;
    public final C1325Ae3 A08;
    public final Context A09;
    public final FbUserSession A0A;

    public Cpy(Context context, FbUserSession fbUserSession, 53M r304) {
        11T.A0F(r304, 3);
        this.A09 = context;
        this.A0A = fbUserSession;
        this.A07 = r304;
        this.A06 = AbG.A0S();
        this.A08 = new C1325Ae3();
        this.A04 = 1Lm.A00(context, fbUserSession, 82468);
        this.A02 = 1Bq.A00(16465);
        this.A05 = 1Lm.A00(context, fbUserSession, 84346);
        this.A03 = 1Bu.A01(context, 84334);
        if (r304 == 53M.A0Q) {
            this.A01 = AcP.A03(context, fbUserSession);
        }
    }

    public static final void A00(Cpy cpy, ImmutableList immutableList) {
        if (!immutableList.isEmpty() && cpy.A00 != null) {
            ((AcX) 1BK.A0r(immutableList)).A01 = cpy.A00;
        }
        5O6 r0 = cpy.A00;
        if (r0 != null) {
            AbF.A1S(r0, immutableList);
            ((2eN) 1Br.A0B(cpy.A03)).A01(cpy.A00, "search ended");
        }
    }

    public void A5L(DFe dFe) {
        11T.A0F(dFe, 0);
        this.A08.A00(dFe);
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r306 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bb  */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C1323Ae1 Cpm(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cpy.Cpm(X.ByH, java.lang.Object):X.Ae1");
    }

    public String getFriendlyName() {
        return "AiBotPromptsDataSource";
    }
}
