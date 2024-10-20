package X;

/* loaded from: Ft5.class */
public final class Ft5 implements GGg {
    public final int A00;
    public final Object A01;

    public Ft5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r305v1 */
    /* JADX WARN: Type inference failed for: r305v2 */
    /* JADX WARN: Type inference failed for: r305v3 */
    /* JADX WARN: Type inference failed for: r305v4 */
    /* JADX WARN: Type inference failed for: r305v5, types: [X.FtC, java.lang.Object] */
    @Override // X.GGg
    public 3oH AQM(3oH r302) {
        3oH r305;
        switch (this.A00) {
            case 0:
                r305 = r302;
                GGg[] gGgArr = (GGg[]) this.A01;
                int length = gGgArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        return r305;
                    }
                    r305 = gGgArr[length].AQM(r305);
                }
            case 1:
                return new FtE(r302, (GJg[]) this.A01);
            default:
                Esa esa = (Esa) this.A01;
                r305 = new Object();
                ((FtC) r305).A00 = r302;
                ((FtC) r305).A01 = esa;
                return r305;
        }
    }
}
