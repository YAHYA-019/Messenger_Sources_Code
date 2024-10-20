package X;

/* renamed from: X.6nu, reason: invalid class name */
/* loaded from: 6nu.class */
public final class C6nu implements Runnable {
    public static final String __redex_internal_original_name = "ThreadViewMessagesFragment$MessageListHelperListener$1";
    public final /* synthetic */ 6MK A00;

    public C6nu(6MK r302) {
        this.A00 = r302;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v16 ??, still in use, count: 5, list:
          (r305v16 ??) from 0x0462: PHI (r305v15 ??) = (r305v14 ??), (r305v16 ??) binds: [B:210:0x0434, B:219:0x045e] A[DONT_GENERATE, DONT_INLINE]
          (r305v16 ?? I:X.6o2) from 0x044d: IPUT (r0v14 ?? I:boolean), (r305v16 ?? I:X.6o2) A[Catch: all -> 0x0612] X.6o2.A02 boolean
          (r305v16 ?? I:X.6o2) from 0x0453: IPUT (r0v266 ?? I:com.google.common.collect.ImmutableList), (r305v16 ?? I:X.6o2) A[Catch: all -> 0x0612] X.6o2.A00 com.google.common.collect.ImmutableList
          (r305v16 ?? I:X.6o2) from 0x0459: IPUT (r1v26 ?? I:boolean), (r305v16 ?? I:X.6o2) A[Catch: all -> 0x0612] X.6o2.A03 boolean
          (r305v16 ?? I:X.6o2) from 0x045f: IPUT (r1v27 ?? I:boolean), (r305v16 ?? I:X.6o2) A[Catch: all -> 0x0612] X.6o2.A01 boolean
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
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6nu.run():void");
    }
}
