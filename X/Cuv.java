package X;

import android.content.Context;
import com.facebook.messaging.quickpromotion.model.MessengerQuickPromotionViewModel;
import java.util.List;

/* loaded from: Cuv.class */
public final class Cuv implements AYH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ MessengerQuickPromotionViewModel A01;
    public final /* synthetic */ 7Q7 A02;
    public final /* synthetic */ String A03;

    public Cuv(Context context, MessengerQuickPromotionViewModel messengerQuickPromotionViewModel, 7Q7 r304, String str) {
        this.A02 = r304;
        this.A01 = messengerQuickPromotionViewModel;
        this.A03 = str;
        this.A00 = context;
    }

    public final void onDismiss() {
        C00i c00i = this.A02.A03.A00;
        if (c00i.get() != null) {
            ((2bM) c00i.get()).A03(this.A01.A01, this.A03, (List) null, (java.util.Map) null);
        }
    }
}
