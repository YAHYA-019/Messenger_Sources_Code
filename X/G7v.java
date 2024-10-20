package X;

import java.io.BufferedInputStream;
import java.io.File;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;

/* loaded from: G7v.class */
public final class G7v implements ResponseHandler {
    public final File A00;
    public final /* synthetic */ C66f A01;

    public /* synthetic */ G7v(C66f c66f, File file) {
        this.A01 = c66f;
        this.A00 = file;
    }

    @Override // org.apache.http.client.ResponseHandler
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        StatusLine statusLine = httpResponse.getStatusLine();
        int statusCode = statusLine.getStatusCode();
        HttpEntity entity = httpResponse.getEntity();
        if (statusCode != 200) {
            throw new HttpResponseException(statusCode, statusLine.getReasonPhrase());
        }
        if (entity == null) {
            throw new ClientProtocolException(4YT.A00(695));
        }
        String A01 = C2tz.A01(httpResponse);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(entity.getContent());
        try {
            C66f.A05(this.A01, bufferedInputStream, this.A00, "image/webp".equals(A01));
            bufferedInputStream.close();
            return null;
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }
}
