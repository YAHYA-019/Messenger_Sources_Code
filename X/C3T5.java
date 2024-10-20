package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.mapbox.mapboxsdk.BuildConfig;
import java.util.Locale;

/* renamed from: X.3T5, reason: invalid class name */
/* loaded from: 3T5.class */
public final class C3T5 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Uri.Builder A0G = new Uri.Builder();
    public final C00i A0I = 1BV.A00(32993);
    public final C00i A0H = 1BQ.A02(83603);

    public static final C3T5 A00() {
        return new C3T5();
    }

    public static void A01(C3T5 c3t5) {
        if (c3t5.A0F) {
            throw AnonymousClass001.A0N("You should only generate the url once per instance!");
        }
    }

    public Uri A02() {
        A01(this);
        Uri.Builder builder = this.A0G;
        builder.scheme("https").authority(AbstractC00603o4.A00(540)).appendPath("mreg");
        if (this.A0A) {
            4DK r0 = (4DK) this.A0I.get();
            String replace = 1BK.A0t().replace("-", "");
            1Ql A0V = 1BL.A0V(r0.A01);
            A0V.CaL(2W0.A08, replace);
            A0V.commit();
            builder.appendQueryParameter("client_key", replace);
        }
        if (this.A0E) {
            builder.appendQueryParameter("e_token", this.A02);
        }
        C00i c00i = this.A0I;
        String A02 = ((1H2) ((4DK) c00i.get()).A04.get()).A02();
        String str = null;
        if (!TextUtils.isEmpty(A02)) {
            try {
                str = 0KC.A00(A02).toUpperCase(Locale.US);
            } catch (RuntimeException unused) {
            }
        }
        if (str != null) {
            builder.appendQueryParameter("d_hash", str);
        }
        this.A0H.get();
        builder.appendQueryParameter("cid", "256002347743983");
        ((4DK) c00i.get()).A00.get();
        String[] split = BuildConfig.VERSION_NAME.split("\\.");
        builder.appendQueryParameter(AnonymousClass000.A00(92), String.valueOf(split.length > 0 ? Integer.parseInt(split[0]) : -1));
        if (this.A08) {
            builder.appendQueryParameter("tg", this.A04);
        }
        if (this.A06) {
            builder.appendQueryParameter("cct", this.A05 ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
        }
        if (this.A07) {
            builder.appendQueryParameter("src", this.A03);
        }
        if (this.A0D) {
            builder.appendQueryParameter("is_from_msite_sso", ConstantsKt.CAMERA_ID_BACK);
        }
        if (this.A0C) {
            builder.appendQueryParameter("initial_browser_name", this.A00);
        }
        if (this.A09) {
            builder.appendQueryParameter("is_as", ConstantsKt.CAMERA_ID_BACK);
        }
        if (this.A0B) {
            builder.appendQueryParameter("mb", this.A01);
        }
        this.A0F = true;
        return builder.build();
    }
}
