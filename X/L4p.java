package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.google.common.base.Platform;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: L4p.class */
public final class L4p {
    public final C01s A00;
    public final C00i A01 = 1BV.A00(82333);
    public final FbSharedPreferences A02;

    public L4p() {
        FbSharedPreferences A0i = AbJ.A0i();
        C01s A0I = 1BL.A0I();
        this.A02 = A0i;
        this.A00 = A0I;
        if (A0i.ArU(1G3.A01(A00(this), DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY), 0) < 1) {
            1Ql edit = A0i.edit();
            edit.CaE(1G3.A01(A00(this), DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY), 1);
            edit.commit();
        }
    }

    public static 1G2 A00(L4p l4p) {
        return ((Koh) l4p.A01.get()).A00();
    }

    public ArrayList A01() {
        ArrayList A0s = AnonymousClass001.A0s();
        String BD0 = this.A02.BD0(1G3.A01(A00(this), "address"));
        if (!Platform.stringIsNullOrEmpty(BD0)) {
            try {
                JSONArray jSONArray = new JSONArray(BD0);
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    11T.A0F(jSONObject, 1);
                    A0s.add(new BrowserExtensionsAutofillData(jSONObject));
                    i++;
                }
            } catch (JSONException e) {
                this.A00.softReport("FbAutofillDataStore", e);
            }
        }
        return A0s;
    }

    public ArrayList A02() {
        ArrayList A0s = AnonymousClass001.A0s();
        String BD0 = this.A02.BD0(1G3.A01(A00(this), "email"));
        if (!Platform.stringIsNullOrEmpty(BD0)) {
            try {
                JSONArray jSONArray = new JSONArray(BD0);
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    11T.A0F(jSONObject, 1);
                    A0s.add(new BrowserExtensionsAutofillData(jSONObject));
                    i++;
                }
            } catch (JSONException e) {
                this.A00.softReport("FbAutofillDataStore", e);
            }
        }
        return A0s;
    }

    public ArrayList A03() {
        ArrayList A0s = AnonymousClass001.A0s();
        String BD0 = this.A02.BD0(1G3.A01(A00(this), PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
        if (!Platform.stringIsNullOrEmpty(BD0)) {
            try {
                JSONArray jSONArray = new JSONArray(BD0);
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    11T.A0F(jSONObject, 1);
                    A0s.add(new BrowserExtensionsAutofillData(jSONObject));
                    i++;
                }
            } catch (JSONException e) {
                this.A00.softReport("FbAutofillDataStore", e);
            }
        }
        return A0s;
    }

    public ArrayList A04() {
        ArrayList A0s = AnonymousClass001.A0s();
        String BD0 = this.A02.BD0(1G3.A01(A00(this), "telephone"));
        if (!Platform.stringIsNullOrEmpty(BD0)) {
            try {
                JSONArray jSONArray = new JSONArray(BD0);
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        break;
                    }
                    A0s.add(new TelephoneAutofillData(jSONArray.getJSONObject(i)));
                    i++;
                }
            } catch (JSONException e) {
                this.A00.softReport("FbAutofillDataStore", e);
            }
        }
        return A0s;
    }
}
