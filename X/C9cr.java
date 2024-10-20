package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9cr, reason: invalid class name */
/* loaded from: 9cr.class */
public final class C9cr {
    public long A00;
    public final 1Br A01;
    public final 1Br A02;
    public final AtomicBoolean A03;
    public final FbUserSession A04;

    public C9cr(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A04 = fbUserSession;
        this.A02 = 7zM.A0S();
        this.A01 = 1Bq.A00(84488);
        this.A03 = 7zO.A15();
        this.A00 = -1;
    }

    public final void A00() {
        1Br r0 = this.A02;
        if (7zP.A0e(r0).isMarkerOn(5513647)) {
            0fH.A0j("HighlightsTabStoriesQplLogger", "TAB_LOAD Flow - End trace with Cancel");
            7zP.A0e(r0).markerEnd(5513647, (short) 4);
        }
    }

    public final void A01() {
        1Br r0 = this.A02;
        if (7zP.A0e(r0).isMarkerOn(5513647)) {
            if (!this.A03.get()) {
                0fH.A0j("HighlightsTabStoriesQplLogger", "TAB_LOAD Flow - Tried to end trace with Success but montage not loaded");
            } else {
                0fH.A0j("HighlightsTabStoriesQplLogger", "TAB_LOAD Flow - End trace with Success");
                7zP.A0e(r0).markerEnd(5513647, (short) 2);
            }
        }
    }

    public final void A02(String str) {
        1Br r0 = this.A02;
        if (!7zP.A0e(r0).isMarkerOn(5513647)) {
            1BK.A1Q("TAB_LOAD Flow - 5513647 is not running but trying to mark montage_fetch_end from ", str, "HighlightsTabStoriesQplLogger");
            return;
        }
        this.A03.set(true);
        0fH.A0j("HighlightsTabStoriesQplLogger", "TAB_LOAD Flow - mark montage_fetch_end");
        7zP.A0e(r0).markerPoint(5513647, "montage_fetch_end", 1Br.A01(this.A01) - this.A00, TimeUnit.MILLISECONDS);
    }

    public final void A03(String str) {
        1Br r0 = this.A02;
        if (!7zP.A0e(r0).isMarkerOn(5513647)) {
            1BK.A1Q("TAB_LOAD Flow - 5513647 is not running but trying to mark montage_fetch_start from ", str, "HighlightsTabStoriesQplLogger");
            return;
        }
        this.A03.set(false);
        0fH.A0j("HighlightsTabStoriesQplLogger", "TAB_LOAD Flow - mark montage_fetch_start");
        7zP.A0e(r0).markerPoint(5513647, "montage_fetch_start", 1Br.A01(this.A01) - this.A00, TimeUnit.MILLISECONDS);
    }

    public final void A04(String str) {
        1Br r0 = this.A02;
        if (7zP.A0e(r0).isMarkerOn(5513647)) {
            1BK.A1Q("TAB_LOAD Flow - 5513647 is already started but trying to start trace from ", str, "HighlightsTabStoriesQplLogger");
            return;
        }
        this.A00 = 1Br.A01(this.A01);
        0fH.A0j("HighlightsTabStoriesQplLogger", "TAB_LOAD Flow - Start trace");
        7zP.A0e(r0).markerStart(5513647);
    }
}
