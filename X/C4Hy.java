package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;

/* renamed from: X.4Hy, reason: invalid class name */
/* loaded from: 4Hy.class */
public final class C4Hy implements ResponseHandler {
    public final DataTask A00;
    public final NetworkSession A01;
    public final UrlRequest A02;
    public final ByteArrayOutputStream A03;
    public final File A04;
    public final String A05;
    public final boolean A06;
    public final String A07;

    public C4Hy(DataTask dataTask, NetworkSession networkSession, UrlRequest urlRequest, ByteArrayOutputStream byteArrayOutputStream, File file, String str, String str2, boolean z) {
        if (file == null && byteArrayOutputStream == null) {
            throw AnonymousClass001.A0N("Both downloadResponseDirectory and outputStream cannot but null");
        }
        this.A00 = dataTask;
        this.A06 = z;
        this.A07 = str;
        this.A01 = networkSession;
        this.A02 = urlRequest;
        this.A05 = str2;
        this.A04 = file;
        this.A03 = byteArrayOutputStream;
    }

    @Override // org.apache.http.client.ResponseHandler
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        C00j.A05("HTTP.handleResponse", 261760912);
        HttpEntity entity = httpResponse.getEntity();
        entity.getClass();
        StatusLine statusLine = httpResponse.getStatusLine();
        statusLine.getClass();
        int statusCode = statusLine.getStatusCode();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(entity.getContent());
        ByteArrayOutputStream byteArrayOutputStream = this.A03;
        File file = null;
        OutputStream outputStream = byteArrayOutputStream;
        if (byteArrayOutputStream == null) {
            file = File.createTempFile("NetworkSessionDownload", null, this.A04);
            outputStream = new FileOutputStream(file);
        }
        UrlResponse urlResponse = UrlResponse.$redex_init_class;
        UrlRequest urlRequest = this.A02;
        Header[] allHeaders = httpResponse.getAllHeaders();
        allHeaders.getClass();
        UrlResponse urlResponse2 = new UrlResponse(urlRequest, statusCode, NetworkUtils.flattenHeaders(allHeaders));
        try {
            try {
                long contentLength = entity.getContentLength();
                byte[] bArr = new byte[10240];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i += read;
                    if (this.A06) {
                        Execution.executeAsync(new 4QH(this, read, i, contentLength), null, 3);
                    }
                }
            } catch (IOException unused) {
                C1jS.A05(httpResponse);
            }
            bufferedInputStream.close();
            outputStream.close();
            String str = this.A05;
            0fH.A0g(Integer.valueOf(statusCode), str, "Finish Msys Tigon dataTask response, %d");
            if (byteArrayOutputStream != null) {
                NetworkUtils.markDataTaskCompleted(this.A00, this.A01, urlResponse2, str, byteArrayOutputStream.toByteArray(), null, null);
            } else if (file != null) {
                NetworkUtils.markDataTaskCompleted(this.A00, this.A01, urlResponse2, str, null, file, null);
            }
            C00j.A01(-1570481919);
            return urlResponse2;
        } catch (Throwable th) {
            bufferedInputStream.close();
            outputStream.close();
            throw th;
        }
    }
}
