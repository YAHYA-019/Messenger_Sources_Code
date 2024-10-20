package X;

import com.facebook.video.player.RichVideoPlayer;

/* loaded from: Iz2.class */
public final /* synthetic */ class Iz2 implements Runnable {
    public static final String __redex_internal_original_name = "RichVideoPlayer$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ RichVideoPlayer A01;

    public /* synthetic */ Iz2(RichVideoPlayer richVideoPlayer, int i) {
        this.A01 = richVideoPlayer;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RichVideoPlayer richVideoPlayer = this.A01;
        int i = this.A00;
        int A0D = richVideoPlayer.A0D();
        Boolean bool = richVideoPlayer.A0s;
        Boolean A0K = AnonymousClass001.A0K();
        if (bool == null) {
            6TU.A00().A02(new 0BR(0BR.A01("RichVideoPlayer", "isMinStreamVolume is null")), richVideoPlayer.BJQ());
            bool = A0K;
        }
        if (i == 24) {
            richVideoPlayer.A0I.A06(new H2P(A0D));
            if (A0D <= 0 || !bool.booleanValue()) {
                return;
            }
            richVideoPlayer.A0s = 1BK.A0d();
            6TI r0 = richVideoPlayer.A0F;
            if (r0 != null && r0.A03 != null) {
                5Kt r02 = (5Kt) richVideoPlayer.A0g.get();
                C03353xs c03353xs = richVideoPlayer.A0F.A03.A0Y;
                6TN r03 = richVideoPlayer.A0A;
                String str = C52j.A2Z.value;
                int Afn = richVideoPlayer.Afn();
                r02.A0f(r03, richVideoPlayer.A0r, richVideoPlayer.A0F.A03, c03353xs, str, richVideoPlayer.A0F.A03.A0k, Afn, A0D);
                return;
            }
        } else {
            if (i != 25 && i != 164) {
                return;
            }
            richVideoPlayer.A0I.A06(new H2P(A0D));
            if (A0D != 0 || bool.booleanValue()) {
                return;
            }
            richVideoPlayer.A0s = A0K;
            6TI r04 = richVideoPlayer.A0F;
            if (r04 != null && r04.A03 != null) {
                5Kt r05 = (5Kt) richVideoPlayer.A0g.get();
                C03353xs c03353xs2 = richVideoPlayer.A0F.A03.A0Y;
                6TN r06 = richVideoPlayer.A0A;
                String str2 = C52j.A2Z.value;
                int Afn2 = richVideoPlayer.Afn();
                r05.A0e(r06, richVideoPlayer.A0r, richVideoPlayer.A0F.A03, c03353xs2, str2, richVideoPlayer.A0F.A03.A0k, Afn2, 0);
                return;
            }
        }
        6TU.A00().A02(new 0BR(0BR.A01("RichVideoPlayer", "videoPlayerParams is null")), richVideoPlayer.BJQ());
    }
}
