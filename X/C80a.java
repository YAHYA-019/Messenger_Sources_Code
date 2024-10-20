package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.80a, reason: invalid class name */
/* loaded from: 80a.class */
public final class C80a implements C80b {
    public final /* synthetic */ 5VT A00;
    public final /* synthetic */ SettableFuture A01;
    public final /* synthetic */ boolean A02;

    public C80a(5VT r302, SettableFuture settableFuture, boolean z) {
        this.A01 = settableFuture;
        this.A00 = r302;
        this.A02 = z;
    }

    @Override // X.C80b
    public void CAB() {
        List list = this.A00.A0T;
        boolean z = this.A02;
        1FV r0 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            6iS r02 = (6iS) ((82Z) it.next()).A01;
            11T.A0D(r0);
            r02.A02(r0, true, z);
        }
    }

    @Override // X.C80b
    public void CAC(String str) {
        this.A01.set(false);
        5VT.A04(this.A00, (String) null, str, true, this.A02);
    }

    @Override // X.C80b
    public void CAD() {
        this.A01.set(true);
    }
}
