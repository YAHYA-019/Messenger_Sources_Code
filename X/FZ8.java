package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebook.smartcapture.logging.MC;
import com.google.gson.Gson;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* loaded from: FZ8.class */
public final class FZ8 implements Observer {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public FZ8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A06 = str;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = obj5;
        this.A05 = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        LiveData liveData;
        IllegalArgumentException A0L;
        int i = this.A00;
        Rh9 rh9 = (Rh9) this.A01;
        switch (i) {
            case 0:
                Queue queue = (Queue) this.A02;
                MutableLiveData mutableLiveData = (MutableLiveData) this.A03;
                String str = this.A06;
                Object obj2 = this.A04;
                Ek0 ek0 = (Ek0) this.A05;
                FJC fjc = (FJC) obj;
                if (!FJC.A0C(fjc)) {
                    mutableLiveData.postValue(FJC.A06(fjc.A02));
                    return;
                }
                Object obj3 = fjc.A01;
                obj3.getClass();
                String str2 = (String) obj3;
                0RZ.A05(!queue.isEmpty(), "factors can not be empty!");
                Object poll = queue.poll();
                poll.getClass();
                EzS ezS = (EzS) poll;
                if ("SDC".equalsIgnoreCase(ezS.A00) && !DLb.A00().AZk(MC.android_payment.ecp_usup_bloks_support)) {
                    throw AnonymousClass001.A0L("SDC auth factor not supported");
                }
                Ek0 A00 = FGK.A00(ek0.A01, ezS, str2);
                S4p s4p = rh9.A00;
                if (s4p != null) {
                    s4p.A01 = ezS;
                    s4p.A00 = A00;
                } else {
                    F4T f4t = rh9.A04;
                    LifecycleOwner lifecycleOwner = rh9.A01;
                    if (lifecycleOwner == null) {
                        lifecycleOwner = rh9.A02;
                        lifecycleOwner.getClass();
                    }
                    s4p = new S4p(lifecycleOwner, mutableLiveData, rh9.A03, A00, rh9, f4t, obj2, str, queue);
                }
                Bundle bundle = A00.A01;
                String A0p = DKD.A0p(bundle, "AUTH_METHOD_TYPE");
                List list = rh9.A05;
                list.add(A0p);
                GKt gKt = C06014fk.A0B().A02;
                HashMap A01 = FAt.A01(bundle);
                A01.put("DYNAMIC_AUTH_OPERATION_NAME", str);
                A01.put("DYNAMIC_AUTH_AUTH_TYPES", Collections.unmodifiableList(list));
                gKt.BZT("client_verify_dynamic_auth_display", Collections.unmodifiableMap(A01));
                if (!"BIO".equalsIgnoreCase(A0p)) {
                    Rh9.A02(s4p, A00, rh9);
                    return;
                }
                LiveData liveData2 = rh9.A03.A01;
                LifecycleOwner lifecycleOwner2 = rh9.A01;
                if (lifecycleOwner2 == null) {
                    lifecycleOwner2 = rh9.A02;
                    lifecycleOwner2.getClass();
                }
                FJC.A07(liveData2, lifecycleOwner2, new FZA(12, A00, s4p, rh9));
                return;
            case 1:
                Ek0 ek02 = (Ek0) this.A02;
                MutableLiveData mutableLiveData2 = (MutableLiveData) this.A03;
                String str3 = this.A06;
                Object obj4 = this.A04;
                0Jt r0 = (0Jt) this.A05;
                FJC fjc2 = (FJC) obj;
                if (FJC.A0A(fjc2)) {
                    QmY qmY = fjc2.A02;
                    if (qmY instanceof QmY) {
                        qmY.getClass();
                        QmY qmY2 = qmY;
                        try {
                            ek02.A01.putString("AUTH_EXCEPTION", new Gson().A06(qmY2));
                            ArrayDeque arrayDeque = new ArrayDeque();
                            if (qmY2 != null) {
                                Iterator it = qmY2.authFactorRequirement.A01.iterator();
                                while (it.hasNext()) {
                                    if (!((RU6) it.next()).A00.isEmpty()) {
                                        Iterator it2 = qmY2.authFactorRequirement.A01.iterator();
                                        while (it2.hasNext()) {
                                            for (EzS ezS2 : ((RU6) it2.next()).A00) {
                                                String str4 = ezS2.A00;
                                                if (!"BIO".equalsIgnoreCase(str4) && !"PIN".equalsIgnoreCase(str4) && !"CSC".equalsIgnoreCase(str4) && !"SDC".equalsIgnoreCase(str4) && !"PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(str4) && !"FB_ACCESS_TOKEN".equalsIgnoreCase(str4) && !"IG_ACCESS_TOKEN".equalsIgnoreCase(str4) && !"THREE_DS".equalsIgnoreCase(str4)) {
                                                    A0L = 0Pz.A05("Not supported auth factor:", str4);
                                                    throw A0L;
                                                }
                                                arrayDeque.add(ezS2);
                                            }
                                        }
                                        Fv2 fv2 = rh9.A00;
                                        if (fv2 != null) {
                                            Iterator it3 = arrayDeque.iterator();
                                            while (it3.hasNext()) {
                                                EzS ezS3 = (EzS) it3.next();
                                                java.util.Map map = fv2.A07;
                                                Iterator A1B = 1BK.A1B(map);
                                                while (true) {
                                                    if (A1B.hasNext()) {
                                                        Object next = A1B.next();
                                                        if (11T.A0O(((EzS) next).A00, ezS3.A00)) {
                                                            if (next != null) {
                                                                map.remove(next);
                                                            }
                                                        }
                                                    }
                                                }
                                                11T.A0D(ezS3);
                                                map.put(ezS3, null);
                                            }
                                        }
                                        rh9.A06(mutableLiveData2, ek02, obj4, str3, arrayDeque);
                                        return;
                                    }
                                }
                            }
                            A0L = AnonymousClass001.A0L("AuthException does not have group or any factor.");
                            throw A0L;
                        } catch (IllegalArgumentException unused) {
                            mutableLiveData2.postValue(FJC.A06(qmY2));
                            return;
                        }
                    }
                }
                if (rh9.A00 == null || !QmY.A00.contains(Integer.valueOf(F2Q.A00(fjc2.A02)))) {
                    if (rh9.A00 == null || r0 == null || FJC.A0B(fjc2) || (liveData = (LiveData) r0.apply(fjc2.A01)) == null) {
                        return;
                    }
                    FJC.A09(liveData, new FZ9(mutableLiveData2, rh9, 9));
                    return;
                }
                Fv2 fv22 = rh9.A00;
                java.util.Map map2 = fv22.A07;
                Iterator it4 = AbF.A1E(map2.keySet()).iterator();
                while (it4.hasNext()) {
                    EzS ezS4 = (EzS) it4.next();
                    if (11T.A0O(ezS4.A00, "BIO")) {
                        map2.remove(ezS4);
                    } else {
                        RMC rmc = (RMC) map2.get(ezS4);
                        if (rmc != null && rmc.A01 != null) {
                            map2.put(ezS4, null);
                        }
                    }
                }
                fv22.A00(null);
                return;
            default:
                String str5 = this.A06;
                Ek0 ek03 = (Ek0) this.A02;
                0Jt r02 = (0Jt) this.A03;
                Object obj5 = this.A04;
                MediatorLiveData mediatorLiveData = (MediatorLiveData) this.A05;
                FJC fjc3 = (FJC) obj;
                if (!FJC.A0C(fjc3)) {
                    Rh9.A01(r02, mediatorLiveData, ek03, rh9, obj5, str5);
                    return;
                }
                Object obj6 = fjc3.A01;
                obj6.getClass();
                F4T f4t2 = rh9.A04;
                F60 A0C = C06014fk.A0C();
                FGo[] fGoArr = {(FGo) obj6};
                HashSet A0v = AnonymousClass001.A0v();
                Collections.addAll(A0v, fGoArr);
                FvF fvF = new FvF(rh9.A03, ek03, 0);
                Bundle bundle2 = ek03.A01;
                String string = bundle2.getString("PAYMENT_ACCOUNT_ID");
                String string2 = bundle2.getString("PAYMENT_OTC_SESSION_ID");
                String string3 = bundle2.getString("PAYMENT_OTC_TYPE");
                java.util.Map A02 = FAt.A02(bundle2);
                11T.A0F(str5, 0);
                4YV.A1M(obj5, 1, A02);
                Qmd A012 = F2R.A01(r02, A0C, f4t2, new FEq(F2P.A00(fvF, A0v), obj5, str5, string, string2, string3, (String) null, (String) null, A02, A0v));
                FH8.A02(A012);
                DSD dsd = ((FH8) A012).A03;
                LifecycleOwner lifecycleOwner3 = rh9.A01;
                if (lifecycleOwner3 == null) {
                    lifecycleOwner3 = rh9.A02;
                    lifecycleOwner3.getClass();
                }
                dsd.observe(lifecycleOwner3, new Ca7(r02, dsd, mediatorLiveData, ek03, rh9, obj5, str5, 1));
                return;
        }
    }
}
