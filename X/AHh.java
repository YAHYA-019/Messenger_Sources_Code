package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: AHh.class */
public final class AHh implements C15h {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AHh(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C15h
    public final Object get() {
        switch (this.A00) {
            case 2:
                return C3Om.A01(((A5K) this.A02).A00, (1yM) 7zO.A0p(this.A01));
            case 3:
                return 1Hv.A02((Context) this.A02, 67315);
            case 4:
                C15h c15h = (C15h) this.A01;
                Collection collection = (Collection) this.A02;
                boolean z = 1Hj.A00;
                Object obj = c15h == null ? null : c15h.get();
                1Hl r0 = (1Hl) 1Bi.A03(16522);
                ArrayList A0s = AnonymousClass001.A0s();
                if (obj != null) {
                    A0s.add(obj);
                }
                if (r0.A01()) {
                    A0s.add(1Bi.A03(16535));
                }
                if (collection != null) {
                    A0s.addAll(collection);
                }
                if (A0s.isEmpty()) {
                    return null;
                }
                return A0s.size() == 1 ? A0s.get(0) : new 0JF((C04H[]) A0s.toArray(new C04H[0]));
            default:
                return ((82O) 1Bn.A0E((Context) this.A01, (1BY) null, 65586)).A0N((FbUserSession) this.A02);
        }
    }
}
