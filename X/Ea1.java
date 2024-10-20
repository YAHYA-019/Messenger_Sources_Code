package X;

import android.content.Context;
import java.util.BitSet;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: Ea1.class */
public abstract class Ea1 {
    public static boolean A00;

    /* JADX WARN: Type inference failed for: r0v16, types: [X.Dee, X.DMV, android.app.Dialog] */
    public static final void A00(Context context, EOm eOm, String str, C00m c00m, Function1 function1) {
        11T.A0F(context, 0);
        if (A00) {
            return;
        }
        A00 = true;
        C2049DaC A002 = EUZ.A00(context);
        JSONObject put = AnonymousClass001.A12().put("entrypoint", eOm).put("fc_session_id", 7zR.A0s());
        11T.A0A(put);
        String A02 = 11T.A02(put);
        ?? c2125Dee = new C2125Dee(context, 7zR.A0c(context).Aho());
        c2125Dee.A04(context.getString(2131958715));
        c2125Dee.show();
        0fH.A0j("FamilyCenterLauncher", 0Pz.A0v("Launching family center async action, url: ", str, ", logging context: ", A02));
        HashMap A0u = AnonymousClass001.A0u();
        HashMap A0u2 = AnonymousClass001.A0u();
        new BitSet(0);
        if (str == null) {
            str = "";
        }
        A0u.put("weburl", str);
        A0u.put("serialized_logging_context", A02);
        C4O5.A01(new Fww(c2125Dee, c00m, function1), "com.bloks.www.yp.familycenter.async", A0u, A0u2).A00(context, A002);
    }
}
