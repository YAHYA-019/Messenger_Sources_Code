package X;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: Kyc.class */
public abstract class Kyc {
    public static final Pattern A00 = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final Pattern A01 = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    public static final Pattern A02 = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v0 */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v2, types: [java.util.AbstractMap] */
    public static java.util.Map A00(URI uri) {
        String str;
        java.util.Map emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = AnonymousClass001.A0u();
            Kg0 kg0 = new Kg0(new K5s('='));
            KRX krx = K5t.A00;
            LsT k5r = new K5r(krx, new Kg0(new K5s('&')), rawQuery, true);
            while (k5r.hasNext()) {
                String A0i = AnonymousClass001.A0i(k5r);
                A0i.getClass();
                LsT k5r2 = new K5r(krx, kg0, A0i, false);
                ArrayList A0s = AnonymousClass001.A0s();
                while (k5r2.hasNext()) {
                    JQx.A1S(A0s, k5r2);
                }
                List unmodifiableList = Collections.unmodifiableList(A0s);
                if (unmodifiableList.isEmpty() || unmodifiableList.size() > 2) {
                    throw AnonymousClass001.A0L("bad parameter");
                }
                try {
                    String decode = URLDecoder.decode(1BK.A14(unmodifiableList, 0), "UTF-8");
                    if (unmodifiableList.size() == 2) {
                        try {
                            str = URLDecoder.decode(1BK.A14(unmodifiableList, 1), "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            throw new IllegalArgumentException(e);
                        }
                    } else {
                        str = null;
                    }
                    emptyMap.put(decode, str);
                } catch (UnsupportedEncodingException e2) {
                    throw new IllegalArgumentException(e2);
                }
            }
        }
        return emptyMap;
    }
}
