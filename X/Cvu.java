package X;

import com.facebook.messaging.rtc.analytics.model.RtcListItemTrackableItem;

/* loaded from: Cvu.class */
public final class Cvu implements 55F {
    public final /* synthetic */ RtcListItemTrackableItem A00;
    public final /* synthetic */ B7m A01;

    public Cvu(RtcListItemTrackableItem rtcListItemTrackableItem, B7m b7m) {
        this.A01 = b7m;
        this.A00 = rtcListItemTrackableItem;
    }

    public void C2K() {
        CDR cdr = this.A01.A0G;
        RtcListItemTrackableItem A00 = CDR.A00(cdr, this.A00);
        if (A00 != null) {
            cdr.A02.A03(A00);
        }
    }

    public void CUo() {
        CDR cdr = this.A01.A0G;
        RtcListItemTrackableItem A00 = CDR.A00(cdr, this.A00);
        if (A00 != null) {
            cdr.A02.A02(A00);
        }
    }
}
