package X;

import com.facebook.auth.credentials.DBLFacebookCredentials;
import com.facebook.auth.credentials.DBLLocalAuthCredentials;
import com.facebook.inject.FbInjector;

/* renamed from: X.4tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4tn.class */
public final class C10514tn {
    public final C00i A07 = new 1BQ(16386);
    public final C00i A00 = new 1BV(100269);
    public final C00i A04 = new 1BQ(33013);
    public final C00i A01 = new 1BV(147847);
    public final C00i A02 = FbInjector.A00;
    public final C00i A06 = new 1BQ(16385);
    public final C00i A05 = new 1BV(65568);
    public final C00i A03 = new 1BQ(16511);

    public static C67b A00(DBLFacebookCredentials dBLFacebookCredentials, DBLLocalAuthCredentials dBLLocalAuthCredentials) {
        String str;
        String str2;
        String str3;
        String str4 = dBLLocalAuthCredentials.accessToken;
        C67b c67b = null;
        if (str4 != null && (str = dBLLocalAuthCredentials.uid) != null && (str2 = dBLFacebookCredentials.mPicUrl) != null && (str3 = dBLFacebookCredentials.mFullName) != null) {
            c67b = new C67b(str4, new C67a(str, str3, str2));
        }
        return c67b;
    }
}
