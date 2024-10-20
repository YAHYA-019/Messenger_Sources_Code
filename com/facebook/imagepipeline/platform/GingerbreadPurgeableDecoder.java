package com.facebook.imagepipeline.platform;

import X.2EU;
import X.4dR;
import X.AbstractC05274dc;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.lang.reflect.Method;

/* loaded from: GingerbreadPurgeableDecoder.class */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public static Method A01;
    public final WebpBitmapFactoryImpl A00;

    public GingerbreadPurgeableDecoder() {
        WebpBitmapFactoryImpl webpBitmapFactoryImpl = null;
        if (!AbstractC05274dc.A00) {
            try {
                webpBitmapFactoryImpl = (WebpBitmapFactoryImpl) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
            } catch (Throwable unused) {
            }
            AbstractC05274dc.A00 = true;
        }
        this.A00 = webpBitmapFactoryImpl;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v4 ??, still in use, count: 3, list:
          (r312v4 ??) from 0x015c: PHI (r312v3 ??) = (r312v2 ??), (r312v4 ??) binds: [B:124:0x0156, B:110:0x014d] A[DONT_GENERATE, DONT_INLINE]
          (r312v4 ?? I:java.io.InputStream) from 0x0064: INVOKE (r312v4 ?? I:java.io.InputStream), (r0v37 ?? I:java.io.OutputStream) STATIC call: X.1MY.A00(java.io.InputStream, java.io.OutputStream):void A[Catch: all -> 0x014b]
          (r312v4 ?? I:java.io.InputStream) from 0x0085: INVOKE (r312v4 ?? I:java.io.InputStream) STATIC call: X.4sB.A01(java.io.InputStream):void A[Catch: IOException -> 0x0181, all -> 0x0190]
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
    private android.graphics.Bitmap A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v4 ??, still in use, count: 3, list:
          (r312v4 ??) from 0x015c: PHI (r312v3 ??) = (r312v2 ??), (r312v4 ??) binds: [B:124:0x0156, B:110:0x014d] A[DONT_GENERATE, DONT_INLINE]
          (r312v4 ?? I:java.io.InputStream) from 0x0064: INVOKE (r312v4 ?? I:java.io.InputStream), (r0v37 ?? I:java.io.OutputStream) STATIC call: X.1MY.A00(java.io.InputStream, java.io.OutputStream):void A[Catch: all -> 0x014b]
          (r312v4 ?? I:java.io.InputStream) from 0x0085: INVOKE (r312v4 ?? I:java.io.InputStream) STATIC call: X.4sB.A01(java.io.InputStream):void A[Catch: IOException -> 0x0181, all -> 0x0190]
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

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeByteArrayAsPurgeable(2EU r302, BitmapFactory.Options options) {
        return A01(options, r302, null, ((4dR) r302.A09()).size());
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeJPEGByteArrayAsPurgeable(2EU r302, int i, BitmapFactory.Options options) {
        4dR r0 = (4dR) r302.A09();
        return A01(options, r302, (i >= 2 && r0.read(i + (-2)) == -1 && r0.read(i - 1) == -39) ? null : DalvikPurgeableDecoder.EOI, i);
    }
}
