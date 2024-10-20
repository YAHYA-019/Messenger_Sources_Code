package X;

/* renamed from: X.0q1, reason: invalid class name */
/* loaded from: 0q1.class */
public final class C0q1 implements 0Xt {
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 ??, still in use, count: 3, list:
          (r0v17 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) from 0x00d5: MOVE (r0v22 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r0v17 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER]
          (r0v17 ?? I:java.io.Reader) from 0x008c: INVOKE (r0v23 ?? I:java.io.BufferedReader), (r0v17 ?? I:java.io.Reader) DIRECT call: java.io.BufferedReader.<init>(java.io.Reader):void A[Catch: all -> 0x00d3, MD:(java.io.Reader):void (c)]
          (r0v17 ?? I:java.io.Reader) from 0x00b7: INVOKE (r0v17 ?? I:java.io.Reader) VIRTUAL call: java.io.Reader.close():void A[Catch: IOException -> 0x00e9, MD:():void throws java.io.IOException (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public void CRH() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0q1.CRH():void");
    }

    public void CRI() {
        0YO r0 = 0YO.$redex_init_class;
    }
}
