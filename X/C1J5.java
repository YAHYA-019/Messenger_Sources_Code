package X;

import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1J5, reason: invalid class name */
/* loaded from: 1J5.class */
public final class C1J5 implements 1J7, 1J9 {
    public Set A00;
    public JSONObject A01;
    public final C00i A02;
    public final C00i A03;

    public C1J5(C00i c00i, C00i c00i2) {
        this.A02 = c00i;
        this.A03 = c00i2;
    }

    public boolean AKv() {
        return ((2yD) this.A02.get()).AZk(2342156103003412125L);
    }

    public boolean ANN() {
        return ((2yD) this.A02.get()).AZk(36313093790635682L);
    }

    public boolean AP4() {
        return ((2yD) this.A02.get()).AZk(36313093790963367L);
    }

    public boolean APL() {
        return ((2yD) this.A02.get()).AZk(36313093790832293L);
    }

    public long Akf(String str) {
        String str2;
        JSONObject jSONObject;
        long j = -1;
        if (this.A01 == null) {
            try {
                synchronized (this) {
                    if (this.A01 == null) {
                        new JSONObject();
                        String BCz = ((1CO) this.A02.get()).BCz(36876043743986270L, "");
                        if (!BCz.equals("")) {
                            new JSONObject(BCz);
                        }
                        this.A01 = jSONObject;
                    }
                }
            } catch (JSONException e) {
                e = e;
                str2 = "Exception when de-serializing event latency overrides";
                0fH.A0u("AnalyticsExperimentConfigMobileConfig", str2, e);
                return j;
            }
        }
        try {
            if (this.A01.has(str)) {
                return (long) this.A01.getDouble(str);
            }
        } catch (JSONException e2) {
            e = e2;
            str2 = "Exception when getting value for event latency override";
            0fH.A0u("AnalyticsExperimentConfigMobileConfig", str2, e);
            return j;
        }
        return j;
    }

    public long ApB() {
        return ((2yD) this.A02.get()).Auy(36594568766228624L);
    }

    public long AtM() {
        return ((2yD) this.A02.get()).Auy(36594568766097550L);
    }

    public long AzR() {
        return ((2yD) this.A02.get()).Auy(36594568766163087L);
    }

    public long BOJ() {
        return ((2yD) this.A02.get()).Auy(36594568766359697L);
    }

    public boolean BQL() {
        return ((2yD) this.A02.get()).AZk(36313093790045856L);
    }

    public boolean BWH() {
        return ((2yD) this.A02.get()).AZk(36313093789914783L);
    }

    public int Bd6() {
        return (int) ((2yD) this.A02.get()).Auy(36594568766556306L);
    }

    public boolean BeZ() {
        return ((2yD) this.A03.get()).AZk(72340623795818415L);
    }

    public boolean BfX() {
        return ((2yD) this.A02.get()).AZk(36313093789783710L);
    }

    public boolean CYN() {
        return ((2yD) this.A02.get()).AZk(2342156103004591782L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v0 ??, still in use, count: 2, list:
          (r305v0 ??) from 0x0090: PHI (r305v2 ??) = (r305v1 ??), (r305v0 ??) binds: [B:39:0x008e, B:30:0x0090] A[DONT_GENERATE, DONT_INLINE]
          (r305v0 ?? I:java.util.AbstractCollection) from 0x006d: INVOKE (r305v0 ?? I:java.util.AbstractCollection), (r0v38 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: JSONException -> 0x007a, all -> 0x0099, MD:(E):boolean (c)]
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
    public boolean Cxy(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v0 ??, still in use, count: 2, list:
          (r305v0 ??) from 0x0090: PHI (r305v2 ??) = (r305v1 ??), (r305v0 ??) binds: [B:39:0x008e, B:30:0x0090] A[DONT_GENERATE, DONT_INLINE]
          (r305v0 ?? I:java.util.AbstractCollection) from 0x006d: INVOKE (r305v0 ?? I:java.util.AbstractCollection), (r0v38 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: JSONException -> 0x007a, all -> 0x0099, MD:(E):boolean (c)]
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

    public boolean D8V() {
        return ((2yD) this.A02.get()).AZk(36313093790111393L);
    }

    public boolean D8e() {
        return ((2yD) this.A02.get()).AZk(36313093790701219L);
    }

    public boolean D8h() {
        return ((2yD) this.A02.get()).AZk(36313093789259419L);
    }

    public boolean D8j() {
        return ((2yD) this.A02.get()).AZk(36313093789587100L);
    }
}
