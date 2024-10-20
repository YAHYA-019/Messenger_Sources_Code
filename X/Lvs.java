package X;

import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.wearable.companion.connectivity.interfaces.data.CustomDeviceInfo;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvs.class */
public final class Lvs implements 5Yt {
    public static final Lvs A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lvs] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A13 = JR0.A13("com.facebook.wearable.companion.connectivity.interfaces.data.CustomDeviceInfo.WiredDevice", (5Yt) obj);
        A13.A01("address", false);
        A13.A01(TraceFieldType.Port, false);
        A13.A01("secure", false);
        A01 = A13;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{5ZL.A01, Lv8.A00, Lv3.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new CustomDeviceInfo.WiredDevice(str, i3, i, z);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i2 = i3 | 1;
            } else if (ALu == 1) {
                i = ABn.AM4(pluginGeneratedSerialDescriptor, 1);
                i2 = i3 | 2;
            } else {
                if (ALu != 2) {
                    throw M9V.A00(ALu);
                }
                z = ABn.ALn(pluginGeneratedSerialDescriptor, 2);
                i2 = i3 | 4;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CustomDeviceInfo.WiredDevice wiredDevice = (CustomDeviceInfo.WiredDevice) obj;
        boolean A1X = 1BL.A1X(encoder, wiredDevice);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        Parcelable.Creator creator = CustomDeviceInfo.WiredDevice.CREATOR;
        ABo.AQ0(wiredDevice.A01, pluginGeneratedSerialDescriptor, 0);
        ABo.APr(pluginGeneratedSerialDescriptor, A1X ? 1 : 0, wiredDevice.A00);
        ABo.APg(pluginGeneratedSerialDescriptor, 2, wiredDevice.A02);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
