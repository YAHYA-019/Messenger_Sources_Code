package X;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.31d, reason: invalid class name */
/* loaded from: 31d.class */
public final class C31d implements Function {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C31d(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object obj2;
        2JY A0B;
        if (this.A00 != 0) {
            AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
            obj = null;
            if (abstractC08294mh != null && (obj2 = abstractC08294mh.A03) != null && (A0B = 1BK.A0B((2JY) obj2, 2JX.class, 954925063, 21962316)) != null) {
                1Du it = A0B.A0c(781899278, 2JX.class, -1736085570).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    2JY r0 = (2JY) it.next();
                    if (Objects.equal(this.A02, r0.A0r(-673417101))) {
                        obj = r0.A0m();
                        break;
                    }
                }
            }
        } else {
            2TA r02 = (2TA) this.A01;
            ConcurrentMap concurrentMap = r02.A05;
            11T.A0A(concurrentMap);
            concurrentMap.put(this.A02, Optional.fromNullable(obj));
            if (((2Tc) 1Br.A0B(r02.A03)).A00()) {
                r02.A08.set(false);
                return obj;
            }
        }
        return obj;
    }
}
