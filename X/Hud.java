package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: Hud.class */
public final class Hud {
    public MediaFormat A00;
    public String A01;
    public ByteBuffer[] A02;
    public ByteBuffer[] A03;
    public final long A04;
    public final MediaCodec A05;
    public final Surface A06;
    public final Integer A07;
    public final StringBuilder A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r304 == X.0S2.A01) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Hud(android.media.MediaCodec r302, android.view.Surface r303, java.lang.Integer r304, java.lang.String r305, long r306, boolean r308, boolean r309, boolean r310) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r303
            if (r0 == 0) goto L19
            java.lang.Integer r0 = X.0S2.A01
            r311 = r0
            r0 = 0
            r312 = r0
            r0 = 0
            r313 = r0
            r0 = r304
            r1 = r311
            if (r0 != r1) goto L1c
        L19:
            r0 = 1
            r312 = r0
        L1c:
            r0 = r312
            r1 = 0
            X.IFX.A07(r0, r1)
            r0 = r301
            r1 = r304
            r0.A07 = r1
            r0 = r301
            r1 = r302
            r0.A05 = r1
            r0 = r301
            r1 = r303
            r0.A06 = r1
            r0 = r301
            r1 = r308
            r0.A0A = r1
            r0 = r301
            r1 = r305
            r0.A01 = r1
            r0 = r301
            r1 = r309
            r0.A09 = r1
            r0 = r301
            r1 = r310
            r0.A0B = r1
            r0 = r301
            r1 = r306
            r0.A04 = r1
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r313 = r0
            r0 = r301
            r1 = r313
            r0.A08 = r1
            r0 = r313
            java.lang.String r1 = "MediaCodecWrapper "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r301
            int r0 = r0.hashCode()
            r314 = r0
            r0 = r313
            r1 = r314
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r313
            java.lang.String r1 = " ctor codec="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            int r0 = r0.hashCode()
            r314 = r0
            r0 = r313
            r1 = r314
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r313
            java.lang.String r1 = ","
            java.lang.StringBuilder r0 = r0.append(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hud.<init>(android.media.MediaCodec, android.view.Surface, java.lang.Integer, java.lang.String, long, boolean, boolean, boolean):void");
    }

    public IjV A00(long j) {
        IFX.A07(AnonymousClass001.A1U(this.A06), (String) null);
        MediaCodec mediaCodec = this.A05;
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j);
        if (dequeueInputBuffer >= 0) {
            return new IjV(dequeueInputBuffer, this.A09 ? mediaCodec.getInputBuffer(dequeueInputBuffer) : this.A02[dequeueInputBuffer], (MediaCodec.BufferInfo) null);
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v17 ??, still in use, count: 2, list:
          (r304v17 ??) from 0x00c9: PHI (r304v18 ??) = (r304v17 ??) binds: [B:51:0x00c4] A[DONT_GENERATE, DONT_INLINE]
          (r304v17 ?? I:X.IjV) from 0x00c6: IPUT (r0v60 ?? I:boolean), (r304v17 ?? I:X.IjV) A[Catch: all -> 0x015b] X.IjV.A01 boolean
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
    public X.IjV A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v17 ??, still in use, count: 2, list:
          (r304v17 ??) from 0x00c9: PHI (r304v18 ??) = (r304v17 ??) binds: [B:51:0x00c4] A[DONT_GENERATE, DONT_INLINE]
          (r304v17 ?? I:X.IjV) from 0x00c6: IPUT (r0v60 ?? I:boolean), (r304v17 ?? I:X.IjV) A[Catch: all -> 0x015b] X.IjV.A01 boolean
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

    public void A02() {
        StringBuilder sb = this.A08;
        sb.append("startB,");
        MediaCodec mediaCodec = this.A05;
        mediaCodec.start();
        if (this.A06 == null) {
            this.A02 = mediaCodec.getInputBuffers();
        }
        this.A03 = mediaCodec.getOutputBuffers();
        sb.append("startE,");
    }

    public void A03(IjV ijV) {
        MediaCodec mediaCodec = this.A05;
        int i = ijV.A02;
        MediaCodec.BufferInfo bufferInfo = ijV.A00;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public void A04(IjV ijV, boolean z) {
        HvA.A01("MediaCodecWrapper.releaseOutputBuffer");
        int i = ijV.A02;
        if (i >= 0) {
            this.A05.releaseOutputBuffer(i, z);
        }
        HvA.A00();
    }
}
