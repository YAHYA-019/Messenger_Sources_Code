package X;

import com.facebook.wearable.companion.connectivity.interfaces.data.CustomDeviceInfo;
import java.lang.annotation.Annotation;

/* loaded from: M2l.class */
public final class M2l extends C00q implements C00m {
    public static final M2l A00 = new M2l();

    public M2l() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        CustomDeviceInfo.MockDevice mockDevice = CustomDeviceInfo.MockDevice.A00;
        11T.A0F(mockDevice, 2);
        Lul lul = new Lul("com.facebook.wearable.companion.connectivity.interfaces.data.CustomDeviceInfo.MockDevice", mockDevice);
        lul.A00 = JR0.A0x(new Annotation[0]);
        return lul;
    }
}
