package X;

import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.DTTaskInfo;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvm.class */
public final class Lvm implements 5Yt {
    public static final Lvm A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lvm, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.neko.directinstall.digitalturbine.DTTaskInfo", obj, 5);
        pluginGeneratedSerialDescriptor.A01("taskId", false);
        pluginGeneratedSerialDescriptor.A01("status", false);
        pluginGeneratedSerialDescriptor.A01("application", true);
        pluginGeneratedSerialDescriptor.A01("progressValue", true);
        pluginGeneratedSerialDescriptor.A01("partnerMetadata", true);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu r0 = 5ZL.A01;
        return new 5Yu[]{r0, Lv8.A00, KZ3.A00(Lvd.A00), KZ3.A00(Lv6.A00), KZ3.A00(r0)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        DTApplication dTApplication = null;
        Double d = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new DTTaskInfo(dTApplication, d, str, str2, i, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (ALu == 1) {
                i2 = ABn.AM4(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (ALu == 2) {
                dTApplication = (DTApplication) ABn.AM9(dTApplication, Lvd.A00, pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else if (ALu == 3) {
                d = (Double) ABn.AM9(d, Lv6.A00, pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            } else {
                if (ALu != 4) {
                    throw M9V.A00(ALu);
                }
                str2 = 4YV.A0w(str2, pluginGeneratedSerialDescriptor, ABn, 4);
                i |= 16;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTTaskInfo dTTaskInfo = (DTTaskInfo) obj;
        boolean A1X = 1BL.A1X(encoder, dTTaskInfo);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.AQ0(dTTaskInfo.A04, pluginGeneratedSerialDescriptor, 0);
        ABo.APr(pluginGeneratedSerialDescriptor, A1X ? 1 : 0, dTTaskInfo.A00);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || dTTaskInfo.A01 != null) {
            ABo.APv(dTTaskInfo.A01, Lvd.A00, pluginGeneratedSerialDescriptor, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || dTTaskInfo.A02 != null) {
            ABo.APv(dTTaskInfo.A02, Lv6.A00, pluginGeneratedSerialDescriptor, 3);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 4) || dTTaskInfo.A03 != null) {
            ABo.APv(dTTaskInfo.A03, 5ZL.A01, pluginGeneratedSerialDescriptor, 4);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
