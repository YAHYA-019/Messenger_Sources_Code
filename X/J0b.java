package X;

/* loaded from: J0b.class */
public final class J0b implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerPhotoController$1$1";
    public final /* synthetic */ C2521Gg1 A00;
    public final /* synthetic */ 2Ec A01;
    public final /* synthetic */ String A02;

    public J0b(C2521Gg1 c2521Gg1, 2Ec r303, String str) {
        this.A00 = c2521Gg1;
        this.A02 = str;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2796GoZ c2796GoZ = (C2796GoZ) this.A00.A01;
        c2796GoZ.A02.getClass();
        HU1 hu1 = (HU1) c2796GoZ.A09.get();
        String str = this.A02;
        48J r0 = 48J.A02;
        2Ec r02 = this.A01;
        int height = r02.getHeight();
        int width = r02.getWidth();
        int height2 = c2796GoZ.A02.getHeight();
        int width2 = c2796GoZ.A02.getWidth();
        1UG A08 = 1BK.A08(1Br.A02(hu1.A00), "messenger_stories_media_quality");
        if (A08.isSampled()) {
            A08.A7R("media_id", str);
            A08.A7R("media_type", r0.toString());
            A08.A6H(4YT.A00(1578), AbI.A11(A08, AbI.A11(A08, AbI.A11(A08, 1BK.A0l(height), AbE.A00(584), width), "media_width", height2), 4YT.A00(1577), width2));
            A08.BZL();
        }
    }
}
