package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.meta.metaai.imagine.service.ImagineNetworkService;

/* loaded from: F2h.class */
public abstract class F2h {
    public static final EQu A00(EPN epn) {
        switch (DKE.A0C(epn)) {
            case 0:
                return EQu.A06;
            case 1:
                return EQu.A0F;
            case 2:
                return EQu.A0A;
            case 3:
            case 5:
            case 6:
                return EQu.A0B;
            case 4:
                return EQu.A0C;
            case 7:
                return EQu.A0E;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 26:
            case 28:
            case 29:
            case 31:
            case 32:
            default:
                return EQu.A0K;
            case 14:
                return EQu.A0D;
            case 15:
                return EQu.A0J;
            case 16:
            case 17:
                return EQu.A04;
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 27:
                return EQu.A0G;
            case 19:
                return EQu.A0H;
            case 24:
                return EQu.A0I;
            case 30:
                return EQu.A03;
            case 33:
            case 34:
                return EQu.A05;
            case 35:
                return EQu.A01;
            case 36:
                return EQu.A02;
            case 37:
                return EQu.A08;
            case 38:
                return EQu.A07;
        }
    }

    public static void A01(GraphQlQueryParamSet graphQlQueryParamSet, ImagineNetworkService imagineNetworkService) {
        graphQlQueryParamSet.A05("surface", A00(imagineNetworkService.A03).toString());
    }
}
