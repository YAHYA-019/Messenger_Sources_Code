package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

/* loaded from: JITProfile.class */
public abstract class JITProfile {
    public static final byte[] PROFILE_MAGIC = {112, 114, 111, 0};
    public static final String TAG = "JITProfile";

    public static HashMap deserializeCheckSumFile(File file) {
        FileInputStream A0F = AnonymousClass001.A0F(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(A0F);
        try {
            try {
                return (HashMap) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                Mlog.w(TAG, "could not read hashmap from %s for reason %s", file.getName(), e);
                objectInputStream.close();
                A0F.close();
                return null;
            }
        } finally {
            objectInputStream.close();
            A0F.close();
        }
    }

    public static boolean isMagicRight(byte[] bArr) {
        Object[] objArr;
        int length = bArr.length;
        if (length < 4) {
            objArr = AnonymousClass001.A1b(": profile header only has %d bytes, too short", length);
        } else {
            int i = 0;
            while (bArr[i] == PROFILE_MAGIC[i]) {
                i++;
                if (i >= 4) {
                    return true;
                }
            }
            objArr = new Object[]{"JITProfile:Incorrect profile magic"};
        }
        Mlog.w(TAG, objArr);
        return false;
    }

    public static HashMap populateDex2ChecksumMap(File file, File file2) {
        File A02 = 0Pz.A02(file.getName(), ".checksum", file2.getParentFile());
        if (A02.exists()) {
            return deserializeCheckSumFile(A02);
        }
        Mlog.w(TAG, "checksum file %s for mega zip doesn't exist ", A02.getName());
        return null;
    }

    public static short readShortFromContent(byte[] bArr, int i) {
        short s = 0;
        int i2 = 1;
        do {
            s = (short) (((short) (s << 8)) | (bArr[i + i2] & 255));
            i2--;
        } while (i2 >= 0);
        return s;
    }

    public static int readUInt16FromContent(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 1;
        do {
            i2 = (i2 << 8) | (bArr[i + i3] & 255);
            i3--;
        } while (i3 >= 0);
        return i2;
    }

    public static int readUnsignedIntFromContent(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 3;
        do {
            i2 = (i2 << 8) | (bArr[i + i3] & 255);
            i3--;
        } while (i3 >= 0);
        return i2;
    }

    public static void writeShortToContent(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public static void writeStringToContent(byte[] bArr, int i, String str) {
        byte[] bytes = str.getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bytes.length) {
                return;
            }
            bArr[i + i3] = bytes[i3];
            i2 = i3 + 1;
        }
    }

    public static void writeUnsignedIntToContent(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public abstract void change2MegaZipDexLocations(String str);

    public abstract boolean fixDexChecksums(HashMap hashMap);

    public abstract byte[] getVersion();

    public abstract boolean isValid();

    public abstract boolean isVersionRight(byte[] bArr);

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v4 ??, still in use, count: 6, list:
          (r310v4 ??) from 0x00f2: PHI (r310v2 ??) = (r310v0 ??), (r310v4 ??) binds: [B:71:0x00ef, B:48:0x00e7] A[DONT_GENERATE, DONT_INLINE]
          (r310v4 ??) from 0x0126: PHI (r310v3 ??) = (r310v2 ??), (r310v4 ??) binds: [B:57:0x0123, B:38:0x00a1] A[DONT_GENERATE, DONT_INLINE]
          (r310v4 ?? I:java.io.FileOutputStream) from 0x00aa: INVOKE (r0v55 ?? I:boolean) = 
          (r301v0 'this' ?? I:com.facebook.common.dextricks.JITProfile A[IMMUTABLE_TYPE, THIS])
          (r310v4 ?? I:java.io.FileOutputStream)
         VIRTUAL call: com.facebook.common.dextricks.JITProfile.writeProfile(java.io.FileOutputStream):boolean A[Catch: FileNotFoundException -> 0x00e7, all -> 0x012d, MD:(java.io.FileOutputStream):boolean (m)]
          (r310v4 ?? I:java.io.OutputStream) from 0x00e1: INVOKE (r310v4 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.close():void A[MD:():void throws java.io.IOException (c)]
          (r310v4 ?? I:java.io.FileOutputStream) from 0x0043: INVOKE (r0v50 ?? I:java.nio.channels.FileChannel) = (r310v4 ?? I:java.io.FileOutputStream) VIRTUAL call: java.io.FileOutputStream.getChannel():java.nio.channels.FileChannel A[Catch: IOException -> 0x0057, FileNotFoundException -> 0x00e7, all -> 0x012d, MD:():java.nio.channels.FileChannel (c)]
          (r310v4 ?? I:java.io.OutputStream) from 0x00a1: INVOKE (r310v4 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.close():void A[Catch: FileNotFoundException -> 0x00e7, all -> 0x012d, MD:():void throws java.io.IOException (c)]
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
    /* JADX WARN: Not initialized variable reg: 310, insn: 0x0139: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r310 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:65:0x0139 */
    public boolean produceProfileFile(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v4 ??, still in use, count: 6, list:
          (r310v4 ??) from 0x00f2: PHI (r310v2 ??) = (r310v0 ??), (r310v4 ??) binds: [B:71:0x00ef, B:48:0x00e7] A[DONT_GENERATE, DONT_INLINE]
          (r310v4 ??) from 0x0126: PHI (r310v3 ??) = (r310v2 ??), (r310v4 ??) binds: [B:57:0x0123, B:38:0x00a1] A[DONT_GENERATE, DONT_INLINE]
          (r310v4 ?? I:java.io.FileOutputStream) from 0x00aa: INVOKE (r0v55 ?? I:boolean) = 
          (r301v0 'this' ?? I:com.facebook.common.dextricks.JITProfile A[IMMUTABLE_TYPE, THIS])
          (r310v4 ?? I:java.io.FileOutputStream)
         VIRTUAL call: com.facebook.common.dextricks.JITProfile.writeProfile(java.io.FileOutputStream):boolean A[Catch: FileNotFoundException -> 0x00e7, all -> 0x012d, MD:(java.io.FileOutputStream):boolean (m)]
          (r310v4 ?? I:java.io.OutputStream) from 0x00e1: INVOKE (r310v4 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.close():void A[MD:():void throws java.io.IOException (c)]
          (r310v4 ?? I:java.io.FileOutputStream) from 0x0043: INVOKE (r0v50 ?? I:java.nio.channels.FileChannel) = (r310v4 ?? I:java.io.FileOutputStream) VIRTUAL call: java.io.FileOutputStream.getChannel():java.nio.channels.FileChannel A[Catch: IOException -> 0x0057, FileNotFoundException -> 0x00e7, all -> 0x012d, MD:():java.nio.channels.FileChannel (c)]
          (r310v4 ?? I:java.io.OutputStream) from 0x00a1: INVOKE (r310v4 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.close():void A[Catch: FileNotFoundException -> 0x00e7, all -> 0x012d, MD:():void throws java.io.IOException (c)]
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

    public abstract boolean readFileHeader(InputStream inputStream);

    public abstract boolean writeProfile(FileOutputStream fileOutputStream);
}
