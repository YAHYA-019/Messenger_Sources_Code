package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: Kvf.class */
public abstract class Kvf {
    public static Integer A00(C11474wl c11474wl, C3243Jnf c3243Jnf, Integer num, String str, java.util.Map map, boolean z) {
        List A12;
        String A01;
        List A122;
        String A012 = LDu.A01(str);
        boolean containsKey = map.containsKey(A012);
        Integer num2 = 0S2.A00;
        if (c11474wl.A04.A00.AZk(36311839672700481L)) {
            C11424wg c11424wg = c11474wl.A00;
            8Lt r0 = new 8Lt(num2, num, num2);
            containsKey = false;
            11T.A0F(c11424wg, 0);
            C11394wd c11394wd = c11424wg.A08;
            String str2 = c11394wd.A01;
            if (str2 != null && (A01 = LDu.A01(str2)) != null && (A122 = JQx.A12(A01, (java.util.Map) c11424wg.A0I.A01)) != null) {
                containsKey = A122.contains(new 8Lu(r0, 0S2.A01));
            }
            8Lt r02 = new 8Lt(num2, num, num2);
            z = false;
            String str3 = c11394wd.A01;
            if (str3 != null && (A12 = JQx.A12(str3, (java.util.Map) c11424wg.A0I.A02)) != null) {
                z = A12.contains(new 8Lu(r02, 0S2.A0C));
            }
        }
        Integer num3 = (!containsKey || (AnonymousClass001.A1V(map.get(A012)) && !z)) ? 0S2.A01 : num2;
        C11424wg c11424wg2 = c11474wl.A00;
        boolean A00 = KVy.A00(c11424wg2, new 8Lt(num2, num, num2));
        if (c3243Jnf != null && !A00 && num3 == num2) {
            if (c11424wg2.A08.A00 >= 2) {
                return num2;
            }
            num3 = 0S2.A01;
        }
        return num3;
    }

    public static boolean A01(AutofillData autofillData, AutofillData autofillData2, boolean z) {
        java.util.Map A0v = JQz.A0v(autofillData);
        Iterator A0y = AnonymousClass001.A0y(JQz.A0v(autofillData2));
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (!AnonymousClass001.A0j(A0z).equals("ent_id") && !AnonymousClass001.A0j(A0z).equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && (!z || (!AnonymousClass001.A0j(A0z).equals("country") && !AnonymousClass001.A0j(A0z).equals("address-level1")))) {
                String A0b = AnonymousClass001.A0b(A0z.getKey(), A0v);
                if (A0b != null && A0b.compareToIgnoreCase(1BK.A16(A0z)) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
