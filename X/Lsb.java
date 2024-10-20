package X;

import java.util.Iterator;

/* loaded from: Lsb.class */
public final class Lsb implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ LyG A03;

    public Lsb(LyG lyG) {
        this.A03 = lyG;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z = true;
        int i = this.A00 + 1;
        LyG lyG = this.A03;
        if (i >= lyG.A00.size()) {
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass001.A0y(lyG.A01);
                this.A01 = it;
            }
            if (!it.hasNext()) {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        LyG lyG = this.A03;
        if (i < lyG.A00.size()) {
            return lyG.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AnonymousClass001.A0y(lyG.A01);
            this.A01 = it;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.A02) {
            throw AnonymousClass001.A0N("remove() was called before next()");
        }
        this.A02 = false;
        LyG lyG = this.A03;
        LyG.A03(lyG);
        if (this.A00 < lyG.A00.size()) {
            int i = this.A00;
            this.A00 = i - 1;
            LyG.A01(lyG, i);
        } else {
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass001.A0y(lyG.A01);
                this.A01 = it;
            }
            it.remove();
        }
    }
}
