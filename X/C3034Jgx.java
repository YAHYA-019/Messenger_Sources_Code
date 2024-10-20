package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;

/* renamed from: X.Jgx, reason: case insensitive filesystem */
/* loaded from: Jgx.class */
public final class C3034Jgx extends ViewModel implements MBw {
    public static final ViewModelProvider.Factory A01 = new LRB(0);
    public final java.util.Map A00 = 1BK.A1C();

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        java.util.Map map = this.A00;
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            ((ViewModelStore) A1A.next()).clear();
        }
        map.clear();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("NavControllerViewModel{");
        A0o.append(1BK.A12(this));
        A0o.append("} ViewModelStores (");
        Iterator A1B = 1BK.A1B(this.A00);
        while (A1B.hasNext()) {
            A0o.append(AnonymousClass001.A0i(A1B));
            if (A1B.hasNext()) {
                AnonymousClass001.A1H(A0o);
            }
        }
        String A0x = 4YV.A0x(A0o);
        11T.A0A(A0x);
        return A0x;
    }
}
