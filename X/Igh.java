package X;

import android.widget.EditText;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;
import java.util.ArrayList;

/* loaded from: Igh.class */
public final class Igh implements JMq {
    public final /* synthetic */ H4x A00;

    public Igh(H4x h4x) {
        this.A00 = h4x;
    }

    @Override // X.JMq
    public void BZm() {
    }

    @Override // X.JMq
    public void BdD() {
        JMq jMq = this.A00.A05;
        if (jMq != null) {
            jMq.BdD();
        }
    }

    @Override // X.JMq
    public void CNH(Sticker sticker, int i) {
        H4x h4x = this.A00;
        JMq jMq = h4x.A05;
        if (jMq != null) {
            jMq.CNH(sticker, i);
            H4x.A04(h4x, sticker, i);
        }
    }

    @Override // X.JMq
    public void CNO(Sticker sticker, C5es c5es, String str, int i, boolean z) {
        H4x h4x = this.A00;
        JMq jMq = h4x.A05;
        if (jMq != null) {
            jMq.CNO(sticker, c5es, str, i, h4x.A0D);
        }
    }

    @Override // X.JMq
    public void CNQ(Sticker sticker, String str, int i) {
        Long A0f;
        H4x h4x = this.A00;
        if (h4x.A05 != null) {
            IA5 ia5 = (IA5) 1Br.A0B(h4x.A0Q);
            ArrayList A0W = h4x.A0b.A0W();
            String str2 = ia5.A00;
            if (str2 != null) {
                HQD hqd = (HQD) 1Br.A0B(ia5.A02);
                String str3 = str == null ? "" : str;
                Integer A01 = IA5.A01(sticker);
                String str4 = sticker.A0D;
                long longValue = (str4 == null || (A0f = 0CW.A0f(str4)) == null) ? 0L : A0f.longValue();
                boolean A02 = IA5.A02(ia5);
                int size = A0W.size();
                1Br.A0C(ia5.A04);
                boolean A012 = 6Bl.A01(sticker);
                11T.A0F(A01, 3);
                1UG A08 = 1BK.A08(1Br.A02(hqd.A00), 1BJ.A00(1029));
                0DA r0 = new 0DA();
                r0.A07("referrer_surface", "message_thread");
                I68.A00(r0, A01, i, longValue);
                GOp.A1M(r0, A02);
                GOq.A1C(r0, size);
                r0.A07("sticker_template_name", (String) null);
                r0.A07("search_query", str3);
                r0.A03("is_instant_avatar_sticker", Boolean.valueOf(A012));
                r0.A07("sticker_id", (String) null);
                AbstractC2327GOs.A0k(r0, A08, str2);
            }
            JMq jMq = h4x.A05;
            if (jMq != null) {
                jMq.CNQ(sticker, str, i);
            }
        }
    }

    @Override // X.JMq
    public void CNW(Sticker sticker, C5es c5es, Boolean bool, String str, String str2, int i) {
        Long A0f;
        11T.A0H(sticker, c5es);
        H4x h4x = this.A00;
        if (h4x.A05 != null) {
            IA5 ia5 = (IA5) 1Br.A0B(h4x.A0Q);
            ArrayList A0W = h4x.A0b.A0W();
            ThreadKey threadKey = h4x.A03;
            long A0r = threadKey != null ? threadKey.A0r() : 0L;
            String str3 = str;
            String str4 = ia5.A00;
            if (str4 != null) {
                HQD hqd = (HQD) 1Br.A0B(ia5.A02);
                if (str == null) {
                    str3 = "";
                }
                Integer A01 = IA5.A01(sticker);
                String str5 = sticker.A0D;
                long longValue = (str5 == null || (A0f = 0CW.A0f(str5)) == null) ? 0L : A0f.longValue();
                boolean A02 = IA5.A02(ia5);
                int A00 = IA5.A00(A0W);
                C00i A0R = AbF.A0R(ia5.A04);
                boolean A022 = 6Bl.A02(sticker);
                A0R.get();
                boolean A012 = 6Bl.A01(sticker);
                Boolean valueOf = Boolean.valueOf(A022);
                11T.A0F(A01, 3);
                1UG A08 = 1BK.A08(1Br.A02(hqd.A00), 1BJ.A00(1031));
                0DA r0 = new 0DA();
                I68.A00(r0, A01, i, longValue);
                AbstractC2327GOs.A0j(r0, A0r);
                GOp.A1M(r0, A02);
                r0.A06("total_avatar_stickers", 1BK.A0l(A00));
                r0.A07("sticker_template_name", (String) null);
                r0.A07("search_query", str3);
                r0.A07("sticker_usage_id_extra", (String) null);
                r0.A03("is_social_sticker", valueOf);
                r0.A03("is_instant_avatar_sticker", Boolean.valueOf(A012));
                r0.A07("sticker_id", (String) null);
                AbstractC2327GOs.A0k(r0, A08, str4);
            }
            JMq jMq = h4x.A05;
            if (jMq != null) {
                jMq.CNW(sticker, c5es, bool, str, str2, i);
            }
        }
    }

    @Override // X.JMq
    public void Cbt() {
    }

    @Override // X.JMq
    public void CcJ(EditText editText, JEs jEs) {
        11T.A0F(editText, 0);
        JMq jMq = this.A00.A05;
        if (jMq != null) {
            jMq.CcJ(editText, jEs);
        }
    }

    @Override // X.JMq
    public void D87(int i) {
        JMq jMq = this.A00.A05;
        if (jMq != null) {
            jMq.D87(i);
        }
    }
}
