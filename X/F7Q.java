package X;

import com.facebook.http.interfaces.RequestPriority;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.HttpClientParams;

/* loaded from: F7Q.class */
public final class F7Q {
    public static final ResponseHandler A01 = new G7p();
    public final C2tx A00 = (C2tx) 1Bi.A03(17131);

    public HttpResponse A00(String str) {
        HttpGet httpGet = new HttpGet(str);
        HttpClientParams.setRedirecting(httpGet.getParams(), false);
        AnonymousClass407 A00 = AnonymousClass409.A00("CarrierSignalRequestMethod", A01, httpGet);
        A00.A06 = RequestPriority.INTERACTIVE;
        return (HttpResponse) this.A00.A02(A00.A00());
    }
}
