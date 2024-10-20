package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;

/* loaded from: Iho.class */
public final class Iho implements JMW, Handler.Callback, JQU {
    public final Handler A00;
    public final JNh A01;

    public Iho(Looper looper, JNh jNh) {
        this.A01 = jNh;
        this.A00 = looper != null ? new Handler(looper, this) : null;
    }

    public void C1e(SurfaceTexture surfaceTexture, Surface surface) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler == null || (obtainMessage = handler.obtainMessage(2)) == null) {
            this.A01.C1d();
        } else {
            obtainMessage.sendToTarget();
        }
    }

    public /* synthetic */ void CPL(Surface surface) {
    }

    public void CPQ(SurfaceTexture surfaceTexture, Surface surface, int i, int i2) {
        this.A01.CP9(GOn.A19(surface));
    }

    public void CPR(SurfaceTexture surfaceTexture, Surface surface) {
        this.A01.CPG();
    }

    public /* synthetic */ void CPS(SurfaceTexture surfaceTexture) {
    }

    @Override // X.JQU
    public /* synthetic */ void CPT() {
    }

    @Override // X.JQU
    public void CPU(IllegalArgumentException illegalArgumentException) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler == null || (obtainMessage = handler.obtainMessage(3)) == null) {
            this.A01.CV4(new 7uY(HCA.A1T, HCJ.A0H, "Reused Surface Texture Was Released"));
        } else {
            obtainMessage.sendToTarget();
        }
    }

    @Override // X.JQU
    public /* synthetic */ void CPV(Surface surface) {
    }

    public void CV0(Surface surface) {
        this.A01.CP9(GOq.A11(surface));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        11T.A0F(message, 0);
        if (message.what == 3) {
            this.A01.CV4(new 7uY(HCA.A1T, HCJ.A0H, "Reused Surface Texture Was Released"));
        }
        int i = message.what;
        if (i == 1) {
            this.A01.CPX();
            return true;
        }
        if (i == 2) {
            this.A01.C1d();
        }
        return true;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler == null || (obtainMessage = handler.obtainMessage(1)) == null) {
            this.A01.CPX();
        } else {
            obtainMessage.sendToTarget();
        }
    }
}
