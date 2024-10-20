package X;

import com.google.common.base.Optional;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.5hh, reason: invalid class name */
/* loaded from: 5hh.class */
public final class C5hh {
    public final C5he A00;

    public C5hh(C5he c5he) {
        this.A00 = c5he;
    }

    public final ArrayList A00() {
        String str;
        ArrayList arrayList = new ArrayList();
        String A00 = 1BJ.A00(79);
        C5he c5he = this.A00;
        arrayList.add(new BasicNameValuePair(A00, String.valueOf(c5he.A00)));
        arrayList.add(new BasicNameValuePair("app_locale", c5he.A03));
        arrayList.add(new BasicNameValuePair("app_user_id", c5he.A04));
        Optional optional = c5he.A01;
        if (optional.isPresent()) {
            arrayList.add(new BasicNameValuePair("lp_checksum", (String) optional.get()));
        }
        Optional optional2 = c5he.A02;
        if (optional2.isPresent()) {
            arrayList.add(new BasicNameValuePair("ota_build_number", String.valueOf(optional2.get())));
        }
        C03353xs c03353xs = new C03353xs(C26T.A00);
        for (Integer num : 0S2.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str = "lp_checksum";
                    break;
                case 2:
                    str = "lp_content";
                    break;
                default:
                    str = "lp_status";
                    break;
            }
            c03353xs.A0e(str);
        }
        arrayList.add(new BasicNameValuePair("fields", c03353xs.toString()));
        return arrayList;
    }
}
