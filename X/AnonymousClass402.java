package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.acra.util.HttpRequest;
import com.facebook.acra.util.HttpRequestMultipart;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* renamed from: X.402, reason: invalid class name */
/* loaded from: 402.class */
public final class AnonymousClass402 implements HttpEntity, AnonymousClass403 {
    public static final BasicHeader A02 = new BasicHeader(HttpRequestMultipart.CONTENT_TYPE, HttpRequest.POST_CONTENT_TYPE_FORM_URLENCODED);
    public C5el A00;
    public final 07S A01;

    public AnonymousClass402(07S r302) {
        this.A01 = r302;
    }

    public static String A00(07S r301) {
        StringWriter stringWriter = new StringWriter();
        try {
            0Hi.A00().APe(r301, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException("Platform error", e);
        }
    }

    public void A01(C5el c5el) {
        this.A00 = c5el;
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() {
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeTo(byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
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
        return A02;
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
        return false;
    }

    @Override // X.AnonymousClass403
    public void release() {
        this.A01.A02();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.OutputStream, X.40p, java.io.FilterOutputStream] */
    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        outputStream.getClass();
        ?? filterOutputStream = new FilterOutputStream(outputStream);
        if ((outputStream instanceof ByteArrayOutputStream) || (outputStream instanceof BufferedOutputStream)) {
            bufferedOutputStream = null;
            bufferedOutputStream2 = filterOutputStream;
        } else {
            bufferedOutputStream2 = new BufferedOutputStream(filterOutputStream, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
            bufferedOutputStream = bufferedOutputStream2;
        }
        final BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream2;
        0Hi.A00().APe(this.A01, new Writer(bufferedOutputStream3) { // from class: X.40q
            public final OutputStream A00;
            public final String A01;
            public final boolean A02;

            {
                super(bufferedOutputStream3);
                this.A00 = bufferedOutputStream3;
                this.A02 = true;
                this.A01 = "UTF-8";
            }

            private boolean A00(char c) {
                if (c <= 127) {
                    this.A00.write((byte) c);
                    return true;
                }
                if (this.A02) {
                    throw AnonymousClass001.A0L(0Pz.A0J("Non-ASCII character detected: ", c));
                }
                this.A00.write(new String(new char[]{c}).getBytes(this.A01));
                return false;
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.A00.close();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() {
                this.A00.flush();
            }

            @Override // java.io.Writer
            public void write(int i) {
                A00((char) i);
            }

            @Override // java.io.Writer
            public void write(String str) {
                write(str, 0, str.length());
            }

            @Override // java.io.Writer
            public void write(String str, int i, int i2) {
                int i3 = i;
                if ((i | i2) < 0 || i > str.length() - i2) {
                    throw new StringIndexOutOfBoundsException(0Pz.A0q("length=", "; offset=", "; count=", str.length(), i3, i2));
                }
                int i4 = 0;
                while (i4 < i2) {
                    int i5 = i3 + 1;
                    if (!A00(str.charAt(i3)) && i2 - i4 > 0) {
                        this.A00.write(str.substring(i5).getBytes(this.A01));
                        return;
                    } else {
                        i4++;
                        i3 = i5;
                    }
                }
            }

            @Override // java.io.Writer
            public void write(char[] cArr) {
                int length = cArr.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        return;
                    }
                    A00(cArr[i2]);
                    i = i2 + 1;
                }
            }

            @Override // java.io.Writer
            public void write(char[] cArr, int i, int i2) {
                int i3 = i;
                if ((i | i2) < 0 || i > cArr.length - i2) {
                    throw new ArrayIndexOutOfBoundsException(0Pz.A0q("length=", "; offset=", "; count=", cArr.length, i3, i2));
                }
                int i4 = 0;
                while (i4 < i2) {
                    int i5 = i3 + 1;
                    if (!A00(cArr[i3]) && i2 - i4 > 0) {
                        this.A00.write(C3o5.A0Q(cArr, i5, i2).getBytes(this.A01));
                        return;
                    } else {
                        i4++;
                        i3 = i5;
                    }
                }
            }
        });
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
        C5el c5el = this.A00;
        if (c5el != null) {
            c5el.CEJ(filterOutputStream.A00);
        }
    }
}
