package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function2;

/* loaded from: M7f.class */
public final class M7f extends C00q implements Function2 {
    public static final M7f A00 = new M7f();

    public M7f() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        L7h l7h = ((LazyListState) obj2).A0A;
        return C0s8.A14(Integer.valueOf(l7h.A03.ArX()), Integer.valueOf(l7h.A04.ArX()));
    }
}
