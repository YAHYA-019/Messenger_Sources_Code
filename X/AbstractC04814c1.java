package X;

import android.graphics.Bitmap;
import java.util.HashMap;

/* renamed from: X.4c1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4c1.class */
public abstract class AbstractC04814c1 extends AbstractC04664bm {
    public int A00;
    public boolean A01;
    public final C2r9 A02;
    public final C04844c4 A03;
    public final InterfaceC04374as A04;
    public final 2IU A05;
    public final /* synthetic */ C04244af A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC04814c1(InterfaceC04444az interfaceC04444az, final C04244af c04244af, InterfaceC04374as interfaceC04374as, final boolean z) {
        super(interfaceC04444az);
        this.A06 = c04244af;
        this.A04 = interfaceC04374as;
        C04364ar c04364ar = (C04364ar) interfaceC04374as;
        this.A05 = c04364ar.A05;
        C2r9 c2r9 = c04364ar.A07.A07;
        11T.A0A(c2r9);
        this.A02 = c2r9;
        this.A03 = new C04844c4(new InterfaceC04834c3() { // from class: X.4c2
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 4, list:
                  (r313v3 ??) from 0x0461: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v4 ??) binds: [B:292:0x045c, B:285:0x0455, B:89:0x0422] A[DONT_GENERATE, DONT_INLINE]
                  (r313v3 ?? I:X.4hw) from 0x044a: IPUT (r1v51 ?? I:int), (r313v3 ?? I:X.4hw) A[Catch: all -> 0x084e] X.4hw.A00 int
                  (r313v3 ?? I:X.4hw) from 0x0450: IPUT (r1v52 ?? I:boolean), (r313v3 ?? I:X.4hw) A[Catch: all -> 0x084e] X.4hw.A02 boolean
                  (r313v3 ?? I:X.4hw) from 0x0456: IPUT (r1v53 ?? I:boolean), (r313v3 ?? I:X.4hw) A[Catch: all -> 0x084e] X.4hw.A01 boolean
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
            @Override // X.InterfaceC04834c3
            public final void Cip(
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 4, list:
                  (r313v3 ??) from 0x0461: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v4 ??) binds: [B:292:0x045c, B:285:0x0455, B:89:0x0422] A[DONT_GENERATE, DONT_INLINE]
                  (r313v3 ?? I:X.4hw) from 0x044a: IPUT (r1v51 ?? I:int), (r313v3 ?? I:X.4hw) A[Catch: all -> 0x084e] X.4hw.A00 int
                  (r313v3 ?? I:X.4hw) from 0x0450: IPUT (r1v52 ?? I:boolean), (r313v3 ?? I:X.4hw) A[Catch: all -> 0x084e] X.4hw.A02 boolean
                  (r313v3 ?? I:X.4hw) from 0x0456: IPUT (r1v53 ?? I:boolean), (r313v3 ?? I:X.4hw) A[Catch: all -> 0x084e] X.4hw.A01 boolean
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
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:819)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:777)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:487)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
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
        }, c04244af.A05, c2r9.A01);
        interfaceC04374as.A5P(new 4bA() { // from class: X.4c8
            public void A01() {
                AbstractC04814c1 abstractC04814c1 = AbstractC04814c1.this;
                if (abstractC04814c1.A04.BTd()) {
                    abstractC04814c1.A03.A03();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.HashMap, X.4ck] */
    public static final C05004ck A00(2Ea r301, InterfaceC06794hx interfaceC06794hx, AbstractC04814c1 abstractC04814c1, String str, String str2, String str3, String str4, long j, boolean z) {
        HashMap hashMap;
        java.util.Map AlR;
        Object obj;
        String str5 = null;
        if (!abstractC04814c1.A05.ChL(abstractC04814c1.A04, "DecodeProducer")) {
            return null;
        }
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(((C06784hw) interfaceC06794hx).A02);
        String valueOf3 = String.valueOf(z);
        if (r301 != null && (AlR = r301.AlR()) != null && (obj = AlR.get("non_fatal_decode_error")) != null) {
            str5 = obj.toString();
        }
        if (r301 instanceof 2EY) {
            Bitmap bitmap = ((2EY) r301).A04;
            11T.A0A(bitmap);
            String A0A = 0Pz.A0A('x', bitmap.getWidth(), bitmap.getHeight());
            hashMap = new HashMap(8);
            hashMap.put("bitmapSize", A0A);
            hashMap.put("queueTime", valueOf);
            hashMap.put("hasGoodQuality", valueOf2);
            hashMap.put("isFinal", valueOf3);
            hashMap.put("encodedImageSize", str2);
            hashMap.put("imageFormat", str);
            hashMap.put("requestedImageSize", str3);
            hashMap.put("sampleSize", str4);
            hashMap.put("byteCount", 0Pz.A0D(bitmap.getByteCount(), ""));
        } else {
            hashMap = new HashMap(7);
            hashMap.put("queueTime", valueOf);
            hashMap.put("hasGoodQuality", valueOf2);
            hashMap.put("isFinal", valueOf3);
            hashMap.put("encodedImageSize", str2);
            hashMap.put("imageFormat", str);
            hashMap.put("requestedImageSize", str3);
            hashMap.put("sampleSize", str4);
        }
        if (str5 != null) {
            hashMap.put("non_fatal_decode_error", str5);
        }
        return new HashMap(hashMap);
    }

    public static final void A01(AbstractC04814c1 abstractC04814c1, boolean z) {
        synchronized (abstractC04814c1) {
            if (z) {
                if (!abstractC04814c1.A01) {
                    ((AbstractC04664bm) abstractC04814c1).A00.CEP(1.0f);
                    abstractC04814c1.A01 = true;
                    abstractC04814c1.A03.A02();
                }
            }
        }
    }

    @Override // X.AbstractC04664bm, X.AbstractC04434ay
    public void A04(float f) {
        super.A04(f * 0.99f);
    }

    public boolean A07(2Ds r302, int i) {
        boolean A04;
        if (this instanceof C04804c0) {
            C04804c0 c04804c0 = (C04804c0) this;
            synchronized (this) {
                if (r302 != null) {
                    A04 = c04804c0.A03.A04(r302, i);
                    if (((i & 1) != 1 || (i & 8) == 8) && (i & 4) != 4 && r302.A09()) {
                        2Ds.A03(r302);
                        if (r302.A07 == AbstractC05294de.A05) {
                            C04784by c04784by = c04804c0.A01;
                            if (c04784by.A01(r302)) {
                                int i2 = c04784by.A01;
                                int i3 = ((AbstractC04814c1) c04804c0).A00;
                                if (i2 > i3 && (i2 >= c04804c0.A00.AzE(i3) || c04784by.A06)) {
                                    ((AbstractC04814c1) c04804c0).A00 = i2;
                                }
                            }
                        }
                    }
                }
                return false;
            }
        }
        synchronized (this) {
            A04 = (i & 1) == 1 ? this.A03.A04(r302, i) : false;
        }
        return A04;
    }
}
