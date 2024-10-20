package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.6cl, reason: invalid class name */
/* loaded from: 6cl.class */
public final class C6cl extends 6U5 {
    public final boolean A00;
    public final boolean A01;

    public C6cl(boolean z) {
        this.A01 = z;
        this.A00 = false;
    }

    public C6cl(boolean z, int i) {
        this.A01 = z;
        this.A00 = false;
    }

    public C6cl(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s: %s", super.toString(), Boolean.valueOf(this.A01));
        11T.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
