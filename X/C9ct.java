package X;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: X.9ct, reason: invalid class name */
/* loaded from: 9ct.class */
public abstract class C9ct {
    public final String A00;

    public C9ct(String str) {
        this.A00 = str;
    }

    public void A00() {
        if (this instanceof C8r0) {
            C8r0 c8r0 = (C8r0) this;
            if (c8r0.A05 != null) {
                1pI r0 = c8r0.A02;
                Serializable serializable = c8r0.A01;
                8H2 r02 = new 8H2();
                Bundle A05 = 1BK.A05();
                A05.putBoolean("UGCAiSearchFragment.finish_activity_on_close", true);
                if (serializable != null) {
                    A05.putSerializable("UGCAiSearchFragment.entry_point", serializable);
                }
                r02.setArguments(A05);
                r0.Czz(r02, 0S2.A0N, "UGCAiSearchFragment");
            }
            C9mr.A02("search_result_clicked", 283782991);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(long r302, java.lang.String r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9ct.A01(long, java.lang.String, java.lang.String):void");
    }

    public void A02(C1790AsO c1790AsO) {
        if (this instanceof C8r0) {
            return;
        }
        C8qz c8qz = (C8qz) this;
        11T.A0F(c1790AsO, 0);
        9TH r0 = c8qz.A03;
        r0.A04.A00(c8qz.A01, c1790AsO);
        String str = c1790AsO.A02;
        11T.A0F(str, 0);
        3vU.A06(r0.A02, 7zQ.A0x(r0.A03), 0Pz.A0W("personality_type_", str), 5);
    }

    public void A03(8Lg r302) {
        if (this instanceof C8r0) {
            C8r0 c8r0 = (C8r0) this;
            if (c8r0.A05 != null) {
                1pI r0 = c8r0.A02;
                String str = r302.A03;
                String str2 = r302.A04;
                Serializable serializable = c8r0.A01;
                1BK.A1K(str, 3, str2);
                8Gx r02 = new 8Gx();
                Bundle A05 = 1BK.A05();
                A05.putBoolean("UgcAiBotPickerSeeAllFragment.finish_activity_on_close", true);
                A05.putString("UgcAiBotPickerSeeAllFragment.section_id", str);
                A05.putString("UgcAiBotPickerSeeAllFragment.section_name", str2);
                if (serializable != null) {
                    A05.putSerializable("UgcAiBotPickerSeeAllFragment.entry_point", serializable);
                }
                r02.setArguments(A05);
                r0.Czz(r02, 0S2.A0Y, "UgcAiBotPickerSeeAllFragment");
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9ct) {
            return 11T.A0O(this.A00, ((C9ct) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
