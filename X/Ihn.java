package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: Ihn.class */
public abstract class Ihn implements JMW, Handler.Callback {
    public final Handler A00;
    public final Ihm A01;

    public Ihn(Looper looper, 5Kz r303) {
        this.A00 = looper != null ? new Handler(looper, this) : null;
        this.A01 = new Ihm(r303);
    }

    private final void A02() {
        Ihm ihm = this.A01;
        ihm.A01 = "updated";
        ihm.A00("SURFACE_UPDATED", null);
        5Kz r0 = ihm.A03;
        String str = ihm.A02;
        if (str == null) {
            str = "null";
        }
        r0.BcY(str, "surface_state_on_surface_texture_updated");
        ihm.A00 = System.currentTimeMillis();
    }

    private final void A03(Surface surface) {
        Ihm ihm = this.A01;
        ihm.A00("SURFACE_TEXTURE_AVAILABLE", null);
        5Kz r0 = ihm.A03;
        String str = ihm.A02;
        if (str == null) {
            str = "null";
        }
        r0.BcY(str, "surface_state_surface_texture_available");
        ihm.A01 = "created";
        ihm.A00 = -1;
        ihm.A00("SURFACE_CREATED", StringFormatUtil.formatStrLocaleSafe("IsTextureView: %s; SurfaceValid: %s, SurfaceId: %s", AnonymousClass001.A0K(), Boolean.valueOf(surface.isValid()), 4YU.A14(surface)));
    }

    private final void A04(Surface surface) {
        Ihm ihm = this.A01;
        5Kz r0 = ihm.A03;
        String str = ihm.A02;
        if (str == null) {
            str = "null";
        }
        r0.BcY(str, "surface_state_surface_texture_on_destroyed");
        ihm.A00("SURFACE_TEXTURE_DESTROYED", StringFormatUtil.formatStrLocaleSafe("SurfaceId: %s", 0PP.A00(surface)));
    }

    private final void A05(Surface surface) {
        Ihm ihm = this.A01;
        ihm.A01 = "created";
        ihm.A00 = -1;
        ihm.A00("SURFACE_CREATED", StringFormatUtil.formatStrLocaleSafe("IsTextureView: %s; SurfaceValid: %s, SurfaceId: %s", AnonymousClass001.A0K(), Boolean.valueOf(surface.isValid()), 4YU.A14(surface)));
    }

    public /* synthetic */ void C1e(SurfaceTexture surfaceTexture, Surface surface) {
    }

    public void CPL(Surface surface) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler == null || (obtainMessage = handler.obtainMessage(4, surface)) == null) {
            this.A01.A00("SURFACE_RELEASED", StringFormatUtil.formatStrLocaleSafe("IsTextureView: true, SurfaceId: %s", 0PP.A00(surface)));
        } else {
            obtainMessage.sendToTarget();
        }
    }

    public void CPQ(SurfaceTexture surfaceTexture, Surface surface, int i, int i2) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler == null || (obtainMessage = handler.obtainMessage(1, surface)) == null) {
            A03(surface);
        } else {
            obtainMessage.sendToTarget();
        }
    }

    public void CPR(SurfaceTexture surfaceTexture, Surface surface) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler == null || (obtainMessage = handler.obtainMessage(3, surface)) == null) {
            A04(surface);
        } else {
            obtainMessage.sendToTarget();
        }
    }

    public void CPS(SurfaceTexture surfaceTexture) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler != null && (obtainMessage = handler.obtainMessage(6)) != null) {
            obtainMessage.sendToTarget();
            return;
        }
        Ihm ihm = this.A01;
        ihm.A01 = "destroyed";
        5Kz r0 = ihm.A03;
        String str = ihm.A02;
        if (str == null) {
            str = "null";
        }
        r0.BcY(str, "surface_state_surface_texture_on_release");
    }

    public void CV0(Surface surface) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler == null || (obtainMessage = handler.obtainMessage(2, surface)) == null) {
            A05(surface);
        } else {
            obtainMessage.sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        11T.A0F(message, 0);
        switch (message.what) {
            case 1:
                Object obj = message.obj;
                11T.A0I(obj, "null cannot be cast to non-null type android.view.Surface");
                A03((Surface) obj);
                return true;
            case 2:
                Object obj2 = message.obj;
                11T.A0I(obj2, "null cannot be cast to non-null type android.view.Surface");
                A05((Surface) obj2);
                return true;
            case 3:
                Object obj3 = message.obj;
                11T.A0I(obj3, "null cannot be cast to non-null type android.view.Surface");
                A04((Surface) obj3);
                return true;
            case 4:
                Object obj4 = message.obj;
                11T.A0I(obj4, "null cannot be cast to non-null type android.view.Surface");
                this.A01.A00("SURFACE_RELEASED", StringFormatUtil.formatStrLocaleSafe("IsTextureView: true, SurfaceId: %s", 0PP.A00(obj4)));
                return true;
            case 5:
                A02();
                return true;
            case 6:
                Ihm ihm = this.A01;
                ihm.A01 = "destroyed";
                5Kz r0 = ihm.A03;
                String str = ihm.A02;
                if (str == null) {
                    str = "null";
                }
                r0.BcY(str, "surface_state_surface_texture_on_release");
                return true;
            default:
                return true;
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler == null || (obtainMessage = handler.obtainMessage(5)) == null) {
            A02();
        } else {
            obtainMessage.sendToTarget();
        }
    }
}
