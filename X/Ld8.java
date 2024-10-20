package X;

/* loaded from: Ld8.class */
public final class Ld8 implements MKi {
    public final KwU A00;
    public final MCx A01;
    public final KwV A02;

    public Ld8(KwU kwU, MCx mCx, KwV kwV) {
        this.A02 = kwV;
        this.A00 = kwU;
        this.A01 = mCx;
    }

    @Override // X.MKi
    public final int DC6(Object obj) {
        return ((K5Q) obj).zzc.hashCode();
    }

    @Override // X.MKi
    public final K5Q DCW() {
        if (this.A01 instanceof K5Q) {
            return new K5W();
        }
        K5P k5p = new K5P(K5W.zzb);
        K5P.A00(k5p);
        return k5p.A00;
    }

    @Override // X.MKi
    public final void DCg(Object obj) {
        LAl lAl = ((K5Q) obj).zzc;
        if (lAl.A01) {
            lAl.A01 = false;
        }
        throw AnonymousClass001.A0Q(Lly.__redex_internal_original_name);
    }

    @Override // X.MKi
    public final void DCo(Object obj, Object obj2) {
        Kyd.A00(obj, obj2);
    }

    @Override // X.MKi
    public final void DCu(L0I l0i, Object obj, byte[] bArr, int i, int i2) {
        K5Q k5q = (K5Q) obj;
        if (k5q.zzc == LAl.A04) {
            k5q.zzc = LAl.A00();
        }
        throw null;
    }

    @Override // X.MKi
    public final boolean DD0(Object obj, Object obj2) {
        return JQy.A1X(((K5Q) obj).zzc.equals(((K5Q) obj2).zzc) ? 1 : 0);
    }
}
