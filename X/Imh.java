package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.base.Function;
import com.google.common.base.Throwables;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: Imh.class */
public final class Imh implements Function {
    public String A00;
    public final HnB A01;
    public final Hk8 A02;
    public final /* synthetic */ Hz6 A03;

    public Imh(HnB hnB, Hz6 hz6, Hk8 hk8, String str) {
        this.A03 = hz6;
        this.A02 = hk8;
        this.A00 = str;
        this.A01 = hnB;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        Hz6 hz6 = this.A03;
        hz6.A02.AAq();
        String str = this.A00;
        boolean isEmpty = str.isEmpty();
        HnB hnB = this.A01;
        File A01 = !isEmpty ? ((C3RB) hnB.A01.get()).A01(0Pz.A0j("orca-image-", str, ".jpeg"), 594169501) : hnB.A00("orca-image-", ".jpeg");
        try {
            FileOutputStream A14 = GOn.A14(A01);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 85, A14);
                A14.close();
                return Hz6.A00(Uri.fromFile(A01), hz6, this.A02, "image/jpeg");
            } finally {
            }
        } catch (IOException e) {
            hz6.A01.D0v("QuickCamPopup", "Probably not enough space to make a temp file");
            Throwables.propagate(e);
            throw 0Q8.createAndThrow();
        }
    }
}
