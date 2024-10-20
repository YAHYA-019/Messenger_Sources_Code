package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: A7h.class */
public final class A7h implements 1Vf {
    public static final RequestPermissionsConfig A08;
    public static final String[] A09 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public boolean A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final ThreadKey A05;
    public final String A06;
    public final String A07;

    static {
        C5iw c5iw = new C5iw();
        c5iw.A00("Turn on location access for better results");
        c5iw.A00 = 2;
        c5iw.A06 = true;
        A08 = new RequestPermissionsConfig(c5iw);
    }

    public A7h(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A05 = threadKey;
        this.A06 = 4YU.A0y(threadKey);
        this.A07 = threadKey.A1K() ? "ONE_TO_ONE" : "GROUP";
        this.A04 = 1Bu.A00(68917);
        this.A03 = 1Lm.A00(context, fbUserSession, 68739);
    }

    public static final void A00(8L1 r301, A7h a7h) {
        Object value;
        LinkedHashMap A06;
        if (a7h.A00) {
            2aK.A03((Integer) null, 2Zo.A00(), AJi.A03(r301, a7h, null, 35), 7zN.A0y(), 2);
            9Q1 r0 = (9Q1) 1Br.A0B(a7h.A03);
            ThreadKey threadKey = a7h.A05;
            A9V a9v = A9V.A00;
            0Xs r02 = r0.A00;
            do {
                value = r02.getValue();
                A06 = 04R.A06((java.util.Map) value);
                A06.put(threadKey, a9v);
            } while (!r02.AGt(value, A06));
        }
    }

    public static final void A01(A7h a7h, String str) {
        if (a7h.A00) {
            8Lq r0 = new 8Lq(str, a7h.A06, a7h.A07);
            2aK.A03((Integer) null, 2Zo.A00(), AJi.A03(r0, a7h, null, 37), 7zN.A0y(), 2);
        }
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        8Nj r0;
        String str2;
        boolean A1X = 1BL.A1X(r302, str);
        int hashCode = str.hashCode();
        if (hashCode != -1834325531) {
            if (hashCode != -1440551537) {
                if (hashCode == -1244351819 && str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadIntentTriggered")) {
                    if (this.A00) {
                        Object obj = ((java.util.Map) ((9Q1) 1Br.A0B(this.A03)).A01.getValue()).get(this.A05);
                        if (!(obj instanceof 8Nj) || (r0 = (8Nj) obj) == null || (str2 = r0.A01) == null) {
                            return;
                        }
                        boolean equals = str2.equals("PICK_A_PLACE");
                        8L1 r02 = new 8L1(str2, this.A06, this.A07, 0);
                        if (!equals) {
                            A00(r02, this);
                            return;
                        } else {
                            Context context = this.A01;
                            ((53S) 1Bu.A06(context, 49478)).A00(context).AHQ(A08, new BHq(r02, this, A1X ? 1 : 0), A09);
                            return;
                        }
                    }
                    return;
                }
            } else if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
                7zU.A0M((5Vk) 1Bu.A06(this.A01, 82763), this.A05).A03(new 9uN(this, A1X ? 1 : 0));
                return;
            }
        } else if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered")) {
            OnNewMessagesRendered onNewMessagesRendered = (OnNewMessagesRendered) r302;
            11T.A0F(onNewMessagesRendered, 0);
            List list = onNewMessagesRendered.A00;
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj2 : list) {
                11T.A0F((C5fv) obj2, 0);
                if (!C5ul.A01(r0)) {
                    A0s.add(obj2);
                }
            }
            Iterator it = A0s.iterator();
            Object obj3 = null;
            if (it.hasNext()) {
                obj3 = it.next();
                if (it.hasNext()) {
                    long j = ((C5fu) ((C5fv) obj3)).A02;
                    do {
                        Object next = it.next();
                        long j2 = ((C5fu) ((C5fv) next)).A02;
                        if (j < j2) {
                            obj3 = next;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
            }
            C5fv c5fv = (C5fv) obj3;
            if (c5fv != null) {
                A01(this, ((C5fu) c5fv).A09);
                return;
            }
            return;
        }
        throw 4YV.A0f(str);
    }
}
