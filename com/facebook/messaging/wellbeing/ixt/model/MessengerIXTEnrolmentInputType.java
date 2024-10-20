package com.facebook.messaging.wellbeing.ixt.model;

import X.0Q8;
import X.11T;
import X.AbE;
import X.AnonymousClass002;
import X.C1pq;
import X.DJc;

/* loaded from: MessengerIXTEnrolmentInputType.class */
public final class MessengerIXTEnrolmentInputType implements DJc {
    public final String A00;
    public final String A01;
    public final String A02;

    public MessengerIXTEnrolmentInputType(String str, String str2, String str3) {
        C1pq.A08("enrollmentId", str);
        this.A00 = str;
        C1pq.A08(AbE.A00(94), str2);
        this.A01 = str2;
        C1pq.A08(AbE.A00(95), str3);
        this.A02 = str3;
    }

    @Override // X.DJc
    public String AXB() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.DJc
    public String AeG() {
        return null;
    }

    @Override // X.DJc
    public String B96() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.DJc
    public String BH9() {
        return this.A01;
    }

    @Override // X.DJc
    public String BHA() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessengerIXTEnrolmentInputType)) {
                return false;
            }
            MessengerIXTEnrolmentInputType messengerIXTEnrolmentInputType = (MessengerIXTEnrolmentInputType) obj;
            if (!"com.bloks.www.msg.ixt.triggers.enrolment".equals("com.bloks.www.msg.ixt.triggers.enrolment") || !11T.A0O(this.A00, messengerIXTEnrolmentInputType.A00) || !"".equals("") || !11T.A0O(this.A01, messengerIXTEnrolmentInputType.A01) || !11T.A0O(this.A02, messengerIXTEnrolmentInputType.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, AnonymousClass002.A05("", C1pq.A04(this.A00, C1pq.A03("com.bloks.www.msg.ixt.triggers.enrolment") * 31) * 31)));
    }
}
