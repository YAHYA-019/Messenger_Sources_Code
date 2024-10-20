package X;

import com.facebook.acra.util.HttpRequestMultipart;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* renamed from: X.411, reason: invalid class name */
/* loaded from: 411.class */
public abstract class AnonymousClass411 implements HttpEntity {
    public static final char[] A04 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public long A00;
    public final C4CH A01;
    public final Header A02;
    public volatile boolean A03;

    public AnonymousClass411() {
        Integer num = 0S2.A00;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int nextInt = random.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            char[] cArr = A04;
            sb.append(cArr[random.nextInt(cArr.length)]);
        }
        String obj = sb.toString();
        this.A01 = new C4CH(num, obj);
        this.A02 = new BasicHeader(HttpRequestMultipart.CONTENT_TYPE, 0Pz.A0W("multipart/form-data; boundary=", obj));
        this.A03 = true;
    }

    public void A00(C4C3 c4c3, String str) {
        this.A01.A02.add(new C4C4(c4c3, str));
        this.A03 = true;
    }

    public C4C4[] A01() {
        List list = this.A01.A02;
        C4C4[] c4c4Arr = new C4C4[list.size()];
        list.toArray(c4c4Arr);
        return c4c4Arr;
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() {
        if (isStreaming()) {
            throw AnonymousClass001.A0q("Streaming entity does not implement #consumeContent()");
        }
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        throw AnonymousClass001.A0q("Multipart form entity does not implement #getContent()");
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return null;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        long j;
        if (this.A03) {
            C4CH c4ch = this.A01;
            Iterator it = c4ch.A02.iterator();
            long j2 = 0;
            while (true) {
                long j3 = j2;
                if (it.hasNext()) {
                    long A00 = ((C4C4) it.next()).A01.A00();
                    if (A00 < 0) {
                        j = -1;
                        break;
                    }
                    j2 = j3 + A00;
                } else {
                    try {
                        C4CH.A01(c4ch, new 4RR(), c4ch.A00, false);
                        j = j3 + r0.A00;
                        break;
                    } catch (IOException unused) {
                        j = -1;
                    }
                }
            }
            this.A00 = j;
            this.A03 = false;
        }
        return this.A00;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.A02;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return !isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        Iterator it = this.A01.A02.iterator();
        while (it.hasNext()) {
            if (((C4C4) it.next()).A01.A00() < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return !isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        C4CH c4ch = this.A01;
        C4CH.A01(c4ch, outputStream, c4ch.A00, true);
    }
}
