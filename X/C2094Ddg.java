package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ddg, reason: case insensitive filesystem */
/* loaded from: Ddg.class */
public final class C2094Ddg extends 1Dd {
    public static final 1Dj A00;
    public static final 1rV A01;
    public static final ImmutableList A02;

    static {
        1Dj A0F = AbF.A0F(TraceFieldType.RequestID, "INTEGER");
        A00 = A0F;
        A01 = DKD.A0I(A0F);
        A02 = ImmutableList.of((Object) A0F);
    }

    public C2094Ddg() {
        super(A01, A02, "incoming_request_ids");
    }
}
