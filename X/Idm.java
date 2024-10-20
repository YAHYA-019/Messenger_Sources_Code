package X;

import com.facebook.cameracore.camerasdk.fboptic.Camera1Device;

/* loaded from: Idm.class */
public final class Idm implements JGC {
    public final /* synthetic */ Camera1Device A00;

    public Idm(Camera1Device camera1Device) {
        this.A00 = camera1Device;
    }

    public void CDf(I40 i40) {
        Camera1Device camera1Device = this.A00;
        if (camera1Device.A08) {
            camera1Device.A08 = false;
        }
        camera1Device.A09.CDf(i40);
    }
}
