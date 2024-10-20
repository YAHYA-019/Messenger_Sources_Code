package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inspiration.composer.sprouts.framework.ranking.InspirationSproutSurfaceDiskStorage;
import java.util.concurrent.Callable;

/* loaded from: G6l.class */
public final class G6l implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public G6l(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        if (this.A00 == 0) {
            InspirationSproutSurfaceDiskStorage inspirationSproutSurfaceDiskStorage = (InspirationSproutSurfaceDiskStorage) this.A01;
            String str = InspirationSproutSurfaceDiskStorage.A07(inspirationSproutSurfaceDiskStorage) ? this.A03 : "homebase_ranking_info";
            String str2 = this.A02;
            7zP.A0N(inspirationSproutSurfaceDiskStorage.A04).AAq();
            InspirationSproutSurfaceDiskStorage.A00(inspirationSproutSurfaceDiskStorage).write(str, DKC.A1a(str2, C03r.A05));
            return null;
        }
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("app_id", this.A02);
        A0M.A05("context_token_id", this.A03);
        FHD fhd = (FHD) this.A01;
        A0M.A05("funnel_session_key", ((F90) 1Br.A0B(fhd.A0B)).A00());
        A0M.A04("count", 10);
        String str3 = fhd.A07;
        if (str3 != null) {
            A0M.A05("cursor", str3);
        }
        2Jf r0 = new 2Jf(DiG.class, (Class) null, "InstantGameArcadePaginateCardsQuery", (String) null, "fbandroid", -2050275653, 0, 1889785610L, 1889785610L, false, true);
        DKF.A1P(A0M, r0);
        C3sa A0O = DKH.A0O(r0);
        1Vd r02 = (1Vd) 1Br.A0B(fhd.A0F);
        DKH.A1H(A0O);
        return r02.A09(A0O);
    }
}
