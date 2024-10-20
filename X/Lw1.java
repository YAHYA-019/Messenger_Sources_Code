package X;

import com.shopify.checkout.models.CartLineImage;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw1.class */
public final class Lw1 implements 5Yt {
    public static final Lw1 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lw1] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A14 = JR0.A14("com.shopify.checkout.models.CartLineImage", (5Yt) obj);
        A14.A01("sm", false);
        A14.A01("md", false);
        A14.A01("lg", false);
        A14.A01("altText", true);
        A01 = A14;
    }

    public 5Yu[] childSerializers() {
        5Yu r0 = 5ZL.A01;
        return new 5Yu[]{r0, r0, r0, KZ3.A00(r0)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new CartLineImage(str, str2, str3, str4, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                str2 = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            } else if (ALu == 2) {
                str3 = ABn.AMG(pluginGeneratedSerialDescriptor, 2);
                i = i2 | 4;
            } else {
                if (ALu != 3) {
                    throw M9V.A00(ALu);
                }
                str4 = 4YV.A0w(str4, pluginGeneratedSerialDescriptor, ABn, 3);
                i = i2 | 8;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CartLineImage cartLineImage = (CartLineImage) obj;
        boolean A1X = 1BL.A1X(encoder, cartLineImage);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.AQ0(cartLineImage.A03, pluginGeneratedSerialDescriptor, 0);
        ABo.AQ0(cartLineImage.A02, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQ0(cartLineImage.A01, pluginGeneratedSerialDescriptor, 2);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || cartLineImage.A00 != null) {
            ABo.APv(cartLineImage.A00, 5ZL.A01, pluginGeneratedSerialDescriptor, 3);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
