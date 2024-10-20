package X;

import android.os.Build;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: EvL.class */
public final class EvL {
    public 1BY A00;
    public final C00i A05 = DKE.A0Z();
    public final C00i A03 = AbH.A0H();
    public final C00i A06 = AbH.A0T();
    public final 1Oe A02 = DKD.A0J();
    public final C00i A04 = 1BQ.A02(131080);
    public final Ei7 A01 = (Ei7) 1Bi.A03(98558);

    public EvL(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(String str) {
        C03z c03z = GraphQlCallInput.A02;
        C00i c00i = this.A06;
        07S A0J = 4YU.A0J(c03z, AbJ.A0z(c00i), "device_id");
        String A04 = this.A02.A04(C1fe.A0X);
        if (A04 != null) {
            07S.A00(A0J, A04, "family_device_id");
        }
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, str, "location_permission_state");
        4YV.A1A(A0J, A0N, "input");
        String A0z = AbJ.A0z(c00i);
        11T.A0F(A0z, 0);
        A0N.A05("device_id", A0z);
        A0N.A04(AbstractC00603o4.A00(410), Integer.valueOf(Build.VERSION.SDK_INT));
        C00i c00i2 = this.A04;
        A0N.A05("location_permission_state_os", R08.A00(((C02333uu) c00i2.get()).A01(0S2.A0C, false)));
        String str2 = "UNSET";
        int intValue = ((C02333uu) c00i2.get()).A02().intValue();
        if (intValue == 0) {
            str2 = "DISABLED";
        } else if (intValue == 2) {
            str2 = "WHILE_IN_USE";
        } else if (intValue == 3 || intValue == 1) {
            str2 = "ALWAYS";
        }
        A0N.A05("app_location_permission_value", str2);
        A0N.A05(Property.SYMBOL_Z_ORDER_SOURCE, "APP_PERMISSION_MUTATION");
        A0N.A05("app_id", Long.toString(350685531728L));
        5Dh A00 = 5Dh.A00(A0N, new C01643sd(Q7K.class, "LocationAppPermissionMutation", null, "input", "fbandroid", 907415546, 384, 1302953188L, 1302953188L, false, true));
        C00i c00i3 = this.A05;
        DKG.A1D(1BK.A04(c00i3));
        2FP.A02(new FvU(str, this, 1), AbL.A0Z(AbK.A0J(c00i3), A00, 562956621032230L), 1BK.A1E(this.A03));
    }
}
