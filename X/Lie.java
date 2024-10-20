package X;

import java.util.List;

/* loaded from: Lie.class */
public final class Lie implements CharSequence {
    public static final MHv A04 = Kz2.A00;
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Lie(String str) {
        this(str, null, null, null);
        C0ty c0ty = C0ty.A00;
    }

    public Lie(String str, List list, List list2, List list3) {
        List A0b;
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        if (list2 == null || (A0b = 0QD.A0b(list2, new Ls8(3))) == null) {
            return;
        }
        int size = A0b.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return;
            }
            L8b A0R = JQz.A0R(A0b, i3);
            if (A0R.A01 < i) {
                throw AnonymousClass001.A0L("ParagraphStyle should not overlap");
            }
            int i4 = A0R.A00;
            if (i4 > this.A00.length()) {
                throw AnonymousClass001.A0L(0Pz.A0o("ParagraphStyle range [", ", ", ") is out of boundary", A0R.A01, i4));
            }
            i = A0R.A00;
            i2 = i3 + 1;
        }
    }

    @Override // java.lang.CharSequence
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Lie subSequence(int i, int i2) {
        if (i <= i2) {
            return (i == 0 && i2 == this.A00.length()) ? this : new Lie(7zM.A1C(i, i2, this.A00), L9U.A01(this.A03, i, i2), L9U.A01(this.A02, i, i2), L9U.A01(this.A01, i, i2));
        }
        throw JR1.A0l("start (", ") should be less or equal to end (", i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v0 */
    /* JADX WARN: Type inference failed for: r304v1 */
    /* JADX WARN: Type inference failed for: r304v2, types: [java.util.AbstractCollection] */
    public final List A01(int i) {
        Object obj;
        List list = this.A01;
        if (list != null) {
            obj = AbJ.A1B(list);
            int size = list.size();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= size) {
                    break;
                }
                Object obj2 = list.get(i3);
                L8b l8b = (L8b) obj2;
                if (l8b.A02 instanceof KT0) {
                    L8b.A00(l8b, obj2, obj, 0, i);
                }
                i2 = i3 + 1;
            }
        } else {
            obj = C0ty.A00;
        }
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return obj;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.A00.charAt(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Lie)) {
                return false;
            }
            Lie lie = (Lie) obj;
            if (!11T.A0O(this.A00, lie.A00) || !11T.A0O(this.A03, lie.A03) || !11T.A0O(this.A02, lie.A02) || !11T.A0O(this.A01, lie.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((4YV.A02(this.A00) + AnonymousClass002.A04(this.A03)) * 31) + AnonymousClass002.A04(this.A02)) * 31) + JQz.A0E(this.A01, 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.A00.length();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.A00;
    }
}
