package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: M3t.class */
public final class M3t extends C00q implements Function1 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3t(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A05 = obj;
        this.A02 = i;
        this.A03 = obj2;
        this.A01 = i2;
        this.A04 = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                L8T l8t = (L8T) obj;
                L56[] l56Arr = (L56[]) this.A04;
                LP8 lp8 = (LP8) this.A05;
                int i = this.A02;
                int[] iArr = (int[]) this.A03;
                int length = l56Arr.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i2 >= length) {
                        break;
                    } else {
                        L56 l56 = l56Arr[i2];
                        11T.A0D(l56);
                        l56.B1J();
                        L8T.A00(l8t, l56, iArr[i4], GOn.A03((i - l56.A00) / 2.0f, 1.0f + lp8.A00.A00));
                        i2++;
                        i3 = i4 + 1;
                    }
                }
            case 1:
                Function2 function2 = ((JcO) this.A05).A01;
                int i5 = this.A02;
                L56 l562 = (L56) this.A03;
                ((L8T) obj).A05(l562, 0.0f, ((L8U) function2.invoke(new KsS(JR1.A0S(i5 - l562.A01, this.A01 - l562.A00)), ((MNd) this.A04).AtT())).A00);
                break;
            default:
                8iE.A0L((4NU) this.A03, (8iE) this.A05, (AXE) this.A04, this.A02);
                break;
        }
        return 04S.A00;
    }
}
