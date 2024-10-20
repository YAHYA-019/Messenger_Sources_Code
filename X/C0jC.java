package X;

import com.facebook.acra.util.HttpRequestMultipart;
import java.io.OutputStream;

/* renamed from: X.0jC, reason: invalid class name */
/* loaded from: 0jC.class */
public abstract class C0jC {
    public static int A00;

    public static void A00(OutputStream outputStream, String str, String str2, String str3) {
        outputStream.write(String.format("--%s\r\nContent-Disposition: %s\"%s\"\r\nContent-Type: application/binary\r\nContent-Transfer-Encoding: binary\r\n\r\n", str3, HttpRequestMultipart.CONTENT_DISPOSITION_FORM_DATA, str).getBytes());
        outputStream.write(str2.getBytes("UTF-8"));
        outputStream.write(HttpRequestMultipart.LINE_FEED.getBytes());
    }
}
