package X;

import com.facebook.rsys.callmanager.gen.AppInfo;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: Hk5.class */
public final class Hk5 {
    public C00m A00;
    public final AppInfo A01;
    public final LYE A02;
    public final OverlayConfigLayerInterface A03;
    public final XAnalyticsHolder A04;
    public final String A05;
    public final C00m A06;
    public final C00m A07;
    public final C00m A08;
    public final C00m A09;
    public final byte[] A0A;

    public Hk5(AppInfo appInfo, LYE lye, OverlayConfigLayerInterface overlayConfigLayerInterface, XAnalyticsHolder xAnalyticsHolder, String str, C00m c00m, C00m c00m2, C00m c00m3, C00m c00m4, byte[] bArr) {
        7zR.A1N(str, lye);
        11T.A0F(xAnalyticsHolder, 9);
        this.A05 = str;
        this.A01 = appInfo;
        this.A02 = lye;
        this.A03 = overlayConfigLayerInterface;
        this.A08 = c00m;
        this.A09 = c00m2;
        this.A07 = c00m3;
        this.A06 = c00m4;
        this.A04 = xAnalyticsHolder;
        this.A0A = bArr;
    }
}
