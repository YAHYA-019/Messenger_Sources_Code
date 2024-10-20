package com.facebook.messaging.tray.plugins.loader.memories;

import X.11T;
import X.1BL;
import X.1Bn;
import X.1Kh;
import X.1pQ;
import X.2U8;
import X.2UB;
import X.2UE;
import X.4LA;
import X.AnonymousClass001;
import X.AnonymousClass201;
import X.C1pq;
import X.C1zz;
import android.content.Context;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.memories.model.MemoriesTrayPogModel;
import com.facebook.messaging.tray.model.metadata.memories.TrayListItemMemoriesMetadata;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: TrayMemoriesLoaderImpl.class */
public final class TrayMemoriesLoaderImpl {
    public boolean A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 2UE A03;
    public final 2UB A04;
    public final 2U8 A05;
    public final 1pQ A06;

    public TrayMemoriesLoaderImpl(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A01 = context;
        this.A02 = fbUserSession;
        1Bn.A0A(66127);
        this.A05 = new 2U8(context, fbUserSession);
        1Bn.A0A(66126);
        this.A04 = new 2UB(context, fbUserSession);
        1Bn.A0A(66125);
        this.A03 = new 2UE(context, fbUserSession);
        this.A06 = (1pQ) 1Bn.A0A(68662);
    }

    public static final List A00(MemoriesTrayPogModel memoriesTrayPogModel, TrayMemoriesLoaderImpl trayMemoriesLoaderImpl) {
        1Kh r0 = new 1Kh();
        r0.A05(trayMemoriesLoaderImpl.A02.A05);
        User user = new User(r0);
        HashSet A0v = AnonymousClass001.A0v();
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        AnonymousClass201 A00 = C1zz.A00();
        A00.A01(TrayListItemMemoriesMetadata.A01, new TrayListItemMemoriesMetadata(memoriesTrayPogModel));
        HeterogeneousMap A002 = A00.A00();
        return 11T.A03(new 4LA(user, A002, C1pq.A07(A002, "metadata", A0v, A0v)));
    }
}
