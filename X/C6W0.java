package X;

import android.net.Uri;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6W0, reason: invalid class name */
/* loaded from: 6W0.class */
public final class C6W0 {
    public long A00;
    public String A01;
    public String A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final Uri A0G;
    public final Krs A0H;
    public final C7rv A0I;
    public final KpY A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public C6W0(Uri uri, Krs krs, C7rv c7rv, KpY kpY, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A05 = j;
        this.A07 = j2;
        this.A0A = j3;
        this.A0S = z;
        this.A0B = j4;
        this.A0F = j5;
        this.A0E = j6;
        this.A0D = j7;
        this.A0H = krs;
        this.A0J = kpY;
        this.A0G = uri;
        this.A0I = c7rv;
        this.A0R = list;
        this.A04 = j8;
        this.A08 = j9;
        this.A06 = j10;
        this.A09 = j11;
        this.A0C = j12;
        this.A0V = z2;
        this.A0T = z3;
        this.A0X = z4;
        this.A0W = z5;
        this.A0Y = z6;
        this.A0Q = str;
        this.A03 = i;
        this.A0L = str2;
        this.A0O = str3;
        this.A0K = str4;
        this.A0N = str5;
        this.A0M = str6;
        this.A0P = str7;
        this.A0U = z7;
        this.A00 = j13;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v3 long, still in use, count: 2, list:
          (r307v3 long) from 0x0045: PHI (r307v1 long) = (r307v0 long), (r307v3 long) binds: [B:9:0x002e, B:4:0x0025] A[DONT_GENERATE, DONT_INLINE]
          (r307v3 long) from 0x0022: CMP_L (r307v3 long), (-9223372036854775807L long) A[WRAPPED]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final long A00(int r302) {
        /*
            r301 = this;
            r0 = r301
            java.util.List r0 = r0.A0R
            r303 = r0
            r0 = r303
            int r0 = r0.size()
            r1 = -1
            int r0 = r0 + r1
            r304 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r305 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L2e
            r0 = r301
            long r0 = r0.A07
            r307 = r0
            r0 = r307
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L45
        L28:
            r0 = r305
            long r0 = com.google.android.exoplayer2.util.Util.A0B(r0)
            return r0
        L2e:
            r0 = r302
            r1 = 1
            int r0 = r0 + r1
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            X.KqM r0 = (X.KqM) r0
            r309 = r0
            r0 = r309
            long r0 = r0.A00
            r307 = r0
        L45:
            r0 = r303
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            X.KqM r0 = (X.KqM) r0
            r309 = r0
            r0 = r309
            long r0 = r0.A00
            r310 = r0
            r0 = r307
            r1 = r310
            long r0 = r0 - r1
            r307 = r0
            r0 = r307
            r305 = r0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W0.A00(int):long");
    }

    public Pair A01() {
        KqM kqM;
        int A00;
        List list = this.A0R;
        Pair pair = null;
        if (list.size() != 0 && (A00 = (kqM = (KqM) list.get(0)).A00(2)) != -1) {
            L0w l0w = (L0w) kqM.A03.get(A00);
            pair = new Pair(l0w.A03, l0w.A04);
        }
        return pair;
    }

    public String A02() {
        KqM kqM;
        int A00;
        String str;
        List list = this.A0R;
        if (list.size() == 0 || (A00 = (kqM = (KqM) list.get(0)).A00(2)) == -1 || (str = ((L0w) kqM.A03.get(A00)).A02) == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public boolean A03() {
        KqM kqM;
        int A00;
        List list = this.A0R;
        if (list.size() == 0 || (A00 = (kqM = (KqM) list.get(0)).A00(1)) == -1) {
            return false;
        }
        L0w l0w = (L0w) kqM.A03.get(A00);
        if (!l0w.A09 || !l0w.A0A) {
            return false;
        }
        Iterator it = l0w.A07.iterator();
        while (it.hasNext()) {
            if (!"mp4a.40.42".equals(((6Cu) it.next()).A03.A0R)) {
                return false;
            }
        }
        return true;
    }
}
