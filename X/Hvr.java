package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rtc.interfaces.RtcCallStartParams;

/* loaded from: Hvr.class */
public final class Hvr {
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.JQN] */
    public static final JQN A00(CallModel callModel, 2QO r302, JOY joy) {
        11T.A0F(joy, 0);
        11T.A0F(r302, 2);
        if (IFr.A0L(callModel)) {
            if (callModel.selfParticipant.isCaller) {
                return joy.D23(true, (String) null, true, ((2QN) r302).A0a);
            }
            if (callModel.inCallState == 2) {
                return joy.D1l(true, true, callModel.inviteRequestedVideo);
            }
        }
        2QN r0 = (2QN) r302;
        RtcCallStartParams rtcCallStartParams = r0.A09;
        return (rtcCallStartParams != null ? rtcCallStartParams.A00() : null) == 0S2.A0C ? joy.D1o((Boolean) null, r0.A0a) : callModel.selfParticipant.isCaller ? joy.D23(true, (String) null, false, r0.A0a) : callModel.inCallState == 2 ? joy.D1l(true, false, callModel.inviteRequestedVideo) : new Object();
    }
}
