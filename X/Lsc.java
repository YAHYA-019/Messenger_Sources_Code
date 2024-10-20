package X;

import java.util.Iterator;

/* loaded from: Lsc.class */
public final class Lsc implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ LyH A03;

    public Lsc(LyH lyH) {
        this.A03 = lyH;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.A00 + 1;
        LyH lyH = this.A03;
        if (i >= lyH.A00.size()) {
            if (lyH.A01.isEmpty()) {
                return false;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass001.A0y(lyH.A01);
                this.A01 = it;
            }
            if (!it.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        LyH lyH = this.A03;
        if (i < lyH.A00.size()) {
            return lyH.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AnonymousClass001.A0y(lyH.A01);
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
        LyH lyH = this.A03;
        LyH.A03(lyH);
        if (this.A00 < lyH.A00.size()) {
            int i = this.A00;
            this.A00 = i - 1;
            LyH.A01(lyH, i);
        } else {
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass001.A0y(lyH.A01);
                this.A01 = it;
            }
            it.remove();
        }
    }
}
