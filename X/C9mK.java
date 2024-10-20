package X;

import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.note.music.musicpicker.model.MusicData;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;

/* renamed from: X.9mK, reason: invalid class name */
/* loaded from: 9mK.class */
public abstract class C9mK {
    public static final 6TI A00(Integer num, String str, String str2) {
        11T.A0F(str2, 1);
        6A9 r0 = new 6A9();
        r0.A03 = C0A2.A03(str2);
        r0.A04 = 6AB.A05;
        VideoDataSource videoDataSource = new VideoDataSource(r0);
        6TA r02 = new 6TA();
        r02.A0U = videoDataSource;
        r02.A0V = 6Ch.A01;
        r02.A0u = true;
        r02.A03(str);
        r02.A1k = true;
        r02.A1h = false;
        if (num != null) {
            int intValue = num.intValue();
            r02.A09 = intValue;
            r02.A08 = intValue + 30000;
            r02.A0L = 30000;
        }
        6TF r03 = new 6TF();
        r03.A03 = new VideoPlayerParams(r02);
        return r03.A01();
    }

    public static void A01(RichStatus richStatus) {
        A04(PlayerOrigin.A0O, String.valueOf(richStatus.A08));
    }

    public static void A02(MusicData musicData) {
        A04(PlayerOrigin.A0g, String.valueOf(musicData.A01));
    }

    public static final void A03(PlayerOrigin playerOrigin, String str) {
        GRS A04 = 7zQ.A0w().A07(playerOrigin, str).A04();
        if (A04 != null) {
            A04.CXU(C52j.A09);
        }
    }

    public static final void A04(PlayerOrigin playerOrigin, String str) {
        11T.A0F(str, 0);
        GRS A04 = 7zQ.A0w().A07(playerOrigin, str).A04();
        if (A04 != null) {
            A04.CWm(C52j.A1j);
        }
    }
}
