package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.database.threads.MessageCursorUtil;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.model.cards.MontageEventsSticker;
import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.facebook.messaging.montage.model.cards.MontageFeedbackPollOption;
import com.facebook.messaging.montage.model.cards.MontageLinkSticker;
import com.facebook.messaging.montage.model.cards.MontageReactionSticker;
import com.facebook.messaging.montage.model.cards.MontageReshareContentSticker;
import com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4yz, reason: invalid class name */
/* loaded from: 4yz.class */
public final class C4yz {
    public 1BY A00;
    public boolean A01;
    public final FbUserSession A02;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A0B;
    public final C00i A0C;
    public final MessageCursorUtil A0G = (MessageCursorUtil) 1Bi.A03(49424);
    public final C1q9 A0H = (C1q9) 1Bi.A03(16823);
    public final 82O A04 = (82O) 1Bn.A0E((Context) null, (1BY) null, 324);
    public final 82O A03 = (82O) 1Bn.A0E((Context) null, (1BY) null, 329);
    public final C00i A0A = new 1BQ(49476);
    public final C00i A0E = new 1BQ(49410);
    public final C00i A05 = new 1BQ(99390);
    public final C00i A0D = new 1BQ(84777);
    public final C00i A0F = new 1BQ(16385);
    public final C00i A09 = new 1BQ(85050);

    public C4yz(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A02 = fbUserSession;
        Integer num = 1Lo.A05;
        this.A0B = new 1MV(fbUserSession, (1BY) null, 49346);
        this.A0C = new 1MV(fbUserSession, (1BY) null, 84776);
        this.A07 = new 1MV(fbUserSession, (1BY) null, 49414);
        this.A06 = new 1MV(fbUserSession, (1BY) null, 67507);
        this.A08 = new 1MV(fbUserSession, (1BY) null, 49998);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v0 ??, still in use, count: 7, list:
          (r316v0 ??) from 0x2402: PHI (r316v1 ??) = (r316v0 ??), (r316v0 ??), (r316v2 ??) binds: [B:1767:0x2394, B:1770:0x23a0, B:1788:0x23fe] A[DONT_GENERATE, DONT_INLINE]
          (r316v0 ??) from 0x2402: PHI (r316v1 ??) = (r316v0 ??), (r316v0 ??), (r316v2 ??) binds: [B:1767:0x2394, B:1770:0x23a0, B:1788:0x23fe] A[DONT_GENERATE, DONT_INLINE]
          (r316v0 ?? I:java.util.AbstractMap) from 0x232b: INVOKE (r316v0 ?? I:java.util.AbstractMap), (r0v951 ?? I:java.lang.Object), (r0v953 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x24a6, MD:(K, V):V (c)]
          (r316v0 ?? I:java.util.AbstractMap) from 0x236f: INVOKE (r316v0 ?? I:java.util.AbstractMap), (r0v911 ?? I:java.lang.Object), (r0v895 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x24a6, MD:(K, V):V (c)]
          (r316v0 ?? I:java.util.AbstractMap) from 0x2399: INVOKE (r0v113 ?? I:boolean) = (r316v0 ?? I:java.util.AbstractMap) VIRTUAL call: java.util.AbstractMap.isEmpty():boolean A[Catch: all -> 0x24a6, MD:():boolean (c)]
          (r316v0 ?? I:java.util.AbstractMap) from 0x23aa: INVOKE (r0v117 ?? I:java.util.Set) = (r316v0 ?? I:java.util.AbstractMap) VIRTUAL call: java.util.AbstractMap.keySet():java.util.Set A[Catch: all -> 0x24a6, MD:():java.util.Set<K> (c)]
          (r316v0 ?? I:java.util.AbstractMap) from 0x23ec: INVOKE (r0v136 ?? I:java.lang.Object) = (r316v0 ?? I:java.util.AbstractMap), (r0v133 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.get(java.lang.Object):java.lang.Object A[Catch: all -> 0x24a6, MD:(java.lang.Object):V (c)]
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
    public static X.C4z5 A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v0 ??, still in use, count: 7, list:
          (r316v0 ??) from 0x2402: PHI (r316v1 ??) = (r316v0 ??), (r316v0 ??), (r316v2 ??) binds: [B:1767:0x2394, B:1770:0x23a0, B:1788:0x23fe] A[DONT_GENERATE, DONT_INLINE]
          (r316v0 ??) from 0x2402: PHI (r316v1 ??) = (r316v0 ??), (r316v0 ??), (r316v2 ??) binds: [B:1767:0x2394, B:1770:0x23a0, B:1788:0x23fe] A[DONT_GENERATE, DONT_INLINE]
          (r316v0 ?? I:java.util.AbstractMap) from 0x232b: INVOKE (r316v0 ?? I:java.util.AbstractMap), (r0v951 ?? I:java.lang.Object), (r0v953 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x24a6, MD:(K, V):V (c)]
          (r316v0 ?? I:java.util.AbstractMap) from 0x236f: INVOKE (r316v0 ?? I:java.util.AbstractMap), (r0v911 ?? I:java.lang.Object), (r0v895 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x24a6, MD:(K, V):V (c)]
          (r316v0 ?? I:java.util.AbstractMap) from 0x2399: INVOKE (r0v113 ?? I:boolean) = (r316v0 ?? I:java.util.AbstractMap) VIRTUAL call: java.util.AbstractMap.isEmpty():boolean A[Catch: all -> 0x24a6, MD:():boolean (c)]
          (r316v0 ?? I:java.util.AbstractMap) from 0x23aa: INVOKE (r0v117 ?? I:java.util.Set) = (r316v0 ?? I:java.util.AbstractMap) VIRTUAL call: java.util.AbstractMap.keySet():java.util.Set A[Catch: all -> 0x24a6, MD:():java.util.Set<K> (c)]
          (r316v0 ?? I:java.util.AbstractMap) from 0x23ec: INVOKE (r0v136 ?? I:java.lang.Object) = (r316v0 ?? I:java.util.AbstractMap), (r0v133 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.get(java.lang.Object):java.lang.Object A[Catch: all -> 0x24a6, MD:(java.lang.Object):V (c)]
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

    public static C7pQ A01(C7pQ c7pQ, C1q8 c1q8) {
        C1zm c1zm;
        if (c1q8 != C1q8.A0A) {
            if (c1q8 == C1q8.A0M) {
                c1zm = new C1zm(c7pQ.A01);
                c1zm.A2R = true;
            }
            return c7pQ;
        }
        c1zm = new C1zm(c7pQ.A01);
        c1zm.A2M = true;
        c7pQ = new C7pQ(new ThreadSummary(c1zm), c7pQ.A00);
        return c7pQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bd  */
    /* JADX WARN: Type inference failed for: r308v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r308v15, types: [X.00i] */
    /* JADX WARN: Type inference failed for: r308v5 */
    /* JADX WARN: Type inference failed for: r308v7, types: [X.00i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.C7pQ A02(com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4yz.A02(com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String):X.7pQ");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v4 ??, still in use, count: 2, list:
          (r313v4 ??) from 0x01d0: PHI (r313v5 ??) = (r313v4 ??) binds: [B:62:0x0212] A[DONT_GENERATE, DONT_INLINE]
          (r313v4 ?? I:X.0WH) from 0x0214: INVOKE (r313v4 ?? I:X.0WH), (r0v147 ?? I:java.util.Collection) VIRTUAL call: X.0WH.addAll(java.util.Collection):boolean A[Catch: all -> 0x021b]
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
    private com.facebook.messaging.model.messages.MessagesCollection A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v4 ??, still in use, count: 2, list:
          (r313v4 ??) from 0x01d0: PHI (r313v5 ??) = (r313v4 ??) binds: [B:62:0x0212] A[DONT_GENERATE, DONT_INLINE]
          (r313v4 ?? I:X.0WH) from 0x0214: INVOKE (r313v4 ?? I:X.0WH), (r0v147 ?? I:java.util.Collection) VIRTUAL call: X.0WH.addAll(java.util.Collection):boolean A[Catch: all -> 0x021b]
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.messaging.service.model.FetchThreadResult A04(X.C7pQ r302, int r303) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4yz.A04(X.7pQ, int):com.facebook.messaging.service.model.FetchThreadResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r305v0 */
    /* JADX WARN: Type inference failed for: r305v1 */
    /* JADX WARN: Type inference failed for: r305v33, types: [java.util.AbstractCollection] */
    private ImmutableList A05(ThreadKey threadKey, ImmutableList immutableList, Set set) {
        Collection collection = set;
        if (set == null) {
            collection = AnonymousClass001.A0v();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                String str = 4YU.A0V(it).A1V;
                if (str != null) {
                    collection.add(str);
                }
            }
        }
        this.A0A.get();
        if (threadKey.A1J()) {
            ImmutableList.Builder A0h = 4YU.A0h();
            CCe cCe = (CCe) this.A0D.get();
            4sQ r0 = new 4sQ(TraceFieldType.MsgId, collection);
            String buildQueryString = SQLiteQueryBuilder.buildQueryString(false, "montage_message_poll", null, null, null, null, null, null);
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables(0Pz.A15("((", buildQueryString, ") _poll JOIN ", "montage_message_poll_options", " _options ON _poll.", "poll_id", " = _options.", "poll_id", ")"));
            SQLiteDatabase A01 = C10654u8.A01(cCe.A01);
            Cursor query = sQLiteQueryBuilder.query(A01, null, r0.A02(), r0.A03(), null, null, null);
            if (query.getCount() == 0) {
                query.close();
            }
            int columnIndexOrThrow = query.getColumnIndexOrThrow(TraceFieldType.MsgId);
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("poll_id");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("style");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("question_text");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("url");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("can_viewer_vote");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("viewer_vote_index");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("bound_x");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("bound_y");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("bound_width");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("bound_height");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("bound_rotation");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("option_text");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("vote_count");
            int columnIndexOrThrow15 = query.getColumnIndexOrThrow("option_index");
            HashMap A0u = AnonymousClass001.A0u();
            while (query.moveToNext()) {
                try {
                    String string = query.getString(columnIndexOrThrow);
                    if (!A0u.containsKey(string)) {
                        A0u.put(string, AnonymousClass001.A0u());
                    }
                    java.util.Map map = (java.util.Map) A0u.get(string);
                    map.getClass();
                    String string2 = query.getString(columnIndexOrThrow2);
                    if (!map.containsKey(string2)) {
                        HqQ hqQ = new HqQ();
                        hqQ.A02 = string2;
                        hqQ.A04 = query.getString(columnIndexOrThrow3);
                        hqQ.A03 = query.getString(columnIndexOrThrow4);
                        hqQ.A05 = query.getString(columnIndexOrThrow5);
                        hqQ.A07 = 4YV.A1U(query.getInt(columnIndexOrThrow6));
                        hqQ.A00 = query.getInt(columnIndexOrThrow7);
                        hqQ.A01 = new MontageStickerOverlayBounds(query.getDouble(columnIndexOrThrow8), query.getDouble(columnIndexOrThrow9), query.getDouble(columnIndexOrThrow10), query.getDouble(columnIndexOrThrow11), query.getDouble(columnIndexOrThrow12));
                        map.put(string2, hqQ);
                    }
                    String string3 = query.getString(columnIndexOrThrow13);
                    int i = query.getInt(columnIndexOrThrow14);
                    int i2 = query.getInt(columnIndexOrThrow15);
                    HqQ hqQ2 = (HqQ) map.get(string2);
                    hqQ2.A06.add(new MontageFeedbackPollOption(null, string3, i2, i, 0));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            HashMap A0u2 = AnonymousClass001.A0u();
            HashMap A0u3 = AnonymousClass001.A0u();
            HashMap A0u4 = AnonymousClass001.A0u();
            HashMap A0u5 = AnonymousClass001.A0u();
            SQLiteQueryBuilder sQLiteQueryBuilder2 = new SQLiteQueryBuilder();
            sQLiteQueryBuilder2.setTables("montage_message_interactive_overlays");
            Cursor query2 = sQLiteQueryBuilder2.query(A01, null, r0.A02(), r0.A03(), null, null, null);
            if (query2.getCount() == 0) {
                query2.close();
            }
            int columnIndexOrThrow16 = query2.getColumnIndexOrThrow(TraceFieldType.MsgId);
            int columnIndexOrThrow17 = query2.getColumnIndexOrThrow("overlay_type");
            int columnIndexOrThrow18 = query2.getColumnIndexOrThrow("overlay_data");
            while (query2.moveToNext()) {
                String string4 = query2.getString(columnIndexOrThrow16);
                String string5 = query2.getString(columnIndexOrThrow17);
                String string6 = query2.getString(columnIndexOrThrow18);
                A07(string4, A0u2);
                if ("reaction_sticker".equals(string5)) {
                    List list = (List) A0u2.get(string4);
                    list.getClass();
                    list.add(string6);
                }
                if ("events_sticker".equals(string5)) {
                    A0u3.put(string4, string6);
                }
                if ("reshare_post_sticker".equals(string5)) {
                    A0u4.put(string4, string6);
                }
                if ("link_sticker".equals(string5)) {
                    A0u5.put(string4, string6);
                }
            }
            query2.close();
            HashMap A0u6 = AnonymousClass001.A0u();
            Iterator A0x = AnonymousClass001.A0x(A0u);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator A1A = 1BK.A1A((java.util.Map) A0z.getValue());
                while (A1A.hasNext()) {
                    A0s.add(new MontageFeedbackOverlay(((HqQ) A1A.next()).A00()));
                }
                A0u6.put(A0z.getKey(), A0s);
            }
            try {
                Iterator A0x2 = AnonymousClass001.A0x(A0u2);
                while (A0x2.hasNext()) {
                    Map.Entry A0z2 = AnonymousClass001.A0z(A0x2);
                    String A0j = AnonymousClass001.A0j(A0z2);
                    A07(A0j, A0u6);
                    Iterator it2 = ((List) A0z2.getValue()).iterator();
                    while (it2.hasNext()) {
                        MontageReactionSticker montageReactionSticker = (MontageReactionSticker) cCe.A00.A0V(AnonymousClass001.A0i(it2), MontageReactionSticker.class);
                        List list2 = (List) A0u6.get(A0j);
                        list2.getClass();
                        list2.add(new MontageFeedbackOverlay(montageReactionSticker));
                    }
                }
                Iterator A0x3 = AnonymousClass001.A0x(A0u3);
                while (A0x3.hasNext()) {
                    Map.Entry A0z3 = AnonymousClass001.A0z(A0x3);
                    String A0j2 = AnonymousClass001.A0j(A0z3);
                    A07(A0j2, A0u6);
                    MontageEventsSticker montageEventsSticker = (MontageEventsSticker) cCe.A00.A0V(1BK.A16(A0z3), MontageEventsSticker.class);
                    List list3 = (List) A0u6.get(A0j2);
                    list3.getClass();
                    list3.add(new MontageFeedbackOverlay(montageEventsSticker));
                }
                Iterator A0x4 = AnonymousClass001.A0x(A0u4);
                while (A0x4.hasNext()) {
                    Map.Entry A0z4 = AnonymousClass001.A0z(A0x4);
                    String A0j3 = AnonymousClass001.A0j(A0z4);
                    A07(A0j3, A0u6);
                    MontageReshareContentSticker montageReshareContentSticker = (MontageReshareContentSticker) cCe.A00.A0V(1BK.A16(A0z4), MontageReshareContentSticker.class);
                    List list4 = (List) A0u6.get(A0j3);
                    list4.getClass();
                    list4.add(new MontageFeedbackOverlay(montageReshareContentSticker));
                }
                Iterator A0x5 = AnonymousClass001.A0x(A0u5);
                while (A0x5.hasNext()) {
                    Map.Entry A0z5 = AnonymousClass001.A0z(A0x5);
                    String A0j4 = AnonymousClass001.A0j(A0z5);
                    A07(A0j4, A0u6);
                    MontageLinkSticker montageLinkSticker = (MontageLinkSticker) cCe.A00.A0V(1BK.A16(A0z5), MontageLinkSticker.class);
                    List list5 = (List) A0u6.get(A0j4);
                    list5.getClass();
                    list5.add(new MontageFeedbackOverlay(montageLinkSticker));
                }
            } catch (Exception e) {
                0fH.A0r("DbMontageFeedbackOverlaysHandler", e.getMessage(), e);
            }
            HashMap A0u7 = AnonymousClass001.A0u();
            Iterator A0x6 = AnonymousClass001.A0x(A0u6);
            while (A0x6.hasNext()) {
                Map.Entry A0z6 = AnonymousClass001.A0z(A0x6);
                A0u7.put(A0z6.getKey(), ImmutableList.copyOf((Collection) A0z6.getValue()));
            }
            if (!A0u7.isEmpty()) {
                1Du it3 = immutableList.iterator();
                while (it3.hasNext()) {
                    Message A0V = 4YU.A0V(it3);
                    ImmutableList immutableList2 = (ImmutableList) A0u7.get(A0V.A1V);
                    if (09K.A00(immutableList2)) {
                        5PI r02 = new 5PI(A0V);
                        r02.A0w = immutableList2;
                        A0V = 4YU.A0U(r02);
                    }
                    A0h.m11011add((Object) A0V);
                }
                return A0h.build();
            }
        }
        return immutableList;
    }

    public static void A06(C00i c00i) {
        ((1Tw) c00i.get()).A00("fetch_messages_from_db_start");
        C00j.A05("DbFetchThreadHandler.fetchMessagesFromDb", 1174087239);
    }

    public static void A07(Object obj, AbstractMap abstractMap) {
        if (abstractMap.containsKey(obj)) {
            return;
        }
        abstractMap.put(obj, new ArrayList());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v2 ??, still in use, count: 10, list:
          (r304v2 ??) from 0x022f: PHI (r304v6 ??) = (r304v2 ??), (r304v8 ??), (r304v9 ??) binds: [B:251:0x022a, B:118:0x021f, B:78:0x0180] A[DONT_GENERATE, DONT_INLINE]
          (r304v2 ?? I:X.0QO) from 0x0190: INVOKE (r304v2 ?? I:X.0QO), (r0v38 ?? I:X.0QO) VIRTUAL call: X.0QO.A09(X.0QO):void A[Catch: all -> 0x04e5]
          (r304v2 ?? I:X.0QO) from 0x0239: INVOKE (r304v2 ?? I:X.0QO), (r0v67 ?? I:X.0QO) VIRTUAL call: X.0QO.A09(X.0QO):void A[Catch: all -> 0x04e5]
          (r304v2 ?? I:X.0QO) from 0x0247: INVOKE (r0v88 ?? I:boolean) = (r304v2 ?? I:X.0QO) VIRTUAL call: X.0QO.isEmpty():boolean A[Catch: all -> 0x04f2]
          (r304v2 ?? I:X.0QO) from 0x0491: INVOKE (r0v223 ?? I:java.lang.Object) = (r304v2 ?? I:X.0QO), (r0v221 ?? I:java.lang.Object) VIRTUAL call: X.0QO.get(java.lang.Object):java.lang.Object A[Catch: all -> 0x04ff]
          (r304v2 ?? I:X.0QO) from 0x029a: INVOKE (r0v107 ?? I:int) = (r304v2 ?? I:X.0QO) VIRTUAL call: X.0QO.size():int A[Catch: all -> 0x04d7]
          (r304v2 ?? I:X.0QO) from 0x02b4: INVOKE (r0v170 ?? I:java.lang.Object) = (r304v2 ?? I:X.0QO), (r1v31 ?? I:int) VIRTUAL call: X.0QO.A04(int):java.lang.Object A[Catch: all -> 0x04d7]
          (r304v2 ?? I:X.0QO) from 0x040b: INVOKE (r0v153 ?? I:java.lang.Object) = (r304v2 ?? I:X.0QO), (r0v149 ?? I:java.lang.Object) VIRTUAL call: X.0QO.get(java.lang.Object):java.lang.Object A[Catch: all -> 0x04cb]
          (r304v2 ?? I:X.0QO) from 0x0446: INVOKE (r304v2 ?? I:X.0QO), (r0v149 ?? I:java.lang.Object), (r0v166 ?? I:java.lang.Object) VIRTUAL call: X.0QO.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x04cb]
          (r304v2 ?? I:java.lang.Throwable) from 0x022c: INVOKE (r304v2 ?? I:java.lang.Throwable), (r317v2 ?? I:java.lang.Throwable) STATIC call: X.7kF.A00(java.lang.Throwable, java.lang.Throwable):void A[Catch: all -> 0x04e5]
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
    public X.0QO A08(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v2 ??, still in use, count: 10, list:
          (r304v2 ??) from 0x022f: PHI (r304v6 ??) = (r304v2 ??), (r304v8 ??), (r304v9 ??) binds: [B:251:0x022a, B:118:0x021f, B:78:0x0180] A[DONT_GENERATE, DONT_INLINE]
          (r304v2 ?? I:X.0QO) from 0x0190: INVOKE (r304v2 ?? I:X.0QO), (r0v38 ?? I:X.0QO) VIRTUAL call: X.0QO.A09(X.0QO):void A[Catch: all -> 0x04e5]
          (r304v2 ?? I:X.0QO) from 0x0239: INVOKE (r304v2 ?? I:X.0QO), (r0v67 ?? I:X.0QO) VIRTUAL call: X.0QO.A09(X.0QO):void A[Catch: all -> 0x04e5]
          (r304v2 ?? I:X.0QO) from 0x0247: INVOKE (r0v88 ?? I:boolean) = (r304v2 ?? I:X.0QO) VIRTUAL call: X.0QO.isEmpty():boolean A[Catch: all -> 0x04f2]
          (r304v2 ?? I:X.0QO) from 0x0491: INVOKE (r0v223 ?? I:java.lang.Object) = (r304v2 ?? I:X.0QO), (r0v221 ?? I:java.lang.Object) VIRTUAL call: X.0QO.get(java.lang.Object):java.lang.Object A[Catch: all -> 0x04ff]
          (r304v2 ?? I:X.0QO) from 0x029a: INVOKE (r0v107 ?? I:int) = (r304v2 ?? I:X.0QO) VIRTUAL call: X.0QO.size():int A[Catch: all -> 0x04d7]
          (r304v2 ?? I:X.0QO) from 0x02b4: INVOKE (r0v170 ?? I:java.lang.Object) = (r304v2 ?? I:X.0QO), (r1v31 ?? I:int) VIRTUAL call: X.0QO.A04(int):java.lang.Object A[Catch: all -> 0x04d7]
          (r304v2 ?? I:X.0QO) from 0x040b: INVOKE (r0v153 ?? I:java.lang.Object) = (r304v2 ?? I:X.0QO), (r0v149 ?? I:java.lang.Object) VIRTUAL call: X.0QO.get(java.lang.Object):java.lang.Object A[Catch: all -> 0x04cb]
          (r304v2 ?? I:X.0QO) from 0x0446: INVOKE (r304v2 ?? I:X.0QO), (r0v149 ?? I:java.lang.Object), (r0v166 ?? I:java.lang.Object) VIRTUAL call: X.0QO.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x04cb]
          (r304v2 ?? I:java.lang.Throwable) from 0x022c: INVOKE (r304v2 ?? I:java.lang.Throwable), (r317v2 ?? I:java.lang.Throwable) STATIC call: X.7kF.A00(java.lang.Throwable, java.lang.Throwable):void A[Catch: all -> 0x04e5]
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

    public Message A09(String str) {
        return (Message) A00(new 2Uy(TraceFieldType.MsgId, str), this, null, 1, false).A00.get(str);
    }

    public Message A0A(String str) {
        Message message = null;
        if (str != null) {
            LinkedHashMap linkedHashMap = A00(new 2Uy("offline_threading_id", str), this, null, 1, false).A00;
            if (!linkedHashMap.isEmpty()) {
                message = (Message) linkedHashMap.values().iterator().next();
            }
        }
        return message;
    }

    public Message A0B(String str, String str2) {
        0WH r0 = new 0WH(0);
        0WH r02 = new 0WH(0);
        if (str != null) {
            r0.add(str);
        }
        if (str2 != null) {
            r02.add(str2);
        }
        java.util.Map A0K = A0K(r0, r02);
        if (A0K.size() > 0) {
            return 4YU.A0V(1BK.A1A(A0K));
        }
        return null;
    }

    public MessagesCollection A0C(MessagesCollection messagesCollection, ThreadKey threadKey) {
        ImmutableList reverse = ImmutableList.copyOf(A0J(threadKey, new C1q8[]{C1q8.A0M, C1q8.A0A}, (-1) >>> 1, -1).values()).reverse();
        C5pv c5pv = new C5pv();
        c5pv.A00 = threadKey;
        c5pv.A01(reverse);
        c5pv.A03 = false;
        c5pv.A02 = true;
        return C12014yf.A00(messagesCollection, new MessagesCollection(c5pv), (C12014yf) this.A0E.get(), false);
    }

    public MessagesCollection A0D(ThreadSummary threadSummary, int i) {
        C00j.A05("DbFetchThreadHandler.fetchThreadWithMessagesCollectionFromDb", -182265459);
        try {
            ThreadKey threadKey = threadSummary.A0n;
            C00i c00i = this.A09;
            A06(c00i);
            try {
                4cN r0 = new 4cN();
                if (threadKey != null) {
                    4cO.A00(r0, "thread_key", threadKey.A0u());
                }
                LinkedHashMap linkedHashMap = A00(r0, this, 0Pz.A0W("timestamp_ms", " DESC"), i, " DESC".contains(" ASC")).A00;
                4YV.A1D(c00i);
                C00j.A01(-802817603);
                MessagesCollection A03 = A03(threadSummary, linkedHashMap);
                C00j.A01(751728515);
                return A03;
            } catch (Throwable th) {
                4YV.A1D(c00i);
                C00j.A01(-1948812743);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-438701999);
            throw th2;
        }
    }

    public ThreadSummary A0E(ThreadKey threadKey) {
        C00j.A05("DbFetchThreadHandler.fetchThreadSummaryFromDb", -1846399381);
        try {
            C7pQ A02 = A02(threadKey, "thread_key");
            ThreadSummary threadSummary = A02 == null ? null : A02.A01;
            C00j.A01(-462482268);
            return threadSummary;
        } catch (Throwable th) {
            C00j.A01(1402971104);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (" ASC".equals(r303) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.service.model.FetchMoreMessagesResult A0F(com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.String r303, int r304, long r305, long r307) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4yz.A0F(com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, int, long, long):com.facebook.messaging.service.model.FetchMoreMessagesResult");
    }

    public FetchThreadResult A0G(ThreadKey threadKey) {
        if (threadKey != null) {
            this.A0A.get();
            if (threadKey.A1J()) {
                C00j.A05("DbFetchThreadHandler.fetchThreadFromDbByMontageThread", 242471866);
                try {
                    FetchThreadResult A04 = A04(A02(threadKey, "montage_thread_key"), 0);
                    C00j.A01(691193612);
                    return A04;
                } catch (Throwable th) {
                    C00j.A01(-1288087787);
                    throw th;
                }
            }
        }
        return FetchThreadResult.A0C;
    }

    public FetchThreadResult A0H(ThreadKey threadKey, int i) {
        C00j.A05("DbFetchThreadHandler.fetchThreadFromDb", 1312418721);
        Thread currentThread = Thread.currentThread();
        int priority = currentThread.getPriority();
        try {
            currentThread.setPriority(10);
            FetchThreadResult A04 = A04(A02(threadKey, "thread_key"), i);
            C00j.A01(1332719006);
            currentThread.setPriority(priority);
            return A04;
        } catch (Throwable th) {
            C00j.A01(1376143744);
            currentThread.setPriority(priority);
            throw th;
        }
    }

    public FetchThreadResult A0I(ThreadCriteria threadCriteria, int i) {
        if (threadCriteria.A00() != null) {
            return A0H(threadCriteria.A00(), i);
        }
        throw AnonymousClass001.A0L("No threadkey specified.");
    }

    public LinkedHashMap A0J(ThreadKey threadKey, C1q8[] c1q8Arr, int i, long j) {
        4cN r0 = new 4cN();
        if (threadKey != null) {
            4cO.A00(r0, "thread_key", threadKey.toString());
        }
        if (j != -1) {
            r0.A04(new 2Uz("timestamp_ms", Long.toString(j), "<="));
        }
        HashSet A0v = AnonymousClass001.A0v();
        for (C1q8 c1q8 : c1q8Arr) {
            AnonymousClass001.A1J(A0v, c1q8.dbKeyValue);
        }
        if (!A0v.isEmpty()) {
            r0.A04(new 4sQ(TraceFieldType.MsgType, A0v));
        }
        return A00(r0, this, "timestamp_ms", i, false).A00;
    }

    public java.util.Map A0K(Collection collection, Collection collection2) {
        return (collection.isEmpty() && collection2.isEmpty()) ? RegularImmutableMap.A03 : A00(4cM.A01(new 2V0[]{new 4sQ(TraceFieldType.MsgId, collection), new 4sQ("offline_threading_id", collection2)}), this, null, collection.size() + collection2.size(), false).A00;
    }
}
