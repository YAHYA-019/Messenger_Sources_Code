package X;

import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;

/* loaded from: Hie.class */
public final class Hie {
    public I8T A00;
    public final ARClass A01;
    public final HfZ A02;
    public final FbP A03;
    public final HpG A04;
    public final C01s A05;
    public final String A06;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.HfZ, java.lang.Object] */
    public Hie(ARClass aRClass, FaceTrackerDataProviderConfig faceTrackerDataProviderConfig, FrameBrightnessDataProviderConfig frameBrightnessDataProviderConfig, FbP fbP, HpG hpG, C01s c01s, String str, String str2) {
        I8T i8t = new I8T(str);
        this.A06 = str2;
        this.A03 = fbP;
        this.A04 = hpG;
        this.A01 = aRClass;
        this.A05 = c01s;
        this.A00 = i8t;
        ?? obj = new Object();
        ((HfZ) obj).A01 = faceTrackerDataProviderConfig;
        ((HfZ) obj).A02 = frameBrightnessDataProviderConfig;
        this.A02 = obj;
    }
}
