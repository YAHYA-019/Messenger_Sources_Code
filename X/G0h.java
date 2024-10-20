package X;

import android.util.Pair;
import java.util.List;
import org.json.JSONObject;

/* loaded from: G0h.class */
public final class G0h implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverSDKController$4";
    public final /* synthetic */ FJB A00;

    public G0h(FJB fjb) {
        this.A00 = fjb;
    }

    @Override // java.lang.Runnable
    public void run() {
        FJB fjb = this.A00;
        List<Pair> list = fjb.A0B;
        for (Pair pair : list) {
            FJB.A09(fjb, (String) pair.first, (JSONObject) pair.second);
        }
        list.clear();
        List<Pair> list2 = fjb.A0A;
        for (Pair pair2 : list2) {
            FJB.A08(fjb, (String) pair2.first, (List) pair2.second);
        }
        list2.clear();
    }
}
