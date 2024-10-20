package X;

import android.content.Context;
import android.os.Bundle;
import android.view.autofill.AutofillManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.enums.EnumEntries;

/* renamed from: X.Jmv, reason: case insensitive filesystem */
/* loaded from: Jmv.class */
public final class C3218Jmv extends LET {
    public final C00i A00;

    public C3218Jmv(Kvg kvg, C11474wl c11474wl, C3243Jnf c3243Jnf, KWA kwa, KYt kYt) {
        super(kvg, c11474wl, new KoZ((AnonymousClass046) 1Bn.A0H(AnonymousClass046.class, (Class) null)), c3243Jnf, kwa, kYt);
        this.A00 = 1Bi.A02(1Ew.class, (Class) null);
    }

    public static String A00(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v214, types: [X.Jsw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v392, types: [X.0ty] */
    public void A0N(JYI jyi) {
        int length;
        CharSequence charSequence;
        C11434wh c11434wh;
        Set set;
        ArrayList A0s;
        int length2;
        Boolean A0d = 1BK.A0d();
        Kpc kpc = Kpc.A03;
        if (kpc != null && kpc.A00()) {
            A0d = AnonymousClass001.A0K();
        }
        C11474wl c11474wl = ((LET) this).A0P;
        C3243Jnf c3243Jnf = ((LET) this).A03;
        Context context = ((L5Y) c3243Jnf).A00;
        Bundle A06 = c3243Jnf.A06();
        boolean booleanValue = A0d.booleanValue();
        11T.A0F(c11474wl, 0);
        if (context == null || jyi == null) {
            return;
        }
        C11424wg c11424wg = c11474wl.A00;
        11T.A0F(c11424wg, 1);
        String A01 = LDu.A01(jyi.A06);
        if (A01 == null || ((Set) c11424wg.A0N.A01).contains(A01)) {
            return;
        }
        C11384wc c11384wc = c11474wl.A04;
        if (c11384wc.A00.AZk(36311839671389743L)) {
            4ZI.A00();
            C06014fk.A0H();
            throw null;
        }
        Set set2 = JR9.A0B;
        LinkedHashMap A03 = LBn.A03(jyi, c11384wc, set2);
        LinkedHashMap A07 = 04R.A07(LBn.A03(jyi, c11384wc, JR9.A0H), A03);
        c11424wg.A05.A00 = A07;
        boolean A032 = (A07.containsKey("cc-number") && (A07.containsKey("cc-exp") || (A07.containsKey("cc-exp-month") && A07.containsKey("cc-exp-year"))) && A07.containsKey("cc-csc")) ? LDI.A03(LDI.A01(4YU.A16("cc-number", A07), 4YU.A16("cc-csc", A07), 4YU.A16("cc-exp", A07), 4YU.A16("cc-exp-month", A07), 4YU.A16("cc-exp-year", A07))) : false;
        if (KW8.A00(c11424wg, c11384wc) && (c11434wh = (C11434wh) c11424wg.A05.A01) != null && c11434wh.A00.size() < 100) {
            java.util.Map map = c11424wg.A01.A06;
            11T.A0F(map, 0);
            EnumEntries<EKr> enumEntries = EKr.A00;
            ArrayList A0z = 1BL.A0z(enumEntries);
            for (EKr eKr : enumEntries) {
                long currentTimeMillis = System.currentTimeMillis();
                if (A07.isEmpty()) {
                    A0s = C0ty.A00;
                } else {
                    int ordinal = eKr.ordinal();
                    if (ordinal == 2) {
                        set = set2;
                    } else if (ordinal == 1) {
                        set = JR9.A04;
                    } else {
                        if (ordinal != 0) {
                            throw 1BK.A1F();
                        }
                        set = JR9.A09;
                    }
                    A0s = AnonymousClass001.A0s();
                    for (Object obj : set) {
                        String A0b = AnonymousClass001.A0b(obj, map);
                        String A16 = 4YU.A16(obj, A07);
                        if (A16 != null && A16.length() != 0 && (A0b == null || (length2 = A0b.length()) == 0 || (length2 > 0 && !A0b.equals(A16)))) {
                            A0s.add(obj);
                        }
                    }
                }
                A0z.add(new Jsy(eKr, A0s, currentTimeMillis));
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (Object obj2 : A0z) {
                if (((Jsy) obj2).A02.size() >= 2) {
                    A0s2.add(obj2);
                }
            }
            if (!A0s2.isEmpty()) {
                ArrayList A17 = 1BK.A17(A0s2);
                A17.addAll(c11434wh.A00);
                c11424wg.A05.A01 = new C11434wh(A17, A032);
            }
        }
        c11424wg.A01.A01 = new JtB(A00("cc-number", A03), A00("cc-csc", A03), A00("cc-exp-month", A03), A00("cc-exp-year", A03), A00("cc-exp", A03), 0);
        c11424wg.A01.A02 = new JtB(A00("cc-number", A03), A00("ml-cc-csc", A03), A00("ml-cc-exp-month", A03), A00("ml-cc-exp-year", A03), A00("ml-cc-exp", A03), 0);
        c11424wg.A01.A03 = new JtB(A00("raw-cc-number", A03), A00("raw-cc-csc", A03), A00("raw-cc-exp-month", A03), A00("raw-cc-exp-year", A03), A00("raw-cc-exp", A03), 0);
        Jsw jsw = c11424wg.A01;
        String A162 = 4YU.A16("given-name", A03);
        String A163 = 4YU.A16("family-name", A03);
        String A164 = 4YU.A16(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A03);
        if ((A162 != null && A162.length() != 0) || (A163 != null && A163.length() != 0)) {
            String str = A162;
            String str2 = A163;
            if (A162 == null) {
                str = "";
            }
            if (A163 == null) {
                str2 = "";
            }
            A164 = 4YU.A13(0Pz.A0Y(str, str2, ' '));
        } else if (A164 != null && (length = A164.length()) != 0) {
            A162 = A164;
            int A012 = 0CU.A01(A164, ' ', length - 1);
            if (A012 > 0) {
                A162 = 7zM.A1C(0, A012, A164);
                A163 = DKC.A19(A164, A012 + 1);
            } else {
                A163 = null;
            }
        }
        jsw.A00 = new JtF(A00("email", A03), A162, A163, A164, A00("address-line1", A03), A00("address-line2", A03), A00("address-line3", A03), A00("address-level1", A03), A00("address-level2", A03), A00("address-level3", A03), A00("address-level4", A03), A00("postal-code", A03), A00("street-address", A03), A00("tel", A03), A00("tel-area-code", A03), A00("tel-country-code", A03), A00("tel-local", A03), A00("tel-local-prefix", A03), A00("tel-local-suffix", A03), A00("tel-national", A03), A00("country", A03), A00("country-name", A03), 1);
        Jsw jsw2 = c11424wg.A01;
        String str3 = jsw2.A04;
        String str4 = jsw2.A05;
        JtB jtB = jsw2.A01;
        JtB jtB2 = jsw2.A03;
        JtB jtB3 = jsw2.A02;
        JtF jtF = jsw2.A00;
        java.util.Map map2 = jsw2.A06;
        7zP.A1L(str3, 0, map2);
        ?? obj3 = new Object();
        obj3.A04 = str3;
        obj3.A05 = str4;
        obj3.A01 = jtB;
        obj3.A03 = jtB2;
        obj3.A02 = jtB3;
        obj3.A00 = jtF;
        obj3.A06 = map2;
        c11424wg.A00 = obj3;
        Jsw jsw3 = c11424wg.A01;
        jsw3.A06 = 04R.A07(jsw3.A06, A07);
        C11444wi c11444wi = c11474wl.A01;
        11T.A0F(c11444wi, 3);
        if (KW8.A00(c11424wg, c11384wc)) {
            java.util.Map map3 = c11424wg.A01.A06;
            CharSequence charSequence2 = (CharSequence) map3.get("raw-cc-number");
            if ((charSequence2 != null && charSequence2.length() != 0) || ((charSequence = (CharSequence) map3.get("cc-number")) != null && charSequence.length() != 0)) {
                ((AutofillManager) context.getSystemService(AutofillManager.class)).cancel();
                Integer num = 0S2.A0Y;
                03W A0G = 04R.A0G();
                11T.A0F(num, 1);
                C11444wi.A01(A06, c11444wi, "AUTOFILL_MANAGER_CANCEL_SUCCESS", "SYSTEM_AUTOFILL", A0G);
            }
        }
        if (booleanValue) {
            A03.get("cc-number");
        }
    }
}
