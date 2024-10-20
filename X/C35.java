package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C35.class */
public final class C35 {
    public final 1Br A01 = 7zM.A0S();
    public final 1Br A00 = 7zM.A0R();

    public final ListenableFuture A00(java.util.Map map, C00m c00m, int i) {
        C00i c00i = this.A01.A00;
        1BK.A0V(c00i).markerStart(i);
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            1BK.A0V(c00i).markerAnnotate(i, AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
        }
        ListenableFuture listenableFuture = (ListenableFuture) c00m.invoke();
        1Kd.A0F(new S5a(this, i, i), listenableFuture, 4YV.A11(this.A00));
        return listenableFuture;
    }
}
