package com.facebook.messaging.threadview.plugins.banner.data;

import X.11T;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Hv;
import X.1PG;
import X.2S4;
import X.63D;
import X.6SW;
import X.6iB;
import X.7Nk;
import X.7Nl;
import X.7Qw;
import X.AHU;
import X.C0ty;
import X.C0uA;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableSortedMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: ThreadViewBannerDataManager.class */
public final class ThreadViewBannerDataManager {
    public ThreadKey A00;
    public 7Nk A01;
    public List A02;
    public Set A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 2S4 A06;
    public final 1Br A07;
    public final ThreadKey A08;
    public final 7Nl A09;
    public final 1PG A0A;
    public final 63D A0B;
    public final Map A0C;
    public final 6iB A0D;

    public ThreadViewBannerDataManager(Context context, FbUserSession fbUserSession, 2S4 r304, ThreadKey threadKey, 6iB r306, 63D r307) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r306, 3);
        11T.A0F(threadKey, 4);
        11T.A0F(r307, 5);
        11T.A0F(r304, 6);
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A0D = r306;
        this.A08 = threadKey;
        this.A0B = r307;
        this.A06 = r304;
        this.A02 = C0ty.A00;
        this.A01 = 7Nk.A02;
        this.A0C = new ConcurrentHashMap();
        this.A03 = C0uA.A00;
        this.A0A = (1PG) 1Bi.A03(66265);
        this.A09 = (7Nl) 1Hv.A02(context, 82514);
        this.A07 = 1Bq.A00(16458);
    }

    public static final void A00(ThreadViewBannerDataManager threadViewBannerDataManager) {
        if (threadViewBannerDataManager.A00 != null) {
            6iB r0 = threadViewBannerDataManager.A0D;
            7Nk r02 = threadViewBannerDataManager.A01;
            SortedMap sortedMap = r02.A01;
            AHU ahu = new AHU(r02.A00, 5);
            ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.A03;
            7Qw r03 = new 7Qw(ahu);
            r03.A01(sortedMap);
            r0.A02(new 6SW(7Qw.A00(r03)));
        }
    }
}
