package X;

/* loaded from: N1f.class */
public abstract class N1f {
    public static Object A00(int i, 1BO r302, Object obj) {
        if (((i >> 7) & 15) == 0) {
            return A01(i, r302, obj);
        }
        throw MRl.A0J();
    }

    public static Object A01(int i, 1BO r302, Object obj) {
        NCq nCo;
        switch ((i >> 0) & 127) {
            case 0:
                nCo = new NCq(r302);
                break;
            case 1:
                nCo = new NCr(r302);
                break;
            case 2:
                nCo = new NCu(r302);
                break;
            case 3:
                nCo = NDD.A00();
                break;
            case 4:
                nCo = NDA.A00();
                break;
            case 5:
            case 6:
            default:
                throw MRl.A0J();
            case 7:
                nCo = new NCp(r302);
                break;
            case 8:
                nCo = NDB.A00(r302);
                break;
            case 9:
                nCo = new NCs(r302);
                break;
            case 10:
                nCo = NDE.A00(r302);
                break;
            case 11:
                nCo = new NCt(r302);
                break;
            case 12:
                nCo = NDC.A00();
                break;
            case 13:
                nCo = new NCo(r302);
                break;
        }
        return nCo;
    }
}
