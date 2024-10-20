package X;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.List;

/* renamed from: X.3ea, reason: invalid class name */
/* loaded from: 3ea.class */
public final class C3ea implements CharSequence, Formattable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final List A03;

    public C3ea(List list, int i, int i2, int i3) {
        this.A03 = list;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    private final void A00(StringBuilder sb) {
        int i = this.A01;
        for (int i2 = this.A02; i2 < i; i2++) {
            List list = this.A03;
            11T.A0D(list);
            CharSequence charSequence = (CharSequence) list.get(i2);
            if (charSequence instanceof C3ea) {
                ((C3ea) charSequence).A00(sb);
            } else {
                sb.append(charSequence);
            }
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return toString().charAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Appendable] */
    @Override // java.util.Formattable
    public void formatTo(Formatter formatter, int i, int i2, int i3) {
        ?? r0 = formatter;
        11T.A0F((Object) r0, 0);
        try {
            r0 = formatter.out().append(this);
        } catch (IOException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.A00;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        StringBuilder A0l = AnonymousClass001.A0l(length());
        A00(A0l);
        return 11T.A02(A0l);
    }
}
