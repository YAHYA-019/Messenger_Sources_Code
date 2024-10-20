package X;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: D2g.class */
public final class D2g implements Function {
    public final Bwo A00;

    public D2g(Bwo bwo) {
        this.A00 = bwo;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            A0u.putAll((java.util.Map) it.next());
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it2 = this.A00.A05.iterator();
        while (it2.hasNext()) {
            Object obj2 = A0u.get(it2.next());
            if (obj2 != null) {
                builder.m11011add(obj2);
            }
        }
        return new CCC(builder.build());
    }
}
