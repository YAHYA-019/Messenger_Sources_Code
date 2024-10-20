package X;

import android.view.View;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderSurface;
import kotlin.jvm.functions.Function1;

/* loaded from: Hsz.class */
public final class Hsz {
    public HVm A00;
    public Integer A01;
    public String A02;
    public GU4 A03;
    public boolean A04;
    public final View.OnLayoutChangeListener A05;
    public final C0dr A06;
    public final C87p A07;
    public final VideoRenderApi A08;
    public final C01i A09;
    public final Function1 A0A;
    public volatile long A0B;
    public volatile 03Y A0C;
    public volatile C00m A0D;

    public Hsz(C87p c87p, VideoRenderApi videoRenderApi, Integer num, Function1 function1) {
        11T.A0F(function1, 5);
        this.A08 = videoRenderApi;
        this.A07 = c87p;
        this.A0A = function1;
        this.A01 = num;
        this.A09 = J9p.A00(this, 1);
        this.A05 = new IKN(this, 9);
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        11T.A0A(awakeTimeSinceBootClock);
        this.A06 = awakeTimeSinceBootClock;
    }

    public final GU4 A00() {
        GU4 gu4 = this.A03;
        if (gu4 != null) {
            return gu4;
        }
        11T.A0L("surfaceViewRenderer");
        throw 0Q8.createAndThrow();
    }

    public void A01() {
        if (this.A04) {
            A00().removeOnLayoutChangeListener(this.A05);
            A00().A03();
            synchronized (HO2.class) {
                int i = HO2.A00;
                if (i == 0) {
                    throw AnonymousClass001.A0N("EglBase released before init");
                }
                int i2 = i - 1;
                HO2.A00 = i2;
                if (i2 == 0) {
                    JOR jor = HO2.A01;
                    if (jor != null) {
                        jor.release();
                    }
                    HO2.A01 = null;
                }
            }
            VideoRenderSurface videoRenderSurface = (VideoRenderSurface) this.A09.getValue();
            String str = this.A02;
            if (str == null) {
                throw 1BK.A0h();
            }
            videoRenderSurface.removeRenderItem(str, new StreamInfo(1, null));
            this.A04 = false;
        }
    }
}
