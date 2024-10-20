package com.google.android.play.core.splitinstall;

import X.0FI;
import X.4FE;
import X.AnonymousClass001;
import X.C2ug;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzbp;
import com.google.android.play.core.splitinstall.internal.zzl;
import java.util.List;

/* loaded from: zzbh.class */
public abstract class zzbh extends zzbp {
    public final 4FE A00;
    public final /* synthetic */ C2ug A01;

    public zzbh(4FE r302, C2ug c2ug) {
        this.A01 = c2ug;
        int A03 = 0FI.A03(1902545579);
        this.A00 = r302;
        0FI.A09(-2036981912, A03);
    }

    public void DCL(int i, Bundle bundle) {
        int A00 = zzl.A00(this, 1275983726);
        C2ug.A02.A03("onCancelInstall(%d)", AnonymousClass001.A1a(i));
        0FI.A09(1659203996, A00);
    }

    public void DCf(Bundle bundle) {
        int A03 = 0FI.A03(-1264042034);
        this.A01.A00.A02(this.A00);
        C2ug.A02.A03("onDeferredInstall", new Object[0]);
        0FI.A09(1820937059, A03);
    }

    public void DCz(Bundle bundle) {
        int A00 = zzl.A00(this, 969156116);
        C2ug.A02.A03("onDeferredUninstall", AnonymousClass001.A1Z());
        0FI.A09(1935872819, A00);
    }

    public void DD7(List list) {
        int A03 = 0FI.A03(1015286713);
        this.A01.A00.A02(this.A00);
        C2ug.A02.A03("onGetSessionStates", new Object[0]);
        0FI.A09(1705113819, A03);
    }

    public void DDE(int i, Bundle bundle) {
        int A03 = 0FI.A03(1096559467);
        this.A01.A00.A02(this.A00);
        C2ug.A02.A03("onStartInstall(%d)", Integer.valueOf(i));
        0FI.A09(-914453389, A03);
    }
}
