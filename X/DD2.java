package X;

import android.os.SystemClock;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* loaded from: DD2.class */
public final class DD2 extends C00q implements Function1 {
    public final int A00;
    public final long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD2(long j, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                List A13 = 7zO.A13(obj);
                long j = this.A01;
                for (Object obj2 : A13) {
                    if (((C1769As3) obj2).A00 == j) {
                        return obj2;
                    }
                }
                return null;
            case 1:
                Iterable iterable = (Iterable) obj;
                11T.A0F(iterable, 0);
                Set A0e = 0QD.A0e(iterable);
                A0e.add(Long.valueOf(this.A01));
                return A0e;
            case 4:
                int A03 = AnonymousClass001.A03(obj);
                int A00 = C26P.A00(this.A01) / 2;
                if (A00 > A03 * 0.95d) {
                    A03 = A00;
                }
                return Integer.valueOf(A03);
            default:
                Future future = (Future) obj;
                11T.A0F(future, 0);
                Object obj3 = future.get(this.A01 - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
                11T.A0A(obj3);
                return obj3;
        }
    }
}
