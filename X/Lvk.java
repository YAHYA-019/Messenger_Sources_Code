package X;

import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.DTInstallationResponse;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvk.class */
public final class Lvk implements 5Yt {
    public static final Lvk A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lvk, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A12 = JR0.A12("com.facebook.neko.directinstall.digitalturbine.DTInstallationResponse", (5Yt) obj);
        A12.A01("taskId", false);
        A12.A01("data", false);
        A01 = A12;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{5ZL.A01, Lvd.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        DTApplication dTApplication = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new DTInstallationResponse(dTApplication, str, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else {
                if (ALu != 1) {
                    throw M9V.A00(ALu);
                }
                dTApplication = (DTApplication) ABn.AMB(dTApplication, Lvd.A00, pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTInstallationResponse dTInstallationResponse = (DTInstallationResponse) obj;
        boolean A1X = 1BL.A1X(encoder, dTInstallationResponse);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.AQ0(dTInstallationResponse.A01, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(dTInstallationResponse.A00, Lvd.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
