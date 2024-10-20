package com.shopify.checkout.models;

import X.11T;
import X.1BL;
import X.5Yu;
import X.7zN;
import X.AbE;
import X.AnonymousClass001;
import X.DKH;
import X.Lvw;

/* loaded from: Address.class */
public final class Address {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    /* loaded from: Address$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvw.A00;
        }
    }

    public Address() {
        this.A09 = null;
        this.A06 = null;
        this.A04 = null;
        this.A05 = null;
        this.A08 = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A0A = null;
        this.A07 = null;
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        if ((i & 1) == 0) {
            this.A09 = null;
        } else {
            this.A09 = str;
        }
        if ((i & 2) == 0) {
            this.A06 = null;
        } else {
            this.A06 = str2;
        }
        if ((i & 4) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str3;
        }
        if ((i & 8) == 0) {
            this.A05 = null;
        } else {
            this.A05 = str4;
        }
        if ((i & 16) == 0) {
            this.A08 = null;
        } else {
            this.A08 = str5;
        }
        if ((i & 32) == 0) {
            this.A00 = null;
        } else {
            this.A00 = str6;
        }
        if ((i & 64) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str7;
        }
        if ((i & 128) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str8;
        }
        if ((i & 256) == 0) {
            this.A03 = null;
        } else {
            this.A03 = str9;
        }
        if ((i & 512) == 0) {
            this.A0A = null;
        } else {
            this.A0A = str10;
        }
        if ((i & 1024) == 0) {
            this.A07 = null;
        } else {
            this.A07 = str11;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            if (!11T.A0O(this.A09, address.A09) || !11T.A0O(this.A06, address.A06) || !11T.A0O(this.A04, address.A04) || !11T.A0O(this.A05, address.A05) || !11T.A0O(this.A08, address.A08) || !11T.A0O(this.A00, address.A00) || !11T.A0O(this.A01, address.A01) || !11T.A0O(this.A02, address.A02) || !11T.A0O(this.A03, address.A03) || !11T.A0O(this.A0A, address.A0A) || !11T.A0O(this.A07, address.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((1BL.A05(this.A09) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A00)) * 31) + 1BL.A05(this.A01)) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A0A)) * 31) + 7zN.A05(this.A07);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Address(referenceId=");
        A0k.append(this.A09);
        A0k.append(", name=");
        A0k.append(this.A06);
        A0k.append(AbE.A00(98));
        A0k.append(this.A04);
        A0k.append(", lastName=");
        A0k.append(this.A05);
        A0k.append(", postalCode=");
        A0k.append(this.A08);
        A0k.append(", address1=");
        A0k.append(this.A00);
        A0k.append(", address2=");
        A0k.append(this.A01);
        A0k.append(", city=");
        A0k.append(this.A02);
        A0k.append(", countryCode=");
        A0k.append(this.A03);
        A0k.append(", zoneCode=");
        A0k.append(this.A0A);
        A0k.append(", phone=");
        return DKH.A0o(this.A07, A0k);
    }
}
