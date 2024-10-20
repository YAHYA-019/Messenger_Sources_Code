package X;

import com.facebook.video.engine.api.VideoPlayerParams;

/* renamed from: X.8k7, reason: invalid class name */
/* loaded from: 8k7.class */
public final class C8k7 extends C1rj {
    public VideoPlayerParams A00;

    public C8k7() {
        super("VideoDurationPluginComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String A0C = r302.A0C();
        9bA r0 = new 9bA(this.A00, A0C);
        String str = (String) r302.A0B(r0, A0C, 0);
        if (str == null) {
            VideoPlayerParams videoPlayerParams = this.A00;
            11T.A0F(videoPlayerParams, 0);
            1Br A00 = 1Bq.A00(66777);
            int i = videoPlayerParams.A0M;
            str = i > 0 ? ((C81c) A00.get()).A00(i) : "";
            r302.A0I(r0, str, A0C, 0);
        }
        3yF A0v = 7zM.A0v(r302, str, 0);
        A0v.A2x(-1);
        A0v.A2r(13.0f);
        A0v.A24(C26z.RIGHT, 8.0f);
        A0v.A18(8.0f);
        return A0v.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
