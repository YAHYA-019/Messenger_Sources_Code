package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Ddi, reason: case insensitive filesystem */
/* loaded from: Ddi.class */
public final class C2096Ddi extends 1Dd {
    public static final 1Dj A00;
    public static final 1rV A01;
    public static final ImmutableList A02;

    static {
        1Dj A0F = AbF.A0F("credential_id", "STRING");
        A00 = A0F;
        A01 = new 4xE(ImmutableList.of((Object) A0F), ImmutableList.of((Object) C2095Ddh.A00), "payment_card_ids", (String) null);
        A02 = ImmutableList.of((Object) A0F);
    }

    public C2096Ddi() {
        super(A01, A02, "primary_payment_card_id");
    }
}
