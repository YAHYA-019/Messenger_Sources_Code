package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.4zi, reason: invalid class name */
/* loaded from: 4zi.class */
public final class C4zi extends 1Dd {
    public static final 1Dj A00;
    public static final 1Dj A01;
    public static final 1rV A02;
    public static final ImmutableList A03;
    public static final ImmutableList A04;

    static {
        1Dj r0 = new 1Dj("address", "TEXT");
        A00 = r0;
        1Dj r02 = new 1Dj("not_business", "INTEGER DEFAULT 0");
        A01 = r02;
        A03 = ImmutableList.of((Object) r0, (Object) r02);
        1rU r03 = new 1rU(ImmutableList.of((Object) r0));
        A02 = r03;
        A04 = ImmutableList.of((Object) r03);
    }

    public C4zi() {
        super(A03, A04, "sms_business_address_list");
    }
}
