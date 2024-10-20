package X;

import android.content.Context;
import com.facebook.payments.p2m.nux.P2mBuyerValuePropBottomSheetActivity;

/* loaded from: Fmc.class */
public final class Fmc implements GFa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ E5s A01;

    public Fmc(Context context, E5s e5s) {
        this.A01 = e5s;
        this.A00 = context;
    }

    @Override // X.GFa
    public void BoD() {
        Context context = this.A00;
        AbK.A0q(this.A01.A04).A0A(context, C3o5.A0D(context, P2mBuyerValuePropBottomSheetActivity.class));
    }
}
