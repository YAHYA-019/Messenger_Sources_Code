package X;

import android.content.Context;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.rooms2live.Rooms2LiveImplementation;

/* loaded from: Gpu.class */
public final class Gpu extends HG1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Rooms2LiveImplementation A01;

    public Gpu(Context context, Rooms2LiveImplementation rooms2LiveImplementation) {
        this.A01 = rooms2LiveImplementation;
        this.A00 = context;
    }

    public void A02() {
        HBr hBr;
        int i;
        Rooms2LiveImplementation rooms2LiveImplementation = this.A01;
        if (GOp.A0X(rooms2LiveImplementation.A02).A0A) {
            hBr = HBr.A10;
            1Br.A0C(rooms2LiveImplementation.A01);
            i = 2131964683;
        } else {
            hBr = HBr.A0z;
            1Br.A0C(rooms2LiveImplementation.A01);
            i = 2131964684;
        }
        DKE.A0K(rooms2LiveImplementation.A03).post(new SEB(this.A00, hBr, rooms2LiveImplementation, i));
    }
}
