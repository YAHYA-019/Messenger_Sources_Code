package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.TypedValue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: Hzt.class */
public final class Hzt {
    public float A00;
    public long A01;
    public Uri A02;
    public File A03;
    public final int A05;
    public final int A06;
    public final AbR A08 = DKC.A0U(505);
    public final 2DX A07 = GOp.A0H();
    public String A04 = 1BK.A0t();

    public Hzt(Context context, Uri uri, File file, float f, long j) {
        int i;
        int i2;
        this.A02 = uri;
        this.A01 = j;
        this.A00 = f;
        this.A03 = file;
        if (0AU.A00(24)) {
            i = 100;
        } else {
            i = 50;
            if (0AU.A00(21)) {
                i = 75;
            }
        }
        this.A06 = (int) TypedValue.applyDimension(1, i, 7zO.A0I(context));
        if (0AU.A00(24)) {
            i2 = 500;
        } else {
            i2 = 2000;
            if (0AU.A00(21)) {
                i2 = 1000;
            }
        }
        int i3 = i2;
        long j2 = this.A01;
        if (j2 > 10000) {
            i3 = i2 * 4;
            if (j2 <= 120000) {
                i3 = i2 * 2;
            }
        }
        this.A05 = i3;
    }

    public static void A00(Hzt hzt, Hgm hgm, int i) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(hzt.A03.getPath());
        A0k.append(File.separator);
        A0k.append("video_editing_frame_");
        A0k.append(hzt.A04);
        String A0e = AnonymousClass001.A0e("_", A0k, i);
        File A0E = AnonymousClass001.A0E(0Pz.A0W(A0e, ".jpg"));
        if (A0E.exists()) {
            return;
        }
        try {
            float f = hzt.A00;
            2EU A02 = hgm.A03.A02(f, i);
            11T.A0A(A02);
            A02.A09();
            Bitmap A0C = 7zL.A0C(A02);
            int i2 = hzt.A06;
            float f2 = i2;
            float width = f2 / A0C.getWidth();
            Matrix A0F = GOn.A0F();
            A0F.setScale(width, width);
            2EU A04 = hzt.A07.A04(i2, (int) (f2 / f));
            7zR.A0B(A04).drawBitmap(A0C, A0F, null);
            A02.close();
            A04.A09();
            try {
                try {
                    File A0E2 = AnonymousClass001.A0E(0Pz.A0W(A0e, ".tmp"));
                    FileOutputStream A14 = GOn.A14(A0E2);
                    7zL.A0C(A04).compress(Bitmap.CompressFormat.JPEG, 30, A14);
                    A14.close();
                    A0E2.renameTo(A0E);
                } catch (IOException e) {
                    0fH.A0r("VideoEditGalleryFrameExtractor", "Couldn't save bitmap file", e);
                }
            } finally {
                A04.close();
            }
        } catch (IOException e2) {
            0fH.A0r("VideoEditGalleryFrameExtractor", "Unable to extract frame", e2);
        }
    }
}
