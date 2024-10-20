package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: L8x.class */
public final class L8x {
    public static final Object A08 = AnonymousClass001.A0R();
    public static volatile L8x A09;
    public final MBt A02;
    public final MEZ A03;
    public final ReadWriteLock A06 = new ReentrantReadWriteLock();
    public volatile int A07 = 3;
    public final Handler A00 = AnonymousClass001.A07();
    public final Set A05 = AbI.A07();
    public final MBu A04 = new Object();
    public final Kie A01 = new Kie(this);

    /* JADX WARN: Type inference failed for: r0v11, types: [X.MBu, java.lang.Object] */
    public L8x(MBt mBt, MEZ mez) {
        this.A03 = mez;
        this.A02 = mBt;
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.writeLock().lock();
        JQz.A1S(readWriteLock);
        if (A01() == 0) {
            Kie kie = this.A01;
            try {
                kie.A00.A03.BYR(new JgI(kie));
            } catch (Throwable th) {
                kie.A00.A05(th);
            }
        }
    }

    public static L8x A00() {
        L8x l8x;
        synchronized (A08) {
            l8x = A09;
            0RZ.A06(AnonymousClass001.A1T(l8x), "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return l8x;
    }

    public int A01() {
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.readLock().lock();
        try {
            return this.A07;
        } finally {
            AnonymousClass001.A1K(readWriteLock);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v4 ??, still in use, count: 2, list:
          (r315v4 ??) from 0x0146: PHI (r315v3 ??) = (r315v1 ??), (r315v4 ??) binds: [B:93:0x0142, B:37:0x0120] A[DONT_GENERATE, DONT_INLINE]
          (r315v4 ?? I:X.LJk) from 0x0116: IPUT (r1v29 ?? I:boolean), (r315v4 ?? I:X.LJk) A[Catch: all -> 0x0232] X.LJk.A01 boolean
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
    public java.lang.CharSequence A02(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v4 ??, still in use, count: 2, list:
          (r315v4 ??) from 0x0146: PHI (r315v3 ??) = (r315v1 ??), (r315v4 ??) binds: [B:93:0x0142, B:37:0x0120] A[DONT_GENERATE, DONT_INLINE]
          (r315v4 ?? I:X.LJk) from 0x0116: IPUT (r1v29 ?? I:boolean), (r315v4 ?? I:X.LJk) A[Catch: all -> 0x0232] X.LJk.A01 boolean
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

    public void A03(EditorInfo editorInfo) {
        if (A01() != 1 || editorInfo == null) {
            return;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            bundle = 1BK.A05();
            editorInfo.extras = bundle;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", LA6.A00(this.A01.A02.A02));
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public void A04(KTB ktb) {
        String A00 = DKB.A00(421);
        0RZ.A03(ktb, A00);
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.writeLock().lock();
        try {
            if (this.A07 == 1 || this.A07 == 2) {
                Handler handler = this.A00;
                int i = this.A07;
                0RZ.A03(ktb, A00);
                handler.post(new Lp7(null, Arrays.asList(ktb), i));
            } else {
                this.A05.add(ktb);
            }
        } finally {
            JQz.A1S(readWriteLock);
        }
    }

    public void A05(Throwable th) {
        ArrayList A0s = AnonymousClass001.A0s();
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.writeLock().lock();
        try {
            this.A07 = 2;
            Set set = this.A05;
            A0s.addAll(set);
            set.clear();
            JQz.A1S(readWriteLock);
            this.A00.post(new Lp7(th, A0s, this.A07));
        } catch (Throwable th2) {
            JQz.A1S(readWriteLock);
            throw th2;
        }
    }
}
