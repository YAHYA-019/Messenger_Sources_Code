package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: Fpf.class */
public final class Fpf implements GGE {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final /* synthetic */ F8P A0B;

    public Fpf(F8P f8p, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        this.A0B = f8p;
        this.A06 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A04 = str5;
        this.A08 = str6;
        this.A05 = str7;
        this.A00 = str8;
        this.A07 = str9;
        this.A0A = z;
        this.A09 = z2;
    }

    public 2FT AIj() {
        F8P f8p = this.A0B;
        FbUserSession A03 = 1Br.A03(f8p.A07);
        String str = this.A06;
        String str2 = this.A01;
        String str3 = this.A03;
        String str4 = this.A02;
        String str5 = this.A04;
        String str6 = this.A08;
        String str7 = this.A05;
        String str8 = this.A00;
        String str9 = this.A07;
        Boolean valueOf = Boolean.valueOf(this.A0A);
        Boolean valueOf2 = Boolean.valueOf(this.A09);
        EjU ejU = (EjU) f8p.A01.get();
        11T.A0D(valueOf);
        11T.A0D(valueOf2);
        11T.A0F(A03, 0);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("defer_tos_version", "android_v0");
        A0M.A05("app_id", str);
        if (str3 != null) {
            A0M.A05("context_type", str3);
        }
        if (str4 != null) {
            A0M.A05("context_source_id", str4);
        }
        if (str5 != null) {
            A0M.A05("entry_point_data", str5);
        }
        if (str6 != null) {
            A0M.A05(Property.SYMBOL_Z_ORDER_SOURCE, str6);
        }
        if (str7 != null) {
            A0M.A05("environment_type", str7);
        }
        if (str2 != null) {
            A0M.A05("session_id", str2);
        }
        if (str8 != null) {
            A0M.A05("cloud_binary_id", str8);
        }
        if (str9 != null) {
            A0M.A05("play_type", str9);
        }
        A0M.A03("skip_unused_vars", valueOf);
        A0M.A03("add_dma_query", valueOf2);
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(C2318Dk2.class, (Class) null, "QuicksilverGameInfo", (String) null, "fbandroid", -1224243274, 0, 572506448L, 572506448L, false, true));
        11T.A0D(A0L);
        11T.A0D(A0L);
        DKD.A1G(A0L);
        1Vd A0K = 7zM.A0K(ejU.A00);
        DKH.A1H(A0L);
        return Fvf.A00(A0K.A09(A0L), f8p, 51);
    }
}
