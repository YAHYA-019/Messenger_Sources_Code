package X;

import java.util.Set;

/* loaded from: Ifm.class */
public final class Ifm implements JOY {
    public final Hnw A00;
    public final boolean A01;
    public final HiV A02;
    public final Set A03 = 7zL.A15();

    public Ifm(HiV hiV, Hnw hnw, boolean z) {
        this.A01 = z;
        this.A00 = hnw;
        this.A02 = hiV;
    }

    public static void A00(C47t c47t, Ifm ifm) {
        c47t.A7Q("call_ui_shown");
        c47t.A7Q("signaling_connected");
        c47t.A7Q("media_connected");
        c47t.A7Q("self_first_frame_rendered");
        c47t.A7Q("remote_first_frame_rendered");
        if (ifm.A01) {
            c47t.A7Q("remote_audio_played");
        }
    }

    public static void A01(C47t c47t, Boolean bool, String str) {
        if (bool != null) {
            c47t.Bci(str, bool.booleanValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.JQN] */
    public JQN BGd(Long l) {
        Hnw hnw = this.A00;
        long longValue = l != null ? l.longValue() : -1;
        1Br.A0C(hnw.A00);
        C47t A01 = 45R.A00().A01(longValue);
        return A01 == null ? new Object() : new Ifo(A01);
    }

    public void BmM() {
        HiV hiV = this.A02;
        hiV.A04 = true;
        hiV.A03 = true;
        hiV.A02 = false;
        hiV.A00 = 0;
        hiV.A01 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x023d, code lost:
    
        if (r0 == 7) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CIT(X.2JS r302, java.lang.Long r303) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ifm.CIT(X.2JS, java.lang.Long):void");
    }

    public JQN D1l(Boolean bool, boolean z, boolean z2) {
        Integer num = z ? 0S2.A0Y : 0S2.A0N;
        Boolean valueOf = Boolean.valueOf(z2);
        String str = 3 - num.intValue() == 0 ? "1p" : "group";
        C7z0 A00 = this.A00.A00(816061304);
        A01(A00, valueOf, "is_video");
        A00.Bch("call_type", str);
        A00.Bci("is_rsys", true);
        A01(A00, bool, "is_multiway");
        A00(A00, this);
        return new Ifo(A00);
    }

    public JQN D1o(Boolean bool, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        C7z0 A00 = this.A00.A00(816066612);
        A01(A00, valueOf, "is_video");
        A00.Bch("call_type", "group_join");
        A00.Bci("is_rsys", true);
        A01(A00, bool, "is_multiway");
        A00(A00, this);
        return new Ifo(A00);
    }

    public JQN D23(Boolean bool, String str, boolean z, boolean z2) {
        Integer num = z ? 0S2.A01 : 0S2.A00;
        Boolean valueOf = Boolean.valueOf(z2);
        int intValue = num.intValue();
        String str2 = intValue == 0 ? "1p" : "group";
        C7z0 A00 = this.A00.A00(816066612);
        A01(A00, valueOf, "is_video");
        A00.Bch("call_type", str2);
        A00.Bci("is_rsys", true);
        A01(A00, bool, "is_multiway");
        A00.A7Q("call_ui_shown");
        if (intValue != 0) {
            A00.A7Q("signaling_connected");
            A00.A7Q("media_connected");
        } else {
            A00.A7Q("signaling_connected");
        }
        if (1BK.A1X(valueOf, true)) {
            A00.A7Q("self_first_frame_rendered");
        }
        return new Ifo(A00);
    }
}
