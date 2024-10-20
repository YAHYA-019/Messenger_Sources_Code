package X;

import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.presence.note.music.musicpicker.model.MusicData;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import kotlin.jvm.functions.Function2;

/* loaded from: J5z.class */
public final class J5z implements C00l, Function2 {
    public final int A00;
    public final Object A01;

    public J5z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            HDZ hdz = (HDZ) obj;
            View view = (View) obj2;
            boolean A1W = 1BL.A1W(hdz, view);
            HrG hrG = ((I3z) this.A01).A01;
            if (hrG != null) {
                hrG.A00(view, hdz, A1W);
            }
        } else {
            MusicData musicData = (MusicData) obj;
            IQ1 iq1 = ((IDk) this.A01).A00;
            CallerContext callerContext = IQ1.A1m;
            IFl iFl = iq1.A1C;
            long longValue = ((Number) obj2).longValue();
            iFl.A0O = musicData;
            HRc hRc = iFl.A0i;
            11T.A0F(musicData, 0);
            HaO haO = hRc.A00;
            int i = (int) longValue;
            haO.A00 = musicData;
            haO.A01.A0x(new C2676Gks(PlayerOrigin.A0O, C9mK.A00(Integer.valueOf(i), String.valueOf(musicData.A01), musicData.A07), null, true));
            C12 c12 = iFl.A0A;
            if (c12 != null) {
                c12.A00.A1Q.C86(musicData);
            }
        }
        return 04S.A00;
    }
}
