package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pairingmanager.api.SimplePairedStateData;
import com.facebook.wearable.companion.connectivity.interfaces.data.CustomDeviceInfo;
import com.facebook.wearable.companion.connectivity.interfaces.data.DeviceRecord;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvt.class */
public final class Lvt implements 5Yt {
    public static final Lvt A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lvt] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.wearable.companion.connectivity.interfaces.data.DeviceRecord", obj, 8);
        pluginGeneratedSerialDescriptor.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, false);
        pluginGeneratedSerialDescriptor.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, false);
        pluginGeneratedSerialDescriptor.A01("userData", false);
        pluginGeneratedSerialDescriptor.A01("pairedStateData", false);
        pluginGeneratedSerialDescriptor.A01("observingPresence", true);
        pluginGeneratedSerialDescriptor.A01("customName", true);
        pluginGeneratedSerialDescriptor.A01("customDeviceInfo", true);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = DeviceRecord.A08;
        5Yu r02 = 5ZL.A01;
        return new 5Yu[]{r02, r02, Lv8.A00, KZ3.A00(r0[3]), KZ3.A00(Lvq.A00), Lv3.A00, KZ3.A00(r02), KZ3.A00(r0[7])};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yw[] r0 = DeviceRecord.A08;
        String str = null;
        CustomDeviceInfo customDeviceInfo = null;
        SimplePairedStateData simplePairedStateData = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new DeviceRecord(simplePairedStateData, customDeviceInfo, str2, str3, str, list, i3, i, z);
                case 0:
                    str2 = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                    i2 = i3 | 1;
                    break;
                case 1:
                    str3 = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                    i2 = i3 | 2;
                    break;
                case 2:
                    i = ABn.AM4(pluginGeneratedSerialDescriptor, 2);
                    i2 = i3 | 4;
                    break;
                case 3:
                    list = (List) ABn.AM9(list, r0[3], pluginGeneratedSerialDescriptor, 3);
                    i2 = i3 | 8;
                    break;
                case 4:
                    simplePairedStateData = (SimplePairedStateData) ABn.AM9(simplePairedStateData, Lvq.A00, pluginGeneratedSerialDescriptor, 4);
                    i2 = i3 | 16;
                    break;
                case 5:
                    z = ABn.ALn(pluginGeneratedSerialDescriptor, 5);
                    i2 = i3 | 32;
                    break;
                case 6:
                    str = 4YU.A17(str, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 6);
                    i2 = i3 | 64;
                    break;
                case 7:
                    customDeviceInfo = (CustomDeviceInfo) ABn.AM9(customDeviceInfo, r0[7], pluginGeneratedSerialDescriptor, 7);
                    i2 = i3 | 128;
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
        DeviceRecord deviceRecord = (DeviceRecord) obj;
        boolean A1X = 1BL.A1X(encoder, deviceRecord);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = DeviceRecord.A08;
        ABo.AQ0(deviceRecord.A05, pluginGeneratedSerialDescriptor, 0);
        ABo.AQ0(deviceRecord.A06, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.APr(pluginGeneratedSerialDescriptor, 2, deviceRecord.A03);
        ABo.APv(deviceRecord.A02, r0[3], pluginGeneratedSerialDescriptor, 3);
        ABo.APv(deviceRecord.A00, Lvq.A00, pluginGeneratedSerialDescriptor, 4);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 5) || deviceRecord.A07) {
            ABo.APg(pluginGeneratedSerialDescriptor, 5, deviceRecord.A07);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 6) || deviceRecord.A01 != null) {
            ABo.APv(deviceRecord.A01, 5ZL.A01, pluginGeneratedSerialDescriptor, 6);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 7) || deviceRecord.A04 != null) {
            ABo.APv(deviceRecord.A04, r0[7], pluginGeneratedSerialDescriptor, 7);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
