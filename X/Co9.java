package X;

import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;

/* loaded from: Co9.class */
public final class Co9 implements DI6 {
    public final int A00;
    public final Object A01;

    public Co9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x058e, code lost:
    
        if (r306 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0ccb, code lost:
    
        r0 = r306.A0V;
        r0 = X.0QD.A0V(r306.A0W.keySet());
        r0 = X.AlS.A08(r0);
        r0 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0cf3, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0cf6, code lost:
    
        r325.A00(r349, r326, r0.A05(), r0.A0D, r0, r0.A0P, r0, r345, r0, r0, r335);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0b96, code lost:
    
        if (r306 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0cc5, code lost:
    
        if (r306 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x07d3, code lost:
    
        if (r0.A0W.isEmpty() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0f05, code lost:
    
        if ((!com.google.common.base.Platform.stringIsNullOrEmpty(r0.A0L)) != false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x156b, code lost:
    
        if (r0 == null) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x16b1, code lost:
    
        if (r0.equals(r0) != false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02b7, code lost:
    
        if (X.CJI.A01(r0) != false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x09ca A[LOOP:2: B:226:0x09bc->B:228:0x09ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b27  */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.facebook.messaging.omnipicker.namepage.OmnipickerChatNameSetDialogFragment, X.2Ov] */
    @Override // X.DI6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Byk() {
        /*
            Method dump skipped, instructions count: 6178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Co9.Byk():void");
    }

    @Override // X.DI6
    public void C8Y() {
        switch (this.A00) {
            case 0:
                AlS alS = (AlS) this.A01;
                int i = AlS.A0f;
                CZt cZt = alS.A05;
                if (cZt != null) {
                    if (!cZt.A0F()) {
                        AlS.A0B(CSG.A00(alS, 36), alS);
                        return;
                    }
                    if (11T.A0O(alS.mTag, "OmnipickerInviteToChannelFragment_invite")) {
                        AlS.A0M(alS, false);
                        CZt cZt2 = alS.A05;
                        if (cZt2 != null) {
                            cZt2.A09();
                            if (!AlS.A0P(new Cim(alS, 1), alS) || AlS.A0S(alS)) {
                                return;
                            }
                            AlS.A0L(alS, alS.mTag, true);
                            return;
                        }
                    } else {
                        AlS.A0E(alS);
                        AlS.A0D(alS);
                        AlS.A0H(alS);
                        CQ4 cq4 = (CQ4) 1Br.A0B(alS.A0K);
                        CZt cZt3 = alS.A05;
                        if (cZt3 != null) {
                            cq4.A07(cZt3.A0I);
                            if (AlS.A0P(new Cim(alS, 1), alS)) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                }
                11T.A0L("viewDataModel");
                throw 0Q8.createAndThrow();
            case 1:
                ((Fragment) this.A01).requireActivity().onBackPressed();
                return;
            case 5:
                B7A b7a = ((Bfw) this.A01).A00;
                7zR.A12(b7a.A01, (InputMethodManager) b7a.A0D.get());
                b7a.A00.C8W();
                return;
            case 6:
                ((AlD) this.A01).A1X();
                return;
            default:
                ((AbstractC1522Aka) this.A01).A1X();
                return;
        }
    }

    @Override // X.DI6
    public void CQi(boolean z) {
        if (3 - this.A00 == 0) {
            B7D b7d = (B7D) this.A01;
            if (b7d.A13.isEmpty()) {
                b7d.A0S = z;
                b7d.A0Y = Platform.stringIsNullOrEmpty(b7d.A0M);
                b7d.A1Z().A03(B7D.A08(b7d));
                CNd A1Z = b7d.A1Z();
                ImmutableList of = ImmutableList.of();
                11T.A0F(of, 0);
                A1Z.A02(of, (CharSequence) null);
            }
        }
    }
}
