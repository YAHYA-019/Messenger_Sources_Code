package X;

import com.facebook.neko.directinstall.digitalturbine.AIDLInstallationProgress;
import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.InstallationProgress;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvn.class */
public final class Lvn implements 5Yt {
    public static final Lvn A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lvn, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A12 = JR0.A12("com.facebook.neko.directinstall.digitalturbine.InstallationProgress", (5Yt) obj);
        A12.A01("progress", false);
        A12.A01("application", false);
        A01 = A12;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{Lvc.A00, Lvd.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        AIDLInstallationProgress aIDLInstallationProgress = null;
        DTApplication dTApplication = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new InstallationProgress(aIDLInstallationProgress, dTApplication, i2);
            }
            if (ALu == 0) {
                aIDLInstallationProgress = (AIDLInstallationProgress) ABn.AMB(aIDLInstallationProgress, Lvc.A00, pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else {
                if (ALu != 1) {
                    throw M9V.A00(ALu);
                }
                dTApplication = (DTApplication) ABn.AMB(dTApplication, Lvd.A00, pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InstallationProgress installationProgress = (InstallationProgress) obj;
        boolean A1X = 1BL.A1X(encoder, installationProgress);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APw(installationProgress.A00, Lvc.A00, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(installationProgress.A01, Lvd.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
