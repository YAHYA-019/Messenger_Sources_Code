package X;

import com.facebook.cameracore.camerasdk.common.CameraStateException;
import com.facebook.cameracore.camerasdk.fboptic.Camera1Device;

/* loaded from: Idd.class */
public final class Idd implements JG9 {
    public final /* synthetic */ JE3 A00;
    public final /* synthetic */ Camera1Device A01;
    public final /* synthetic */ H9F A02;
    public final /* synthetic */ JQ9 A03;
    public final /* synthetic */ String A04;

    public Idd(JE3 je3, Camera1Device camera1Device, H9F h9f, JQ9 jq9, String str) {
        this.A01 = camera1Device;
        this.A04 = str;
        this.A03 = jq9;
        this.A02 = h9f;
        this.A00 = je3;
    }

    @Override // X.JG9
    public void BwL(J7E j7e) {
        int i;
        int i2 = j7e.mCameraError;
        String message = j7e.getMessage();
        boolean z = true;
        if (i2 == 2) {
            i = 10007;
        } else {
            i = 10008;
            if (i2 != 100) {
                i = 10009;
                z = false;
            }
        }
        CameraStateException cameraStateException = new CameraStateException(message, null, i, z);
        Camera1Device camera1Device = this.A01;
        IEg.A0O.A0I.remove(this);
        java.util.Map map = camera1Device.A0E;
        String str = this.A04;
        if (map.containsKey(str)) {
            map.remove(str);
        }
        if (cameraStateException.mIsCameraClosed) {
            Camera1Device.A03(camera1Device, this.A02, this.A03, str);
        }
        JE3 je3 = this.A00;
        if (je3 != null) {
            je3.BmR(cameraStateException);
        }
    }
}
