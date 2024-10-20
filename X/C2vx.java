package X;

import com.facebook.acra.constants.ActionId;
import java.util.Set;

/* renamed from: X.2vx, reason: invalid class name */
/* loaded from: 2vx.class */
public final class C2vx {
    public Set A00 = 1Bn.A0I(ActionId.ON_ATTACH_FRAGMENT);

    public String A00() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (C2vz c2vz : this.A00) {
            if (c2vz.BSZ()) {
                if (z) {
                    z = false;
                } else {
                    sb.append("-");
                }
                sb.append((c2vz instanceof C2w1 ? 0S2.A01 : 0S2.A00).intValue() != 0 ? "ZR" : "DT");
            }
        }
        return sb.toString();
    }
}
