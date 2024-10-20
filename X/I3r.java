package X;

import com.facebook.webrtc.common.RtcUserCapabilitiesField;
import com.google.common.collect.ImmutableMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: I3r.class */
public final class I3r {
    public final 1De A00;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A01 = 7zM.A0N();
    public final 1Br A04 = AbG.A0M();

    public I3r(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 99980);
        this.A02 = 1Bu.A03(r0, 67593);
        this.A06 = 1Bu.A03(r0, 83955);
        this.A05 = 1Bu.A03(r0, 84946);
        this.A07 = 1Bu.A03(r0, 115285);
    }

    public static void A00(HBQ hbq, AVO avo, boolean z) {
        avo.invoke(hbq.A00(), Boolean.valueOf(z));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x005f. Please report as an issue. */
    public final ImmutableMap A01(byte[] bArr) {
        11T.A0F(bArr, 0);
        String A16 = GOq.A16(bArr);
        ImmutableMap.Builder A0c = 1BK.A0c();
        if (A16.length() != 0) {
            try {
                JSONObject A1F = DKC.A1F(A16);
                try {
                    for (HBQ hbq : HBQ.values()) {
                        if (A1F.has(hbq.A00())) {
                            switch (hbq.ordinal()) {
                                case 0:
                                case 1:
                                case 2:
                                case 9:
                                case 10:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    A0c.put(hbq, new RtcUserCapabilitiesField(A1F.getBoolean(hbq.A00())));
                                    break;
                            }
                        }
                    }
                } catch (JSONException e) {
                    4zI.A03.A03("RtcUserCapabilitiesHelper", "Failed to parse user capabilities", e, new Object[0]);
                }
            } catch (JSONException e2) {
                4zI.A03.A03("RtcUserCapabilitiesHelper", "Invalid JSON string: %s", e2, new Object[]{A16});
                1Br.A04(this.A04).softReport("RtcUserCapabilitiesHelper", 0Pz.A0W("Failed to parse capability string: ", A16), e2);
            }
        }
        ImmutableMap build = A0c.build();
        11T.A0A(build);
        return build;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0162, code lost:
    
        if (((X.53C) r0.get()).A01(false) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b4, code lost:
    
        if (((X.53C) r0.get()).A01(false) == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] A02(com.facebook.auth.usersession.FbUserSession r302) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3r.A02(com.facebook.auth.usersession.FbUserSession):byte[]");
    }
}
