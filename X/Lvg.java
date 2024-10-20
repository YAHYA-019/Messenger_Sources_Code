package X;

import com.facebook.neko.directinstall.digitalturbine.DTGenericError;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvg.class */
public final class Lvg implements 5Yt {
    public static final Lvg A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, X.Lvg, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A12 = JR0.A12("com.facebook.neko.directinstall.digitalturbine.DTGenericError", (5Yt) obj);
        A12.A01("code", false);
        A12.A01("message", false);
        A01 = A12;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{Lv8.A00, 5ZL.A01};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new DTGenericError(str, i3, i);
            }
            if (ALu == 0) {
                i = ABn.AM4(pluginGeneratedSerialDescriptor, 0);
                i2 = i3 | 1;
            } else {
                if (ALu != 1) {
                    throw M9V.A00(ALu);
                }
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                i2 = i3 | 2;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTGenericError dTGenericError = (DTGenericError) obj;
        boolean A1X = 1BL.A1X(encoder, dTGenericError);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APr(pluginGeneratedSerialDescriptor, 0, dTGenericError.A00);
        ABo.AQ0(dTGenericError.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
