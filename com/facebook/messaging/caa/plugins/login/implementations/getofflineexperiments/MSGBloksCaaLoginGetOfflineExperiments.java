package com.facebook.messaging.caa.plugins.login.implementations.getofflineexperiments;

import X.0CU;
import X.0QD;
import X.0RC;
import X.11T;
import X.1BJ;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.7zN;
import X.AnonymousClass001;
import X.DKc;
import X.EPg;
import X.FIM;
import X.G6c;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.LogcatReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: MSGBloksCaaLoginGetOfflineExperiments.class */
public final class MSGBloksCaaLoginGetOfflineExperiments {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;

    public MSGBloksCaaLoginGetOfflineExperiments(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A01 = 1Bu.A00(100129);
        this.A00 = 7zM.A0d();
    }

    public final List A00(DKc dKc) {
        int i;
        List list = dKc.A00;
        Iterable iterable = (Iterable) list.get(0);
        Object obj = list.get(1);
        11T.A0I(obj, 1BJ.A00(0));
        boolean A1V = AnonymousClass001.A1V(obj);
        ArrayList A0s = AnonymousClass001.A0s();
        Set A0f = iterable != null ? 0QD.A0f(iterable) : null;
        EPg[] values = EPg.values();
        int length = values.length;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            EPg ePg = values[i2];
            if (A0f != null) {
                i = A0f.contains(ePg.name) ? 0 : i2 + 1;
            }
            if (A1V) {
                Date date = new Date(1Br.A00(this.A00));
                if (date.after(ePg.startDate)) {
                    if (!date.before(ePg.endDate)) {
                    }
                }
            }
            String str = ePg.name;
            11T.A0A(str);
            if (!0CU.A0T(str, "fb4a", false) || 0CU.A0T(str, "msgr", false) || 0CU.A0T(str, "m4a", false)) {
                A0s.add(ePg);
            }
        }
        if (A0s.size() > 1) {
            0RC.A0y(A0s, new G6c(10));
        }
        ArrayList A0z = 1BL.A0z(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            EPg ePg2 = (EPg) it.next();
            HashMap A0u = AnonymousClass001.A0u();
            String str2 = ePg2.name;
            11T.A0A(str2);
            A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
            A0u.put("start_date", 11T.A02(ePg2.startDate));
            A0u.put("end_date", 11T.A02(ePg2.endDate));
            A0u.put("group_size", Integer.valueOf((ePg2.groupSize * 100) / LogcatReader.DEFAULT_WAIT_TIME));
            A0u.put("current_group_index", Integer.valueOf(((FIM) 1Br.A0B(this.A01)).A07(ePg2, true)));
            HashMap A0u2 = AnonymousClass001.A0u();
            A0u2.put(7zN.A0h(), "not in experiment");
            int i3 = ePg2.groupCount;
            for (int i4 = 0; i4 < i3; i4++) {
                Integer valueOf = Integer.valueOf(i4);
                String A02 = ePg2.A02(i4);
                11T.A0A(A02);
                A0u2.put(valueOf, A02);
            }
            A0u.put("groups", A0u2);
            A0z.add(A0u);
        }
        return A0z;
    }
}
