package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.52s, reason: invalid class name */
/* loaded from: 52s.class */
public abstract class C52s {
    public static void A00(AutofillData autofillData, FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        1Ql edit = fbSharedPreferences.edit();
        java.util.Map map = autofillData.A00;
        String str = (String) map.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (str == null) {
            A01(fbSharedPreferences, r303);
            str = C04I.A00().toString();
            if (str == null) {
                map.remove(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            } else {
                map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            }
        }
        edit.CaL(r303.A0D(str), autofillData.A01().toString());
        edit.commit();
    }

    public static void A01(FbSharedPreferences fbSharedPreferences, 1G2 r302) {
        1Ql edit = fbSharedPreferences.edit();
        Iterator it = fbSharedPreferences.Asu(r302).iterator();
        while (it.hasNext()) {
            edit.Cdj((1G2) it.next());
        }
        edit.commit();
    }

    public static void A02(FbSharedPreferences fbSharedPreferences, 1G2 r302) {
        1Ql edit = fbSharedPreferences.edit();
        Iterator it = fbSharedPreferences.Asu(r302).iterator();
        while (it.hasNext()) {
            edit.Cdj((1G2) it.next());
        }
        edit.commit();
    }

    public static void A03(FbSharedPreferences fbSharedPreferences, 1G2 r302, List list) {
        1Ql edit = fbSharedPreferences.edit();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutofillData autofillData = (AutofillData) it.next();
            Iterator A1A = 1BK.A1A(Collections.unmodifiableMap(autofillData.A00));
            while (true) {
                if (!A1A.hasNext()) {
                    break;
                } else if (!TextUtils.isEmpty(AnonymousClass001.A0i(A1A))) {
                    jSONArray.put(autofillData.A01());
                    break;
                }
            }
        }
        edit.CaL(r302, jSONArray.toString());
        edit.commit();
    }
}
