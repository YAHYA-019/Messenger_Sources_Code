package X;

import java.util.Iterator;

/* renamed from: X.01k, reason: invalid class name */
/* loaded from: 01k.class */
public final class C01k extends C01l implements Iterator {
    public 06H A00;
    public boolean A01 = true;
    public final /* synthetic */ 0QJ A02;

    public C01k(0QJ r302) {
        this.A02 = r302;
    }

    @Override // X.C01l
    public void A00(06H r302) {
        06H r0 = this.A00;
        if (r302 == r0) {
            06H r02 = r0.A01;
            this.A00 = r02;
            boolean z = false;
            if (r02 == null) {
                z = true;
            }
            this.A01 = z;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        06H r304;
        if (this.A01) {
            r304 = this.A02.A02;
        } else {
            06H r0 = this.A00;
            if (r0 == null) {
                return false;
            }
            r304 = r0.A00;
        }
        return r304 != null;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        06H r303;
        if (this.A01) {
            this.A01 = false;
            r303 = this.A02.A02;
        } else {
            06H r0 = this.A00;
            r303 = r0 != null ? r0.A00 : null;
        }
        this.A00 = r303;
        return r303;
    }
}
