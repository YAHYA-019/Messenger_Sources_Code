package X;

/* loaded from: Ihd.class */
public final class Ihd implements C3lk {
    public final /* synthetic */ IPb A00;

    public Ihd(IPb iPb) {
        this.A00 = iPb;
    }

    @Override // X.C3lk
    public final void C8b(String str, String str2, String str3, String str4) {
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        IPb iPb = this.A00;
        I2D i2d = iPb.A03;
        if (str == null) {
            str8 = "";
        }
        if (str2 == null) {
            str7 = "";
        }
        if (str3 == null) {
            str6 = "";
        }
        if (str4 == null) {
            str5 = "";
        }
        i2d.A01(str8, str7, str6, str5, "VideoPrefetchHelper", iPb.A04);
    }
}
