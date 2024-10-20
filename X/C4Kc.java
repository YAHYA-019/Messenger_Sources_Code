package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Kc, reason: invalid class name */
/* loaded from: 4Kc.class */
public final class C4Kc {
    public java.util.Map A00;
    public static final String A02 = 4IS.A01("Data");
    public static final C4Kc A01 = new C4Kd().A00();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v3 ??, still in use, count: 5, list:
          (r308v3 ??) from 0x008c: PHI (r308v2 ??) = (r308v1 ??), (r308v3 ??) binds: [B:53:0x0089, B:33:0x007d] A[DONT_GENERATE, DONT_INLINE]
          (r308v3 ?? I:java.io.ObjectInputStream) from 0x0037: INVOKE (r0v44 ?? I:int) = (r308v3 ?? I:java.io.ObjectInputStream) VIRTUAL call: java.io.ObjectInputStream.readInt():int A[Catch: IOException | ClassNotFoundException -> 0x007d, IOException | ClassNotFoundException -> 0x007d, all -> 0x00ea, MD:():int throws java.io.IOException (c)]
          (r308v3 ?? I:java.io.ObjectInputStream) from 0x0043: INVOKE (r0v52 ?? I:java.lang.String) = (r308v3 ?? I:java.io.ObjectInputStream) VIRTUAL call: java.io.ObjectInputStream.readUTF():java.lang.String A[Catch: IOException | ClassNotFoundException -> 0x007d, IOException | ClassNotFoundException -> 0x007d, all -> 0x00ea, MD:():java.lang.String throws java.io.IOException (c)]
          (r308v3 ?? I:java.io.ObjectInputStream) from 0x004a: INVOKE (r0v54 ?? I:java.lang.Object) = (r308v3 ?? I:java.io.ObjectInputStream) VIRTUAL call: java.io.ObjectInputStream.readObject():java.lang.Object A[Catch: IOException | ClassNotFoundException -> 0x007d, IOException | ClassNotFoundException -> 0x007d, all -> 0x00ea, MD:():java.lang.Object throws java.lang.ClassNotFoundException, java.io.IOException (c)]
          (r308v3 ?? I:java.io.InputStream) from 0x0064: INVOKE (r308v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: IOException -> 0x006a, MD:():void throws java.io.IOException (c)]
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
    /* JADX WARN: Not initialized variable reg: 308, insn: 0x00ec: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r308 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:55:0x00ec */
    public static X.C4Kc A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v3 ??, still in use, count: 5, list:
          (r308v3 ??) from 0x008c: PHI (r308v2 ??) = (r308v1 ??), (r308v3 ??) binds: [B:53:0x0089, B:33:0x007d] A[DONT_GENERATE, DONT_INLINE]
          (r308v3 ?? I:java.io.ObjectInputStream) from 0x0037: INVOKE (r0v44 ?? I:int) = (r308v3 ?? I:java.io.ObjectInputStream) VIRTUAL call: java.io.ObjectInputStream.readInt():int A[Catch: IOException | ClassNotFoundException -> 0x007d, IOException | ClassNotFoundException -> 0x007d, all -> 0x00ea, MD:():int throws java.io.IOException (c)]
          (r308v3 ?? I:java.io.ObjectInputStream) from 0x0043: INVOKE (r0v52 ?? I:java.lang.String) = (r308v3 ?? I:java.io.ObjectInputStream) VIRTUAL call: java.io.ObjectInputStream.readUTF():java.lang.String A[Catch: IOException | ClassNotFoundException -> 0x007d, IOException | ClassNotFoundException -> 0x007d, all -> 0x00ea, MD:():java.lang.String throws java.io.IOException (c)]
          (r308v3 ?? I:java.io.ObjectInputStream) from 0x004a: INVOKE (r0v54 ?? I:java.lang.Object) = (r308v3 ?? I:java.io.ObjectInputStream) VIRTUAL call: java.io.ObjectInputStream.readObject():java.lang.Object A[Catch: IOException | ClassNotFoundException -> 0x007d, IOException | ClassNotFoundException -> 0x007d, all -> 0x00ea, MD:():java.lang.Object throws java.lang.ClassNotFoundException, java.io.IOException (c)]
          (r308v3 ?? I:java.io.InputStream) from 0x0064: INVOKE (r308v3 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: IOException -> 0x006a, MD:():void throws java.io.IOException (c)]
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

    public static byte[] A01(C4Kc c4Kc) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(c4Kc.A00.size());
                    for (Map.Entry entry : c4Kc.A00.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        android.util.Log.e(A02, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        android.util.Log.e(A02, "Error in Data#toByteArray: ", e2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw AnonymousClass001.A0N("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream = objectOutputStream2;
                    String str = A02;
                    android.util.Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            android.util.Log.e(str, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (IOException e5) {
                        android.util.Log.e(str, "Error in Data#toByteArray: ", e5);
                        return byteArray;
                    }
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            android.util.Log.e(A02, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        android.util.Log.e(A02, "Error in Data#toByteArray: ", e7);
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String A02(String str) {
        Object obj = this.A00.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            java.util.Map map = this.A00;
            Set keySet = map.keySet();
            java.util.Map map2 = ((C4Kc) obj).A00;
            if (!keySet.equals(map2.keySet())) {
                return false;
            }
            for (Object obj2 : keySet) {
                Object obj3 = map.get(obj2);
                Object obj4 = map2.get(obj2);
                if (obj3 != null) {
                    if (obj4 == null) {
                        return false;
                    }
                    if (!(((obj3 instanceof Object[]) && (obj4 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj3, (Object[]) obj4) : obj3.equals(obj4))) {
                        return false;
                    }
                } else if (obj3 != obj4) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        java.util.Map map = this.A00;
        if (!map.isEmpty()) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                sb.append(A0i);
                sb.append(" : ");
                Object obj = map.get(A0i);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        return AnonymousClass001.A0d("}", sb);
    }
}
