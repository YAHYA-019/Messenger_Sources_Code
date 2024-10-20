package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Kve.class */
public abstract class Kve {
    public static ArrayList A00(List list, Set set) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutofillData autofillData = (AutofillData) it.next();
            if (2Ri.A07(new Lf4(set, 2), JQz.A0v(autofillData).keySet()) != null) {
                A0s.add(autofillData);
            }
        }
        return A0s;
    }

    public static boolean A01(String str, Set set) {
        if (set.contains(str)) {
            return true;
        }
        if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(str) && set.contains("cc-name")) {
            return true;
        }
        if ("family-name".equals(str) && set.contains("cc-family-name")) {
            return true;
        }
        return "given-name".equals(str) && set.contains("cc-given-name");
    }
}
