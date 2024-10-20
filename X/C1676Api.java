package X;

import com.facebook.contacts.server.FetchAllContactsParams;
import com.facebook.contacts.server.FetchAllContactsResult;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Api, reason: case insensitive filesystem */
/* loaded from: Api.class */
public final class C1676Api extends C4r3 {
    public static final String __redex_internal_original_name = "FetchAllContactsMethod";
    public final COi A00;
    public final Bzr A01;
    public final C00i A02;

    public C1676Api() {
        super(AbI.A0G(), AbI.A0s());
        this.A01 = (Bzr) 1Bn.A0A(84598);
        this.A00 = AbJ.A0F();
        this.A02 = AbH.A0a();
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        FetchAllContactsParams fetchAllContactsParams = (FetchAllContactsParams) obj;
        Bzr bzr = this.A01;
        int i = fetchAllContactsParams.A00;
        return bzr.A00(0S2.A00, fetchAllContactsParams.A01, i);
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        2JY A0B;
        String A0r;
        2JY r0 = (2JY) obj2;
        if (((FetchAllContactsParams) obj).A01 != null) {
            A0B = 1BK.A0B(AbF.A0K(r0, 2JX.class, 1898295774), C1694Aq0.class, 1392614399, -1123539865);
            A0r = null;
        } else {
            A0B = 1BK.A0B(AbF.A0K(r0, 2JX.class, 350760930), C1694Aq0.class, 1392614399, 1861856478);
            A0r = A0B.A0r(-1742500545);
        }
        2JY A0B2 = 1BK.A0B(A0B, C1693Apz.class, 883555422, 1760270645);
        String A0r2 = A0B2.A0r(-77796550);
        boolean booleanValue = A0B2.getBooleanValue(-1575811850);
        String A0r3 = A0B2.A0r(-1426770499);
        ImmutableList A0a = A0B.A0a(-1424253335, 2JX.class);
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < A0a.size(); i++) {
            COi.A02(this.A00, 1BL.A0M(AbG.A0E(A0a, i), 535888496, 599211397), builder);
        }
        ImmutableList build = builder.build();
        0fH.A0A(C1676Api.class, AnonymousClass001.A0Z(build, "Got result: ", AnonymousClass001.A0k()));
        return new FetchAllContactsResult(EnumC08284mf.A06, build, A0r2, A0r3, A0r, 1BL.A08(this.A02), booleanValue);
    }
}
