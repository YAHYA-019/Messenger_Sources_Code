package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessageRepliedTo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: A4v.class */
public final class A4v implements 7NG {
    public final Context A00;
    public final FragmentActivity A01;
    public final 1Br A04;
    public final 8K0 A05;
    public final AaC A06;
    public final String A07;
    public final boolean A08;
    public final 1Br A03 = 1Bq.A00(16461);
    public final 1Br A02 = 1Bu.A00(66725);

    public A4v(Context context, FragmentActivity fragmentActivity, 8K0 r304, AaC aaC, String str, boolean z) {
        this.A00 = context;
        this.A07 = str;
        this.A01 = fragmentActivity;
        this.A05 = r304;
        this.A06 = aaC;
        this.A08 = z;
        this.A04 = 7zM.A0e(context);
    }

    public void Ckp(Message message, ThreadKey threadKey, NavigationTrigger navigationTrigger, C5fv c5fv, String str, boolean z) {
        int i;
        FbUserSession A03 = 1Br.A03(this.A04);
        if (((2TI) 1Br.A0B(this.A02)).A03()) {
            if (!message.A0z.isEmpty() || !message.A0r.isEmpty()) {
                i = 17;
            } else if (message.A1m != null) {
                i = 18;
            } else {
                i = 13;
                if (this.A08) {
                    i = 14;
                }
            }
            Context context = this.A00;
            ((C03513yC) 1Lm.A05(context, A03, 68395)).A07(null, i);
            ((6hT) 1Lm.A05(context, A03, 67417)).A04(threadKey, (ThreadSummary) this.A05.A04.getValue(), navigationTrigger, i);
        }
        C5Pr c5Pr = (C5Pr) 1Lm.A05(this.A00, A03, 49712);
        8K0 r0 = this.A05;
        5PI r02 = new 5PI(message);
        long j = r0.A00;
        r02.A1G = 7;
        6B1 r03 = new 6B1();
        r03.A09 = String.valueOf(j);
        r03.A0B = "";
        r03.A03 = C1q8.A0N;
        r02.A0F = new MessageRepliedTo(r03);
        1Br.A0D(this.A03, AC8.A00(this, 53), c5Pr.A0H(HHk.A00(str), new Message(r02), navigationTrigger, this.A07));
    }
}
