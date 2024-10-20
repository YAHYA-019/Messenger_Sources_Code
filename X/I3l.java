package X;

import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;

/* loaded from: I3l.class */
public final class I3l {
    public FaceTrackerDataProviderConfig A00;
    public HgT A01;
    public final 1Br A03 = 1BK.A0C();
    public final 1Br A05 = 1BK.A0E();
    public final 1Br A04 = 1Bu.A00(115998);
    public final 1Br A02 = AbG.A0M();

    public static final FaceTrackerDataProviderConfig A00(I3l i3l, int i, boolean z, boolean z2) {
        FaceTrackerDataProviderConfig faceTrackerDataProviderConfig = i3l.A00;
        if (faceTrackerDataProviderConfig == null) {
            faceTrackerDataProviderConfig = new FaceTrackerDataProviderConfig(30000, 70000, 15000, z, z2, i);
            i3l.A00 = faceTrackerDataProviderConfig;
        }
        return faceTrackerDataProviderConfig;
    }

    public ARClass A01() {
        HGg hGg = ARClass.Companion;
        return new ARClass(C1Ur.A00(1Br.A06(this.A03), 0, 36596694774713401L));
    }

    public HgT A02() {
        HgT hgT = this.A01;
        if (hgT == null) {
            C00i c00i = this.A05.A00;
            boolean AZn = 1BK.A0S(c00i).AZn(HOA.A00, false);
            hgT = new HgT(1BK.A0S(c00i).AZn(HOA.A01, false) ? HAz.A04 : HAz.A03, AZn ? 1 : 0, AZn);
            this.A01 = hgT;
        }
        return hgT;
    }
}
