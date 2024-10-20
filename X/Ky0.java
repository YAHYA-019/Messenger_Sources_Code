package X;

/* loaded from: Ky0.class */
public abstract class Ky0 {
    public static final java.util.Map A00;

    static {
        03Y[] r0 = new 03Y[28];
        System.arraycopy(7zQ.A1b(7zL.A18(C0zc.class), G7i.A00), 1BK.A1W(new 03Y[]{1BK.A1G(7zL.A18(String.class), 5ZL.A01), 1BK.A1G(7zL.A18(Character.TYPE), Lv5.A00), 1BK.A1G(7zL.A18(char[].class), MA6.A00), 1BK.A1G(7zL.A18(Double.TYPE), Lv6.A00), 1BK.A1G(7zL.A18(double[].class), MA7.A00), 1BK.A1G(7zL.A18(Float.TYPE), Lv7.A00), 1BK.A1G(7zL.A18(float[].class), MA8.A00), 1BK.A1G(7zL.A18(Long.TYPE), 5ZP.A00), 1BK.A1G(7zL.A18(long[].class), MAA.A00), 1BK.A1G(7zL.A18(AnonymousClass141.class), LvD.A01), 1BK.A1G(7zL.A18(C0rl.class), MAE.A00), 1BK.A1G(7zL.A18(Integer.TYPE), Lv8.A00), 1BK.A1G(7zL.A18(int[].class), MA9.A00), 1BK.A1G(7zL.A18(AnonymousClass147.class), LvC.A01), 1BK.A1G(7zL.A18(C0ri.class), MAD.A00), 1BK.A1G(7zL.A18(Short.TYPE), LvA.A00), 1BK.A1G(7zL.A18(short[].class), MAB.A00), 1BK.A1G(7zL.A18(C13v.class), LvE.A01), 1BK.A1G(7zL.A18(C0rn.class), MAF.A00), 1BK.A1G(7zL.A18(Byte.TYPE), Lv4.A00), 1BK.A1G(7zL.A18(byte[].class), MA5.A00), 1BK.A1G(7zL.A18(14E.class), LvB.A01), 1BK.A1G(7zL.A18(C0rg.class), MAC.A00), 1BK.A1G(7zL.A18(Boolean.TYPE), Lv3.A00), 1BK.A1G(7zL.A18(boolean[].class), MA4.A00), 1BK.A1G(7zL.A18(04S.class), LvL.A01), 1BK.A1G(7zL.A18(Void.class), Lv9.A00)}, r0) ? 1 : 0, r0, 27, 1);
        A00 = 04R.A09(r0);
    }

    public static final String A00(String str) {
        if (str.length() > 0) {
            StringBuilder A0k = AnonymousClass001.A0k();
            char charAt = str.charAt(0);
            A0k.append((Object) (Character.isLowerCase(charAt) ? C0zf.A00(charAt) : String.valueOf(charAt)));
            str = AnonymousClass001.A0d(DKC.A19(str, 1), A0k);
        }
        return str;
    }
}
