package X;

import com.shopify.checkout.models.Money;
import com.shopify.checkout.models.Price;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: LwG.class */
public final class LwG implements 5Yt {
    public static final LwG A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, X.LwG, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.shopify.checkout.models.Price", obj, 6);
        pluginGeneratedSerialDescriptor.A01("total", true);
        pluginGeneratedSerialDescriptor.A01("subtotal", true);
        pluginGeneratedSerialDescriptor.A01("taxes", true);
        pluginGeneratedSerialDescriptor.A01("taxesIncluded", true);
        pluginGeneratedSerialDescriptor.A01("shipping", true);
        pluginGeneratedSerialDescriptor.A01("discounts", true);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = Price.A06;
        LwB lwB = LwB.A00;
        return new 5Yu[]{KZ3.A00(lwB), KZ3.A00(lwB), KZ3.A00(lwB), KZ3.A00(Lv3.A00), KZ3.A00(lwB), KZ3.A00(r0[5])};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yw[] r0 = Price.A06;
        Money money = null;
        Money money2 = null;
        Money money3 = null;
        Boolean bool = null;
        Money money4 = null;
        List list = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new Price(money, money2, money3, money4, bool, list, i2);
                case 0:
                    money = (Money) ABn.AM9(money, LwB.A00, pluginGeneratedSerialDescriptor, 0);
                    i = i2 | 1;
                    break;
                case 1:
                    money2 = (Money) ABn.AM9(money2, LwB.A00, pluginGeneratedSerialDescriptor, 1);
                    i = i2 | 2;
                    break;
                case 2:
                    money3 = (Money) ABn.AM9(money3, LwB.A00, pluginGeneratedSerialDescriptor, 2);
                    i = i2 | 4;
                    break;
                case 3:
                    bool = (Boolean) ABn.AM9(bool, Lv3.A00, pluginGeneratedSerialDescriptor, 3);
                    i = i2 | 8;
                    break;
                case 4:
                    money4 = (Money) ABn.AM9(money4, LwB.A00, pluginGeneratedSerialDescriptor, 4);
                    i = i2 | 16;
                    break;
                case 5:
                    list = (List) ABn.AM9(list, r0[5], pluginGeneratedSerialDescriptor, 5);
                    i = i2 | 32;
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
        Price price = (Price) obj;
        boolean A1X = 1BL.A1X(encoder, price);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = Price.A06;
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || price.A03 != null) {
            ABo.APv(price.A03, LwB.A00, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || price.A01 != null) {
            ABo.APv(price.A01, LwB.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || price.A02 != null) {
            ABo.APv(price.A02, LwB.A00, pluginGeneratedSerialDescriptor, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || price.A04 != null) {
            ABo.APv(price.A04, Lv3.A00, pluginGeneratedSerialDescriptor, 3);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 4) || price.A00 != null) {
            ABo.APv(price.A00, LwB.A00, pluginGeneratedSerialDescriptor, 4);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 5) || price.A05 != null) {
            ABo.APv(price.A05, r0[5], pluginGeneratedSerialDescriptor, 5);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
