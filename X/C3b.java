package X;

import android.content.Context;
import com.facebook.user.model.User;

/* loaded from: C3b.class */
public final class C3b {
    public final 1Br A02 = 1Bu.A00(82483);
    public final 1Br A00 = 1Bq.A00(67975);
    public final 1Br A01 = 1Bu.A00(82553);

    public final void A00(Context context, BOj bOj, User user, C5ty c5ty, String str) {
        Long l = null;
        BO0 bo0 = (c5ty == null || c5ty.A00 == null || c5ty.A01 == null) ? BO0.A01 : BO0.A02;
        1Kh A0u = AbH.A0u(user);
        A0u.A1y = AnonymousClass001.A1W(bo0, BO0.A02);
        A0u.A1B = String.valueOf(c5ty != null ? c5ty.A02 : null);
        User A0w = AbF.A0w(A0u);
        CNm cNm = (CNm) 1Br.A0B(this.A01);
        String str2 = A0w.A0X.displayName;
        if (c5ty != null) {
            l = c5ty.A02;
        }
        String valueOf = String.valueOf(l);
        11T.A0F(valueOf, 2);
        1UG A08 = 1BK.A08(1Br.A02(cNm.A00), 1BJ.A00(1602));
        if (A08.isSampled()) {
            A08.A5c(bOj, "entry_point");
            A08.A7R("agent_name", str2);
            A08.A7R("persona_id", valueOf);
            A08.A5c(bo0, "agent_creation_type");
            A08.BZL();
        }
        ((CGN) 1Br.A0B(this.A02)).A01(context, A0w, ((9Xq) 1Br.A0B(this.A00)).A00(c5ty, str));
    }
}
