package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

/* loaded from: F72.class */
public final class F72 {
    public static final void A00(Context context, String str, String str2) {
        7zT.A1S(context, str, str2);
        CP0 cp0 = new CP0("com.bloks.www.p2p.payment.friendpicker");
        cp0.A05("entry_point", str);
        cp0.A05("session_id", str2);
        1Bn.A0A(98520);
        DKT.A06(context, (GKg) null, cp0.A03());
    }

    public final void A01(Context context, ThreadKey threadKey, String str, String str2, String str3, List list, float f) {
        String A0Z;
        1BK.A1J(context, 2, str);
        5yY r0 = (5yY) 1Bn.A0A(67860);
        EU9.A00(context);
        FxJ fxJ = new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, (FHf) null, (DLQ) null, (DLQ) null, (FZt) null, (Integer) null, (Integer) null, (String) null, 0, false);
        HashMap A0u = AnonymousClass001.A0u();
        HashMap A0u2 = AnonymousClass001.A0u();
        HashMap A0u3 = AnonymousClass001.A0u();
        BitSet A18 = 1BK.A18(2);
        if (!list.isEmpty()) {
            A0u.put("recipients", list);
        }
        A0u.put("entry_point", str);
        A18.set(0);
        A0u.put("session_id", str2);
        A18.set(1);
        A0u.put(AbstractC00603o4.A00(600), str3);
        if (threadKey == null) {
            A0Z = "";
        } else {
            A0Z = AnonymousClass001.A0Z(threadKey, 4YT.A00(974), AnonymousClass001.A0k());
        }
        A0u.put(AbstractC00603o4.A00(599), Float.valueOf(f));
        ((2yD) r0.A00.get()).Auy(36594345434548188L);
        if (A18.nextClearBit(0) < 2) {
            throw DKD.A0k();
        }
        FFt A00 = FFt.A00(AbstractC00603o4.A00(ActionId.FORMAT_ERROR), C4O5.A02(A0u), A0u2);
        A00.A03 = A0Z;
        A00.A04 = null;
        AbM.A19(context, fxJ, A00, A0u3);
    }
}
