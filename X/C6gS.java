package X;

import android.content.Context;
import com.facebook.pages.bizapp.config.model.BizAppConfigNode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6gS, reason: invalid class name */
/* loaded from: 6gS.class */
public final class C6gS {
    public final 1Br A00 = 1Bu.A00(67105);
    public final 1Br A03 = 1Bu.A00(16669);
    public final 1Br A02 = 1Bu.A00(98741);
    public final 1Br A01 = 1Bq.A00(83604);

    public BizAppConfigNode A00(Context context, long j) {
        11T.A0F(context, 0);
        int i = 98742;
        if (((6gU) ((6gT) this.A02.A00.get()).A00.A00.get()).A00()) {
            i = 98743;
        }
        BizAppConfigNode AaU = ((6gW) 1Bn.A0A(i)).AaU(context, j);
        java.util.Map A01 = 02J.A01(new 03Y("asset_id", String.valueOf(j)));
        if (this.A01.A00.get() == C0et.A0U && AaU == null) {
            AnonymousClass047 ACu = ((AnonymousClass046) 1Br.A0B(this.A03)).ACu("Null Config Node -- for ID", 914358273);
            ACu.A8L("is_in_scoping_experiment", ((6gU) 1Br.A0B(this.A00)).A00());
            if (!A01.isEmpty()) {
                Iterator A0y = AnonymousClass001.A0y(A01);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    ACu.A8K(AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
                }
            }
            ACu.report();
        }
        return AaU;
    }
}
