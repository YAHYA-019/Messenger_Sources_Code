package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: Lj1.class */
public final class Lj1 implements Iterable, MEV, AnonymousClass116 {
    public boolean A00;
    public boolean A01;
    public final java.util.Map A02 = 1BK.A1C();

    public static boolean A00(Lj1 lj1, Object obj) {
        return lj1.A02.containsKey(obj);
    }

    public final Object A01(L29 l29) {
        Object obj = this.A02.get(l29);
        if (obj != null) {
            return obj;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Key not present: ");
        A0k.append(l29);
        throw AnonymousClass002.A0F(" - consider getOrElse or getOrNull", A0k);
    }

    @Override // X.MEV
    public void ClM(L29 l29, Object obj) {
        if (obj instanceof L3v) {
            java.util.Map map = this.A02;
            if (map.containsKey(l29)) {
                Object obj2 = map.get(l29);
                11T.A0I(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                L3v l3v = (L3v) obj2;
                L3v l3v2 = (L3v) obj;
                String str = l3v2.A00;
                if (str == null) {
                    str = l3v.A00;
                }
                C00l c00l = l3v2.A01;
                if (c00l == null) {
                    c00l = l3v.A01;
                }
                map.put(l29, new L3v(str, c00l));
                return;
            }
        }
        this.A02.put(l29, obj);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Lj1)) {
                return false;
            }
            Lj1 lj1 = (Lj1) obj;
            if (!11T.A0O(this.A02, lj1.A02) || this.A01 != lj1.A01 || this.A00 != lj1.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1BL.A03(this.A02) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AnonymousClass001.A0y(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        String str = "";
        if (this.A01) {
            A0k.append(str);
            A0k.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.A00) {
            A0k.append(str);
            A0k.append("isClearingSemantics=true");
            str = ", ";
        }
        Iterator A0y = AnonymousClass001.A0y(this.A02);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            L29 l29 = (L29) A0z.getKey();
            Object value = A0z.getValue();
            A0k.append(str);
            A0k.append(l29.A01);
            A0k.append(" : ");
            A0k.append(value);
            str = ", ";
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append(KUq.A00(this));
        A0k2.append("{ ");
        A0k2.append((Object) A0k);
        return AnonymousClass001.A0d(" }", A0k2);
    }
}
