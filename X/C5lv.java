package X;

import android.content.Context;
import java.util.HashSet;

/* renamed from: X.5lv, reason: invalid class name */
/* loaded from: 5lv.class */
public final class C5lv {
    public final Context A00;

    public C5lv(Context context) {
        this.A00 = context;
    }

    public final void A00(4lD r302, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, C5fq c5fq, int i, int i2) {
        Context context = this.A00;
        C5tq c5tq = (C5tq) 1Bu.A06(context, 67462);
        1qX r0 = (1qX) r302;
        String valueOf = String.valueOf(r0.mResultSet.getLong(i, 68));
        int A01 = C5tq.A01(interfaceC07894l7, valueOf);
        1Bu.A06(context, 67462);
        int i3 = -1;
        if (A01 == -1) {
            i3 = C5tq.A00(c4l9, valueOf);
        }
        String string = r0.mResultSet.getString(i, 57);
        if (string == null) {
            throw 1BK.A0h();
        }
        c5fq.A09 = string;
        HashSet hashSet = new HashSet();
        String valueOf2 = String.valueOf(r0.mResultSet.getNullableLong(i, 61));
        if (valueOf2 == null) {
            valueOf2 = "";
        }
        c5fq.A03(new C5fr(null, null, null, null, null, null, null, valueOf2, "", null, "", null, hashSet, 0L, 0L, 0L));
        c5fq.A0I = c5tq.A08(c4l9, interfaceC07894l7, A01, i3, i2);
        Long nullableLong = r0.mResultSet.getNullableLong(i, 55);
        if (nullableLong == null) {
            nullableLong = 0L;
        }
        c5fq.A01 = nullableLong.longValue();
    }
}
