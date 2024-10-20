package X;

import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

/* renamed from: X.4YE, reason: invalid class name */
/* loaded from: 4YE.class */
public final class C4YE extends HttpEntityWrapper {
    public final /* synthetic */ HttpEntity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4YE(HttpEntity httpEntity, HttpEntity httpEntity2) {
        super(httpEntity);
        this.A00 = httpEntity2;
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return null;
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public long getContentLength() {
        return -1;
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        HttpEntity httpEntity = this.A00;
        ExecutorService executorService = 4RM.A01;
        PipedInputStream pipedInputStream = new PipedInputStream();
        httpEntity.writeTo(new 4RM(new PipedOutputStream(pipedInputStream), 4RM.A01.submit(new J4x(pipedInputStream, outputStream))));
    }
}
