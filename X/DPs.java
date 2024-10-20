package X;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import java.io.Serializable;

/* loaded from: DPs.class */
public final class DPs extends FrameLayout {
    public Integer A00;

    public static final void A00(DPs dPs) {
        Intent A05 = AbF.A05();
        Context context = dPs.getContext();
        A05.setClassName(context, "com.facebook.onsitesignals.autofill.AutofillFullScreenActivity");
        A05.putExtra("activity_resource", "open_link");
        A05.putExtra("link_type", (Serializable) Qp8.A05);
        0LS.A0A(context, A05);
    }
}
