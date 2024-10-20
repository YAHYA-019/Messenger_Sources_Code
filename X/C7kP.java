package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.7kP, reason: invalid class name */
/* loaded from: 7kP.class */
public abstract class C7kP {
    public static final String A00(Set set) {
        11T.A0F(set, 0);
        Set A0e = 0QD.A0e(0QD.A0U(0QD.A0V(set)));
        List asList = Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ent_id", JQw.A00(350));
        11T.A0A(asList);
        A0e.removeAll(0QD.A0f(asList));
        String join = TextUtils.join(", ", A0e);
        11T.A0A(join);
        return join;
    }
}
