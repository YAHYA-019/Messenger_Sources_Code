package com.facebook.rtc.receivers;

import X.1Lm;
import X.2Qb;
import X.51V;
import X.BOG;
import X.BOd;
import X.BOf;
import X.C5k;
import X.C99;
import X.CPV;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: RtcPictureInPictureReceiver.class */
public final class RtcPictureInPictureReceiver extends 51V {
    public RtcPictureInPictureReceiver() {
        super(new String[]{"RTC_PIP_END_CALL_ACTION", "RTC_PIP_TOGGLE_MUTE_MIC_ACTION", "RTC_PIP_TOGGLE_CAMERA_ACTION", "RTC_PIP_TOGGLE_SPEAKER_ACTION", "RTC_PIP_REWIND_ACTION", "RTC_PIP_PLAY_PAUSE_ACTION", "RTC_PIP_FORWARD_ACTION"});
    }

    public static final void A01(Context context, BOf bOf, BOG bog, BOd bOd, FbUserSession fbUserSession) {
        CPV cpv = (CPV) 1Lm.A06(fbUserSession, 84148);
        2Qb r0 = (2Qb) 1Lm.A05(context, fbUserSession, 17016);
        C5k c5k = new C5k();
        c5k.A00 = bOf;
        c5k.A00(bog);
        c5k.A02 = bOd;
        c5k.A05 = r0.A0A();
        cpv.A04(new C99(c5k));
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x03cb, code lost:
    
        if (r321 != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(android.content.Context r302, android.content.Intent r303, X.C01q r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.receivers.RtcPictureInPictureReceiver.A09(android.content.Context, android.content.Intent, X.01q, java.lang.String):void");
    }
}
