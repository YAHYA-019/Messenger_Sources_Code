package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceDelegateWrapper;

/* renamed from: X.Gdo, reason: case insensitive filesystem */
/* loaded from: Gdo.class */
public final class C2447Gdo extends HFT {
    public static final Hy3 A02 = new Hy3(HC7.A0v);
    public final IPF A00;
    public final UIControlServiceDelegateWrapper A01;

    public C2447Gdo(JKu jKu, JI2 ji2, JKv jKv, JES jes, String str) {
        IPF ipf = new IPF(jKu, ji2, jKv, jes, str);
        this.A00 = ipf;
        this.A01 = new UIControlServiceDelegateWrapper(str, ipf);
    }
}
