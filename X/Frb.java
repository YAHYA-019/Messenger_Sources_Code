package X;

import com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayContainerConstraintView;
import com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayPlayerView;

/* loaded from: Frb.class */
public final class Frb implements GGQ {
    public final /* synthetic */ CoplayContainerConstraintView A00;

    public Frb(CoplayContainerConstraintView coplayContainerConstraintView) {
        this.A00 = coplayContainerConstraintView;
    }

    public void BtO() {
        CoplayContainerConstraintView coplayContainerConstraintView = this.A00;
        coplayContainerConstraintView.A05 = true;
        CoplayPlayerView coplayPlayerView = coplayContainerConstraintView.A04;
        if (coplayPlayerView != null) {
            coplayPlayerView.A02();
        }
    }
}
