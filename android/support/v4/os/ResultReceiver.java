package android.support.v4.os;

import X.0FI;
import X.LGo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ResultReceiver.class */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(10);
    public IResultReceiver A00;

    /* loaded from: ResultReceiver$MyResultReceiver.class */
    public final class MyResultReceiver extends Binder implements IResultReceiver {
        public MyResultReceiver() {
            int A03 = 0FI.A03(44809228);
            attachInterface(this, IResultReceiver.A00);
            0FI.A09(-331523751, A03);
        }

        public MyResultReceiver() {
            this();
            0FI.A09(-2120535402, 0FI.A03(1724869948));
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(2117509100, 0FI.A03(897597318));
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = 0FI.A03(-250147080);
            String str = IResultReceiver.A00;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(str);
                    if (i == 1) {
                        parcel.readInt();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        if (parcel.readInt() != 0) {
                            creator.createFromParcel(parcel);
                        }
                        0FI.A09(-923662967, 0FI.A03(-2071555893));
                        i3 = 151958997;
                        0FI.A09(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(str);
                    i3 = 1297152264;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(-798119436, A03);
            return onTransact;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 2, list:
          (r304v3 ??) from 0x0019: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:6:0x0008, B:10:0x0015] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:android.support.v4.os.IResultReceiver) from 0x0016: IPUT 
          (r304v3 ?? I:android.support.v4.os.IResultReceiver)
          (r301v0 'this' ?? I:android.support.v4.os.ResultReceiver A[IMMUTABLE_TYPE, THIS])
         A[Catch: all -> 0x0021] android.support.v4.os.ResultReceiver.A00 android.support.v4.os.IResultReceiver
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
    @Override // android.os.Parcelable
    public void writeToParcel(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 2, list:
          (r304v3 ??) from 0x0019: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:6:0x0008, B:10:0x0015] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:android.support.v4.os.IResultReceiver) from 0x0016: IPUT 
          (r304v3 ?? I:android.support.v4.os.IResultReceiver)
          (r301v0 'this' ?? I:android.support.v4.os.ResultReceiver A[IMMUTABLE_TYPE, THIS])
         A[Catch: all -> 0x0021] android.support.v4.os.ResultReceiver.A00 android.support.v4.os.IResultReceiver
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
