package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: Hu4.class */
public final class Hu4 {
    public int A00;
    public int A01;
    public String A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1De A07;
    public final java.util.Map A08;
    public final java.util.Map A09;

    public Hu4(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A04 = 1BK.A0D();
        this.A05 = GOn.A0Q();
        1BY r0 = r303.A00;
        this.A06 = 1Lm.A03(fbUserSession, r0, 115395);
        this.A03 = 1Bu.A03(r0, 115394);
        this.A08 = AnonymousClass001.A0u();
        this.A09 = AnonymousClass001.A0u();
        int i = (-1) << (-1);
        this.A01 = i;
        this.A00 = i;
    }

    public final void A00(C2614Gj3 c2614Gj3, String str) {
        String str2;
        String str3;
        Long l;
        boolean z;
        boolean z2;
        if (str == null || str.length() == 0) {
            return;
        }
        if (c2614Gj3 != null) {
            this.A09.put(str, c2614Gj3);
        }
        C00i c00i = this.A03.A00;
        String A03 = ((I5Y) c00i.get()).A03();
        int i = this.A01;
        int i2 = (-1) << (-1);
        if (i != i2 && i == 0 && A03 == null) {
            return;
        }
        java.util.Map map = this.A08;
        HhJ hhJ = (HhJ) map.get(str);
        if (hhJ == null) {
            1UG A08 = 1BK.A08(1Br.A02(this.A04), 1BJ.A00(1507));
            if (A08.isSampled()) {
                C2614Gj3 c2614Gj32 = (C2614Gj3) this.A09.get(str);
                if (c2614Gj32 != null) {
                    str2 = c2614Gj32.A03;
                    z = c2614Gj32.A04;
                    z2 = c2614Gj32.A05;
                    l = (Long) c2614Gj32.A01;
                    str3 = c2614Gj32.A02;
                } else {
                    str2 = null;
                    str3 = null;
                    l = null;
                    z = false;
                    z2 = false;
                }
                A08.A7R(TraceFieldType.VideoId, str);
                A08.A7R("cowatch_session_id", A03);
                A08.A7R("cowatch_ranking_session_id", ((HsZ) 1Br.A0B(this.A06)).A01);
                if (str2 == null) {
                    str2 = null;
                } else if (z2) {
                    str2 = 0Pz.A0W(str2, ":secondary");
                }
                A08.A7R("tab_name", str2);
                A08.A5H("is_from_search", Boolean.valueOf(z));
                A08.A7R("ls_local_call_id", AbstractC2326GOr.A0H(A08, c00i, "rtc_group_call_id", ((I5Y) c00i.get()).A05()).A04());
                int i3 = this.A01;
                if (i3 != i2) {
                    4YU.A1I(A08, "play_trigger", i3);
                } else {
                    A08.A7R("play_trigger", (String) null);
                }
                A08.A7h("cowatch_userids", AbstractC2326GOr.A0H(A08, c00i, "call_type", AbstractC2326GOr.A0H(A08, c00i, TraceFieldType.RequestID, this.A02).A02()).A01());
                if (str3 != null && z) {
                    str3 = "search_results";
                }
                A08.A7R("section_id", str3);
                A08.A6H("section_index", l);
                A08.BZL();
            }
            this.A09.remove(str);
            hhJ = new HhJ((C0dr) 1Br.A0B(this.A05), str);
        }
        hhJ.A01 = hhJ.A03.now();
        map.put(str, hhJ);
        this.A01 = i2;
        this.A02 = null;
    }

    public final void A01(6UR r302, String str) {
        HhJ hhJ;
        if (r302 != null) {
            switch (r302.ordinal()) {
                case 3:
                case 4:
                    r302 = 6UR.A07;
                    break;
                case 6:
                case 7:
                    r302 = 6UR.A05;
                    break;
            }
            if (str != null || r302 == null || (hhJ = (HhJ) this.A08.get(str)) == null) {
                return;
            }
            if (r302 != hhJ.A02) {
                hhJ.A02 = r302;
                int ordinal = r302.ordinal();
                if (ordinal == 4) {
                    hhJ.A01 = hhJ.A03.now();
                    return;
                } else {
                    if (ordinal == 9 || ordinal == 1 || ordinal == 7) {
                        hhJ.A00 += hhJ.A03.now() - hhJ.A01;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        r302 = null;
        if (str != null) {
        }
    }

    public final void A02(String str) {
        java.util.Map map = this.A08;
        HhJ hhJ = (HhJ) map.get(str);
        if (hhJ != null) {
            1UG A08 = 1BK.A08(1Br.A02(this.A04), 1BJ.A00(1505));
            if (A08.isSampled()) {
                if (hhJ.A02 == 6UR.A07) {
                    hhJ.A00 += hhJ.A03.now() - hhJ.A01;
                }
                A08.A7R(TraceFieldType.VideoId, hhJ.A04);
                A08.A5Z("video_duration_played_ms", Double.valueOf(hhJ.A00));
                C00i c00i = this.A03.A00;
                A08.A7R("ls_local_call_id", AbstractC2326GOr.A0H(A08, c00i, "rtc_group_call_id", AbstractC2326GOr.A0H(A08, c00i, "cowatch_session_id", ((I5Y) c00i.get()).A03()).A05()).A04());
                int i = this.A00;
                if (i != ((-1) << (-1))) {
                    4YU.A1I(A08, "end_trigger", i);
                } else {
                    A08.A7R("end_trigger", (String) null);
                }
                A08.A7h("cowatch_userids", ((I5Y) c00i.get()).A01());
                A08.BZL();
            }
            map.remove(str);
            this.A00 = (-1) << (-1);
        }
    }
}
