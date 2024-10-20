package X;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: L8t.class */
public final class L8t {
    public final WeakReference A00;
    public final C11474wl A01;

    public L8t(C11474wl c11474wl, WeakReference weakReference) {
        this.A01 = c11474wl;
        this.A00 = weakReference;
    }

    public static Ktt A00(L8t l8t, String str) {
        11T.A0F(str, 0);
        return l8t.A03(str, false);
    }

    public static Ktt A01(L8t l8t, String str) {
        11T.A0F(str, 0);
        return l8t.A03(str, false);
    }

    public final Ktt A02() {
        return A00(this, "ACCEPTED_AUTOFILL");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cb, code lost:
    
        if (r314 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0287, code lost:
    
        r0 = r0.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x028e, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0297, code lost:
    
        if (r0.clone() == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x029a, code lost:
    
        r0 = r0.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02a6, code lost:
    
        if (r0 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x02a9, code lost:
    
        r304 = (java.util.TreeSet) r0.clone();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x02b1, code lost:
    
        r0 = X.C4Bn.A00(", ", r304);
        X.11T.A0A(r0);
        r0.put("fields_rendered_in_bottomsheet", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0351, code lost:
    
        r304 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x02cb, code lost:
    
        r0.put("has_valid_email", java.lang.String.valueOf(r0.A0T));
        r0.put("has_valid_phone_number", java.lang.String.valueOf(r0.A0U));
        r0 = X.Kvl.A01(r0, r0.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x030c, code lost:
    
        if (X.AbF.A1b(r0) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x030f, code lost:
    
        r304 = r0.get("supplemented_wallet_data_from_recent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x031f, code lost:
    
        if (r304 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0322, code lost:
    
        r304 = r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0325, code lost:
    
        r0.put("supplemented_wallet_data_from_recent", r304);
        r0 = r0.get("supplemented_wallet_data_from_crossapp");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x033e, code lost:
    
        if (r0 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0341, code lost:
    
        r306 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0344, code lost:
    
        r0.put("supplemented_wallet_data_from_crossapp", r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011c, code lost:
    
        if (r302.equals(r304) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020e, code lost:
    
        r0.put("AUTOMATIC_CONTACT_UPDATE_V2_MC_ENABLED", X.JR0.A0q(X.1GD.A07, r0.A04.A00, 36311839667195396L));
        r0 = (java.util.Map) r0.A0F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0256, code lost:
    
        if (r0.containsKey(8) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0259, code lost:
    
        r312 = java.lang.String.valueOf(r0.get(8));
        r304 = "SUPPRESS_NUX_QRT_EXPERIMENT_VERSION_ID";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026b, code lost:
    
        r0.put(r304, r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020b, code lost:
    
        if (r302.equals("SUPPRESSED_AUTOMATIC_UPDATE") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d6, code lost:
    
        if (r302.equals(r304) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01eb, code lost:
    
        r312 = java.lang.String.valueOf(r0.A03);
        r304 = "presented_end_of_session";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e8, code lost:
    
        if (r302.equals("PROMPTED_SAVE") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0284, code lost:
    
        if (r302.equals("DECLINED_AUTOFILL") != false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0, types: [java.lang.Object, X.Ktt] */
    /* JADX WARN: Type inference failed for: r307v2, types: [java.lang.Object, X.Ktt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.Ktt A03(java.lang.String r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L8t.A03(java.lang.String, boolean):X.Ktt");
    }

    public final void A04(Bundle bundle, Integer num, Integer num2) {
        String str;
        String A00 = KVu.A00(num);
        if (0CU.A0T(A00, "SHOW_", false) && 0CU.A0T(A00, "_DIALOG", false)) {
            Ktt A01 = A01(this, 0Pz.A0W("SUPPRESSED_", 0CV.A0W(0CV.A0W(A00, "SHOW_", ""), "_DIALOG", "")));
            switch (num2.intValue()) {
                case 0:
                    str = "SuppressIndefinitely";
                    break;
                case 1:
                    str = "SuppressAndDeferToClose";
                    break;
                default:
                    str = "Ineligible";
                    break;
            }
            A01.A02("suppress_strategy_type", str);
            LDF.A00().A0B(bundle, A01.A01().A01());
        }
    }

    public final void A05(Bundle bundle, Integer num, String str) {
        String str2;
        Ktt A03 = A03("NO_PROMPTED_AUTOFILL", false);
        if (str != null) {
            A03.A0G = str;
        }
        switch (num.intValue()) {
            case 1:
                str2 = "INVALID_NONCE";
                break;
            case 2:
                str2 = "AUTOFILL_DISABLED";
                break;
            case 3:
                str2 = "SYSTEM_AUTOFILL_ONLY";
                break;
            case 4:
                str2 = "QRT_BLACKOUT";
                break;
            case 5:
                str2 = "USER_PREVIOUSLY_DECLINED_FOR_DOMAIN";
                break;
            case 6:
                str2 = "MISSING_RELEVANT_CONTACT_INFO";
                break;
            case 7:
                str2 = "PREFETCH_DISABLED";
                break;
            default:
                str2 = "PARENT_FRAGMENT_MANAGER_IS_NULL";
                break;
        }
        A03.A02(0Pz.A0W("NO_AUTOFILL_PROMPT_REASON_", str2), str2);
        LDF.A00().A0B(bundle, A03.A01().A01());
    }

    public final void A06(Ktt ktt) {
        C3243Jnf A0S = JQz.A0S(this.A00);
        if (A0S != null) {
            LDF.A00().A0B(A0S.A06(), ktt.A01().A01());
        }
    }
}
