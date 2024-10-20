package X;

import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: A4u.class */
public final class A4u implements 7NG {
    public final 1Br A00 = 1Bq.A00(16461);
    public final AY1 A01;
    public final Context A02;

    public A4u(Context context, AY1 ay1) {
        this.A02 = context;
        this.A01 = ay1;
    }

    public void Ckp(Message message, ThreadKey threadKey, NavigationTrigger navigationTrigger, C5fv c5fv, String str, boolean z) {
        4YV.A11(this.A00).execute(new AG4(message, this, str));
    }
}
