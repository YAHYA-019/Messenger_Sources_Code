package X;

import android.os.Bundle;
import com.facebook.games.dmaconsent.optoutbottomsheet.FBGamingDMAOptoutSheetActivity;

/* loaded from: G3l.class */
public final class G3l implements Runnable {
    public static final String __redex_internal_original_name = "FBGamingDMAOptoutSheetActivity$updateChoiceListener$1$1$onProceedWithStandardFlow$1";
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FBGamingDMAOptoutSheetActivity A01;
    public final /* synthetic */ EiQ A02;

    public G3l(Bundle bundle, FBGamingDMAOptoutSheetActivity fBGamingDMAOptoutSheetActivity, EiQ eiQ) {
        this.A02 = eiQ;
        this.A01 = fBGamingDMAOptoutSheetActivity;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.finish();
    }
}
