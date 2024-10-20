package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;
import org.json.JSONObject;

/* loaded from: Fjf.class */
public final class Fjf implements JIU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Fjf(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A04 = str;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void Bvc(String str) {
        if (this.A00 == 0) {
            11T.A0F(str, 0);
            FIc fIc = (FIc) this.A03;
            C6J A02 = DKG.A0Z(fIc.A04).A02(BOk.A02, (FbUserSession) this.A02);
            A02.A05 = new Exception(str);
            A02.A00();
            FIc.A02(fIc, this.A04, "Effect download failed", "ROOM_AR_EFFECT_NOT_FOUND");
        }
    }

    public void Bve(EffectItem effectItem, I4D i4d) {
        if (this.A00 == 0) {
            FIc.A04((FIc) this.A03, this.A04, (JSONObject) this.A01);
            return;
        }
        DKE.A0K(((Hze) this.A03).A05).post(new J1w((Hfy) this.A02, (EffectItem) this.A01, i4d, this.A04));
    }
}
