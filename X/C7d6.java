package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Collections;

/* renamed from: X.7d6, reason: invalid class name */
/* loaded from: 7d6.class */
public final class C7d6 extends 2V0 {
    public 2V0 A00;
    public String A01;

    public Iterable A01() {
        return 1qE.A01(this.A00.A01(), Collections.singleton(this.A01));
    }

    public String A02() {
        return StringFormatUtil.formatStrLocaleSafe("WHEN %1$s THEN ?", this.A00.A02());
    }

    public String[] A03() {
        return (String[]) 2Ri.A0I(A01());
    }
}
