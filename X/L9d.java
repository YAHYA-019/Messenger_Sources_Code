package X;

import android.content.Context;
import java.util.Vector;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: L9d.class */
public abstract class L9d {
    public static final Pattern A01 = Pattern.compile("(?:\\sChrome/)(\\d{2,3})(?:\\.)");
    public static final Vector A00 = new Vector();

    public static String A00(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= jSONArray.length() || str2 != null) {
                    break;
                }
                JSONObject A1F = DKC.A1F(jSONArray.getString(i2));
                if (A1F.has("adid")) {
                    str2 = A1F.getString("adid");
                }
                i = i2 + 1;
            }
        } catch (JSONException unused) {
        }
        return str2;
    }

    public static String A01(String str) {
        String str2 = null;
        try {
            JSONArray jSONArray = new JSONArray(str);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= jSONArray.length() || str2 != null) {
                    break;
                }
                JSONObject A1F = DKC.A1F(jSONArray.getString(i2));
                if (A1F.has("ei")) {
                    str2 = A1F.getString("ei");
                }
                i = i2 + 1;
            }
        } catch (JSONException unused) {
        }
        return str2;
    }

    public static void A02(Context context, java.util.Map map, boolean z) {
        KxI.A00(new LqN(context, (L11) null, map, z));
    }
}
