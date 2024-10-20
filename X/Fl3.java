package X;

/* loaded from: Fl3.class */
public final class Fl3 implements GFN {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fl3(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bqb() {
        String str;
        int i = this.A00;
        GL5 gl5 = (GL5) this.A02;
        switch (i) {
            case 1:
                str = ((E5H) this.A01).A03;
                break;
            case 5:
                str = ((E5E) this.A01).A03;
                break;
            case 7:
                str = ((E5F) this.A01).A04;
                break;
            default:
                gl5.AGC(-1, null);
                return;
        }
        gl5.AGC(-1, str);
    }
}
