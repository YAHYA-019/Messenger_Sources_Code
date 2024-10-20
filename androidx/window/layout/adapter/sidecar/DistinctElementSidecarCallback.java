package androidx.window.layout.adapter.sidecar;

import X.AnonymousClass001;
import X.IAb;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: DistinctElementSidecarCallback.class */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState A00;
    public final IAb A01;
    public final SidecarInterface.SidecarCallback A02;
    public final Object A03 = AnonymousClass001.A0R();
    public final Map A04 = new WeakHashMap();

    public DistinctElementSidecarCallback(IAb iAb, SidecarInterface.SidecarCallback sidecarCallback) {
        this.A01 = iAb;
        this.A02 = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.A03) {
                if (!IAb.A00(this.A00, sidecarDeviceState)) {
                    this.A00 = sidecarDeviceState;
                    this.A02.onDeviceStateChanged(sidecarDeviceState);
                }
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.A03) {
            Map map = this.A04;
            if (!this.A01.A02((SidecarWindowLayoutInfo) map.get(iBinder), sidecarWindowLayoutInfo)) {
                map.put(iBinder, sidecarWindowLayoutInfo);
                this.A02.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }
}
