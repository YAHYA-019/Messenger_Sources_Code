package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.io.ByteArrayOutputStream;

/* loaded from: I6M.class */
public abstract class I6M {
    public static final String A00(Bitmap.CompressFormat compressFormat, Bitmap bitmap, 22C r303) {
        11T.A0F(r303, 1);
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
            return (String) r303.A05(byteArray).get();
        }
        return null;
    }

    public static final String A01(Uri uri, 22C r302) {
        String path;
        11T.A0F(r302, 1);
        if (uri == null || (path = uri.getPath()) == null || !AnonymousClass001.A1X(path)) {
            return null;
        }
        String A00 = C7kb.A00(path);
        if (!A00.startsWith("image/") && !A00.startsWith("video/") && !A00.startsWith("audio/") && !"application/pdf".equals(A00)) {
            return null;
        }
        1Um AQV = r302.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new Iar(r302, A0P, path, 16), A0P, false);
        return (String) A0P.get();
    }

    public static final String A02(Uri uri, 22C r302) {
        String path;
        11T.A0F(r302, 1);
        if (uri != null && (path = uri.getPath()) != null) {
            if (!AnonymousClass001.A1X(path)) {
                throw 1BK.A0i("Can't send message for file that does not exist ", uri.getPath());
            }
            String A00 = C7kb.A00(path);
            if (A00.startsWith("image/") || A00.startsWith("video/") || A00.startsWith("audio/") || "application/pdf".equals(A00)) {
                1Um AQV = r302.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0P = 1BK.A0P(AQV);
                1Um.A02(AQV, new Iar(r302, A0P, path, 16), A0P, false);
                Object obj = A0P.get();
                11T.A0A(obj);
                return (String) obj;
            }
        }
        return "";
    }
}
