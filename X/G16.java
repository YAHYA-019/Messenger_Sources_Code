package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.voltron.ui.impl.AppModuleDownloadActivity2;

/* loaded from: G16.class */
public final class G16 implements Runnable {
    public static final String __redex_internal_original_name = "AppModuleDownloadActivity2$2";
    public final /* synthetic */ AppModuleDownloadActivity2 A00;

    public G16(AppModuleDownloadActivity2 appModuleDownloadActivity2) {
        this.A00 = appModuleDownloadActivity2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        AppModuleDownloadActivity2 appModuleDownloadActivity2 = this.A00;
        if (appModuleDownloadActivity2.A08) {
            obj = "activity_paused";
        } else if (appModuleDownloadActivity2.A03 != null) {
            obj = "window_showing";
        } else {
            if (!appModuleDownloadActivity2.A09) {
                1Iw A0W = 7zL.A0W(appModuleDownloadActivity2);
                CallerContext A06 = CallerContext.A06(AppModuleDownloadActivity2.class);
                FFJ ffj = new FFJ(A0W);
                C2148Dfc c2148Dfc = new C2148Dfc(A0W);
                c2148Dfc.A0f(2131966004);
                c2148Dfc.A06 = 0S2.A01;
                AbstractC2158Dfm abstractC2158Dfm = new AbstractC2158Dfm(A0W);
                abstractC2158Dfm.A0i(2131966003);
                DfG A0h = abstractC2158Dfm.A0h(2131966002);
                A0h.A04 = new Dui();
                c2148Dfc.A03 = RXy.A00(A0h);
                ffj.A00 = c2148Dfc;
                11T.A0F(RWN.A00, 0);
                ffj.A01 = new RYA(Integer.valueOf(LogcatReader.DEFAULT_WAIT_TIME));
                EzN A02 = ffj.A02(A06);
                appModuleDownloadActivity2.A03 = A02;
                A02.A01();
                appModuleDownloadActivity2.A09 = true;
                return;
            }
            obj = "window_already_shown";
        }
        0fH.A0g(obj, "AppModuleDownloadActivity2", "Skipping slow download instant feedback: reason=%s");
    }
}
