package X;

import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.AuthenticationVersion;
import com.shopify.checkout.models.AuthenticationVersionSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvx.class */
public final class Lvx implements 5Yt {
    public static final Lvx A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lvx, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A12 = JR0.A12("com.shopify.checkout.models.Authentication", (5Yt) obj);
        A12.A01(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, false);
        A12.A01("payload", false);
        A01 = A12;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{AuthenticationVersionSerializer.A00, 5ZL.A01};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        AuthenticationVersion authenticationVersion = null;
        String str = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new Authentication(authenticationVersion, str, i2);
            }
            if (ALu == 0) {
                authenticationVersion = (AuthenticationVersion) ABn.AMB(authenticationVersion, AuthenticationVersionSerializer.A00, pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else {
                if (ALu != 1) {
                    throw M9V.A00(ALu);
                }
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Authentication authentication = (Authentication) obj;
        boolean A1X = 1BL.A1X(encoder, authentication);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APw(authentication.A00, AuthenticationVersionSerializer.A00, pluginGeneratedSerialDescriptor, 0);
        ABo.AQ0(authentication.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
