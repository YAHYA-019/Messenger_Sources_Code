package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: I7w.class */
public final class I7w {
    public static final Uri A00(Bitmap.CompressFormat compressFormat, Bitmap bitmap, HnB hnB) {
        11T.A0H(hnB, bitmap);
        File A00 = hnB.A00("tmp", ".jpg");
        A01(compressFormat, bitmap, A00, 100);
        return Uri.fromFile(A00);
    }

    public static final void A01(Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file, int i) {
        try {
            FileOutputStream A14 = GOn.A14(file);
            try {
                if (!bitmap.compress(compressFormat, i, A14)) {
                    throw DKE.A0o("cannot compress bitmap to file: ", file.getPath());
                }
                A14.close();
            } finally {
            }
        } catch (IOException unused) {
            throw DKE.A0o("I/O error while loading: ", file.getPath());
        }
    }

    public final void A02(Bitmap.CompressFormat compressFormat, 2EU r303, File file) {
        Bitmap A0C;
        if (!r303.A0A() || (A0C = 7zL.A0C(r303)) == null) {
            throw AnonymousClass001.A0G("Input bitmap is null!");
        }
        A01(compressFormat, A0C, file, 100);
    }
}
