package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.cowatch.gen.CowatchAdminMessageModel;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Hzd.class */
public final class Hzd {
    public DMV A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;

    public Hzd(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 82222);
        this.A04 = 1Bu.A03(r0, 984);
        this.A05 = 1Bu.A03(r0, 147553);
        this.A06 = 1Bu.A03(r0, 85233);
        this.A02 = GOo.A0N(r0);
    }

    public static final void A00(Context context, FbUserSession fbUserSession, RFI rfi, Hzd hzd, String str) {
        String str2;
        GP5.A02(GOp.A0K(hzd.A02), "amd_video_selected_while_ringing", rfi.A00, null, str, null);
        ((I46) 1Lm.A05(context, fbUserSession, 115517)).A00(str, "pre_call", null);
        ImmutableList Aar = ((2QV) 1Lm.A05(context, fbUserSession, 115278)).Aar();
        String string = (Aar.size() != 1 || Aar.get(0) == null || (str2 = ((I9O) Aar.get(0)).A08) == null || str2.length() == 0) ? context.getResources().getString(2131955196) : 4YU.A0u(context.getResources(), ((I9O) Aar.get(0)).A08, 2131955195);
        11T.A0D(string);
        I4A i4a = (I4A) 1Lm.A05(context, fbUserSession, 99476);
        CowatchAdminMessageModel cowatchAdminMessageModel = new CowatchAdminMessageModel(string, 0, "");
        Iterator it = i4a.A0K.iterator();
        while (it.hasNext()) {
            ((HFa) it.next()).A00(cowatchAdminMessageModel, true);
        }
    }
}
