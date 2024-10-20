package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.threadsettings2.activity.ThreadSettingsActivity;

/* loaded from: Cuo.class */
public final class Cuo implements DHe {
    public final /* synthetic */ ThreadSettingsActivity A00;

    public Cuo(ThreadSettingsActivity threadSettingsActivity) {
        this.A00 = threadSettingsActivity;
    }

    @Override // X.DHe
    public void CQ5(int i, Bundle bundle) {
        Intent A05 = AbF.A05();
        if (bundle != null) {
            A05.putExtras(bundle);
        }
        ThreadSettingsActivity threadSettingsActivity = this.A00;
        threadSettingsActivity.setResult(i, A05);
        threadSettingsActivity.finish();
    }

    @Override // X.DHe
    public void CSR() {
        this.A00.finish();
    }
}
