package X;

import android.graphics.Bitmap;
import com.facebook.messaging.camerautil.CropImage;
import java.util.concurrent.CountDownLatch;

/* loaded from: J08.class */
public final class J08 implements Runnable {
    public static final String __redex_internal_original_name = "CropImage$3$1";
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Iq1 A01;
    public final /* synthetic */ CountDownLatch A02;

    public J08(Bitmap bitmap, Iq1 iq1, CountDownLatch countDownLatch) {
        this.A01 = iq1;
        this.A00 = bitmap;
        this.A02 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        Bitmap bitmap = this.A00;
        CropImage cropImage = this.A01.A00;
        if (bitmap != cropImage.A06 && bitmap != null) {
            cropImage.A08.setImageBitmap(bitmap);
            cropImage.A06.recycle();
            cropImage.A06 = bitmap;
        }
        this.A02.countDown();
    }
}
