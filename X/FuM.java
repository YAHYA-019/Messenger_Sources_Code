package X;

import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.zero.common.ZeroUrlRewriteRule;
import com.google.common.collect.ImmutableList;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: FuM.class */
public final class FuM implements GOb {
    public Pattern A01;
    public final C00i A06 = 1BV.A00(98463);
    public final C00i A03 = 1BQ.A02(16923);
    public final C00i A02 = DKD.A0N();
    public final C00i A05 = 1BQ.A00();
    public final C00i A04 = 1BQ.A01();
    public final C15h A08 = G7K.A01(this, ActionId.MQTT_CONNECTED);
    public final C15h A09 = G7K.A01(this, ActionId.MQTT_DISCONNECTED);
    public final C15h A0A = G7K.A01(this, ActionId.MESSENGER_DELTA_REQUEST);
    public final ImmutableList A07 = ImmutableList.of((Object) new ZeroUrlRewriteRule("^(https?)://api\\.([0-9a-zA-Z\\.-]*)?facebook\\.com\\/method\\/mobile\\.zeroBalanceDetection", ""), (Object) new ZeroUrlRewriteRule("^(https?)://([0-9a-zA-Z\\.-]*)?facebook\\.com\\/zero\\/balance\\/pixel/", ""));
    public java.util.Map A00 = AnonymousClass001.A0u();

    private F5x A00(EKn eKn, String str, String str2) {
        F5x f5x;
        Pattern pattern = this.A01;
        if (pattern == null) {
            String BCz = 1BK.A0N(this.A05).BCz(36874291396084029L, (String) null);
            if (BCz != null) {
                try {
                    pattern = Pattern.compile(BCz);
                    this.A01 = pattern;
                } catch (PatternSyntaxException e) {
                    1BK.A09(this.A04).softReport("rewriteGqlIfApplicable", e.getMessage(), e);
                    return new F5x(str);
                }
            }
            f5x = new F5x(str);
            return f5x;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            Set set = (Set) this.A00.get(eKn);
            f5x = new F5x(str);
            if (set != null && set.contains(str2)) {
                f5x.A02 = matcher.replaceFirst(1BK.A0N(this.A05).BCy(36874291396149566L));
                f5x.A03 = true;
                f5x.A01 = "whitelist_request_name";
                return f5x;
            }
            return f5x;
        }
        f5x = new F5x(str);
        return f5x;
    }

    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, X.F5x] */
    private F5x A01(String str, String str2) {
        if (1BL.A1a(this.A08) || 1BL.A1a(this.A09) || 1BL.A1a(this.A0A)) {
            C00i c00i = this.A03;
            ImmutableList A0A = DKC.A0h(c00i).A0A();
            1Du it = this.A07.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (DKD.A1X(str, ((ZeroUrlRewriteRule) it.next()).A01)) {
                        0fH.A07(FuM.class, str, "Whitelisted URI: %s");
                        break;
                    }
                } else if (A0A != null) {
                    1Du it2 = A0A.iterator();
                    while (it2.hasNext()) {
                        ZeroUrlRewriteRule zeroUrlRewriteRule = (ZeroUrlRewriteRule) it2.next();
                        if (DKD.A1X(str, zeroUrlRewriteRule.A01)) {
                            String replaceFirst = zeroUrlRewriteRule.A01.matcher(str).replaceFirst(zeroUrlRewriteRule.A03);
                            FEM fem = (FEM) this.A06.get();
                            2BR A0h = DKC.A0h(c00i);
                            1QE r0 = (1QE) A0h.A0D.get();
                            C00i c00i2 = A0h.A0C;
                            String A0E = DKC.A0i(c00i2).A0E(r0, "unknown");
                            String A0D = DKC.A0i(c00i2).A0D(r0, "unknown");
                            String A0F = DKC.A0i(c00i2).A0F(r0, "unavailable");
                            String A07 = DKC.A0i(c00i2).A07(r0);
                            HashMap A0u = AnonymousClass001.A0u();
                            A0u.put("campaign_id", A07);
                            A0u.put("zero_rating_status", A0E);
                            A0u.put("registration_status", A0D);
                            A0u.put("unregistered_reason", A0F);
                            Boolean valueOf = Boolean.valueOf(((2Bx) A0h.A09.get()).A02());
                            String A00 = 1BJ.A00(2162);
                            A0u.put(A00, valueOf);
                            7zT.A1S(str, replaceFirst, str2);
                            0fH.A0V(str, FEM.class, "Rewritten URI: %s %s", replaceFirst);
                            if (str.compareTo(replaceFirst) != 0 && !DKD.A1X(str, FEM.A01)) {
                                1UG A08 = 1BK.A08(1Br.A02(fem.A00), "zero_url_rewrite");
                                if (A08.isSampled()) {
                                    A08.A7R("original_uri", str);
                                    A08.A7R("rewritten_uri", replaceFirst);
                                    A08.A7R("registration_status", FEM.A00("registration_status", A0u));
                                    A08.A7R("unregistered_reason", FEM.A00("unregistered_reason", A0u));
                                    A08.A7R("campaign_id", FEM.A00("campaign_id", A0u));
                                    A08.A7R(AbstractC00603o4.A00(620), str2);
                                    A08.A7R("zero_rating_status", FEM.A00("zero_rating_status", A0u));
                                    A08.A7R(A00, FEM.A00(A00, A0u));
                                    A08.BZL();
                                }
                            }
                            String str3 = zeroUrlRewriteRule.A00;
                            ?? obj = new Object();
                            obj.A03 = true;
                            obj.A00 = str;
                            obj.A02 = replaceFirst;
                            obj.A01 = str3;
                            return obj;
                        }
                    }
                }
            }
        }
        return new F5x(str);
    }

    private void A02() {
        java.util.Map map = this.A00;
        if (map.size() == EKn.values().length) {
            return;
        }
        C00i c00i = this.A05;
        String BCz = 1BK.A0N(c00i).BCz(36874291396215103L, (String) null);
        String BCz2 = 1BK.A0N(c00i).BCz(36874291396018492L, (String) null);
        if (BCz != null) {
            try {
                EKn eKn = EKn.A02;
                JSONArray jSONArray = new JSONArray(BCz);
                LinkedHashSet linkedHashSet = new LinkedHashSet(jSONArray.length());
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        break;
                    }
                    linkedHashSet.add(jSONArray.getString(i));
                    i++;
                }
                map.put(eKn, linkedHashSet);
            } catch (JSONException e) {
                1BK.A09(this.A04).softReport("getZeroGQLWhitelistedNames", e.getMessage(), e);
                return;
            }
        }
        if (BCz2 == null) {
            return;
        }
        EKn eKn2 = EKn.A01;
        JSONArray jSONArray2 = new JSONArray(BCz2);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(jSONArray2.length());
        int i2 = 0;
        while (true) {
            if (i2 >= jSONArray2.length()) {
                map.put(eKn2, linkedHashSet2);
                return;
            } else {
                linkedHashSet2.add(jSONArray2.getString(i2));
                i2++;
            }
        }
    }

    @Override // X.GOb
    public boolean ADh(Uri uri) {
        String obj = uri.toString();
        1Du it = DKC.A0h(this.A03).A0A().iterator();
        while (it.hasNext()) {
            if (DKD.A1X(obj, ((ZeroUrlRewriteRule) it.next()).A01)) {
                return true;
            }
        }
        return false;
    }

    public boolean CIH(ImmutableList immutableList) {
        return false;
    }

    @Override // X.GOb
    public F5x Cif(Uri uri) {
        return A01(uri.toString(), "");
    }

    @Override // X.GOb
    public F5x Cig(String str) {
        return A01(str, "");
    }

    @Override // X.GOb
    public F5x Cih(String str, URI uri) {
        String obj = uri.toString();
        A02();
        F5x A00 = A00(EKn.A02, obj, str);
        if (!A00.A03 && 4YU.A0d(this.A02).A04("zero_gql_rewrite_whitelist")) {
            A02();
            A00 = A00(EKn.A01, obj, str);
        }
        return !A00.A03 ? A01(obj, str) : A00;
    }
}
