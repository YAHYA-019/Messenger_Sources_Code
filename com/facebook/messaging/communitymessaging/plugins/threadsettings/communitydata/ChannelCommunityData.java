package com.facebook.messaging.communitymessaging.plugins.threadsettings.communitydata;

import X.1BL;
import X.7zO;
import X.AKM;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C1x;
import X.CaE;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: ChannelCommunityData.class */
public final class ChannelCommunityData {
    public LiveData A00;
    public final Observer A01;
    public final C1x A02;
    public final AtomicBoolean A03;
    public final C01i A04;

    public ChannelCommunityData(Context context, C1x c1x) {
        1BL.A1F(context, c1x);
        this.A02 = c1x;
        this.A04 = C01g.A00(C03i.A03, new AKM(context, 37));
        this.A01 = CaE.A00(this, 73);
        this.A03 = 7zO.A15();
    }
}
