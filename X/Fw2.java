package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: Fw2.class */
public final class Fw2 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public Fw2(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                F6H.A00((F6H) this.A01, this.A03, th);
                return;
            case 2:
                11T.A0F(th, 0);
                0fH.A0v("MessengerConsentBloksActionLauncher", "Failure in prefetching consent bloks payload", th);
                return;
            default:
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        2JY A0B;
        2JY A0B2;
        2JX A0M;
        Object obj2;
        switch (this.A00) {
            case 0:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                11T.A0F(abstractC08294mh, 0);
                F6H f6h = (F6H) this.A01;
                2JY r0 = (2JY) abstractC08294mh.A03;
                if (r0 != null && (A0B = 1BK.A0B(r0, 2JX.class, -1010122401, -1277819920)) != null && (A0B2 = 1BK.A0B(A0B, 2JX.class, -1306084975, -409886274)) != null && (A0M = 1BL.A0M(A0B2, -837826370, 340043451)) != null) {
                    I0h A00 = HHD.A00(A0M, (I04) 1Br.A0B(f6h.A02), HCR.A07, "", "", "");
                    if (A00 != null) {
                        EffectItem effectItem = new EffectItem(A00);
                        String str = this.A03;
                        Iterator it = f6h.A05.iterator();
                        while (it.hasNext()) {
                            FIc fIc = ((Ecf) it.next()).A00;
                            fIc.A08.put(Long.valueOf(effectItem.A03()), effectItem);
                            JSONObject A12 = AnonymousClass001.A12();
                            FbUserSession A03 = 1Br.A03(fIc.A07);
                            ((Huh) 4YU.A0n(A03, fIc.A02, 115496)).A00(HAu.A01, new Fjf(A03, fIc, A12, str, 0), effectItem, null);
                        }
                        return;
                    }
                }
                F6H.A00(f6h, this.A03, new Exception("Effect response was not returned"));
                return;
            case 1:
                BcE bcE = (BcE) ((C4V) this.A01).A01.get();
                String str2 = this.A03;
                String str3 = this.A02;
                1UG A08 = 1BK.A08(1Br.A02(bcE.A00), 1BJ.A00(1124));
                if (A08.isSampled()) {
                    A08.A0C("ad_id");
                    4YU.A1H(A08, Long.parseLong(str2));
                    A08.A7R("client_token", (String) null);
                    A08.A7R("ig_token", str3);
                    A08.A7R("session_id", (String) null);
                    A08.A5c(BNv.A01, AbE.A00(645));
                    A08.BZL();
                    return;
                }
                return;
            case 2:
                EoK eoK = (EoK) obj;
                if (eoK != null) {
                    ((F6M) this.A01).A03.put(this.A02, new 8Ls(eoK, this.A03));
                    return;
                }
                return;
            default:
                AbstractC08294mh abstractC08294mh2 = (AbstractC08294mh) obj;
                if (abstractC08294mh2 == null || (obj2 = abstractC08294mh2.A03) == null) {
                    return;
                }
                2JY r02 = (2JY) obj2;
                if (r02.A0L(974327812, DjI.class, -1993266963) != null) {
                    2JY A0B3 = 1BK.A0B(r02, DjI.class, 974327812, -1993266963);
                    if (TextUtils.isEmpty(A0B3.A0r(1008899913))) {
                        return;
                    }
                    Bundle A05 = 1BK.A05();
                    A05.putString("genericActionMessageString", A0B3.A0r(1008899913));
                    A05.putString("genericActionCtaString", A0B3.A0r(1879075104));
                    A05.putString("genericActionType", this.A03);
                    A05.putString("app_id", this.A02);
                    ((QuicksilverWebviewService) this.A01).A0B(A05, EOz.A0O);
                    return;
                }
                return;
        }
    }
}
