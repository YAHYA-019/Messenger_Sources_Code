package com.facebook.crypto.module;

import X.02W;
import X.1BL;
import X.1Bi;
import X.1Fw;
import X.1G1;
import X.1PN;
import X.1UO;
import X.1UQ;
import X.1UY;
import X.1VR;
import X.1aD;
import X.2L5;
import X.C01s;
import X.DKB;
import com.facebook.account.switcher.storage.DeviceBasedLoginSessionPersister;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: LoggedInUserCrypto.class */
public final class LoggedInUserCrypto {
    public 1VR A00;
    public 1aD A01;
    public final C01s A02;
    public final List A03 = new ArrayList();
    public final FbUserSession A04;
    public final 1UQ A05;
    public final 1UY A06;
    public static final 1PN A08 = 1PN.A00.A01();
    public static SettableFuture A07 = new Object();

    /* loaded from: LoggedInUserCrypto$AuthListener.class */
    public final class AuthListener {
        public String A00;
        public final DeviceBasedLoginSessionPersister A01;
        public final C01s A02;
        public final LoggedInUserCrypto A03;
        public final String A04;

        public AuthListener() {
            LoggedInUserCrypto loggedInUserCrypto = (LoggedInUserCrypto) 1Bi.A03(65742);
            C01s A0I = 1BL.A0I();
            DeviceBasedLoginSessionPersister deviceBasedLoginSessionPersister = (DeviceBasedLoginSessionPersister) 1Bi.A03(49339);
            String str = 1Fw.A00().A02;
            this.A03 = loggedInUserCrypto;
            this.A02 = A0I;
            this.A04 = str;
            this.A01 = deviceBasedLoginSessionPersister;
        }
    }

    public LoggedInUserCrypto(FbUserSession fbUserSession, C01s c01s, 1UQ r304, 1UY r305) {
        this.A04 = fbUserSession;
        this.A02 = c01s;
        this.A06 = r305;
        this.A05 = r304;
        1G1 r0 = (1G1) fbUserSession;
        if (r0.A07) {
            return;
        }
        A00(this, r0.A02);
        A07.set(true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v5 ??, still in use, count: 2, list:
          (r305v5 ??) from 0x0164: PHI (r305v4 ??) = (r305v3 ??), (r305v5 ??) binds: [B:56:0x0152, B:60:0x0161] A[DONT_GENERATE, DONT_INLINE]
          (r305v5 ?? I:com.facebook.crypto.module.LoggedInUserCryptoHybrid) from 0x0161: SPUT (r305v5 ?? I:com.facebook.crypto.module.LoggedInUserCryptoHybrid) A[Catch: all -> 0x0175] com.facebook.crypto.module.LoggedInUserCryptoHybrid.sInstance com.facebook.crypto.module.LoggedInUserCryptoHybrid
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
    public static void A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v5 ??, still in use, count: 2, list:
          (r305v5 ??) from 0x0164: PHI (r305v4 ??) = (r305v3 ??), (r305v5 ??) binds: [B:56:0x0152, B:60:0x0161] A[DONT_GENERATE, DONT_INLINE]
          (r305v5 ?? I:com.facebook.crypto.module.LoggedInUserCryptoHybrid) from 0x0161: SPUT (r305v5 ?? I:com.facebook.crypto.module.LoggedInUserCryptoHybrid) A[Catch: all -> 0x0175] com.facebook.crypto.module.LoggedInUserCryptoHybrid.sInstance com.facebook.crypto.module.LoggedInUserCryptoHybrid
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

    public static void A01(LoggedInUserCrypto loggedInUserCrypto, boolean z) {
        synchronized (loggedInUserCrypto) {
            try {
                loggedInUserCrypto.A00.Bc8(z);
            } catch (Exception e) {
                loggedInUserCrypto.A02.softReport(DKB.A00(87), "Unexpected error disabling encryption", e);
            }
            List list = loggedInUserCrypto.A03;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((1UO) it.next()).D6D();
            }
            list.clear();
        }
    }

    public void A02(1UO r302) {
        synchronized (this) {
            try {
                02W.A04(((Boolean) A07.get(5000L, TimeUnit.MILLISECONDS)).booleanValue());
                List list = this.A03;
                try {
                    if (!list.contains(r302)) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (!this.A00.BN6()) {
                            this.A02.D0v(DKB.A00(87), "UserCrypto not available");
                            new 2L5();
                            throw th;
                        }
                        r302.CqL(this.A00.BN6() ? this.A00.getCipherKey() : null);
                        list.add(r302);
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    throw th3;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                new IllegalStateException("LoggedInUserCrypto is not initialized, ensureConfigure failed.", e);
            }
        }
    }
}
