package X;

import com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayContainerView;
import com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayPlayerView;

/* loaded from: Frc.class */
public final class Frc implements GGQ {
    public final /* synthetic */ CoplayContainerView A00;

    public Frc(CoplayContainerView coplayContainerView) {
        this.A00 = coplayContainerView;
    }

    public void BtO() {
        CoplayContainerView coplayContainerView = this.A00;
        coplayContainerView.A07 = true;
        CoplayPlayerView coplayPlayerView = coplayContainerView.A06;
        if (coplayPlayerView != null) {
            coplayPlayerView.A02();
        }
    }
}
