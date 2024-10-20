package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.protocol.LinkedFbUserFromIgSessionInfo;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: Cge.class */
public final class Cge implements 1Ro {
    public static final String __redex_internal_original_name = "GetLinkedFBUserFromIgSessionMethod";
    public Bte A00;
    public final C00i A01 = AbH.A0T();

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        Bte bte = (Bte) obj;
        this.A00 = bte;
        ArrayList A0s = AnonymousClass001.A0s();
        String str = bte.A00;
        if (str != null) {
            A0s.add(new BasicNameValuePair(Property.SYMBOL_Z_ORDER_SOURCE, str));
        }
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (true) {
            int i2 = i;
            List list = bte.A03;
            if (i2 >= list.size()) {
                A0s.add(new BasicNameValuePair("ig_session_infos", jSONArray.toString()));
                C04083zw A0C = AbH.A0C(new BasicNameValuePair("device_id", AbJ.A0z(this.A01)), A0s);
                AbF.A1Q(A0C, "get_linked_fb_user_from_ig_session");
                return AbK.A0M(A0C, "/linked_fb_user_from_ig_session", A0s);
            }
            JSONObject put = AnonymousClass001.A12().put("igsessionid", list.get(i2)).put("ig_account_status", bte.A02.get(i2));
            List list2 = this.A00.A01;
            if (list2 != null) {
                put.put("access_token_index", list2.get(i2));
            }
            jSONArray.put(put);
            i = i2 + 1;
        }
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0D = anonymousClass439.A01().A0D("sso_infos");
        if (A0D == null || this.A00 == null) {
            throw AnonymousClass001.A0q("Can't resolve GetLinkedFBUserFromIgSessionMethod response");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray jSONArray = new JSONArray(A0D.toString());
        if (jSONArray.length() == 0) {
            throw AnonymousClass001.A0q("Found no credential");
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
            Bte bte = this.A00;
            A0s.add(new LinkedFbUserFromIgSessionInfo(jSONObject.getString("fb_user_id"), jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject.getString("profile_pic_url"), AnonymousClass001.A0b(jSONObject.getString(bte.A01 != null ? "access_token_index" : "ig_username"), bte.A04), jSONObject.getString(JQw.A00(83)), jSONObject.getInt(1BJ.A00(574)), jSONObject.getBoolean("sso_enabled"), jSONObject.getBoolean("is_account_business_or_shared")));
        }
        return A0s;
    }
}
