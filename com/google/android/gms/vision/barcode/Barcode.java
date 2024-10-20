package com.google.android.gms.vision.barcode;

import X.AbstractC01153q8;
import X.JQx;
import X.JQy;
import X.LGm;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: Barcode.class */
public final class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(51);
    public int A00;
    public int A01;
    public CalendarEvent A02;
    public ContactInfo A03;
    public DriverLicense A04;
    public Email A05;
    public GeoPoint A06;
    public Phone A07;
    public Sms A08;
    public UrlBookmark A09;
    public WiFi A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public byte[] A0E;
    public Point[] A0F;

    /* loaded from: Barcode$Address.class */
    public final class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(50);
        public int A00;
        public String[] A01;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A04(parcel, 2, this.A00);
            String[] strArr = this.A01;
            if (strArr != null) {
                int A01 = AbstractC01153q8.A01(parcel, 3);
                parcel.writeStringArray(strArr);
                AbstractC01153q8.A03(parcel, A01);
            }
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    /* loaded from: Barcode$CalendarDateTime.class */
    public final class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(52);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public int A04;
        public int A05;
        public String A06;
        public boolean A07;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A04(parcel, 2, this.A05);
            AbstractC01153q8.A04(parcel, 3, this.A03);
            AbstractC01153q8.A04(parcel, 4, this.A00);
            AbstractC01153q8.A04(parcel, 5, this.A01);
            AbstractC01153q8.A04(parcel, 6, this.A02);
            AbstractC01153q8.A04(parcel, 7, this.A04);
            AbstractC01153q8.A06(parcel, 8, this.A07);
            AbstractC01153q8.A08(parcel, this.A06, 9);
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    /* loaded from: Barcode$CalendarEvent.class */
    public final class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(54);
        public CalendarDateTime A00;
        public CalendarDateTime A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A08(parcel, this.A06, 2);
            AbstractC01153q8.A08(parcel, this.A02, 3);
            AbstractC01153q8.A08(parcel, this.A03, 4);
            AbstractC01153q8.A08(parcel, this.A04, 5);
            AbstractC01153q8.A08(parcel, this.A05, 6);
            AbstractC01153q8.A07(parcel, this.A01, 7, i);
            AbstractC01153q8.A07(parcel, this.A00, 8, i);
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    /* loaded from: Barcode$ContactInfo.class */
    public final class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(53);
        public PersonName A00;
        public String A01;
        public String A02;
        public Address[] A03;
        public Email[] A04;
        public Phone[] A05;
        public String[] A06;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A07(parcel, this.A00, 2, i);
            AbstractC01153q8.A08(parcel, this.A01, 3);
            AbstractC01153q8.A08(parcel, this.A02, 4);
            AbstractC01153q8.A0C(parcel, this.A05, 5, i);
            AbstractC01153q8.A0C(parcel, this.A04, 6, i);
            String[] strArr = this.A06;
            if (strArr != null) {
                int A01 = AbstractC01153q8.A01(parcel, 7);
                parcel.writeStringArray(strArr);
                AbstractC01153q8.A03(parcel, A01);
            }
            AbstractC01153q8.A0C(parcel, this.A03, 8, i);
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    /* loaded from: Barcode$DriverLicense.class */
    public final class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(56);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;
        public String A07;
        public String A08;
        public String A09;
        public String A0A;
        public String A0B;
        public String A0C;
        public String A0D;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A08(parcel, this.A05, 2);
            AbstractC01153q8.A08(parcel, this.A07, 3);
            AbstractC01153q8.A08(parcel, this.A0D, 4);
            AbstractC01153q8.A08(parcel, this.A0B, 5);
            AbstractC01153q8.A08(parcel, this.A08, 6);
            AbstractC01153q8.A08(parcel, this.A02, 7);
            AbstractC01153q8.A08(parcel, this.A00, 8);
            AbstractC01153q8.A08(parcel, this.A01, 9);
            AbstractC01153q8.A08(parcel, this.A03, 10);
            AbstractC01153q8.A08(parcel, this.A0C, 11);
            AbstractC01153q8.A08(parcel, this.A09, 12);
            AbstractC01153q8.A08(parcel, this.A06, 13);
            AbstractC01153q8.A08(parcel, this.A04, 14);
            AbstractC01153q8.A08(parcel, this.A0A, 15);
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    /* loaded from: Barcode$Email.class */
    public final class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(55);
        public int A00;
        public String A01;
        public String A02;
        public String A03;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A04(parcel, 2, this.A00);
            AbstractC01153q8.A08(parcel, this.A01, 3);
            AbstractC01153q8.A08(parcel, this.A03, 4);
            AbstractC01153q8.A08(parcel, this.A02, 5);
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    /* loaded from: Barcode$GeoPoint.class */
    public final class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(58);
        public double A00;
        public double A01;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            double d = this.A00;
            parcel.writeInt(524290);
            parcel.writeDouble(d);
            double d2 = this.A01;
            parcel.writeInt(524291);
            parcel.writeDouble(d2);
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    /* loaded from: Barcode$PersonName.class */
    public final class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(57);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A08(parcel, this.A01, 2);
            AbstractC01153q8.A08(parcel, this.A05, 3);
            AbstractC01153q8.A08(parcel, this.A04, 4);
            AbstractC01153q8.A08(parcel, this.A00, 5);
            AbstractC01153q8.A08(parcel, this.A03, 6);
            AbstractC01153q8.A08(parcel, this.A02, 7);
            AbstractC01153q8.A08(parcel, this.A06, 8);
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    /* loaded from: Barcode$Phone.class */
    public final class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(60);
        public int A00;
        public String A01;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A04(parcel, 2, this.A00);
            JQy.A17(parcel, this.A01, A0E);
        }
    }

    /* loaded from: Barcode$Sms.class */
    public final class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(59);
        public String A00;
        public String A01;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A08(parcel, this.A00, 2);
            JQy.A17(parcel, this.A01, A0E);
        }
    }

    /* loaded from: Barcode$UrlBookmark.class */
    public final class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(62);
        public String A00;
        public String A01;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A08(parcel, this.A00, 2);
            JQy.A17(parcel, this.A01, A0E);
        }
    }

    /* loaded from: Barcode$WiFi.class */
    public final class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGm.A00(61);
        public int A00;
        public String A01;
        public String A02;

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A08(parcel, this.A02, 2);
            AbstractC01153q8.A08(parcel, this.A01, 3);
            AbstractC01153q8.A04(parcel, 4, this.A00);
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 2, this.A00);
        AbstractC01153q8.A08(parcel, this.A0C, 3);
        AbstractC01153q8.A08(parcel, this.A0B, 4);
        AbstractC01153q8.A04(parcel, 5, this.A01);
        AbstractC01153q8.A0C(parcel, this.A0F, 6, i);
        AbstractC01153q8.A07(parcel, this.A05, 7, i);
        AbstractC01153q8.A07(parcel, this.A07, 8, i);
        AbstractC01153q8.A07(parcel, this.A08, 9, i);
        AbstractC01153q8.A07(parcel, this.A0A, 10, i);
        AbstractC01153q8.A07(parcel, this.A09, 11, i);
        AbstractC01153q8.A07(parcel, this.A06, 12, i);
        AbstractC01153q8.A07(parcel, this.A02, 13, i);
        AbstractC01153q8.A07(parcel, this.A03, 14, i);
        AbstractC01153q8.A07(parcel, this.A04, 15, i);
        AbstractC01153q8.A0B(parcel, this.A0E, 16);
        AbstractC01153q8.A06(parcel, 17, this.A0D);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
