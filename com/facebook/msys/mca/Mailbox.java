package com.facebook.msys.mca;

import X.0fH;
import X.1BK;
import X.1Uc;
import X.1Uj;
import X.1Um;
import X.1Vt;
import X.1W5;
import X.1X9;
import X.38F;
import X.38P;
import X.38Q;
import X.38R;
import X.38S;
import X.38T;
import X.3bF;
import X.C1qM;
import X.C1y2;
import X.C3b7;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mcs.SyncHandler;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Mailbox.class */
public class Mailbox implements 1W5 {
    public static final Mailbox $redex_init_class = null;
    public Database mDatabase;
    public final boolean mIsAsapModeEnabled;
    public final NativeHolder mNativeHolder;
    public final SlimMailbox mSlimMailbox;
    public final Set mStoredProcedureChangedListeners = Collections.newSetFromMap(new ConcurrentHashMap());
    public final 1Uc mDbCommitCallback = new 3bF(this, 8);
    public final 1Uc mDbCommitV2Callback = new 3bF(this, 9);
    public 1Um mSynchronousMailboxApiHandleProvider = null;

    static {
        1Vt.A00();
    }

    public Mailbox(SlimMailbox slimMailbox, boolean z, MailboxConfig mailboxConfig) {
        this.mIsAsapModeEnabled = z;
        this.mSlimMailbox = slimMailbox;
        this.mNativeHolder = initNativeHolder(mailboxConfig);
        getAccountSession().getSessionedNotificationCenter().addObserver(this.mDbCommitCallback, "MCIDatabaseCommitNotificationV1", 1, null);
        getAccountSession().getSessionedNotificationCenter().addObserver(this.mDbCommitV2Callback, "MCIDatabaseCommitNotificationV2", 6, null);
    }

    public static native boolean deleteDatabaseFilesNative(String str, String str2, int i);

    private void disableStoredProcedureChangedListeners() {
        this.mStoredProcedureChangedListeners.clear();
        getAccountSession().getSessionedNotificationCenter().removeObserver(this.mDbCommitCallback, "MCIDatabaseCommitNotificationV1", null);
        getAccountSession().getSessionedNotificationCenter().removeObserver(this.mDbCommitV2Callback, "MCIDatabaseCommitNotificationV2", null);
    }

    private native void enableTaskProcessingForNonCriticalTasksNative();

    private native int getAppStateNative();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v2 ??, still in use, count: 2, list:
          (r308v2 ??) from 0x0036: PHI (r308v1 ??) = (r308v0 ??), (r308v2 ??) binds: [B:6:0x0019, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r308v2 ?? I:X.1y3) from 0x0033: IPUT (r308v2 ?? I:X.1y3), (r0v3 ?? I:com.facebook.msys.mca.SlimMailbox) A[Catch: all -> 0x0060] com.facebook.msys.mca.SlimMailbox.mNotificationCenterCallbackManager X.1y3
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
    private com.facebook.msys.util.NotificationScope getFutureNotificationScope(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v2 ??, still in use, count: 2, list:
          (r308v2 ??) from 0x0036: PHI (r308v1 ??) = (r308v0 ??), (r308v2 ??) binds: [B:6:0x0019, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r308v2 ?? I:X.1y3) from 0x0033: IPUT (r308v2 ?? I:X.1y3), (r0v3 ?? I:com.facebook.msys.mca.SlimMailbox) A[Catch: all -> 0x0060] com.facebook.msys.mca.SlimMailbox.mNotificationCenterCallbackManager X.1y3
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

    private native int getStateNative();

    private native SyncHandler getSyncHandlerNative();

    private native NativeHolder initNativeHolder(MailboxConfig mailboxConfig);

    private native void invalidateNative_TestOnly();

    private native boolean isValidNative();

    /* JADX INFO: Access modifiers changed from: private */
    public native void logoutAndDeleteNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void logoutAndEncryptNative(NotificationScope notificationScope);

    private native void pauseSendSyncRequestsNative(NotificationScope notificationScope);

    private native void resumeSendSyncRequestsNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void scheduleTaskProcessingIfNeededNative();

    /* JADX INFO: Access modifiers changed from: private */
    public native void setStateNative(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void shutdownAndDeleteNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void shutdownAndEncryptNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void shutdownNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void startAllDelayedSyncGroupsNative();

    private native void startDelayedSyncGroupsNative(List list);

    public void addStoredProcedureChangedListener(C1qM c1qM) {
        if (this.mStoredProcedureChangedListeners.add(c1qM)) {
            return;
        }
        0fH.A18("Mailbox", "StoredProcedureChangedListener %s was already registered, when going to add it", new Object[]{c1qM});
    }

    public void enableTaskProcessingForNonCriticalTasks() {
        enableTaskProcessingForNonCriticalTasksNative();
    }

    public AccountSession getAccountSession() {
        AccountSession accountSession;
        synchronized (this) {
            accountSession = this.mSlimMailbox.mAccountSession;
        }
        return accountSession;
    }

    public C1y2 getSessionedNotificationCenterCallbackManager() {
        return (C1y2) getAccountSession().getNotificationCenterCallbackManager();
    }

    public SlimMailbox getSlimMailbox() {
        SlimMailbox slimMailbox;
        synchronized (this) {
            slimMailbox = this.mSlimMailbox;
        }
        return slimMailbox;
    }

    public SyncHandler getSyncHandler() {
        return getSyncHandlerNative();
    }

    public boolean isValid() {
        return isValidNative();
    }

    /* renamed from: lambda$logoutAndDelete$0$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m8603lambda$logoutAndDelete$0$comfacebookmsysmcaMailbox(Void r302) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$logoutAndEncrypt$1$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m8604lambda$logoutAndEncrypt$1$comfacebookmsysmcaMailbox(Void r302) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$shutdown$2$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m8605lambda$shutdown$2$comfacebookmsysmcaMailbox(Void r302) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$shutdownAndDelete$3$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m8606lambda$shutdownAndDelete$3$comfacebookmsysmcaMailbox(Void r302) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$shutdownAndEncrypt$4$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m8607lambda$shutdownAndEncrypt$4$comfacebookmsysmcaMailbox(Void r302) {
        disableStoredProcedureChangedListeners();
    }

    public 1X9 logoutAndDelete() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        1Um r302 = this.mSynchronousMailboxApiHandleProvider;
        if (r302 == null) {
            r302 = ((1Uj) new 38F(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = r302;
        }
        MailboxFutureImpl A0P = 1BK.A0P(r302);
        Execution.executePossiblySync(new 38S(this, getFutureNotificationScope(A0P, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        A0P.addResultCallback(new C3b7(this, 43));
        return A0P;
    }

    public 1X9 logoutAndEncrypt() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        1Um r302 = this.mSynchronousMailboxApiHandleProvider;
        if (r302 == null) {
            r302 = ((1Uj) new 38F(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = r302;
        }
        MailboxFutureImpl A0P = 1BK.A0P(r302);
        Execution.executePossiblySync(new 38T(this, getFutureNotificationScope(A0P, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        A0P.addResultCallback(new C3b7(this, 46));
        return A0P;
    }

    public void removeStoredProcedureChangedListener(C1qM c1qM) {
        if (this.mStoredProcedureChangedListeners.remove(c1qM)) {
            return;
        }
        0fH.A0g(c1qM, "Mailbox", "StoredProcedureChangedListener %s was not registered, when going to remove it");
    }

    public 1X9 shutdown() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        1Um r302 = this.mSynchronousMailboxApiHandleProvider;
        if (r302 == null) {
            r302 = ((1Uj) new 38F(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = r302;
        }
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(r302);
        Execution.executePossiblySync(new 38P(this, getFutureNotificationScope(mailboxFutureImpl, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        mailboxFutureImpl.addResultCallback(new C3b7(this, 47));
        return mailboxFutureImpl;
    }

    public 1X9 shutdownAndDelete() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        1Um r302 = this.mSynchronousMailboxApiHandleProvider;
        if (r302 == null) {
            r302 = ((1Uj) new 38F(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = r302;
        }
        MailboxFutureImpl A0P = 1BK.A0P(r302);
        Execution.executePossiblySync(new 38Q(this, getFutureNotificationScope(A0P, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        A0P.addResultCallback(new C3b7(this, 45));
        return A0P;
    }

    public 1X9 shutdownAndEncrypt() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        1Um r302 = this.mSynchronousMailboxApiHandleProvider;
        if (r302 == null) {
            r302 = ((1Uj) new 38F(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = r302;
        }
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(r302);
        Execution.executePossiblySync(new 38R(this, getFutureNotificationScope(mailboxFutureImpl, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        mailboxFutureImpl.addResultCallback(new C3b7(this, 44));
        return mailboxFutureImpl;
    }

    public native void trimMemory();

    public native void updateAppStateToBackground();

    public native void updateAppStateToForeground();
}
