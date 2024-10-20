package com.facebook.messaging.analytics.reliability;

import X.0S2;
import X.1BK;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1CO;
import X.1G2;
import X.1NK;
import X.1Ql;
import X.9AW;
import X.C00653oY;
import X.C00i;
import X.C0dp;
import X.C11814xl;
import X.C11824xm;
import X.C1kw;
import X.K92;
import android.util.Base64;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* loaded from: AggregatedReliabilityLogger.class */
public class AggregatedReliabilityLogger {
    public static final 1G2 A09 = 1NK.A24.A0D("reliability_serialized");
    public LinkedHashMap A00;
    public final C1kw A01;
    public final C0dp A02;
    public final C00i A03;
    public final C11814xl A04;
    public final C11824xm A05;
    public final C00653oY A06;
    public final 1CO A07;
    public final FbSharedPreferences A08;

    /* loaded from: AggregatedReliabilityLogger$ReliabilityInfo.class */
    public class ReliabilityInfo implements Serializable {
        public static final long serialVersionUID = -7196522877148772764L;
        public final String messageType;
        public final long sendAttemptTimestamp;
        public final String threadKeyFbId;
        public final String threadType;
        public int mqttAttempts = 0;
        public int graphAttempts = 0;
        public long timeSinceFirstSendAttempt = -1;
        public Outcome outcome = Outcome.UNKNOWN;

        /* loaded from: AggregatedReliabilityLogger$ReliabilityInfo$Outcome.class */
        public enum Outcome {
            UNKNOWN("u"),
            SUCCESS_MQTT("m"),
            SUCCESS_GRAPH("g"),
            FAILURE_RETRYABLE("f"),
            FAILURE_PERMANENT(K92.__redex_internal_original_name);

            public final String rawValue;

            Outcome(String str) {
                this.rawValue = str;
            }
        }

        public ReliabilityInfo(long j, String str, String str2, String str3) {
            this.sendAttemptTimestamp = j;
            this.messageType = str;
            this.threadType = str2;
            this.threadKeyFbId = str3;
        }
    }

    public AggregatedReliabilityLogger() {
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        C00653oY c00653oY = (C00653oY) 1Bi.A03(32769);
        C1kw c1kw = (C1kw) 1Bi.A03(16772);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        1BQ r0 = new 1BQ(16511);
        C11814xl c11814xl = (C11814xl) 1Bi.A03(49382);
        C11824xm c11824xm = (C11824xm) 1Bn.A0A(49383);
        this.A00 = null;
        1CO r02 = (1CO) 1Bi.A03(16385);
        this.A02 = c0dp;
        this.A06 = c00653oY;
        this.A01 = c1kw;
        this.A08 = fbSharedPreferences;
        this.A03 = r0;
        this.A07 = r02;
        this.A04 = c11814xl;
        this.A05 = c11824xm;
    }

    public static void A00(AggregatedReliabilityLogger aggregatedReliabilityLogger) {
        synchronized (aggregatedReliabilityLogger) {
            try {
                A03(aggregatedReliabilityLogger);
                A01(aggregatedReliabilityLogger);
            } catch (Exception unused) {
                1BK.A09(aggregatedReliabilityLogger.A03).D0v("reliability_logger_on_reliability_cata_changed_fail", "Failed to update aggregated reliability data");
            }
        }
    }

    public static void A01(AggregatedReliabilityLogger aggregatedReliabilityLogger) {
        synchronized (aggregatedReliabilityLogger) {
            if (aggregatedReliabilityLogger.A00 != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(aggregatedReliabilityLogger.A00);
                    objectOutputStream.flush();
                    String str = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0));
                    objectOutputStream.close();
                    1Ql edit = aggregatedReliabilityLogger.A08.edit();
                    edit.CaL(A09, str);
                    edit.commit();
                } catch (IOException e) {
                    1BK.A09(aggregatedReliabilityLogger.A03).softReport("reliabilities_serialization_failed", e);
                    1Ql edit2 = aggregatedReliabilityLogger.A08.edit();
                    edit2.Cdj(A09);
                    edit2.commit();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r305 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger r301) {
        /*
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            java.util.LinkedHashMap r0 = r0.A00     // Catch: java.lang.Throwable -> La2
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L9a
            r0 = r301
            com.facebook.prefs.shared.FbSharedPreferences r0 = r0.A08     // Catch: java.lang.Throwable -> L8d
            r303 = r0
            X.1G2 r0 = com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger.A09     // Catch: java.lang.Throwable -> L8d
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.String r0 = r0.BD0(r1)     // Catch: java.lang.Throwable -> L8d
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L2f
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L8d
            r305 = r0
            r0 = r305
            r0.<init>()     // Catch: java.lang.Throwable -> L8d
            goto L84
        L2f:
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
            r0 = r305
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L8d
            r302 = r0
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L8d
            r305 = r0
            r0 = r305
            r1 = r302
            r0.<init>(r1)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L8d
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L60 java.lang.Exception -> L60 java.lang.Throwable -> L8d java.lang.Throwable -> L8d
            r302 = r0
            r0 = r302
            r1 = r305
            r0.<init>(r1)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L8d
            r0 = r302
            java.lang.Object r0 = r0.readObject()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L8d
            r305 = r0
            r0 = r305
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L8d
            r305 = r0
            goto L84
        L60:
            r307 = move-exception
            r0 = r301
            X.00i r0 = r0.A03     // Catch: java.lang.Throwable -> L8d
            r302 = r0
            r0 = r302
            X.01s r0 = X.1BK.A09(r0)     // Catch: java.lang.Throwable -> L8d
            r305 = r0
            java.lang.String r0 = "bad_reliabilities_deserialization"
            r302 = r0
            r0 = r305
            r1 = r302
            r2 = r307
            r0.softReport(r1, r2)     // Catch: java.lang.Throwable -> L8d
            r0 = r303
            r1 = r304
            X.4YV.A1J(r0, r1)     // Catch: java.lang.Throwable -> L8d
            java.util.LinkedHashMap r0 = X.1BK.A1C()     // Catch: java.lang.Throwable -> L8d java.lang.Throwable -> L8d
            r305 = r0
        L84:
            r0 = r301
            r1 = r305
            r0.A00 = r1     // Catch: java.lang.Throwable -> La2
            goto L90
        L8d:
            r302 = move-exception
            r0 = r302
            throw r0     // Catch: java.lang.Throwable -> La2
        L90:
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
            r0 = r305
            if (r0 == 0) goto L9d
        L9a:
            r0 = 1
            r306 = r0
        L9d:
            r0 = r301
            monitor-exit(r0)
            r0 = r306
            return r0
        La2:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger.A02(com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x02a9  */
    /* JADX WARN: Type inference failed for: r0v191, types: [X.2J3, X.7b4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger r301) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger.A03(com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger):boolean");
    }

    public static boolean A04(ThreadKey threadKey) {
        if (threadKey != null) {
            return threadKey.A1K() || threadKey.A1F() || threadKey.A1I();
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v3 ??, still in use, count: 2, list:
          (r307v3 ??) from 0x01c5: PHI (r307v2 ??) = (r307v1 ??), (r307v3 ??) binds: [B:91:0x0166, B:110:0x01bf] A[DONT_GENERATE, DONT_INLINE]
          (r307v3 ?? I:java.lang.Object) from 0x01c1: INVOKE (r0v62 ?? I:java.util.AbstractMap), (r0v26 ?? I:java.lang.Object), (r307v3 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x020c, MD:(K, V):V (c)]
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
    public void A05(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v3 ??, still in use, count: 2, list:
          (r307v3 ??) from 0x01c5: PHI (r307v2 ??) = (r307v1 ??), (r307v3 ??) binds: [B:91:0x0166, B:110:0x01bf] A[DONT_GENERATE, DONT_INLINE]
          (r307v3 ?? I:java.lang.Object) from 0x01c1: INVOKE (r0v62 ?? I:java.util.AbstractMap), (r0v26 ?? I:java.lang.Object), (r307v3 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x020c, MD:(K, V):V (c)]
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

    public void A06(Message message, Integer num, long j) {
        synchronized (this) {
            A07(message, num, null, null, null, 0, j);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: DeboxingVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.DeboxingVisitor.visit(DeboxingVisitor.java:81)
        */
    public void A07(com.facebook.messaging.model.messages.Message r302, java.lang.Integer r303, java.lang.String r304, java.lang.String r305, java.lang.String r306, int r307, long r308) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger.A07(com.facebook.messaging.model.messages.Message, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, long):void");
    }

    public void A08(ThreadKey threadKey, Integer num, String str) {
        synchronized (this) {
            C11814xl c11814xl = this.A04;
            synchronized (c11814xl) {
                if (C11814xl.A04(c11814xl)) {
                    AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo = (AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo) c11814xl.A00.get(str);
                    if (aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo != null) {
                        if (aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.interopState == 0) {
                            aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.interopState = ((9AW) c11814xl.A05.get()).A00(threadKey);
                        }
                        if (num == 0S2.A00) {
                            aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.outcome = "m";
                        } else if (num == 0S2.A01) {
                            aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.outcome = "g";
                        }
                        C11814xl.A02(aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo, c11814xl, null, str);
                        c11814xl.A00.remove(str);
                        C11814xl.A03(c11814xl);
                    }
                }
            }
            this.A05.A00.A02(str);
            if (A02(this) && (threadKey == null || A04(threadKey))) {
                LinkedHashMap linkedHashMap = this.A00;
                linkedHashMap.getClass();
                ReliabilityInfo reliabilityInfo = (ReliabilityInfo) linkedHashMap.get(str);
                if (reliabilityInfo != null) {
                    if (reliabilityInfo.graphAttempts + reliabilityInfo.mqttAttempts == 1) {
                        this.A00.remove(str);
                    } else {
                        reliabilityInfo.timeSinceFirstSendAttempt = this.A02.now() - reliabilityInfo.sendAttemptTimestamp;
                        if (num == 0S2.A00) {
                            reliabilityInfo.outcome = ReliabilityInfo.Outcome.SUCCESS_MQTT;
                        } else {
                            reliabilityInfo.outcome = ReliabilityInfo.Outcome.SUCCESS_GRAPH;
                        }
                    }
                    A00(this);
                }
            }
        }
    }
}
