package com.facebook.auth.login.ui;

import X.0fH;
import X.AnonymousClass001;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: LoginErrorData.class */
public final class LoginErrorData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(27);
    public long A00;
    public AccountCandidateModel A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.auth.login.ui.LoginErrorData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.auth.login.ui.LoginErrorData, java.lang.Object] */
    public static LoginErrorData A00(String str) {
        if (str == null) {
            0fH.A0B(LoginErrorData.class, "Null CAA TwoFac error response");
            return new Object();
        }
        try {
            return A01(A02(str).getJSONObject("error_data").toString());
        } catch (JSONException e) {
            0fH.A0H(LoginErrorData.class, "JSON Exception", e);
            return new Object();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v2 ??, still in use, count: 2, list:
          (r311v2 ??) from 0x0276: PHI (r311v1 ??) = (r311v0 ??), (r311v2 ??) binds: [B:90:0x01b8, B:132:0x0271] A[DONT_GENERATE, DONT_INLINE]
          (r311v2 ?? I:com.facebook.account.recovery.common.model.AccountCandidateContactPointList) from 0x0273: IPUT (r0v127 ?? I:java.util.List), (r311v2 ?? I:com.facebook.account.recovery.common.model.AccountCandidateContactPointList) A[Catch: JSONException -> 0x02a1] com.facebook.account.recovery.common.model.AccountCandidateContactPointList.candidateContactPoints java.util.List
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
    public static com.facebook.auth.login.ui.LoginErrorData A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v2 ??, still in use, count: 2, list:
          (r311v2 ??) from 0x0276: PHI (r311v1 ??) = (r311v0 ??), (r311v2 ??) binds: [B:90:0x01b8, B:132:0x0271] A[DONT_GENERATE, DONT_INLINE]
          (r311v2 ?? I:com.facebook.account.recovery.common.model.AccountCandidateContactPointList) from 0x0273: IPUT (r0v127 ?? I:java.util.List), (r311v2 ?? I:com.facebook.account.recovery.common.model.AccountCandidateContactPointList) A[Catch: JSONException -> 0x02a1] com.facebook.account.recovery.common.model.AccountCandidateContactPointList.candidateContactPoints java.util.List
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

    public static JSONObject A02(String str) {
        try {
            return new JSONObject(new JSONObject(str).getString("error"));
        } catch (JSONException e) {
            0fH.A0H(LoginErrorData.class, "JSON Exception", e);
            return AnonymousClass001.A12();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
    }
}
