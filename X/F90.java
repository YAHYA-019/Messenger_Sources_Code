package X;

/* loaded from: F90.class */
public final class F90 {
    public String A00;
    public String A01;
    public boolean A02;
    public final /* synthetic */ 1Br A03;

    public F90() {
    }

    public F90(1Br r302) {
        this.A03 = r302;
    }

    public final String A00() {
        String str = this.A01;
        if (str == null) {
            str = null;
        } else {
            String str2 = this.A00;
            if (str2 != null) {
                return 0Pz.A0Y(str2, str, '_');
            }
        }
        return str;
    }

    public final void A01(String str, String str2) {
        String A00 = A00();
        if (A00 == null) {
            1Br.A04(this.A03).D11("instant_games_arcade", "Attempted to log without initializing logger");
            return;
        }
        if (str.equals("scroll")) {
            if (this.A02) {
                return;
            } else {
                this.A02 = true;
            }
        } else if (str.equals("open_arcade")) {
            this.A02 = false;
        }
        1UG A08 = 1BK.A08(4YV.A0B(), 1BJ.A00(1434));
        if (A08.isSampled()) {
            A08.A7R("session_key", A00);
            A08.A7R("action", str);
            A08.A7R("surface", str2);
            A08.BZL();
        }
    }
}
