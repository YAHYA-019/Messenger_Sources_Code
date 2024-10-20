package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.plugins.automations.mesettings.BusinessAutomationSettings;
import com.facebook.messaging.business.plugins.leadoutcomes.leadformsettings.LeadFormSettings;
import com.facebook.messaging.business.plugins.responsivenesstracker.mesettings.ResponsivenessTrackerSetting;
import com.facebook.messaging.business.plugins.suggestedreply.settings.mesettings.SuggestedReplyMeSettings;
import com.facebook.messaging.nativepagereply.plugins.catalog.mesettings.BusinessInboxCatalogSetting;
import com.facebook.messaging.nativepagereply.plugins.datapermissions.mesettings.BusinessInboxDataPermissionsSetting;
import com.facebook.messaging.nativepagereply.plugins.faq.mesettings.BusinessInboxFAQSetting;
import com.facebook.messaging.nativepagereply.plugins.savedreplies.mesettings.BusinessInboxSavedRepliesSetting;
import com.facebook.messaging.nativepagereply.plugins.toolstab.mesettings.BusinessInboxToolsTabSetting;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Cct.class */
public final class Cct implements DIL {
    public BusinessAutomationSettings A00;
    public LeadFormSettings A01;
    public ResponsivenessTrackerSetting A02;
    public SuggestedReplyMeSettings A03;
    public BusinessInboxCatalogSetting A04;
    public BusinessInboxDataPermissionsSetting A05;
    public BusinessInboxFAQSetting A06;
    public BusinessInboxSavedRepliesSetting A07;
    public BusinessInboxToolsTabSetting A08;
    public 2P9 A09;
    public C1v5 A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public Object A0E;
    public Object A0F;
    public Object A0G;
    public Object A0H;
    public Object A0I;
    public Object A0J;
    public C15h A0K;
    public C15h A0L;
    public boolean A0M;
    public final Context A0N;
    public final 06Z A0O;
    public final FbUserSession A0P;
    public final 1YC A0Q = 1YC.A03;
    public final DFp A0R;
    public final 1pI A0S;

    public Cct(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A0N = context;
        this.A0R = dFp;
        this.A0O = r303;
        this.A0S = r305;
        this.A0P = fbUserSession;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A0M) {
                if (this.A0N == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MeSettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A0A = C1v5.A01;
                this.A0M = true;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r323v16 ??, still in use, count: 2, list:
          (r323v16 ??) from 0x0122: PHI (r323v15 ??) = (r323v14 ??), (r323v16 ??) binds: [B:42:0x00ff, B:48:0x011d] A[DONT_GENERATE, DONT_INLINE]
          (r323v16 ?? I:X.15h) from 0x011f: IPUT (r323v16 ?? I:X.15h), (r301v0 'this' ?? I:X.Cct A[IMMUTABLE_TYPE, THIS]) A[Catch: Exception -> 0x018a, all -> 0x01a4] X.Cct.A0L X.15h
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r323v16 ??, still in use, count: 2, list:
          (r323v16 ??) from 0x0122: PHI (r323v15 ??) = (r323v14 ??), (r323v16 ??) binds: [B:42:0x00ff, B:48:0x011d] A[DONT_GENERATE, DONT_INLINE]
          (r323v16 ?? I:X.15h) from 0x011f: IPUT (r323v16 ?? I:X.15h), (r301v0 'this' ?? I:X.Cct A[IMMUTABLE_TYPE, THIS]) A[Catch: Exception -> 0x018a, all -> 0x01a4] X.Cct.A0L X.15h
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
        1YC r0 = this.A0Q;
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
        int A00 = 1BK.A00();
        1YC r0 = this.A0Q;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", A00);
        }
    }

    public void init() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0Q;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", A00);
        }
    }
}
