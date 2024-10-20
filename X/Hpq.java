package X;

import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;

/* loaded from: Hpq.class */
public final class Hpq {
    public final 1Br A00 = 1Bq.A00(98708);
    public final 1Br A03 = 1Bu.A00(115998);
    public final 1Br A02 = AbG.A0M();
    public final 1Br A04 = 1BK.A0C();
    public final 1Br A01 = 1Bu.A00(114943);
    public final I3l A05 = (I3l) 1Bn.A0A(115997);

    public Hie A00() {
        FaceTrackerDataProviderConfig faceTrackerDataProviderConfig;
        C00i c00i = this.A04.A00;
        2yD A0M = 1BK.A0M(c00i);
        1GD r0 = 1GD.A07;
        boolean AZr = A0M.AZr(r0, 36311603435605029L);
        int Av9 = (int) 1BK.A0M(c00i).Av9(r0, 36595771360414505L);
        C00i c00i2 = this.A03.A00;
        ((HpG) c00i2.get()).A01 = "messenger_rtc";
        1Br.A0C(this.A01);
        FbP fbP = (FbP) 1Br.A0B(this.A00);
        HpG hpG = (HpG) c00i2.get();
        I3l i3l = this.A05;
        ARClass A01 = i3l.A01();
        C01s A04 = 1Br.A04(this.A02);
        if (AZr) {
            faceTrackerDataProviderConfig = I3l.A00(i3l, 0, false, true);
        } else {
            faceTrackerDataProviderConfig = i3l.A00;
            if (faceTrackerDataProviderConfig == null) {
                faceTrackerDataProviderConfig = new FaceTrackerDataProviderConfig(Av9, 70000, 15000, false, false, 0);
                i3l.A00 = faceTrackerDataProviderConfig;
            }
        }
        return new Hie(A01, faceTrackerDataProviderConfig, new FrameBrightnessDataProviderConfig(0, 0, 0, 7, null), fbP, hpG, A04, "messenger_rtc", null);
    }
}
