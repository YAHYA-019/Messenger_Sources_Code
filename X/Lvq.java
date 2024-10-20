package X;

import com.facebook.pairingmanager.api.BluetoothDeviceState;
import com.facebook.pairingmanager.api.BluetoothPairingType;
import com.facebook.pairingmanager.api.PairingType;
import com.facebook.pairingmanager.api.SimplePairedStateData;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvq.class */
public final class Lvq implements 5Yt {
    public static final Lvq A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lvq] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.pairingmanager.api.SimplePairedStateData", obj, 6);
        pluginGeneratedSerialDescriptor.A01("address", false);
        pluginGeneratedSerialDescriptor.A01("pairingType", false);
        pluginGeneratedSerialDescriptor.A01("pairingComplete", false);
        pluginGeneratedSerialDescriptor.A01("grantedDozeExemption", true);
        pluginGeneratedSerialDescriptor.A01("bluetoothPairingType", false);
        pluginGeneratedSerialDescriptor.A01("bluetoothDeviceState", false);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = SimplePairedStateData.A06;
        5Yu r02 = 5ZL.A01;
        5Yu r03 = r0[1];
        Lv3 lv3 = Lv3.A00;
        return new 5Yu[]{r02, r03, lv3, lv3, r0[4], r0[5]};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yu[] r0 = SimplePairedStateData.A06;
        BluetoothDeviceState bluetoothDeviceState = null;
        String str = null;
        PairingType pairingType = null;
        BluetoothPairingType bluetoothPairingType = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new SimplePairedStateData(bluetoothDeviceState, bluetoothPairingType, pairingType, str, i2, z2, z);
                case 0:
                    str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                    i = i2 | 1;
                    break;
                case 1:
                    pairingType = (PairingType) JQz.A0h(pairingType, pluginGeneratedSerialDescriptor, ABn, r0, 1);
                    i = i2 | 2;
                    break;
                case 2:
                    z2 = ABn.ALn(pluginGeneratedSerialDescriptor, 2);
                    i = i2 | 4;
                    break;
                case 3:
                    z = ABn.ALn(pluginGeneratedSerialDescriptor, 3);
                    i = i2 | 8;
                    break;
                case 4:
                    bluetoothPairingType = (BluetoothPairingType) JQz.A0h(bluetoothPairingType, pluginGeneratedSerialDescriptor, ABn, r0, 4);
                    i = i2 | 16;
                    break;
                case 5:
                    bluetoothDeviceState = (BluetoothDeviceState) JQz.A0h(bluetoothDeviceState, pluginGeneratedSerialDescriptor, ABn, r0, 5);
                    i = i2 | 32;
                    break;
                default:
                    throw M9V.A00(ALu);
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        SimplePairedStateData simplePairedStateData = (SimplePairedStateData) obj;
        boolean A1X = 1BL.A1X(encoder, simplePairedStateData);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = SimplePairedStateData.A06;
        ABo.AQ0(simplePairedStateData.A03, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(simplePairedStateData.A02, r0[A1X ? 1 : 0], pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.APg(pluginGeneratedSerialDescriptor, 2, simplePairedStateData.A05);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || simplePairedStateData.A04) {
            ABo.APg(pluginGeneratedSerialDescriptor, 3, simplePairedStateData.A04);
        }
        ABo.APw(simplePairedStateData.A01, r0[4], pluginGeneratedSerialDescriptor, 4);
        ABo.APw(simplePairedStateData.A00, r0[5], pluginGeneratedSerialDescriptor, 5);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
