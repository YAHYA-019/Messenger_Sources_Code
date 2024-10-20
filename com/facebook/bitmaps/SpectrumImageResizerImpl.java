package com.facebook.bitmaps;

import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.2yD;
import X.7zL;
import X.AbF;
import X.C00i;
import X.C1pq;
import X.Hd2;
import X.HsX;
import X.IMO;
import X.JJZ;
import X.JLx;
import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.media.upload.photo.model.UploadFile;
import com.facebook.photos.base.analytics.upload.images.ImageData;
import com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils;
import com.facebook.spectrum.image.ImageSize;
import com.facebook.spectrum.image.ImageSpecification;
import com.facebook.spectrum.requirements.ResizeRequirement;

/* loaded from: SpectrumImageResizerImpl.class */
public class SpectrumImageResizerImpl implements JJZ, CallerContextable {
    public ImageQualityUtils A00;
    public 1BY A01;
    public ImageQualityUtils A02;
    public ResizeRequirement.Mode A03;
    public final C00i A04;
    public final JLx A05 = (JLx) 1Bi.A03(116448);
    public final Context A06 = AbF.A04((1BY) null);
    public final C00i A07;
    public final C00i A08;

    public SpectrumImageResizerImpl(1BO r302) {
        1BQ A00 = 1BQ.A00();
        this.A08 = A00;
        this.A07 = 1BV.A01((1BY) null, 116436);
        this.A04 = 1BQ.A02(131334);
        this.A03 = ResizeRequirement.Mode.EXACT_OR_SMALLER;
        this.A01 = 7zL.A0Q(r302);
        if (((2yD) A00.get()).AZk(36325205597508020L)) {
            return;
        }
        this.A02 = new ImageQualityUtils();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.photos.base.analytics.upload.images.ImageData] */
    public static ImageData A00(ImageSpecification imageSpecification, Double d, long j) {
        ?? obj = new Object();
        if (imageSpecification != null) {
            ImageSize imageSize = imageSpecification.size;
            if (imageSize != null) {
                obj.width = imageSize.width;
                obj.height = imageSize.height;
            }
            obj.format = String.valueOf(imageSpecification.format);
        }
        if (d != null) {
            obj.msSsim = d;
        }
        obj.bytes = j;
        int i = -1;
        if (imageSpecification != null) {
            switch (imageSpecification.orientation) {
                case UP:
                case UP_MIRRORED:
                    i = 0;
                    break;
                case BOTTOM:
                case BOTTOM_MIRRORED:
                    i = 180;
                    break;
                case LEFT_MIRRORED:
                case LEFT:
                    i = 270;
                    break;
                case RIGHT:
                case RIGHT_MIRRORED:
                    i = 90;
                    break;
            }
        }
        obj.rotation = i;
        return obj;
    }

    public static boolean A01(Throwable th) {
        Throwable cause = th.getCause();
        if ((cause == null || !A01(cause)) && !(th instanceof OutOfMemoryError)) {
            String message = th.getMessage();
            if (message == null) {
                return false;
            }
            if (!message.matches(".*[mM]emory.*")) {
                return message.matches(".*bad_alloc.*");
            }
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r324v6 ??, still in use, count: 2, list:
          (r324v6 ??) from 0x0388: PHI (r324v3 ??) = (r324v2 ??), (r324v5 ??), (r324v6 ??) binds: [B:237:0x03bd, B:225:0x0374, B:228:0x0383] A[DONT_GENERATE, DONT_INLINE]
          (r324v6 ?? I:com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils) from 0x0385: IPUT 
          (r324v6 ?? I:com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils)
          (r301v0 'this' ?? I:com.facebook.bitmaps.SpectrumImageResizerImpl A[IMMUTABLE_TYPE, THIS])
         A[Catch: Exception | OutOfMemoryError -> 0x03cc, Exception -> 0x03d1] com.facebook.bitmaps.SpectrumImageResizerImpl.A00 com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils
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
    public X.Hd2 Cjb(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r324v6 ??, still in use, count: 2, list:
          (r324v6 ??) from 0x0388: PHI (r324v3 ??) = (r324v2 ??), (r324v5 ??), (r324v6 ??) binds: [B:237:0x03bd, B:225:0x0374, B:228:0x0383] A[DONT_GENERATE, DONT_INLINE]
          (r324v6 ?? I:com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils) from 0x0385: IPUT 
          (r324v6 ?? I:com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils)
          (r301v0 'this' ?? I:com.facebook.bitmaps.SpectrumImageResizerImpl A[IMMUTABLE_TYPE, THIS])
         A[Catch: Exception | OutOfMemoryError -> 0x03cc, Exception -> 0x03d1] com.facebook.bitmaps.SpectrumImageResizerImpl.A00 com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils
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

    public Hd2 Cjc(HsX hsX, String str, String str2) {
        C1pq.A08("canonicalPath", str);
        C1pq.A08("inputPath", str);
        return Cjb(hsX, new UploadFile(str, null, str, true, true, false), str2);
    }

    public void Cux(boolean z) {
        ((IMO) this.A07.get()).Cux(false);
        this.A03 = ResizeRequirement.Mode.EXACT;
    }
}
