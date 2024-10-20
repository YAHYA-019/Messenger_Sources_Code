package X;

import android.graphics.Bitmap;
import com.facebook.messaging.camerautil.CropImage;

/* loaded from: Iw4.class */
public final class Iw4 implements Runnable {
    public static final String __redex_internal_original_name = "CropImage$5";
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ CropImage A01;

    public Iw4(Bitmap bitmap, CropImage cropImage) {
        this.A01 = cropImage;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A08.setImageBitmap(null);
        this.A00.recycle();
    }
}
