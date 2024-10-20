package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: Ku1.class */
public final class Ku1 {
    public final L35 A00;
    public final String A01;
    public final List A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public Ku1(L35 l35, String str, List list) {
        this.A01 = str;
        l35.getClass();
        this.A00 = l35;
        this.A02 = list == null ? Collections.emptyList() : 1BK.A17(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4 A[LOOP:0: B:16:0x00b4->B:18:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015f A[LOOP:1: B:21:0x015a->B:23:0x015f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0175 A[EDGE_INSN: B:24:0x0175->B:25:0x0175 BREAK  A[LOOP:1: B:21:0x015a->B:23:0x015f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019f A[LOOP:2: B:26:0x0198->B:28:0x019f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x020b A[LOOP:3: B:31:0x0200->B:33:0x020b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021b A[EDGE_INSN: B:34:0x021b->B:35:0x021b BREAK  A[LOOP:3: B:31:0x0200->B:33:0x020b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0352  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A00(X.1IJ r302) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ku1.A00(X.1IJ):int");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof Ku1)) {
                return false;
            }
            Ku1 ku1 = (Ku1) obj;
            if (this.A01.equals(ku1.A01) && this.A00.equals(ku1.A00) && this.A02.equals(ku1.A02)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A00, AbstractC2326GOr.A07(this.A01)) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        String str = this.A01;
        if (str != null) {
            A0k.append(str);
            A0k.append(": ");
        }
        L35 l35 = this.A00;
        A0k.append(l35.A00);
        List list = this.A02;
        if (!list.isEmpty()) {
            A0k.append("<");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1BK.A1R(A0k, it.next());
                AnonymousClass001.A1H(A0k);
            }
            A0k.deleteCharAt(A0k.length() - 1);
            A0k.append(">");
        }
        if (!l35.A02) {
            A0k.append(" not null");
        }
        return A0k.toString();
    }
}
