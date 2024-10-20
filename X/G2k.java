package X;

import org.json.JSONObject;

/* loaded from: G2k.class */
public final /* synthetic */ class G2k implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverFragment$$ExternalSyntheticLambda0";
    public final /* synthetic */ DZW A00;
    public final /* synthetic */ JSONObject A01;

    public /* synthetic */ G2k(DZW dzw, JSONObject jSONObject) {
        this.A00 = dzw;
        this.A01 = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DZW dzw = this.A00;
        JSONObject jSONObject = this.A01;
        dzw.A0G.A02(dzw.A0C, new Fq4(dzw, 2), DZW.A06(dzw), "community_hud", jSONObject.toString(), "communityHudPromiseId");
        dzw.A1Z(ENU.A04);
    }
}
