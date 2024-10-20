package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M4l.class */
public final class M4l extends C00q implements Function1 {
    public static final M4l A00 = new M4l();

    public M4l() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.LNB, java.lang.Object, X.MBK] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        MHv mHv = LazyListState.A0O;
        int A0G = DKE.A0G(list, 0);
        int A0G2 = DKE.A0G(list, 1);
        ?? obj2 = new Object();
        ((LNB) obj2).A00 = -1;
        return new LazyListState(obj2, A0G, A0G2);
    }
}
