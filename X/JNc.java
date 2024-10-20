package X;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* loaded from: JNc.class */
public interface JNc {
    void A5a(MediaEffect mediaEffect, int i);

    void A7a(int i);

    void ANw(int i, long j);

    void AOV(long j);

    SurfaceTexture Aqx(int i, boolean z);

    void C1v(int i);

    void CAT();

    void CAU();

    void CeD(MediaEffect mediaEffect, int i);

    Bitmap CjS(int i);

    void CsB(Surface surface, HLh hLh, int i);

    void D6c(int i, Bitmap bitmap);

    void D6z(HWs hWs, int i);

    void D7I(I9d i9d);

    void D7V(int i, int i2);

    void cancel();

    void flush();

    void init();

    void release();
}
