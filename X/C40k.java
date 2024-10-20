package X;

import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* renamed from: X.40k, reason: invalid class name */
/* loaded from: 40k.class */
public final class C40k implements HttpEntity, C40l {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C5el A03;
    public final File A04;

    public C40k(C5el c5el, File file, int i, int i2) {
        this(c5el, file, i, i2, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
    }

    public C40k(C5el c5el, File file, int i, int i2, int i3) {
        this.A04 = file;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = Math.max(i3, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
        this.A03 = c5el;
    }

    private void A00(OutputStream outputStream, boolean z) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.A04, "r");
            try {
                randomAccessFile.seek(this.A01);
                int i = this.A02;
                byte[] bArr = new byte[i];
                int i2 = this.A00;
                while (true) {
                    int read = randomAccessFile.read(bArr, 0, Math.min(i2, i));
                    if (read == -1 || i2 <= 0) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i2 -= read;
                    C5el c5el = this.A03;
                    if (c5el != null && z) {
                        c5el.CEJ(i2 - i2);
                    }
                }
                outputStream.flush();
                randomAccessFile.close();
            } finally {
            }
        } catch (FileNotFoundException e) {
            throw new IOException("Cannot find source file", e);
        }
    }

    @Override // X.C40l
    public byte[] ARg() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) getContentLength());
        A00(byteArrayOutputStream, false);
        return byteArrayOutputStream.toByteArray();
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
        return this.A00;
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
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        A00(outputStream, true);
    }
}
