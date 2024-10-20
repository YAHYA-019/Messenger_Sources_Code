package X;

import android.view.View;

/* renamed from: X.0Ap, reason: invalid class name */
/* loaded from: 0Ap.class */
public final class C0Ap {
    public static final Integer A00(int i) {
        if (i == 0) {
            return 0S2.A01;
        }
        if (i == 4) {
            return 0S2.A0N;
        }
        if (i == 8) {
            return 0S2.A0C;
        }
        throw 0Pz.A04("Unknown visibility ", i);
    }

    public final Integer A01(View view) {
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? 0S2.A0N : A00(view.getVisibility());
    }
}
