package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.avatar.plugins.setting.profile.AvatarTopProfileSectionSetting;
import com.facebook.messaging.presence.plugins.core.activestatussettingsrow.ActiveStatusSettingsRow;
import com.facebook.messaging.qrcode.plugins.mesettings.QrCodeSetting;
import com.facebook.messaging.usernamesetting.plugins.mesetting.usernamesetting.UsernameSettingImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.plugins.status.statussetting.StatusSetting;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccx.class */
public final class Ccx implements DIL {
    public AvatarTopProfileSectionSetting A00;
    public C06 A01;
    public C1v5 A02;
    public ActiveStatusSettingsRow A03;
    public QrCodeSetting A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public C15h A08;
    public UsernameSettingImplementation A09;
    public StatusSetting A0A;
    public Object A0B;
    public Object A0C;
    public boolean A0D;
    public final Context A0E;
    public final FbUserSession A0F;
    public final 1pI A0G;
    public final 1YC A0H = 1YC.A03;
    public final DFp A0I;
    public final 06Z A0J;

    public Ccx(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A0E = context;
        this.A0I = dFp;
        this.A0J = r303;
        this.A0G = r305;
        this.A0F = fbUserSession;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A0D) {
                if (this.A0E == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MeSettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A02 = C1v5.A01;
                this.A0D = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da A[Catch: Exception -> 0x0131, all -> 0x013d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0131, blocks: (B:5:0x0043, B:9:0x004d, B:12:0x0057, B:15:0x00d3, B:17:0x0113, B:19:0x00da, B:21:0x00e5, B:24:0x00f1, B:26:0x00fe, B:27:0x0104, B:29:0x010a, B:30:0x010e, B:30:0x010e, B:32:0x0060, B:33:0x0065, B:36:0x0071, B:39:0x0079, B:40:0x0082, B:45:0x00c1, B:45:0x00c1, B:47:0x00c5, B:48:0x0091, B:50:0x00a1, B:58:0x00bc, B:66:0x011f, B:68:0x0129, B:70:0x0130), top: B:4:0x0043, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccx.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: Exception -> 0x015c, all -> 0x0168, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x015c, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x008d, B:17:0x0097, B:18:0x009e, B:20:0x00a9, B:21:0x00b0, B:23:0x00bc, B:26:0x00ca, B:27:0x00d1, B:28:0x00d8, B:31:0x00e4, B:32:0x00ea, B:34:0x00f5, B:37:0x0103, B:38:0x0109, B:39:0x010e, B:40:0x0113, B:42:0x011e, B:45:0x012c, B:46:0x0131, B:47:0x0137, B:49:0x0140, B:50:0x0145, B:51:0x0149, B:51:0x0149, B:54:0x0155, B:57:0x0150, B:58:0x005c, B:59:0x0061, B:62:0x006d, B:65:0x0075, B:67:0x0081), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccx.A02():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r319v9 ??, still in use, count: 2, list:
          (r319v9 ??) from 0x05cb: PHI (r319v6 ??) = (r319v5 ??), (r319v9 ??) binds: [B:260:0x05ae, B:265:0x05c6] A[DONT_GENERATE, DONT_INLINE]
          (r319v9 ?? I:X.15h) from 0x05c8: IPUT (r319v9 ?? I:X.15h), (r301v0 'this' ?? I:X.Ccx A[IMMUTABLE_TYPE, THIS]) A[Catch: Exception -> 0x0740, all -> 0x0745] X.Ccx.A08 X.15h
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r319v9 ??, still in use, count: 2, list:
          (r319v9 ??) from 0x05cb: PHI (r319v6 ??) = (r319v5 ??), (r319v9 ??) binds: [B:260:0x05ae, B:265:0x05c6] A[DONT_GENERATE, DONT_INLINE]
          (r319v9 ?? I:X.15h) from 0x05c8: IPUT (r319v9 ?? I:X.15h), (r301v0 'this' ?? I:X.Ccx A[IMMUTABLE_TYPE, THIS]) A[Catch: Exception -> 0x0740, all -> 0x0745] X.Ccx.A08 X.15h
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
        1YC r0 = this.A0H;
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
        1PA r0;
        int andIncrement;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r02 = this.A0H;
        r02.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
        try {
            A00();
            try {
                if (A02()) {
                    andIncrement = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.presence.plugins.status.statussetting.StatusSetting", "presence.status.statussetting.StatusSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.presence.plugins.status.StatusKillSwitch", "dispose");
                    try {
                        StatusSetting statusSetting = this.A0A;
                        FbUserSession A03 = 1Br.A03(statusSetting.A02);
                        C8Z c8z = statusSetting.A04;
                        11T.A0F(A03, 0);
                        c8z.A07.set(false);
                        2Ti r03 = c8z.A01;
                        if (r03 != null) {
                            ((2Tj) 1Lm.A05(c8z.A02, A03, 33122)).A06(r03);
                        }
                        r02.A09("presence.status.statussetting.StatusSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A01()) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.usernamesetting.plugins.mesetting.usernamesetting.UsernameSettingImplementation", "messaging.usernamesetting.mesetting.usernamesetting.UsernameSettingImplementation", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement3, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.usernamesetting.plugins.mesetting.UsernamesettingMesettingKillSwitch", "dispose");
                    C1y c1y = this.A09.A01;
                    if (c1y != null) {
                        synchronized (c1y) {
                            r0 = c1y.A00;
                            c1y.A00 = null;
                        }
                        if (r0 != null) {
                            r0.A01();
                        }
                    }
                    r02.A09("messaging.usernamesetting.mesetting.usernamesetting.UsernameSettingImplementation", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement3);
                }
                r02.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
            } catch (Throwable th) {
                r02.A04((Exception) null, "presence.status.statussetting.StatusSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r02.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
            throw th2;
        }
    }

    public void init() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0H;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
        try {
            A00();
            if (A02()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.presence.plugins.status.statussetting.StatusSetting", "presence.status.statussetting.StatusSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.presence.plugins.status.StatusKillSwitch", "init");
                    try {
                        StatusSetting statusSetting = this.A0A;
                        statusSetting.A04.A01(statusSetting.A03);
                        r0.A09("presence.status.statussetting.StatusSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "presence.status.statussetting.StatusSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
            throw th2;
        }
    }
}
