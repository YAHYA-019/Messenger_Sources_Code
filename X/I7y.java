package X;

import android.view.View;
import com.facebook.video.common.playerorigin.PlayerOrigin;

/* loaded from: I7y.class */
public final class I7y {
    public static final I7y A01 = new Object();
    public static final 1Br A00 = 1Bq.A00(115824);

    public static final void A00(View view, PlayerOrigin playerOrigin, Long l, String str) {
        1BL.A1F(str, playerOrigin);
        view.postDelayed(new SBS(playerOrigin, str), 7zS.A08(l));
    }

    public final void A01(PlayerOrigin playerOrigin, String str) {
        6U2 A0o;
        C00i c00i = A00.A00;
        GRS A06 = ((6Tb) c00i.get()).A06(playerOrigin, str);
        if ((A06 != null ? A06.B3e() : null) != 6UR.A07) {
            GRS A062 = ((6Tb) c00i.get()).A06(playerOrigin, str);
            if (A062 == null || (A0o = A062.A0o()) == null) {
                4zI.A03.A06("MediaSyncPlayPauseHelper", "RichVideoPlayer Eventbus not found for action Play", new Object[0]);
            } else {
                GOo.A1M(C52j.A1h, A0o, -1);
            }
        }
    }
}
