package X;

import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* renamed from: X.4Xq, reason: invalid class name */
/* loaded from: 4Xq.class */
public final class C4Xq implements HttpEntity {
    public C5el A00;
    public final InputStream A01;

    public C4Xq(C5el c5el, InputStream inputStream) {
        this.A01 = inputStream;
        this.A00 = c5el;
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() {
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        throw AnonymousClass001.A0q("Unsupported");
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return null;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return -1;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return new BasicHeader(HttpRequestMultipart.CONTENT_TYPE, "application/octet-stream");
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        try {
            try {
                byte[] bArr = new byte[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
                while (true) {
                    InputStream inputStream = this.A01;
                    int read = inputStream.read(bArr, 0, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
                    if (read == -1) {
                        outputStream.flush();
                        inputStream.close();
                        return;
                    } else {
                        outputStream.write(bArr, 0, read);
                        C5el c5el = this.A00;
                        if (c5el != null) {
                            c5el.CEJ(0L);
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                throw new IOException("Cannot find source file", e);
            }
        } catch (Throwable th) {
            this.A01.close();
            throw th;
        }
    }
}
