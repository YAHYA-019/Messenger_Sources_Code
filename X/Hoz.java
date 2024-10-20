package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: Hoz.class */
public final class Hoz {
    public JLN A00;
    public final C00i A01;
    public final 1Br A02;
    public final 1De A03;

    public Hoz(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        1BY r0 = r303.A00;
        this.A02 = 1Bu.A03(r0, 115399);
        this.A01 = 1Lm.A03(fbUserSession, r0, 115396);
    }

    public final void A00(JLN jln, String str) {
        String str2;
        JLN jln2 = this.A00;
        if (jln2 != null) {
            Hje hje = (Hje) 1Br.A0B(this.A02);
            1UG A08 = 1BK.A08(1Br.A02(hje.A07), "mn_rtc_cowatch_classic_video_duration");
            if (A08.isSampled() && hje.A00 != 0 && (str2 = hje.A04) != null && str2.length() != 0) {
                double A09 = ((float) (1BL.A09(hje.A06) - hje.A00)) / 1000.0f;
                C00i c00i = hje.A05;
                A08.A7R("living_room_id", ((I5Y) c00i.get()).A03());
                Double valueOf = Double.valueOf(A09);
                A08.A5Z("video_duration", valueOf);
                A08.A7R(TraceFieldType.VideoId, hje.A04);
                A08.A7R("server_info", ((I5Y) c00i.get()).A05());
                A08.A7R("content_source", hje.A02);
                A08.A7R(TraceFieldType.ContentType, hje.A03);
                A08.A7R("amd_source", hje.A01);
                4zI.A03.A05("CoWatchVideoDurationLogger", "Video Ended. ID:%s Type:%s Source:%s AmdSource:%s Duration:%f", new Object[]{hje.A04, hje.A03, hje.A02, hje.A01, valueOf});
                I5Y.A00(A08, c00i);
                hje.A04 = null;
                hje.A03 = null;
                hje.A02 = null;
                hje.A00 = 0L;
                hje.A01 = null;
            }
            ((Hu4) this.A01.get()).A02(jln2.AeG());
        }
        if (jln != null && jln.AeG() != null) {
            String str3 = jln.BXH() ? "video" : jln.BTL() ? "image" : null;
            Hje hje2 = (Hje) 1Br.A0B(this.A02);
            String AeG = jln.AeG();
            int intValue = jln.AeJ().intValue();
            String str4 = intValue != 1 ? intValue != 2 ? intValue != 3 ? "unknown" : "messaging" : "fb" : "ig";
            4zI.A03.A05("CoWatchVideoDurationLogger", "Video started. ID:%s Type:%s Source:%s AmdSource:%s", new Object[]{AeG, str3, str4, str});
            hje2.A04 = AeG;
            hje2.A03 = str3;
            hje2.A02 = str4;
            hje2.A00 = 1BL.A09(hje2.A06);
            hje2.A01 = str;
            ((Hu4) this.A01.get()).A00(null, jln.AeG());
        }
        this.A00 = jln;
    }
}
