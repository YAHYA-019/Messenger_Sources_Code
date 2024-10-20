package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.1vo, reason: invalid class name */
/* loaded from: 1vo.class */
public final class C1vo extends C1vp {
    public static ImmutableSet A00;

    @Override // X.C1vp
    public boolean A00(C1wd c1wd) {
        boolean z = true;
        if (A00 != null) {
            String str = ((1wN) c1wd.A01).A03;
            if (!TextUtils.isEmpty(str) && A00.contains(str)) {
                z = false;
                c1wd.A00.cancel(false);
                0fH.A0g(str, "KillSwitchJobConstraint", "reviewJob job [%s] is disabled");
            }
        }
        return z;
    }
}
