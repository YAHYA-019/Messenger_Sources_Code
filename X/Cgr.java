package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.util.JSONUtil;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgr.class */
public final class Cgr implements 1Ro {
    public static final String __redex_internal_original_name = "SmsInviteClickMethod";
    public final BjZ A00;
    public final C0es A01;
    public final 1H2 A02;

    public Cgr() {
        1H2 r0 = (1H2) 1Bi.A03(33032);
        C0es c0es = (C0es) 1Bn.A0A(83607);
        BjZ bjZ = (BjZ) 1Bi.A03(85032);
        this.A02 = r0;
        this.A01 = c0es;
        this.A00 = bjZ;
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        RJ3 rj3 = (RJ3) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("invite_token", rj3.A00));
        A0s.add(new BasicNameValuePair("device_id", this.A02.A02()));
        BjZ bjZ = this.A00;
        synchronized (bjZ) {
            if (bjZ.A01 == null) {
                C00i c00i = bjZ.A00.A00;
                FbSharedPreferences A0S = 1BK.A0S(c00i);
                1G2 r0 = R4O.A00;
                String BD0 = A0S.BD0(r0);
                if (BD0 == null) {
                    BD0 = 1BK.A0t();
                    1Ql A0U = 1BL.A0U(c00i);
                    A0U.CaL(r0, BD0);
                    A0U.commit();
                }
                bjZ.A01 = BD0;
            }
            str = bjZ.A01;
        }
        A0s.add(new BasicNameValuePair("app_install_id", str));
        A0s.add(new BasicNameValuePair("is_new_install", Boolean.toString(rj3.A01)));
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%d/%s", 1BK.A0n(this.A01.AXB()), "messenger_invites");
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "messenger_invites");
        return AbK.A0M(c04083zw, formatStrLocaleSafe, A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return Boolean.valueOf(JSONUtil.A0J(anonymousClass439.A01(), false));
    }
}
