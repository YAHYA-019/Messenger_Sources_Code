package com.facebook.omnistore.sqlite;

import X.2Ge;
import X.2Gl;
import X.AnonymousClass001;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: ReadStatement.class */
public class ReadStatement implements Closeable {
    public static final byte[] EMPTY_BLOB = new byte[0];
    public 2Gl mCursorWrapper;
    public final 2Ge mDatabaseWrapper;
    public final String mSql;

    public ReadStatement(String str, 2Ge r303) {
        this.mSql = str;
        this.mDatabaseWrapper = r303;
    }

    private Cursor assertCursor() {
        2Gl r0 = this.mCursorWrapper;
        if (r0 == null) {
            throw AnonymousClass001.A0T("Tried to read from null cursor. Did you forget to step()?");
        }
        Cursor cursor = r0.A00;
        if (cursor.isClosed()) {
            throw new IOException("SQLite cursor is closed.");
        }
        return cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            2Gl r0 = this.mCursorWrapper;
            if (r0 != null) {
                Cursor cursor = r0.A00;
                if (!cursor.isClosed()) {
                    cursor.close();
                }
                this.mCursorWrapper = null;
            }
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public byte[] getBlob(int i) {
        try {
            byte[] blob = assertCursor().getBlob(i);
            if (blob == null && !isNull(i)) {
                blob = EMPTY_BLOB;
            }
            return blob;
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public int getInt(int i) {
        try {
            return assertCursor().getInt(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public long getLong(int i) {
        try {
            return assertCursor().getLong(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public String getString(int i) {
        try {
            return assertCursor().getString(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public boolean isNull(int i) {
        try {
            return assertCursor().isNull(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public void reset() {
        try {
            2Gl r0 = this.mCursorWrapper;
            if (r0 != null) {
                Cursor cursor = r0.A00;
                if (!cursor.isClosed()) {
                    cursor.close();
                }
                this.mCursorWrapper = null;
            }
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v11 ??, still in use, count: 2, list:
          (r303v11 ??) from 0x002d: PHI (r303v2 ??) = (r303v1 ??), (r303v11 ??) binds: [B:4:0x0006, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]
          (r303v11 ?? I:X.2Gl) from 0x002a: IPUT (r303v11 ?? I:X.2Gl), (r301v0 'this' ?? I:com.facebook.omnistore.sqlite.ReadStatement A[IMMUTABLE_TYPE, THIS]) A[Catch: SQLiteException -> 0x00c8] com.facebook.omnistore.sqlite.ReadStatement.mCursorWrapper X.2Gl
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
    public boolean step(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v11 ??, still in use, count: 2, list:
          (r303v11 ??) from 0x002d: PHI (r303v2 ??) = (r303v1 ??), (r303v11 ??) binds: [B:4:0x0006, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]
          (r303v11 ?? I:X.2Gl) from 0x002a: IPUT (r303v11 ?? I:X.2Gl), (r301v0 'this' ?? I:com.facebook.omnistore.sqlite.ReadStatement A[IMMUTABLE_TYPE, THIS]) A[Catch: SQLiteException -> 0x00c8] com.facebook.omnistore.sqlite.ReadStatement.mCursorWrapper X.2Gl
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
