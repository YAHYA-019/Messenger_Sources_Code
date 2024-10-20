package X;

import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.ipc.media.MediaItem;

/* loaded from: I3i.class */
public final class I3i {
    public static final String[] A05 = {"mediaprovider_uri"};
    public final 1BP A04 = FbInjector.A00;
    public final 1Br A01 = 1Bu.A00(116318);
    public final 1Br A02 = 1Bq.A00(116317);
    public final 1Br A03 = 1Bu.A00(116321);
    public final 1Br A00 = 7zM.A0N();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v1 ??, still in use, count: 3, list:
          (r318v1 ??) from 0x05ee: PHI (r318v3 ??) = (r318v2 ??), (r318v1 ??) binds: [B:226:0x05ec, B:167:0x05dd] A[DONT_GENERATE, DONT_INLINE]
          (r318v1 ?? I:android.media.MediaMetadataRetriever) from 0x05df: INVOKE (r318v1 ?? I:android.media.MediaMetadataRetriever), (r0v132 ?? I:java.lang.String) VIRTUAL call: android.media.MediaMetadataRetriever.setDataSource(java.lang.String):void A[Catch: RuntimeException -> 0x05e5, all -> 0x0712, MD:(java.lang.String):void throws java.lang.IllegalArgumentException (c)]
          (r318v1 ?? I:android.media.MediaMetadataRetriever) from 0x05e8: INVOKE (r318v1 ?? I:android.media.MediaMetadataRetriever) VIRTUAL call: android.media.MediaMetadataRetriever.release():void A[Catch: all -> 0x0712, Exception -> 0x0763, MD:():void throws java.io.IOException (c)]
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
    public final com.facebook.ipc.media.MediaItem A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v1 ??, still in use, count: 3, list:
          (r318v1 ??) from 0x05ee: PHI (r318v3 ??) = (r318v2 ??), (r318v1 ??) binds: [B:226:0x05ec, B:167:0x05dd] A[DONT_GENERATE, DONT_INLINE]
          (r318v1 ?? I:android.media.MediaMetadataRetriever) from 0x05df: INVOKE (r318v1 ?? I:android.media.MediaMetadataRetriever), (r0v132 ?? I:java.lang.String) VIRTUAL call: android.media.MediaMetadataRetriever.setDataSource(java.lang.String):void A[Catch: RuntimeException -> 0x05e5, all -> 0x0712, MD:(java.lang.String):void throws java.lang.IllegalArgumentException (c)]
          (r318v1 ?? I:android.media.MediaMetadataRetriever) from 0x05e8: INVOKE (r318v1 ?? I:android.media.MediaMetadataRetriever) VIRTUAL call: android.media.MediaMetadataRetriever.release():void A[Catch: all -> 0x0712, Exception -> 0x0763, MD:():void throws java.io.IOException (c)]
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

    public final MediaItem A01(Uri uri, Integer num, Integer num2) {
        return A00(uri, null, num, num2, null, null, null, true);
    }
}
