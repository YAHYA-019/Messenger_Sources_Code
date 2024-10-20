package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.LevelListDrawable;

/* renamed from: X.1uv, reason: invalid class name */
/* loaded from: 1uv.class */
public final class C1uv {
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 2, list:
          (r304v3 ??) from 0x0036: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:12:0x001f, B:18:0x0032] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:java.lang.Object) from 0x0033: INVOKE (r0v3 ?? I:X.0AE), (r301v0 ?? I:int), (r304v3 ?? I:java.lang.Object) VIRTUAL call: X.0AE.A09(int, java.lang.Object):void A[Catch: all -> 0x003a]
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
    public static final android.graphics.ColorFilter A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 2, list:
          (r304v3 ??) from 0x0036: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:12:0x001f, B:18:0x0032] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:java.lang.Object) from 0x0033: INVOKE (r0v3 ?? I:X.0AE), (r301v0 ?? I:int), (r304v3 ?? I:java.lang.Object) VIRTUAL call: X.0AE.A09(int, java.lang.Object):void A[Catch: all -> 0x003a]
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
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

    public static final Drawable A01(Resources resources, Drawable drawable, int i) {
        int level = drawable.getLevel();
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            drawable = constantState.newDrawable(resources).mutate();
            11T.A0A(drawable);
        }
        drawable.setColorFilter(A00(i));
        if (drawable instanceof LevelListDrawable) {
            drawable.setLevel(level);
        }
        return drawable;
    }

    public final Drawable A02(Resources resources, int i, int i2) {
        11T.A0F(resources, 0);
        Drawable drawable = resources.getDrawable(i);
        11T.A0A(drawable);
        return A01(resources, drawable, resources.getColor(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable A03(Resources resources, Drawable drawable, int i) {
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        11T.A0F(resources, 0);
        if (drawable == null) {
            return null;
        }
        if (!((2yD) 1Bi.A03(16387)).AZk(72339189275361501L) || (constantState = drawable.getConstantState()) == null) {
            Drawable A01 = A01(resources, drawable, i);
            C3m8 c3m8 = C1uu.A04;
            if (drawable instanceof DrawableContainer) {
                drawable = drawable.getCurrent();
            }
            11T.A0D(drawable);
            Drawable drawable2 = A01;
            if (A01 instanceof DrawableContainer) {
                drawable2 = A01.getCurrent();
            }
            11T.A0D(drawable2);
            c3m8.A5k(drawable, drawable2);
            return A01;
        }
        int hashCode = constantState.hashCode();
        C03v c03v = C1uw.A02;
        Object obj = (C1uw) c03v.A3p();
        if (obj == null) {
            obj = new Object();
        }
        obj.A01 = hashCode;
        obj.A00 = i;
        1Xo r0 = C1uu.A02;
        Drawable.ConstantState constantState2 = (Drawable.ConstantState) r0.A02(obj);
        if (constantState2 != null && i != 0 && (newDrawable = constantState2.newDrawable(resources)) != null && newDrawable.getColorFilter() != null) {
            Drawable newDrawable2 = constantState2.newDrawable(resources);
            11T.A0A(newDrawable2);
            c03v.Ccj(obj);
            return newDrawable2;
        }
        Drawable A012 = A01(resources, drawable, i);
        C3m8 c3m82 = C1uu.A04;
        boolean z = A012 instanceof DrawableContainer;
        Drawable drawable3 = A012;
        if (z) {
            drawable3 = A012.getCurrent();
        }
        11T.A0D(drawable3);
        Drawable drawable4 = A012;
        if (z) {
            drawable4 = A012.getCurrent();
        }
        11T.A0D(drawable4);
        c3m82.A5k(drawable3, drawable4);
        Drawable.ConstantState constantState3 = A012.getConstantState();
        11T.A0D(constantState3);
        r0.A04(obj, constantState3);
        return A012;
    }
}
