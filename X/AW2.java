package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.widget.ImageView;
import kotlin.jvm.functions.Function2;

/* loaded from: AW2.class */
public final class AW2 extends C00q implements Function2 {
    public static final AW2 A00 = new AW2();

    public AW2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C9sl c9sl = (C9sl) obj;
        9cW r0 = (9cW) obj2;
        boolean A1X = 1BL.A1X(c9sl, r0);
        String str = r0.A02;
        Uri A03 = (str == null || str.length() == 0) ? r0.A00 : C0A2.A03(str);
        11T.A0D(A03);
        Context A002 = 3vP.A00(c9sl);
        11T.A0F(A03, A1X ? 1 : 0);
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(A002.getContentResolver(), A03));
        11T.A0D(decodeBitmap);
        11T.A0F(decodeBitmap, 0);
        5BZ r02 = new 5BZ(decodeBitmap);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        2lQ r03 = 2lO.A02;
        return new C8ij(null, null, scaleType, null, null, r02, null, 7zT.A0I(7zT.A0i((2lO) null, 0S2.A00, Double.doubleToRawLongBits(50.0d)), 2.0d), "MEmuPickedImagesButtonBarComponent", 0);
    }
}
