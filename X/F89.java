package X;

import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.inject.FbInjector;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;

/* loaded from: F89.class */
public final class F89 {
    public static final Pattern A05 = Pattern.compile("ni=[A-Za-z1-9_-]*");
    public final C00i A04 = 1BQ.A02(17131);
    public final C00i A01 = FbInjector.A00;
    public final C00i A00 = 1BV.A00(99427);
    public final C00i A03 = AbH.A0E();
    public final C00i A02 = AbH.A0S();

    public void A00(5SG r302, String str, String str2, boolean z) {
        if (!z) {
            HttpGet httpGet = new HttpGet(str);
            httpGet.addHeader(HttpRequestMultipart.USER_AGENT, "");
            AnonymousClass407 A00 = AnonymousClass409.A00("headersHPingRequestMethod", new G7q(r302), httpGet);
            A00.A06 = RequestPriority.INTERACTIVE;
            try {
                ((C2tx) this.A04.get()).A02(A00.A00());
                return;
            } catch (IOException e) {
                r302.Bxs(0, e);
                return;
            }
        }
        String replaceFirst = A05.matcher(str).replaceFirst("ni=mobile");
        HashMap A0u = AnonymousClass001.A0u();
        if (1BK.A04(this.A01).getSystemService("connectivity") == null) {
            r302.Bxs(0, new IOException("Could not request cellular network"));
            return;
        }
        A0u.put(4YT.A00(1604), ConstantsKt.CAMERA_ID_BACK);
        String BD0 = 1BK.A0R(this.A02).BD0(DKC.A0b(1Ky.A11));
        if (BD0 != null) {
            A0u.put(4YT.A00(1603), BD0);
        }
        1FV A002 = ((FcK) this.A00.get()).A00(0S2.A01, replaceFirst, (String) null, str2, A0u);
        1Kd.A0D(this.A03, FwJ.A00(r302, this, 10), A002);
    }
}
