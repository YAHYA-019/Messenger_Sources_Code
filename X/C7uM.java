package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.nio.charset.Charset;

/* renamed from: X.7uM, reason: invalid class name */
/* loaded from: 7uM.class */
public abstract class C7uM {
    public static final String A00(Context context, Uri uri, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(0Pz.A0W("media_platform_tam_uri_local_file_mapping_", str), 0);
        11T.A0A(sharedPreferences);
        return sharedPreferences.getString(C0Aj.A00(uri.buildUpon().scheme("https").clearQuery().build()).toString(), null);
    }

    public static final String A01(String str) {
        Uri A03 = C0A2.A03(str);
        11T.A0A(A03);
        String A02 = 11T.A02(C0Aj.A00(A03));
        Charset forName = Charset.forName("UTF-8");
        11T.A0A(forName);
        byte[] bytes = A02.getBytes(forName);
        11T.A0A(bytes);
        String A022 = 0KC.A02(bytes);
        11T.A0A(A022);
        return A022;
    }

    public static final void A02(Context context, Uri uri, Uri uri2, String str) {
        11T.A0F(context, 0);
        1BL.A1F(str, uri);
        if (A00(context, uri, str) == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(0Pz.A0W("media_platform_tam_uri_local_file_mapping_", str), 0);
            11T.A0A(sharedPreferences);
            sharedPreferences.edit().putString(C0Aj.A00(uri.buildUpon().scheme("https").clearQuery().build()).toString(), uri2.toString()).apply();
        }
    }
}
