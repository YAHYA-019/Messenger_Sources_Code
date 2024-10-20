package X;

import com.shopify.checkout.models.Defaults;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw5.class */
public final class Lw5 implements 5Yt {
    public static final Lw5 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lw5] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A14 = JR0.A14("com.shopify.checkout.models.Defaults", (5Yt) obj);
        A14.A01("email", true);
        A14.A01("shippingAddresses", true);
        A14.A01("paymentMethods", true);
        A14.A01("levelOfPriorConsentGiven", true);
        A01 = A14;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = Defaults.A04;
        5ZL r02 = 5ZL.A01;
        return new 5Yu[]{KZ3.A00(r02), KZ3.A00(r0[1]), KZ3.A00(r0[2]), KZ3.A00(r02)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yw[] r0 = Defaults.A04;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new Defaults(str, str2, list, list2, i2);
            }
            if (ALu == 0) {
                str = 4YV.A0w(str, pluginGeneratedSerialDescriptor, ABn, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                list = (List) ABn.AM9(list, r0[1], pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            } else if (ALu == 2) {
                list2 = (List) ABn.AM9(list2, r0[2], pluginGeneratedSerialDescriptor, 2);
                i = i2 | 4;
            } else {
                if (ALu != 3) {
                    throw M9V.A00(ALu);
                }
                str2 = 4YV.A0w(str2, pluginGeneratedSerialDescriptor, ABn, 3);
                i = i2 | 8;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Defaults defaults = (Defaults) obj;
        boolean A1X = 1BL.A1X(encoder, defaults);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = Defaults.A04;
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || defaults.A00 != null) {
            ABo.APv(defaults.A00, 5ZL.A01, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || defaults.A03 != null) {
            ABo.APv(defaults.A03, r0[A1X ? 1 : 0], pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || defaults.A02 != null) {
            ABo.APv(defaults.A02, r0[2], pluginGeneratedSerialDescriptor, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || defaults.A01 != null) {
            ABo.APv(defaults.A01, 5ZL.A01, pluginGeneratedSerialDescriptor, 3);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
