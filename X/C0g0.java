package X;

import java.util.Set;

/* renamed from: X.0g0, reason: invalid class name */
/* loaded from: 0g0.class */
public abstract class C0g0 {
    public static int A01 = 1;
    public static final Set A02 = AnonymousClass001.A0v();
    public final String A00;

    public C0g0(int i, String str, boolean z) {
        this.A00 = str;
        A01 = Math.max(A01, i + 1);
        if (z) {
            return;
        }
        A02.add(str);
    }
}
