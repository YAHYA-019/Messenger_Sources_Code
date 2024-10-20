package X;

import android.net.Uri;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;

/* loaded from: Hvw.class */
public abstract class Hvw {
    public static Integer A00(Uri uri) {
        Integer A01 = A01(uri);
        if (A01 != null) {
            return A01;
        }
        throw AnonymousClass001.A0L(0Pz.A0v("Scheme not recognized: ", uri.getScheme(), " URI : ", uri.toString()));
    }

    public static Integer A01(Uri uri) {
        if (uri.getScheme() == null) {
            return null;
        }
        String scheme = uri.getScheme();
        switch (scheme.hashCode()) {
            case 3143036:
                if (scheme.equals("file")) {
                    return 0S2.A01;
                }
                return null;
            case 3213448:
                if (scheme.equals("http")) {
                    return 0S2.A0C;
                }
                return null;
            case 3361600:
                if (scheme.equals(DGWRegionHintManager.SERVICE_KEY_MSYS)) {
                    return 0S2.A0N;
                }
                return null;
            case 99617003:
                if (scheme.equals("https")) {
                    return 0S2.A0Y;
                }
                return null;
            case 951530617:
                if (scheme.equals("content")) {
                    return 0S2.A00;
                }
                return null;
            default:
                return null;
        }
    }
}
