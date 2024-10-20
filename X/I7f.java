package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.rsys.call.gen.CallModel;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: I7f.class */
public final class I7f {
    public int A00;
    public ScheduledFuture A01;
    public ScheduledFuture A02;
    public boolean A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 2JM A08;
    public final 1De A09;

    public I7f(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A09 = r303;
        this.A05 = 7zM.A0S();
        1BY r0 = r303.A00;
        this.A06 = 1Lm.A03(fbUserSession, r0, 99977);
        this.A04 = GOn.A0g(fbUserSession, r0);
        this.A07 = 1Bq.A00(16462);
        this.A08 = IY8.A01(this, 5);
    }

    public static final void A00(I7f i7f) {
        synchronized (i7f) {
            if (IFr.A0C(GS1.A01(i7f.A04))) {
                C00i c00i = i7f.A05.A00;
                if (1BK.A0V(c00i).isMarkerOn(513945212)) {
                    1BK.A0V(c00i).markerDrop(513945212);
                }
                ScheduledFuture scheduledFuture = i7f.A01;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                1BK.A0V(c00i).markerStart(513945212, false);
                i7f.A01 = GOp.A1H(i7f.A07).schedule((Runnable) new IrE(i7f), 10, TimeUnit.SECONDS);
            } else {
                ScheduledFuture scheduledFuture2 = i7f.A02;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                }
                i7f.A02 = GOp.A1H(i7f.A07).schedule((Runnable) new IrD(i7f), 2, TimeUnit.SECONDS);
            }
        }
    }

    public static final void A01(I7f i7f, short s) {
        synchronized (i7f) {
            CallModel A01 = GS1.A01(i7f.A04);
            C00i c00i = i7f.A05.A00;
            if (1BK.A0V(c00i).isMarkerOn(513945212)) {
                MarkerEditor withMarker = 1BK.A0V(c00i).withMarker(513945212);
                withMarker.annotate("is_group_call", IFr.A0L(A01));
                withMarker.annotate("is_video", GOq.A0s(i7f.A06).A0a);
                withMarker.markerEditingCompleted();
                1BK.A0V(c00i).markerEnd(513945212, s);
            }
        }
    }
}
