package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: Icv.class */
public final class Icv implements JNP, JLE, JFy {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public JMu A05;
    public I9U A06;
    public TimeUnit A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public JG2 A0E;
    public final I1d A0F;
    public final I5d A0G;
    public final AwakeTimeSinceBootClock A0H;
    public final IFJ A0I;
    public final HWo A0J;
    public final Hp7 A0K;
    public volatile Huj A0L;
    public volatile boolean A0M;

    public Icv() {
    }

    public Icv(I1d i1d, I5d i5d) {
        this(null, i1d, null, i5d, false);
    }

    public Icv(AwakeTimeSinceBootClock awakeTimeSinceBootClock, I1d i1d, HWo hWo, I5d i5d, boolean z) {
        this.A0F = i1d;
        this.A0G = i5d;
        this.A0B = z;
        IFJ gu5 = i5d.A09 != 1 ? new Gu5() : new Gu8(false);
        this.A0I = gu5;
        this.A0J = hWo;
        this.A0H = awakeTimeSinceBootClock;
        gu5.A00 = "glSurfaceOutput";
        this.A0A = true;
        this.A0M = false;
        this.A02 = 0;
        this.A01 = 0;
        this.A0K = new Hp7();
    }

    private void A00() {
        synchronized (this.A0G) {
            Huj huj = this.A0L;
            this.A0L = null;
            if (huj != null) {
                huj.A02();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v3 ??, still in use, count: 3, list:
          (r312v3 ??) from 0x016e: PHI (r312v1 ??) = (r312v0 ??), (r312v2 ??), (r312v3 ??) binds: [B:99:0x0154, B:93:0x016a, B:68:0x011a] A[DONT_GENERATE, DONT_INLINE]
          (r312v3 ?? I:X.Huj) from 0x00f5: IGET (r0v91 ?? I:X.IFI) = (r312v3 ?? I:X.Huj) A[Catch: all -> 0x011d] X.Huj.A01 X.IFI
          (r312v3 ?? I:X.Huj) from 0x0114: IPUT (r0v96 ?? I:android.opengl.EGLSurface), (r312v3 ?? I:X.Huj) A[Catch: all -> 0x011d] X.Huj.A00 android.opengl.EGLSurface
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
    public void AAv(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v3 ??, still in use, count: 3, list:
          (r312v3 ??) from 0x016e: PHI (r312v1 ??) = (r312v0 ??), (r312v2 ??), (r312v3 ??) binds: [B:99:0x0154, B:93:0x016a, B:68:0x011a] A[DONT_GENERATE, DONT_INLINE]
          (r312v3 ?? I:X.Huj) from 0x00f5: IGET (r0v91 ?? I:X.IFI) = (r312v3 ?? I:X.Huj) A[Catch: all -> 0x011d] X.Huj.A01 X.IFI
          (r312v3 ?? I:X.Huj) from 0x0114: IPUT (r0v96 ?? I:android.opengl.EGLSurface), (r312v3 ?? I:X.Huj) A[Catch: all -> 0x011d] X.Huj.A00 android.opengl.EGLSurface
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public void AN3() {
        Object obj;
        JMu jMu = this.A05;
        this.A05 = null;
        this.A08 = false;
        this.A0M = false;
        if (jMu != null) {
            jMu.BDn();
            boolean z = this.A0B;
            I5d i5d = this.A0G;
            if (z) {
                obj = i5d.A0D;
            } else {
                obj = i5d.A0C;
                if (obj == null) {
                    obj = i5d.A00();
                }
            }
            if (obj != null) {
                HashMap hashMap = Hxt.A01;
                synchronized (hashMap) {
                    if (equals((Icv) hashMap.get(obj))) {
                        hashMap.remove(obj);
                    }
                    A00();
                }
            }
        }
        I9U i9u = this.A06;
        if (i9u != null) {
            i9u.A07.A00(this);
        }
    }

    public int Ad5() {
        return this.A00;
    }

    @Override // X.JFy
    public String Aj7() {
        return "GlSurfaceOutput";
    }

    public Object AuT() {
        return this.A0G;
    }

    public int B0g() {
        JMu jMu = this.A05;
        if (jMu == null || (jMu.Aig().A00 & 32) == 0) {
            return 3;
        }
        return this.A01;
    }

    public int B0l() {
        int i = this.A0G.A08;
        int i2 = 1;
        if (i != 1) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 0;
                }
            }
        }
        return i2;
    }

    public void BOo(I9U i9u) {
        this.A06 = i9u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r0 <= r312) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011c, code lost:
    
        r305 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        if (r0.convert(r0, r0) >= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
    
        if (r0 >= r312) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: all -> 0x012c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0010, B:10:0x001b, B:11:0x0023, B:14:0x0037, B:17:0x0042, B:21:0x0058, B:24:0x0072, B:27:0x007d, B:31:0x0093, B:36:0x0128, B:42:0x00ad, B:45:0x00b8, B:49:0x00ce, B:52:0x00e1, B:55:0x00ec, B:59:0x0102), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[Catch: all -> 0x012c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0010, B:10:0x001b, B:11:0x0023, B:14:0x0037, B:17:0x0042, B:21:0x0058, B:24:0x0072, B:27:0x007d, B:31:0x0093, B:36:0x0128, B:42:0x00ad, B:45:0x00b8, B:49:0x00ce, B:52:0x00e1, B:55:0x00ec, B:59:0x0102), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec A[Catch: all -> 0x012c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0010, B:10:0x001b, B:11:0x0023, B:14:0x0037, B:17:0x0042, B:21:0x0058, B:24:0x0072, B:27:0x007d, B:31:0x0093, B:36:0x0128, B:42:0x00ad, B:45:0x00b8, B:49:0x00ce, B:52:0x00e1, B:55:0x00ec, B:59:0x0102), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BS5(X.JMv r302) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Icv.BS5(X.JMv):boolean");
    }

    public boolean BUc() {
        return this.A09;
    }

    public boolean BWr() {
        return this.A0G.A00;
    }

    public Exception BcC() {
        IllegalStateException illegalStateException;
        synchronized (this.A0G) {
            Huj huj = this.A0L;
            if (huj == null) {
                this.A0F.A00(HBq.A0e);
                illegalStateException = AnonymousClass001.A0N("Gl surface is null");
            } else {
                try {
                    huj.A05();
                    illegalStateException = null;
                } catch (J7C e) {
                    this.A0F.A00(HBq.A0L);
                    return e;
                }
            }
        }
        return illegalStateException;
    }

    public void Cn3(int i) {
        this.A00 = i;
    }

    public void Crr(JG2 jg2) {
        this.A0E = jg2;
    }

    public void CvA(int i) {
        this.A01 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0023, code lost:
    
        if (r0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D3m() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Icv.D3m():void");
    }

    public Hp4 D7S(JMv jMv) {
        return D7T(jMv, this.A0I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (r0.A0F == false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Hp4 D7T(X.JMv r302, X.IFJ r303) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Icv.D7T(X.JMv, X.IFJ):X.Hp4");
    }

    public boolean contains(Object obj) {
        return AnonymousClass001.A1W(this.A0G, obj);
    }

    public void release() {
        I5d i5d = this.A0G;
        synchronized (i5d) {
            i5d.A01();
            this.A0M = false;
        }
        I9U i9u = this.A06;
        if (i9u != null) {
            i9u.A07.A00(this);
        }
    }
}
