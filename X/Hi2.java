package X;

import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackingDataProviderDelegateWrapper;

/* loaded from: Hi2.class */
public abstract class Hi2 {
    public String A00;
    public final int A01;
    public final int A02;
    public final DeviceConfig A03;
    public final WorldTrackingDataProviderDelegateWrapper A04;
    public final boolean A05;

    public Hi2(DeviceConfig deviceConfig, JCj jCj, String str, int i, int i2, boolean z) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = deviceConfig;
        this.A05 = z;
        this.A00 = str;
        this.A04 = new WorldTrackingDataProviderDelegateWrapper(jCj);
    }
}
