package X;

import com.facebook.graphql.model.GraphQLMedia;

/* renamed from: X.6da, reason: invalid class name */
/* loaded from: 6da.class */
public final class C6da {
    public final 2Dp A00(6TI r302) {
        11T.A0F(r302, 0);
        Object A02 = r302.A02("CoverImageParamsKey");
        if (A02 == null) {
            return null;
        }
        if (A02 instanceof 2Dp) {
            2Dp r305 = (2Dp) A02;
            GraphQLMedia A01 = 6US.A01(r302);
            if (r305.A09 == null && A01 != null) {
                2IA A022 = 2IA.A02(r305);
                A022.A06 = AbstractC02343uw.A01(A01.A0I(113126854), A01.A0I(-1221029593));
                r305 = A022.A04();
            }
            return r305;
        }
        if (!(A02 instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) A02;
        11T.A0F(objArr, 0);
        Object obj = objArr.length == 0 ? null : objArr[0];
        if (obj instanceof 2Dp) {
            return (2Dp) obj;
        }
        return null;
    }
}
