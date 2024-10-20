package X;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6yz, reason: invalid class name */
/* loaded from: 6yz.class */
public final class C6yz implements C6ws {
    public final C6yy A00;

    public C6yz(C6yy c6yy) {
        this.A00 = c6yy;
    }

    @Override // X.C6ws
    public ListenableFuture AUS(Bundle bundle) {
        1FV A0j = 4YU.A0j();
        C6yy c6yy = this.A00;
        ((2UV) c6yy).A01 = new IQM(A0j, this, 3);
        c6yy.D1t(new C7on(0S2.A01));
        return A0j;
    }
}
