package com.facebook.bugreporter.core;

import X.11T;
import X.1BK;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1CO;
import X.1G0;
import X.1G2;
import X.1G3;
import X.1Ql;
import X.4YU;
import X.7zP;
import X.AbJ;
import X.AnonymousClass001;
import X.C00i;
import X.C4V4;
import X.ENN;
import X.Ekp;
import X.FAc;
import X.FEF;
import X.FFl;
import X.FH6;
import X.FIY;
import X.FcI;
import com.facebook.bugreporter.core.model.BugReport;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: BugReportRetryManager.class */
public final class BugReportRetryManager {
    public static final 1G2 A0A;
    public static final 1G2 A0B;
    public static final 1G2 A0C;
    public final Ekp A00;
    public final FFl A01;
    public final FH6 A02;
    public final FAc A03;
    public final C00i A04;
    public final 1CO A05;
    public final FbSharedPreferences A06;
    public final FcI A07;
    public final FEF A08;
    public final C4V4 A09;

    static {
        String name = BugReportRetryManager.class.getName();
        1G2 r0 = 1G0.A03;
        A0C = 1G3.A01(r0.A0D(name), "reports");
        A0A = 1G3.A01(r0.A0D(name), "attachments");
        A0B = 1G3.A01(r0.A0D(name), "attachment_meta");
    }

    public BugReportRetryManager() {
        FFl fFl = (FFl) 1Bi.A03(100306);
        FcI fcI = (FcI) 1Bi.A03(100314);
        Ekp ekp = (Ekp) 1Bi.A03(100317);
        FH6 fh6 = (FH6) 1Bn.A0A(100320);
        FbSharedPreferences A0i = AbJ.A0i();
        C4V4 c4v4 = (C4V4) 1Bi.A03(114712);
        1CO A0e = AbJ.A0e();
        FEF fef = (FEF) 1Bn.A0A(100319);
        FAc fAc = (FAc) 1Bi.A03(114693);
        this.A01 = fFl;
        this.A07 = fcI;
        this.A00 = ekp;
        this.A02 = fh6;
        this.A06 = A0i;
        this.A09 = c4v4;
        this.A05 = A0e;
        this.A08 = fef;
        this.A03 = fAc;
        this.A04 = 1BQ.A02(100329);
    }

    public static long A00(ByteBuffer byteBuffer, int i, int i2) {
        int A00 = FIY.A00(byteBuffer, i, i2);
        if (A00 != 0) {
            return byteBuffer.getLong(A00);
        }
        return 0L;
    }

    public static void A01(BugReportRetryManager bugReportRetryManager, BugReport bugReport, long j) {
        int length;
        FbSharedPreferences fbSharedPreferences = bugReportRetryManager.A06;
        1Ql edit = fbSharedPreferences.edit();
        1G2 r0 = A0C;
        edit.CaL(1G3.A01(r0, String.valueOf(bugReport.A06)), bugReport.A09.getPath());
        edit.commit();
        bugReportRetryManager.A09.A00(j, bugReport.A05);
        boolean AZk = bugReportRetryManager.A05.AZk(36310624188236331L);
        TreeMap Ak5 = fbSharedPreferences.Ak5(r0);
        int size = Ak5.size();
        if (AZk) {
            if (size > 20) {
                while (Ak5.size() > 20) {
                    Map.Entry A0z = AnonymousClass001.A0z(AnonymousClass001.A0x(Ak5));
                    long parseLong = Long.parseLong(((1G3) A0z.getKey()).A09(r0));
                    long lastModified = AnonymousClass001.A0E(1BK.A16(A0z)).lastModified();
                    Iterator A0x = AnonymousClass001.A0x(Ak5);
                    while (A0x.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass001.A0z(A0x);
                        long parseLong2 = Long.parseLong(((1G3) A0z2.getKey()).A09(r0));
                        long lastModified2 = AnonymousClass001.A0E(1BK.A16(A0z2)).lastModified();
                        if (lastModified > lastModified2) {
                            A0z = A0z2;
                            parseLong = parseLong2;
                            lastModified = lastModified2;
                        }
                    }
                    A02(bugReportRetryManager, A0z, parseLong);
                    1Ql edit2 = fbSharedPreferences.edit();
                    edit2.Cdj((1G2) A0z.getKey());
                    edit2.commit();
                    Ak5 = fbSharedPreferences.Ak5(r0);
                }
            }
        } else if (size > 20) {
            while (Ak5.size() > 20) {
                Map.Entry A0z3 = AnonymousClass001.A0z(AnonymousClass001.A0x(Ak5));
                long parseLong3 = Long.parseLong(((1G3) A0z3.getKey()).A09(r0));
                Iterator A0x2 = AnonymousClass001.A0x(Ak5);
                while (A0x2.hasNext()) {
                    Map.Entry A0z4 = AnonymousClass001.A0z(A0x2);
                    long parseLong4 = Long.parseLong(((1G3) A0z4.getKey()).A09(r0));
                    if (parseLong3 > parseLong4) {
                        A0z3 = A0z4;
                        parseLong3 = parseLong4;
                    }
                }
                A02(bugReportRetryManager, A0z3, parseLong3);
                1Ql edit3 = fbSharedPreferences.edit();
                edit3.Cdj((1G2) A0z3.getKey());
                edit3.commit();
                Ak5 = fbSharedPreferences.Ak5(r0);
            }
        }
        TreeMap Ak52 = fbSharedPreferences.Ak5(r0);
        FFl fFl = bugReportRetryManager.A01;
        File[] listFiles = FFl.A00(fFl).listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            return;
        }
        int i = 0;
        do {
            File file = listFiles[i];
            1G3 A0D = r0.A0D(file.getName());
            if (!Ak52.containsKey(A0D)) {
                fFl.A04(file);
                FAc fAc = bugReportRetryManager.A03;
                String A09 = A0D.A09(r0);
                11T.A0F(A09, 0);
                4YU.A1P(7zP.A0e(fAc.A00).markEventBuilder(30539800, "clean_up_untracked_files"), "bug_report_id", A09);
                bugReportRetryManager.A02.A03(ENN.A0I);
            }
            i++;
        } while (i < length);
    }

    public static void A02(BugReportRetryManager bugReportRetryManager, Map.Entry entry, long j) {
        FH6 fh6 = bugReportRetryManager.A02;
        ENN enn = ENN.A0D;
        FH6.A01(enn, fh6, (Map) null);
        FH6.A00(enn, fh6);
        FFl fFl = bugReportRetryManager.A01;
        fFl.A04(new File((String) entry.getValue()));
        FAc.A00(bugReportRetryManager.A03).markEventBuilder(30539800, "exceeded_queue_size").annotate("bug_report_id", j).report();
        File A02 = fFl.A02(j);
        if (A02 != null) {
            fFl.A04(A02);
        }
    }

    private void A03(1G2 r302, 1G2 r303, File file) {
        String[] list;
        File parentFile = file.getParentFile();
        file.delete();
        if (parentFile != null && (list = parentFile.list()) != null && list.length == 0) {
            parentFile.delete();
        }
        1Ql edit = this.A06.edit();
        edit.Cdj(r302);
        edit.CfI(r303);
        edit.commit();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r329v10 ??, still in use, count: 4, list:
          (r329v10 ??) from 0x05b4: PHI (r329v2 ??) = (r329v1 ??), (r329v10 ??) binds: [B:207:0x05b0, B:92:0x053b] A[DONT_GENERATE, DONT_INLINE]
          (r329v10 ?? I:java.io.File) from 0x0496: INVOKE (r0v538 ?? I:java.io.FileOutputStream), (r329v10 ?? I:java.io.File) DIRECT call: java.io.FileOutputStream.<init>(java.io.File):void A[Catch: all -> 0x0554, MD:(java.io.File):void throws java.io.FileNotFoundException (c)]
          (r329v10 ?? I:java.io.File) from 0x04ba: INVOKE (r0v549 ?? I:long) = (r329v10 ?? I:java.io.File) VIRTUAL call: java.io.File.length():long A[Catch: IOException -> 0x0565, MD:():long (c)]
          (r329v10 ?? I:java.io.File) from 0x052b: INVOKE (r0v579 ?? I:java.lang.String) = (r329v10 ?? I:java.io.File) VIRTUAL call: java.io.File.getName():java.lang.String A[Catch: IOException -> 0x0565, MD:():java.lang.String (c)]
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
    public static boolean A04(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r329v10 ??, still in use, count: 4, list:
          (r329v10 ??) from 0x05b4: PHI (r329v2 ??) = (r329v1 ??), (r329v10 ??) binds: [B:207:0x05b0, B:92:0x053b] A[DONT_GENERATE, DONT_INLINE]
          (r329v10 ?? I:java.io.File) from 0x0496: INVOKE (r0v538 ?? I:java.io.FileOutputStream), (r329v10 ?? I:java.io.File) DIRECT call: java.io.FileOutputStream.<init>(java.io.File):void A[Catch: all -> 0x0554, MD:(java.io.File):void throws java.io.FileNotFoundException (c)]
          (r329v10 ?? I:java.io.File) from 0x04ba: INVOKE (r0v549 ?? I:long) = (r329v10 ?? I:java.io.File) VIRTUAL call: java.io.File.length():long A[Catch: IOException -> 0x0565, MD:():long (c)]
          (r329v10 ?? I:java.io.File) from 0x052b: INVOKE (r0v579 ?? I:java.lang.String) = (r329v10 ?? I:java.io.File) VIRTUAL call: java.io.File.getName():java.lang.String A[Catch: IOException -> 0x0565, MD:():java.lang.String (c)]
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

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(8:3|(14:6|7|8|10|11|12|13|14|15|16|17|(5:19|20|21|22|23)(1:25)|24|4)|29|30|(2:31|(1:33)(1:34))|35|(2:38|36)|39)|40|(6:211|212|213|214|215|216)|42|(1:44)|45|(1:47)|48|(1:50)|51|(1:53)|54|(8:(2:56|(15:58|(1:209)(1:62)|63|64|65|66|67|68|69|70|71|72|73|74|(19:76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|(33:95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|(4:128|(3:130|(2:133|131)|134)|135|136)(2:138|(5:151|152|153|154|155)(4:142|(3:144|(2:147|145)|148)|149|150)))(32:159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|126|(0)(0)))(4:202|203|204|205)))|69|70|71|72|73|74|(0)(0))|210|63|64|65|66|67|68|(2:(0)|(1:195))) */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0901, code lost:
    
        r324 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0903, code lost:
    
        r328 = r333;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x06ce A[Catch: all -> 0x08e9, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x08e9, blocks: (B:70:0x06ab, B:71:0x06b2, B:73:0x06c0, B:76:0x06ce, B:77:0x06d5, B:78:0x06de, B:79:0x06e5, B:80:0x06ec, B:82:0x06f7, B:84:0x070b, B:85:0x0712, B:86:0x0719, B:87:0x0720, B:88:0x0727, B:90:0x072e, B:91:0x0733, B:166:0x0834, B:168:0x083d, B:169:0x0842, B:203:0x08df, B:205:0x08e8), top: B:69:0x06ab }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(com.facebook.bugreporter.core.BugReportRetryManager r301, com.facebook.bugreporter.core.model.BugReport r302, java.io.File r303) {
        /*
            Method dump skipped, instructions count: 3209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bugreporter.core.BugReportRetryManager.A05(com.facebook.bugreporter.core.BugReportRetryManager, com.facebook.bugreporter.core.model.BugReport, java.io.File):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r322v6 ??, still in use, count: 4, list:
          (r322v6 ??) from 0x0936: PHI (r322v2 ??) = (r322v0 ??), (r322v6 ??) binds: [B:490:0x0933, B:483:0x08ec] A[DONT_GENERATE, DONT_INLINE]
          (r322v6 ??) from 0x08fb: PHI (r322v4 ??) = (r322v1 ??), (r322v6 ??) binds: [B:488:0x08f8, B:479:0x08f1] A[DONT_GENERATE, DONT_INLINE]
          (r322v6 ??) from 0x096e: PHI (r322v5 ??) = (r322v3 ??), (r322v6 ??) binds: [B:482:0x096b, B:416:0x08c9] A[DONT_GENERATE, DONT_INLINE]
          (r322v6 ?? I:java.io.InputStream) from 0x010f: INVOKE (r322v6 ?? I:java.io.InputStream), (r0v141 ?? I:byte[]), (r2v12 ?? I:int), (r0v139 ?? I:int) VIRTUAL call: java.io.InputStream.read(byte[], int, int):int A[Catch: IOException -> 0x08ec, FileNotFoundException -> 0x08f1, MD:(byte[], int, int):int throws java.io.IOException (c)]
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
    public boolean A06() {
        /*
            Method dump skipped, instructions count: 2678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bugreporter.core.BugReportRetryManager.A06():boolean");
    }
}
