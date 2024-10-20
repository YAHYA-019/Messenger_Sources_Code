package X;

import com.facebook.messaging.camerautil.CropImage;
import java.util.concurrent.CountDownLatch;

/* loaded from: Iq1.class */
public final class Iq1 implements Runnable {
    public static final String __redex_internal_original_name = "CropImage$3";
    public final /* synthetic */ CropImage A00;

    public Iq1(CropImage cropImage) {
        this.A00 = cropImage;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable, boolean] */
    @Override // java.lang.Runnable
    public void run() {
        CountDownLatch A11 = AnonymousClass001.A11();
        CropImage cropImage = this.A00;
        JLc jLc = cropImage.A0A;
        ?? post = cropImage.A0G.post(new J08(jLc != null ? jLc.ATx(-1, 1048576) : cropImage.A06, this, A11));
        try {
            A11.await();
            cropImage.A0B.run();
        } catch (InterruptedException unused) {
            throw AnonymousClass001.A0U(post);
        }
    }
}
