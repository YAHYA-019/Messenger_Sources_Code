package X;

import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/* loaded from: LC4.class */
public final class LC4 {
    public MBt A00;
    public final MBu A01;
    public final Kjx A02;

    public LC4(MBt mBt, MBu mBu, Kjx kjx, Set set) {
        this.A01 = mBu;
        this.A02 = kjx;
        this.A00 = mBt;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            A00(new LQj(str), this, str, 0, str.length(), 1, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007f, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object A00(X.MI6 r301, X.LC4 r302, java.lang.CharSequence r303, int r304, int r305, int r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LC4.A00(X.MI6, X.LC4, java.lang.CharSequence, int, int, int, boolean):java.lang.Object");
    }

    public static boolean A01(Editable editable, KeyEvent keyEvent, boolean z) {
        JXE[] jxeArr;
        int length;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (jxeArr = (JXE[]) editable.getSpans(selectionStart, selectionEnd, JXE.class)) == null || (length = jxeArr.length) <= 0) {
            return false;
        }
        int i = 0;
        do {
            JXE jxe = jxeArr[i];
            int spanStart = editable.getSpanStart(jxe);
            int spanEnd = editable.getSpanEnd(jxe);
            if (z) {
                if (spanStart == selectionStart) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
                if (selectionStart <= spanStart && selectionStart < spanEnd) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
                i++;
            } else {
                if (spanEnd == selectionStart) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
                if (selectionStart <= spanStart) {
                }
                i++;
            }
        } while (i < length);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
    
        if (java.lang.Character.isHighSurrogate(r0) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0121, code lost:
    
        if (r312 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c1, code lost:
    
        if (java.lang.Character.isLowSurrogate(r0) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a3, code lost:
    
        if (r312 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(android.text.Editable r301, android.view.inputmethod.InputConnection r302, int r303, int r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LC4.A02(android.text.Editable, android.view.inputmethod.InputConnection, int, int, boolean):boolean");
    }

    private boolean A03(L85 l85, CharSequence charSequence, int i, int i2) {
        if ((l85.A02 & 3) == 0) {
            LQf lQf = this.A00;
            JgK A00 = L85.A00(l85);
            int A03 = A00.A03(8);
            if (A03 != 0) {
                ((LA6) A00).A04.getShort(A03 + ((LA6) A00).A00);
            }
            LQf lQf2 = lQf;
            ThreadLocal threadLocal = LQf.A01;
            if (threadLocal.get() == null) {
                threadLocal.set(AnonymousClass001.A0k());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = lQf2.A00.hasGlyph(sb.toString());
            int i3 = l85.A02 & 4;
            int i4 = i3 | 1;
            if (hasGlyph) {
                i4 = i3 | 2;
            }
            l85.A02 = i4;
        }
        return AnonymousClass001.A1Q(l85.A02 & 3, 2);
    }
}
