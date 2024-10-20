package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ErrorReportingConstants;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: G7m.class */
public final class G7m implements GJx {
    @Override // X.GJx
    public C67b D4t(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            C67b c67b = null;
            if (string != null) {
                JSONObject A1F = DKC.A1F(string);
                JSONObject jSONObject = A1F.getJSONObject("profile");
                new C67b(A1F.getString("access_token"), new C67a(jSONObject.getString(ErrorReportingConstants.USER_ID_KEY), jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject.getString("pic_square")));
            }
            return c67b;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, X.0CL] */
    @Override // X.GJx
    public ExG D4v(Cursor cursor, C67Z c67z, EMr eMr) {
        String str;
        str = "";
        11T.A0G(c67z, 1, eMr);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A1F = DKC.A1F(string);
            ?? obj = new Object();
            ((0CL) obj).element = str;
            ?? obj2 = new Object();
            ((0CL) obj2).element = str;
            String A1A = A1F.has("userId") ? DKC.A1A("userId", A1F) : str;
            if (A1F.has(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                ((0CL) obj).element = DKC.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A1F);
            }
            if (A1F.has("profilePicUrl")) {
                ((0CL) obj2).element = DKC.A1A("profilePicUrl", A1F);
            }
            return new ExG(A1A, A1F.has("accessToken") ? DKC.A1A("accessToken", A1F) : "", c67z.name(), new G8a((0CL) obj, (0CL) obj2), c67z, eMr);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
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
            return new ExG(jSONObject.getString(ErrorReportingConstants.USER_ID_KEY), A1F.getString("access_token"), "FACEBOOK", new G8a(jSONObject, 9), C67Z.FACEBOOK, eMr);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.GJx
    public FXDeviceItem D4y(Cursor cursor, EMS ems, 67T r304) {
        String string;
        String string2;
        int columnIndex = cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        Long l = null;
        if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null || string.equals("")) {
            return null;
        }
        int columnIndex2 = cursor.getColumnIndex("timestamp");
        if (columnIndex2 != -1 && (string2 = cursor.getString(columnIndex2)) != null) {
            l = 1BK.A0n(string2);
        }
        return new FXDeviceItem(l, string, r304 == 67T.A06 ? C67Z.MESSENGER : C67Z.FACEBOOK, ems);
    }
}
