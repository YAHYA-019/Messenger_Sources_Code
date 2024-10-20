package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import kotlin.jvm.functions.Function1;

/* loaded from: Hwn.class */
public abstract class Hwn {
    public static Function1 A00 = HNv.A01;
    public static Function1 A01 = HNv.A00;

    public static final void A00(Context context, FbUserSession fbUserSession, CallModel callModel, JOK jok, Function1 function1) {
        IDc iDc = (IDc) 1Lo.A04(context, fbUserSession, (1BY) null, 85223);
        if (!iDc.A08) {
            function1.invoke(true);
            return;
        }
        boolean z = callModel.inviteRequestedVideo;
        iDc.A07(IFr.A02(callModel), new IfP(jok, function1), jok.AuS(), z);
    }
}
