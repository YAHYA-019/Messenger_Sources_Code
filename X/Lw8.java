package X;

import com.shopify.checkout.models.Discount;
import com.shopify.checkout.models.Money;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw8.class */
public final class Lw8 implements 5Yt {
    public static final Lw8 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, X.Lw8, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.shopify.checkout.models.Discount", obj, 5);
        pluginGeneratedSerialDescriptor.A01("title", false);
        pluginGeneratedSerialDescriptor.A01("amount", false);
        pluginGeneratedSerialDescriptor.A01("applicationType", false);
        pluginGeneratedSerialDescriptor.A01("valueType", true);
        pluginGeneratedSerialDescriptor.A01("value", true);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu r0 = 5ZL.A01;
        return new 5Yu[]{r0, LwB.A00, r0, KZ3.A00(r0), KZ3.A00(Lv7.A00)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        Money money = null;
        String str2 = null;
        String str3 = null;
        Float f = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new Discount(money, f, str, str2, str3, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                money = (Money) ABn.AMB(money, LwB.A00, pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            } else if (ALu == 2) {
                str2 = ABn.AMG(pluginGeneratedSerialDescriptor, 2);
                i = i2 | 4;
            } else if (ALu == 3) {
                str3 = 4YV.A0w(str3, pluginGeneratedSerialDescriptor, ABn, 3);
                i = i2 | 8;
            } else {
                if (ALu != 4) {
                    throw M9V.A00(ALu);
                }
                f = (Float) ABn.AM9(f, Lv7.A00, pluginGeneratedSerialDescriptor, 4);
                i = i2 | 16;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Discount discount = (Discount) obj;
        boolean A1X = 1BL.A1X(encoder, discount);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.AQ0(discount.A03, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(discount.A00, LwB.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQ0(discount.A02, pluginGeneratedSerialDescriptor, 2);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || discount.A04 != null) {
            ABo.APv(discount.A04, 5ZL.A01, pluginGeneratedSerialDescriptor, 3);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 4) || discount.A01 != null) {
            ABo.APv(discount.A01, Lv7.A00, pluginGeneratedSerialDescriptor, 4);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
