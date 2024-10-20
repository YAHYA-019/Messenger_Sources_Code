package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.base.Function;
import com.google.common.base.Throwables;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: Imc.class */
public final class Imc implements Function {
    public final HnB A00;
    public final Hk8 A01;
    public final /* synthetic */ Hz6 A02;

    public Imc(HnB hnB, Hz6 hz6, Hk8 hk8) {
        this.A02 = hz6;
        this.A01 = hk8;
        this.A00 = hnB;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        Hz6 hz6 = this.A02;
        hz6.A02.AAq();
        File A00 = this.A00.A00("orca-image-", ".jpg");
        try {
            FileOutputStream A14 = GOn.A14(A00);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 85, A14);
                A14.close();
                return Hz6.A00(Uri.fromFile(A00), hz6, this.A01, "image/jpeg");
            } finally {
            }
        } catch (IOException e) {
            hz6.A01.D0v("QuickCamPopup", "Probably not enough space to make a temp file");
            Throwables.propagate(e);
            throw 0Q8.createAndThrow();
        }
    }
}
