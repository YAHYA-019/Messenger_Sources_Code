package X;

/* loaded from: Ldc.class */
public final class Ldc implements MKz {
    public final L2m A00;
    public final MQk A01;
    public final L5O A02;

    public Ldc(L2m l2m, MQk mQk, L5O l5o) {
        this.A02 = l5o;
        this.A00 = l2m;
        this.A01 = mQk;
    }

    public static Ldc A00(L2m l2m, MQk mQk, L5O l5o) {
        return new Ldc(l2m, mQk, l5o);
    }

    @Override // X.MKz
    public final int DC6(Object obj) {
        L5O l5o = this.A02;
        return l5o.A01(l5o.A02(obj));
    }

    @Override // X.MKz
    public final int DCH(Object obj) {
        return this.A02.A02(obj).hashCode();
    }

    @Override // X.MKz
    public final K7f DCd() {
        MQk mQk = this.A01;
        return mQk instanceof K7f ? ((K7f) mQk).A0O() : mQk.DDJ().A04();
    }

    @Override // X.MKz
    public final void DCn(Object obj) {
        this.A02.A06(obj);
        this.A00.A01();
        throw 0Q8.createAndThrow();
    }

    @Override // X.MKz
    public final void DCt(Object obj, Object obj2) {
        LEm.A0F(this.A02, obj, obj2);
    }

    @Override // X.MKz
    public final void DD1(L0J l0j, Object obj, byte[] bArr, int i, int i2) {
        K7f k7f = (K7f) obj;
        if (k7f.zzc == LDV.A00()) {
            k7f.zzc = LDV.A01();
        }
        throw null;
    }

    @Override // X.MKz
    public final void DD5(MLI mli, Object obj) {
        this.A00.A00();
        throw 0Q8.createAndThrow();
    }

    @Override // X.MKz
    public final boolean DD8(Object obj, Object obj2) {
        L5O l5o = this.A02;
        return JQy.A1X(l5o.A02(obj).equals(l5o.A02(obj2)) ? 1 : 0);
    }

    @Override // X.MKz
    public final boolean DDC(Object obj) {
        this.A00.A00();
        throw 0Q8.createAndThrow();
    }
}
