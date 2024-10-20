package X;

/* renamed from: X.401, reason: invalid class name */
/* loaded from: 401.class */
public abstract class AnonymousClass401 {
    public static final 1DW A00(int i) {
        1DW[] values = 1DW.values();
        int length = values.length;
        1DW r304 = null;
        1DW r305 = null;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                break;
            }
            1DW r0 = values[i3];
            if (r0.androidThreadPriority >= i && (r304 == null || r304.androidThreadPriority > r0.androidThreadPriority)) {
                r304 = r0;
            }
            if (r305 == null || r0.androidThreadPriority > r305.androidThreadPriority) {
                r305 = r0;
            }
            i2 = i3 + 1;
        }
        if (r304 != null) {
            return r304;
        }
        if (r305 != null) {
            return r305;
        }
        throw 1BK.A0h();
    }
}
