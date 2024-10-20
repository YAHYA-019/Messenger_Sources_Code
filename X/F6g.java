package X;

import android.content.Context;
import com.facebook.resources.ui.FbTextView;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: F6g.class */
public final class F6g {
    public final Context A00;
    public final 1Br A01;
    public final FbTextView A02;
    public final VideoPlayerParams A03;
    public final 5Kt A04;
    public final 6U2 A05;
    public final EmJ A06;
    public final C6ce A07;
    public final F82 A08;
    public final HYA A09;

    public F6g(Context context, FbTextView fbTextView, VideoPlayerParams videoPlayerParams, 6U2 r305, EmJ emJ, C6ce c6ce) {
        7zT.A1W(context, c6ce, fbTextView, videoPlayerParams);
        11T.A0F(r305, 6);
        this.A00 = context;
        this.A07 = c6ce;
        this.A02 = fbTextView;
        this.A03 = videoPlayerParams;
        this.A06 = emJ;
        this.A05 = r305;
        this.A04 = (5Kt) 1Bi.A03(49694);
        this.A09 = (HYA) 1Bn.A0A(115837);
        this.A08 = (F82) 1Bi.A03(82348);
        this.A01 = 1BK.A0C();
    }

    public static final String A00(F6g f6g, String str) {
        if (0CU.A0O(str)) {
            str = 4YU.A0t(f6g.A00.getResources(), 2131967887);
        } else {
            if (0CV.A0b(str, "✓ ", false)) {
                str = DKC.A19(str, "✓ ".length());
            }
            if (!11T.A0O(str, 4YU.A0t(f6g.A00.getResources(), 2131967887))) {
                int A04 = 0CU.A04(str, "(", 0, false);
                if (A04 >= 0) {
                    11T.A0F(str, 0);
                    str = 7zM.A1C(A04 + 1, 0CU.A03(str, ")", str.length() - 1), str);
                }
                if (!0CV.A0Z(str, K92.__redex_internal_original_name, false)) {
                    return 0Pz.A0J(str, 'p');
                }
            }
        }
        return str;
    }
}
