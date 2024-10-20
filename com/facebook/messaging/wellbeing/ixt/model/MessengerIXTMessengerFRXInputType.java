package com.facebook.messaging.wellbeing.ixt.model;

import X.11T;
import X.C1pq;
import X.DJc;

/* loaded from: MessengerIXTMessengerFRXInputType.class */
public final class MessengerIXTMessengerFRXInputType implements DJc {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public MessengerIXTMessengerFRXInputType(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = str;
        C1pq.A08("entryPoint", str2);
        this.A02 = str2;
        C1pq.A08("location", str3);
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = j;
        this.A07 = str5;
        C1pq.A08("triggerEventType", str6);
        this.A05 = str6;
        C1pq.A08("triggerSessionId", str7);
        this.A06 = str7;
    }

    @Override // X.DJc
    public String AXB() {
        return "com.bloks.www.msg.ixt.triggers.messenger_frx";
    }

    @Override // X.DJc
    public String AeG() {
        return this.A01;
    }

    @Override // X.DJc
    public String B96() {
        return this.A07;
    }

    @Override // X.DJc
    public String BH9() {
        return this.A05;
    }

    @Override // X.DJc
    public String BHA() {
        return this.A06;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessengerIXTMessengerFRXInputType)) {
                return false;
            }
            MessengerIXTMessengerFRXInputType messengerIXTMessengerFRXInputType = (MessengerIXTMessengerFRXInputType) obj;
            if (!"com.bloks.www.msg.ixt.triggers.messenger_frx".equals("com.bloks.www.msg.ixt.triggers.messenger_frx") || !11T.A0O(this.A01, messengerIXTMessengerFRXInputType.A01) || !11T.A0O(this.A02, messengerIXTMessengerFRXInputType.A02) || !11T.A0O(this.A03, messengerIXTMessengerFRXInputType.A03) || !11T.A0O(this.A04, messengerIXTMessengerFRXInputType.A04) || this.A00 != messengerIXTMessengerFRXInputType.A00 || !11T.A0O(this.A07, messengerIXTMessengerFRXInputType.A07) || !11T.A0O(this.A05, messengerIXTMessengerFRXInputType.A05) || !11T.A0O(this.A06, messengerIXTMessengerFRXInputType.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A07, C1pq.A01(C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03("com.bloks.www.msg.ixt.triggers.messenger_frx"))))), this.A00))));
    }
}
