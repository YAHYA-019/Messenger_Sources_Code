package X;

import com.facebook.auth.viewercontext.ViewerContext;

/* loaded from: F5m.class */
public final class F5m {
    public final 1Br A00 = 1Bq.A00(16449);
    public final 1Br A01 = AbG.A0M();
    public final 1Br A02 = 1Bq.A00(65755);
    public final 1Ve A03;

    public F5m(1Ve r302) {
        this.A03 = r302;
    }

    public static final void A00(5Dh r301, F5m f5m, String str, GJF gjf) {
        1Ve r0 = f5m.A03;
        if (!(r0 instanceof 3XZ)) {
            ViewerContext Aue = ((1Ey) 1Br.A0B(f5m.A02)).Aue();
            if (11T.A0O(Aue, ViewerContext.A01)) {
                1Br.A04(f5m.A01).D0v("attribution_sdk:GraphQLAttributionEventsClient", 0Pz.A0W("viewer context is null for event ", str));
                gjf.Bxg(0Pz.A0W("viewer context is null for event ", str), (Throwable) null);
                return;
            }
            r301.A00 = Aue;
        }
        4YU.A1J(r301, 883117735566279L);
        FfS ffS = new FfS(f5m, str, gjf);
        r0.ARJ(new FfN(f5m, str, gjf), ffS, r301, 4YV.A11(f5m.A00));
    }
}
