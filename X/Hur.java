package X;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.device.DeviceConditionHelper;

/* loaded from: Hur.class */
public final class Hur {
    public PowerManager.WakeLock A00;
    public PowerManager.WakeLock A01;
    public PowerManager.WakeLock A02;
    public boolean A03;
    public WifiManager.WifiLock A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final Context A08;

    public Hur() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A08 = context;
        this.A06 = 1HG.A00(context, 100179);
        this.A07 = 1HG.A00(context, 100180);
        this.A05 = 1Bq.A00(17096);
    }

    public final void A00() {
        synchronized (this) {
            A03();
            A02();
            PowerManager.WakeLock wakeLock = this.A00;
            if (wakeLock != null && wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = this.A00;
                11T.A0D(wakeLock2);
                0Iz.A01(wakeLock2);
            }
            this.A00 = null;
            A01();
        }
    }

    public final void A01() {
        synchronized (this) {
            PowerManager.WakeLock wakeLock = this.A01;
            if (wakeLock != null && wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = this.A01;
                11T.A0D(wakeLock2);
                0Iz.A01(wakeLock2);
            }
            this.A01 = null;
        }
    }

    public final void A02() {
        synchronized (this) {
            PowerManager.WakeLock wakeLock = this.A02;
            if (wakeLock != null && wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = this.A02;
                11T.A0D(wakeLock2);
                0Iz.A01(wakeLock2);
            }
            this.A02 = null;
        }
    }

    public final void A03() {
        synchronized (this) {
            WifiManager.WifiLock wifiLock = this.A04;
            if (wifiLock != null && wifiLock.isHeld()) {
                WifiManager.WifiLock wifiLock2 = this.A04;
                11T.A0D(wifiLock2);
                wifiLock2.release();
            }
            this.A04 = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v12 ??, still in use, count: 2, list:
          (r303v12 ??) from 0x0038: PHI (r303v4 ??) = (r303v3 ??), (r303v12 ??) binds: [B:15:0x0027, B:20:0x0035] A[DONT_GENERATE, DONT_INLINE]
          (r303v12 ?? I:X.HZK) from 0x0035: SPUT (r303v12 ?? I:X.HZK) A[Catch: all -> 0x00ce] X.HZK.A01 X.HZK
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
    public final void A04(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v12 ??, still in use, count: 2, list:
          (r303v12 ??) from 0x0038: PHI (r303v4 ??) = (r303v3 ??), (r303v12 ??) binds: [B:15:0x0027, B:20:0x0035] A[DONT_GENERATE, DONT_INLINE]
          (r303v12 ?? I:X.HZK) from 0x0035: SPUT (r303v12 ?? I:X.HZK) A[Catch: all -> 0x00ce] X.HZK.A01 X.HZK
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

    public final void A05(String str) {
        synchronized (this) {
            A06(str);
            if (this.A00 == null) {
                PowerManager powerManager = (PowerManager) 1Br.A0B(this.A06);
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s:%s:%s", "IncallWakeLocks", "CPU", str);
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, formatStrLocaleSafe);
                0Ew.A02(newWakeLock, formatStrLocaleSafe);
                this.A00 = newWakeLock;
                11T.A0D(newWakeLock);
                0Iz.A02(newWakeLock);
            }
            PowerManager.WakeLock wakeLock = this.A00;
            11T.A0D(wakeLock);
            if (!wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = this.A00;
                11T.A0D(wakeLock2);
                0Iz.A00(wakeLock2);
            }
        }
    }

    public final void A06(String str) {
        synchronized (this) {
            if (((DeviceConditionHelper) 1Br.A0B(this.A05)).A03(true)) {
                if (this.A04 == null) {
                    WifiManager.WifiLock createWifiLock = ((WifiManager) 1Br.A0B(this.A07)).createWifiLock(3, StringFormatUtil.formatStrLocaleSafe("%s:%s:%s", "IncallWakeLocks", "WIFI", str));
                    this.A04 = createWifiLock;
                    11T.A0D(createWifiLock);
                    createWifiLock.setReferenceCounted(false);
                }
                WifiManager.WifiLock wifiLock = this.A04;
                11T.A0D(wifiLock);
                if (!wifiLock.isHeld()) {
                    WifiManager.WifiLock wifiLock2 = this.A04;
                    11T.A0D(wifiLock2);
                    wifiLock2.acquire();
                }
            }
        }
    }
}
