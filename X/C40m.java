package X;

import com.facebook.acra.util.HttpRequestMultipart;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* renamed from: X.40m, reason: invalid class name */
/* loaded from: 40m.class */
public final class C40m implements HttpEntity {
    public C5el A00;
    public final int A01;
    public final 4RJ A02;

    public C40m(4RJ r302, C5el c5el, int i) {
        this.A02 = r302;
        this.A01 = i;
        this.A00 = c5el;
    }

    public int A00() {
        return this.A01;
    }

    public 4RJ A01() {
        return this.A02;
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
        return new BasicHeader(HttpRequestMultipart.CONTENT_TYPE, 4YT.A00(466));
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return true;
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
        throw AnonymousClass001.A0q("should not be used");
    }
}
