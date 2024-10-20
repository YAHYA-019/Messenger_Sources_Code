package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ErrorReportingConstants;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: G7l.class */
public final class G7l implements GJx {
    @Override // X.GJx
    public C67b D4t(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A1F = DKC.A1F(string);
            JSONObject jSONObject = A1F.getJSONObject("profile");
            return new C67b(A1F.getString("access_token"), new C67a(jSONObject.getString(ErrorReportingConstants.USER_ID_KEY), jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject.has("profile_pic_url") ? jSONObject.getString("profile_pic_url") : ""));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.GJx
    public ExG D4v(Cursor cursor, C67Z c67z, EMr eMr) {
        throw new RuntimeException("LiteProvider not used in Facebook Lite.");
    }

    @Override // X.GJx
    public ExG D4w(Cursor cursor, EMr eMr) {
        11T.A0F(eMr, 1);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A1F = DKC.A1F(string);
            JSONObject jSONObject = A1F.getJSONObject("profile");
            return new ExG(jSONObject.getString(ErrorReportingConstants.USER_ID_KEY), A1F.getString("access_token"), "FACEBOOK", new G8a(jSONObject, 7), C67Z.FACEBOOK_LITE, eMr);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.GJx
    public FXDeviceItem D4y(Cursor cursor, EMS ems, 67T r304) {
        String A0o = DKD.A0o(cursor, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A0o2 = DKD.A0o(cursor, "timestamp");
        return new FXDeviceItem(A0o2 != null ? 1BK.A0n(A0o2) : null, A0o, C67Z.FACEBOOK_LITE, EMS.A01);
    }
}
