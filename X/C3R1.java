package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3R1, reason: invalid class name */
/* loaded from: 3R1.class */
public final class C3R1 {
    public static final 1G2 A06;
    public static final 1G2 A07;
    public static final 1G2 A08;
    public final C00i A05 = 1BQ.A02(16821);
    public final C00i A02 = 1BQ.A02(33013);
    public final C00i A04 = 1BQ.A02(16449);
    public final C00i A01 = 1BQ.A02(99390);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public List mReferenceHolder = AnonymousClass001.A0s();
    public java.util.Map mLeakTypeMap = AnonymousClass001.A0u();
    public boolean A00 = false;

    static {
        1G2 A01 = 1G3.A01(1G0.A04, "hprof/");
        A07 = A01;
        1G2 A012 = 1G3.A01(A01, "next/");
        A08 = A012;
        A06 = 1G3.A01(A012, "leak/");
    }

    public C3R1() {
        C0ft.A04(new FdO(this, 0), false);
    }

    public void A00() {
        if (this.A00 && 1BK.A0N(((C1py) this.A05.get()).A00).AZk(36314270610562868L)) {
            long A082 = 1BL.A08(this.A01);
            C00i c00i = this.A02;
            FbSharedPreferences A0R = 1BK.A0R(c00i);
            1G2 r0 = A06;
            if (A082 < A0R.Av1(r0, A082) || !this.A03.compareAndSet(false, true)) {
                return;
            }
            long j = A082 + 86400000;
            1Ql A0V = 1BL.A0V(c00i);
            A0V.CaH(r0, j);
            A0V.commit();
            1BK.A1E(this.A04).execute(new Runnable() { // from class: X.3el
                public static final String __redex_internal_original_name = "LeakMemoryDumper$2";

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C01083pw.A00().A02().A06("Leak", (String) null, 0);
                        Thread.sleep(5000L);
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        C3R1 c3r1 = C3R1.this;
                        1G2 r02 = C3R1.A06;
                        c3r1.mReferenceHolder.clear();
                        c3r1.A00 = false;
                        c3r1.A03.set(false);
                        throw th;
                    }
                    C3R1 c3r12 = C3R1.this;
                    1G2 r03 = C3R1.A06;
                    c3r12.mReferenceHolder.clear();
                    c3r12.A00 = false;
                    c3r12.A03.set(false);
                }
            });
        }
    }
}
