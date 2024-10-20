package X;

/* renamed from: X.18z, reason: invalid class name */
/* loaded from: 18z.class */
public class C18z {
    public final C18s A00;
    public final Object A01;
    public final Object A02;

    public C18z(C18s c18s, Object obj, Object obj2) {
        this.A00 = c18s;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        String str;
        C18s c18s = this.A00;
        String obj = c18s.A03.toString();
        switch (0C8.A01(c18s.A02).intValue()) {
            case 0:
                str = "FIRE_AND_FORGET";
                break;
            case 1:
                str = "ACKNOWLEDGED_DELIVERY";
                break;
            default:
                str = "ASSURED_DELIVERY";
                break;
        }
        return 0Pz.A0Y(obj, str, ' ');
    }
}
