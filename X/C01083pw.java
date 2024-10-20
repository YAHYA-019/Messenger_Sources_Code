package X;

import android.app.Application;
import com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer;
import com.facebook.common.errorreporting.memory.providerhook.GeneratedMemoryManagerProvider;
import java.util.List;

/* renamed from: X.3pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pw.class */
public final class C01083pw {
    public static volatile C01083pw A0a;
    public Application A00;
    public C4D7 A01;
    public HeapSanitizer A02;
    public Bzw A03;
    public 9HF A04;
    public 9HG A05;
    public List A06;
    public C5fj A07;
    public 4DC A08;
    public 5QW A09;
    public C4D9 A0A;
    public 5E5 A0B;
    public C4D1 A0C;
    public final C4Cx A0D;
    public final C4Cx A0E;
    public final C4Cz A0F;
    public final List A0G;
    public final C15h A0H;
    public final C15h A0I;
    public final C15h A0J;
    public final C15h A0K;
    public final C15h A0L;
    public final C15h A0M;
    public final C15h A0N;
    public final 4DD A0O;
    public final C4Cy A0P;
    public final C15h A0Q;
    public final C15h A0R;
    public final C15h A0S;
    public final C15h A0T;
    public final C15h A0U;
    public final C15h A0V;
    public final C15h A0W;
    public final C15h A0X;
    public final C15h A0Y;
    public final C15h A0Z;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x01ae, code lost:
    
        if (r0.A01() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C01083pw(X.C4D4 r302, X.C4Cy r303, X.C4Cx r304, X.C4Cx r305, X.C4Cz r306, java.util.List r307, X.C15h r308, X.C15h r309, X.C15h r310, X.C15h r311, X.C15h r312, X.C15h r313, X.C15h r314, X.C15h r315, X.C15h r316, X.C15h r317, X.C15h r318, X.C15h r319, X.C15h r320, X.C15h r321, X.C15h r322, X.C15h r323, X.C15h r324, X.C15h r325) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01083pw.<init>(X.4D4, X.4Cy, X.4Cx, X.4Cx, X.4Cz, java.util.List, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h, X.15h):void");
    }

    public static C01083pw A00() {
        return A0a != null ? A0a : (C01083pw) GeneratedMemoryManagerProvider.get();
    }

    public C5fj A01() {
        C5fj c5fj;
        synchronized (this) {
            if (this.A07 == null) {
                C15h c15h = this.A0V;
                0T9.A02("MemoryManager.getOmuraMetricsReporter", 688268340);
                this.A07 = (C5fj) c15h.get();
                0T9.A00(824899295);
            }
            c5fj = this.A07;
        }
        return c5fj;
    }

    public 4DD A02() {
        4DD r0;
        synchronized (this) {
            r0 = this.A0O;
        }
        return r0;
    }

    public 4DC A03() {
        4DC r0;
        synchronized (this) {
            if (this.A08 == null) {
                C15h c15h = this.A0U;
                0T9.A02("MemoryManager.getMemoryMetricsManager", -177547454);
                this.A08 = (4DC) c15h.get();
                0T9.A00(1502549100);
            }
            r0 = this.A08;
        }
        return r0;
    }

    public 5QW A04() {
        5QW r0;
        synchronized (this) {
            if (this.A09 == null) {
                0T9.A02("MemoryManager.getMemoryUploader", 929584891);
                this.A09 = (5QW) this.A0Y.get();
                0T9.A00(-1053800489);
            }
            r0 = this.A09;
        }
        return r0;
    }

    public C4D9 A05() {
        C4D9 c4d9;
        synchronized (this) {
            if (this.A0A == null) {
                0T9.A02("MemoryManager.getMemoryDumpMetadataStore", 1817358961);
                this.A0A = (C4D9) this.A0T.get();
                0T9.A00(-1331028697);
            }
            c4d9 = this.A0A;
        }
        return c4d9;
    }

    public 5E5 A06() {
        5E5 r0;
        synchronized (this) {
            if (this.A0B == null) {
                0T9.A02("MemoryManager.getMemoryMetricsManager", 302857392);
                C15h c15h = this.A0X;
                c15h.getClass();
                this.A0B = (5E5) c15h.get();
                0T9.A00(385021668);
            }
            r0 = this.A0B;
        }
        return r0;
    }

    public C4D1 A07() {
        C4D1 c4d1;
        synchronized (this) {
            if (this.A0C == null) {
                0T9.A02("MemoryManager.getMemoryLeakConfig", 32869045);
                this.A0C = (C4D1) this.A0W.get();
                0T9.A00(-2021131311);
            }
            c4d1 = this.A0C;
        }
        return c4d1;
    }
}
