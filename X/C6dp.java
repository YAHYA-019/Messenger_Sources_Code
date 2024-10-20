package X;

import java.util.Arrays;

/* renamed from: X.6dp, reason: invalid class name */
/* loaded from: 6dp.class */
public final class C6dp extends 6U5 {
    public final boolean A00;

    public C6dp(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        String format = String.format("%s: isSubtitlesOn: %s", Arrays.copyOf(new Object[]{super.toString(), Boolean.valueOf(this.A00)}, 2));
        11T.A0A(format);
        return format;
    }
}
