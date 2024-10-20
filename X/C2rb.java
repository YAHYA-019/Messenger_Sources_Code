package X;

import android.view.View;

/* renamed from: X.2rb, reason: invalid class name */
/* loaded from: 2rb.class */
public abstract class C2rb {
    public static int A00(View view, View view2, 2XJ r303, 2XA r304, 2NQ r305, boolean z) {
        if (r304.A0U() == 0 || r305.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(2XA.A0G(view) - 2XA.A0G(view2)) + 1;
        }
        return Math.min(r303.A07(), r303.A08(view2) - r303.A0B(view));
    }

    public static int A01(View view, View view2, 2XJ r303, 2XA r304, 2NQ r305, boolean z) {
        if (r304.A0U() == 0) {
            return 0;
        }
        int A00 = r305.A00();
        if (A00 == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            A00 = (int) (((r303.A08(view2) - r303.A0B(view)) / (Math.abs(2XA.A0G(view) - 2XA.A0G(view2)) + 1)) * r305.A00());
        }
        return A00;
    }

    public static int A02(View view, View view2, 2XJ r303, 2XA r304, 2NQ r305, boolean z, boolean z2) {
        int i = 0;
        if (r304.A0U() != 0 && r305.A00() != 0 && view != null && view2 != null) {
            i = z2 ? Math.max(0, (r305.A00() - Math.max(2XA.A0G(view), 2XA.A0G(view2))) - 1) : Math.max(0, Math.min(2XA.A0G(view), 2XA.A0G(view2)));
            if (z) {
                i = Math.round((i * (Math.abs(r303.A08(view2) - r303.A0B(view)) / (Math.abs(2XA.A0G(view) - 2XA.A0G(view2)) + 1))) + (r303.A06() - r303.A0B(view)));
            }
        }
        return i;
    }
}
