package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: Lib.class */
public final class Lib implements Appendable {
    public final StringBuilder A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public Lib() {
        this(16);
    }

    public Lib(int i) {
        this.A00 = AnonymousClass001.A0l(16);
        this.A03 = AnonymousClass001.A0s();
        this.A02 = AnonymousClass001.A0s();
        this.A01 = AnonymousClass001.A0s();
        this.A04 = AnonymousClass001.A0s();
    }

    public final Lie A00() {
        StringBuilder sb = this.A00;
        String obj = sb.toString();
        List list = this.A03;
        ArrayList A1B = AbJ.A1B(list);
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            A1B.add(((Ku6) list.get(i2)).A00(sb.length()));
            i = i2 + 1;
        }
        if (A1B.isEmpty()) {
            A1B = null;
        }
        List list2 = this.A02;
        ArrayList A1B2 = AbJ.A1B(list2);
        int size2 = list2.size();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= size2) {
                break;
            }
            A1B2.add(((Ku6) list2.get(i4)).A00(sb.length()));
            i3 = i4 + 1;
        }
        if (A1B2.isEmpty()) {
            A1B2 = null;
        }
        List list3 = this.A01;
        ArrayList A1B3 = AbJ.A1B(list3);
        int size3 = list3.size();
        for (int i5 = 0; i5 < size3; i5++) {
            A1B3.add(((Ku6) list3.get(i5)).A00(sb.length()));
        }
        return new Lie(obj, A1B, A1B2, A1B3.isEmpty() ? null : A1B3);
    }

    public final void A01(Lie lie) {
        StringBuilder sb = this.A00;
        int length = sb.length();
        sb.append(lie.A00);
        List list = lie.A03;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                L8b A0R = JQz.A0R(list, i2);
                A02((L5H) A0R.A02, A0R.A01 + length, A0R.A00 + length);
                i = i2 + 1;
            }
        }
        List list2 = lie.A02;
        if (list2 != null) {
            int size2 = list2.size();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= size2) {
                    break;
                }
                L8b A0R2 = JQz.A0R(list2, i4);
                this.A02.add(new Ku6(A0R2.A02, "", A0R2.A01 + length, A0R2.A00 + length));
                i3 = i4 + 1;
            }
        }
        List list3 = lie.A01;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                L8b A0R3 = JQz.A0R(list3, i5);
                this.A01.add(new Ku6(A0R3.A02, A0R3.A03, A0R3.A01 + length, A0R3.A00 + length));
            }
        }
    }

    public final void A02(L5H l5h, int i, int i2) {
        this.A03.add(new Ku6(l5h, "", i, i2));
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) {
        this.A00.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        if (charSequence instanceof Lie) {
            A01((Lie) charSequence);
            return this;
        }
        this.A00.append(charSequence);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r316v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r316v1, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r316v2 */
    /* JADX WARN: Type inference failed for: r316v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r316v4, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r316v5 */
    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Lie) {
            Lie lie = (Lie) charSequence;
            StringBuilder sb = this.A00;
            int length = sb.length();
            String str = lie.A00;
            sb.append((CharSequence) str, i, i2);
            List A00 = L9U.A00(lie, i, i2);
            if (A00 != null) {
                int size = A00.size();
                for (int i3 = 0; i3 < size; i3++) {
                    L8b A0R = JQz.A0R(A00, i3);
                    A02((L5H) A0R.A02, A0R.A01 + length, A0R.A00 + length);
                }
            }
            if (i != i2) {
                List list = lie.A02;
                if (list != 0) {
                    if (i != 0 || i2 < str.length()) {
                        ArrayList A1B = AbJ.A1B((List) list);
                        int size2 = list.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            Object obj = list.get(i4);
                            L8b.A00((L8b) obj, obj, A1B, i, i2);
                        }
                        list = 1BL.A10(A1B);
                        int size3 = A1B.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            L8b l8b = (L8b) A1B.get(i5);
                            L8b.A01(l8b.A02, list, 07C.A02(l8b.A01, i, i2) - i, 07C.A02(l8b.A00, i, i2) - i);
                        }
                    }
                    int size4 = list.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        L8b A0R2 = JQz.A0R(list, i6);
                        this.A02.add(new Ku6(A0R2.A02, "", A0R2.A01 + length, A0R2.A00 + length));
                    }
                }
            }
            if (i != i2) {
                List list2 = lie.A01;
                if (list2 != 0) {
                    if (i != 0 || i2 < str.length()) {
                        ArrayList A1B2 = AbJ.A1B((List) list2);
                        int size5 = list2.size();
                        for (int i7 = 0; i7 < size5; i7++) {
                            Object obj2 = list2.get(i7);
                            L8b.A00((L8b) obj2, obj2, A1B2, i, i2);
                        }
                        list2 = 1BL.A10(A1B2);
                        int size6 = A1B2.size();
                        for (int i8 = 0; i8 < size6; i8++) {
                            L8b l8b2 = (L8b) A1B2.get(i8);
                            list2.add(new L8b(l8b2.A02, l8b2.A03, 07C.A02(l8b2.A01, i, i2) - i, 07C.A02(l8b2.A00, i, i2) - i));
                        }
                    }
                    int size7 = list2.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        L8b A0R3 = JQz.A0R(list2, i9);
                        this.A01.add(new Ku6(A0R3.A02, A0R3.A03, A0R3.A01 + length, A0R3.A00 + length));
                    }
                }
            }
        } else {
            this.A00.append(charSequence, i, i2);
        }
        return this;
    }
}
