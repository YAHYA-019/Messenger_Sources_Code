package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.model.messages.Message;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.List;

/* renamed from: X.5x9, reason: invalid class name */
/* loaded from: 5x9.class */
public final class C5x9 {
    public static final Function A0A = new D2i(24);
    public 1BY A00;
    public final C00i A01 = new 1BQ(49420);
    public final C00i A02 = new 1BQ(50214);
    public final C00i A06 = new 1BQ(67918);
    public final C00i A04 = new 1BQ(32769);
    public final C00i A07 = new 1BV((1BY) null, 84849);
    public final C5xA A09 = (C5xA) 1Bn.A0E((Context) null, (1BY) null, 49873);
    public final C00i A05 = new 1BQ(85048);
    public final C00i A03 = new 1BQ(66265);
    public final C15h A08 = new AHg(1Bn.A0E((Context) null, (1BY) null, 83719), this, 4);

    public C5x9(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static String A00(Message message) {
        2JX A00 = 62Z.A00(message);
        if (A00 == null) {
            return null;
        }
        String A0t = A00.A0t(GraphQLStringDefUtil.A00(), 1BJ.A00(66), -2114235146);
        if (A0t == null) {
            A0t = "null";
        }
        return 0Pz.A0W(A0t, A00.A0r(1383272919));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v131 ??, still in use, count: 2, list:
          (r312v131 ??) from 0x04c3: PHI (r312v130 ??) = (r312v129 ??), (r312v131 ??) binds: [B:224:0x04af, B:227:0x04be] A[DONT_GENERATE, DONT_INLINE]
          (r312v131 ?? I:java.util.List) from 0x04c0: IPUT (r312v131 ?? I:java.util.List), (r0v1783 ?? I:X.60R) A[Catch: all -> 0x1f4c] X.60R.A02 java.util.List
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
    public static java.util.ArrayList A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v131 ??, still in use, count: 2, list:
          (r312v131 ??) from 0x04c3: PHI (r312v130 ??) = (r312v129 ??), (r312v131 ??) binds: [B:224:0x04af, B:227:0x04be] A[DONT_GENERATE, DONT_INLINE]
          (r312v131 ?? I:java.util.List) from 0x04c0: IPUT (r312v131 ?? I:java.util.List), (r0v1783 ?? I:X.60R) A[Catch: all -> 0x1f4c] X.60R.A02 java.util.List
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

    public static void A02(FbUserSession fbUserSession, C5x9 c5x9, AnonymousClass624 anonymousClass624, ImmutableList immutableList, String str, List list, List list2, List list3, int i, int i2, boolean z) {
        ArrayDeque clone;
        Function function = C6ma.A01;
        String obj = 1JW.A04(function, list).toString();
        String obj2 = 1JW.A04(function, list2).toString();
        Function function2 = A0A;
        List A04 = 1JW.A04(function2, immutableList);
        List list4 = null;
        Object apply = anonymousClass624 != null ? function2.apply(anonymousClass624) : null;
        if (list3 != null) {
            list4 = 1JW.A04(function2, list3);
        }
        C6ma c6ma = (C6ma) 1Lo.A04((Context) null, fbUserSession, c5x9.A00, 50136);
        synchronized (c6ma) {
            clone = c6ma.A00.clone();
        }
        Object[] objArr = {str, obj, obj2, A04, Integer.valueOf(i), Integer.valueOf(i2), apply, list4, clone.toString()};
        if (z) {
            0fH.A18("RowMessageItemGenerator", "%s\nmessages: %s\nlastRenderedMessages: %s\npreviousRowItems: %s\nmessageOverlapIndices: [%s, %s]\nnewestUnchangedRowItem: %s\npendingRowItems: %s\nhistory: %s", objArr);
        } else {
            0fH.A17("RowMessageItemGenerator", "%s\nmessages: %s\nlastRenderedMessages: %s\npreviousRowItems: %s\nmessageOverlapIndices: [%s, %s]\nnewestUnchangedRowItem: %s\npendingRowItems: %s\nhistory: %s", objArr);
        }
    }

    public static void A03(Object obj, AbstractCollection abstractCollection, boolean z) {
        abstractCollection.add(new C8vV(obj.hashCode(), z));
    }

    public void A04() {
        C5xA c5xA = this.A09;
        if (c5xA.A02.AZr(1GD.A07, 2342159779495356909L)) {
            ((5xD) 1Lo.A04((Context) null, ((1Fv) 1Bi.A03(66351)).A04(), c5xA.A00, 67054)).A00.evictAll();
        }
    }
}
