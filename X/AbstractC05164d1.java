package X;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.4d1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4d1.class */
public abstract class AbstractC05164d1 implements Iterator {
    public int A00;
    public int A01 = -1;
    public C1kf A02;
    public C4d3 A03;
    public C4d3 A04;
    public C1kk A05;
    public AtomicReferenceArray A06;
    public final /* synthetic */ 1kN A07;

    public AbstractC05164d1(1kN r302) {
        this.A07 = r302;
        this.A00 = r302.A0L.length - 1;
        A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.AbstractC05164d1 r301) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC05164d1.A00(X.4d1):void");
    }

    private boolean A01(C1kk c1kk) {
        boolean z;
        try {
            1kN r0 = this.A07;
            long read = r0.A0C.read();
            Object key = c1kk.getKey();
            if (c1kk.getKey() != null) {
                Object obj = c1kk.BIt().get();
                if (obj != null && !r0.A02(c1kk, read)) {
                    this.A04 = new C4d3(r0, key, obj);
                    z = true;
                    this.A02.A0O();
                    return z;
                }
            }
            z = false;
            this.A02.A0O();
            return z;
        } catch (Throwable th) {
            this.A02.A0O();
            throw th;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z = false;
        if (this.A04 != null) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this instanceof C05154d0) {
            C4d3 c4d3 = this.A04;
            if (c4d3 == null) {
                throw new NoSuchElementException();
            }
            this.A03 = c4d3;
            A00(this);
            return this.A03.getKey();
        }
        boolean z = this instanceof 7hV;
        C4d3 c4d32 = this.A04;
        if (z) {
            if (c4d32 == null) {
                throw new NoSuchElementException();
            }
            this.A03 = c4d32;
            A00(this);
            return this.A03.getValue();
        }
        if (c4d32 == null) {
            throw new NoSuchElementException();
        }
        this.A03 = c4d32;
        A00(this);
        return this.A03;
    }

    @Override // java.util.Iterator
    public void remove() {
        C4d3 c4d3 = this.A03;
        Preconditions.checkState(AnonymousClass001.A1T(c4d3));
        this.A07.remove(c4d3.getKey());
        this.A03 = null;
    }
}
