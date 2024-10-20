package X;

import com.shopify.checkout.models.ProgressButton;
import com.shopify.checkout.models.ProgressButtonStage;
import com.shopify.checkout.models.ProgressButtonStageSerializer;
import com.shopify.checkout.models.ProgressButtonState;
import com.shopify.checkout.models.ProgressButtonStateSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: LwH.class */
public final class LwH implements 5Yt {
    public static final LwH A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, X.LwH, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A12 = JR0.A12("com.shopify.checkout.models.ProgressButton", (5Yt) obj);
        A12.A01("state", false);
        A12.A01("stage", false);
        A01 = A12;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{ProgressButtonStateSerializer.A00, ProgressButtonStageSerializer.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        ProgressButtonState progressButtonState = null;
        ProgressButtonStage progressButtonStage = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new ProgressButton(progressButtonStage, progressButtonState, i2);
            }
            if (ALu == 0) {
                progressButtonState = (ProgressButtonState) ABn.AMB(progressButtonState, ProgressButtonStateSerializer.A00, pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else {
                if (ALu != 1) {
                    throw M9V.A00(ALu);
                }
                progressButtonStage = (ProgressButtonStage) ABn.AMB(progressButtonStage, ProgressButtonStageSerializer.A00, pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ProgressButton progressButton = (ProgressButton) obj;
        boolean A1X = 1BL.A1X(encoder, progressButton);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APw(progressButton.A01, ProgressButtonStateSerializer.A00, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(progressButton.A00, ProgressButtonStageSerializer.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
