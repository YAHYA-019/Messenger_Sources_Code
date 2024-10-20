package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.google.common.base.Preconditions;

/* loaded from: Kti.class */
public final class Kti {
    public int A00;
    public int A01;
    public LightweightQuickPerformanceLogger A02;
    public MarkerEditor A03;
    public String A04;
    public String A05;
    public boolean A06;

    public static void A00(Kti kti) {
        kti.A03.getClass();
        Preconditions.checkState(kti.A06);
    }

    public void A01() {
        MarkerEditor withMarker = this.A02.withMarker(this.A00, this.A01);
        this.A03 = withMarker;
        withMarker.annotate("module", this.A05);
        this.A03.annotate(7zK.A00(ActionId.RTMP_STREAM_PREPARED), this.A04);
        this.A06 = true;
    }

    public void A02(String str, double d) {
        A00(this);
        this.A03.annotate(str, d);
    }

    public void A03(String str, String str2) {
        A00(this);
        if (str2 != null) {
            this.A03.annotate(str, str2);
        }
    }
}
