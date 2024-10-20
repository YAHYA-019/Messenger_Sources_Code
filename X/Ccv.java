package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountsettings.plugins.settings.mesetting.AccountSettingsSetting;
import com.facebook.messaging.accountswitch.plugins.settings.mesetting.uprankdisabled.UprankDisabledAccountSwitchSetting;
import com.facebook.messaging.bugreporter.plugins.settings.mesettings.BugReporterSetting;
import com.facebook.messaging.help.plugins.helpcenter.mesetting.HelpSetting;
import com.facebook.messaging.integrity.supportinbox.plugins.mesettings.supportinboxsetting.SupportInboxSetting;
import com.facebook.messaging.passwordsetup.plugins.passwordsetupitem.passwordsetupsetting.PasswordSetupSettingImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccv.class */
public final class Ccv implements DIL {
    public AccountSettingsSetting A00;
    public BugReporterSetting A01;
    public HelpSetting A02;
    public BlX A03;
    public SupportInboxSetting A04;
    public PasswordSetupSettingImplementation A05;
    public C1v5 A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public C15h A0D;
    public C15h A0E;
    public UprankDisabledAccountSwitchSetting A0F;
    public Object A0G;
    public boolean A0H;
    public final Context A0I;
    public final 1YC A0J = 1YC.A03;
    public final 06Z A0K;
    public final FbUserSession A0L;
    public final 1pI A0M;
    public final DFp A0N;

    public Ccv(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A0I = context;
        this.A0N = dFp;
        this.A0K = r303;
        this.A0M = r305;
        this.A0L = fbUserSession;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A0H) {
                if (this.A0I == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MeSettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A06 = C1v5.A01;
                this.A0H = true;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v17 ??, still in use, count: 2, list:
          (r302v17 ??) from 0x00af: PHI (r302v7 ??) = (r302v6 ??), (r302v17 ??) binds: [B:17:0x0093, B:23:0x00ab] A[DONT_GENERATE, DONT_INLINE]
          (r302v17 ?? I:X.15h) from 0x00ac: IPUT (r302v17 ?? I:X.15h), (r301v0 'this' ?? I:X.Ccv A[IMMUTABLE_TYPE, THIS]) A[Catch: Exception -> 0x014c, all -> 0x0160] X.Ccv.A0D X.15h
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
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccv.A01():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v86 ??, still in use, count: 2, list:
          (r312v86 ??) from 0x01dc: PHI (r312v83 ??) = (r312v82 ??), (r312v86 ??) binds: [B:66:0x01b9, B:72:0x01d7] A[DONT_GENERATE, DONT_INLINE]
          (r312v86 ?? I:X.15h) from 0x01d9: IPUT (r312v86 ?? I:X.15h), (r301v0 'this' ?? I:X.Ccv A[IMMUTABLE_TYPE, THIS]) A[Catch: Exception -> 0x0245, all -> 0x025f] X.Ccv.A0E X.15h
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
    public X.C8e AKx(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v86 ??, still in use, count: 2, list:
          (r312v86 ??) from 0x01dc: PHI (r312v83 ??) = (r312v82 ??), (r312v86 ??) binds: [B:66:0x01b9, B:72:0x01d7] A[DONT_GENERATE, DONT_INLINE]
          (r312v86 ?? I:X.15h) from 0x01d9: IPUT (r312v86 ?? I:X.15h), (r301v0 'this' ?? I:X.Ccv A[IMMUTABLE_TYPE, THIS]) A[Catch: Exception -> 0x0245, all -> 0x025f] X.Ccv.A0E X.15h
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

    public ImmutableList AKy(MigColorScheme migColorScheme, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0J;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
        try {
            A00();
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
            return null;
        } catch (Throwable th) {
            r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
            throw th;
        }
    }

    public void dispose() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0J;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
        Exception e = null;
        try {
            A00();
            if (A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.accountswitch.plugins.settings.mesetting.uprankdisabled.UprankDisabledAccountSwitchSetting", "messaging.accountswitch.settings.mesetting.uprankdisabled.UprankDisabledAccountSwitchSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.accountswitch.plugins.settings.AccountswitchSettingsKillSwitch", "dispose");
                try {
                    try {
                        CHB chb = this.A0F.A01;
                        ((4IC) 1Br.A0B(chb.A00)).A02(chb.A03);
                        r0.A09("messaging.accountswitch.settings.mesetting.uprankdisabled.UprankDisabledAccountSwitchSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.accountswitch.settings.mesetting.uprankdisabled.UprankDisabledAccountSwitchSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
            throw th2;
        }
    }

    public void init() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0J;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
        Exception e = null;
        try {
            A00();
            if (A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.accountswitch.plugins.settings.mesetting.uprankdisabled.UprankDisabledAccountSwitchSetting", "messaging.accountswitch.settings.mesetting.uprankdisabled.UprankDisabledAccountSwitchSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.accountswitch.plugins.settings.AccountswitchSettingsKillSwitch", "init");
                try {
                    try {
                        CHB chb = this.A0F.A01;
                        ((4IC) 1Br.A0B(chb.A00)).A03(chb.A03);
                        r0.A09("messaging.accountswitch.settings.mesetting.uprankdisabled.UprankDisabledAccountSwitchSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.accountswitch.settings.mesetting.uprankdisabled.UprankDisabledAccountSwitchSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
            throw th2;
        }
    }
}
