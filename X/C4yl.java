package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.folders.FolderCounts;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.4yl, reason: invalid class name */
/* loaded from: 4yl.class */
public final class C4yl {
    public static final String[] A07 = {"unread_count", "unseen_count", "last_seen_time"};
    public 1BY A00;
    public final C00i A02;
    public final C00i A03;
    public final C12064ym A04;
    public final C10704ud A05 = (C10704ud) 1Bi.A03(49352);
    public final C1q9 A06 = (C1q9) 1Bi.A03(16823);
    public final 82O A01 = (82O) 1Bn.A0E((Context) null, (1BY) null, 324);

    public C4yl(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A02 = new 1MV(fbUserSession, (1BY) null, 49346);
        this.A04 = (C12064ym) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 49414);
        this.A03 = new 1MV(fbUserSession, (1BY) null, 49998);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v13 ??, still in use, count: 4, list:
          (r307v13 ??) from 0x01a8: PHI (r307v11 ??) = (r307v3 ??), (r307v13 ??), (r307v13 ??) binds: [B:104:0x00ce, B:17:0x0190, B:21:0x01a2] A[DONT_GENERATE, DONT_INLINE]
          (r307v13 ??) from 0x01a8: PHI (r307v11 ??) = (r307v3 ??), (r307v13 ??), (r307v13 ??) binds: [B:104:0x00ce, B:17:0x0190, B:21:0x01a2] A[DONT_GENERATE, DONT_INLINE]
          (r307v13 ?? I:X.4cO) from 0x0038: INVOKE (r307v13 ?? I:X.4cO), (r0v123 ?? I:java.lang.String), (r0v122 ?? I:java.lang.String) STATIC call: X.4cO.A00(X.4cO, java.lang.String, java.lang.String):void A[Catch: all -> 0x029a]
          (r307v13 ?? I:X.4cO) from 0x0188: INVOKE (r307v13 ?? I:X.4cO), (r0v133 ?? I:X.2V0) VIRTUAL call: X.4cO.A04(X.2V0):void A[Catch: all -> 0x029a]
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
    public static com.google.common.collect.ImmutableList A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v13 ??, still in use, count: 4, list:
          (r307v13 ??) from 0x01a8: PHI (r307v11 ??) = (r307v3 ??), (r307v13 ??), (r307v13 ??) binds: [B:104:0x00ce, B:17:0x0190, B:21:0x01a2] A[DONT_GENERATE, DONT_INLINE]
          (r307v13 ??) from 0x01a8: PHI (r307v11 ??) = (r307v3 ??), (r307v13 ??), (r307v13 ??) binds: [B:104:0x00ce, B:17:0x0190, B:21:0x01a2] A[DONT_GENERATE, DONT_INLINE]
          (r307v13 ?? I:X.4cO) from 0x0038: INVOKE (r307v13 ?? I:X.4cO), (r0v123 ?? I:java.lang.String), (r0v122 ?? I:java.lang.String) STATIC call: X.4cO.A00(X.4cO, java.lang.String, java.lang.String):void A[Catch: all -> 0x029a]
          (r307v13 ?? I:X.4cO) from 0x0188: INVOKE (r307v13 ?? I:X.4cO), (r0v133 ?? I:X.2V0) VIRTUAL call: X.4cO.A04(X.2V0):void A[Catch: all -> 0x029a]
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

    public long A01(1Hk r302) {
        SQLiteDatabase A00 = C10654u8.A00(this.A02);
        String str = r302.dbName;
        Cursor rawQuery = A00.rawQuery("SELECT MIN(timestamp_ms) FROM virtual_folders WHERE virtual_folder=? AND thread_key != ?", new String[]{str, 0Pz.A0W("first_", str)});
        try {
            if (rawQuery.moveToNext()) {
                return rawQuery.getLong(0);
            }
            rawQuery.close();
            return -1;
        } finally {
            rawQuery.close();
        }
    }

    public FolderCounts A02(String str) {
        FolderCounts folderCounts;
        int i;
        C00j.A05("DbFetchThreadsHandler.getFolderCounts", 810038310);
        try {
            2Uy r0 = new 2Uy("folder", str);
            Cursor query = C10654u8.A00(this.A02).query("folder_counts", A07, r0.A02(), r0.A03(), null, null, null);
            try {
                if (query.moveToNext()) {
                    new FolderCounts(query.getInt(0), query.getInt(1), query.getLong(2));
                    query.close();
                    i = -1081784095;
                } else {
                    folderCounts = null;
                    query.close();
                    i = -1774893204;
                }
                C00j.A01(i);
                return folderCounts;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-834855722);
            throw th2;
        }
    }

    public ImmutableList A03(Set set) {
        C00j.A05("DbFetchThreadsHandler.doCustomThreadSetQuery", -798718906);
        try {
            ImmutableList.Builder builder = ImmutableList.builder();
            InterfaceC10724uf A01 = C10704ud.A01(new 4sQ("thread_key", set), this.A05, null);
            while (true) {
                try {
                    ThreadSummary BfR = A01.BfR();
                    if (BfR == null) {
                        A01.close();
                        ImmutableList build = builder.build();
                        C00j.A01(-966184901);
                        return build;
                    }
                    builder.m11011add((Object) BfR);
                } finally {
                }
            }
        } catch (Throwable th) {
            C00j.A01(-349334561);
            throw th;
        }
    }

    public void A04(LinkedHashMap linkedHashMap) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        0WH r0 = new 0WH(0);
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            r0.add(Long.valueOf(((ThreadSummary) it.next()).A0N));
        }
        SQLiteDatabase A00 = C10654u8.A00(this.A02);
        2V0 r02 = new 4sQ("thread_key", linkedHashMap.keySet());
        C1q8 c1q8 = C1q8.A0A;
        String num = Integer.toString(c1q8.dbKeyValue);
        C1q8 c1q82 = C1q8.A0M;
        4cN A002 = 4cM.A00(new 2V0[]{r02, new 4sQ(TraceFieldType.MsgType, ImmutableSet.A02(num, Integer.toString(c1q82.dbKeyValue))), 4cM.A01(new 2V0[]{new C1637Aof("timestamp_ms", Long.toString(currentTimeMillis - 86400000)), new 4sQ("timestamp_ms", r0)})});
        Cursor query = A00.query(true, "messages", new String[]{"thread_key", "timestamp_ms", TraceFieldType.MsgType}, A002.A02(), A002.A03(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                ThreadKey A0K = ThreadKey.A0K(query.getString(0), true);
                ThreadSummary threadSummary = (ThreadSummary) linkedHashMap.get(A0K);
                threadSummary.getClass();
                C1q8 A003 = C1q8.A00(Integer.parseInt(4YU.A0v(query, 2)));
                long j = query.getLong(1);
                if (A003 == c1q8) {
                    C1zm c1zm = new C1zm(threadSummary);
                    c1zm.A2M = true;
                    c1zm.A2I = AnonymousClass001.A1O((j > threadSummary.A0N ? 1 : (j == threadSummary.A0N ? 0 : -1)));
                    new ThreadSummary(c1zm);
                } else if (A003 == c1q82) {
                    C1zm c1zm2 = new C1zm(threadSummary);
                    c1zm2.A2R = true;
                    new ThreadSummary(c1zm2);
                }
                linkedHashMap.put(A0K, z);
            } finally {
                query.close();
            }
        }
    }

    public boolean A05(String str) {
        C00j.A05("DbFetchThreadsHandler.containsFirstThreadSentinalForFolder", 1202996795);
        try {
            2Uy r0 = new 2Uy("thread_key", str);
            Cursor query = C10654u8.A00(this.A02).query("folders", new String[]{"thread_key"}, r0.A02(), r0.A03(), null, null, null);
            try {
                boolean moveToNext = query.moveToNext();
                query.close();
                C00j.A01(563559799);
                return moveToNext;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(975687891);
            throw th2;
        }
    }

    public boolean A06(String str) {
        C00j.A05("DbFetchThreadsHandler.containsFirstThreadSentinalForVirtualFolder", -1537266685);
        try {
            2Uy r0 = new 2Uy("thread_key", str);
            Cursor query = C10654u8.A00(this.A02).query("virtual_folders", new String[]{"thread_key"}, r0.A02(), r0.A03(), null, null, null);
            try {
                boolean moveToNext = query.moveToNext();
                query.close();
                C00j.A01(-1530521697);
                return moveToNext;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-193563035);
            throw th2;
        }
    }
}
