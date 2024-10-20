package com.facebook.messaging.tincan.tincanoverwamsys.notificationworkmanager;

import X.05X;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1ED;
import X.1FV;
import X.1Kd;
import X.4YT;
import X.4YU;
import X.7zN;
import X.AbF;
import X.AbH;
import X.AbstractC00603o4;
import X.C00i;
import X.C10904ux;
import X.C10914uy;
import X.C10924uz;
import X.C4Ky;
import X.Hyd;
import X.InC;
import X.J5R;
import X.KtB;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.WorkerParameters;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: SecureMessageOverWANotificationListenableWorker.class */
public final class SecureMessageOverWANotificationListenableWorker extends C4Ky {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureMessageOverWANotificationListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        1BL.A1F(context, workerParameters);
    }

    @Override // X.C4Ky
    public ListenableFuture getForegroundInfoAsync() {
        0fH.A0l("SecureMessageOverWANotificationListenableWorker", "getForegroundInfoAsync");
        Hyd hyd = (Hyd) 7zN.A0k(this.mAppContext, 98426);
        1FV A0j = 4YU.A0j();
        C00i c00i = hyd.A01;
        String packageName = 1BK.A04(c00i).getPackageName();
        Intent A05 = AbF.A05();
        A05.setComponent(new ComponentName(packageName, AbstractC00603o4.A00(53)));
        A05.setFlags(67174400);
        AbH.A1H(A05, 4YT.A00(38));
        05X r0 = new 05X();
        r0.A0C(A05);
        PendingIntent A01 = r0.A01(1BK.A04(c00i), (int) System.currentTimeMillis(), 134217728);
        C10914uy A00 = ((C10904ux) hyd.A02.get()).A00(1BK.A04(c00i), null, null, 20030);
        ((C10924uz) A00).A03 = -1;
        A00.A0L(1BL.A0B(c00i).getString(2131965598));
        A00.A0K(1BL.A0B(c00i).getString(2131965597));
        A00.A0R = "service";
        A00.A0e = true;
        A00.A0C(0L);
        if (A01 != null) {
            A00.A0D(A01);
        }
        A0j.set(new KtB(20030, A00.A07(), 0));
        return A0j;
    }

    @Override // X.C4Ky
    public void onStopped() {
        0fH.A0l("SecureMessageOverWANotificationListenableWorker", "Worker stopped");
    }

    @Override // X.C4Ky
    public ListenableFuture startWork() {
        1FV A0j = 4YU.A0j();
        FbUserSession A0E = 1BL.A0E();
        int i = 16431;
        if (1BL.A0Q().AZk(36317006506896284L)) {
            i = 16443;
        }
        1Kd.A0E(new InC(3), J5R.A00((1ED) 1Bi.A03(i), A0E, A0j, this, 11));
        return A0j;
    }
}
