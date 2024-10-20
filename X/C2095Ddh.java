package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Ddh, reason: case insensitive filesystem */
/* loaded from: Ddh.class */
public final class C2095Ddh extends 1Dd {
    public static final 1Dj A00;
    public static final 1rV A01;
    public static final ImmutableList A02;

    static {
        1Dj A0F = AbF.A0F("credential_id", "STRING");
        A00 = A0F;
        A01 = DKD.A0I(A0F);
        A02 = ImmutableList.of((Object) A0F);
    }

    public C2095Ddh() {
        super(A01, A02, "payment_card_ids");
    }
}
