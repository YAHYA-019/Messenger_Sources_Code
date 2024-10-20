package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhv.class */
public final class Fhv implements 1Ro {
    public static final String __redex_internal_original_name = "AuthenticateSsoMethod";
    public 1BY A00;
    public final 5DO A08 = (5DO) 1Bn.A0E((Context) null, (1BY) null, 85192);
    public final C0es A03 = (C0es) 1Bn.A0E((Context) null, (1BY) null, 83607);
    public final EuM A02 = (EuM) 1Bn.A0E((Context) null, (1BY) null, 100127);
    public final Etp A04 = (Etp) 1Bn.A0E((Context) null, (1BY) null, 99584);
    public final C00i A07 = AbH.A0T();
    public final C00i A05 = 1BQ.A02(16617);
    public final C08344mm A01 = (C08344mm) 1Bn.A0E((Context) null, (1BY) null, 49243);
    public final C00i A06 = 1BV.A01((1BY) null, 98514);

    public Fhv(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        EpG epG = (EpG) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("meta_inf_fbmeta", C08344mm.A02(this.A01, "META-INF/FBMETA", false)));
        A0s.add(new BasicNameValuePair("adid", this.A04.A00()));
        A0s.add(new BasicNameValuePair("format", "json"));
        C00i c00i = this.A07;
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(c00i)));
        A0s.add(new BasicNameValuePair("access_token", epG.A04));
        A0s.add(new BasicNameValuePair("generate_analytics_claim", ConstantsKt.CAMERA_ID_BACK));
        String A04 = ((1Oe) this.A05.get()).A04(C1fe.A0P);
        if (A04 != null) {
            A0s.add(new BasicNameValuePair("family_device_id", A04));
        }
        String str = epG.A03;
        if (str == null) {
            str = this.A03.AXB();
        }
        A0s.add(new BasicNameValuePair("new_app_id", str));
        if (epG.A05) {
            A0s.add(new BasicNameValuePair("generate_session_cookies", ConstantsKt.CAMERA_ID_BACK));
        }
        String str2 = epG.A02;
        A0s.add(str2 != null ? new BasicNameValuePair("machine_id", str2) : new BasicNameValuePair("generate_machine_id", ConstantsKt.CAMERA_ID_BACK));
        String str3 = epG.A00;
        if (str3 != null) {
            A0s.add(new BasicNameValuePair("auth_secure_device_id", str3));
        }
        String str4 = epG.A01;
        if (str4 != null) {
            A0s.add(new BasicNameValuePair(Property.SYMBOL_Z_ORDER_SOURCE, str4));
        }
        5DO r0 = this.A08;
        if (!TextUtils.isEmpty(r0.A00())) {
            A0s.add(new BasicNameValuePair("advertiser_id", r0.A00()));
        }
        ((EtV) this.A06.get()).A00(AbJ.A0z(c00i), A0s);
        C04083zw A0L = DKF.A0L(new BasicNameValuePair("currently_logged_in_userid", 1Fw.A05(this.A00).A02), A0s);
        A0L.A0J = A0s;
        A0L.A06 = 0S2.A01;
        A0L.A02();
        A0L.A0F = "auth/create_session_for_app";
        A0L.A0L = true;
        return A0L.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return this.A02.A00(anonymousClass439.A01(), (String) null, AnonymousClass001.A0X(this), ((EpG) obj).A05);
    }
}
