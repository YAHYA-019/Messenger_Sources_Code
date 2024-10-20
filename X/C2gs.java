package X;

import android.content.res.Resources;
import com.facebook.messaging.inbox.units.StaticUnitConfig;

/* renamed from: X.2gs, reason: invalid class name */
/* loaded from: 2gs.class */
public final class C2gs {
    public final 1Br A00 = 1Bq.A00(67196);

    public final C2gt A00(StaticUnitConfig staticUnitConfig, AbU abU) {
        Integer num;
        11T.A0F(staticUnitConfig, 0);
        11T.A0F(abU, 1);
        int ordinal = abU.ordinal();
        String str = "";
        if (ordinal == 2) {
            num = 0S2.A0C;
        } else if (ordinal == 1) {
            num = 0S2.A00;
        } else {
            if (ordinal != 0) {
                return null;
            }
            num = 0S2.A01;
            str = ((Resources) 1Br.A0B(this.A00)).getString(2131957867);
        }
        return new C2gt(staticUnitConfig, num, str);
    }
}
