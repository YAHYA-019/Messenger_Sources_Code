package X;

import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvp.class */
public final class Lvp implements 5Yt {
    public static final Lvp A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lvp] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig", obj, 7);
        pluginGeneratedSerialDescriptor.A01("keyId", false);
        pluginGeneratedSerialDescriptor.A01("publicKey", false);
        pluginGeneratedSerialDescriptor.A01("kemId", false);
        pluginGeneratedSerialDescriptor.A01("kdfId", false);
        pluginGeneratedSerialDescriptor.A01("aeadId", false);
        pluginGeneratedSerialDescriptor.A01("expirationDate", false);
        pluginGeneratedSerialDescriptor.A01("lastUpdatedTime", false);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        Lv8 lv8 = Lv8.A00;
        5Yu r0 = 5ZL.A01;
        5Yu r02 = 5ZP.A00;
        return new 5Yu[]{lv8, r0, lv8, lv8, lv8, r02, r02};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        long j = 0;
        String str = null;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i5;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new OHAIConfig(str, i6, i, i4, i2, i3, j2, j);
                case 0:
                    i = ABn.AM4(pluginGeneratedSerialDescriptor, 0);
                    i5 = i6 | 1;
                    break;
                case 1:
                    str = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                    i5 = i6 | 2;
                    break;
                case 2:
                    i4 = ABn.AM4(pluginGeneratedSerialDescriptor, 2);
                    i5 = i6 | 4;
                    break;
                case 3:
                    i2 = ABn.AM4(pluginGeneratedSerialDescriptor, 3);
                    i5 = i6 | 8;
                    break;
                case 4:
                    i3 = ABn.AM4(pluginGeneratedSerialDescriptor, 4);
                    i5 = i6 | 16;
                    break;
                case 5:
                    j2 = ABn.AM7(pluginGeneratedSerialDescriptor, 5);
                    i5 = i6 | 32;
                    break;
                case 6:
                    j = ABn.AM7(pluginGeneratedSerialDescriptor, 6);
                    i5 = i6 | 64;
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
        OHAIConfig oHAIConfig = (OHAIConfig) obj;
        boolean A1X = 1BL.A1X(encoder, oHAIConfig);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APr(pluginGeneratedSerialDescriptor, 0, oHAIConfig.A03);
        ABo.AQ0(oHAIConfig.A06, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.APr(pluginGeneratedSerialDescriptor, 2, oHAIConfig.A02);
        ABo.APr(pluginGeneratedSerialDescriptor, 3, oHAIConfig.A01);
        ABo.APr(pluginGeneratedSerialDescriptor, 4, oHAIConfig.A00);
        ABo.APt(pluginGeneratedSerialDescriptor, 5, oHAIConfig.A04);
        ABo.APt(pluginGeneratedSerialDescriptor, 6, oHAIConfig.A05);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
