package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* loaded from: Fse.class */
public final class Fse implements AZi {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C8c9 A01;
    public final /* synthetic */ C00m A02;
    public final /* synthetic */ boolean A03;

    public Fse(Context context, C8c9 c8c9, C00m c00m, boolean z) {
        this.A03 = z;
        this.A00 = context;
        this.A01 = c8c9;
        this.A02 = c00m;
    }

    @Override // X.AZi
    public void BoD() {
        String str;
        Object A0A = 1Bn.A0A(68273);
        boolean z = this.A03;
        Context context = this.A00;
        C8c9 c8c9 = this.A01;
        if (z) {
            String str2 = c8c9.A05;
            str = str2 != null ? str2 : "";
            11T.A0F(context, 0);
            LinkedHashMap A1C = 1BK.A1C();
            A1C.put("card_id", str);
            ((F8z) 1Bi.A03(98521)).A02(context, new 8HD(context, A0A, 1), new DqI("com.bloks.www.messenger.aibot.ai_cards_good_feedback_submit_controller", 4, A1C), 04R.A0G());
        } else {
            11T.A0F(context, 0);
            EU9.A00(context);
            String str3 = c8c9.A05;
            str = str3 != null ? str3 : "";
            java.util.Map A1D = 1BK.A1D("on_complete", new FEV(new AVH(context, A0A, 33)));
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("card_id", str);
            HashMap A02 = C4O5.A02(A0u);
            EOt eOt = FZt.A0M;
            EOk eOk = FZt.A0P;
            EP2 ep2 = EP2.A07;
            EnumEntries enumEntries = EOn.A01;
            FFt.A00("com.bloks.www.messenger.aibot.ai_cards_feedback_controller", A02, A1D).A03(context, new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, (FHf) null, (DLQ) null, (DLQ) null, DKY.A01(eOt, eOk, ep2), (Integer) null, (Integer) null, (String) null, 0, false));
        }
        this.A02.invoke();
    }

    @Override // X.AZi
    public void C1W() {
        throw 0Q8.createAndThrow();
    }
}
