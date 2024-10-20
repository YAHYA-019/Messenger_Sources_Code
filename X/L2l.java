package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.Gson;
import java.util.HashMap;

/* loaded from: L2l.class */
public final class L2l {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public java.util.Map A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public java.util.Map A0O;
    public final boolean A0P;

    public L2l(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, java.util.Map map, java.util.Map map2, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A09 = str;
        this.A0J = str2;
        this.A0M = str3;
        this.A0L = str4;
        this.A0F = str5;
        this.A0G = str6;
        this.A06 = str7;
        this.A0H = str8;
        this.A0K = str9;
        this.A0I = str10;
        this.A05 = str11;
        this.A08 = str12;
        this.A07 = str13;
        this.A0D = z;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j2;
        this.A0A = map;
        this.A0N = str14;
        this.A0C = z2;
        this.A0B = z3;
        this.A04 = l;
        this.A0E = str15;
        this.A0P = z4;
        this.A0O = map2;
    }

    public static final void A00(L2l l2l, java.util.Map map) {
        String str = l2l.A0J;
        if (str != null && str.length() != 0) {
            map.put("iab_session_id", str);
        }
        String str2 = l2l.A0M;
        if (str2 != null) {
            map.put(4YT.A00(1458), str2);
        }
        String str3 = l2l.A0L;
        if (str3 != null) {
            map.put("requested_fields", str3);
        }
        String str4 = l2l.A0F;
        if (str4 != null) {
            map.put("all_fields", str4);
        }
        String str5 = l2l.A0G;
        if (str5 != null) {
            map.put("available_fields", str5);
        }
        String str6 = l2l.A06;
        if (str6 != null) {
            map.put("new_fields", str6);
        }
        String str7 = l2l.A0H;
        if (str7 != null) {
            map.put("current_url", str7);
        }
        String str8 = l2l.A0K;
        if (str8 != null) {
            map.put("origin_host", str8);
        }
        String str9 = l2l.A0I;
        if (str9 != null) {
            map.put(4YT.A00(1126), str9);
        }
        String str10 = l2l.A05;
        if (str10 != null) {
            map.put("edited_fields", str10);
        }
        String str11 = l2l.A0N;
        if (str11 != null) {
            map.put(4YT.A00(1563), str11);
        }
        map.put("has_helium", String.valueOf(false));
    }

    public final HashMap A01() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("action", 4YT.A00(541));
        A0u.put("user_action", this.A09);
        A00(this, A0u);
        String str = this.A08;
        if (str != null) {
            A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        String str2 = this.A07;
        if (str2 != null) {
            A0u.put(4YT.A00(1368), str2);
        }
        A0u.put("with_ads_disclosure", String.valueOf(this.A0D));
        long j = this.A02;
        if (j != 0) {
            A0u.put(4YT.A00(1125), String.valueOf(j));
        }
        int i = this.A00;
        if (i != 0) {
            A0u.put("event_times", String.valueOf(i));
        }
        int i2 = this.A01;
        if (i2 != 0) {
            A0u.put("time_spend", String.valueOf(i2));
        }
        long j2 = this.A03;
        if (j2 > 0) {
            A0u.put("index", String.valueOf(j2));
        }
        java.util.Map map = this.A0A;
        if (map != null) {
            map.put("is_bloks_screen", String.valueOf(this.A0P));
            String A07 = new Gson().A07(map, new KE1().type);
            11T.A0A(A07);
            A0u.put(4YT.A00(1057), A07);
        }
        A0u.put("is_payment_opt_in", String.valueOf(this.A0C));
        A0u.put("is_contact_opt_in", String.valueOf(this.A0B));
        A0u.put("has_helium", String.valueOf(false));
        String str3 = this.A0E;
        if (str3 != null) {
            A0u.put("ad_id", str3);
        }
        A0u.put("IS_BLOKS_LOG_EVENT", String.valueOf(this.A0P));
        java.util.Map map2 = this.A0O;
        if (map2 != null) {
            String A072 = new Gson().A07(map2, new KE0().type);
            11T.A0A(A072);
            A0u.put("experiments", A072);
        }
        return A0u;
    }
}
