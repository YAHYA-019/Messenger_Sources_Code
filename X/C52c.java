package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.inject.FbInjector;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.52c, reason: invalid class name */
/* loaded from: 52c.class */
public final class C52c implements C52d {
    public final C52f A00;
    public volatile boolean A09;
    public volatile boolean A0A;
    public volatile boolean A0B;
    public final 1Br A02 = 1Bu.A00(16430);
    public final 1Br A01 = 1Bq.A00(16457);
    public final 1Br A03 = 1Bq.A00(116091);
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final Set A04 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public volatile C52e A08 = C52e.A04;
    public final AtomicReference A07 = new AtomicReference(null);
    public final AtomicInteger A06 = new AtomicInteger(0);

    public C52c() {
        C52f c52f = (C52f) 1Bi.A03(115344);
        final Context A00 = FbInjector.A00();
        this.A00 = c52f;
        ((ExecutorService) this.A01.A00.get()).submit(new Runnable() { // from class: X.52h
            public static final String __redex_internal_original_name = "InlineVideoSoundSettings$1";

            /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 351
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C52h.run():void");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r301.A09 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r301.A09 == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.C52c r301) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52c.A00(X.52c):void");
    }

    @Override // X.C52d
    public boolean BWF() {
        return this.A09;
    }

    @Override // X.C52d
    public void CTE() {
        synchronized (this) {
            C52f c52f = this.A00;
            AtomicReference atomicReference = this.A07;
            C52e c52e = (C52e) atomicReference.get();
            if (c52e != null) {
                this.A08 = c52e;
                atomicReference.set(null);
            }
            boolean A02 = c52f.A02();
            if (this.A0A != A02) {
                this.A0A = A02;
                A00(this);
            }
        }
    }

    @Override // X.C52d
    public void CTM() {
        synchronized (this) {
            C52f c52f = this.A00;
            this.A07.set(this.A08);
            this.A08 = C52e.A04;
            this.A0A = c52f.A02();
        }
    }

    @Override // X.C52d
    public void Cc7(Hmy hmy) {
        11T.A0F(hmy, 0);
        Set set = this.A04;
        11T.A09(set);
        synchronized (set) {
            set.add(hmy);
        }
    }

    @Override // X.C52d
    public void Cui(C52j c52j, String str, boolean z) {
        11T.A0F(c52j, 1);
        if (this.A09 != z) {
            if (c52j != C52j.A09 && c52j == C52j.A2Z) {
                ((5TF) 1Br.A0B(this.A03)).A0H(new GPu(this, 0), str);
            }
            this.A09 = z;
            ((Handler) this.A02.A00.get()).post(new C52k(this, c52j));
            C52f c52f = this.A00;
            boolean z2 = this.A09;
            if (C52j.A2Z == c52j) {
                0fH.A0g(Boolean.valueOf(z2), C52f.A09, "Changing sound toggle preference to %s");
                1Ql.A01(1Br.A08(c52f.A04), C52i.A02, z2);
            }
        }
    }

    @Override // X.C52d
    public void D5u(Hmy hmy) {
        11T.A0F(hmy, 0);
        Set set = this.A04;
        11T.A09(set);
        synchronized (set) {
            set.remove(hmy);
        }
    }
}
