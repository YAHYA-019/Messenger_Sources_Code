package X;

/* loaded from: C06.class */
public final class C06 {
    public final 1Br A00 = 1BK.A0C();

    public final Integer A00() {
        Integer num;
        int i;
        long Auy = 1Br.A07(this.A00).Auy(36596767789354061L);
        Integer[] A00 = 0S2.A00(3);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < length) {
                num = A00[i3];
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != ((int) Auy)) {
                    i2 = i3 + 1;
                }
            } else {
                num = 0S2.A00;
            }
        }
        return num;
    }
}
