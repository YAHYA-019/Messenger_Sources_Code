package X;

import com.shopify.checkout.models.errors.DefaultsErrorCode;
import com.shopify.checkout.models.errors.DefaultsErrorCodeSerializer;
import com.shopify.checkout.models.errors.DefaultsErrorPayload;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: LwJ.class */
public final class LwJ implements 5Yt {
    public static final LwJ A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LwJ, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A14 = JR0.A14("com.shopify.checkout.models.errors.DefaultsErrorPayload", (5Yt) obj);
        JR1.A1P(A14);
        A01 = A14;
    }

    public 5Yu[] childSerializers() {
        5Yu r0 = 5ZL.A01;
        return new 5Yu[]{r0, DefaultsErrorCodeSerializer.A00, KZ3.A00(r0), ErrorGroupSerializer.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        DefaultsErrorCode defaultsErrorCode = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new DefaultsErrorPayload(defaultsErrorCode, errorGroup, str, str2, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                defaultsErrorCode = (DefaultsErrorCode) ABn.AMB(defaultsErrorCode, DefaultsErrorCodeSerializer.A00, pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            } else if (ALu == 2) {
                str2 = 4YV.A0w(str2, pluginGeneratedSerialDescriptor, ABn, 2);
                i = i2 | 4;
            } else {
                if (ALu != 3) {
                    throw M9V.A00(ALu);
                }
                errorGroup = (ErrorGroup) ABn.AMB(errorGroup, ErrorGroupSerializer.A00, pluginGeneratedSerialDescriptor, 3);
                i = i2 | 8;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DefaultsErrorPayload defaultsErrorPayload = (DefaultsErrorPayload) obj;
        boolean A1X = 1BL.A1X(encoder, defaultsErrorPayload);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.AQ0(defaultsErrorPayload.A02, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(defaultsErrorPayload.A00, DefaultsErrorCodeSerializer.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || defaultsErrorPayload.A03 != null) {
            ABo.APv(defaultsErrorPayload.A03, 5ZL.A01, pluginGeneratedSerialDescriptor, 2);
        }
        ABo.APw(defaultsErrorPayload.A01, ErrorGroupSerializer.A00, pluginGeneratedSerialDescriptor, 3);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
