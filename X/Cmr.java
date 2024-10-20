package X;

import android.content.Context;
import com.facebook.messaging.search.lists.model.FTSMessageIndexProgress;

/* loaded from: Cmr.class */
public final class Cmr implements InterfaceC10284sz {
    public final /* synthetic */ Context A00;

    public Cmr(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC10284sz
    public final void Bq6(FTSMessageIndexProgress fTSMessageIndexProgress) {
        int i = fTSMessageIndexProgress.A01;
        if (i == 0 || i > fTSMessageIndexProgress.A00) {
            AbstractC10434te.A00(this.A00);
        }
    }
}
