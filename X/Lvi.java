package X;

import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.DTInstallationError;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvi.class */
public final class Lvi implements 5Yt {
    public static final Lvi A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lvi, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A13 = JR0.A13("com.facebook.neko.directinstall.digitalturbine.DTInstallationError", (5Yt) obj);
        A13.A01("code", false);
        A13.A01("message", false);
        A13.A01("application", true);
        A01 = A13;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{Lv8.A00, 5ZL.A01, KZ3.A00(Lvd.A00)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        DTApplication dTApplication = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new DTInstallationError(dTApplication, str, i3, i);
            }
            if (ALu == 0) {
                i = ABn.AM4(pluginGeneratedSerialDescriptor, 0);
                i2 = i3 | 1;
            } else if (ALu == 1) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                i2 = i3 | 2;
            } else {
                if (ALu != 2) {
                    throw M9V.A00(ALu);
                }
                dTApplication = (DTApplication) ABn.AM9(dTApplication, Lvd.A00, pluginGeneratedSerialDescriptor, 2);
                i2 = i3 | 4;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTInstallationError dTInstallationError = (DTInstallationError) obj;
        boolean A1X = 1BL.A1X(encoder, dTInstallationError);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APr(pluginGeneratedSerialDescriptor, 0, dTInstallationError.A00);
        ABo.AQ0(dTInstallationError.A02, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || dTInstallationError.A01 != null) {
            ABo.APv(dTInstallationError.A01, Lvd.A00, pluginGeneratedSerialDescriptor, 2);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
