package X;

/* loaded from: Fta.class */
public final class Fta implements GGi {
    public final int A00;
    public final Object A01;

    public Fta(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.3sk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [X.3sk, java.lang.Object] */
    @Override // X.GGi
    public /* bridge */ /* synthetic */ Ejp AHx(Object obj) {
        Object obj2;
        Object fu1;
        int i;
        Fss fss;
        switch (this.A00) {
            case 1:
                obj2 = this;
                fu1 = new Fu1(new EDd(0S2.A01));
                i = 0;
                break;
            case 2:
            case 5:
            default:
                fss = (Fss) ((Fta) this.A01).A01;
                return fss.A00();
            case 3:
                obj2 = this;
                fu1 = new Fu1(new Object());
                i = 2;
                break;
            case 4:
                obj2 = this.A01;
                fu1 = new Fu2(new Object());
                i = 6;
                break;
            case 6:
                obj2 = this;
                fu1 = new Fu1(new EDl((F5Z) obj));
                i = 5;
                break;
            case 7:
                return new Ejp(new Ftb((EEl) this.A01, ((AbstractC10314t5) obj).A00), new Fu2(new Object()));
            case 8:
                fss = ((Ftb) this.A01).A01;
                return fss.A00();
        }
        return new Ejp(new Fta(obj2, i), fu1);
    }
}
