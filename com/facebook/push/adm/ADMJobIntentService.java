package com.facebook.push.adm;

import X.0FI;
import X.0Fe;
import X.0G8;
import X.0fH;
import X.1BL;
import X.1BV;
import X.1Og;
import X.1Ql;
import X.1uD;
import X.4YV;
import X.4rH;
import X.AbE;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C00i;
import X.C01443r5;
import X.C08o;
import X.C3r6;
import X.C45m;
import X.DKC;
import X.JR0;
import X.Krw;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ADMJobIntentService.class */
public class ADMJobIntentService extends 0Fe {
    public final C00i A00 = 1BV.A00(131216);

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        int A00 = C08o.A00(this, 1153209990);
        int A04 = 0FI.A04(1160065218);
        super.onCreate();
        0FI.A0A(-885411812, A04);
        C08o.A02(418907501, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onHandleWork(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        FbUserSession A0F = 1BL.A0F();
        switch (action.hashCode()) {
            case -1350309703:
                if (action.equals("registration")) {
                    ((Krw) this.A00.get()).A01(intent, A0F);
                    return;
                }
                return;
            case 581448473:
                if (action.equals(AnonymousClass000.A00(ActionId.CONTROLLER_INITIATED))) {
                    Krw krw = (Krw) this.A00.get();
                    0fH.A0j("ADMServiceHelper", "Received handleMessage");
                    Bundle bundleExtra = intent.getBundleExtra("bundle");
                    if (bundleExtra != null) {
                        1Ql A0V = 1BL.A0V(krw.A02);
                        A0V.CaH(((1Og) krw.A03.get()).A06, 1BL.A08(krw.A00));
                        A0V.commit();
                        JSONObject A12 = AnonymousClass001.A12();
                        String str = null;
                        try {
                            Iterator A0w = JR0.A0w(bundleExtra);
                            while (A0w.hasNext()) {
                                String A0i = AnonymousClass001.A0i(A0w);
                                A12.put(A0i, A0i.equals("params") ? DKC.A1F(bundleExtra.getString(A0i)) : bundleExtra.getString(A0i));
                                if (A0i.equals("PushNotifId")) {
                                    str = bundleExtra.getString("PushNotifId");
                                }
                            }
                            0fH.A0g(A12.toString(), "ADMServiceHelper", "ADM JSON message: %s");
                        } catch (JSONException e) {
                            0fH.A0r("ADMServiceHelper", "Push notification parse exception", e);
                            C01443r5 c01443r5 = (C01443r5) krw.A04.get();
                            c01443r5.A02.get();
                            c01443r5.A09("messaging_push_notif", AbE.A00(663), C45m.A00(Property.SYMBOL_Z_ORDER_SOURCE, "ADM", "push_id", str, "exception", e.toString(), "stacktrace", 0G8.A01(e)));
                            1uD.A01();
                        }
                        PushInfraMetaData A01 = PushInfraMetaData.Companion.A01(intent);
                        FbUserSession A0D = 4YV.A0D(this);
                        C3r6 c3r6 = (C3r6) krw.A01.get();
                        String obj = A12.toString();
                        4rH r0 = 4rH.A02;
                        4YV.A1N(A0D, A01);
                        c3r6.A01(this, A0D, r0, A01, null, obj, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1228402434:
                if (action.equals("registration_error")) {
                    ((Krw) this.A00.get()).A00(intent);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
