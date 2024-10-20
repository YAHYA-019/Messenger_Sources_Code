package com.facebook.contacts.upload;

import X.0S2;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1EZ;
import X.1Fw;
import X.1G1;
import X.1G3;
import X.1Hv;
import X.1I7;
import X.1Lo;
import X.1Rl;
import X.1Tu;
import X.1rC;
import X.2TU;
import X.3lM;
import X.4CF;
import X.AbH;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.C04033zm;
import X.C09844ro;
import X.C09864rq;
import X.CaQ;
import X.DKD;
import X.Eks;
import X.Ekt;
import X.F4X;
import X.Fcl;
import X.Fcm;
import X.Fi4;
import X.G6e;
import X.RDd;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.contacts.ContactSurface;
import com.facebook.contacts.server.UploadFriendFinderContactsParams;
import com.facebook.contacts.server.UploadFriendFinderContactsResult;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: ContactsUploadServiceHandler.class */
public final class ContactsUploadServiceHandler implements 1Tu {
    public static final ImmutableSet A0J = ImmutableSet.A02(ContactSurface.GROWTH_CONTACT_IMPORTER, ContactSurface.MESSENGER);
    public final 1I7 A01;
    public final MessengerNewCcuServiceHandler A07;
    public final 4CF A0A;
    public final Context A0G;
    public final Fi4 A0H;
    public final 2TU A06 = (2TU) 1Bi.A03(17027);
    public final F4X A09 = (F4X) 1Bi.A03(99877);
    public final C00i A0I = 1BQ.A02(84633);
    public final 1rC A05 = (1rC) 1Bi.A03(16831);
    public final CaQ A04 = (CaQ) 1Bi.A03(84808);
    public final C09844ro A08 = (C09844ro) 1Bn.A0A(49318);
    public final C00i A0C = 1BV.A00(49276);
    public final C00i A0E = AbH.A0S();
    public final C00i A0D = 1BQ.A01();
    public final C09864rq A0B = (C09864rq) 1Bn.A0A(82436);
    public boolean A00 = false;
    public final 3lM A02 = new Fcl(this);
    public final 3lM A03 = new Fcm(this);
    public final Comparator A0F = new G6e(this, 1);

    public ContactsUploadServiceHandler(Context context) {
        this.A0G = context;
        this.A01 = DKD.A0H(context);
        this.A0A = (4CF) 1Hv.A02(context, 32984);
        this.A07 = (MessengerNewCcuServiceHandler) 1Bn.A0E(context, (1BY) null, 99875);
        this.A0H = (Fi4) 1Bn.A0E(context, (1BY) null, 99371);
    }

    private UploadFriendFinderContactsResult A00(ImmutableList immutableList, ImmutableMap immutableMap, String str) {
        Integer num;
        String str2;
        String str3 = str;
        Context context = this.A0G;
        1EZ r0 = (1EZ) 1Bn.A0E(context, (1BY) null, 16428);
        C00j.A07("uploadContactBatchForFriendFinder (%d changes)", Integer.valueOf(immutableMap.size()), -149205110);
        if (str == null) {
            str3 = "(new import)";
        }
        int i = 0;
        do {
            try {
                0fH.A0d(str3, Integer.valueOf(immutableMap.size()), "com.facebook.contacts.upload.ContactsUploadServiceHandler", "Uploading contact batch %s ( %s changes)");
                Object A04 = 1Lo.A04(context, 1Fw.A04(r0), (1BY) null, 99873);
                Eks eks = (Eks) A04;
                synchronized (A04) {
                    C00i c00i = eks.A02;
                    c00i.get();
                    c00i.get();
                }
                Integer num2 = 0S2.A01;
                ImmutableList copyOf = ImmutableList.copyOf((Collection) immutableMap.values());
                boolean z = this.A00;
                synchronized (A04) {
                    Ekt ekt = eks.A01;
                    1G1 r02 = (FbUserSession) ekt.A02.get();
                    if (!r02.A07) {
                        String BD0 = 1BK.A0R(ekt.A01).BD0(1G3.A00(RDd.A0D, r02.A02));
                        if (BD0 != null) {
                            if (BD0.equals("PREFERENCE")) {
                                num = 0S2.A00;
                            } else if (BD0.equals("QE_CONTACTS_UPLOAD_PROTOCOL")) {
                                num = num2;
                            } else if (BD0.equals("GK_ANDROID_NEW_CONTACTS_UPLOAD")) {
                                num = 0S2.A0C;
                            } else if (BD0.equals("GK_ANDROID_NEW_CONTACTS_OMNI_UPLOAD")) {
                                num = 0S2.A0N;
                            } else if (BD0.equals("GK_ANDROID_OLD_CONTACTS_MESSENGER_UPLOAD")) {
                                num = 0S2.A0Y;
                            } else if (BD0.equals("OVERWRITE")) {
                                num = 0S2.A0j;
                            } else {
                                if (!BD0.equals("DEFAULT")) {
                                    throw AnonymousClass001.A0L(BD0);
                                }
                                num = 0S2.A0u;
                            }
                        }
                    }
                    num = 0S2.A0u;
                }
                switch (num.intValue()) {
                    case 0:
                        str2 = "PREFERENCE";
                        break;
                    case 1:
                        str2 = "QE_CONTACTS_UPLOAD_PROTOCOL";
                        break;
                    case 2:
                        str2 = "GK_ANDROID_NEW_CONTACTS_UPLOAD";
                        break;
                    case 3:
                        str2 = "GK_ANDROID_NEW_CONTACTS_OMNI_UPLOAD";
                        break;
                    case 4:
                        str2 = "GK_ANDROID_OLD_CONTACTS_MESSENGER_UPLOAD";
                        break;
                    case 5:
                        str2 = "OVERWRITE";
                        break;
                    default:
                        str2 = "DEFAULT";
                        break;
                }
                UploadFriendFinderContactsResult uploadFriendFinderContactsResult = (UploadFriendFinderContactsResult) ((1Rl) this.A0I.get()).A07((CallerContext) null, this.A0H, (C04033zm) null, new UploadFriendFinderContactsParams(num2, str3, str2, copyOf, z));
                this.A08.A01(immutableList);
                uploadFriendFinderContactsResult.getClass();
                C00j.A01(1822034863);
                return uploadFriendFinderContactsResult;
            } catch (IOException e) {
                i++;
                try {
                    0fH.A14("com.facebook.contacts.upload.ContactsUploadServiceHandler", "Failed to upload contact batch, (try %s of %s ), error: %s ", new Object[]{Integer.valueOf(i), 3, e});
                } catch (Throwable th) {
                    C00j.A01(-1713804322);
                    throw th;
                }
            }
        } while (i < 3);
        throw e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v21 ??, still in use, count: 4, list:
          (r303v21 ??) from 0x04ec: PHI (r303v20 ??) = (r303v13 ??), (r303v21 ??) binds: [B:377:0x0880, B:201:0x04e8] A[DONT_GENERATE, DONT_INLINE]
          (r303v21 ?? I:X.RMN) from 0x04d7: IPUT (r0v560 ?? I:X.QqO), (r303v21 ?? I:X.RMN) A[Catch: all -> 0x0a74] X.RMN.A02 X.QqO
          (r303v21 ?? I:X.RMN) from 0x04e4: IPUT (r0v563 ?? I:long), (r303v21 ?? I:X.RMN) A[Catch: all -> 0x0a74] X.RMN.A00 long
          (r303v21 ?? I:X.RMN) from 0x04e9: IPUT (r1v99 ?? I:com.facebook.contacts.model.PhonebookContact), (r303v21 ?? I:X.RMN) A[Catch: all -> 0x0a74] X.RMN.A01 com.facebook.contacts.model.PhonebookContact
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
    public com.facebook.fbservice.service.OperationResult BMQ(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v21 ??, still in use, count: 4, list:
          (r303v21 ??) from 0x04ec: PHI (r303v20 ??) = (r303v13 ??), (r303v21 ??) binds: [B:377:0x0880, B:201:0x04e8] A[DONT_GENERATE, DONT_INLINE]
          (r303v21 ?? I:X.RMN) from 0x04d7: IPUT (r0v560 ?? I:X.QqO), (r303v21 ?? I:X.RMN) A[Catch: all -> 0x0a74] X.RMN.A02 X.QqO
          (r303v21 ?? I:X.RMN) from 0x04e4: IPUT (r0v563 ?? I:long), (r303v21 ?? I:X.RMN) A[Catch: all -> 0x0a74] X.RMN.A00 long
          (r303v21 ?? I:X.RMN) from 0x04e9: IPUT (r1v99 ?? I:com.facebook.contacts.model.PhonebookContact), (r303v21 ?? I:X.RMN) A[Catch: all -> 0x0a74] X.RMN.A01 com.facebook.contacts.model.PhonebookContact
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
