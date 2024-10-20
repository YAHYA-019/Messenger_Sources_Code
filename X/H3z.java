package X;

import android.graphics.SurfaceTexture;
import com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink;

/* loaded from: H3z.class */
public abstract class H3z extends Ikm implements ISurfaceVideoSink {
    public boolean A04() {
        H3y h3y = (H3y) this;
        if (!h3y.A02) {
            return false;
        }
        SurfaceTexture surfaceTexture = h3y.A06;
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(h3y.A08);
        h3y.A02 = false;
        return true;
    }
}
