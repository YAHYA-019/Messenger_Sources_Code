package X;

import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.CheckoutOptions;
import com.shopify.checkout.models.Defaults;
import com.shopify.checkout.models.ThemeOptions;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw3.class */
public final class Lw3 implements 5Yt {
    public static final Lw3 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lw3] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A14 = JR0.A14("com.shopify.checkout.models.CheckoutOptions", (5Yt) obj);
        A14.A01("defaults", true);
        A14.A01("auth", false);
        A14.A01("shouldInjectJS", true);
        A14.A01("theme", true);
        A01 = A14;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{KZ3.A00(Lw5.A00), Lvx.A00, Lv3.A00, CheckoutOptions.A04[3]};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yu[] r0 = CheckoutOptions.A04;
        Defaults defaults = null;
        Authentication authentication = null;
        ThemeOptions themeOptions = null;
        int i = 0;
        boolean z = false;
        while (true) {
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new CheckoutOptions(authentication, defaults, themeOptions, i, z);
            }
            if (ALu == 0) {
                defaults = (Defaults) ABn.AM9(defaults, Lw5.A00, pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (ALu == 1) {
                authentication = (Authentication) ABn.AMB(authentication, Lvx.A00, pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (ALu == 2) {
                z = ABn.ALn(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                if (ALu != 3) {
                    throw M9V.A00(ALu);
                }
                themeOptions = (ThemeOptions) JQz.A0h(themeOptions, pluginGeneratedSerialDescriptor, ABn, r0, 3);
                i |= 8;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutOptions checkoutOptions = (CheckoutOptions) obj;
        boolean A1X = 1BL.A1X(encoder, checkoutOptions);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = CheckoutOptions.A04;
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || checkoutOptions.A01 != null) {
            ABo.APv(checkoutOptions.A01, Lw5.A00, pluginGeneratedSerialDescriptor, 0);
        }
        ABo.APw(checkoutOptions.A00, Lvx.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || checkoutOptions.A03) {
            ABo.APg(pluginGeneratedSerialDescriptor, 2, checkoutOptions.A03);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || checkoutOptions.A02 != ThemeOptions.A03) {
            ABo.APw(checkoutOptions.A02, r0[3], pluginGeneratedSerialDescriptor, 3);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
