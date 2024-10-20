package X;

import android.view.View;
import com.facebook.video.player.RichVideoPlayer;
import java.util.ArrayList;

/* loaded from: Iz3.class */
public final class Iz3 implements Runnable {
    public static final String __redex_internal_original_name = "RichVideoPlayer$8";
    public final /* synthetic */ View A00;
    public final /* synthetic */ RichVideoPlayer A01;

    public Iz3(View view, RichVideoPlayer richVideoPlayer) {
        this.A01 = richVideoPlayer;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr;
        String str;
        if (this.A01.A0S()) {
            ArrayList A0s = AnonymousClass001.A0s();
            if (I6G.A02(this.A00.getContext(), A0s)) {
                objArr = new Object[0];
                str = "RVP window successfully set as secure for DRM video";
            } else {
                objArr = new Object[]{I6G.A00(A0s)};
                str = "Failed to set secure RVP window for DRM video : %s";
            }
            C51f.A01("RichVideoPlayer", str, objArr);
        }
    }
}
