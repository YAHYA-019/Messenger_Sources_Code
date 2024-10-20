package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.0cV;
import X.AnonymousClass001;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.xzdecoder.XzInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: InputDex.class */
public final class InputDex implements Closeable {
    public static final byte STATE_RAW = 0;
    public static final byte STATE_USED = 2;
    public static final byte STATE_ZIPPED = 1;
    public static final String XZS_ASSET_SUFFIX = ".xzs.tmp~";
    public final DexManifest.Dex dex;
    public InputStream mContents;
    public byte mState;
    public int sizeHint;

    public InputDex(DexManifest.Dex dex, InputStream inputStream) {
        this.dex = dex;
        String str = dex.assetName;
        try {
            try {
                str = str.endsWith(XZS_ASSET_SUFFIX) ? str.substring(0, str.length() - 9) : str;
                if (str.endsWith(".xz")) {
                    str = str.substring(0, str.length() - 3);
                    inputStream = new XzInputStream(inputStream);
                }
                if (str.endsWith(".jar")) {
                    str = str.substring(0, str.length() - 4);
                    this.mState = (byte) 1;
                }
                if (!str.endsWith(DexManifest.DEX_EXT)) {
                    throw 0Pz.A08("malformed dex asset name: ", dex.assetName);
                }
                this.mContents = inputStream;
            } catch (IOException e) {
                throw AnonymousClass001.A0U(e);
            }
        } catch (Throwable th) {
            Fs.safeClose(inputStream);
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v0 ??, still in use, count: 2, list:
          (r314v0 ??) from 0x0104: PHI (r314v1 ??) = (r314v0 ??), (r314v4 ??) binds: [B:18:0x0062, B:53:?] A[DONT_GENERATE, DONT_INLINE]
          (r314v0 ?? I:java.io.InputStream) from 0x006b: INVOKE (r0v39 ?? I:java.io.BufferedInputStream), (r314v0 ?? I:java.io.InputStream) DIRECT call: java.io.BufferedInputStream.<init>(java.io.InputStream):void A[Catch: all -> 0x0104, MD:(java.io.InputStream):void (c)]
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
    private void synthesizeDexJarFile(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v0 ??, still in use, count: 2, list:
          (r314v0 ??) from 0x0104: PHI (r314v1 ??) = (r314v0 ??), (r314v4 ??) binds: [B:18:0x0062, B:53:?] A[DONT_GENERATE, DONT_INLINE]
          (r314v0 ?? I:java.io.InputStream) from 0x006b: INVOKE (r0v39 ?? I:java.io.BufferedInputStream), (r314v0 ?? I:java.io.InputStream) DIRECT call: java.io.BufferedInputStream.<init>(java.io.InputStream):void A[Catch: all -> 0x0104, MD:(java.io.InputStream):void (c)]
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Fs.safeClose(this.mContents);
    }

    public void extract(File file) {
        InputStream dexContents;
        byte b = this.mState;
        this.mState = (byte) 2;
        if (b != 0 && b != 1) {
            throw AnonymousClass001.A0T("InputDex already used");
        }
        String name = file.getName();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            boolean endsWith = name.endsWith(".dex.jar");
            int i = (-1) >>> 1;
            if (endsWith) {
                if (b != 1) {
                    Mlog.v("synthesizing new zip file %s", this);
                    synthesizeDexJarFile(fileOutputStream);
                    fileOutputStream.close();
                }
                Mlog.v("copying existing zip file %s", this);
                dexContents = this.mContents;
            } else {
                if (!name.endsWith(DexManifest.DEX_EXT)) {
                    throw 0Pz.A08("don't know how to make this kind of file: ", name);
                }
                Mlog.v("writing raw dex file %s", this);
                this.mState = b;
                dexContents = getDexContents();
            }
            0cV.A05(dexContents, fileOutputStream, i);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    public InputStream getDexContents() {
        ZipEntry nextEntry;
        byte b = this.mState;
        this.mState = (byte) 2;
        if (b == 1) {
            ZipInputStream zipInputStream = new ZipInputStream(this.mContents);
            this.mContents = zipInputStream;
            do {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    throw AnonymousClass001.A0G(String.format("zip file %s did not contain a classes.dex", this.dex));
                }
            } while (!nextEntry.getName().equals("classes.dex"));
            long size = nextEntry.getSize();
            this.sizeHint = size > 2147483647L ? (-1) >>> 1 : (int) size;
        } else if (b != 0) {
            throw AnonymousClass001.A0T("InputDex already used");
        }
        return this.mContents;
    }

    public int getSizeHint(InputStream inputStream) {
        int i = this.sizeHint;
        if (i <= 0) {
            i = inputStream.available();
            if (i <= 1) {
                i = -1;
            }
        }
        return i;
    }

    public String toString() {
        return String.format("InputDex:[%s]", this.dex.assetName);
    }
}
