package X;

import com.facebook.neko.directinstall.digitalturbine.DTInstallationError;
import com.facebook.neko.directinstall.digitalturbine.DTInstallationErrorResponse;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvj.class */
public final class Lvj implements 5Yt {
    public static final Lvj A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lvj, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A12 = JR0.A12("com.facebook.neko.directinstall.digitalturbine.DTInstallationErrorResponse", (5Yt) obj);
        A12.A01("data", false);
        A12.A01("taskId", true);
        A01 = A12;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{Lvi.A00, KZ3.A00(5ZL.A01)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        DTInstallationError dTInstallationError = null;
        String str = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new DTInstallationErrorResponse(dTInstallationError, str, i2);
            }
            if (ALu == 0) {
                dTInstallationError = (DTInstallationError) ABn.AMB(dTInstallationError, Lvi.A00, pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else {
                if (ALu != 1) {
                    throw M9V.A00(ALu);
                }
                str = 4YV.A0w(str, pluginGeneratedSerialDescriptor, ABn, 1);
                i = i2 | 2;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTInstallationErrorResponse dTInstallationErrorResponse = (DTInstallationErrorResponse) obj;
        boolean A1X = 1BL.A1X(encoder, dTInstallationErrorResponse);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APw(dTInstallationErrorResponse.A00, Lvi.A00, pluginGeneratedSerialDescriptor, 0);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || dTInstallationErrorResponse.A01 != null) {
            ABo.APv(dTInstallationErrorResponse.A01, 5ZL.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
