package X;

/* loaded from: Fv6.class */
public final class Fv6 implements GIy {
    public final /* synthetic */ GIy A00;
    public final /* synthetic */ RQU A01;
    public final /* synthetic */ String A02;

    public Fv6(GIy gIy, RQU rqu, String str) {
        this.A00 = gIy;
        this.A01 = rqu;
        this.A02 = str;
    }

    @Override // X.GIy
    public void CEX(Boolean bool, Integer num, Throwable th) {
        this.A00.CEX(bool, num, th);
    }

    @Override // X.GIy
    public void CEY(String str) {
        this.A00.CEY(str);
        RQU rqu = this.A01;
        rqu.A00.remove(this.A02);
    }
}
