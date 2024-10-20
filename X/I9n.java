package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: I9n.class */
public final class I9n {
    public static Uri A00(Bitmap bitmap) {
        C02353ux c02353ux;
        int i;
        int i2;
        5R6 r0 = (5R6) 1Bi.A03(49723);
        try {
            String obj = C04I.A00().toString();
            File A0D = AnonymousClass001.A0D(5R6.A01(r0), "custom_stickers");
            A0D.mkdirs();
            if (!A0D.exists()) {
                throw new FileNotFoundException(AnonymousClass001.A0Z(A0D, 4YT.A00(1021), AnonymousClass001.A0k()));
            }
            File A02 = 0Pz.A02(obj, ".webp", A0D);
            FileOutputStream A14 = GOn.A14(A02);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 512 || height > 512) {
                float f = width / height;
                if (f > 1.0f) {
                    i = 512;
                    i2 = (int) (512.0f / f);
                } else {
                    i = (int) (512.0f * f);
                    i2 = 512;
                }
                c02353ux = AbstractC02343uw.A01(i, i2);
            } else {
                c02353ux = null;
            }
            if (c02353ux != null) {
                int i3 = c02353ux.A03;
                int i4 = c02353ux.A02;
                0gF.A00(bitmap);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i4, false);
                createScaledBitmap.compress(Bitmap.CompressFormat.WEBP, 100, A14);
                createScaledBitmap.recycle();
            } else {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, A14);
            }
            A14.flush();
            return Uri.fromFile(A02);
        } catch (IOException e) {
            0fH.A0r(4YT.A00(ActionId.DATA_LOAD_START), "Error creating sticker uri", e);
            return null;
        }
    }

    public static String A01(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            byte[] bArr = new byte[openInputStream.available()];
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read <= 0) {
                        return Base64.encodeToString(messageDigest.digest(), 2);
                    }
                    messageDigest.update(bArr, 0, read);
                }
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } catch (IOException e2) {
            0fH.A0r(4YT.A00(ActionId.DATA_LOAD_START), "Error creating hash", e2);
            return null;
        }
    }

    public static void A02(Context context, FbUserSession fbUserSession, Sticker sticker) {
        Uri uri = sticker.A08;
        if (uri == null || uri.getPath() == null) {
            return;
        }
        File A11 = GOp.A11(uri);
        69H r0 = (69H) 1Lo.A04(context, fbUserSession, (1BY) null, 49969);
        5R0 r02 = (5R0) 1Bi.A03(82988);
        r0.A0B(ImmutableList.of((Object) sticker));
        r02.A0D(5R2.A05, A11, sticker.A0F);
    }
}
