package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.4Ll, reason: invalid class name */
/* loaded from: 4Ll.class */
public final class C4Ll {
    public final 1Br A00 = 1Bq.A00(16634);

    public final void A00(long j, String str, long j2, String str2) {
        1UG A00 = 1UD.A00((04J) this.A00.A00.get(), 1ZG.A01, 1BJ.A00(539));
        if (A00.isSampled()) {
            A00.A6H("pymk_id", Long.valueOf(j));
            A00.A7R("pymk_location", str);
            A00.A7R("pymk_signature", str2);
            A00.A6H("pymk_position", Long.valueOf(j2 + 1));
            A00.BZL();
        }
    }

    public final void A01(long j, String str, String str2) {
        1UG A00 = 1UD.A00((04J) this.A00.A00.get(), 1ZG.A01, 1BJ.A00(1973));
        if (A00.isSampled()) {
            A00.A7R("pymk_id", String.valueOf(j));
            A00.A7R("pymk_location", str);
            A00.A7R("pymk_signature", str2);
            A00.BZL();
        }
    }

    public final void A02(long j, String str, String str2) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1975));
        if (A08.isSampled()) {
            A08.A7R("pymk_id", String.valueOf(j));
            A08.A7R("pymk_location", str);
            A08.A7R("pymk_signature", str2);
            A08.BZL();
        }
    }

    public final void A03(long j, String str, String str2) {
        1UG A00 = 1UD.A00((04J) this.A00.A00.get(), 1ZG.A01, 1BJ.A00(1974));
        if (A00.isSampled()) {
            A00.A7R("pymk_id", String.valueOf(j));
            A00.A7R("pymk_location", str);
            A00.A7R("pymk_signature", str2);
            A00.BZL();
        }
    }

    public final void A04(BOo bOo, C4Rf c4Rf, 3yU r304, 3yV r305, 3yQ r306) {
        A05(bOo, c4Rf, r304, r305, r306, 3yM.A03, null, null, null, null, null);
    }

    public final void A05(BOo bOo, C4Rf c4Rf, 3yU r304, 3yV r305, 3yQ r306, 3yM r307, Long l, Long l2, String str, String str2, String str3) {
        1UG A00 = 1UD.A00((04J) this.A00.A00.get(), 1ZG.A01, 1BJ.A00(1701));
        if (A00.isSampled()) {
            0DA r0 = new 0DA();
            r0.A01(r304, 1BJ.A00(196));
            r0.A01(r305, 1BJ.A00(200));
            r0.A01(c4Rf, "entry_point");
            0DA r02 = new 0DA();
            r02.A01(bOo, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            0DA r03 = new 0DA();
            r03.A01(r306, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            r03.A02(r02, "button");
            if (l != null) {
                0DA r04 = new 0DA();
                r04.A06("absolute_position", l);
                r03.A02(r04, "ranking");
            }
            if (l2 != null) {
                r03.A06("num_items", l2);
            }
            A00.A5c(r307, "event_type");
            A00.A7T(r0, "surface");
            A00.A7T(r03, "target");
            A00.A7R(7zK.A00(44), str);
            A00.A7R("pymk_location", str2);
            A00.A7R("pymk_signature", str3);
            A00.BZL();
        }
    }
}
