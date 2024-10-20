package X;

/* loaded from: Ier.class */
public abstract class Ier implements 3tY {
    public boolean AZj(String str, String str2, boolean z) {
        return Anw(str2, z);
    }

    public double AiC(String str, String str2, double d) {
        return d;
    }

    public boolean Anw(String str, boolean z) {
        if (this instanceof Gv7) {
            Gv7 gv7 = (Gv7) this;
            11T.A0F(str, 0);
            if (str.equals("shouldEnableInitialThroughUnderlyingService")) {
                z = gv7.A00;
            }
        }
        return z;
    }

    public String Anx(String str, String str2) {
        return str2;
    }

    public int ArW(String str, String str2, int i) {
        return i;
    }

    public String BD4(String str, String str2, String str3) {
        return str3;
    }
}
