package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.69u, reason: invalid class name */
/* loaded from: 69u.class */
public class C69u extends C69v {
    public InterfaceC04494b5 A00;
    public 0CS A01;
    public 1iL A02;
    public 2Dp A03;
    public 2Dp A04;
    public Set A05;
    public boolean A06;
    public 2Dp[] A07;
    public C69z A08;
    public final 2Er A09;
    public final Resources A0A;
    public final 0CS A0B;
    public final InterfaceC06384gn A0C;

    public C69u(Resources resources, 0CS r303, 5C6 r304, 2Er r305, InterfaceC06384gn interfaceC06384gn, Executor executor) {
        super(r304, executor);
        this.A0A = resources;
        this.A0C = new 4hF(resources, interfaceC06384gn);
        this.A0B = r303;
        this.A09 = r305;
    }

    public static 5CE A00(Drawable drawable) {
        5CE r302 = null;
        if (drawable != null) {
            if (drawable instanceof 5CE) {
                r302 = (5CE) drawable;
            } else {
                if (drawable instanceof 5CA) {
                    return A00(((5CA) drawable).AiL());
                }
                if (drawable instanceof 5C1) {
                    5C1 r0 = (5C1) drawable;
                    int length = r0.A04.length;
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= length) {
                            break;
                        }
                        5CE A00 = A00(r0.A01(i2));
                        if (A00 != null) {
                            return A00;
                        }
                        i = i2 + 1;
                    }
                }
            }
        }
        return r302;
    }

    private void A01(2Ea r302) {
        5CE A00;
        if (this.A06) {
            if (super.A00 == null) {
                GSk gSk = new GSk();
                A0E(new C2510Gfq(gSk));
                A0D(gSk);
            }
            GSk gSk2 = super.A00;
            if (gSk2 instanceof GSk) {
                GSk gSk3 = gSk2;
                String str = super.A06;
                if (str == null) {
                    str = "none";
                }
                gSk3.A09 = str;
                gSk3.invalidateSelf();
                C69f c69f = super.A02;
                InterfaceC07034in interfaceC07034in = null;
                if (c69f != null && (A00 = A00(c69f.A05)) != null) {
                    interfaceC07034in = A00.A05;
                }
                gSk3.A08 = interfaceC07034in;
                String A0I = A0I();
                if (A0I != null) {
                    gSk3.A0A.put("cc", A0I);
                }
                if (r302 == null) {
                    gSk3.A01();
                    return;
                }
                int width = r302.getWidth();
                int height = r302.getHeight();
                gSk3.A06 = width;
                gSk3.A00 = height;
                gSk3.invalidateSelf();
                gSk3.A01 = r302.getSizeInBytes();
            }
        }
    }

    @Override // X.C69v
    public 1OW A0A() {
        if (2D9.A00().BWo()) {
            2D9.A02("PipelineDraweeController#getDataSource");
        }
        1OW r0 = (1OW) this.A02.get();
        if (2D9.A00().BWo()) {
            2D9.A01();
        }
        return r0;
    }

    public Drawable A0H(2EU r302) {
        Drawable drawable;
        try {
            if (2D9.A00().BWo()) {
                2D9.A02("PipelineDraweeController#createDrawable");
            }
            C0By.A04(2EU.A06(r302));
            2Ea r0 = (2Ea) r302.A09();
            A01(r0);
            0CS r02 = this.A01;
            if (r02 != null) {
                Iterator it = r02.iterator();
                while (it.hasNext()) {
                    InterfaceC06384gn interfaceC06384gn = (InterfaceC06384gn) it.next();
                    if (interfaceC06384gn.D3e(r0)) {
                        drawable = interfaceC06384gn.AJc(r0);
                        if (drawable != null) {
                            break;
                        }
                    }
                }
            }
            drawable = null;
            if (drawable == null) {
                0CS r03 = this.A0B;
                if (r03 != null) {
                    Iterator it2 = r03.iterator();
                    while (it2.hasNext()) {
                        InterfaceC06384gn interfaceC06384gn2 = (InterfaceC06384gn) it2.next();
                        if (interfaceC06384gn2.D3e(r0)) {
                            drawable = interfaceC06384gn2.AJc(r0);
                            if (drawable != null) {
                                break;
                            }
                        }
                    }
                }
                drawable = null;
                if (drawable == null) {
                    drawable = this.A0C.AJc(r0);
                    if (drawable == null) {
                        throw AnonymousClass001.A0q(AnonymousClass001.A0Z(r0, "Unrecognized image class: ", AnonymousClass001.A0k()));
                    }
                }
            }
            if (2D9.A00().BWo()) {
                2D9.A01();
            }
            return drawable;
        } catch (Throwable th) {
            4YV.A14();
            throw th;
        }
    }

    public String A0I() {
        Object obj = super.A05;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public void A0J(InterfaceC04494b5 interfaceC04494b5, 0CS r303, 1iL r304, Object obj, String str) {
        if (2D9.A00().BWo()) {
            2D9.A02("PipelineDraweeController#initialize");
        }
        C69v.A07(this, obj, str);
        super.A07 = false;
        super.A08 = false;
        this.A02 = r304;
        A01(null);
        this.A00 = interfaceC04494b5;
        this.A01 = r303;
        A01(null);
        if (2D9.A00().BWo()) {
            2D9.A01();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v7 ??, still in use, count: 2, list:
          (r307v7 ??) from 0x00c1: PHI (r307v1 ??) = (r307v0 ??), (r307v7 ??) binds: [B:59:0x00a6, B:64:0x00bc] A[DONT_GENERATE, DONT_INLINE]
          (r307v7 ?? I:X.69z) from 0x00be: IPUT (r307v7 ?? I:X.69z), (r301v0 'this' ?? I:X.69u A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0218] X.69u.A08 X.69z
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
    public void A0K(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v7 ??, still in use, count: 2, list:
          (r307v7 ??) from 0x00c1: PHI (r307v1 ??) = (r307v0 ??), (r307v7 ??) binds: [B:59:0x00a6, B:64:0x00bc] A[DONT_GENERATE, DONT_INLINE]
          (r307v7 ?? I:X.69z) from 0x00be: IPUT (r307v7 ?? I:X.69z), (r301v0 'this' ?? I:X.69u A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0218] X.69u.A08 X.69z
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

    @Override // X.C69v, X.C69w
    public void CpU(C69f c69f) {
        super.CpU(c69f);
        A01(null);
    }

    @Override // X.C69v
    public String toString() {
        C46q A00 = C2qv.A00(this);
        C46q.A00(A00, super.toString(), "super");
        C46q.A00(A00, this.A02, "dataSourceSupplier");
        return A00.toString();
    }
}
