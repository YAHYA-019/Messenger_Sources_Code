package X;

import com.facebook.neko.directinstall.digitalturbine.AIDLInstallationProgress;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvc.class */
public final class Lvc implements 5Yt {
    public static final Lvc A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lvc] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A13 = JR0.A13("com.facebook.neko.directinstall.digitalturbine.AIDLInstallationProgress", (5Yt) obj);
        A13.A01("value", false);
        A13.A01("action", false);
        A13.A01("status", true);
        A01 = A13;
    }

    public 5Yu[] childSerializers() {
        Lv6 lv6 = Lv6.A00;
        Lv8 lv8 = Lv8.A00;
        return new 5Yu[]{lv6, lv8, lv8};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new AIDLInstallationProgress(d, i4, i, i2);
            }
            if (ALu == 0) {
                d = ABn.ALt(pluginGeneratedSerialDescriptor, 0);
                i3 = i4 | 1;
            } else if (ALu == 1) {
                i = ABn.AM4(pluginGeneratedSerialDescriptor, 1);
                i3 = i4 | 2;
            } else {
                if (ALu != 2) {
                    throw M9V.A00(ALu);
                }
                i2 = ABn.AM4(pluginGeneratedSerialDescriptor, 2);
                i3 = i4 | 4;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AIDLInstallationProgress aIDLInstallationProgress = (AIDLInstallationProgress) obj;
        boolean A1X = 1BL.A1X(encoder, aIDLInstallationProgress);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APk(pluginGeneratedSerialDescriptor, aIDLInstallationProgress.A00, 0);
        ABo.APr(pluginGeneratedSerialDescriptor, A1X ? 1 : 0, aIDLInstallationProgress.A01);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || aIDLInstallationProgress.A02 != 0) {
            ABo.APr(pluginGeneratedSerialDescriptor, 2, aIDLInstallationProgress.A02);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
