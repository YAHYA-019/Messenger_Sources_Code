package X;

import android.view.Window;

/* renamed from: X.0lj, reason: invalid class name */
/* loaded from: 0lj.class */
public final class C0lj extends 0xP {
    public void A03(boolean z) {
        if (!z) {
            A06(16);
            return;
        }
        Window window = ((0xP) this).A00;
        window.clearFlags(134217728);
        window.addFlags((-1) << (-1));
        A05(16);
    }

    public void A04(boolean z) {
        if (!z) {
            A06(8192);
            return;
        }
        Window window = ((0xP) this).A00;
        window.clearFlags(67108864);
        window.addFlags((-1) << (-1));
        A05(8192);
    }
}
