package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9cs, reason: invalid class name */
/* loaded from: 9cs.class */
public final class C9cs {
    public C2z3 A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final int A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;

    public C9cs(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, boolean z) {
        11T.A0F(str, 1);
        1BL.A1G(str5, str6);
        this.A0B = str;
        this.A0C = str2;
        this.A0D = str3;
        this.A05 = str4;
        this.A02 = str5;
        this.A0A = str6;
        this.A04 = str7;
        this.A03 = str8;
        this.A0E = str9;
        this.A0F = str10;
        this.A07 = i;
        this.A0G = str11;
        this.A09 = str12;
        this.A08 = str13;
        this.A06 = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A00() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A0D
            r302 = r0
            r0 = r302
            int r0 = r0.hashCode()
            r303 = r0
            r0 = r303
            switch(r0) {
                case -1874205394: goto L71;
                case -1432283924: goto L84;
                case -1266283874: goto L90;
                case -96849274: goto La3;
                case 290988253: goto Lae;
                case 511499482: goto Lb4;
                case 839469436: goto Lba;
                case 893833541: goto Lc0;
                case 913625596: goto Lc6;
                case 988309276: goto Lcc;
                case 1272798692: goto Ld2;
                default: goto L6c;
            }
        L6c:
            r0 = r301
            java.lang.String r0 = r0.A09
            return r0
        L71:
            java.lang.String r0 = "msgr_e2ee_message_reminder"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6c
            java.lang.String r0 = "thread_id"
            r304 = r0
            goto Le2
        L84:
            r0 = 481(0x1e1, float:6.74E-43)
            r303 = r0
            r0 = r303
            java.lang.String r0 = X.1BJ.A00(r0)
            r304 = r0
            goto L93
        L90:
            java.lang.String r0 = "friend"
            r304 = r0
        L93:
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6c
            java.lang.String r0 = "target_user_id"
            r304 = r0
            goto Le2
        La3:
            r0 = 96
            r303 = r0
            r0 = r303
            java.lang.String r0 = X.1BJ.A00(r0)
            r304 = r0
            goto Ld5
        Lae:
            java.lang.String r0 = "messenger_community_channel_creation"
            r304 = r0
            goto Ld5
        Lb4:
            java.lang.String r0 = "messenger_community_chat_join_request_added_batched"
            r304 = r0
            goto Ld5
        Lba:
            java.lang.String r0 = "public_channels_new_channel_notif"
            r304 = r0
            goto Ld5
        Lc0:
            java.lang.String r0 = "messenger_community_admin_direct_invite_generic"
            r304 = r0
            goto Ld5
        Lc6:
            java.lang.String r0 = "messenger_community_member_request_admin"
            r304 = r0
            goto Ld5
        Lcc:
            java.lang.String r0 = "community_reported_and_flagged"
            r304 = r0
            goto Ld5
        Ld2:
            java.lang.String r0 = "messenger_community_chat_join_request_added_single_requester"
            r304 = r0
        Ld5:
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6c
            java.lang.String r0 = "community_id"
            r304 = r0
        Le2:
            r0 = r301
            r1 = r304
            java.lang.String r0 = r0.A01(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9cs.A00():java.lang.String");
    }

    public final String A01(String str) {
        String str2 = this.A08;
        if (str2 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean A02() {
        String str = this.A03;
        boolean z = false;
        if (str == null || str.length() == 0 || str.equals(ConstantsKt.CAMERA_ID_FRONT)) {
            z = true;
        }
        return z;
    }

    public final boolean A03() {
        String str = this.A04;
        boolean z = false;
        if (str == null || str.length() == 0 || str.equals(ConstantsKt.CAMERA_ID_FRONT)) {
            z = true;
        }
        return z;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("JewelObject(id=");
        A0k.append(this.A0B);
        A0k.append(", notifSubtype=");
        A0k.append(this.A0D);
        A0k.append(", title=");
        A0k.append(this.A05);
        A0k.append(", body=");
        A0k.append(this.A02);
        A0k.append(", seenTimestampMS=");
        A0k.append(this.A04);
        A0k.append(", readTimestampMS=");
        A0k.append(this.A03);
        A0k.append(", profilePicUrl=");
        A0k.append(this.A0E);
        A0k.append(", secondaryProfilePicUrl=");
        A0k.append(this.A0F);
        A0k.append(", renderStyle=");
        A0k.append(this.A07);
        A0k.append(", userId=");
        A0k.append(this.A0G);
        A0k.append(", actorId=");
        A0k.append(this.A09);
        A0k.append(", actionParams=");
        A0k.append(this.A08);
        A0k.append(", isHighLighted=");
        A0k.append(this.A06);
        return 4YV.A0x(A0k);
    }
}
