package X;

import android.view.View;
import android.widget.EditText;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;

/* loaded from: Igi.class */
public final class Igi implements JMq {
    public final /* synthetic */ C2736Gml A00;

    public Igi(C2736Gml c2736Gml) {
        this.A00 = c2736Gml;
    }

    public static final C98O A00(C5es c5es) {
        switch (c5es.ordinal()) {
            case 2:
                return C98O.A0G;
            case 3:
            case 5:
            default:
                return C98O.A0N;
            case 4:
                return C98O.A0I;
            case 6:
                return C98O.A0D;
            case 7:
                return C98O.A0E;
            case 8:
                return C98O.A02;
            case 9:
                return C98O.A0H;
            case 10:
                return C98O.A0J;
        }
    }

    @Override // X.JMq
    public void BZm() {
        C2736Gml c2736Gml = this.A00;
        if (c2736Gml.A0F != null) {
            I1j i1j = (I1j) 4YU.A0p(c2736Gml.A0R);
            ThreadKey threadKey = c2736Gml.A04;
            String str = c2736Gml.A0F;
            11T.A0F(str, 1);
            1UG A08 = 1BK.A08(1Br.A02(i1j.A00), "msg_click_ai_sticker_try_again");
            if (A08.isSampled()) {
                GOn.A1Q(A08, str);
                A08.A5c(C98O.A0K, "send_source");
                AbstractC2327GOs.A0m(A08, threadKey, I1j.A00(i1j, threadKey));
            }
        }
    }

    @Override // X.JMq
    public void BdD() {
        C2736Gml c2736Gml = this.A00;
        if (c2736Gml.A0j()) {
            return;
        }
        C5fi.A01(((H4B) c2736Gml).A03);
    }

    @Override // X.JMq
    public void CNH(Sticker sticker, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        if (r317 != null) goto L8;
     */
    @Override // X.JMq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CNO(com.facebook.stickers.model.Sticker r302, X.C5es r303, java.lang.String r304, int r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Igi.CNO(com.facebook.stickers.model.Sticker, X.5es, java.lang.String, int, boolean):void");
    }

    @Override // X.JMq
    public void CNQ(Sticker sticker, String str, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0117, code lost:
    
        if (r323 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0287, code lost:
    
        if (r311 != false) goto L28;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, X.Gml, X.H4B] */
    @Override // X.JMq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CNW(com.facebook.stickers.model.Sticker r302, X.C5es r303, java.lang.Boolean r304, java.lang.String r305, java.lang.String r306, int r307) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Igi.CNW(com.facebook.stickers.model.Sticker, X.5es, java.lang.Boolean, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, X.Gml] */
    @Override // X.JMq
    public void Cbt() {
        ?? r0 = this.A00;
        View findViewWithTag = r0.A0C.findViewWithTag("generated_tab_id");
        if (findViewWithTag != null) {
            1Kd.A0E(Inf.A00(findViewWithTag, this, 39), ((I5H) r0.A0O.get()).A02(4YV.A0C(r0.getContext())));
        }
    }

    @Override // X.JMq
    public void CcJ(EditText editText, JEs jEs) {
        super/*X.H4B*/.A0d(editText, jEs, new IV2(this));
    }

    @Override // X.JMq
    public void D87(int i) {
        C2736Gml.A0A(this.A00, i);
    }
}
