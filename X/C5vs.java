package X;

import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.http.interfaces.RequestPriority;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.HttpClientParams;

/* renamed from: X.5vs, reason: invalid class name */
/* loaded from: 5vs.class */
public final class C5vs {
    public static final ResponseHandler A01 = new ResponseHandler() { // from class: X.5vt
        @Override // org.apache.http.client.ResponseHandler
        public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
            return httpResponse;
        }
    };
    public final C2tx A00 = (C2tx) 1Bi.A03(17131);

    public HttpResponse A00(String str) {
        HttpGet httpGet = new HttpGet(str);
        httpGet.setHeader(HttpRequestMultipart.USER_AGENT, "FB-ZeroBalance");
        HttpClientParams.setRedirecting(httpGet.getParams(), false);
        AnonymousClass407 A00 = AnonymousClass409.A00("ZeroBalancePingRequestMethod", A01, httpGet);
        A00.A06 = RequestPriority.INTERACTIVE;
        return (HttpResponse) this.A00.A02(A00.A00());
    }
}
