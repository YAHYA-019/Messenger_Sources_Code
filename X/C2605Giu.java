package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.Giu, reason: case insensitive filesystem */
/* loaded from: Giu.class */
public final class C2605Giu extends C04v {
    public int A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.messaging.analytics.perf.efficiency.connectiontimeline.MessagingConnectionTimelineLogger.NetworkEventRecord");
            C2605Giu c2605Giu = (C2605Giu) obj;
            if (this.A00 == c2605Giu.A00 && 11T.A0O(this.A0B, c2605Giu.A0B) && 11T.A0O(this.A0A, c2605Giu.A0A) && 11T.A0O(this.A03, c2605Giu.A03) && 11T.A0O(this.A0E, c2605Giu.A0E) && 11T.A0O(this.A0C, c2605Giu.A0C) && 11T.A0O(this.A0D, c2605Giu.A0D) && 11T.A0O(this.A04, c2605Giu.A04) && 11T.A0O(this.A02, c2605Giu.A02) && 11T.A0O(this.A09, c2605Giu.A09) && 11T.A0O(this.A0F, c2605Giu.A0F) && 11T.A0O(this.A0G, c2605Giu.A0G) && 11T.A0O(this.A0H, c2605Giu.A0H) && 11T.A0O(this.A0I, c2605Giu.A0I) && 11T.A0O(this.A05, c2605Giu.A05) && 11T.A0O(this.A06, c2605Giu.A06) && 11T.A0O(this.A07, c2605Giu.A07) && 11T.A0O(this.A08, c2605Giu.A08) && 11T.A0O(this.A0J, c2605Giu.A0J) && 11T.A0O(this.A0K, c2605Giu.A0K) && 11T.A0O(this.A0N, c2605Giu.A0N) && 11T.A0O(this.A0M, c2605Giu.A0M) && 11T.A0O(this.A0Q, c2605Giu.A0Q) && 11T.A0O(this.A0O, c2605Giu.A0O) && 11T.A0O(this.A0R, c2605Giu.A0R) && 11T.A0O(this.A0P, c2605Giu.A0P) && 11T.A0O(this.A0L, c2605Giu.A0L)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A06 = ((((((((((((((((((((((((((((((((((((((((((((((((((this.A00 * 31) + 1BL.A06(this.A0B)) * 31) + 1BL.A06(this.A0A)) * 31) + 1BL.A06(this.A03)) * 31) + 1BL.A06(this.A0E)) * 31) + 1BL.A06(this.A0C)) * 31) + 1BL.A06(this.A0D)) * 31) + 1BL.A06(this.A04)) * 31) + 1BL.A06(this.A02)) * 31) + 1BL.A06(this.A09)) * 31) + 1BL.A06(this.A0F)) * 31) + 1BL.A06(this.A0G)) * 31) + 1BL.A06(this.A0H)) * 31) + 1BL.A06(this.A0I)) * 31) + 1BL.A06(this.A05)) * 31) + 1BL.A06(this.A06)) * 31) + 1BL.A06(this.A07)) * 31) + 1BL.A06(this.A08)) * 31) + 1BL.A06(this.A0J)) * 31) + 1BL.A06(this.A0K)) * 31) + 1BL.A06(this.A0N)) * 31) + 1BL.A06(this.A0M)) * 31) + 1BL.A06(this.A0Q)) * 31) + 1BL.A06(this.A0O)) * 31) + 1BL.A06(this.A0R)) * 31) + 1BL.A06(this.A0P)) * 31;
        String str = this.A0L;
        if (str != null) {
            i = str.hashCode();
        }
        return A06 + i;
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(HHl.A00(this.A01));
        A0k.append(" ");
        int i = this.A00;
        String str2 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        switch (i) {
            case 1:
                str2 = "WIFI_UNKNOWN";
                break;
            case 2:
                str2 = "CELLULAR_UNKNOWN";
                break;
            case 3:
                str2 = "CELLULAR_CDMA";
                break;
            case 4:
                str2 = "CELLULAR_GSM";
                break;
            case 5:
                str2 = "CELLULAR_WCDMA";
                break;
            case 6:
                str2 = "CELLULAR_LTE";
                break;
            case 7:
                str2 = "CELLULAR_NRNSA";
                break;
            case 8:
                str2 = "CELLULAR_NR";
                break;
        }
        A0k.append(str2);
        String str3 = this.A0B;
        if (str3 != null) {
            A0k.append(" estimatedQuality:");
            int hashCode = str3.hashCode();
            if (hashCode == 48) {
                if (str3.equals(ConstantsKt.CAMERA_ID_FRONT)) {
                    str = "NETWORK_QUALITY_UNAVAILABLE";
                    A0k.append(str);
                }
                str = "NETWORK_QUALITY_UNKNOWN";
                A0k.append(str);
            } else if (hashCode != 49) {
                if (hashCode == 51 && str3.equals("3")) {
                    str = "NETWORK_QUALITY_FAIR";
                    A0k.append(str);
                }
                str = "NETWORK_QUALITY_UNKNOWN";
                A0k.append(str);
            } else {
                if (str3.equals(ConstantsKt.CAMERA_ID_BACK)) {
                    str = "NETWORK_QUALITY_POOR";
                    A0k.append(str);
                }
                str = "NETWORK_QUALITY_UNKNOWN";
                A0k.append(str);
            }
        }
        String str4 = this.A0A;
        if (str4 != null) {
            A0k.append(" derived_gen:");
            A0k.append(str4);
        }
        String str5 = this.A03;
        if (str5 != null) {
            A0k.append(" cell_number:");
            A0k.append(str5);
        }
        String str6 = this.A0E;
        if (str6 != null) {
            A0k.append(" is_cell_changed:");
            A0k.append(str6);
        }
        String str7 = this.A0C;
        if (str7 != null) {
            A0k.append(" handover_detected:");
            A0k.append(str7);
        }
        String str8 = this.A0D;
        if (str8 != null) {
            A0k.append(" handover_predicted:");
            A0k.append(str8);
        }
        String str9 = this.A04;
        if (str9 != null) {
            A0k.append(" cell_upstream_bandwidth_kbps:");
            A0k.append(str9);
        }
        String str10 = this.A02;
        if (str10 != null) {
            A0k.append(" cell_downstream_bandwidth_kbps:");
            A0k.append(str10);
        }
        String str11 = this.A09;
        if (str11 != null) {
            A0k.append(" dbm:");
            A0k.append(str11);
        }
        String str12 = this.A0F;
        if (str12 != null) {
            A0k.append(" rsrp:");
            A0k.append(str12);
        }
        String str13 = this.A0G;
        if (str13 != null) {
            A0k.append(" rsrq:");
            A0k.append(str13);
        }
        String str14 = this.A0H;
        if (str14 != null) {
            A0k.append(" rssi:");
            A0k.append(str14);
        }
        String str15 = this.A0I;
        if (str15 != null) {
            A0k.append(" rssnr:");
            A0k.append(str15);
        }
        String str16 = this.A05;
        if (str16 != null) {
            A0k.append(" cqi:");
            A0k.append(str16);
        }
        String str17 = this.A06;
        if (str17 != null) {
            A0k.append(" csi_rsrp:");
            A0k.append(str17);
        }
        String str18 = this.A07;
        if (str18 != null) {
            A0k.append(" csi_rsrq:");
            A0k.append(str18);
        }
        String str19 = this.A08;
        if (str19 != null) {
            A0k.append(" csi_sinr:");
            A0k.append(str19);
        }
        String str20 = this.A0J;
        if (str20 != null) {
            A0k.append(" ss_rsrp:");
            A0k.append(str20);
        }
        String str21 = this.A0K;
        if (str21 != null) {
            A0k.append(" ss_rsrq:");
            A0k.append(str21);
        }
        String str22 = this.A0N;
        if (str22 != null) {
            A0k.append(" wifi_rssi:");
            A0k.append(str22);
        }
        String str23 = this.A0M;
        if (str23 != null) {
            A0k.append(" wifi_frequency:");
            A0k.append(str23);
        }
        String str24 = this.A0Q;
        if (str24 != null) {
            A0k.append(" wifi_standard:");
            A0k.append(str24);
        }
        String str25 = this.A0O;
        if (str25 != null) {
            A0k.append(" wifi_rx_link_speed_mbps:");
            A0k.append(str25);
            String str26 = this.A0R;
            if (str26 != null) {
                A0k.append(" wifi_tx_link_speed_mbps:");
                A0k.append(str26);
            }
            String str27 = this.A0P;
            if (str27 != null) {
                A0k.append(" wifi_security_type:");
                A0k.append(str27);
            }
            String str28 = this.A0L;
            if (str28 != null) {
                A0k.append(" wifi_channel_width:");
                A0k.append(str28);
            }
        }
        return 11T.A02(A0k);
    }
}
