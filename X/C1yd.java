package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.1yd, reason: invalid class name */
/* loaded from: 1yd.class */
public final class C1yd {
    public final int A00;
    public final 1qW A01;
    public final ImmutableMap A02;

    public C1yd(1qW r302, int i) {
        this(r302, null, i);
    }

    public C1yd(1qW r302, ImmutableMap immutableMap, int i) {
        this.A01 = r302;
        this.A00 = i;
        this.A02 = immutableMap;
    }

    public 1F9 A00() {
        String string = ((1qX) this.A01).mResultSet.getString(this.A00, 9);
        string.getClass();
        1F9[] r0 = 1F9.A03;
        return "".equals(string) ? 1F9.A06 : 1F9.A00(string);
    }

    public Integer A01() {
        1qW r0 = this.A01;
        return Integer.valueOf(((1qX) r0).mResultSet.getInteger(this.A00, 33));
    }

    public String A02() {
        1qW r0 = this.A01;
        String string = ((1qX) r0).mResultSet.getString(this.A00, 24);
        string.getClass();
        return string;
    }
}
