package X;

import com.facebook.acra.util.HttpRequestMultipart;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.5oi, reason: invalid class name */
/* loaded from: 5oi.class */
public abstract class C5oi extends C4C3 {
    public final String A00;
    public final long[] A01;

    public C5oi(String str, long[] jArr) {
        super(AnonymousClass000.A00(93));
        this.A01 = jArr;
        this.A00 = str;
    }

    @Override // X.C4C3
    public long A00() {
        return -1;
    }

    @Override // X.C4C3
    public String A01() {
        return null;
    }

    @Override // X.C4C3
    public String A02() {
        return this.A00;
    }

    @Override // X.C4C3
    public String A03() {
        return HttpRequestMultipart.CONTENT_TRANSFER_ENCODING_BINARY;
    }

    @Override // X.C4C3
    public void A04(final OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FilterOutputStream(outputStream) { // from class: X.5ol
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        });
        DataOutputStream dataOutputStream = new DataOutputStream(gZIPOutputStream);
        long[] jArr = this.A01;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                gZIPOutputStream.close();
                return;
            } else {
                dataOutputStream.writeLong(jArr[i2]);
                i = i2 + 1;
            }
        }
    }
}
