package X;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: X.2ly, reason: invalid class name */
/* loaded from: 2ly.class */
public final class C2ly implements C2k7 {
    public final C23d A00;
    public final Object A01;

    public C2ly(C23d c23d, Object obj) {
        this.A00 = c23d;
        this.A01 = obj;
    }

    @Override // X.C2k7
    public C1qo B7k() {
        Context context = this.A00.A04;
        C1qi c1qi = C1qh.A01;
        Configuration configuration = context.getResources().getConfiguration();
        11T.A0A(configuration);
        return new C1qo(context, c1qi.A00(configuration));
    }
}
