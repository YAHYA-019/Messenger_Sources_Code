package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.HashMap;

/* loaded from: I2f.class */
public final class I2f {
    public java.util.Map A00;
    public final HFP A01;
    public final HDT A02;
    public final HPI A03;
    public final Hi2 A04;
    public final ProductFeatureConfig A05;
    public final Hh4 A06;
    public final NetworkPolicyConfiguration A07;
    public final HashMap A08;

    public I2f(IAV iav) {
        HashMap A0u = AnonymousClass001.A0u();
        this.A08 = A0u;
        A0u.putAll(iav.A08);
        this.A01 = iav.A00;
        this.A00 = iav.A07;
        this.A04 = iav.A03;
        this.A02 = iav.A01;
        this.A05 = iav.A04;
        this.A03 = iav.A02;
        this.A06 = iav.A05;
        this.A07 = iav.A06;
    }

    public static IAV A00(Context context) {
        IAV iav = new IAV();
        iav.A05 = new Hh4(context, null, false);
        return iav;
    }

    public HFT A01(Hy3 hy3) {
        HFT hft = (HFT) this.A08.get(hy3);
        if (hft != null) {
            return hft;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Invalid configuration key: ");
        A0k.append(hy3);
        throw AnonymousClass002.A0D(" Please use hasConfiguration() to check if the configuration is available.", A0k);
    }
}
