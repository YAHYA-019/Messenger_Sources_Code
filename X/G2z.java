package X;

import org.json.JSONObject;

/* loaded from: G2z.class */
public final class G2z implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverWebviewService$22$1";
    public final /* synthetic */ FpF A00;
    public final /* synthetic */ JSONObject A01;

    public G2z(FpF fpF, JSONObject jSONObject) {
        this.A00 = fpF;
        this.A01 = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        FpF fpF = this.A00;
        fpF.A00.Ci7(fpF.A01, this.A01);
    }
}
