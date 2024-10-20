package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: AGo.class */
public final class AGo implements Runnable {
    public static final String __redex_internal_original_name = "MemoryViewerListenerImpl$onHideMenuClick$1$memoryViewerHideBottomSheetListener$1$onThreadHide$onThreadHiddenCallback$1$2";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 9lM A01;
    public final /* synthetic */ MigColorScheme A02;
    public final /* synthetic */ 6LF A03;

    public AGo(Context context, 9lM r303, MigColorScheme migColorScheme, 6LF r305) {
        this.A01 = r303;
        this.A03 = r305;
        this.A02 = migColorScheme;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        9lM r0 = this.A01;
        r0.A00();
        this.A03.A02(r0.A00, this.A02, 1BK.A0u(this.A00, 2131957630));
    }
}
