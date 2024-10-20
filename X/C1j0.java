package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.1j0, reason: invalid class name */
/* loaded from: 1j0.class */
public abstract class C1j0 {
    public static final double A00(long j) {
        if (j < 0 || j > Long.MAX_VALUE) {
            throw AnonymousClass001.A0L(StringFormatUtil.formatStrLocaleSafe("Invalid input: %d", Long.valueOf(j)));
        }
        return j / 1000.0d;
    }
}
