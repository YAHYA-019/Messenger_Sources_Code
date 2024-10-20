package X;

import android.R;
import android.content.Context;
import com.facebook.acra.constants.ActionId;
import java.util.Collections;

/* loaded from: Hsl.class */
public final class Hsl {
    public 1BY A00;
    public final I77 A04 = (I77) 1Bi.A03(116175);
    public final C00i A03 = 1BV.A01((1BY) null, 116149);
    public final Context A01 = AbI.A03((1BY) null);
    public final C1is A07 = (C1is) 1Bi.A03(16766);
    public final 2Kv A08 = (2Kv) 1Bi.A03(16973);
    public final 9XD A05 = (9XD) 1Bn.A0E((Context) null, (1BY) null, 68630);
    public final C00i A02 = 1BQ.A02(66266);
    public final C5ic A06 = (C5ic) 1Bn.A0B(67527);

    public Hsl(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(JIR jir) {
        C5ic c5ic = this.A06;
        Context context = this.A01;
        C2121Dea A03 = c5ic.A03(context);
        A03.A06(2131967907);
        A03.A0A(context.getString(2131963418));
        A03.A0E(new IGR(this, jir, 6), 2131956274);
        A03.A0D(IGS.A00(this, 8), R.string.cancel);
        A03.A04();
        this.A07.A0I("messenger_video_too_big_dialog", Collections.singletonMap("fromModule", "swipeable_media_tray_popup"), true);
        2Kv r0 = this.A08;
        r0.A08("fromModule", "swipeable_media_tray_popup");
        r0.A06((Object) null, "messenger_video_too_big_dialog", 1BJ.A00(ActionId.DATA_LOAD_START));
    }

    public void A01(JIR jir, String str) {
        C2121Dea A03 = this.A06.A03(this.A01);
        A03.A06(2131957346);
        A03.A05(2131957328);
        A03.A0J(new IGR(this, jir, 5), R.string.ok);
        A03.A04();
        this.A07.A0I("messenger_generic_video_too_big_dialog", Collections.singletonMap("fromModule", str), true);
        2Kv r0 = this.A08;
        r0.A08("fromModule", str);
        r0.A06((Object) null, "messenger_generic_video_too_big_dialog", 1BJ.A00(ActionId.DATA_LOAD_START));
    }
}
