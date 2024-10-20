package X;

import com.facebook.messaging.msys.core.MsysFetchThreadListOperation;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.3gw, reason: invalid class name */
/* loaded from: 3gw.class */
public final class C3gw implements Runnable {
    public static final String __redex_internal_original_name = "MsysFetchThreadListOperation$1";
    public final /* synthetic */ MsysFetchThreadListOperation A00;
    public final /* synthetic */ SettableFuture A01;

    public C3gw(MsysFetchThreadListOperation msysFetchThreadListOperation, SettableFuture settableFuture) {
        this.A00 = msysFetchThreadListOperation;
        this.A01 = settableFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        MsysFetchThreadListOperation.A02(this.A00, this.A01);
    }
}
