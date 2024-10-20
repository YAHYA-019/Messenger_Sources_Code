package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.messaging.sms.defaultapp.SmsReceiver;
import com.facebook.messaging.sms.defaultapp.send.PendingSendMessage;
import com.google.common.base.Platform;
import java.io.Serializable;

/* loaded from: I7d.class */
public final class I7d {
    public static final String[] A08 = {"_id", "thread_id", "address", "body"};
    public final Context A00;
    public final C00i A01;
    public final Hbg A02;
    public final IAS A03;
    public final I1Z A04;
    public final Hbi A05;
    public final 53K A06;
    public final 4Yk A07;

    public I7d() {
        Context A0J = 7zP.A0J();
        I1Z i1z = (I1Z) 1Bi.A03(98784);
        1BQ A0a = AbH.A0a();
        Hbi hbi = (Hbi) 1Bi.A03(116279);
        IAS ias = (IAS) 1Bn.A0B(116262);
        4Yk r0 = (4Yk) 1Hv.A02(A0J, 49160);
        Hbg hbg = (Hbg) 1Bn.A0B(116160);
        this.A00 = A0J;
        this.A04 = i1z;
        this.A01 = A0a;
        this.A05 = hbi;
        this.A03 = ias;
        this.A07 = r0;
        this.A06 = (53K) 1Hv.A02(A0J, 49477);
        this.A02 = hbg;
    }

    public static void A00(Uri uri, HAn hAn, I7d i7d, PendingSendMessage pendingSendMessage, String str) {
        Context context = i7d.A00;
        Intent intent = new Intent("com.facebook.messaging.sms.MESSAGE_SENT", uri, context, SmsReceiver.class);
        if (!Platform.stringIsNullOrEmpty(str)) {
            intent.putExtra("mmssms_quickfail_msg", str);
        }
        intent.putExtra("mmssms_quickfail_type", (Serializable) hAn);
        PendingSendMessage.A00(intent, pendingSendMessage);
        context.sendBroadcast(intent);
    }
}
