package X;

import android.content.Context;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: IkO.class */
public final class IkO implements JKc {
    public I9d A03;
    public JQa A04;
    public final Context A05;
    public final JGv A06;
    public final IFD A07;
    public final JGx A08;
    public final JGy A09;
    public final JKb A0A;
    public final JLT A0B;
    public final Ik6 A0C;
    public final I9e A0D;
    public final JH6 A0E;
    public final HashSet A0F;
    public int A00 = -1;
    public int A02 = -1;
    public int A01 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public IkO(Context context, JGv jGv, IFD ifd, JGx jGx, JGy jGy, JQa jQa, JKb jKb, JLT jlt, Ik6 ik6, I9e i9e, JH6 jh6, HashSet hashSet) {
        this.A05 = context;
        this.A0F = hashSet;
        this.A08 = jGx;
        this.A0B = jlt;
        this.A09 = jGy;
        this.A0A = jKb;
        this.A0E = jh6;
        this.A0D = i9e;
        this.A07 = ifd;
        this.A06 = jGv == null ? new Object() : jGv;
        this.A0C = ik6;
        this.A04 = jQa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0284, code lost:
    
        if (r0 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.JKZ A00(X.Hqj r302, X.I8v r303, X.Hqo r304, X.Qq3 r305, X.JMZ r306, java.io.File r307, long r308, long r310, long r312, boolean r314, boolean r315) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IkO.A00(X.Hqj, X.I8v, X.Hqo, X.Qq3, X.JMZ, java.io.File, long, long, long, boolean, boolean):X.JKZ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r301.A0A.ADp() == false) goto L6;
     */
    @Override // X.JKc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ADp() {
        /*
            r301 = this;
            r0 = r301
            X.JLT r0 = r0.A0B
            r302 = r0
            r0 = r302
            boolean r0 = r0.ADp()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r301
            X.JKb r0 = r0.A0A
            r302 = r0
            r0 = r302
            boolean r0 = r0.ADp()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L26
        L22:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L26:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IkO.ADp():boolean");
    }

    @Override // X.JKc
    public boolean ADq() {
        return this.A0B.ADq();
    }

    @Override // X.JKc
    public List ALD(Hqj hqj, I8v i8v, I9d i9d, Hqo hqo, JMZ jmz, QpB qpB, File file, List list, List list2, long j, long j2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        this.A03 = i9d;
        Iterator it = list2.iterator();
        boolean z6 = false;
        long j3 = 0;
        long j4 = 0;
        boolean z7 = false;
        long j5 = 0;
        boolean z8 = false;
        while (it.hasNext()) {
            IDe iDe = (IDe) it.next();
            int ordinal = iDe.A0M.ordinal();
            if (ordinal != 0) {
                long j6 = iDe.A0J;
                if (ordinal != 1) {
                    j5 += j6;
                    z8 |= iDe.A0O;
                } else {
                    j4 += j6;
                    z7 |= iDe.A0O;
                }
            } else {
                j3 += iDe.A0J;
                z6 |= iDe.A0O;
            }
        }
        Qq3 qq3 = Qq3.A02;
        11T.A0F(list, 1);
        Iterator it2 = list.iterator();
        int i = -1;
        while (it2.hasNext()) {
            QyS qyS = (QyS) it2.next();
            if (qq3 == qyS.A04) {
                i = Math.max(i, qyS.A00);
            }
        }
        this.A00 = i;
        Qq3 qq32 = Qq3.A04;
        Iterator it3 = list.iterator();
        int i2 = -1;
        while (it3.hasNext()) {
            QyS qyS2 = (QyS) it3.next();
            if (qq32 == qyS2.A04) {
                i2 = Math.max(i2, qyS2.A00);
            }
        }
        this.A00++;
        this.A02 = i2 + 1;
        hqj.getClass();
        if (hqo.A0U != null) {
            HashMap hashMap = hqj.A0J;
            z4 = false;
            if (hashMap != null) {
                HAy hAy = HAy.A01;
                if (hashMap.get(hAy) != null) {
                    Iterator A13 = GOo.A13((AbstractMap) hashMap.get(hAy));
                    while (A13.hasNext()) {
                        Iterator A1G = GOn.A1G(A13.next());
                        while (A1G.hasNext()) {
                            z4 |= ((Hqj) A1G.next()).A0K;
                        }
                    }
                }
            }
        } else {
            z4 = hqj.A0K;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        if (qpB == QpB.A02) {
            if (!hqo.A0e && z4) {
                qq32 = Qq3.A03;
                z7 = z8;
                j4 = j5;
            }
            if (!z7) {
                z5 = false;
                A0s.add(A00(hqj, i8v, hqo, qq32, jmz, file, j4, j, j2, z5, z));
            }
        } else {
            if (z4 && !hqo.A0e && !z6) {
                A0s.add(A00(hqj, i8v, hqo, qq3, jmz, file, j3, j, j2, false, z));
            }
            if (!z7) {
                z5 = z2;
                A0s.add(A00(hqj, i8v, hqo, qq32, jmz, file, j4, j, j2, z5, z));
            }
        }
        return A0s;
    }
}
