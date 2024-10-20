package X;

import android.os.SystemClock;
import android.util.Base64;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.spherical.photo.metadata.parser.NativeSphericalProcessing;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.zip.GZIPInputStream;

/* loaded from: I1t.class */
public final class I1t {
    public static int A02;
    public NativeSphericalProcessing A00;
    public final C00i A01 = 1BQ.A02(116317);

    private NativeSphericalProcessing A00() {
        NativeSphericalProcessing nativeSphericalProcessing = this.A00;
        if (nativeSphericalProcessing == null) {
            Hn5 hn5 = (Hn5) this.A01.get();
            float uptimeMillis = (float) SystemClock.uptimeMillis();
            String str = Hn5.A01;
            if (str == "" || uptimeMillis - Hn5.A02 > 1800000.0f) {
                Hn5.A02 = (float) SystemClock.uptimeMillis();
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(1BK.A0N(hn5.A00).BCy(36873325028376610L), 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    StringWriter stringWriter = new StringWriter();
                    InputStreamReader inputStreamReader = new InputStreamReader(gZIPInputStream);
                    char[] cArr = new char[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        float f = 0.0f / 0.0f;
                        if (read == -1) {
                            break;
                        }
                        stringWriter.write(cArr, 0, read);
                    }
                    str = stringWriter.toString();
                    stringWriter.close();
                    inputStreamReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                } catch (Exception unused) {
                    str = "";
                }
                Hn5.A01 = str;
            }
            nativeSphericalProcessing = new NativeSphericalProcessing(str);
            this.A00 = nativeSphericalProcessing;
        }
        return nativeSphericalProcessing;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v3 ??, still in use, count: 13, list:
          (r316v3 ??) from 0x032c: PHI (r316v2 ??) = (r316v1 ??), (r316v3 ??) binds: [B:233:0x0329, B:215:0x0322] A[DONT_GENERATE, DONT_INLINE]
          (r316v3 ?? I:java.io.InputStream) from 0x0105: INVOKE (r0v197 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0118: INVOKE (r0v201 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0134: INVOKE (r0v207 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x014f: INVOKE (r0v213 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0177: INVOKE (r0v221 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x017e: INVOKE (r0v223 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x01ef: INVOKE (r316v3 ?? I:java.io.InputStream), (r0v246 ?? I:long) VIRTUAL call: java.io.InputStream.skip(long):long A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:(long):long throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x01d0: INVOKE (r316v3 ?? I:java.io.InputStream), (r0v237 ?? I:byte[]), (r2v10 ?? I:int), (r0v235 ?? I:int) VIRTUAL call: java.io.InputStream.read(byte[], int, int):int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:(byte[], int, int):int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x01f8: INVOKE (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: FileNotFoundException -> 0x0322, all -> 0x04b8, IOException -> 0x04de, MD:():void throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0312: INVOKE (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: IOException -> 0x0356, MD:():void throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0213: INVOKE (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: FileNotFoundException -> 0x0322, all -> 0x04b8, IOException -> 0x04da, MD:():void throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x031c: INVOKE (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: FileNotFoundException -> 0x0322, all -> 0x04b8, IOException -> 0x04e6, MD:():void throws java.io.IOException (c)]
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
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x04ba: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:239:0x04ba */
    public com.facebook.spherical.photo.metadata.SphericalPhotoData A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v3 ??, still in use, count: 13, list:
          (r316v3 ??) from 0x032c: PHI (r316v2 ??) = (r316v1 ??), (r316v3 ??) binds: [B:233:0x0329, B:215:0x0322] A[DONT_GENERATE, DONT_INLINE]
          (r316v3 ?? I:java.io.InputStream) from 0x0105: INVOKE (r0v197 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0118: INVOKE (r0v201 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0134: INVOKE (r0v207 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x014f: INVOKE (r0v213 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0177: INVOKE (r0v221 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x017e: INVOKE (r0v223 ?? I:int) = (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.read():int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:():int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x01ef: INVOKE (r316v3 ?? I:java.io.InputStream), (r0v246 ?? I:long) VIRTUAL call: java.io.InputStream.skip(long):long A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:(long):long throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x01d0: INVOKE (r316v3 ?? I:java.io.InputStream), (r0v237 ?? I:byte[]), (r2v10 ?? I:int), (r0v235 ?? I:int) VIRTUAL call: java.io.InputStream.read(byte[], int, int):int A[Catch: IOException -> 0x01fe, all -> 0x0318, MD:(byte[], int, int):int throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x01f8: INVOKE (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: FileNotFoundException -> 0x0322, all -> 0x04b8, IOException -> 0x04de, MD:():void throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0312: INVOKE (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: IOException -> 0x0356, MD:():void throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x0213: INVOKE (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: FileNotFoundException -> 0x0322, all -> 0x04b8, IOException -> 0x04da, MD:():void throws java.io.IOException (c)]
          (r316v3 ?? I:java.io.InputStream) from 0x031c: INVOKE (r316v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: FileNotFoundException -> 0x0322, all -> 0x04b8, IOException -> 0x04e6, MD:():void throws java.io.IOException (c)]
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
