package com.facebook.messaging.communitymessaging.plugins.channellist.createorsuggestchatentrypointitemsupplier;

import X.1Bq;
import X.1Br;
import X.1Lm;
import X.2Si;
import X.2Sk;
import X.7zM;
import X.7zR;
import X.AbG;
import X.CaE;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: CreateOrSuggestChatEntryPointItemSupplierImplementation.class */
public final class CreateOrSuggestChatEntryPointItemSupplierImplementation {
    public LiveData A00;
    public LiveData A01;
    public boolean A02;
    public final Context A03;
    public final Observer A04;
    public final Observer A05;
    public final FbUserSession A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 2Si A0B;
    public final 2Sk A0C;

    public CreateOrSuggestChatEntryPointItemSupplierImplementation(Context context, 2Si r303, 2Sk r304) {
        7zR.A1N(context, r303);
        this.A03 = context;
        this.A0C = r304;
        this.A0B = r303;
        1Br A0e = 7zM.A0e(context);
        this.A0A = A0e;
        FbUserSession A03 = 1Br.A03(A0e);
        this.A06 = A03;
        this.A09 = 1Lm.A00(context, A03, 82370);
        this.A08 = AbG.A0Q();
        this.A07 = 1Bq.A00(82687);
        this.A04 = CaE.A00(this, 59);
        this.A05 = CaE.A00(this, 60);
    }
}
