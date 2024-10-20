package X;

import java.util.Iterator;

/* loaded from: Lsj.class */
public final class Lsj implements Iterator {
    public Object A00;
    public final int A01;
    public final Object A02;

    public Lsj(LyB lyB) {
        this.A01 = 3;
        this.A02 = lyB;
        this.A00 = lyB.A00.iterator();
    }

    public Lsj(LyD lyD) {
        this.A01 = 4;
        this.A02 = lyD;
        this.A00 = lyD.A00.iterator();
    }

    public Lsj(Object obj, Object obj2, int i) {
        this.A01 = i;
        this.A00 = obj;
        this.A02 = obj2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Object obj;
        switch (this.A01) {
            case 3:
            case 4:
                obj = this.A00;
                break;
            default:
                obj = this.A02;
                break;
        }
        return ((Iterator) obj).hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.A01) {
            case 0:
                return JR1.A0r((Iterator) this.A02);
            case 1:
                return GOp.A15((Iterator) this.A02);
            case 2:
                return new 3Cc(AnonymousClass001.A0z((Iterator) this.A02));
            default:
                return ((Iterator) this.A00).next();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.A01) {
            case 0:
                throw AnonymousClass001.A0p();
            case 1:
                throw AnonymousClass001.A0p();
            case 2:
                ((Iterator) this.A02).remove();
                ((KAg) this.A00).A02();
                return;
            case 3:
                throw AnonymousClass001.A0p();
            default:
                throw AnonymousClass001.A0p();
        }
    }
}
