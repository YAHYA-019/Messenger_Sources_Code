package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.040, reason: invalid class name */
/* loaded from: 040.class */
public final class AnonymousClass040 {
    public List A07;
    public List A08;
    public ArrayList A05 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public double[] A0A = new double[15];
    public int A00 = 0;
    public long[] A0B = new long[15];
    public int A02 = 0;
    public byte[] A09 = new byte[20];
    public int A03 = 0;
    public int A01 = -1;
    public String A04 = null;

    public static void A00(AnonymousClass040 anonymousClass040, byte b) {
        int i = anonymousClass040.A03;
        byte[] bArr = anonymousClass040.A09;
        int length = bArr.length;
        if (i == length) {
            bArr = length == 0 ? new byte[20] : Arrays.copyOf(bArr, (int) (length * 1.4d));
            anonymousClass040.A09 = bArr;
        }
        int i2 = anonymousClass040.A03;
        anonymousClass040.A03 = i2 + 1;
        bArr[i2] = b;
    }

    public static void A01(AnonymousClass040 anonymousClass040, long j) {
        int i = anonymousClass040.A02;
        long[] jArr = anonymousClass040.A0B;
        int length = jArr.length;
        if (i == length) {
            jArr = Arrays.copyOf(jArr, (int) (length * 1.4d));
            anonymousClass040.A0B = jArr;
        }
        int i2 = anonymousClass040.A02;
        anonymousClass040.A02 = i2 + 1;
        jArr[i2] = j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0052. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x022a A[LOOP:0: B:12:0x001f->B:34:0x022a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0226 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A02(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass040.A02(java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 4, list:
          (r302v2 ??) from 0x0244: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??), (r302v3 ??) binds: [B:6:0x0008, B:95:0x0240, B:10:0x0014] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:java.util.AbstractCollection) from 0x0229: INVOKE (r302v2 ?? I:java.util.AbstractCollection), (r0v136 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0248, MD:(E):boolean (c)]
          (r302v2 ?? I:java.util.AbstractCollection) from 0x0230: INVOKE (r302v2 ?? I:java.util.AbstractCollection), (r1v28 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0248, MD:(E):boolean (c)]
          (r302v2 ?? I:java.util.List) from 0x0241: IPUT (r302v2 ?? I:java.util.List), (r301v0 'this' ?? I:X.040 A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0248] X.040.A08 java.util.List
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public java.util.List A03() {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass040.A03():java.util.List");
    }
}
