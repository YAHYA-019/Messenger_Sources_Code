package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Set;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.3Pr, reason: invalid class name */
/* loaded from: 3Pr.class */
public final class C3Pr {
    public final Set A00;

    public C3Pr(Set set) {
        this.A00 = set;
    }

    public static ArrayList A00(C3Pr c3Pr) {
        ArrayList A0s = AnonymousClass001.A0s();
        String A00 = C3Xg.A00("download_uri", "hash", PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        Set set = c3Pr.A00;
        A0s.add(new BasicNameValuePair("hashes", C3Xg.A00((String[]) set.toArray(new String[set.size()]))));
        A0s.add(new BasicNameValuePair("fields", A00));
        return A0s;
    }
}
