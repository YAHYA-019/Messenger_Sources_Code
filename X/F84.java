package X;

import android.text.Layout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: F84.class */
public final class F84 {
    public char[] A00;
    public final Layout A01;
    public final List A02;
    public final List A03;
    public final boolean[] A04;

    public F84(Layout layout) {
        this.A01 = layout;
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        do {
            int A00 = 0CU.A00(this.A01.getText(), '\n', i);
            i = A00 < 0 ? this.A01.getText().length() : A00 + 1;
            AnonymousClass001.A1J(A0s, i);
        } while (i < this.A01.getText().length());
        this.A03 = A0s;
        int size = A0s.size();
        ArrayList A0t = AnonymousClass001.A0t(size);
        for (int i2 = 0; i2 < size; i2++) {
            A0t.add(null);
        }
        this.A02 = A0t;
        this.A04 = new boolean[A0s.size()];
        A0s.size();
    }

    public static final int A00(F84 f84, int i, int i2) {
        while (i > i2) {
            char charAt = f84.A01.getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760) {
                if (11T.A00(charAt, 8192) < 0 || 11T.A00(charAt, 8202) > 0) {
                    if (charAt != 8287 && charAt != 12288) {
                        break;
                    }
                } else if (charAt == 8199) {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0507, code lost:
    
        if (r320 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x051a, code lost:
    
        if (r320 != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0294, code lost:
    
        if (r325.getRunCount() == 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cc, code lost:
    
        if (r306 != X.DKE.A0G(r0, r317)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x04f2, code lost:
    
        if (r320 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x053d, code lost:
    
        if (r320 != false) goto L168;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float A01(int r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 1373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F84.A01(int, boolean, boolean):float");
    }
}
