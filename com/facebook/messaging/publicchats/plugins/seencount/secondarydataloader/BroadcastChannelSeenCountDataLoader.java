package com.facebook.messaging.publicchats.plugins.seencount.secondarydataloader;

import X.0QD;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Lm;
import X.1Uj;
import X.2oI;
import X.5Sc;
import X.6iB;
import X.7PT;
import X.C1q8;
import X.C21S;
import X.C7PU;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: BroadcastChannelSeenCountDataLoader.class */
public final class BroadcastChannelSeenCountDataLoader {
    public 5Sc A00;
    public final 1Br A01;
    public final 7PT A02;
    public final 6iB A03;
    public final Context A04;
    public final ThreadKey A05;

    public BroadcastChannelSeenCountDataLoader(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r305, 3);
        11T.A0F(threadKey, 4);
        this.A04 = context;
        this.A03 = r305;
        this.A05 = threadKey;
        this.A01 = 1Lm.A00(context, fbUserSession, 67598);
        this.A02 = new 7PT(this);
    }

    public final void A00() {
        MessagesCollection messagesCollection;
        5Sc r0;
        MessagesCollection messagesCollection2;
        ImmutableList immutableList;
        5Sc r02 = this.A00;
        if (r02 != null && (messagesCollection = r02.A01) != null && messagesCollection.A03 && 2oI.A06(r02.A02) && (r0 = this.A00) != null && (messagesCollection2 = r0.A01) != null && (immutableList = messagesCollection2.A01) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Message message = (Message) next;
                if (message.A04() != C1q8.A04 || message.A08 != null) {
                    arrayList.add(next);
                }
            }
            Message message2 = (Message) 0QD.A0E(arrayList);
            if (message2 != null) {
                C7PU c7pu = (C7PU) this.A01.A00.get();
                long A0r = this.A05.A0r();
                String str = message2.A1V;
                if (str == null) {
                    throw 1BK.A0h();
                }
                c7pu.A01(this.A02, str, A0r);
            }
        }
        C7PU c7pu2 = (C7PU) this.A01.A00.get();
        C21S.A00(c7pu2.A06, (1Uj) c7pu2.A05.A00.get());
    }
}
