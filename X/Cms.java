package X;

import android.os.Bundle;
import com.facebook.messaging.search.lists.model.FTSMessageIndexProgress;

/* loaded from: Cms.class */
public final /* synthetic */ class Cms implements InterfaceC10284sz {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AmA A01;

    public /* synthetic */ Cms(Bundle bundle, AmA amA) {
        this.A01 = amA;
        this.A00 = bundle;
    }

    @Override // X.InterfaceC10284sz
    public final void Bq6(FTSMessageIndexProgress fTSMessageIndexProgress) {
        AmA amA = this.A01;
        Bundle bundle = this.A00;
        if (fTSMessageIndexProgress.A01 > fTSMessageIndexProgress.A00) {
            amA.A09 = 0S2.A00;
        }
        AmA.A06(bundle, amA);
    }
}
