package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.proxygen.TraceFieldType;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: GP5.class */
public final class GP5 {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02 = 1BK.A0D();
    public final 1Br A03;

    public GP5(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 115392);
        this.A03 = 1Bu.A03(r0, 115394);
    }

    public static final void A00(GP5 gp5, String str) {
        A02(gp5, str, null, null, null, null);
    }

    public static final void A01(GP5 gp5, String str, String str2) {
        A02(gp5, str, str2, null, null, null);
    }

    public static final void A02(GP5 gp5, String str, String str2, String str3, String str4, java.util.Map map) {
        1UG A08 = 1BK.A08(1Br.A02(gp5.A02), 1BJ.A00(1746));
        if (A08.isSampled()) {
            A08.A7R("action", str);
            A08.A7R(Property.SYMBOL_Z_ORDER_SOURCE, str2);
            A08.A7R("trace", str3);
            A08.A7R(TraceFieldType.VideoId, str4);
            A08.A6J("extra_info", map);
            C00i c00i = gp5.A03.A00;
            if (GOp.A0q(((I5Y) c00i.get()).A01).A00 != 0) {
                A08.A7R("session_id", AbstractC2326GOr.A0H(A08, c00i, "call_type", AbstractC2326GOr.A0H(A08, c00i, "call_id", AbstractC2326GOr.A0H(A08, c00i, "server_info", ((I5Y) c00i.get()).A05()).A04()).A02()).A03());
            }
            A08.BZL();
        }
    }

    public final void A03(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        A01(this, "cowatch_joined_on_client", ((Hlv) 1Br.A0B(this.A01)).A00(fbUserSession));
        Hfs hfs = (Hfs) 4YU.A0o(fbUserSession, this.A00, 115393);
        hfs.A00 = ((Hlv) 1Br.A0B(hfs.A02)).A00(hfs.A01);
    }

    public final void A04(FbUserSession fbUserSession) {
        Hfs hfs = (Hfs) 4YU.A0o(fbUserSession, this.A00, 115393);
        if (hfs.A00 != null) {
            String A00 = ((Hlv) 1Br.A0B(hfs.A02)).A00(hfs.A01);
            if (11T.A0O(hfs.A00, A00)) {
                return;
            }
            String str = hfs.A00;
            hfs.A00 = A00;
            if (str != null) {
                A02(this, "cowatch_layout_changed", ((Hlv) 1Br.A0B(this.A01)).A00(fbUserSession), str, null, null);
            }
        }
    }

    public final void A05(FbUserSession fbUserSession, String str) {
        if (((HnM) 4YU.A0o(fbUserSession, this.A00, 115391)).A00("amd_dismissed")) {
            A01(this, "amd_dismissed", str);
        }
    }

    public final void A06(FbUserSession fbUserSession, String str) {
        11T.A0F(fbUserSession, 0);
        A01(this, "cowatch_closed_on_client", str);
        ((Hfs) 4YU.A0o(fbUserSession, this.A00, 115393)).A00 = null;
    }
}
