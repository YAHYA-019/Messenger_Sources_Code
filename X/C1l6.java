package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Stack;

/* renamed from: X.1l6, reason: invalid class name */
/* loaded from: 1l6.class */
public final class C1l6 extends Handler {
    public 1kY A00;
    public C3R2 A01;
    public Stack A02;
    public final C1O1 A03;
    public final Object A04;
    public final Object A05;
    public final /* synthetic */ C1l5 A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1l6(Looper looper, C1O1 c1o1, C1l5 c1l5) {
        super(looper);
        this.A06 = c1l5;
        this.A05 = new Object();
        this.A04 = new Object();
        this.A03 = c1o1;
    }

    private 1lU A00() {
        C1l5 c1l5 = this.A06;
        1lU r302 = c1l5.A00;
        if (r302 == null) {
            C1l4 c1l4 = c1l5.A07;
            Context context = c1l4.A02;
            1lI A00 = 1lI.A00(!C1l7.A00(context).A01());
            File A01 = 4AL.A01(context, "micro_batch");
            3oL r0 = c1l4.A0A;
            if (r0 != null) {
                File file = C34a.A00;
                C1Qs c1Qs = r0.A00;
                int BBZ = c1Qs.BBZ();
                int AoY = c1Qs.AoY();
                new 1Rj((1QA) null, (1Nx) null, (C03z) null, (1Qx) null, (1Qz) null);
                new HashSet();
                if (BBZ > AoY) {
                    0fH.A0j("Analytics2.EventBatchStore", 0Pz.A0C(BBZ, AoY, "SoftMaxEntriesPerbatch > hardMMaxEntriesPerBatch: ", " > "));
                }
                ByteBuffer.allocate(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                throw AnonymousClass001.A0Q("provideSessionId");
            }
            C1Qs c1Qs2 = c1l4.A05;
            int BBZ2 = c1Qs2.BBZ();
            int AoY2 = c1Qs2.AoY();
            int Aa9 = c1Qs2.Aa9();
            C1l0 c1l0 = c1l4.A06;
            C03z c03z = c1l4.A0B;
            String A002 = 01X.A00();
            if (A002 == null) {
                A002 = "unknown";
            }
            1lO r02 = new 1lO(c1l4.A04, c1l0, A00, c03z, new File(A01, A002), BBZ2, AoY2, Aa9, c1l4.A00);
            C1l1 c1l1 = c1l4.A08;
            1Nu r03 = c1l4.A07;
            C1lR c1lR = new C1lR(c1l1, A01, r03.Beh());
            Class cls = c1l4.A0C;
            C1l2 c1l2 = c1l4.A09;
            boolean z = c1l4.A0D;
            r302 = new 1lU(r02, r03, new 1lS(context, c1l4.A03, c1l2, c1lR, cls, r03.CZf(), c1l4.A01, z, r03.D8d()));
            c1l5.A00 = r302;
        }
        return r302;
    }

    private 1lU A01() {
        C1l5 c1l5 = this.A06;
        if (c1l5.A01 == null) {
            C1l4 c1l4 = c1l5.A07;
            C1Qs c1Qs = c1l4.A05;
            int BBZ = c1Qs.BBZ();
            int AoY = c1Qs.AoY();
            int Aa9 = c1Qs.Aa9();
            C1l0 c1l0 = c1l4.A06;
            C03z c03z = c1l4.A0B;
            1lU r0 = new 1lU(new 1lP(c1l4.A04, c1l0, c03z, BBZ, AoY, Aa9), c1l4.A07, new C5iz(c1l4.A02, c1l4.A03, c1l4.A08, c03z));
            c1l5.A01 = r0;
            r0.A00.A06(this.A00);
        }
        return c1l5.A01;
    }

    private void A02(C1ke c1ke, boolean z) {
        07T r306;
        if (!z) {
            long j = c1ke.A00;
            C1O1 c1o1 = this.A03;
            if (c1o1 != null) {
                0V0.A00("doWaitForWriteBlockRelease");
                c1o1.ACR(j == ((long) (-2)) ? 0S2.A00 : 0S2.A01);
                0V1.A00();
            }
        }
        0V0.A00("doWrite");
        try {
            0V0.A00("writeToDisk");
            try {
                try {
                    1lU A00 = A00();
                    1lP r0 = A00.A00;
                    r306 = c1ke.A03;
                    r0.A07(r306);
                    long j2 = c1ke.A00;
                    1lT r02 = A00.A01;
                    r02.CqQ(r0.A04());
                    r02.Bfm(j2);
                    1lU.A00(A00);
                    A04(this, r306, "event.persisted", c1ke.A05, c1ke.A06);
                } catch (2Q2 | IOException | 2Q3 unused) {
                    String str = c1ke.A05;
                    String str2 = c1ke.A06;
                    r306 = c1ke.A03;
                    A04(this, r306, "event.not_processed.persist.failed", str, str2);
                    try {
                        1lU A01 = A01();
                        1lP r03 = A01.A00;
                        r03.A07(r306);
                        long j3 = c1ke.A00;
                        1lT r04 = A01.A01;
                        r04.CqQ(r03.A04());
                        r04.Bfm(j3);
                        1lU.A00(A01);
                        A04(this, r306, "event.persisted.in_memory", str, str2);
                    } catch (IOException e) {
                        throw AnonymousClass001.A0U(e);
                    }
                }
                0V1.A00();
                A05(r306, c1ke.A00);
                r306.A02();
            } finally {
                0V1.A00();
            }
        } catch (Throwable th) {
            c1ke.A03.A02();
            throw th;
        }
    }

    public static void A03(C1l6 c1l6) {
        if (c1l6.A06.A05.AjX()) {
            synchronized (c1l6.A05) {
                c1l6.A01 = null;
            }
        }
    }

    public static void A04(C1l6 c1l6, 07S r302, String str, String str2, String str3) {
        1RL r0 = c1l6.A06.A02;
        if (r0.BTF()) {
            r0.AUJ().BZS(str, str2, str3, new 3jH(r302, 3), 1L, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.4mY, java.lang.Object] */
    private void A05(07S r302, long j) {
        1KT r309 = (j == ((long) (-2)) || j == ((long) (-4))) ? this.A06.A03 : this.A06.A04;
        if (r309 != null) {
            0V0.A00("eventListener");
            try {
                ?? obj = new Object();
                if (r309 instanceof 1Qh) {
                    ((1Qh) r309).A00((4mY) obj, r302);
                } else {
                    r309.Bwk();
                }
            } finally {
                0V1.A00();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x005d, code lost:
    
        X.0V0.A00("handleAsapMessage");
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0065, code lost:
    
        A02(r0, r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0384, code lost:
    
        r304 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0385, code lost:
    
        X.0V1.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0389, code lost:
    
        throw r304;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleMessage(android.os.Message r302) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1l6.handleMessage(android.os.Message):void");
    }
}
