package com.facebook.contacts.upload.messenger;

import X.0fH;
import X.1BK;
import X.1Bi;
import X.1Du;
import X.AbI;
import X.C0dp;
import X.CMX;
import X.RDw;
import X.RNU;
import X.ROo;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.List;

/* loaded from: MessengerContactUploadHelper.class */
public final class MessengerContactUploadHelper {
    public final C0dp A00;
    public final CMX A01;
    public final PhoneNumberUtil A02;

    public MessengerContactUploadHelper() {
        C0dp A0B = AbI.A0B();
        CMX cmx = (CMX) 1Bi.A03(84837);
        PhoneNumberUtil phoneNumberUtil = (PhoneNumberUtil) 1Bi.A03(100133);
        this.A00 = A0B;
        this.A01 = cmx;
        this.A02 = phoneNumberUtil;
    }

    public static ImmutableList A00(ImmutableList immutableList) {
        String str;
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            RNU rnu = (RNU) it.next();
            int intValue = rnu.A02.intValue();
            if (intValue == 0 || intValue == 3 || intValue == 1) {
                Integer num = rnu.A01;
                int intValue2 = num.intValue();
                if (intValue2 == 0 || intValue2 == 1) {
                    builder.m11011add((Object) rnu);
                } else {
                    String obj = rnu.toString();
                    switch (num.intValue()) {
                        case 1:
                            str = "MEDIUM";
                            break;
                        case 2:
                            str = "LOW";
                            break;
                        case 3:
                            str = "VERY_LOW";
                            break;
                        case 4:
                            str = "NONE";
                            break;
                        default:
                            str = "HIGH";
                            break;
                    }
                    0fH.A0f(obj, str, "com.facebook.contacts.upload.messenger.MessengerContactUploadHelper", "Not including contact %s, confidence %s too low.");
                }
            }
        }
        return builder.build();
    }

    public static ImmutableMap A01(ImmutableList immutableList) {
        ImmutableMap.Builder A0c = 1BK.A0c();
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                ROo rOo = (ROo) it.next();
                ImmutableList.Builder builder = ImmutableList.builder();
                List list = rOo.A08;
                if (list != null) {
                    1Du it2 = ImmutableList.copyOf((Collection) list).iterator();
                    while (it2.hasNext()) {
                        builder.m11011add((Object) ((RDw) it2.next()).A00);
                    }
                }
                A0c.put(rOo.A06, builder.build());
            }
        }
        return A0c.build();
    }
}
