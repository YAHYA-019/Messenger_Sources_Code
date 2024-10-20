package X;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.7aB, reason: invalid class name */
/* loaded from: 7aB.class */
public final class C7aB {
    public final ImmutableList A00;

    public C7aB(List list) {
        this.A00 = ImmutableList.copyOf((Collection) list);
    }

    public static String[] A00(List list) {
        String[] strArr = new String[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return strArr;
            }
            strArr[i2] = ((AnonymousClass623) list.get(i2)).Awk().A1V;
            i = i2 + 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(A00(this.A00), A00(((C7aB) obj).A00));
    }

    public int hashCode() {
        return Arrays.hashCode(A00(this.A00));
    }
}
