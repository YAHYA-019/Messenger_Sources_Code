package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: I5a.class */
public final class I5a {
    public final FbUserSession A00;
    public final HFW A01;
    public final 1De A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final Set A0A;

    public I5a(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A00 = fbUserSession;
        1BY r0 = r303.A00;
        this.A03 = 1Lm.A03(fbUserSession, r0, 99846);
        this.A08 = 1Bu.A03(r0, 115285);
        this.A07 = 1Bu.A03(r0, 114921);
        this.A04 = 1Bu.A03(r0, 114801);
        this.A05 = 1BK.A0E();
        this.A06 = 1Bu.A03(r0, 83156);
        this.A09 = 1Bu.A03(r0, 115738);
        this.A0A = GOn.A1J();
        this.A01 = new GgM(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A00(Context context, I3c i3c, C00m c00m, C00m c00m2) {
        JI8 ji8;
        EffectItem effectItem;
        if (!(context instanceof JI8) || (ji8 = (JI8) context) == null || (effectItem = i3c.A00) == null || !effectItem.A10 || !ji8.CyZ()) {
            return false;
        }
        ji8.Czx(QqA.A04, new IpJ(c00m), new IpJ(c00m2));
        return true;
    }

    public final void A01(Context context, I3c i3c) {
        if (A00(context, i3c, new JR6(this, i3c, 30), J93.A00)) {
            return;
        }
        EffectItem effectItem = i3c.A00;
        if (effectItem != null && effectItem.A08() && (A04(i3c) || A05(new JR6(this, i3c, 31)))) {
            return;
        }
        A02(i3c);
    }

    public final void A02(I3c i3c) {
        11T.A0F(i3c, 0);
        EffectItem effectItem = i3c.A00;
        HCR hcr = null;
        if ((effectItem != null ? ((BaseItem) effectItem).A04 : null) != HCR.A02) {
            if (effectItem != null) {
                hcr = ((BaseItem) effectItem).A04;
            }
            if (hcr != HCR.A04) {
                JNe A00 = I2h.A00(this.A03);
                if (A00 != null) {
                    A00.CoK(i3c);
                    return;
                }
                return;
            }
        }
        ((IEo) 4YU.A0n(this.A00, this.A02, 100046)).A09(effectItem, (Boolean) null, true);
    }

    public final void A03(JSONObject jSONObject) {
        JNe A00 = I2h.A00(this.A03);
        if (A00 != null) {
            A00.Cl2(jSONObject);
        }
    }

    public final boolean A04(I3c i3c) {
        Activity A09;
        boolean z = false;
        C00i c00i = this.A08.A00;
        if (!2yD.A03(I8A.A01(c00i), 36315876928595496L) && !((I8A) c00i.get()).A02(this.A00, i3c.A03) && (A09 = ((1Od) 1Bi.A03(16616)).A09()) != null) {
            HdO hdO = (HdO) 1Br.A0B(this.A04);
            1Br.A0C(hdO.A00);
            DR6 A0K = AbL.A0K(A09, hdO.A01);
            A0K.A00(2131956297);
            A0K.A06(2131956295);
            A0K.A0C((DialogInterface.OnClickListener) null, 2131956296);
            A0K.A05();
            z = true;
        }
        return z;
    }

    public final boolean A05(C00m c00m) {
        Activity A09;
        if (1Br.A09(this.A05).AZn(51K.A0E, false) || (A09 = ((1Od) 1Bi.A03(16616)).A09()) == null) {
            return false;
        }
        Hzk hzk = (Hzk) 1Br.A0B(this.A07);
        Ivk ivk = new Ivk(this, c00m);
        JZj jZj = hzk.A00;
        if (jZj == null) {
            1Br.A0C(hzk.A03);
            DR6 A0K = AbL.A0K(A09, hzk.A04);
            A0K.A00(2131961908);
            A0K.A06(2131961907);
            A0K.A0D(new IGR(ivk, hzk, 0), 2131961906);
            A0K.A0B(IGN.A00, 2131961905);
            A0K.A0H(new IGZ(hzk, 0));
            jZj = A0K.A04();
            hzk.A00 = jZj;
        }
        if (jZj != null) {
            jZj.show();
        }
        Hzk.A00(hzk).A02(hzk.A05);
        return true;
    }
}
