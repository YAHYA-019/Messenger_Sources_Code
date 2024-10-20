package com.facebook.common.dextricks;

import X.AnonymousClass001;
import java.io.Closeable;
import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: ReentrantLockFile.class */
public final class ReentrantLockFile implements Closeable {
    public static final int ACQUIRE_SHARED = 1;
    public static final boolean LOCK_DEBUG = false;
    public static final ReentrantLockFile sListHead = new ReentrantLockFile();
    public final File lockFileName;
    public FileChannel mChannel;
    public int mLockFlags;
    public final Lock mLockHandle;
    public boolean mLockInProgress;
    public Thread mLockOwner;
    public int mLockShareCount;
    public ReentrantLockFile mNext;
    public ReentrantLockFile mPrev;
    public int mReferenceCount;
    public FileLock mTheLock;

    /* loaded from: ReentrantLockFile$Lock.class */
    public final class Lock implements Closeable {
        public Lock() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLockFile.this.release();
        }

        public ReentrantLockFile getReentrantLockFile() {
            return ReentrantLockFile.this;
        }
    }

    public ReentrantLockFile() {
        this.lockFileName = null;
        this.mLockHandle = null;
        this.mNext = this;
        this.mPrev = this;
    }

    public ReentrantLockFile(File file, FileChannel fileChannel) {
        this.lockFileName = file;
        this.mChannel = fileChannel;
        this.mReferenceCount = 1;
        this.mLockHandle = new Lock();
    }

    private void addrefLocked() {
        if (this.mChannel == null) {
            throw AnonymousClass001.A0N("cannot add reference to dead lock");
        }
        this.mReferenceCount++;
    }

    private void assertMonitorLockNotHeld() {
        Mlog.assertThat(!Thread.holdsLock(this), "lock order violation", new Object[0]);
    }

    private void claimLock(int i, FileLock fileLock) {
        if ((i & 1) == 0) {
            this.mLockOwner = Thread.currentThread();
        }
        this.mTheLock = fileLock;
        this.mLockFlags = i;
        this.mLockShareCount = 1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v4 ??, still in use, count: 6, list:
          (r304v4 ??) from 0x0081: PHI (r304v5 ??) = (r304v4 ??), (r304v2 ??) binds: [B:57:0x007d, B:23:0x0039] A[DONT_GENERATE, DONT_INLINE]
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x005f: IPUT 
          (r0v9 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
         A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mPrev com.facebook.common.dextricks.ReentrantLockFile
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x006c: IPUT 
          (r0v27 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
         A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mNext com.facebook.common.dextricks.ReentrantLockFile
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x0072: IPUT 
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
          (r0v9 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
         A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mNext com.facebook.common.dextricks.ReentrantLockFile
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x0076: IGET (r0v31 ?? I:com.facebook.common.dextricks.ReentrantLockFile) = (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mNext com.facebook.common.dextricks.ReentrantLockFile
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x007e: IPUT 
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
          (r0v31 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
         A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mPrev com.facebook.common.dextricks.ReentrantLockFile
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
    public static com.facebook.common.dextricks.ReentrantLockFile open(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v4 ??, still in use, count: 6, list:
          (r304v4 ??) from 0x0081: PHI (r304v5 ??) = (r304v4 ??), (r304v2 ??) binds: [B:57:0x007d, B:23:0x0039] A[DONT_GENERATE, DONT_INLINE]
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x005f: IPUT 
          (r0v9 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
         A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mPrev com.facebook.common.dextricks.ReentrantLockFile
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x006c: IPUT 
          (r0v27 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
         A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mNext com.facebook.common.dextricks.ReentrantLockFile
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x0072: IPUT 
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
          (r0v9 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
         A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mNext com.facebook.common.dextricks.ReentrantLockFile
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x0076: IGET (r0v31 ?? I:com.facebook.common.dextricks.ReentrantLockFile) = (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mNext com.facebook.common.dextricks.ReentrantLockFile
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile) from 0x007e: IPUT 
          (r304v4 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
          (r0v31 ?? I:com.facebook.common.dextricks.ReentrantLockFile)
         A[Catch: all -> 0x0098] com.facebook.common.dextricks.ReentrantLockFile.mPrev com.facebook.common.dextricks.ReentrantLockFile
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

    public Lock acquire(int i) {
        try {
            return acquireInterruptubly(i);
        } catch (InterruptedException unused) {
            AnonymousClass001.A13();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0123, code lost:
    
        if (r305 == false) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.common.dextricks.ReentrantLockFile.Lock acquireInterruptubly(int r302) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.acquireInterruptubly(int):com.facebook.common.dextricks.ReentrantLockFile$Lock");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        assertMonitorLockNotHeld();
        synchronized (this) {
            if (this.mChannel != null) {
                int i = this.mReferenceCount;
                if (i <= 1) {
                    synchronized (ReentrantLockFile.class) {
                        synchronized (this) {
                            int i2 = this.mReferenceCount - 1;
                            this.mReferenceCount = i2;
                            if (i2 == 0) {
                                ReentrantLockFile reentrantLockFile = this.mPrev;
                                reentrantLockFile.mNext = this.mNext;
                                this.mNext.mPrev = reentrantLockFile;
                                this.mPrev = null;
                                this.mNext = null;
                                Fs.safeClose(this.mChannel);
                                this.mChannel = null;
                            }
                        }
                    }
                    return;
                }
                this.mReferenceCount = i - 1;
            }
        }
    }

    public void donateLock(Thread thread) {
        Mlog.assertThat(AnonymousClass001.A1W(this.mLockOwner, Thread.currentThread()), "caller must own lock exclusively", new Object[0]);
        this.mLockOwner = thread;
    }

    public Thread getExclusiveOwner() {
        return this.mLockOwner;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r301.mLockOwner == java.lang.Thread.currentThread()) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void release() {
        /*
            Method dump skipped, instructions count: 176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.release():void");
    }

    public void stealLock() {
        Mlog.assertThat(AnonymousClass001.A1T(this.mLockOwner), "cannot steal unowned lock", new Object[0]);
        this.mLockOwner = Thread.currentThread();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r305 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r301.mLockShareCount = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r309 = r301.mLockHandle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        if (r301.mLockOwner == java.lang.Thread.currentThread()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        if (r305 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.common.dextricks.ReentrantLockFile.Lock tryAcquire(int r302) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.tryAcquire(int):com.facebook.common.dextricks.ReentrantLockFile$Lock");
    }
}
