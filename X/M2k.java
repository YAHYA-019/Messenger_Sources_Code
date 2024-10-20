package X;

import com.facebook.wearable.companion.connectivity.interfaces.data.CustomDeviceInfo;
import java.lang.annotation.Annotation;

/* loaded from: M2k.class */
public final class M2k extends C00q implements C00m {
    public static final M2k A00 = new M2k();

    public M2k() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        0BY A18 = 7zL.A18(CustomDeviceInfo.class);
        0BZ[] r0 = {7zL.A18(CustomDeviceInfo.MockDevice.class), 7zL.A18(CustomDeviceInfo.WiredDevice.class)};
        CustomDeviceInfo.MockDevice mockDevice = CustomDeviceInfo.MockDevice.A00;
        11T.A0F(mockDevice, 2);
        Lul lul = new Lul("com.facebook.wearable.companion.connectivity.interfaces.data.CustomDeviceInfo.MockDevice", mockDevice);
        lul.A00 = JR0.A0x(new Annotation[0]);
        return new M9g(A18, new Annotation[0], r0, new 5Yu[]{lul, Lvs.A00});
    }
}
