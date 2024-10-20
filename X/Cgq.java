package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: Cgq.class */
public final class Cgq implements 1Ro {
    public static final String __redex_internal_original_name = "FirstPartySsoContextApiMethod";
    public 1BY A00;
    public final C00i A01 = AbH.A0T();
    public final C0qy A02 = AbI.A0D();

    public Cgq(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        RIc rIc = (RIc) obj;
        JSONArray jSONArray = new JSONArray();
        String[] strArr = rIc.A01;
        int length = strArr.length;
        if (length == 0) {
            throw new Exception("No passed user Ids");
        }
        String[] strArr2 = rIc.A00;
        if (strArr2.length != length) {
            throw new Exception("Number of passed user Ids does not match the number of access tokens");
        }
        int i = 0;
        do {
            jSONArray.put(AnonymousClass001.A12().put(ErrorReportingConstants.USER_ID_KEY, strArr[i]).put("session_token", strArr2[i]));
            i++;
        } while (i < length);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("access_token", strArr2[0]));
        A0s.add(new BasicNameValuePair("accounts", jSONArray.toString()));
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("device_id", AbJ.A0z(this.A01)), A0s);
        AbF.A1Q(A0C, "orca_first_party_sso_context");
        return AbK.A0M(A0C, "me/messenger_accounts", A0s);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.facebook.messaging.accountlogin.fragment.operation.FirstPartySsoContextResult, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        JSONArray jSONArray = new JSONArray(AbH.A0w(anonymousClass439).A0D("accounts").toString());
        int length = jSONArray.length();
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        int[] iArr5 = new int[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                ?? obj2 = new Object();
                obj2.A00 = iArr;
                obj2.A01 = iArr2;
                obj2.A02 = iArr3;
                obj2.A04 = iArr4;
                obj2.A03 = iArr5;
                return obj2;
            }
            JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
            iArr[i2] = jSONObject.getInt("badge_count");
            iArr2[i2] = jSONObject.getInt("online_friends_count");
            iArr3[i2] = jSONObject.getInt("unread_messages_count");
            iArr4[i2] = jSONObject.getInt(1BJ.A00(2112));
            iArr5[i2] = jSONObject.getInt("unseen_messages_count");
            i = i2 + 1;
        }
    }
}
