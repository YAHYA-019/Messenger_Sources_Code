package X;

import android.text.TextUtils;
import com.facebook.http.interfaces.RequestPriority;
import java.io.IOException;
import org.apache.http.client.methods.HttpGet;

/* loaded from: Esv.class */
public final class Esv {
    public final C00i A00 = AbH.A0a();
    public final C00i A01 = 1BQ.A02(17131);

    public void A00(4Yw r302, 5SG r303) {
        StringBuilder A0o = AnonymousClass001.A0o("fb4a");
        A0o.append(".");
        A0o.append(r302.A02);
        A0o.append(".");
        A0o.append(1BL.A08(this.A00));
        String obj = A0o.toString();
        String str = r302.A03;
        String str2 = r302.A00;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        HttpGet httpGet = new HttpGet(str);
        httpGet.addHeader("X-API-KEY", str2);
        httpGet.addHeader("INFO", obj);
        httpGet.addHeader("VERSION", "2");
        AnonymousClass407 A00 = AnonymousClass409.A00("jioHeaderPingRequestMethod", new G7r(r303), httpGet);
        A00.A06 = RequestPriority.INTERACTIVE;
        try {
            ((C2tx) this.A01.get()).A02(A00.A00());
        } catch (IOException e) {
            r303.Bxs(0, e);
        }
    }
}
