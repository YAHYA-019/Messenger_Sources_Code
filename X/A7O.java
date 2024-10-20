package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: A7O.class */
public final class A7O implements 1Vf {
    public final 1Br A00 = 1Bu.A00(68258);
    public final ThreadKey A01;
    public final Context A02;

    public A7O(Context context, ThreadKey threadKey) {
        this.A02 = context;
        this.A01 = threadKey;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        boolean z;
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered")) {
            throw 4YV.A0f(str);
        }
        OnNewMessagesRendered onNewMessagesRendered = (OnNewMessagesRendered) r302;
        11T.A0F(onNewMessagesRendered, 0);
        for (C5fv c5fv : onNewMessagesRendered.A00) {
            if (C5v6.A02(c5fv) && (c5fv instanceof C5ft)) {
                boolean A00 = 7mK.A00(c5fv);
                3vU A0x = 7zQ.A0x(this.A00);
                ThreadKey threadKey = this.A01;
                ImmutableList immutableList = ((C5ft) c5fv).A01;
                ArrayList A0z = 1BL.A0z(immutableList);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    Photo photo = (Photo) it.next();
                    if (!A00) {
                        z = false;
                        if (!photo.A0H) {
                            A0z.add(Boolean.valueOf(z));
                        }
                    }
                    z = true;
                    A0z.add(Boolean.valueOf(z));
                }
                A0x.A0Y(threadKey, A0z);
            }
        }
    }
}
