package com.facebook.messaging.navigation.plugins.communities.communitiesdrawerfolder;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1G1;
import X.1WY;
import X.4VO;
import X.C0ty;
import X.C4Mw;
import X.C4Xo;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingCommunityType;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: CommunitiesDrawerFolderImplementation.class */
public final class CommunitiesDrawerFolderImplementation {
    public LiveData A00;
    public List A01;
    public final Context A02;
    public final Observer A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final C4Xo A0B;
    public final String A0C;
    public final AtomicBoolean A0D;

    public CommunitiesDrawerFolderImplementation(Context context, FbUserSession fbUserSession, C4Xo c4Xo) {
        11T.A0F(context, 1);
        11T.A0F(c4Xo, 2);
        11T.A0F(fbUserSession, 3);
        this.A02 = context;
        this.A0B = c4Xo;
        this.A04 = fbUserSession;
        this.A08 = 1Bu.A01(context, 67885);
        this.A09 = 1Bu.A00(68199);
        this.A0A = 1Bq.A00(66774);
        this.A01 = C0ty.A00;
        Context applicationContext = context.getApplicationContext();
        11T.A0A(applicationContext);
        this.A05 = 1Bu.A01(applicationContext, 81983);
        this.A07 = 1Bq.A00(66481);
        this.A0C = ((1G1) fbUserSession).A02;
        this.A06 = 1Bq.A00(66481);
        this.A0D = new AtomicBoolean(false);
        this.A03 = new 4VO(this, 2);
        ThreadKey.A07(-14);
        this.A00 = (1WY.A01((1WY) this.A06.A00.get()).AZk(36325355920970371L) && 1WY.A01((1WY) this.A06.A00.get()).AZk(36325355921429130L)) ? ((C4Mw) this.A05.A00.get()).A01(CommunityMessagingCommunityType.A03) : ((C4Mw) this.A05.A00.get()).A00();
    }
}
