package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.business.bizrtc.model.PageMessageNotification;
import java.util.ArrayList;

/* loaded from: D9s.class */
public final class D9s implements Runnable {
    public static final String __redex_internal_original_name = "PageMessageNotificationHandler$4";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PageMessageNotification A01;
    public final /* synthetic */ C04274ai A02;
    public final /* synthetic */ ArrayList A03;

    public D9s(Context context, PageMessageNotification pageMessageNotification, C04274ai c04274ai, ArrayList arrayList) {
        this.A02 = c04274ai;
        this.A00 = context;
        this.A01 = pageMessageNotification;
        this.A03 = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        C04274ai c04274ai = this.A02;
        CallerContext callerContext = C04274ai.A0L;
        AbF.A0l(c04274ai.A0A).A0E(new Cny(this, 1), this.A03, false, false);
    }
}
