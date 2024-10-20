package X;

import com.facebook.java2js.JSContext;
import com.facebook.java2js.JSExecutionScope;
import com.facebook.java2js.JSValue;
import com.facebook.java2js.LocalJSRef;
import com.facebook.nativetemplates.fb.state.NTStateJSVM;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: E3u.class */
public final class E3u extends FIJ {
    public 1BY A00;
    public final FEb A01;
    public final GL7 A02;
    public final NTStateJSVM A03;

    public E3u(1BO r302, GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A01 = (FEb) 1Bi.A03(99549);
        this.A03 = (NTStateJSVM) 1Bi.A03(49433);
        this.A00 = 7zL.A0Q(r302);
        this.A02 = gl7;
    }

    public static LocalJSRef A00(JSExecutionScope jSExecutionScope, Object obj) {
        long doubleToLongBits;
        LocalJSRef localJSRef;
        if (obj == null) {
            doubleToLongBits = -4222124650659839L;
        } else {
            Class<?> cls = obj.getClass();
            if (cls.equals(Boolean.class)) {
                doubleToLongBits = AnonymousClass001.A1V(obj) ? -3940649673949183L : -3940649673949184L;
            } else if (cls.equals(Integer.class)) {
                doubleToLongBits = (AnonymousClass001.A03(obj) & LocalJSRef.INTEGER_MASK) | (-3659174697238528L);
            } else {
                if (!cls.equals(Double.class) && !cls.equals(Float.class) && !cls.equals(Long.class)) {
                    if (cls.equals(String.class)) {
                        return LocalJSRef.makeJavaScriptString(jSExecutionScope, (String) obj);
                    }
                    if (cls.isArray()) {
                        int length = Array.getLength(obj);
                        02W.A06(1BL.A1S(length), "Array size must be non-negative");
                        localJSRef = new LocalJSRef(LocalJSRef.createJavaScriptArray(jSExecutionScope.jsContext.mNativeCtx, length));
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= length) {
                                break;
                            }
                            LocalJSRef.setPropertyAtIndex(jSExecutionScope.jsContext.mNativeCtx, localJSRef.mEncoded, i2, A00(jSExecutionScope, Array.get(obj, i2)).mEncoded);
                            i = i2 + 1;
                        }
                    } else if (List.class.isAssignableFrom(cls)) {
                        List list = (List) obj;
                        int size = list.size();
                        02W.A06(1BL.A1S(size), "Array size must be non-negative");
                        localJSRef = new LocalJSRef(LocalJSRef.createJavaScriptArray(jSExecutionScope.jsContext.mNativeCtx, size));
                        Iterator it = list.iterator();
                        int i3 = 0;
                        while (true) {
                            int i4 = i3;
                            if (!it.hasNext()) {
                                break;
                            }
                            LocalJSRef.setPropertyAtIndex(jSExecutionScope.jsContext.mNativeCtx, localJSRef.mEncoded, i4, A00(jSExecutionScope, it.next()).mEncoded);
                            i3 = i4 + 1;
                        }
                    } else {
                        if (!java.util.Map.class.isAssignableFrom(cls)) {
                            return cls == JSValue.class ? ((JSValue) obj).toLocalRef(jSExecutionScope) : LocalJSRef.wrapJavaObject(jSExecutionScope, obj);
                        }
                        localJSRef = new LocalJSRef(LocalJSRef.createJavaScriptObject(jSExecutionScope.jsContext.mNativeCtx));
                        Iterator A0y = AnonymousClass001.A0y((java.util.Map) obj);
                        while (A0y.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0y);
                            Object key = A0z.getKey();
                            LocalJSRef A00 = A00(jSExecutionScope, A0z.getValue());
                            if (key instanceof Integer) {
                                LocalJSRef.setPropertyAtIndex(jSExecutionScope.jsContext.mNativeCtx, localJSRef.mEncoded, AnonymousClass001.A03(key), A00.mEncoded);
                            } else {
                                if (!(key instanceof String)) {
                                    throw 0Pz.A08("Invalid key of type ", key.getClass().toString());
                                }
                                localJSRef.setPropertyByName(jSExecutionScope, LocalJSRef.makeJavaScriptString(jSExecutionScope, (String) key), A00);
                            }
                        }
                    }
                    return localJSRef;
                }
                double A002 = DKC.A00(obj);
                doubleToLongBits = Double.isNaN(A002) ? 9218868437227405313L : Double.doubleToLongBits(A002);
            }
        }
        localJSRef = new LocalJSRef(doubleToLongBits);
        return localJSRef;
    }

    public static ImmutableList A01(GL7 gl7, int i) {
        Object BI5 = gl7.BI5(i);
        if (BI5 instanceof GLp) {
            return ((GLp) BI5).A0c(1021740611, 2JX.class, 1589723014);
        }
        if (BI5 != null) {
            return (ImmutableList) BI5;
        }
        return null;
    }

    public static void A02(JSContext jSContext, ImmutableList immutableList) {
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                String A0r = 7zL.A0P(it).A0r(3401);
                if (A0r != null && A0r.length() != 0) {
                    jSContext.evaluateSourceCode(A0r.getBytes(), "NTStateUtil");
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v7 ??, still in use, count: 2, list:
          (r316v7 ??) from 0x0412: PHI (r316v6 ??) = (r316v5 ??), (r316v7 ??) binds: [B:161:0x03d1, B:172:0x040d] A[DONT_GENERATE, DONT_INLINE]
          (r316v7 ?? I:com.facebook.java2js.LocalJSRef) from 0x040f: INVOKE 
          (r0v279 ?? I:com.facebook.java2js.LocalJSRef)
          (r0v250 ?? I:com.facebook.java2js.JSExecutionScope)
          (r0v281 ?? I:com.facebook.java2js.LocalJSRef)
          (r316v7 ?? I:com.facebook.java2js.LocalJSRef)
         VIRTUAL call: com.facebook.java2js.LocalJSRef.setPropertyByName(com.facebook.java2js.JSExecutionScope, com.facebook.java2js.LocalJSRef, com.facebook.java2js.LocalJSRef):void A[Catch: all -> 0x0658]
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
    public void A08(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v7 ??, still in use, count: 2, list:
          (r316v7 ??) from 0x0412: PHI (r316v6 ??) = (r316v5 ??), (r316v7 ??) binds: [B:161:0x03d1, B:172:0x040d] A[DONT_GENERATE, DONT_INLINE]
          (r316v7 ?? I:com.facebook.java2js.LocalJSRef) from 0x040f: INVOKE 
          (r0v279 ?? I:com.facebook.java2js.LocalJSRef)
          (r0v250 ?? I:com.facebook.java2js.JSExecutionScope)
          (r0v281 ?? I:com.facebook.java2js.LocalJSRef)
          (r316v7 ?? I:com.facebook.java2js.LocalJSRef)
         VIRTUAL call: com.facebook.java2js.LocalJSRef.setPropertyByName(com.facebook.java2js.JSExecutionScope, com.facebook.java2js.LocalJSRef, com.facebook.java2js.LocalJSRef):void A[Catch: all -> 0x0658]
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
