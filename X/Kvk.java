package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: Kvk.class */
public abstract class Kvk {
    public static final 8Lq A00(java.util.Map map) {
        if (map.isEmpty()) {
            return null;
        }
        return new 8Lq(new JtF(AnonymousClass001.A0b("email", map), AnonymousClass001.A0b("given-name", map), AnonymousClass001.A0b("family-name", map), AnonymousClass001.A0b(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map), AnonymousClass001.A0b("address-line1", map), AnonymousClass001.A0b("address-line2", map), AnonymousClass001.A0b("address-line3", map), AnonymousClass001.A0b("address-level1", map), AnonymousClass001.A0b("address-level2", map), AnonymousClass001.A0b("address-level3", map), AnonymousClass001.A0b("address-level4", map), AnonymousClass001.A0b("postal-code", map), AnonymousClass001.A0b("street-address", map), AnonymousClass001.A0b("tel", map), AbH.A1C("tel-area-code", map), AbH.A1C("tel-country-code", map), AbH.A1C("tel-local", map), AbH.A1C("tel-local-prefix", map), AbH.A1C("tel-local-suffix", map), AbH.A1C("tel-national", map), AbH.A1C("country", map), AbH.A1C("country-name", map), 0), AnonymousClass001.A0b("ent_id", map), AnonymousClass001.A0b("usage_frequency", map), AnonymousClass001.A0b(PublicKeyCredentialControllerUtility.JSON_KEY_ID, map), 0);
    }

    public static final java.util.Map A01(8Lq r301) {
        if (r301 == null) {
            return 04R.A0G();
        }
        JtF jtF = (JtF) r301.A01;
        String str = null;
        03Y A1G = 1BK.A1G("email", jtF != null ? jtF.A0M : null);
        03Y A1G2 = 1BK.A1G("given-name", jtF != null ? jtF.A04 : null);
        03Y A1G3 = 1BK.A1G("family-name", jtF != null ? jtF.A03 : null);
        03Y A1G4 = 1BK.A1G(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jtF != null ? jtF.A05 : null);
        03Y A1G5 = 1BK.A1G("address-line1", jtF != null ? jtF.A0H : null);
        03Y A1G6 = 1BK.A1G("address-line2", jtF != null ? jtF.A0I : null);
        03Y A1G7 = 1BK.A1G("address-line3", jtF != null ? jtF.A0J : null);
        03Y A1G8 = 1BK.A1G("address-level1", jtF != null ? jtF.A01 : null);
        03Y A1G9 = 1BK.A1G("address-level2", jtF != null ? jtF.A02 : null);
        03Y A1G10 = 1BK.A1G("address-level3", jtF != null ? jtF.A0D : null);
        03Y A1G11 = 1BK.A1G("address-level4", jtF != null ? jtF.A0G : null);
        03Y A1G12 = 1BK.A1G("postal-code", jtF != null ? jtF.A06 : null);
        03Y A1G13 = 1BK.A1G("street-address", jtF != null ? jtF.A07 : null);
        03Y A1G14 = 1BK.A1G("tel", jtF != null ? jtF.A08 : null);
        03Y A1G15 = 1BK.A1G("tel-area-code", jtF != null ? jtF.A09 : null);
        03Y A1G16 = 1BK.A1G("tel-country-code", jtF != null ? jtF.A0A : null);
        03Y A1G17 = 1BK.A1G("tel-local", jtF != null ? jtF.A0B : null);
        03Y A1G18 = 1BK.A1G("tel-local-prefix", jtF != null ? jtF.A0C : null);
        03Y A1G19 = 1BK.A1G("tel-local-suffix", jtF != null ? jtF.A0E : null);
        03Y A1G20 = 1BK.A1G("tel-national", jtF != null ? jtF.A0F : null);
        03Y A1G21 = 1BK.A1G("country", jtF != null ? jtF.A0K : null);
        if (jtF != null) {
            str = jtF.A0L;
        }
        return 04R.A09(new 03Y[]{A1G, A1G2, A1G3, A1G4, A1G5, A1G6, A1G7, A1G8, A1G9, A1G10, A1G11, A1G12, A1G13, A1G14, A1G15, A1G16, A1G17, A1G18, A1G19, A1G20, A1G21, 1BK.A1G("country-name", str), 1BK.A1G("ent_id", r301.A02), 1BK.A1G("usage_frequency", r301.A04), 1BK.A1G(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r301.A03)});
    }
}
