package X;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* renamed from: X.40n, reason: invalid class name */
/* loaded from: 40n.class */
public final class C40n extends AbstractHttpEntity {
    public final long A00;
    public final 3Jd A01;

    public C40n(3Jd r302, long j) {
        this.A01 = r302;
        this.A00 = j;
    }

    public 3Jd A00() {
        return this.A01;
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        return null;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.A00;
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
    }
}
