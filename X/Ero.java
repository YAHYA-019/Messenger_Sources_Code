package X;

import android.content.Intent;
import com.facebook.messaging.dma.ui.MsplitContactExportWebviewLauncher;

/* loaded from: Ero.class */
public final class Ero {
    public final /* synthetic */ MsplitContactExportWebviewLauncher A00;

    public Ero(MsplitContactExportWebviewLauncher msplitContactExportWebviewLauncher) {
        this.A00 = msplitContactExportWebviewLauncher;
    }

    public final void onSharesheetOpen(String str) {
        08O A0l = 7zR.A0l();
        Intent createChooser = Intent.createChooser(DKF.A08(str), null);
        11T.A0A(createChooser);
        A0l.A01().A0A(this.A00, createChooser);
    }
}
