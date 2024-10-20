package X;

import android.os.Bundle;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.9kc, reason: invalid class name */
/* loaded from: 9kc.class */
public final class C9kc {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C9kc(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A05 = str;
        this.A04 = str2;
        this.A00 = str3;
        this.A01 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A03 = str7;
        this.A02 = str8;
    }

    public static C9kc A00(Bundle bundle) {
        return bundle == null ? A01("appmanager_missing_utm_bundle") : new C9kc(bundle.getString("utm_source", "appmanager_unknown"), bundle.getString("utm_medium", "appmanager_unknown"), bundle.getString("utm_campaign", "appmanager_unknown"), bundle.getString("utm_content", "appmanager_unknown"), bundle.getString("utm_term", "appmanager_unknown"), bundle.getString("utm_id", "appmanager_unknown"), bundle.getString(AbE.A00(554), ""), bundle.getString(AnonymousClass000.A00(ActionId.LEGACY_MARKER), ""));
    }

    public static C9kc A01(String str) {
        return new C9kc("appmanager_unknown", "appmanager_unknown", str, "appmanager_unknown", "appmanager_unknown", "appmanager_unknown", "", "");
    }
}
