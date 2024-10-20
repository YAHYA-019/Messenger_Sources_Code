package X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: Izo.class */
public final class Izo implements Runnable {
    public static final String __redex_internal_original_name = "PhotoPostCaptureControllerImpl$2$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Id3 A02;

    public Izo(Id3 id3, int i, int i2) {
        this.A02 = id3;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2430Gcr c2430Gcr = (C2430Gcr) this.A02.A01;
        Req req = c2430Gcr.A01;
        if (req.A09.isEmpty() && req.A0A.isEmpty()) {
            int i = this.A01;
            int i2 = this.A00;
            Handler handler = req.A04;
            if (handler.getLooper() == Looper.myLooper()) {
                req.A01 = i;
                req.A00 = i2;
            } else {
                handler.post(new SCl(req, i, i2));
            }
        }
        int i3 = this.A01;
        int i4 = this.A00;
        HPA hpa = c2430Gcr.A0A;
        Handler handler2 = req.A04;
        if (handler2.getLooper() == Looper.myLooper()) {
            Req.A00(hpa, req, i3, i4);
        } else {
            handler2.post(new SDz(hpa, req, i3, i4));
        }
    }
}
