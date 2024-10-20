package X;

import org.webrtc.legacy.SurfaceTextureHelper;

/* loaded from: J94.class */
public final class J94 extends C00q implements C00m {
    public static final J94 A00 = new J94();

    public J94() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        SurfaceTextureHelper create = SurfaceTextureHelper.create("ScreenShareController", null);
        11T.A0A(create);
        return create;
    }
}
