package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.757, reason: invalid class name */
/* loaded from: 757.class */
public final class AnonymousClass757 implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final int A02;
    public final 5oY A03;
    public final 6wX A04;
    public final C6xN A05 = new C6xN();
    public final C6wv A06;
    public final boolean A07;

    public AnonymousClass757(AnonymousClass756 anonymousClass756) {
        C6wv c6wv = anonymousClass756.A03;
        c6wv.getClass();
        this.A06 = c6wv;
        this.A02 = anonymousClass756.A00;
        this.A03 = anonymousClass756.A01;
        this.A04 = anonymousClass756.A02;
        this.A07 = anonymousClass756.A05;
        this.A00 = anonymousClass756.A04;
    }

    private void A00() {
        if (this.A01) {
            return;
        }
        C6xN c6xN = this.A05;
        11T.A0F(c6xN, 2);
        c6xN.A00 = new 7GS();
        this.A01 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.common.collect.ImmutableMap, java.lang.Object, X.98g] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.7Ca, X.6Sh] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.7ty] */
    public static final boolean A01(C77n c77n, 6RU r302, 78X r303, boolean z) {
        11T.A0F(r302, 0);
        11T.A0F(r303, 3);
        if (!r303.A01) {
            return false;
        }
        78X AUk = c77n.AUk(null, 78X.class);
        ?? c7ty = AUk != null ? new C7ty(AUk) : new Object();
        c7ty.A01 = false;
        c77n.ClL(new 78X((C7ty) c7ty));
        C98g c98g = C98g.A05;
        ?? r0 = RegularImmutableMap.A03;
        11T.A0A((Object) r0);
        7FI.A02(r302, new 7C6((C98g) r0, (ImmutableMap) r0));
        boolean z2 = r303.A02;
        boolean z3 = z2;
        if (z2) {
            7FI.A02(r302, 7Aw.A02);
            ?? r02 = 7Ca.A02;
            7FI.A03(r302, (6Sh) r02, z ? 1 : 0);
            z3 = r02;
        }
        return z3;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7B5.class, C6zq.class, 7Ca.class, 98X.class, 7BI.class, 7Cb.class, 7C8.class, 7An.class, C6zp.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "SuggestedPlugin";
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public void BLY(
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
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00();
    }
}
