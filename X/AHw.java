package X;

/* loaded from: AHw.class */
public final class AHw implements 0zV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AHw(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj;
        this.A01 = obj2;
    }

    public Object collect(0zU r302, 0DR r303) {
        0zV r305;
        Object obj;
        Object obj2;
        int i;
        0zU ai1;
        Object A00;
        FAD fad;
        FAD fad2;
        int i2;
        switch (this.A00) {
            case 0:
                r305 = (0zV) this.A02;
                obj = this.A03;
                obj2 = this.A01;
                i = 0;
                ai1 = new AI1(i, obj2, obj, r302);
                A00 = r305.collect(ai1, r303);
                break;
            case 1:
                r305 = (0zV) this.A02;
                ai1 = new AI1(2, this.A01, this.A03, r302);
                A00 = r305.collect(ai1, r303);
                break;
            case 2:
                r305 = (0zV) this.A02;
                obj = this.A03;
                obj2 = this.A01;
                i = 3;
                ai1 = new AI1(i, obj2, obj, r302);
                A00 = r305.collect(ai1, r303);
                break;
            case 3:
                r305 = (0zV) this.A02;
                obj = this.A03;
                obj2 = this.A01;
                i = 4;
                ai1 = new AI1(i, obj2, obj, r302);
                A00 = r305.collect(ai1, r303);
                break;
            case 4:
                r305 = (0zV) this.A02;
                obj = this.A03;
                obj2 = this.A01;
                i = 8;
                ai1 = new AI1(i, obj2, obj, r302);
                A00 = r305.collect(ai1, r303);
                break;
            case 5:
                0zV[] r0 = (0zV[]) this.A02;
                A00 = C0z7.A00(r303, new AQY(r0, 48), new G97((C2lh) this.A03, (java.util.Map) this.A01, (0DR) null), r302, r0);
                break;
            case 6:
                r305 = (0zV) this.A03;
                fad = (FAD) this.A02;
                fad2 = (FAD) this.A01;
                i2 = 0;
                ai1 = new G7h(fad, fad2, r302, i2);
                A00 = r305.collect(ai1, r303);
                break;
            default:
                r305 = (0zV) this.A03;
                fad = (FAD) this.A02;
                fad2 = (FAD) this.A01;
                i2 = 1;
                ai1 = new G7h(fad, fad2, r302, i2);
                A00 = r305.collect(ai1, r303);
                break;
        }
        if (A00 != 0Ds.A02) {
            A00 = 04S.A00;
        }
        return A00;
    }
}
