package com.facebook.messaging.msys.core;

import X.0QO;
import X.0fH;
import X.11T;
import X.1F9;
import X.1Hb;
import X.1SG;
import X.1UU;
import X.1UV;
import X.1UW;
import X.1UX;
import X.1Us;
import X.1Uu;
import X.1Uv;
import X.1Uw;
import X.1Ux;
import X.1Uy;
import X.1XJ;
import X.22B;
import X.C0dr;
import X.C1zm;
import X.C3b5;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.messaging.service.model.FetchMoreThreadsResult;
import com.facebook.messaging.service.model.FetchThreadListResult;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: MsysFetchThreadListOperation.class */
public final class MsysFetchThreadListOperation extends 1UU implements 1UV {
    public static final C0dr A0J = RealtimeSinceBootClock.A00;
    public FetchThreadListResult A02;
    public 1XJ A03;
    public final FbUserSession A05;
    public final 1Uy A06;
    public final 1Uv A07;
    public final 1Uw A08;
    public final 1F9 A09;
    public final 1Ux A0A;
    public final ExecutorService A0B;
    public final int A0C;
    public final int A0D;
    public final 1Us A0E;
    public final 1UX A0F;
    public final 1Uu A0G;
    public final AtomicInteger A0H;
    public volatile SettableFuture A0I;
    public final 0QO A04 = new 0QO(0);
    public int A00 = -1;
    public long A01 = 0;

    public MsysFetchThreadListOperation(FbUserSession fbUserSession, 1Uy r303, 1Uv r304, 1Uw r305, 1F9 r306, 1Ux r307, 1Us r308, 1UX r309, 1Uu r310, ExecutorService executorService, int i, int i2) {
        this.A05 = fbUserSession;
        this.A0F = r309;
        this.A0E = r308;
        this.A0G = r310;
        this.A07 = r304;
        this.A08 = r305;
        this.A0D = i;
        this.A0H = new AtomicInteger(i);
        this.A0B = executorService;
        this.A0A = r307;
        this.A09 = r306;
        this.A0C = i2;
        this.A06 = r303;
    }

    public static String A00(1F9 r301, 1Hb r302) {
        1UW r0 = 1UW.$redex_init_class;
        switch (r302.ordinal()) {
            case 1:
                return "FETCH_SMS_THREAD_LIST_KEY";
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                int ordinal = r301.ordinal();
                return ordinal != 3 ? ordinal != 5 ? ordinal != 2 ? ordinal != 4 ? "FETCH_THREAD_LIST_KEY" : "FETCH_THREAD_LIST_KEY_ARCHIVED" : "FETCH_THREAD_LIST_KEY_PENDING" : "FETCH_THREAD_LIST_KEY_SPAM" : "FETCH_THREAD_LIST_KEY_OTHER";
            case 6:
                return "FETCH_THREAD_LIST_KEY_FROM_ADS";
            case 7:
                return "FETCH_THREAD_LIST_KEY_BIIM_PRIORITY";
            case 8:
                return "FETCH_THREAD_LIST_KEY_BIIM_HIGH_INTENT";
            case 9:
                return "FETCH_THREAD_LIST_KEY_UNREAD";
            case 10:
                return "FETCH_THREAD_LIST_KEY_UNANSWERED";
        }
    }

    public static void A01(MsysFetchThreadListOperation msysFetchThreadListOperation, FetchThreadListResult fetchThreadListResult) {
        if (fetchThreadListResult != null) {
            1Us r0 = msysFetchThreadListOperation.A0E;
            FbUserSession fbUserSession = msysFetchThreadListOperation.A05;
            r0.A00(fbUserSession, fetchThreadListResult.A0A);
            1Uu r02 = msysFetchThreadListOperation.A0G;
            11T.A0F(fbUserSession, 1);
            1F9 r03 = fetchThreadListResult.A04;
            ThreadsCollection threadsCollection = fetchThreadListResult.A07;
            11T.A09(threadsCollection);
            r02.A00(fbUserSession, r03, threadsCollection);
            synchronized (msysFetchThreadListOperation) {
                0QO r04 = msysFetchThreadListOperation.A04;
                r04.clear();
                ImmutableList immutableList = threadsCollection.A01;
                int size = immutableList.size();
                for (int i = 0; i < size; i++) {
                    ThreadSummary threadSummary = (ThreadSummary) immutableList.get(i);
                    r04.put(threadSummary.A0n, threadSummary);
                }
            }
        }
        synchronized (msysFetchThreadListOperation) {
            msysFetchThreadListOperation.A01 = A0J.now();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x03db, code lost:
    
        if (((X.1WY) r0.get()).A05() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0445, code lost:
    
        if (X.1WY.A01((X.1WY) r0.get()).AZk(36315340068889398L) == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0483, code lost:
    
        if (X.1WY.A01(r0).AZk(36315340068954935L) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04c1, code lost:
    
        if (X.1WY.A01(r0).AZk(36315340069020472L) == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022a, code lost:
    
        if (((X.1WY) r0.get()).A05() != false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(com.facebook.messaging.msys.core.MsysFetchThreadListOperation r301, com.google.common.util.concurrent.SettableFuture r302) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.core.MsysFetchThreadListOperation.A02(com.facebook.messaging.msys.core.MsysFetchThreadListOperation, com.google.common.util.concurrent.SettableFuture):void");
    }

    public FetchMoreThreadsResult A03(ThreadKey threadKey, int i, long j) {
        FetchThreadListResult fetchThreadListResult;
        int i2;
        FetchMoreThreadsResult fetchMoreThreadsResult;
        1SG r317;
        1XJ r0;
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        Preconditions.checkState(z, "size required must be set.");
        0fH.A0j("com.facebook.messaging.msys.core.MsysFetchThreadListOperation", "fetchMore");
        synchronized (this) {
            fetchThreadListResult = this.A02;
        }
        if (fetchThreadListResult == null) {
            fetchMoreThreadsResult = FetchMoreThreadsResult.A07;
        } else {
            ThreadsCollection threadsCollection = fetchThreadListResult.A07;
            ImmutableList immutableList = threadsCollection.A01;
            int size = immutableList.size();
            while (true) {
                i2 = size;
                if (i2 <= 0) {
                    break;
                }
                int i3 = i2 - 1;
                Object obj = immutableList.get(i3);
                11T.A0A(obj);
                if (((ThreadSummary) obj).A0I > j) {
                    break;
                }
                Object obj2 = immutableList.get(i3);
                11T.A0A(obj2);
                if (((ThreadSummary) obj2).A0n.equals(threadKey)) {
                    break;
                }
                size = i2 - 1;
            }
            int size2 = immutableList.size();
            FetchMoreThreadsResult fetchMoreThreadsResult2 = FetchMoreThreadsResult.A07;
            DataFetchDisposition dataFetchDisposition = fetchThreadListResult.A02;
            1F9 r02 = fetchThreadListResult.A04;
            r02.getClass();
            fetchMoreThreadsResult = new FetchMoreThreadsResult(dataFetchDisposition, r02, new ThreadsCollection(immutableList.subList(i2, size2), threadsCollection.A02), fetchThreadListResult.A09, fetchThreadListResult.A0A, fetchThreadListResult.A08, fetchThreadListResult.A00);
        }
        if (this.A0H.get() < i && !fetchMoreThreadsResult.A03.A02) {
            if (fetchThreadListResult == null || !fetchThreadListResult.A02.A03.asBoolean(false)) {
                r317 = this.A06;
                r317.A0Z("load_more_state_before_fetch", "has_more_local");
                r317.A0j(false);
            } else {
                r317 = this.A06;
                r317.A0Z("load_more_state_before_fetch", "has_more_remote");
                r317.A0j(true);
                1UX r03 = this.A0F;
                Integer A01 = this.A09.A01();
                if (A01 != null) {
                    0fH.A0g(A01, "MsysThreadListAdapter", "threadListLoadMoreState: no local but has remote, parentThreadKey %d");
                    ((1SG) r03.A0K.get()).A0K("load_thread_range_info_v2");
                    ((22B) r03.A0E.get()).A04(new C3b5(A01, r03, 22), A01.intValue());
                }
            }
            r317.A0Z("fetch_path", "blue_service");
            0fH.A0j("com.facebook.messaging.msys.core.MsysFetchThreadListOperation", "increasing MSYS observer limit");
            synchronized (this) {
                r0 = this.A03;
            }
            if (r0 != null) {
                r0.A02(i);
            }
        }
        return fetchMoreThreadsResult;
    }

    public void A04(MessageDraft messageDraft, ThreadKey threadKey) {
        synchronized (this) {
            0QO r0 = this.A04;
            ThreadSummary threadSummary = (ThreadSummary) r0.get(threadKey);
            if (threadSummary != null) {
                C1zm c1zm = new C1zm(threadSummary);
                c1zm.A0h = messageDraft;
                r0.put(threadKey, new ThreadSummary(c1zm));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v5 ??, still in use, count: 2, list:
          (r309v5 ??) from 0x020f: PHI (r309v1 ??) = (r309v0 ??), (r309v5 ??) binds: [B:216:0x01d6, B:110:0x0208] A[DONT_GENERATE, DONT_INLINE]
          (r309v5 ?? I:java.util.AbstractCollection) from 0x016a: INVOKE (r309v5 ?? I:java.util.AbstractCollection), (r0v247 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0504, MD:(E):boolean (c)]
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
    public /* bridge */ /* synthetic */ void CHj(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v5 ??, still in use, count: 2, list:
          (r309v5 ??) from 0x020f: PHI (r309v1 ??) = (r309v0 ??), (r309v5 ??) binds: [B:216:0x01d6, B:110:0x0208] A[DONT_GENERATE, DONT_INLINE]
          (r309v5 ?? I:java.util.AbstractCollection) from 0x016a: INVOKE (r309v5 ?? I:java.util.AbstractCollection), (r0v247 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0504, MD:(E):boolean (c)]
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
