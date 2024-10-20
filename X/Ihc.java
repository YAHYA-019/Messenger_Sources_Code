package X;

/* loaded from: Ihc.class */
public final class Ihc implements C3lk {
    public final /* synthetic */ IPa A00;

    public Ihc(IPa iPa) {
        this.A00 = iPa;
    }

    @Override // X.C3lk
    public final void C8b(String str, String str2, String str3, String str4) {
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        IPa iPa = this.A00;
        I2D i2d = iPa.A03;
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
        i2d.A01(str8, str7, str6, str5, "VideoPrefetchProfileHelper", iPa.A04);
    }
}
