package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5hz, reason: invalid class name */
/* loaded from: 5hz.class */
public final class C5hz {
    public static C5hz A08;
    public final C5i0 A07;
    public final Set A06 = new LinkedHashSet();
    public final ArrayList A02 = new ArrayList();
    public final java.util.Map A05 = new HashMap();
    public boolean A01 = false;
    public final List A04 = new ArrayList();
    public final List A03 = new ArrayList();
    public boolean A00 = false;

    public C5hz(C5i0 c5i0) {
        this.A07 = c5i0;
    }

    public void A00(C5i3 c5i3) {
        RuntimeException A0T;
        synchronized (this) {
            if (!c5i3.A02) {
                A0T = AnonymousClass001.A0T(AnonymousClass001.A0Z(c5i3, "Expected added GraphBinding to be active: ", AnonymousClass001.A0k()));
            } else if (this.A01) {
                this.A03.add(c5i3);
            } else {
                Set set = this.A06;
                set.add(c5i3);
                ArrayList arrayList = c5i3.A05;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    java.util.Map map = this.A05;
                    5iE r0 = (5iE) map.get(obj);
                    if (r0 != null) {
                        r0.A00++;
                    } else {
                        5iE r02 = new 5iE();
                        r02.A00 = 1;
                        map.put(obj, r02);
                    }
                    i = i2 + 1;
                }
                if (set.size() == 1) {
                    C5i0 c5i0 = this.A07;
                    if (c5i0.A01 == null) {
                        A0T = AnonymousClass001.A0T("Must set a binding graph first.");
                    } else if (c5i0.A03) {
                        A0T = AnonymousClass001.A0T("Tried to start but was already running.");
                    } else {
                        c5i0.A03 = true;
                        if (!c5i0.A02) {
                            c5i0.A05.A01(c5i0.A04);
                            c5i0.A02 = true;
                        }
                    }
                }
                this.A00 = true;
            }
            throw A0T;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v4 ??, still in use, count: 2, list:
          (r312v4 ??) from 0x0100: PHI (r312v3 ??) = (r312v2 ??), (r312v4 ??) binds: [B:60:0x00e7, B:65:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          (r312v4 ?? I:android.view.Choreographer$FrameCallback) from 0x00fd: IPUT (r312v4 ?? I:android.view.Choreographer$FrameCallback), (r0v40 ?? I:X.2XX) A[Catch: all -> 0x017a] X.2XX.A00 android.view.Choreographer$FrameCallback
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
    public void A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v4 ??, still in use, count: 2, list:
          (r312v4 ??) from 0x0100: PHI (r312v3 ??) = (r312v2 ??), (r312v4 ??) binds: [B:60:0x00e7, B:65:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          (r312v4 ?? I:android.view.Choreographer$FrameCallback) from 0x00fd: IPUT (r312v4 ?? I:android.view.Choreographer$FrameCallback), (r0v40 ?? I:X.2XX) A[Catch: all -> 0x017a] X.2XX.A00 android.view.Choreographer$FrameCallback
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
}
