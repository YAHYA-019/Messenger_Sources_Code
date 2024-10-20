package com.facebook.messaging.wellbeing.selfremediation.block.group.blockmember;

import X.06Z;
import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1P9;
import X.1PA;
import X.1YC;
import X.1iF;
import X.1tC;
import X.2O4;
import X.6oD;
import X.7EN;
import X.9uV;
import X.AbK;
import X.AbN;
import X.AnonymousClass472;
import X.BNT;
import X.BiX;
import X.C1Y6;
import X.D0U;
import X.DG4;
import X.DHc;
import X.DIi;
import X.RQA;
import X.RgU;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.groupmemberdata.ThreadSummaryGroupMemberDataProviderImplementation;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: BlockMemberFragment.class */
public final class BlockMemberFragment extends SlidingSheetFullScreenDialogFragment implements DG4 {
    public 2O4 A00;
    public LithoView A01;
    public ThreadKey A02;
    public DHc A03;
    public BiX A04;
    public RQA A05;
    public MigColorScheme A06;
    public FbUserSession A07;
    public DIi A08;
    public BNT A09 = BNT.A0g;
    public final 1Br A0A = 1Bu.A02(this, 50188);
    public final 1Br A0B = 1Bq.A00(82525);

    public static final int A05(BlockMemberFragment blockMemberFragment) {
        int i;
        if (blockMemberFragment.A09 == BNT.A0G && ((6oD) 1Br.A0B(blockMemberFragment.A0B)).A03()) {
            i = 2131957393;
        } else {
            ThreadKey threadKey = blockMemberFragment.A02;
            if (threadKey == null) {
                return 2131957394;
            }
            i = 2131957392;
            if (!threadKey.A1A()) {
                return 2131957394;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(BlockMemberFragment blockMemberFragment, User user) {
        06Z r0 = blockMemberFragment.mFragmentManager;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        if (blockMemberFragment.A02 == null) {
            throw 1BK.A0h();
        }
        7EN r02 = (7EN) 1Br.A0B(blockMemberFragment.A0A);
        RQA rqa = blockMemberFragment.A05;
        if (rqa == null) {
            11T.A0L("membersDataProvider");
            throw 0Q8.createAndThrow();
        }
        ThreadSummary A00 = rqa.A00();
        BNT bnt = BNT.A0D;
        ((AnonymousClass472) 1Bn.A0E(r02.A01, (1BY) null, 67579)).A00(user.A0k).A02(new 9uV(2, r0, A00, blockMemberFragment.A03, bnt, r02, user));
    }

    public 1iF A17() {
        return AbN.A0B();
    }

    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public boolean A1C() {
        BiX biX = this.A04;
        if (biX == null) {
            return false;
        }
        biX.A00.A09.A00();
        return false;
    }

    @Override // X.DG4
    public void ClX(DIi dIi) {
        11T.A0F(dIi, 0);
        this.A08 = dIi;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v2 ??, still in use, count: 4, list:
          (r308v2 ??) from 0x042f: PHI (r308v3 ??) = (r308v2 ??), (r308v4 ??) binds: [B:217:0x050d, B:169:0x0428] A[DONT_GENERATE, DONT_INLINE]
          (r308v2 ?? I:androidx.lifecycle.MediatorLiveData) from 0x04a9: INVOKE 
          (r308v2 ?? I:androidx.lifecycle.MediatorLiveData)
          (r0v209 ?? I:androidx.lifecycle.LiveData)
          (r0v212 ?? I:androidx.lifecycle.Observer)
         VIRTUAL call: androidx.lifecycle.MediatorLiveData.addSource(androidx.lifecycle.LiveData, androidx.lifecycle.Observer):void A[Catch: Exception -> 0x05d8, all -> 0x05dd, MD:(androidx.lifecycle.LiveData, androidx.lifecycle.Observer):void (m)]
          (r308v2 ?? I:java.lang.Object) from 0x04cd: INVOKE (r0v221 ?? I:X.CaD), (r308v2 ?? I:java.lang.Object), (r0v168 ?? I:java.lang.Object), (r0v220 ?? I:int) DIRECT call: X.CaD.<init>(java.lang.Object, java.lang.Object, int):void A[Catch: Exception -> 0x05d8, all -> 0x05dd]
          (r308v2 ?? I:androidx.lifecycle.MediatorLiveData) from 0x04d6: INVOKE 
          (r308v2 ?? I:androidx.lifecycle.MediatorLiveData)
          (r0v215 ?? I:androidx.lifecycle.LiveData)
          (r0v221 ?? I:androidx.lifecycle.Observer)
         VIRTUAL call: androidx.lifecycle.MediatorLiveData.addSource(androidx.lifecycle.LiveData, androidx.lifecycle.Observer):void A[Catch: Exception -> 0x05d8, all -> 0x05dd, MD:(androidx.lifecycle.LiveData, androidx.lifecycle.Observer):void (m)]
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
    /* JADX WARN: Not initialized variable reg: 325, insn: 0x05f3: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r325 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:248:0x05df */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment, com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v2 ??, still in use, count: 4, list:
          (r308v2 ??) from 0x042f: PHI (r308v3 ??) = (r308v2 ??), (r308v4 ??) binds: [B:217:0x050d, B:169:0x0428] A[DONT_GENERATE, DONT_INLINE]
          (r308v2 ?? I:androidx.lifecycle.MediatorLiveData) from 0x04a9: INVOKE 
          (r308v2 ?? I:androidx.lifecycle.MediatorLiveData)
          (r0v209 ?? I:androidx.lifecycle.LiveData)
          (r0v212 ?? I:androidx.lifecycle.Observer)
         VIRTUAL call: androidx.lifecycle.MediatorLiveData.addSource(androidx.lifecycle.LiveData, androidx.lifecycle.Observer):void A[Catch: Exception -> 0x05d8, all -> 0x05dd, MD:(androidx.lifecycle.LiveData, androidx.lifecycle.Observer):void (m)]
          (r308v2 ?? I:java.lang.Object) from 0x04cd: INVOKE (r0v221 ?? I:X.CaD), (r308v2 ?? I:java.lang.Object), (r0v168 ?? I:java.lang.Object), (r0v220 ?? I:int) DIRECT call: X.CaD.<init>(java.lang.Object, java.lang.Object, int):void A[Catch: Exception -> 0x05d8, all -> 0x05dd]
          (r308v2 ?? I:androidx.lifecycle.MediatorLiveData) from 0x04d6: INVOKE 
          (r308v2 ?? I:androidx.lifecycle.MediatorLiveData)
          (r0v215 ?? I:androidx.lifecycle.LiveData)
          (r0v221 ?? I:androidx.lifecycle.Observer)
         VIRTUAL call: androidx.lifecycle.MediatorLiveData.addSource(androidx.lifecycle.LiveData, androidx.lifecycle.Observer):void A[Catch: Exception -> 0x05d8, all -> 0x05dd, MD:(androidx.lifecycle.LiveData, androidx.lifecycle.Observer):void (m)]
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

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int A02 = 0FI.A02(-194598832);
        LithoView A0O = AbK.A0O(this);
        this.A01 = A0O;
        MigColorScheme migColorScheme = this.A06;
        if (migColorScheme != null) {
            MigColorScheme.A00(A0O, migColorScheme);
            A0O.setId(2131362463);
            1BV A00 = 1BV.A00(16838);
            Dialog dialog = ((0D2) this).A01;
            if (dialog == null) {
                if (A1B()) {
                    window = A16().getWindow();
                }
                0FI.A08(1727147682, A02);
                return A0O;
            }
            window = dialog.getWindow();
            if (window != null) {
                1tC r0 = (1tC) A00.get();
                MigColorScheme migColorScheme2 = this.A06;
                if (migColorScheme2 != null) {
                    r0.A03(window, migColorScheme2);
                }
            }
            0FI.A08(1727147682, A02);
            return A0O;
        }
        11T.A0L("colorScheme");
        throw 0Q8.createAndThrow();
    }

    public void onDestroyView() {
        int andIncrement;
        String str;
        int A02 = 0FI.A02(394401405);
        super.onDestroyView();
        this.A01 = null;
        RQA rqa = this.A05;
        if (rqa == null) {
            11T.A0L("membersDataProvider");
            throw 0Q8.createAndThrow();
        }
        RgU rgU = rqa.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = rgU.A06;
        r0.A08("com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onViewDestroyed", andIncrement2);
        Exception e = null;
        try {
            if (RgU.A00(rgU)) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.block.core.graphqlthreadmemberdata.CommunityBlockThreadMemberGraphQLDataSource";
                r0.A0A("com.facebook.messaging.communitymessaging.block.plugins.core.graphqlthreadmemberdata.CommunityBlockThreadMemberGraphQLDataSource", str, "com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", andIncrement, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "com.facebook.messaging.communitymessaging.block.plugins.core.CommunitymessagingBlockCoreKillSwitch", "onViewDestroyed");
            } else if (RgU.A01(rgU)) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.block.core.groupmemberdata.CommunityGroupMemberDataProviderImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.block.plugins.core.groupmemberdata.CommunityGroupMemberDataProviderImplementation", str, "com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", andIncrement, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "com.facebook.messaging.communitymessaging.block.plugins.core.CommunitymessagingBlockCoreKillSwitch", "onViewDestroyed");
            } else {
                if (!RgU.A02(rgU)) {
                    r0.A02((Exception) null, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onViewDestroyed", andIncrement2);
                    0FI.A08(-2080212027, A02);
                }
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.wellbeing.selfremediation.block.core.groupmemberdata.ThreadSummaryGroupMemberDataProviderImplementation";
                r0.A0A("com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.groupmemberdata.ThreadSummaryGroupMemberDataProviderImplementation", str, "com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", andIncrement, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.WellbeingSelfremediationBlockCoreKillSwitch", "onViewDestroyed");
                try {
                    try {
                        1PA r02 = rgU.A02.A00;
                        if (r02 != null) {
                            r02.A01();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onViewDestroyed", andIncrement);
                    throw th;
                }
            }
            r0.A09(str, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onViewDestroyed", andIncrement);
            r0.A02((Exception) null, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onViewDestroyed", andIncrement2);
            0FI.A08(-2080212027, A02);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onViewDestroyed", andIncrement2);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int andIncrement;
        String str;
        int A02 = 0FI.A02(877333926);
        super/*androidx.fragment.app.Fragment*/.onResume();
        RQA rqa = this.A05;
        if (rqa == null) {
            11T.A0L("membersDataProvider");
            throw 0Q8.createAndThrow();
        }
        RgU rgU = rqa.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = rgU.A06;
        r0.A08("com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onResume", andIncrement2);
        Exception e = null;
        try {
            if (RgU.A00(rgU)) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.block.core.graphqlthreadmemberdata.CommunityBlockThreadMemberGraphQLDataSource";
                r0.A0A("com.facebook.messaging.communitymessaging.block.plugins.core.graphqlthreadmemberdata.CommunityBlockThreadMemberGraphQLDataSource", str, "com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", andIncrement, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "com.facebook.messaging.communitymessaging.block.plugins.core.CommunitymessagingBlockCoreKillSwitch", "onResume");
            } else {
                if (!RgU.A01(rgU)) {
                    if (RgU.A02(rgU)) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str = "messaging.wellbeing.selfremediation.block.core.groupmemberdata.ThreadSummaryGroupMemberDataProviderImplementation";
                        r0.A0A("com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.groupmemberdata.ThreadSummaryGroupMemberDataProviderImplementation", str, "com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", andIncrement, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.WellbeingSelfremediationBlockCoreKillSwitch", "onResume");
                        try {
                            try {
                                ThreadSummaryGroupMemberDataProviderImplementation threadSummaryGroupMemberDataProviderImplementation = rgU.A02;
                                ThreadSummaryGroupMemberDataProviderImplementation.A00(threadSummaryGroupMemberDataProviderImplementation);
                                1PA r304 = threadSummaryGroupMemberDataProviderImplementation.A00;
                                if (r304 == null) {
                                    r304 = D0U.A00(1P9.A00(threadSummaryGroupMemberDataProviderImplementation.A04.A00), threadSummaryGroupMemberDataProviderImplementation, 30);
                                    threadSummaryGroupMemberDataProviderImplementation.A00 = r304;
                                }
                                r304.A00();
                            } catch (Exception e2) {
                                e = e2;
                                throw e;
                            }
                        } catch (Throwable th) {
                            r0.A04(e, str, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onResume", andIncrement);
                            throw th;
                        }
                    }
                    r0.A02((Exception) null, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onResume", andIncrement2);
                    0FI.A08(-1362938709, A02);
                }
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.block.core.groupmemberdata.CommunityGroupMemberDataProviderImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.block.plugins.core.groupmemberdata.CommunityGroupMemberDataProviderImplementation", str, "com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", andIncrement, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "com.facebook.messaging.communitymessaging.block.plugins.core.CommunitymessagingBlockCoreKillSwitch", "onResume");
            }
            r0.A09(str, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onResume", andIncrement);
            r0.A02((Exception) null, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onResume", andIncrement2);
            0FI.A08(-1362938709, A02);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.wellbeing.selfremediation.block.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec", "onResume", andIncrement2);
            throw th2;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        DIi dIi = this.A08;
        if (dIi != null) {
            dIi.Cgk(A05(this));
            dIi.CuY(false);
        }
    }
}
