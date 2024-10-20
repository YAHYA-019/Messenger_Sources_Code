package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.messaging.sms.defaultapp.SmsReceiver;
import com.facebook.messaging.sms.defaultapp.send.PendingSendMessage;
import com.google.common.base.Platform;
import java.io.Serializable;

/* loaded from: Hzm.class */
public final class Hzm {
    public 1BY A00;
    public final Context A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final IAS A05;
    public final I1Z A06;
    public final C2dk A07;

    public Hzm(1BO r302) {
        Context A0J = 7zP.A0J();
        this.A01 = A0J;
        this.A07 = (C2dk) 1Bi.A03(17051);
        this.A05 = (IAS) 1Bn.A0E((Context) null, (1BY) null, 116262);
        this.A06 = (I1Z) 1Bi.A03(98784);
        this.A04 = 1BV.A01((1BY) null, 116084);
        this.A02 = AbH.A0a();
        this.A00 = 7zL.A0Q(r302);
        this.A03 = AbF.A0Q(A0J, 49160);
    }

    public static void A00(Uri uri, HAn hAn, Hzm hzm, PendingSendMessage pendingSendMessage, String str) {
        Context context = hzm.A01;
        Intent intent = new Intent("com.facebook.messaging.sms.MESSAGE_SENT", uri, context, SmsReceiver.class);
        if (!Platform.stringIsNullOrEmpty(str)) {
            intent.putExtra("mmssms_quickfail_msg", str);
        }
        intent.putExtra("mmssms_quickfail_type", (Serializable) hAn);
        PendingSendMessage.A00(intent, pendingSendMessage);
        context.sendBroadcast(intent);
    }
}
