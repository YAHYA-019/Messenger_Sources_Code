package X;

import com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity;

/* loaded from: Chb.class */
public final class Chb implements C7y6 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Chb(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C7y6
    public void BhO() {
        if (this.A00 == 0) {
            ((DFp) this.A02).D7z();
            return;
        }
        PageAccountSwitchActivity pageAccountSwitchActivity = (PageAccountSwitchActivity) this.A01;
        Runnable runnable = (Runnable) this.A02;
        ((C09474qD) pageAccountSwitchActivity.A0S.get()).A00 = null;
        runnable.run();
    }
}
