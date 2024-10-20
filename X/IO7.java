package X;

import android.content.Context;
import com.facebook.avatar.autogen.download.MsgrModelDownloader;
import com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;

/* loaded from: IO7.class */
public final class IO7 implements JKr {
    public HBF A00;
    public boolean A01;
    public boolean A02;
    public final AEFaceTrackerManager A03;
    public final AESelfieCaptureConfig A04;
    public final I2e A05;
    public final 0Xs A06;
    public final 2Zs A07;

    public IO7(Context context, AESelfieCaptureConfig aESelfieCaptureConfig, I2e i2e, 2Zs r305) {
        11T.A0F(r305, 4);
        this.A04 = aESelfieCaptureConfig;
        this.A05 = i2e;
        this.A07 = r305;
        MsgrModelDownloader msgrModelDownloader = aESelfieCaptureConfig.A00;
        AEFaceTrackerManager aEFaceTrackerManager = AEFaceTrackerManager.faceTrackerManager;
        aEFaceTrackerManager = aEFaceTrackerManager == null ? new AEFaceTrackerManager(7zM.A0B(context), msgrModelDownloader, null) : aEFaceTrackerManager;
        AEFaceTrackerManager.faceTrackerManager = aEFaceTrackerManager;
        AEFaceTrackerManager.delegate = this;
        this.A03 = aEFaceTrackerManager;
        this.A06 = 0Du.A00((Object) null);
        this.A01 = true;
        7zO.A1W(this, 2aG.A02(r305), 32);
    }

    @Override // X.JKr
    public void BmS(Exception exc) {
    }

    @Override // X.JKr
    public void BmW() {
    }

    @Override // X.JKr
    public void Bma(String str, String str2) {
    }

    @Override // X.JKr
    public void Bmg() {
    }
}
