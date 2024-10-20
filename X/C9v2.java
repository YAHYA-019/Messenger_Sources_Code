package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9v2, reason: invalid class name */
/* loaded from: 9v2.class */
public final class C9v2 implements AXn {
    public final /* synthetic */ 6Nz A00;
    public final /* synthetic */ ThreadKey A01;

    public C9v2(6Nz r302, ThreadKey threadKey) {
        this.A00 = r302;
        this.A01 = threadKey;
    }

    @Override // X.AXn
    public void onSuccess() {
        6Nz r0 = this.A00;
        Context context = r0.getContext();
        2KE r02 = 6Nz.A0b;
        0LS.A0A(context, ((6ML) r0.A0V.get()).A00(context, this.A01));
    }
}
