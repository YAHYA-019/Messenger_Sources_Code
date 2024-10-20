package X;

import android.content.Context;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* renamed from: X.2wk, reason: invalid class name */
/* loaded from: 2wk.class */
public final class C2wk extends Handler {
    public 1kY A00;
    public C3Qx A01;
    public Queue A02;
    public Stack A03;
    public final C1O1 A04;
    public final Integer A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final /* synthetic */ C2wj A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2wk(Looper looper, C1O1 c1o1, C2wj c2wj, Integer num) {
        super(looper);
        this.A09 = c2wj;
        this.A07 = new Object();
        this.A08 = new Object();
        this.A06 = new Object();
        this.A04 = c1o1;
        this.A05 = num;
    }

    private C2wm A00() {
        C2wj c2wj = this.A09;
        C2wm c2wm = c2wj.A00;
        if (c2wm == null) {
            C2wi c2wi = c2wj.A05;
            final Context context = c2wi.A03;
            1lI A00 = 1lI.A00(!C1l7.A00(context).A01());
            File A01 = 4AL.A01(context, c2wi.A0D);
            C1Qs c1Qs = c2wi.A07;
            int BBZ = c1Qs.BBZ();
            int AoY = c1Qs.AoY();
            int Aa9 = c1Qs.Aa9();
            C1l0 c1l0 = c2wi.A08;
            C03z c03z = c2wi.A0B;
            String A002 = 01X.A00();
            if (A002 == null) {
                A002 = "unknown";
            }
            1lO r0 = new 1lO(c2wi.A05, c1l0, A00, c03z, new File(A01, A002), BBZ, AoY, Aa9, c2wi.A01);
            final int i = c2wi.A00;
            final C1lR c1lR = new C1lR(c2wi.A09, A01, 20000);
            final 3lK r02 = c2wi.A06;
            final Class cls = c2wi.A0C;
            C1Qt c1Qt = c2wi.A0A;
            final 1RY An4 = c1Qt.An4();
            final 1RY AYd = c1Qt.AYd();
            final boolean z = c2wi.A0F;
            final 1RL r03 = c2wi.A04;
            final boolean z2 = c2wi.A0E;
            c2wm = new C2wm(r0, new 1lT(context, r03, r02, c1lR, An4, AYd, cls, i, z, z2) { // from class: X.2wl
                public long A00;
                public File A01;
                public File A02;
                public File A03;
                public String A04;
                public boolean A05;
                public boolean A06;
                public boolean A07 = false;
                public final int A08;
                public final Context A09;
                public final 3lK A0A;
                public final C1lR A0B;
                public final 1RY A0C;
                public final 1RY A0D;
                public final Class A0E;
                public final boolean A0F;
                public final 1RL A0G;
                public final boolean A0H;

                {
                    this.A09 = context;
                    this.A08 = i;
                    this.A0B = c1lR;
                    this.A0A = r02;
                    this.A0E = cls;
                    this.A0D = An4;
                    this.A0C = AYd;
                    A01(this);
                    this.A0F = z;
                    this.A0G = r03;
                    this.A0H = z2;
                }

                private void A00(long j, long j2) {
                    synchronized (this) {
                        if (!this.A06) {
                            Context context2 = this.A09;
                            1Nz A04 = 1S7.A00(context2).A04(this.A0E.getName());
                            int i2 = 19;
                            if (this.A0B.A03 == 0S2.A01) {
                                i2 = 18;
                            }
                            4mQ.A00(new 4mP(this), context2, new Handler(A04.AJ2("JobRanReceiver", i2).getLooper()));
                            this.A06 = true;
                        }
                        if (this.A0H && j == 0 && j2 == 0 && this.A04 == null) {
                            A02();
                        } else if (this.A04 == null) {
                            if (!this.A05) {
                                this.A05 = true;
                                this.A00 = 4mR.A00(this.A09).A01(this.A08);
                            }
                            if (this.A00 > j) {
                                if (j == 0 && j2 == 0) {
                                    0fH.A0h(Integer.valueOf(this.A08), "UploadManager", "Scheduling immediate upload for %d");
                                    A02();
                                } else {
                                    int i3 = this.A08;
                                    0fH.A0b(Integer.valueOf(i3), Long.valueOf(j), Long.valueOf(j2), "UploadManager", "Scheduling jobbId %d within interval (%d, %d)");
                                    4mR.A00(this.A09).A02(this.A0B, (String) null, i3, j, j2);
                                    this.A00 = j;
                                }
                            }
                        }
                    }
                }

                public static void A01(C2wl c2wl) {
                    synchronized (c2wl) {
                        c2wl.A00 = Long.MAX_VALUE;
                    }
                }

                public void A02() {
                    synchronized (this) {
                        Context context2 = this.A09;
                        4mS A003 = 4mR.A00(context2);
                        int i2 = this.A08;
                        A003.A01.cancel(i2);
                        A01(this);
                        try {
                            this.A04 = "com.facebook.analytics2.logger.UPLOAD_NOW";
                            if (C1l7.A00(context2).A01()) {
                                try {
                                    4mT A012 = 4mT.A01();
                                    C1lR c1lR2 = this.A0B;
                                    A012.A03(context2, c1lR2, "com.facebook.analytics2.logger.UPLOAD_NOW", i2, 300000L, this.A0F);
                                    this.A07 = true;
                                    49O.A00(context2).A05(new 4mV(context2, (Bundle) null, (Messenger) null, c1lR2, new 4mU(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", i2), "com.facebook.analytics2.logger.UPLOAD_NOW");
                                } catch (IllegalArgumentException e) {
                                    th = AnonymousClass001.A0U(e);
                                    throw th;
                                }
                            } else {
                                4mT.A01().A02(context2, (Bundle) null, this.A0B, new 4mU(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", i2);
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }

                public void Bfh() {
                    synchronized (this) {
                        this.A02 = this.A01;
                    }
                    3lK r04 = this.A0A;
                    A00((r04.AUi() ? this.A0C : this.A0D).A02, (r04.AUi() ? this.A0C : this.A0D).A00);
                }

                public void Bfl() {
                    synchronized (this) {
                        this.A03 = this.A01;
                    }
                    3lK r04 = this.A0A;
                    A00((r04.AUi() ? this.A0C : this.A0D).A03, (r04.AUi() ? this.A0C : this.A0D).A01);
                }

                public void Bfm(long j) {
                    throw 0Q8.createAndThrow();
                }

                public void Bfn(long[] jArr, int i2, int i3) {
                    throw 0Q8.createAndThrow();
                }

                public void Bgl(String str) {
                    synchronized (this) {
                        try {
                            this.A02 = null;
                            this.A03 = null;
                            Context context2 = this.A09;
                            4mS A003 = 4mR.A00(context2);
                            int i2 = this.A08;
                            A003.A01.cancel(i2);
                            A01(this);
                            this.A04 = "com.facebook.analytics2.logger.USER_LOGOUT";
                            if (C1l7.A00(context2).A01()) {
                                try {
                                    49O A004 = 49O.A00(context2);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("user_id", str);
                                    A004.A05(new 4mV(context2, bundle, (Messenger) null, this.A0B, (4mU) null, "com.facebook.analytics2.logger.USER_LOGOUT", i2), "com.facebook.analytics2.logger.USER_LOGOUT");
                                } catch (IllegalArgumentException e) {
                                    th = AnonymousClass001.A0U(e);
                                    throw th;
                                }
                            } else {
                                4mT A012 = 4mT.A01();
                                C1lR c1lR2 = this.A0B;
                                Bundle A05 = 1BK.A05();
                                A05.putString("user_id", str);
                                A012.A02(context2, A05, c1lR2, (4mU) null, "com.facebook.analytics2.logger.USER_LOGOUT", i2);
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }

                public /* bridge */ /* synthetic */ void CqQ(Object obj) {
                    File file = (File) obj;
                    synchronized (this) {
                        this.A01 = file;
                    }
                }

                public void D5D() {
                    synchronized (this) {
                        A02();
                    }
                }
            });
            c2wj.A00 = c2wm;
        }
        return c2wm;
    }

    private C2wm A01() {
        C2wj c2wj = this.A09;
        if (c2wj.A01 == null) {
            C2wi c2wi = c2wj.A05;
            C1Qs c1Qs = c2wi.A07;
            int BBZ = c1Qs.BBZ();
            int AoY = c1Qs.AoY();
            int Aa9 = c1Qs.Aa9();
            C1l0 c1l0 = c2wi.A08;
            C03z c03z = c2wi.A0B;
            C2wm c2wm = new C2wm(new 1lP(c2wi.A05, c1l0, c03z, BBZ, AoY, Aa9), new C3V4(c2wi.A03, c2wi.A04, c2wi.A09, c03z));
            c2wj.A01 = c2wm;
            c2wm.A00.A06(this.A00);
        }
        return c2wj.A01;
    }

    private void A02(Message message, boolean z) {
        07T[] r311;
        C1O1 c1o1;
        int i = message.what;
        if (i == 1) {
            if (z && (c1o1 = this.A04) != null) {
                0V0.A00("doWaitForWriteBlockRelease");
                c1o1.ACR(this.A05);
                0V1.A00();
            }
            int i2 = message.arg1;
            Object obj = message.obj;
            if (i2 != 2) {
                A03((C1ke) obj);
                return;
            }
            C3Qx c3Qx = (C3Qx) obj;
            0V0.A00("doWrites");
            try {
                synchronized (this.A07) {
                    try {
                        c3Qx.A03 = true;
                        if (this.A01 == c3Qx) {
                            this.A01 = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                try {
                    0V0.A00("writeToDisk");
                    try {
                        C2wm A00 = A00();
                        r311 = c3Qx.A04;
                        int i3 = c3Qx.A01;
                        int i4 = 0;
                        while (i3 > 0) {
                            1lP r0 = A00.A00;
                            int A01 = r0.A01(i3);
                            r0.A08(r311, i4, A01);
                            C2wm.A00(A00);
                            i4 += A01;
                            i3 -= A01;
                        }
                        1KT r02 = this.A09.A03;
                        if (r02 != null) {
                            r02.Bwn(c3Qx.A01);
                        }
                    } catch (2Q2 | 2Q3 | IOException unused) {
                        try {
                            C2wm A012 = A01();
                            r311 = c3Qx.A04;
                            int i5 = c3Qx.A01;
                            int i6 = 0;
                            while (i5 > 0) {
                                1lP r03 = A012.A00;
                                int A013 = r03.A01(i5);
                                r03.A08(r311, i6, A013);
                                C2wm.A00(A012);
                                i6 += A013;
                                i5 -= A013;
                            }
                            1KT r04 = this.A09.A03;
                            if (r04 != null) {
                                r04.Bwn(c3Qx.A01);
                            }
                        } catch (IOException e) {
                            throw AnonymousClass001.A0U(e);
                        }
                    }
                    0V1.A00();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= c3Qx.A01) {
                            break;
                        }
                        07T r05 = r311[i7];
                        if (r05 != null) {
                            A07(r05);
                        }
                        i7++;
                    }
                    c3Qx.A00();
                } catch (Throwable th2) {
                    th = th2;
                    1KT r06 = this.A09.A03;
                    if (r06 != null) {
                        r06.Bwn(c3Qx.A01);
                    }
                    0V1.A00();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c3Qx.A00();
                0V1.A00();
                throw th;
            }
        } else {
            if (i == 3) {
                A04((1kY) message.obj);
                return;
            }
            try {
                if (i == 4) {
                    String str = (String) message.obj;
                    0V0.A00("doUserLogout");
                    A00().A01.Bgl(str);
                    C2wm c2wm = this.A09.A01;
                    if (c2wm != null) {
                        c2wm.A01.Bgl(str);
                    }
                } else {
                    if (i == 7) {
                        ((ConditionVariable) message.obj).open();
                        return;
                    }
                    if (i == 8) {
                        return;
                    }
                    if (i != 9) {
                        throw 0Pz.A04("Unknown what=", i);
                    }
                    0V0.A00("doUpload");
                    A00().A01.D5D();
                    C2wm c2wm2 = this.A09.A01;
                    if (c2wm2 != null) {
                        c2wm2.A01.D5D();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                0V1.A00();
                throw th;
            }
        }
        0V1.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (r304 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        r304.Bwn(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        A07(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
    
        if (r304 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A03(X.C1ke r302) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2wk.A03(X.1ke):void");
    }

    private void A04(1kY r302) {
        0V0.A00("doStartNewSession");
        try {
            C0k4.A01("A new batch session should never be null", r302);
            this.A00 = r302;
            A00().A00.A06(this.A00);
            C2wm c2wm = this.A09.A01;
            if (c2wm != null) {
                c2wm.A00.A06(this.A00);
            }
            boolean A08 = A08();
            LinkedList linkedList = new LinkedList();
            synchronized (this.A08) {
                Queue queue = this.A02;
                if (queue != null) {
                    linkedList.addAll(queue);
                    this.A02.clear();
                    this.A02 = null;
                }
            }
            while (!linkedList.isEmpty()) {
                Message message = (Message) linkedList.poll();
                if (message != null) {
                    A02(message, !A08);
                    message.recycle();
                    A08 = true;
                }
            }
        } finally {
            0V1.A00();
        }
    }

    public static void A05(C2wk c2wk) {
        if (c2wk.A09.A04.AjX()) {
            synchronized (c2wk.A07) {
                c2wk.A01 = null;
            }
        }
    }

    public static void A06(C2wk c2wk, 07S r302, String str, String str2, String str3) {
        1RL r0 = c2wk.A09.A02;
        if (r0.BTF()) {
            r0.AUJ().BZS(str, str2, str3, new 3jH(r302, 2), 1L, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.4mY, java.lang.Object] */
    private void A07(07S r302) {
        1Qh r0 = this.A09.A03;
        if (r0 != null) {
            0V0.A00("eventListener");
            try {
                ?? obj = new Object();
                if (r0 instanceof 1Qh) {
                    r0.A00((4mY) obj, r302);
                } else {
                    r0.Bwk();
                }
            } finally {
                0V1.A00();
            }
        }
    }

    private boolean A08() {
        C1ke c1ke;
        boolean z = false;
        if (!this.A09.A04.AjW()) {
            return false;
        }
        while (true) {
            synchronized (this.A06) {
                Stack stack = this.A03;
                if (stack == null || stack.isEmpty()) {
                    break;
                }
                c1ke = (C1ke) this.A03.pop();
            }
            0V0.A00("handleAsapMessage");
            if (!z) {
                try {
                    C1O1 c1o1 = this.A04;
                    if (c1o1 != null) {
                        0V0.A00("doWaitForWriteBlockRelease");
                        c1o1.ACR(this.A05);
                        0V1.A00();
                    }
                    z = true;
                } catch (Throwable th) {
                    0V1.A00();
                    throw th;
                }
            }
            A03(c1ke);
            0V1.A00();
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v3 ??, still in use, count: 2, list:
          (r307v3 ??) from 0x003b: PHI (r307v2 ??) = (r307v1 ??), (r307v3 ??) binds: [B:10:0x0028, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]
          (r307v3 ?? I:java.util.Queue) from 0x0038: IPUT (r307v3 ?? I:java.util.Queue), (r301v0 'this' ?? I:X.2wk A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x004f] X.2wk.A02 java.util.Queue
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
    @Override // android.os.Handler
    public void handleMessage(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v3 ??, still in use, count: 2, list:
          (r307v3 ??) from 0x003b: PHI (r307v2 ??) = (r307v1 ??), (r307v3 ??) binds: [B:10:0x0028, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]
          (r307v3 ?? I:java.util.Queue) from 0x0038: IPUT (r307v3 ?? I:java.util.Queue), (r301v0 'this' ?? I:X.2wk A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x004f] X.2wk.A02 java.util.Queue
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
