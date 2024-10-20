package X;

import com.facebook.acra.util.HttpRequestMultipart;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.util.ByteArrayBuffer;

/* renamed from: X.4CH, reason: invalid class name */
/* loaded from: 4CH.class */
public final class C4CH {
    public static final ByteArrayBuffer A04;
    public static final ByteArrayBuffer A05;
    public static final ByteArrayBuffer A06;
    public final Integer A00;
    public final String A01;
    public final List A02;
    public final Charset A03;

    static {
        Charset charset = 4CI.A00;
        A05 = A00(": ", charset);
        A04 = A00(HttpRequestMultipart.LINE_FEED, charset);
        A06 = A00("--", charset);
    }

    public C4CH(Integer num, String str) {
        if (str == null) {
            throw AnonymousClass001.A0L("Multipart boundary may not be null");
        }
        this.A03 = 4CI.A00;
        this.A01 = str;
        this.A02 = new ArrayList();
        this.A00 = num;
    }

    public static ByteArrayBuffer A00(String str, Charset charset) {
        ByteBuffer encode = charset.encode(CharBuffer.wrap(str));
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(encode.remaining());
        byteArrayBuffer.append(encode.array(), encode.position(), encode.remaining());
        return byteArrayBuffer;
    }

    public static void A01(C4CH c4ch, OutputStream outputStream, Integer num, boolean z) {
        Charset charset = c4ch.A03;
        ByteArrayBuffer A00 = A00(c4ch.A01, charset);
        for (C4C4 c4c4 : c4ch.A02) {
            A02(outputStream, A06);
            A02(outputStream, A00);
            ByteArrayBuffer byteArrayBuffer = A04;
            A02(outputStream, byteArrayBuffer);
            C4C5 c4c5 = c4c4.A00;
            int intValue = num.intValue();
            if (intValue == 0) {
                Iterator it = c4c5.iterator();
                while (it.hasNext()) {
                    C4C7 c4c7 = (C4C7) it.next();
                    String str = c4c7.A00;
                    Charset charset2 = 4CI.A00;
                    A02(outputStream, A00(str, charset2));
                    A02(outputStream, A05);
                    A02(outputStream, A00(c4c7.A01, charset2));
                    A02(outputStream, byteArrayBuffer);
                }
            } else if (intValue == 1) {
                C4C7 c4c72 = null;
                Locale locale = Locale.US;
                String lowerCase = HttpRequestMultipart.CONTENT_DISPOSITION.toLowerCase(locale);
                java.util.Map map = c4c5.A01;
                List list = (List) map.get(lowerCase);
                if (list != null && !list.isEmpty()) {
                    c4c72 = (C4C7) 1BK.A0r(list);
                }
                A02(outputStream, A00(c4c72.A00, charset));
                ByteArrayBuffer byteArrayBuffer2 = A05;
                A02(outputStream, byteArrayBuffer2);
                A02(outputStream, A00(c4c72.A01, charset));
                A02(outputStream, byteArrayBuffer);
                if (c4c4.A01.A02() != null) {
                    C4C7 c4c73 = null;
                    List list2 = (List) map.get(HttpRequestMultipart.CONTENT_TYPE.toLowerCase(locale));
                    if (list2 != null && !list2.isEmpty()) {
                        c4c73 = (C4C7) 1BK.A0r(list2);
                    }
                    A02(outputStream, A00(c4c73.A00, charset));
                    A02(outputStream, byteArrayBuffer2);
                    A02(outputStream, A00(c4c73.A01, charset));
                    A02(outputStream, byteArrayBuffer);
                }
            }
            A02(outputStream, byteArrayBuffer);
            if (z) {
                c4c4.A01.A04(outputStream);
            }
            A02(outputStream, byteArrayBuffer);
        }
        ByteArrayBuffer byteArrayBuffer3 = A06;
        A02(outputStream, byteArrayBuffer3);
        A02(outputStream, A00);
        A02(outputStream, byteArrayBuffer3);
        A02(outputStream, A04);
    }

    public static void A02(OutputStream outputStream, ByteArrayBuffer byteArrayBuffer) {
        outputStream.write(byteArrayBuffer.buffer(), 0, byteArrayBuffer.length());
    }
}
