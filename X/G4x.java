package X;

import android.app.Activity;
import com.facebook.dialtone.carrierinsights.CarrierInsightsDialog;

/* loaded from: G4x.class */
public final class G4x implements Runnable {
    public static final String __redex_internal_original_name = "CarrierInsightsDialog$showCarrierInsightsDialog$1";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ CarrierInsightsDialog A01;
    public final /* synthetic */ 67O A02;
    public final /* synthetic */ Integer A03;

    public G4x(Activity activity, CarrierInsightsDialog carrierInsightsDialog, 67O r304, Integer num) {
        this.A01 = carrierInsightsDialog;
        this.A00 = activity;
        this.A03 = num;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((FIP) 1Br.A0B(this.A01.A06)).A06(this.A00, this.A02, (Object) null, 3GC.A00(this.A03));
    }
}
