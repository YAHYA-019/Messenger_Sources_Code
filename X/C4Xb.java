package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4Xb, reason: invalid class name */
/* loaded from: 4Xb.class */
public final class C4Xb implements Iterator, Closeable {
    public static final C4Xb A07 = new C4Xb(null, null, null, null, null);
    public int A00;
    public final AbstractC01033pi A01;
    public final 3sX A02;
    public final C27T A03;
    public final JsonDeserializer A04;
    public final Object A05;
    public final 24S A06;

    public C4Xb(AbstractC01033pi abstractC01033pi, C27T c27t, 24S r304, JsonDeserializer jsonDeserializer, Object obj) {
        int i;
        this.A06 = r304;
        this.A01 = abstractC01033pi;
        this.A03 = c27t;
        this.A04 = jsonDeserializer;
        if (obj != null) {
            this.A05 = obj;
        }
        if (abstractC01033pi == null) {
            i = 0;
        } else {
            3sX A1H = abstractC01033pi.A1H();
            C42h A1I = abstractC01033pi.A1I();
            this.A02 = (A1I == C42h.A06 || A1I == C42h.A05) ? A1H.A01() : A1H;
            i = 2;
        }
        this.A00 = i;
    }

    private boolean A00() {
        C42h A1K;
        int i = this.A00;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            AbstractC01033pi abstractC01033pi = this.A01;
            3sX A1H = abstractC01033pi.A1H();
            3sX r0 = this.A02;
            if (A1H != r0) {
                while (true) {
                    C42h A1K2 = abstractC01033pi.A1K();
                    if (A1K2 == C42h.A01 || A1K2 == C42h.A02) {
                        if (abstractC01033pi.A1H() == r0) {
                            abstractC01033pi.A1g();
                            break;
                        }
                    } else if (A1K2 == C42h.A05 || A1K2 == C42h.A06) {
                        abstractC01033pi.A20();
                    } else if (A1K2 == null) {
                        break;
                    }
                }
            }
        } else if (i != 2) {
            return true;
        }
        AbstractC01033pi abstractC01033pi2 = this.A01;
        if (abstractC01033pi2 == null) {
            return false;
        }
        if (abstractC01033pi2.A1I() == null && ((A1K = abstractC01033pi2.A1K()) == null || A1K == C42h.A01)) {
            this.A00 = 0;
            return false;
        }
        this.A00 = 3;
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A00 != 0) {
            this.A00 = 0;
            AbstractC01033pi abstractC01033pi = this.A01;
            if (abstractC01033pi != null) {
                abstractC01033pi.close();
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return A00();
        } catch (C2cb e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        AbstractC01033pi abstractC01033pi;
        try {
            int i = this.A00;
            if (i == 0 || ((i == 1 || i == 2) && !A00())) {
                throw new NoSuchElementException();
            }
            try {
                Object obj = this.A05;
                if (obj == null) {
                    JsonDeserializer jsonDeserializer = this.A04;
                    abstractC01033pi = this.A01;
                    obj = jsonDeserializer.A0M(abstractC01033pi, this.A03);
                } else {
                    JsonDeserializer jsonDeserializer2 = this.A04;
                    abstractC01033pi = this.A01;
                    jsonDeserializer2.A0N(abstractC01033pi, this.A03, obj);
                }
                this.A00 = 2;
                abstractC01033pi.A1g();
                return obj;
            } catch (Throwable th) {
                this.A00 = 1;
                this.A01.A1g();
                throw th;
            }
        } catch (C2cb e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0p();
    }
}
