package com.facebook.messaging.communitymessaging.plugins.channellist.channellistitemsupplier;

import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Hb;
import X.1Lm;
import X.2Si;
import X.2Sk;
import X.7zT;
import X.AbU;
import X.C1284Aco;
import X.CAQ;
import X.CaE;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: ChannelListItemSupplierImplementation.class */
public final class ChannelListItemSupplierImplementation {
    public LiveData A00;
    public LiveData A01;
    public AbU A02;
    public List A03;
    public final Context A04;
    public final Observer A05;
    public final Observer A06;
    public final FbUserSession A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 2Si A0C;
    public final 2Sk A0D;
    public final ThreadKey A0E;

    public ChannelListItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304, 2Sk r305) {
        String str;
        7zT.A1W(r305, fbUserSession, r304, context);
        this.A0D = r305;
        this.A07 = fbUserSession;
        this.A0C = r304;
        this.A04 = context;
        this.A03 = 1BK.A0b();
        this.A02 = AbU.A05;
        ThreadKey threadKey = r305.A02;
        this.A0E = threadKey;
        this.A0A = 1Lm.A00(context, fbUserSession, 82370);
        this.A0B = 1Bu.A00(68934);
        1Br A00 = 1Bq.A00(82687);
        this.A09 = A00;
        this.A08 = 1Bu.A00(68933);
        this.A05 = CaE.A00(this, 57);
        this.A06 = CaE.A00(this, 58);
        if (threadKey == null || (str = r305.A05) == null) {
            return;
        }
        1Br.A0C(A00);
        this.A00 = CAQ.A00(fbUserSession, (1Hb) null, threadKey, str, false);
        this.A01 = ((C1284Aco) 1Br.A0B(this.A0A)).A01(threadKey);
    }
}
