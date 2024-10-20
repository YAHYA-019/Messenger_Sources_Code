package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: L9n.class */
public final class L9n {
    public boolean A00;
    public final Lii A01;
    public final List A02 = AnonymousClass001.A0s();
    public final int[] A03 = new int[5];

    public L9n(Lii lii) {
        this.A01 = lii;
    }

    public static boolean A00(L9n l9n) {
        List<KJs> list = l9n.A02;
        int size = list.size();
        float f = 0.0f;
        boolean z = false;
        int i = 0;
        float f2 = 0.0f;
        for (KJs kJs : list) {
            if (kJs.A01 >= 2) {
                i++;
                f2 += kJs.A00;
            }
        }
        if (i >= 3) {
            float f3 = f2 / size;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f += DKC.A01(((KJs) it.next()).A00, f3);
            }
            if (f <= f2 * 0.05f) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0365, code lost:
    
        if (r0[1] > r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03fd, code lost:
    
        if (r0.A03(r305, r0) == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0400, code lost:
    
        r0 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x040a, code lost:
    
        if (r0 > r0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x040d, code lost:
    
        r0[0] = r0 + 1;
        r305 = r305 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ed, code lost:
    
        if (r305 < 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x042c, code lost:
    
        if (r0[0] <= r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0432, code lost:
    
        r313 = r313 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x043c, code lost:
    
        if (r313 >= r0) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x044c, code lost:
    
        if (r0.A03(r313, r0) == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x044f, code lost:
    
        X.JQx.A1U(r0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x045d, code lost:
    
        if (r313 != r0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0467, code lost:
    
        if (r313 >= r0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0477, code lost:
    
        if (r0.A03(r313, r0) != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x047a, code lost:
    
        r0 = r0[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0485, code lost:
    
        if (r0 >= r0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0488, code lost:
    
        r0[3] = r0 + 1;
        r313 = r313 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04a2, code lost:
    
        if (r313 == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04b0, code lost:
    
        if (r0[3] < r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04ba, code lost:
    
        if (r313 >= r0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04ca, code lost:
    
        if (r0.A03(r313, r0) == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04cd, code lost:
    
        r0 = r0[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04d8, code lost:
    
        if (r0 >= r0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04db, code lost:
    
        r0[4] = r0 + 1;
        r313 = r313 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04f1, code lost:
    
        r0 = r0[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04fc, code lost:
    
        if (r0 >= r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04ff, code lost:
    
        r0 = r0[0] + r0[1];
        r0 = r0[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x053d, code lost:
    
        if ((X.GOn.A05(((r0 + r0) + r0[3]) + r0, r0) * 5) >= r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0549, code lost:
    
        if (A02(r0) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x054c, code lost:
    
        r329 = ((r313 - r0) - r0) - (r0 / 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0122, code lost:
    
        if (r0[1] > r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01ab, code lost:
    
        if (r0.A03(r313, r324) == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01ae, code lost:
    
        r0 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01b8, code lost:
    
        if (r0 > r0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01bb, code lost:
    
        r0[0] = r0 + 1;
        r324 = r324 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x019b, code lost:
    
        if (r324 < 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01da, code lost:
    
        if (r0[0] <= r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01e0, code lost:
    
        r305 = r305 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01ea, code lost:
    
        if (r305 >= r0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01fa, code lost:
    
        if (r0.A03(r313, r305) == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01fd, code lost:
    
        X.JQx.A1U(r0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x020b, code lost:
    
        if (r305 != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0215, code lost:
    
        if (r305 >= r0) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0225, code lost:
    
        if (r0.A03(r313, r305) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0228, code lost:
    
        r0 = r0[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0233, code lost:
    
        if (r0 >= r0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0236, code lost:
    
        r0[3] = r0 + 1;
        r305 = r305 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0250, code lost:
    
        if (r305 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x025e, code lost:
    
        if (r0[3] < r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0268, code lost:
    
        if (r305 >= r0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0278, code lost:
    
        if (r0.A03(r313, r305) == false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x027b, code lost:
    
        r0 = r0[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0286, code lost:
    
        if (r0 >= r0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0289, code lost:
    
        r0[4] = r0 + 1;
        r305 = r305 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x029f, code lost:
    
        r0 = r0[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02aa, code lost:
    
        if (r0 >= r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02ad, code lost:
    
        r0 = r0[0] + r0[1];
        r0 = r0[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x02f1, code lost:
    
        if ((X.GOn.A05(((r0 + r0) + r0[3]) + r0, r0) * 5) >= (r0 * 2)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x02fd, code lost:
    
        if (A02(r0) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0300, code lost:
    
        r327 = ((r305 - r0) - r0) - (r0 / 2.0f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(X.L9n r301, int[] r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 2309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9n.A01(X.L9n, int[], int, int):boolean");
    }

    public static boolean A02(int[] iArr) {
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[i];
            if (i3 == 0) {
                return false;
            }
            i2 += i3;
            i++;
        } while (i < 5);
        if (i2 < 7) {
            return false;
        }
        float f = i2 / 7.0f;
        float f2 = f / 2.0f;
        return JR0.A03(iArr, f, 0) < f2 && JR0.A03(iArr, f, 1) < f2 && JR0.A03(iArr, f * 3.0f, 2) < 3.0f * f2 && JR0.A03(iArr, f, 3) < f2 && JR0.A03(iArr, f, 4) < f2;
    }
}
