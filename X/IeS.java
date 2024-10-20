package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* loaded from: IeS.class */
public final class IeS implements JNZ {
    public WeakReference A00 = DKD.A11();
    public WeakReference A01;

    public IeS(SurfaceTexture surfaceTexture) {
        this.A01 = 7zL.A14(surfaceTexture);
    }

    public /* synthetic */ Object B0M(HJY hjy) {
        return null;
    }

    public /* synthetic */ JMF B2l() {
        return null;
    }

    public /* synthetic */ JMF B5p() {
        return null;
    }

    public SurfaceTexture BDo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (SurfaceTexture) this.A01.get();
    }

    public Surface BDp() {
        return (Surface) this.A00.get();
    }

    public SurfaceTexture BDq() {
        return (SurfaceTexture) this.A01.get();
    }

    public /* synthetic */ JKN BJa() {
        return null;
    }

    public /* synthetic */ JMF BLK() {
        return null;
    }

    public /* synthetic */ void Bmc(int i) {
    }

    public /* synthetic */ void Btb(int i) {
    }

    public /* synthetic */ void CIu(int i, int i2) {
    }

    public void CIv(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A01 = 7zL.A14(surfaceTexture);
    }

    public void CIw(Surface surface, int i, int i2) {
        this.A00 = 7zL.A14(surface);
    }

    public /* synthetic */ void CIx(SurfaceTexture surfaceTexture) {
    }

    public /* synthetic */ void CIy(Surface surface) {
    }

    public /* synthetic */ void Ccz(SurfaceTexture surfaceTexture) {
    }

    public /* synthetic */ void CtG(boolean z) {
    }

    public boolean DAd() {
        return false;
    }
}
