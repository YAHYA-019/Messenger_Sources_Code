package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.1b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1b8.class */
public final class C00491b8 implements InterfaceC00471b6 {
    public final 1Br A00 = 1Bu.A00(116099);

    @Override // X.InterfaceC00471b6
    public 1bY AKq() {
        return ((C00501b9) 1Br.A0B(this.A00)).AKq();
    }

    @Override // X.InterfaceC00471b6
    public boolean isEnabled() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        if (0Zi.A01(A00).A9q) {
            return ((C00501b9) this.A00.A00.get()).A00;
        }
        return false;
    }
}
