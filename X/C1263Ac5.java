package X;

import com.facebook.user.model.User;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* renamed from: X.Ac5, reason: case insensitive filesystem */
/* loaded from: Ac5.class */
public final class C1263Ac5 implements 2eF {
    public final /* synthetic */ C2sd A00;
    public final /* synthetic */ ImmutableList A01;

    public C1263Ac5(C2sd c2sd, ImmutableList immutableList) {
        this.A00 = c2sd;
        this.A01 = immutableList;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        ImmutableCollection immutableCollection = (ImmutableCollection) obj;
        if (immutableCollection == null || immutableCollection.isEmpty()) {
            return this.A00.ARv(this.A01);
        }
        int size = immutableCollection.size();
        ImmutableList immutableList = this.A01;
        if (size == immutableList.size()) {
            return C3o5.A0J(immutableCollection);
        }
        Set A0e = 0QD.A0e(immutableList);
        1Du it = immutableCollection.iterator();
        11T.A0A(it);
        while (it.hasNext()) {
            A0e.remove(((User) it.next()).A0k);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Iterable) A0e);
        1hM A0J = C3o5.A0J(immutableCollection);
        C2sd c2sd = this.A00;
        11T.A0D(copyOf);
        return BTb.A00(A0J, c2sd.ARv(copyOf));
    }
}
