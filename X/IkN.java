package X;

import android.net.Uri;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: IkN.class */
public final class IkN implements JM1 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final HkU A03;
    public final 4xJ A04;
    public final JM0 A05;
    public final JH7 A06;
    public final String A07;

    public IkN(HkU hkU, 4xJ r303, JH7 jh7, JM0 jm0, String str) {
        C3o5.A0k(r303, 3, str);
        this.A03 = hkU;
        this.A05 = jm0;
        this.A04 = r303;
        this.A06 = jh7;
        this.A07 = str;
    }

    private final void A00(JJK jjk, String str, java.util.Map map) {
        HashMap A0u = AnonymousClass001.A0u();
        HkU hkU = this.A03;
        A0u.putAll(hkU.A0D);
        A0u.putAll(RiE.A01(this.A06, (QqC) null, this.A07));
        if (map != null) {
            try {
                A0u.putAll(map);
            } catch (RuntimeException | URISyntaxException e) {
                java.util.Map emptyMap = Collections.emptyMap();
                11T.A0A(emptyMap);
                jjk.Bxr(e, emptyMap, 0, false);
                return;
            }
        }
        4xJ r0 = this.A04;
        H9V h9v = H9V.A03;
        String str2 = hkU.A0A;
        if (str2 == null || str2.length() == 0) {
            str2 = 0Pz.A0W("rupload.", "facebook.com");
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").encodedAuthority(str2).appendPath(hkU.A03.uriPathElement).appendPath(GOo.A0u()).appendQueryParameter("segmented", "true").appendQueryParameter("phase", str);
        String str3 = hkU.A0B;
        if (str3 != null && str3.length() != 0) {
            builder.appendQueryParameter("target", str3);
        }
        r0.A00(new C2535Ggj(jjk), h9v, (C7p4) null, AbstractC2327GOs.A0Y(builder), A0u);
    }

    @Override // X.JM1
    public JM0 B7I() {
        return this.A05;
    }

    @Override // X.JM1
    public void CkU(QxZ qxZ, JJK jjk) {
        if (this.A00) {
            java.util.Map emptyMap = Collections.emptyMap();
            11T.A0A(emptyMap);
            jjk.Bq8("", 0, emptyMap);
        } else {
            try {
                A00(jjk, "cancel", this.A05.AbW(qxZ));
            } catch (JSONException e) {
                java.util.Map emptyMap2 = Collections.emptyMap();
                11T.A0A(emptyMap2);
                jjk.Bxr(e, emptyMap2, 0, false);
            }
        }
    }

    @Override // X.JM1
    public void Ckb(QxZ qxZ, JJK jjk) {
        if (this.A01) {
            java.util.Map emptyMap = Collections.emptyMap();
            11T.A0A(emptyMap);
            jjk.Bq8("", 0, emptyMap);
        } else {
            try {
                A00(jjk, "end", this.A05.Ajt(qxZ));
            } catch (JSONException e) {
                java.util.Map emptyMap2 = Collections.emptyMap();
                11T.A0A(emptyMap2);
                jjk.Bxr(e, emptyMap2, 0, false);
            }
        }
    }

    @Override // X.JM1
    public void Cl7(ICS ics, QxZ qxZ, JJK jjk, Rb8 rb8) {
        int i;
        java.util.Map emptyMap;
        if (ics != null) {
            i = ics.A00;
            emptyMap = ics.A0A;
        } else {
            i = 0;
            emptyMap = Collections.emptyMap();
            11T.A0A(emptyMap);
        }
        jjk.Bq8("", i, emptyMap);
    }

    @Override // X.JM1
    public void ClC(Hqj hqj, JJK jjk) {
        if (!this.A02) {
            A00(jjk, "start", this.A05.BC1(hqj));
            return;
        }
        java.util.Map emptyMap = Collections.emptyMap();
        11T.A0A(emptyMap);
        jjk.Bq8("", 0, emptyMap);
    }
}
