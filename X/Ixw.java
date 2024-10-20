package X;

import com.facebook.rtc.expression.RtcVideoExpressionInitializer;
import java.util.EnumMap;

/* loaded from: Ixw.class */
public final class Ixw implements Runnable {
    public static final String __redex_internal_original_name = "RtcVideoExpressionInitializer$1";
    public final /* synthetic */ IPz A00;
    public final /* synthetic */ RtcVideoExpressionInitializer A01;

    public Ixw(IPz iPz, RtcVideoExpressionInitializer rtcVideoExpressionInitializer) {
        this.A01 = rtcVideoExpressionInitializer;
        this.A00 = iPz;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (1Br.A07(((4qF) this.A01.A04.get()).A02).AZk(36313853998537870L)) {
            IPz iPz = this.A00;
            if (7zM.A1b(IPz.A00(iPz).A04())) {
                return;
            }
            iPz.A07(new HsJ(HAl.A02, H9U.A03, GOo.A0k(new EnumMap(HCR.class)), 86400, (String) null));
        }
    }
}
