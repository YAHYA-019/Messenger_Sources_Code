package X;

import java.lang.reflect.Array;

/* renamed from: X.4Dr, reason: invalid class name */
/* loaded from: 4Dr.class */
public final class C4Dr {
    public static 0JI A05 = new 0JH().A01();
    public static 0JI A06 = new 0JH().A01();
    public static 0JI A07 = new 0JH().A01();
    public static 0JI A08 = new 0JH().A01();
    public static Boolean A09 = false;
    public static final String[] A0A = {"attribution_id_v2", "entrypoint", "extra_entry_point_.*", "extra_launch_uri", "extra_thread_deeplink_back_navigation", "fb_messaging_attribution_logging_entrypoint", "fb_messaging_entrypoint", "fb_messaging_initiating_app_id", "fb_messaging_surface.*", "inbox_count", "is_diode", "is_from_fb4a", "is_from_messenger_button", "prefer_.*", "send_as_message_entry_point", "send_as_message_share_source", "share_return_to_fb4a", ".*trigger.*", "referrer_app_version", "app_switch_id", "product_type", "is_from_messenger_e2ee_thread", "application_link_type"};
    public final C00i A00;
    public final C00i A02;
    public final C00i A04;
    public final C00i A01 = new 1BQ(16511);
    public final C00i A03 = new 1BQ(16386);

    public C4Dr() {
        1BQ r0 = new 1BQ(16385);
        this.A04 = r0;
        1BQ r02 = new 1BQ(16387);
        this.A00 = r02;
        this.A02 = new 1BQ(16634);
        0JH r03 = new 0JH();
        String[] strArr = A0A;
        r03.A04 = true;
        String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, 23, 3);
        int i = 0;
        do {
            String str = strArr[i];
            String[] strArr3 = new String[3];
            strArr3[0] = str;
            strArr3[1] = ".*";
            strArr3[2] = ".*";
            strArr2[i] = strArr3;
            i++;
        } while (i < 23);
        0JH.A00(r03, strArr2);
        A05 = r03.A01();
        A06 = A00(false, false);
        2yD r04 = (2yD) r0.get();
        1GD r05 = 1GD.A07;
        if (r04.AZr(r05, 36320021572696680L)) {
            A07 = A00(true, false);
        }
        if (((2yD) r02.get()).AZr(r05, 72339382549152814L)) {
            A08 = A00(false, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d3, code lost:
    
        if (r0 != r0.length) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.0JI A00(boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Dr.A00(boolean, boolean):X.0JI");
    }
}
