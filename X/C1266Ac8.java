package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;

/* renamed from: X.Ac8, reason: case insensitive filesystem */
/* loaded from: Ac8.class */
public final class C1266Ac8 {
    public static final COD A02 = new Object();
    public final 1Br A00 = 1BK.A0D();
    public final PrivacyContext A01;

    public C1266Ac8() {
        PrivacyContext newPrivacyContextWithTransportKeyNative = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative(null, "FBLegacyBroker");
        11T.A0A(newPrivacyContextWithTransportKeyNative);
        this.A01 = newPrivacyContextWithTransportKeyNative;
    }

    public static void A00(1UG r301, ThreadKey threadKey, String str) {
        r301.A7R(TraceFieldType.RequestID, str);
        HashMap hashMap = new HashMap();
        String num = Integer.toString(5Xa.A00(threadKey));
        11T.A0A(num);
        hashMap.put("mailbox_type", num);
        String bool = Boolean.toString(threadKey.A0w());
        11T.A0A(bool);
        hashMap.put("is_group_invite", bool);
        r301.A6J("extra_data_map", hashMap);
        r301.BZL();
    }

    public final void A01(3EX r302, 1F9 r303, String str, int i, int i2, int i3) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1567));
        if (A08.isSampled()) {
            int A00 = COD.A00(r303);
            A08.A5c(r302, "entry_point");
            A08.A6H("actioned_unread_thread_count", AbI.A11(A08, 1BK.A0l(i2), "actioned_thread_count", i3));
            4YU.A1I(A08, "action", i);
            4YU.A1I(A08, "folder", A00);
            A08.A7R(TraceFieldType.RequestID, str);
            A08.BZL();
        }
    }

    public final void A02(1F9 r302, ThreadKey threadKey, String str) {
        11T.A0F(threadKey, 0);
        1BL.A1F(r302, str);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1569));
        if (A08.isSampled()) {
            AbF.A1K(COD.A02(r302, threadKey), A08);
            4YU.A1I(A08, "action", 0);
            A08.A7R(TraceFieldType.RequestID, str);
            A08.BZL();
        }
    }

    public final void A03(1F9 r302, ThreadKey threadKey, String str, int i) {
        11T.A0H(threadKey, r302);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1571));
        if (A08.isSampled()) {
            AbF.A1K(COD.A02(r302, threadKey), A08);
            4YU.A1I(A08, "action", i);
            A00(A08, threadKey, str);
        }
    }

    public final void A04(1F9 r302, ThreadKey threadKey, String str, int i) {
        7zR.A1N(r302, str);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1572));
        if (A08.isSampled()) {
            AbF.A1K(COD.A02(r302, threadKey), A08);
            4YU.A1I(A08, "action", i);
            A00(A08, threadKey, str);
        }
    }

    public final void A05(ThreadKey threadKey, String str, int i, int i2, boolean z) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1565));
        if (A08.isSampled()) {
            1F9 A00 = str != null ? 1F9.A00(str) : 1F9.A0N;
            long A0r = threadKey != null ? threadKey.A0r() : -1;
            0DA r0 = new 0DA();
            r0.A06("fbid", Long.valueOf(A0r));
            r0.A01(COD.A01(threadKey), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            7zN.A14(r0, "folder", COD.A00(A00));
            0DA r02 = new 0DA();
            7zN.A14(r02, "media_type", z ? 1 : 0);
            7zN.A14(r02, "from_state", i);
            7zN.A14(r02, "to_state", i2);
            A08.A7T(r02, "data");
            AbF.A1K(r0, A08);
            A08.BZL();
        }
    }
}
