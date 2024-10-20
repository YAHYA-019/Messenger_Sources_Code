package X;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: Cfk.class */
public final class Cfk implements GEb {
    public static final Cfk A00 = new Cfk();

    @Override // X.GEb
    public final void Bmj(FIU fiu) {
        Context context = fiu.A0F;
        while (true) {
            Object obj = context;
            11T.A0A(obj);
            if (!(obj instanceof ContextWrapper)) {
                return;
            }
            if (obj instanceof C1em) {
                06Z BDe = ((C1em) obj).BDe();
                11T.A0A(BDe);
                0D2 A0b = BDe.A0b("active_session_detailed_menu");
                if (A0b != null) {
                    A0b.A0o();
                }
            }
            context = ((ContextWrapper) obj).getBaseContext();
        }
    }
}
