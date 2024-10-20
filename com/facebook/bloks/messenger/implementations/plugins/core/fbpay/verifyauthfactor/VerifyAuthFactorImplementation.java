package com.facebook.bloks.messenger.implementations.plugins.core.fbpay.verifyauthfactor;

import X.03W;
import X.04R;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.C06014fk;
import X.C2050DaD;
import X.C3o5;
import X.DKC;
import X.DKD;
import X.DKc;
import X.DSL;
import X.DSN;
import X.Ek0;
import X.EvO;
import X.Eyr;
import X.EzS;
import X.FGK;
import X.FGL;
import X.FGb;
import X.FGo;
import X.FHh;
import X.FJC;
import X.FZ6;
import X.FZB;
import X.Fwk;
import X.GBq;
import X.GJj;
import X.LQx;
import X.Raw;
import X.Rh9;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.List;
import java.util.Map;

/* loaded from: VerifyAuthFactorImplementation.class */
public final class VerifyAuthFactorImplementation {
    public static final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        LiveData switchMap;
        11T.A0F(fwk, 0);
        if (!(fwk instanceof C2050DaD)) {
            return null;
        }
        1Br A01 = 1Bu.A01(fwk.A00, 99389);
        Fragment fragment = ((C2050DaD) fwk).A01;
        List list = dKc.A00;
        Object obj = list.get(0);
        String A17 = DKC.A17(obj);
        String str = (String) obj;
        Object A13 = DKC.A13(list);
        11T.A0I(A13, A17);
        String str2 = (String) A13;
        String A0x = DKD.A0x(list, 3);
        03W r310 = (Map) list.get(4);
        GJj A00 = FGb.A00(dKc, 5);
        GJj A002 = FGb.A00(dKc, 6);
        if (r310 == null) {
            r310 = 04R.A0G();
        }
        Eyr eyr = new Eyr(A0x, str2, str, r310);
        Bundle A05 = 1BK.A05();
        String str3 = eyr.A00;
        if (str3 != null) {
            A05.putString("AUTH_METHOD_TYPE", str3);
        }
        String str4 = eyr.A01;
        A05.putString("PAYMENT_TYPE", str4);
        EvO evO = new EvO();
        evO.A00(eyr.A02);
        evO.A01 = str4;
        A05.putParcelable("logger_data", new FBPayLoggerData(evO));
        Map map = eyr.A03;
        Object obj2 = map.get("capabilities");
        11T.A0I(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        A05.putStringArray("PTT_UTIL_CAP_NAMES", C3o5.A0n((List) obj2));
        if ("PAYPAL_ACCESS_TOKEN".equals(str3)) {
            A05.putBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", true);
            Object obj3 = map.get("secret_value");
            11T.A0I(obj3, A17);
            String str5 = (String) obj3;
            Object obj4 = map.get("credential_id");
            11T.A0I(obj4, A17);
            Ek0 A003 = FGK.A00(A05, new EzS((Raw) null, str5, (String) obj4, (String) null, (String) null, (String) null, str3, (String) null, (String) null, (String) null), "CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION");
            Rh9 A02 = C06014fk.A0B().A02(fragment);
            Object obj5 = map.get("target_operation");
            11T.A0I(obj5, A17);
            String str6 = (String) obj5;
            Object obj6 = map.get("ptt_payload");
            if (obj6 == null) {
                obj6 = 04R.A0G();
            }
            switchMap = A02.A04(A003, obj6, str6);
        } else {
            FGL.A02("VERIFY_PIN_TO_PAY", A05);
            FGL.A03("VERIFY_PIN", A05);
            MediatorLiveData mediatorLiveData = new MediatorLiveData();
            if ("PIN".equals(str3)) {
                DSN create = C06014fk.A0B().A01().create(DSN.class);
                mediatorLiveData.addSource(create.A06, new FZB(mediatorLiveData, 19));
                mediatorLiveData.addSource(create.A07, new FZB(mediatorLiveData, 20));
                create.A02(A05, (FGo) null);
                Object obj7 = map.get("secret_value");
                11T.A0I(obj7, A17);
                create.A03((String) obj7);
            } else if ("CSC".equals(str3)) {
                DSL create2 = C06014fk.A0B().A01().create(DSL.class);
                mediatorLiveData.addSource(create2.A05, new FZB(mediatorLiveData, 21));
                MediatorLiveData mediatorLiveData2 = create2.A06;
                mediatorLiveData.addSource(mediatorLiveData2, new FZB(mediatorLiveData, 22));
                Object obj8 = map.get("credential_id");
                11T.A0I(obj8, A17);
                A05.putString("CREDENTIAL_ID", (String) obj8);
                create2.A02(A05);
                Object obj9 = map.get("secret_value");
                11T.A0I(obj9, A17);
                create2.A02 = (String) obj9;
                mediatorLiveData2.postValue(null);
                if (!TextUtils.isEmpty(create2.A02) && create2.A02.length() == create2.A01()) {
                    DSL.A00(create2);
                }
            } else {
                mediatorLiveData.setValue(FJC.A04((Object) null));
            }
            switchMap = Transformations.switchMap(mediatorLiveData, new GBq(eyr, A05, 4));
        }
        switchMap.observe(fragment, new LQx(new FZ6(0, A00, A002, fHh, A01), switchMap, 10));
        return null;
    }
}
