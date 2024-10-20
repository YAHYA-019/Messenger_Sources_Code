package X;

import com.google.common.base.Optional;

/* loaded from: J0s.class */
public final class J0s implements Runnable {
    public static final String __redex_internal_original_name = "OrcaRsysCallUtils$updateStateSyncTopic$1";
    public final /* synthetic */ IFG A00;
    public final /* synthetic */ Optional A01;
    public final /* synthetic */ String A02;

    public J0s(IFG ifg, Optional optional, String str) {
        this.A00 = ifg;
        this.A02 = str;
        this.A01 = optional;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IFG.A02(this.A00, this.A01, this.A02);
    }
}
