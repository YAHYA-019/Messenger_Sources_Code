package X;

/* loaded from: Gtk.class */
public final class Gtk extends GuG implements JPh {
    public IOQ A00;
    public final JQ8 A01;
    public volatile IEE A02;
    public volatile JPz A03;

    public Gtk(JOW jow) {
        super(jow);
        this.A01 = (JQ8) ((GuG) this).A00.AdD(JQ8.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x004f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.IEE A00(android.content.Context r301, X.JQ9 r302, X.JQ8 r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gtk.A00(android.content.Context, X.JQ9, X.JQ8, java.lang.String):X.IEE");
    }

    public static boolean A01(String str) {
        Object obj;
        switch (str.hashCode()) {
            case -2109762974:
                obj = "ar_ads_camera";
                break;
            case -1872202802:
                obj = "messenger_camera_composer";
                break;
            case -1860080918:
                obj = "inspiration";
                break;
            case -1344425781:
                obj = "inspiration_camera_shortcut";
                break;
            case -1180487979:
                obj = "inspiration_composer";
                break;
            case -875891333:
                obj = "inspiration_other";
                break;
            case -873570300:
                obj = "inspiration_reels";
                break;
            case -817936692:
                obj = "instagram_reels";
                break;
            case -725934347:
                obj = "inspiration_composer_comment";
                break;
            case -656087042:
                obj = "inspiration_stories";
                break;
            case 17032470:
                obj = "instagram_direct";
                break;
            case 165128166:
                obj = "messenger_camera_chathead";
                break;
            case 267394712:
                obj = "messenger_camera_inbox";
                break;
            case 1268202694:
                obj = "instagram_stories";
                break;
            case 2017524177:
                obj = "messenger_camera";
                break;
            default:
                return false;
        }
        return str.equals(obj);
    }

    public void A0A() {
        HJS hjs = JQ9.A00;
        JOW jow = ((GuG) this).A00;
        JQ9 jq9 = (JQ9) jow.AdD(hjs);
        String str = (String) A0C(Hxy.A02);
        this.A03 = (JPz) A0B(JPz.A01);
        jow.Adn(HOJ.A01);
        this.A02 = A00(jow.getContext(), jq9, this.A01, str);
    }

    @Override // X.JQC
    public GuJ Ase() {
        return JPh.A00;
    }
}
