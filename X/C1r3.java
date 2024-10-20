package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1r3, reason: invalid class name */
/* loaded from: 1r3.class */
public final class C1r3 {
    public C1r4 A00(int i) {
        if (i != 11 && i != 12) {
            if (i == 14) {
                return C1r4.A0D;
            }
            if (i == 16) {
                return C1r4.A08;
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    return C1r4.A0H;
                case 4:
                    return C1r4.A0C;
                case 5:
                case 6:
                    return C1r4.A0B;
                case 7:
                    break;
                default:
                    return C1r4.A0G;
            }
        }
        return C1r4.A09;
    }

    public ImmutableList A01(Collection collection) {
        int[] iArr;
        int i;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C1r4 c1r4 = (C1r4) it.next();
                C2er c2er = C2er.$redex_init_class;
                switch (c1r4) {
                    case A0H:
                        iArr = new int[]{1, 2, 3};
                        break;
                    case A0G:
                        iArr = new int[]{0};
                        break;
                    case A0B:
                        iArr = new int[]{5, 6};
                        break;
                    case A0F:
                    case A0E:
                    default:
                        iArr = new int[0];
                        break;
                    case A0C:
                        iArr = new int[1];
                        i = 4;
                        break;
                    case A09:
                        iArr = new int[]{7, 11, 12};
                        break;
                    case A0D:
                        iArr = new int[1];
                        i = 14;
                        break;
                    case A08:
                        iArr = new int[1];
                        i = 16;
                        break;
                }
                iArr[0] = i;
                for (int i2 : iArr) {
                    builder.m11011add((Object) Integer.valueOf(i2));
                }
            }
        }
        return builder.build();
    }
}
