package com.google.firebase;

import X.05A;
import X.1cN;
import X.1cQ;
import X.1cY;
import X.C1bo;
import X.C1bq;
import X.C1bw;
import X.C1cb;
import X.C1cj;
import X.C1ck;
import X.C1cp;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: FirebaseCommonRegistrar.class */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static C1bo A00(final C1cp c1cp, final String str) {
        C1bq c1bq = new C1bq(C1cb.class, new Class[0]);
        c1bq.A01 = 1;
        c1bq.A01(new 1cN(Context.class, 1));
        c1bq.A02 = new C1bw(c1cp, str) { // from class: X.1cq
            public final C1cp A00;
            public final String A01;

            {
                this.A01 = str;
                this.A00 = c1cp;
            }

            @Override // X.C1bw
            public Object AIn(C1c5 c1c5) {
                return new 1cZ(this.A01, this.A00.ARe(c1c5.A02(Context.class)));
            }
        };
        return c1bq.A00();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C1bq c1bq = new C1bq(1cQ.class, new Class[0]);
        c1bq.A01(new 1cN(C1cb.class, 2));
        c1bq.A02 = new C1bw() { // from class: X.1ci
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v4 ??, still in use, count: 2, list:
                  (r305v4 ??) from 0x0033: PHI (r305v3 ??) = (r305v2 ??), (r305v4 ??) binds: [B:8:0x0021, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]
                  (r305v4 ?? I:X.1du) from 0x0030: SPUT (r305v4 ?? I:X.1du) A[Catch: all -> 0x0039] X.1du.A01 X.1du
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
            @Override // X.C1bw
            public java.lang.Object AIn(
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v4 ??, still in use, count: 2, list:
                  (r305v4 ??) from 0x0033: PHI (r305v3 ??) = (r305v2 ??), (r305v4 ??) binds: [B:8:0x0021, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]
                  (r305v4 ?? I:X.1du) from 0x0030: SPUT (r305v4 ?? I:X.1du) A[Catch: all -> 0x0039] X.1du.A01 X.1du
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
                	at jadx.core.codegen.InsnGen.staticField(InsnGen.java:225)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:492)
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
        };
        arrayList.add(c1bq.A00());
        C1bq c1bq2 = new C1bq(C1cj.class, new Class[0]);
        c1bq2.A01(new 1cN(Context.class, 1));
        c1bq2.A01(new 1cN(C1ck.class, 2));
        c1bq2.A02 = new C1bw() { // from class: X.1cl
            @Override // X.C1bw
            public Object AIn(C1c5 c1c5) {
                return new Object((Context) c1c5.A02(Context.class), c1c5.A03(C1ck.class)) { // from class: X.1cj
                    public static final ThreadFactory A03 = new ThreadFactory() { // from class: X.3j5
                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            return new Thread(runnable, "heartbeat-information-executor");
                        }
                    };
                    public C1bj A00;
                    public final Set A01;
                    public final Executor A02;

                    /* JADX WARN: Type inference failed for: r0v2, types: [X.1dD, java.lang.Object, X.1bj] */
                    {
                        3eA r0 = new 3eA(r302);
                        ?? obj = new Object();
                        ((1dD) obj).A01 = 1dD.A02;
                        ((1dD) obj).A00 = r0;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), A03);
                        this.A00 = obj;
                        this.A01 = r303;
                        this.A02 = threadPoolExecutor;
                    }
                };
            }
        };
        arrayList.add(c1bq2.A00());
        arrayList.add(1cY.A00("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(1cY.A00("fire-core", "19.5.0"));
        arrayList.add(1cY.A00("device-name", Build.PRODUCT.replace(' ', '_').replace('/', '_')));
        arrayList.add(1cY.A00("device-model", Build.DEVICE.replace(' ', '_').replace('/', '_')));
        arrayList.add(1cY.A00("device-brand", Build.BRAND.replace(' ', '_').replace('/', '_')));
        arrayList.add(A00(new C1cp() { // from class: X.1co
            @Override // X.C1cp
            public String ARe(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            }
        }, "android-target-sdk"));
        arrayList.add(A00(new C1cp() { // from class: X.1cr
            @Override // X.C1cp
            public String ARe(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
            }
        }, "android-min-sdk"));
        arrayList.add(A00(new C1cp() { // from class: X.1cu
            @Override // X.C1cp
            public String ARe(Object obj) {
                Context context = (Context) obj;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }, "android-platform"));
        arrayList.add(A00(new C1cp() { // from class: X.1cz
            @Override // X.C1cp
            public String ARe(Object obj) {
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? installerPackageName.replace(' ', '_').replace('/', '_') : "";
            }
        }, "android-installer"));
        try {
            str = 05A.A00.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(1cY.A00("kotlin", str));
        }
        return arrayList;
    }
}
