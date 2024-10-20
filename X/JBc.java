package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* loaded from: JBc.class */
public final class JBc extends C00q implements Function2 {
    public static final JBc A00 = new JBc();

    public JBc() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        1BK.A1M(jArr, jArr2);
        int length = jArr.length;
        if (length == 0) {
            return jArr2;
        }
        int length2 = jArr2.length;
        if (length2 == 0) {
            return jArr;
        }
        long[] jArr3 = new long[length + length2];
        System.arraycopy(jArr, 0, jArr3, 0, length);
        System.arraycopy(jArr2, 0, jArr3, length, length2);
        Arrays.sort(jArr3);
        return jArr3;
    }
}
