package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.5ha, reason: invalid class name */
/* loaded from: 5ha.class */
public final class C5ha {
    public static final String A08 = C5ha.class.getName();
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final Context A05;
    public final 1Fi A06;
    public final C15h A07;

    public C5ha() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A05 = A00;
        this.A00 = 1Bq.A00(66191);
        this.A01 = 1Bq.A00(16504);
        this.A03 = 1Bq.A00(65891);
        this.A04 = 1Bq.A00(65890);
        this.A07 = new C15h() { // from class: X.5hb
            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                return 1Fw.A04((1EZ) 1Bn.A0A(16428));
            }
        };
        1Br A002 = 1Bq.A00(16496);
        this.A02 = A002;
        1Fi A003 = ((1Fe) A002.A00.get()).A00("qt_manual_downloader_prefs");
        11T.A0A(A003);
        this.A06 = A003;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v16 ??, still in use, count: 3, list:
          (r303v16 ??) from 0x00b2: PHI (r303v3 ??) = (r303v2 ??), (r303v16 ??) binds: [B:14:0x0096, B:23:0x00af] A[DONT_GENERATE, DONT_INLINE]
          (r303v16 ?? I:X.0OQ) from 0x00ab: IPUT (r0v163 ?? I:android.content.Context), (r303v16 ?? I:X.0OQ) A[Catch: all -> 0x026e] X.0OQ.A00 android.content.Context
          (r303v16 ?? I:X.0OQ) from 0x00af: SPUT (r303v16 ?? I:X.0OQ) A[Catch: all -> 0x026e] X.0OQ.A03 X.0OQ
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
    public final boolean A00() {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ha.A00():boolean");
    }
}
