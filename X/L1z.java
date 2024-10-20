package X;

import android.os.Bundle;
import com.google.common.base.Platform;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* loaded from: L1z.class */
public final class L1z {
    public 1BY A00;
    public final AbR A01 = (AbR) 1Bn.A0B(339);

    public L1z(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static final L1z A00(1BO r301) {
        return new L1z(r301);
    }

    public boolean A01(Bundle bundle, String str, List list) {
        if (Platform.stringIsNullOrEmpty(str)) {
            return false;
        }
        try {
            URI uri = new URI(str);
            if (uri.getHost() == null || uri.getScheme() == null || !uri.getScheme().equalsIgnoreCase("https")) {
                return false;
            }
            if (uri.getPort() != 443 && uri.getPort() != -1) {
                return false;
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    URI create = URI.create(AnonymousClass001.A0i(it));
                    if (create != null && create.getHost() != null && create.getHost().equals(uri.getHost())) {
                        return true;
                    }
                }
            }
            Km8 A01 = this.A01.A01(bundle);
            String A0W = 0Pz.A0W("Url not safe for extension: ", str);
            for (IMd iMd : A01.A06) {
                if (iMd.BNb(bundle)) {
                    iMd.A02("BrowserExtensionsHelpers", A0W, (String) null);
                }
            }
            return false;
        } catch (URISyntaxException unused) {
            return false;
        }
    }
}
