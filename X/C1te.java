package X;

import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.1te, reason: invalid class name */
/* loaded from: 1te.class */
public abstract class C1te {
    public static void A00(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }
}
