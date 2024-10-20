package X;

import android.content.Intent;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.service.model.SendMessageMethodParams;
import java.util.concurrent.Callable;

/* loaded from: DB6.class */
public final class DB6 implements Callable {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ Byc A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public DB6(Message message, Byc byc, String str, String str2, String str3, boolean z) {
        this.A01 = byc;
        this.A00 = message;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A05 = z;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        boolean z;
        Byc byc = this.A01;
        Message message = this.A00;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A02;
        boolean z2 = this.A05;
        C04033zm c04033zm = new C04033zm();
        try {
            SendMessageMethodParams sendMessageMethodParams = new SendMessageMethodParams(message, null, null);
            MessengerAccountInfo A0Q = AbK.A0Q(byc.A06, str);
            A0Q.getClass();
            String str4 = A0Q.A04;
            str4.getClass();
            c04033zm.A07 = str4;
            ((1Rl) byc.A0A.get()).A09((1Ro) byc.A09.get(), c04033zm, sendMessageMethodParams);
            z = true;
            Intent A0A = 4YU.A0A("com.facebook.orca.ACTION_notification_direct_reply");
            A0A.putExtra("action", str3);
            A0A.putExtra("message_sent_result", true);
            ((1I7) byc.A05.get()).CkS(A0A);
        } catch (Exception unused) {
            if (z2) {
                1Kd.A0D(byc.A04, new D4A(byc, str, str2, str3), ((4qC) byc.A02.get()).A03(4YT.A00(91)));
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
