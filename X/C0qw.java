package X;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.0qw, reason: invalid class name */
/* loaded from: 0qw.class */
public final class C0qw implements Comparator {
    public final int A00;
    public final Object A01;

    public C0qw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int A00;
        if (this.A00 != 0) {
            Comparator comparator = (Comparator) this.A01;
            if (obj == obj2) {
                return 0;
            }
            if (obj != null) {
                if (obj2 == null) {
                    return 1;
                }
                return comparator.compare(obj, obj2);
            }
            A00 = -1;
        } else {
            Function1[] function1Arr = (Function1[]) this.A01;
            11T.A0F(function1Arr, 0);
            int length = function1Arr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return 0;
                }
                Function1 function1 = function1Arr[i2];
                A00 = 0DX.A00((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                if (A00 != 0) {
                    break;
                }
                i = i2 + 1;
            }
        }
        return A00;
    }
}
