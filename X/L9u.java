package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: L9u.class */
public final class L9u {
    public static final AutofillData A00(java.util.Map map, boolean z) {
        11T.A0F(map, 0);
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("skip_graphql_save_request_for_bloks", String.valueOf(z));
        Object obj = map.get("given_name");
        A0u.put("given-name", obj != null ? obj.toString() : null);
        A0u.put("family-name", A01("family_name", map));
        A0u.put("street-address", A01("street_address", map));
        A0u.put("address-line1", A01("address_line1", map));
        A0u.put("address-line2", A01("address_line2", map));
        A0u.put("address-line3", A01("address_line3", map));
        A0u.put("address-level1", A01("address_level1", map));
        A0u.put("address-level2", A01("address_level2", map));
        A0u.put("address-level3", A01("address_level3", map));
        A0u.put("address-level4", A01("address_level4", map));
        A0u.put("postal-code", A01("postal_code", map));
        A0u.put("tel", A01("tel", map));
        A0u.put("tel-country-code", A01("tel_country_code", map));
        A0u.put("tel-national", A01("tel_national", map));
        A0u.put("tel-area-code", A01("tel_area_code", map));
        A0u.put("tel-local", A01("tel_local", map));
        A0u.put("tel-local-prefix", A01("tel_local_prefix", map));
        A0u.put("tel-local-suffix", A01("tel_local_suffix", map));
        A0u.put("email", A01("email", map));
        A0u.put("ent_id", A01("ent_id", map));
        LinkedHashMap linkedHashMap = new LinkedHashMap(02J.A00(A0u.size()));
        Iterator A0x = AnonymousClass001.A0x(A0u);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            Object key = A0z.getKey();
            CharSequence charSequence = (CharSequence) A0z.getValue();
            linkedHashMap.put(key, (charSequence == null || 0CU.A0O(charSequence)) ? null : A0z.getValue());
        }
        return new AutofillData(linkedHashMap);
    }

    public static String A01(Object obj, java.util.Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null) {
            return obj2.toString();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r302 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r302 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r302 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (r302 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
    
        if (r302 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        if (r302 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
    
        if (r302 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
    
        if (r302 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0164, code lost:
    
        if (r302 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0189, code lost:
    
        if (r302 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ae, code lost:
    
        if (r302 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d3, code lost:
    
        if (r302 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f6, code lost:
    
        if (r302 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0219, code lost:
    
        if (r304 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023c, code lost:
    
        if (r304 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x025f, code lost:
    
        if (r304 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0282, code lost:
    
        if (r304 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a5, code lost:
    
        if (r304 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02c8, code lost:
    
        if (r304 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e9, code lost:
    
        if (r304 == null) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map A02(com.facebook.browser.lite.extensions.autofill.model.AutofillData r301) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9u.A02(com.facebook.browser.lite.extensions.autofill.model.AutofillData):java.util.Map");
    }

    public final LinkedHashMap A03(AutofillData autofillData) {
        java.util.Map A02 = A02(autofillData);
        11T.A0I(A02, DKB.A00(28));
        LinkedHashMap A1C = 1BK.A1C();
        Iterator A0y = AnonymousClass001.A0y(A02);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (((CharSequence) A0z.getValue()).length() > 0) {
                4YV.A1R(A0z, A1C);
            }
        }
        return A1C;
    }
}
