package X;

import com.facebook.contacts.server.FetchDeltaContactsParams;
import com.facebook.contacts.server.FetchDeltaContactsResult;
import com.facebook.http.protocol.ApiErrorResult;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aph, reason: case insensitive filesystem */
/* loaded from: Aph.class */
public final class C1675Aph extends C4r3 {
    public static final String __redex_internal_original_name = "FetchDeltaContactsMethod";
    public final COi A00;
    public final Bzr A01;

    public C1675Aph() {
        super(AbI.A0G(), AbI.A0s());
        this.A01 = (Bzr) 1Bn.A0A(84598);
        this.A00 = AbJ.A0F();
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        FetchDeltaContactsParams fetchDeltaContactsParams = (FetchDeltaContactsParams) obj;
        Bzr bzr = this.A01;
        int i = fetchDeltaContactsParams.A00;
        return bzr.A00(0S2.A01, fetchDeltaContactsParams.A01, i);
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        2JX A0L = 1BL.A0L(1BK.A0B((2JY) obj2, 2JX.class, 1392614399, -1686845902), -1335444549, -834852670);
        1Du it = A0L.A2J(658940671).iterator();
        while (it.hasNext()) {
            2JY A0P = 7zL.A0P(it);
            2JX A0M = 1BL.A0M(1BL.A0L(A0P, 92659968, -384349402), 535888496, 599211397);
            String A0r = A0P.A0r(1091836000);
            if (A0M != null) {
                0fH.A0A(C1675Aph.class, AnonymousClass001.A0Z(A0M, "Deserializing node: ", AnonymousClass001.A0k()));
                COi.A02(this.A00, A0M, builder);
            } else if (A0r != null) {
                builder2.m11011add((Object) A0r);
            }
        }
        ImmutableList build = builder.build();
        ImmutableList build2 = builder2.build();
        0fH.A07(C1675Aph.class, build, "Got added contacts: %s");
        0fH.A07(C1675Aph.class, build2, "Got removed contact Ids: %s");
        2JY A0B = 1BK.A0B(A0L, C1693Apz.class, 883555422, 401849238);
        if (A0B == null) {
            throw new 2L0(new ApiErrorResult(C5om.API_EC_DOMAIN, "Request returned without page info", null, null, null, null, null, null, 1675011, 0, true));
        }
        return new FetchDeltaContactsResult(EnumC08284mf.A06, build, build2, A0B.A0r(-77796550), System.currentTimeMillis(), A0B.getBooleanValue(-1575811850));
    }
}
