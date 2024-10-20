package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountswitch.plugins.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting;
import com.facebook.messaging.nativepagereply.plugins.mesettings.accountrow.AccountsSectionAccountRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccw.class */
public final class Ccw implements DIL {
    public C15h A00;
    public UprankEnabledAccountSwitchSetting A01;
    public AccountsSectionAccountRow A02;
    public C1v5 A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final Context A07;
    public final 06Z A08;
    public final FbUserSession A09;
    public final 1pI A0A;
    public final 1YC A0B = 1YC.A03;
    public final DFp A0C;

    public Ccw(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A07 = context;
        this.A0C = dFp;
        this.A08 = r303;
        this.A0A = r305;
        this.A09 = fbUserSession;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A06) {
                if (this.A07 == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MeSettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A03 = C1v5.A01;
                this.A06 = true;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v17 ??, still in use, count: 2, list:
          (r302v17 ??) from 0x00af: PHI (r302v7 ??) = (r302v6 ??), (r302v17 ??) binds: [B:17:0x0093, B:23:0x00ab] A[DONT_GENERATE, DONT_INLINE]
          (r302v17 ?? I:X.15h) from 0x00ac: IPUT (r302v17 ?? I:X.15h), (r301v0 'this' ?? I:X.Ccw A[IMMUTABLE_TYPE, THIS]) A[Catch: Exception -> 0x014c, all -> 0x0160] X.Ccw.A00 X.15h
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
        throw new UnsupportedOperationException("Method not decompiled: X.Ccw.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d8 A[Catch: Exception -> 0x0121, all -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0121, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00d8, B:17:0x00e5, B:18:0x00eb, B:20:0x00f1, B:21:0x00f5, B:21:0x00f5, B:24:0x0101, B:26:0x00fc, B:27:0x005c, B:28:0x0061, B:31:0x006d, B:34:0x0075, B:35:0x007e, B:40:0x00c9, B:40:0x00c9, B:42:0x00cd, B:43:0x008d, B:45:0x009b, B:55:0x00c4, B:63:0x010f, B:65:0x0119, B:67:0x0120), top: B:4:0x003f, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fc A[Catch: Exception -> 0x0121, all -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0121, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00d8, B:17:0x00e5, B:18:0x00eb, B:20:0x00f1, B:21:0x00f5, B:21:0x00f5, B:24:0x0101, B:26:0x00fc, B:27:0x005c, B:28:0x0061, B:31:0x006d, B:34:0x0075, B:35:0x007e, B:40:0x00c9, B:40:0x00c9, B:42:0x00cd, B:43:0x008d, B:45:0x009b, B:55:0x00c4, B:63:0x010f, B:65:0x0119, B:67:0x0120), top: B:4:0x003f, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccw.A02():boolean");
    }

    public C8e AKx(MigColorScheme migColorScheme, String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0B;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement);
        Exception e = null;
        try {
            A00();
            C8e c8e = null;
            if (str.equals("AccountSwitchSetting") && A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.accountswitch.plugins.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting", "messaging.accountswitch.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.accountswitch.plugins.settings.AccountswitchSettingsKillSwitch", "createSettingsRowItem");
                try {
                    try {
                        UprankEnabledAccountSwitchSetting uprankEnabledAccountSwitchSetting = this.A01;
                        Context context = this.A07;
                        11T.A0H(migColorScheme, context);
                        c8e = uprankEnabledAccountSwitchSetting.A01.A00(context, migColorScheme);
                        r0.A09("messaging.accountswitch.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.accountswitch.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement);
            return c8e;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement);
            throw th2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v61 ??, still in use, count: 2, list:
          (r315v61 ??) from 0x030e: PHI (r315v60 ??) = (r315v59 ??), (r315v61 ??) binds: [B:133:0x02f5, B:137:0x0309] A[DONT_GENERATE, DONT_INLINE]
          (r315v61 ?? I:X.1HN) from 0x030b: IPUT (r315v61 ?? I:X.1HN), (r0v286 ?? I:X.CPl) A[Catch: Exception -> 0x0622, all -> 0x0627] X.CPl.A04 X.1HN
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
    public com.google.common.collect.ImmutableList AKy(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v61 ??, still in use, count: 2, list:
          (r315v61 ??) from 0x030e: PHI (r315v60 ??) = (r315v59 ??), (r315v61 ??) binds: [B:133:0x02f5, B:137:0x0309] A[DONT_GENERATE, DONT_INLINE]
          (r315v61 ?? I:X.1HN) from 0x030b: IPUT (r315v61 ?? I:X.1HN), (r0v286 ?? I:X.CPl) A[Catch: Exception -> 0x0622, all -> 0x0627] X.CPl.A04 X.1HN
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

    public void dispose() {
        String str;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0B;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
        try {
            A00();
            try {
                if (A02()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.nativepagereply.mesettings.accountrow.AccountsSectionAccountRow";
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.mesettings.accountrow.AccountsSectionAccountRow", str, "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", i, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.mesettings.MeSettingsAccountsSectionKillSwitch", "dispose");
                    try {
                        AccountsSectionAccountRow accountsSectionAccountRow = this.A02;
                        CHO cho = (CHO) accountsSectionAccountRow.A02.get();
                        if (cho.A00 != null) {
                            C00i c00i = cho.A01;
                            1BK.A0R(c00i).D65(cho.A00, C1f0.A0G);
                            1BK.A0R(c00i).D65(cho.A00, C2bv.A0R);
                            cho.A00 = null;
                        }
                        CPl cPl = accountsSectionAccountRow.A00;
                        if (cPl != null) {
                            cPl.A0C(cPl.A04);
                            AbF.A0X(cPl.A0L).CqZ(null);
                        }
                        accountsSectionAccountRow.A00 = null;
                        r0.A09(str, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A01()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.accountswitch.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting";
                    r0.A0A("com.facebook.messaging.accountswitch.plugins.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting", str, "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", i, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.accountswitch.plugins.settings.AccountswitchSettingsKillSwitch", "dispose");
                    CHB chb = this.A01.A01;
                    ((4IC) 1Br.A0B(chb.A00)).A02(chb.A03);
                    r0.A09(str, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", i);
                }
                r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
            throw th2;
        }
    }

    public void init() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0B;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
        Exception e = null;
        try {
            A00();
            if (A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.accountswitch.plugins.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting", "messaging.accountswitch.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.accountswitch.plugins.settings.AccountswitchSettingsKillSwitch", "init");
                try {
                    try {
                        CHB chb = this.A01.A01;
                        ((4IC) 1Br.A0B(chb.A00)).A03(chb.A03);
                        r0.A09("messaging.accountswitch.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.accountswitch.settings.mesetting.uprankenabled.UprankEnabledAccountSwitchSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
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
