package com.facebook.messaging.msys.core;

import X.0QO;
import X.0fH;
import X.1Br;
import X.1Du;
import X.1EC;
import X.1FA;
import X.1UU;
import X.1Uu;
import X.1Uv;
import X.3iC;
import X.4YU;
import X.5pG;
import X.AnonymousClass001;
import X.C0dr;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadUpdate;
import com.facebook.messaging.msys.core.adapter.MsysThreadViewAdapter;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: MsysFetchThreadOperation.class */
public final class MsysFetchThreadOperation extends 1UU {
    public static final C0dr A0D = RealtimeSinceBootClock.A00;
    public long A00;
    public FetchThreadResult A01;
    public Boolean A02;
    public Integer A03;
    public final 0QO A04;
    public final FbUserSession A05;
    public final 1Uv A06;
    public final ThreadKey A07;
    public final MsysThreadViewAdapter A08;
    public final 5pG A09;
    public final Object A0A;
    public final ArrayList A0B;
    public final 1Uu A0C;

    public MsysFetchThreadOperation(FbUserSession fbUserSession, 1Uv r303, ThreadKey threadKey, MsysThreadViewAdapter msysThreadViewAdapter, 5pG r306, 1Uu r307) {
        Object obj = new Object();
        this.A0A = obj;
        this.A00 = 0L;
        this.A04 = new 0QO(0);
        this.A0B = new ArrayList();
        this.A05 = fbUserSession;
        this.A08 = msysThreadViewAdapter;
        this.A0C = r307;
        this.A06 = r303;
        this.A09 = r306;
        this.A07 = threadKey;
        synchronized (obj) {
            this.A03 = 0;
            this.A02 = false;
        }
    }

    public static void A00(MsysFetchThreadOperation msysFetchThreadOperation) {
        0fH.A0j("com.facebook.messaging.msys.core.MsysFetchThreadOperation", "doUnsubscribe");
        msysFetchThreadOperation.A08.A01(msysFetchThreadOperation.A07);
        5pG r0 = msysFetchThreadOperation.A09;
        if (r0 != null) {
            synchronized (r0) {
                1FA r02 = r0.A02;
                if (r02 != null) {
                    r02.cancel(false);
                    r0.A02 = null;
                }
            }
        }
    }

    public static void A01(MsysFetchThreadOperation msysFetchThreadOperation, FetchThreadResult fetchThreadResult) {
        if (fetchThreadResult != null) {
            MessagesCollection messagesCollection = fetchThreadResult.A03;
            synchronized (msysFetchThreadOperation.A0A) {
                msysFetchThreadOperation.A03 = Integer.valueOf(messagesCollection == null ? 0 : messagesCollection.A01.size());
                msysFetchThreadOperation.A02 = Boolean.valueOf(messagesCollection == null ? false : messagesCollection.A02);
                if (messagesCollection != null) {
                    ThreadKey threadKey = messagesCollection.A00;
                    if (threadKey == null) {
                        throw AnonymousClass001.A0T("Null thread key");
                    }
                    0fH.A0g(threadKey.toString(), "com.facebook.messaging.msys.core.MsysFetchThreadOperation", "Adding messages for thread %s");
                    0QO r0 = msysFetchThreadOperation.A04;
                    r0.clear();
                    ImmutableList immutableList = messagesCollection.A01;
                    int size = immutableList.size();
                    for (int i = 0; i < size; i++) {
                        Message message = (Message) immutableList.get(i);
                        String str = message.A1V;
                        str.getClass();
                        r0.put(str, message);
                    }
                }
            }
            msysFetchThreadOperation.A0C.A01(msysFetchThreadOperation.A05, new ThreadUpdate(messagesCollection, fetchThreadResult.A05, fetchThreadResult.A07, null, fetchThreadResult.A01));
            5pG r02 = msysFetchThreadOperation.A09;
            if (r02 != null) {
                FbUserSession A03 = 1Br.A03(r02.A07);
                synchronized (r02) {
                    if (messagesCollection != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = r02.A01;
                        boolean z = false;
                        1Du it = messagesCollection.A01.iterator();
                        while (it.hasNext()) {
                            Long l = 4YU.A0V(it).A1J;
                            if (l != null) {
                                long longValue = l.longValue();
                                if (longValue - currentTimeMillis >= 0 && longValue < j) {
                                    z = true;
                                    j = Math.min(j, longValue);
                                }
                            }
                        }
                        if (z) {
                            0fH.A0j(5pG.A09, "Scheduling reloading thread for message expiration");
                            r02.A01 = j;
                            long currentTimeMillis2 = System.currentTimeMillis();
                            1FA r03 = r02.A02;
                            if (r03 != null) {
                                r03.cancel(false);
                            }
                            r02.A02 = ((1EC) 1Br.A0B(r02.A06)).Cjg(new 3iC(A03, msysFetchThreadOperation, r02, j), TimeUnit.MILLISECONDS, (j - currentTimeMillis2) + 1000);
                        }
                    }
                }
            }
        }
        synchronized (msysFetchThreadOperation) {
            msysFetchThreadOperation.A00 = A0D.now();
        }
    }

    public void A02() {
        A00(this);
        synchronized (this) {
            this.A01 = null;
        }
        A01(this, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v5 ??, still in use, count: 4, list:
          (r308v5 ??) from 0x00cb: PHI (r308v4 ??) = (r308v1 ??), (r308v5 ??) binds: [B:222:0x01c7, B:157:0x00c6] A[DONT_GENERATE, DONT_INLINE]
          (r308v5 ?? I:X.5pv) from 0x00a6: IPUT (r0v87 ?? I:com.facebook.messaging.model.threadkey.ThreadKey), (r308v5 ?? I:X.5pv) A[Catch: all -> 0x0401] X.5pv.A00 com.facebook.messaging.model.threadkey.ThreadKey
          (r308v5 ?? I:X.5pv) from 0x00c1: INVOKE (r308v5 ?? I:X.5pv), (r0v93 ?? I:com.google.common.collect.ImmutableList) VIRTUAL call: X.5pv.A01(com.google.common.collect.ImmutableList):void A[Catch: all -> 0x0401, MD:(com.google.common.collect.ImmutableList):void (m)]
          (r308v5 ?? I:X.5pv) from 0x00c8: IPUT (r0v23 ?? I:com.facebook.messaging.model.threadkey.ThreadKey), (r308v5 ?? I:X.5pv) A[Catch: all -> 0x0401] X.5pv.A00 com.facebook.messaging.model.threadkey.ThreadKey
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v5 ??, still in use, count: 4, list:
          (r308v5 ??) from 0x00cb: PHI (r308v4 ??) = (r308v1 ??), (r308v5 ??) binds: [B:222:0x01c7, B:157:0x00c6] A[DONT_GENERATE, DONT_INLINE]
          (r308v5 ?? I:X.5pv) from 0x00a6: IPUT (r0v87 ?? I:com.facebook.messaging.model.threadkey.ThreadKey), (r308v5 ?? I:X.5pv) A[Catch: all -> 0x0401] X.5pv.A00 com.facebook.messaging.model.threadkey.ThreadKey
          (r308v5 ?? I:X.5pv) from 0x00c1: INVOKE (r308v5 ?? I:X.5pv), (r0v93 ?? I:com.google.common.collect.ImmutableList) VIRTUAL call: X.5pv.A01(com.google.common.collect.ImmutableList):void A[Catch: all -> 0x0401, MD:(com.google.common.collect.ImmutableList):void (m)]
          (r308v5 ?? I:X.5pv) from 0x00c8: IPUT (r0v23 ?? I:com.facebook.messaging.model.threadkey.ThreadKey), (r308v5 ?? I:X.5pv) A[Catch: all -> 0x0401] X.5pv.A00 com.facebook.messaging.model.threadkey.ThreadKey
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
