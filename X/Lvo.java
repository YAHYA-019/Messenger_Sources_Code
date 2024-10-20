package X;

import com.facebook.neko.directinstall.digitalturbine.InstallationProgress;
import com.facebook.neko.directinstall.digitalturbine.InstallationProgressData;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvo.class */
public final class Lvo implements 5Yt {
    public static final Lvo A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lvo, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A14 = JR0.A14("com.facebook.neko.directinstall.digitalturbine.InstallationProgressData", (5Yt) obj);
        A14.A01("data", false);
        A14.A01("taskId", false);
        A14.A01("value", true);
        A14.A01("action", true);
        A01 = A14;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{Lvn.A00, 5ZL.A01, Lv6.A00, Lv8.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        InstallationProgress installationProgress = null;
        String str = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new InstallationProgressData(installationProgress, str, d, i3, i);
            }
            if (ALu == 0) {
                installationProgress = (InstallationProgress) ABn.AMB(installationProgress, Lvn.A00, pluginGeneratedSerialDescriptor, 0);
                i2 = i3 | 1;
            } else if (ALu == 1) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                i2 = i3 | 2;
            } else if (ALu == 2) {
                d = ABn.ALt(pluginGeneratedSerialDescriptor, 2);
                i2 = i3 | 4;
            } else {
                if (ALu != 3) {
                    throw M9V.A00(ALu);
                }
                i = ABn.AM4(pluginGeneratedSerialDescriptor, 3);
                i2 = i3 | 8;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InstallationProgressData installationProgressData = (InstallationProgressData) obj;
        boolean A1X = 1BL.A1X(encoder, installationProgressData);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        Lvn lvn = Lvn.A00;
        InstallationProgress installationProgress = installationProgressData.A02;
        ABo.APw(installationProgress, lvn, pluginGeneratedSerialDescriptor, 0);
        ABo.AQ0(installationProgressData.A03, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || Double.compare(installationProgressData.A00, installationProgress.A00.A00) != 0) {
            ABo.APk(pluginGeneratedSerialDescriptor, installationProgressData.A00, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || installationProgressData.A01 != installationProgress.A00.A01) {
            ABo.APr(pluginGeneratedSerialDescriptor, 3, installationProgressData.A01);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
