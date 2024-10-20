package X;

import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.facebook.zero.common.util.CarrierAndSimMccMnc;
import com.facebook.zero.protocol.params.ZeroRequestBaseParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.3zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zt.class */
public abstract class AbstractC04053zt {
    public static ArrayList A00(ZeroRequestBaseParams zeroRequestBaseParams) {
        CarrierAndSimMccMnc carrierAndSimMccMnc = zeroRequestBaseParams.A00;
        String str = zeroRequestBaseParams.A01;
        ArrayList arrayList = new ArrayList();
        CarrierAndSimMccMnc.MccMncPair mccMncPair = carrierAndSimMccMnc.A00;
        arrayList.add(new BasicNameValuePair("carrier_mcc", mccMncPair.A00));
        arrayList.add(new BasicNameValuePair("carrier_mnc", mccMncPair.A01));
        CarrierAndSimMccMnc.MccMncPair mccMncPair2 = carrierAndSimMccMnc.A01;
        arrayList.add(new BasicNameValuePair("sim_mcc", mccMncPair2.A00));
        arrayList.add(new BasicNameValuePair("sim_mnc", mccMncPair2.A01));
        arrayList.add(new BasicNameValuePair("format", "json"));
        arrayList.add(new BasicNameValuePair(4YT.A00(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH), str));
        return arrayList;
    }
}
