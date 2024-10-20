package X;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0hm, reason: invalid class name */
/* loaded from: 0hm.class */
public final class C0hm extends C00q implements C00m {
    public final /* synthetic */ C0T1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0hm(C0T1 c0t1) {
        super(0);
        this.this$0 = c0t1;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        List list = this.this$0.A01;
        ArrayList A1E = C1A3.A1E(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(Base64.encodeToString(((C0T4) it.next()).A01, 11));
        }
        return A1E;
    }
}
