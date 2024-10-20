package com.facebook.powermanagement;

import X.11T;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1HG;
import X.1P9;
import android.content.Context;
import android.os.Handler;
import com.facebook.inject.FbInjector;

/* loaded from: RadioPowerManagerInstaller.class */
public final class RadioPowerManagerInstaller {
    public Context A00;
    public 1P9 A01;
    public final Handler A02;
    public final 1Br A03;
    public final 1Br A04 = 1Bq.A00(67108);

    public RadioPowerManagerInstaller() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        11T.A09(A00);
        this.A03 = 1HG.A00(A00, 65730);
        this.A02 = (Handler) 1Bi.A03(65726);
    }
}
