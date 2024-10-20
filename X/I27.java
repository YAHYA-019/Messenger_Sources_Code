package X;

import com.facebook.auth.usersession.FbUserSession;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashMap;

/* loaded from: I27.class */
public final class I27 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1EZ A02;
    public final 1De A03;

    public I27(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 114982);
        this.A01 = GOo.A0N(r0);
        this.A02 = GOq.A0T(r0);
    }

    public static final void A00(FbUserSession fbUserSession, I27 i27, String str) {
        1BY r0 = i27.A03.A00;
        IZI izi = (JOJ) 1Lm.A07(fbUserSession, r0, 83902);
        AbN.A0X(izi).A04(izi.A01, "DRAWER_COWATCH_IMPRESSION", str);
        2QO A0v = GOp.A0v(fbUserSession, r0);
        GP5 A0K = GOp.A0K(i27.A01);
        boolean z = !A0v.BQf();
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("is_ringing", String.valueOf(z));
        GP5.A02(A0K, "amd_launched", str, null, null, A0u);
        GOp.A0P(fbUserSession, r0).D0D(4);
        Hou hou = (Hou) 1Lm.A07(fbUserSession, r0, 115400);
        if ("drawer".equals(str)) {
            1UG A08 = 1BK.A08(1Br.A02(hou.A02), "rtc_cowatch_start");
            if (A08.isSampled()) {
                String str2 = hou.A00;
                if (str2 == null) {
                    str2 = "";
                }
                A08.A7R("sid", str2);
                A08.A7R(Property.SYMBOL_Z_ORDER_SOURCE, str);
                I5Y.A00(A08, hou.A01);
            }
        }
    }

    public final void A01(String str) {
        FbUserSession A04 = 1Fw.A04(this.A02);
        C00i c00i = this.A00.A00;
        if (((HuL) c00i.get()).A00 == null) {
            11T.A0L("callActivity");
            throw 0Q8.createAndThrow();
        }
        if (!((HuL) c00i.get()).A03()) {
            A00(A04, this, str);
        } else {
            GP5.A01(GOp.A0K(this.A01), "amd_lockscreen_shown", str);
            ((HuL) c00i.get()).A02(new IfW(A04, this, str));
        }
    }
}
