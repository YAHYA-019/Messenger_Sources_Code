package X;

import com.facebook.neko.directinstall.digitalturbine.DTAuthResponse;
import com.facebook.neko.directinstall.digitalturbine.DTSession;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvf.class */
public final class Lvf implements 5Yt {
    public static final Lvf A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, X.Lvf, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A11 = JR0.A11("com.facebook.neko.directinstall.digitalturbine.DTAuthResponse", (5Yt) obj);
        A11.A01("data", false);
        A01 = A11;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{Lvl.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        DTSession dTSession = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new DTAuthResponse(dTSession, i2);
            }
            if (ALu != 0) {
                throw M9V.A00(ALu);
            }
            dTSession = (DTSession) ABn.AMB(dTSession, Lvl.A00, pluginGeneratedSerialDescriptor, 0);
            i = i2 | 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTAuthResponse dTAuthResponse = (DTAuthResponse) obj;
        11T.A0H(encoder, dTAuthResponse);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APw(dTAuthResponse.A00, Lvl.A00, pluginGeneratedSerialDescriptor, 0);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
