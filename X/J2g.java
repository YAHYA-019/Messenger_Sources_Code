package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.FaceDetector;
import com.facebook.messaging.camerautil.CropImage;

/* loaded from: J2g.class */
public final class J2g implements Runnable {
    public static final String __redex_internal_original_name = "CropImage$6";
    public int A01;
    public Matrix A02;
    public final /* synthetic */ CropImage A04;
    public float A00 = 1.0f;
    public FaceDetector.Face[] A03 = new FaceDetector.Face[3];

    public J2g(CropImage cropImage) {
        this.A04 = cropImage;
    }

    @Override // java.lang.Runnable
    public void run() {
        Bitmap A0K;
        CropImage cropImage = this.A04;
        this.A02 = cropImage.A08.getImageMatrix();
        Bitmap bitmap = cropImage.A06;
        if (bitmap == null) {
            A0K = null;
        } else {
            if (bitmap.getWidth() > 256) {
                this.A00 = 256.0f / cropImage.A06.getWidth();
            }
            Matrix A0F = GOn.A0F();
            float f = this.A00;
            A0F.setScale(f, f);
            Bitmap bitmap2 = cropImage.A06;
            A0K = GOq.A0K(bitmap2, A0F, bitmap2.getWidth(), cropImage.A06.getHeight());
        }
        this.A00 = 1.0f / this.A00;
        if (A0K != null) {
            this.A01 = new FaceDetector(A0K.getWidth(), A0K.getHeight(), 3).findFaces(A0K, this.A03);
            if (A0K != cropImage.A06) {
                A0K.recycle();
            }
        }
        cropImage.A0G.post(new Iq2(this));
    }
}
