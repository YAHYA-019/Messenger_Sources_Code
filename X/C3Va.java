package X;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

/* renamed from: X.3Va, reason: invalid class name */
/* loaded from: 3Va.class */
public final class C3Va implements 3lL {
    public final /* synthetic */ 2PW A00;

    public C3Va(2PW r302) {
        this.A00 = r302;
    }

    public void Bkp(int i) {
        2PW r0 = this.A00;
        C2dr c2dr = (C2dr) r0.A08.get();
        Context A04 = 1BK.A04(r0.A0B);
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("airplane_mode", Boolean.valueOf(((2zS) c2dr.A07.get()).A04()));
        ((2PQ) c2dr.A05.get()).A00("view", "button", c2dr.A01(), A0u);
        ((08O) c2dr.A09.get()).A01().A0A(A04, new Intent("android.intent.action.VIEW", ((C2c) c2dr.A06.get()).A00()));
    }
}
