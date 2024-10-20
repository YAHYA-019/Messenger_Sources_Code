package com.facebook.messaging.communitymessaging.plugins.channellist.categoryitemsupplier;

import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Hb;
import X.2Si;
import X.2Sk;
import X.7zT;
import X.AbU;
import X.CAQ;
import X.CaE;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: CategoryItemSupplierImplementation.class */
public final class CategoryItemSupplierImplementation {
    public LiveData A00;
    public AbU A01;
    public String A02;
    public List A03;
    public final Context A04;
    public final Observer A05;
    public final FbUserSession A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 2Si A09;
    public final 2Sk A0A;
    public final ThreadKey A0B;

    public CategoryItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304, 2Sk r305) {
        String str;
        7zT.A1W(r305, fbUserSession, r304, context);
        this.A0A = r305;
        this.A06 = fbUserSession;
        this.A09 = r304;
        this.A04 = context;
        this.A03 = 1BK.A0b();
        this.A01 = AbU.A05;
        ThreadKey threadKey = r305.A02;
        this.A0B = threadKey;
        1Br A00 = 1Bq.A00(82687);
        this.A08 = A00;
        this.A07 = 1Bu.A00(68933);
        this.A05 = CaE.A00(this, 56);
        if (threadKey == null || (str = r305.A05) == null) {
            return;
        }
        1Br.A0C(A00);
        this.A00 = CAQ.A00(fbUserSession, (1Hb) null, threadKey, str, false);
    }
}
