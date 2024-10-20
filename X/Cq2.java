package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: Cq2.class */
public final class Cq2 implements DIW {
    public 5O6 A00;
    public Long A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 53M A08;

    public Cq2(Context context, FbUserSession fbUserSession, 53M r304) {
        11T.A0F(r304, 3);
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A08 = r304;
        this.A06 = AbG.A0S();
        this.A07 = 1Bq.A00(16826);
        this.A05 = 1Lm.A00(context, fbUserSession, 82468);
        this.A04 = 1Bu.A01(context, 84334);
        if (r304 == 53M.A0Q) {
            this.A01 = AcP.A03(context, fbUserSession);
        }
    }

    public static final ImmutableList A00(Cq2 cq2, int i) {
        String str = "Failure to fetch ai bots throws exception ";
        SettableFuture A0j = 4YU.A0j();
        ((BDR) 1Br.A0B(cq2.A05)).A00(Czj.A00(A0j, cq2, 76), i);
        try {
            try {
                return (ImmutableList) A0j.get(2, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                0fH.A0r("AiBotSectionDataSource", str, e);
                return ImmutableList.of();
            }
        } catch (TimeoutException e2) {
            e = e2;
            str = "Null state AI bots fetch timed-out";
            0fH.A0r("AiBotSectionDataSource", str, e);
            return ImmutableList.of();
        }
    }

    private final void A01(ImmutableList immutableList) {
        if (!immutableList.isEmpty() && this.A00 != null) {
            ((AcX) 1BK.A0r(immutableList)).A01 = this.A00;
        }
        5O6 r0 = this.A00;
        if (r0 != null) {
            AbF.A1S(r0, immutableList);
            ((2eN) 1Br.A0B(this.A04)).A01(this.A00, "search ended");
        }
    }

    public void A5L(DFe dFe) {
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if (r311 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C1323Ae1 Cpm(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cq2.Cpm(X.ByH, java.lang.Object):X.Ae1");
    }

    public String getFriendlyName() {
        return "AiBotSectionDataSource";
    }
}
