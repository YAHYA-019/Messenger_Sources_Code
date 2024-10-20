package X;

/* renamed from: X.Gdq, reason: case insensitive filesystem */
/* loaded from: Gdq.class */
public final class C2449Gdq extends HFT {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public static final Hy3 A04 = new Hy3(HC7.A12, "com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation.SegmentationDataProviderModule");
    public static final Hy3 A03 = new Hy3(HC7.A0Z, "com.facebook.cameracore.mediapipeline.dataproviders.hairsegmentation.implementation.HairSegmentationDataProviderModule");

    public C2449Gdq(String str, String str2, boolean z) {
        1BL.A1F(str, str2);
        if (str.length() == 0) {
            throw AnonymousClass001.A0L(0Pz.A0m("Invalid segmentation config, ", "initNetPath", str, '='));
        }
        if (str2.length() == 0) {
            throw AnonymousClass001.A0L(0Pz.A0m("Invalid segmentation config, ", "predictNetPath", str2, '='));
        }
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }
}
