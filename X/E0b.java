package X;

/* loaded from: E0b.class */
public final class E0b extends 2Yv {
    public FyG A00;
    public Ewd A01;
    public Egf A02;
    public Egg A03;
    public Etc A04;
    public Egh A05;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i != 0) {
            if (i == 1) {
                this.A01 = (Ewd) objArr[0];
            }
        } else {
            Egg egg = this.A03;
            Object obj = objArr[0];
            if (egg != null) {
                synchronized (egg) {
                    egg.A00.add(obj);
                }
            }
            this.A03 = egg;
        }
    }
}
