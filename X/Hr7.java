package X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.base.Preconditions;

/* loaded from: Hr7.class */
public final class Hr7 {
    public final C1kw A00 = (C1kw) 1Bi.A03(16772);

    public void A00(Integer num, String str) {
        String str2;
        str.getClass();
        GYn A00 = GYn.A00(this.A00);
        2Jy A0H = 4YU.A0H("did_tap_commerce_bubble");
        A0H.A0D("pigeon_reserved_keyword_module", "messenger_commerce");
        A0H.A0D("bubble_type", "retail_receipt");
        11T.A0F(num, 0);
        if (num == 0S2.A01 || num == 0S2.A0C) {
            str2 = "receipt_id";
        } else if (num == 0S2.A0N || num == 0S2.A1J) {
            str2 = "shipment_id";
        } else {
            if (!HvM.A01(num)) {
                Preconditions.checkState(false, "Unsupported bubble type");
                throw 0Q8.createAndThrow();
            }
            str2 = "shipment_tracking_id";
        }
        A0H.A0D(str2, str);
        A00.A03(A0H);
    }

    public void A01(Integer num, String str, long j, boolean z) {
        String str2;
        GYn A00 = GYn.A00(this.A00);
        2Jy A0H = 4YU.A0H(z ? "network_request_success" : "network_error");
        A0H.A0D("pigeon_reserved_keyword_module", "messenger_commerce");
        switch (num.intValue()) {
            case 0:
                str2 = 4YT.A00(432);
                break;
            case 1:
                str2 = "receipt_item";
                break;
            case 2:
                str2 = "shipment";
                break;
            default:
                str2 = "order_history";
                break;
        }
        A0H.A0D("network_request_type", str2);
        A0H.A0C("network_time", j);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        A0H.A0D(TraceFieldType.ErrorCode, str);
        A00.A03(A0H);
    }
}
