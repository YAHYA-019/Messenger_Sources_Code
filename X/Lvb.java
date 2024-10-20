package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvb.class */
public final class Lvb implements 5Yt {
    public static final Lvb A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lvb] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A12 = JR0.A12("com.facebook.messaging.leadgen.plugins.xmactas.fillinthreadforms.FillInThreadFormCtaHandler.InThreadFormActionContentBlob", (5Yt) obj);
        A12.A01("form_id", true);
        A12.A01("thread_ad_id", true);
        A01 = A12;
    }

    public 5Yu[] childSerializers() {
        5ZL r0 = 5ZL.A01;
        return new 5Yu[]{KZ3.A00(r0), KZ3.A00(r0)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new JtU(str, str2, i2);
            }
            if (ALu == 0) {
                str = 4YV.A0w(str, pluginGeneratedSerialDescriptor, ABn, 0);
                i = i2 | 1;
            } else {
                if (ALu != 1) {
                    throw M9V.A00(ALu);
                }
                str2 = 4YV.A0w(str2, pluginGeneratedSerialDescriptor, ABn, 1);
                i = i2 | 2;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        JtU jtU = (JtU) obj;
        boolean A1X = 1BL.A1X(encoder, jtU);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || jtU.A00 != null) {
            ABo.APv(jtU.A00, 5ZL.A01, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || jtU.A01 != null) {
            ABo.APv(jtU.A01, 5ZL.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
