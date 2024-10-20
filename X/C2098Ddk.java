package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Ddk, reason: case insensitive filesystem */
/* loaded from: Ddk.class */
public final class C2098Ddk extends 1Dd {
    public static final 1Dj A00;
    public static final 1Dj A01;
    public static final 1rV A02;
    public static final ImmutableList A03;

    static {
        1Dj A0F = AbF.A0F("recipient_id", "TEXT");
        A01 = A0F;
        1Dj A0F2 = AbF.A0F("is_eligible", "TEXT");
        A00 = A0F2;
        A02 = DKD.A0I(A0F);
        A03 = ImmutableList.of((Object) A0F, (Object) A0F2);
    }

    public C2098Ddk() {
        super(A02, A03, "recipient_eligibility");
    }
}
