package com.facebook.phonenumbers;

import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import java.io.Serializable;

/* loaded from: Phonenumber$PhoneNumber.class */
public class Phonenumber$PhoneNumber implements Serializable {
    public static final long serialVersionUID = 1;
    public boolean hasCountryCode;
    public boolean hasCountryCodeSource;
    public boolean hasExtension;
    public boolean hasItalianLeadingZero;
    public boolean hasNationalNumber;
    public boolean hasNumberOfLeadingZeros;
    public boolean hasPreferredDomesticCarrierCode;
    public boolean hasRawInput;
    public int countryCode_ = 0;
    public long nationalNumber_ = 0;
    public String extension_ = "";
    public boolean italianLeadingZero_ = false;
    public int numberOfLeadingZeros_ = 1;
    public String rawInput_ = "";
    public String preferredDomesticCarrierCode_ = "";
    public CountryCodeSource countryCodeSource_ = CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;

    /* loaded from: Phonenumber$PhoneNumber$CountryCodeSource.class */
    public enum CountryCodeSource {
        FROM_NUMBER_WITH_PLUS_SIGN,
        FROM_NUMBER_WITH_IDD,
        FROM_NUMBER_WITHOUT_PLUS_SIGN,
        FROM_DEFAULT_COUNTRY
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (exactlySameAs((com.facebook.phonenumbers.Phonenumber$PhoneNumber) r302) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.phonenumbers.Phonenumber$PhoneNumber
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            com.facebook.phonenumbers.Phonenumber$PhoneNumber r0 = (com.facebook.phonenumbers.Phonenumber$PhoneNumber) r0
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.exactlySameAs(r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.Phonenumber$PhoneNumber.equals(java.lang.Object):boolean");
    }

    public boolean exactlySameAs(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        boolean z = false;
        if (phonenumber$PhoneNumber != null) {
            if (this == phonenumber$PhoneNumber) {
                return true;
            }
            if (this.countryCode_ == phonenumber$PhoneNumber.countryCode_ && this.nationalNumber_ == phonenumber$PhoneNumber.nationalNumber_ && this.extension_.equals(phonenumber$PhoneNumber.extension_) && this.italianLeadingZero_ == phonenumber$PhoneNumber.italianLeadingZero_ && this.numberOfLeadingZeros_ == phonenumber$PhoneNumber.numberOfLeadingZeros_ && this.rawInput_.equals(phonenumber$PhoneNumber.rawInput_) && this.countryCodeSource_ == phonenumber$PhoneNumber.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(phonenumber$PhoneNumber.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == phonenumber$PhoneNumber.hasPreferredDomesticCarrierCode) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 1231;
        int A03 = ((1BK.A03(this.countryCodeSource_, ((((((((1BK.A03(Long.valueOf(this.nationalNumber_), (2173 + this.countryCode_) * 53) * 53) + this.extension_.hashCode()) * 53) + AnonymousClass002.A00(this.italianLeadingZero_ ? 1 : 0)) * 53) + this.numberOfLeadingZeros_) * 53) + this.rawInput_.hashCode()) * 53) * 53) + this.preferredDomesticCarrierCode_.hashCode()) * 53;
        if (!this.hasPreferredDomesticCarrierCode) {
            i = 1237;
        }
        return A03 + i;
    }

    public Phonenumber$PhoneNumber mergeFrom(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (phonenumber$PhoneNumber.hasCountryCode) {
            int i = phonenumber$PhoneNumber.countryCode_;
            this.hasCountryCode = true;
            this.countryCode_ = i;
        }
        if (phonenumber$PhoneNumber.hasNationalNumber) {
            long j = phonenumber$PhoneNumber.nationalNumber_;
            this.hasNationalNumber = true;
            this.nationalNumber_ = j;
        }
        if (phonenumber$PhoneNumber.hasExtension) {
            String str = phonenumber$PhoneNumber.extension_;
            str.getClass();
            this.hasExtension = true;
            this.extension_ = str;
        }
        if (phonenumber$PhoneNumber.hasItalianLeadingZero) {
            boolean z = phonenumber$PhoneNumber.italianLeadingZero_;
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z;
        }
        if (phonenumber$PhoneNumber.hasNumberOfLeadingZeros) {
            int i2 = phonenumber$PhoneNumber.numberOfLeadingZeros_;
            this.hasNumberOfLeadingZeros = true;
            this.numberOfLeadingZeros_ = i2;
        }
        if (phonenumber$PhoneNumber.hasRawInput) {
            String str2 = phonenumber$PhoneNumber.rawInput_;
            str2.getClass();
            this.hasRawInput = true;
            this.rawInput_ = str2;
        }
        if (phonenumber$PhoneNumber.hasCountryCodeSource) {
            CountryCodeSource countryCodeSource = phonenumber$PhoneNumber.countryCodeSource_;
            countryCodeSource.getClass();
            this.hasCountryCodeSource = true;
            this.countryCodeSource_ = countryCodeSource;
        }
        if (phonenumber$PhoneNumber.hasPreferredDomesticCarrierCode) {
            String str3 = phonenumber$PhoneNumber.preferredDomesticCarrierCode_;
            str3.getClass();
            this.hasPreferredDomesticCarrierCode = true;
            this.preferredDomesticCarrierCode_ = str3;
        }
        return this;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Country Code: ");
        A0k.append(this.countryCode_);
        A0k.append(" National Number: ");
        A0k.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            A0k.append(" Leading Zero(s): true");
        }
        if (this.hasNumberOfLeadingZeros) {
            A0k.append(" Number of leading zeros: ");
            A0k.append(this.numberOfLeadingZeros_);
        }
        if (this.hasExtension) {
            A0k.append(" Extension: ");
            A0k.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            A0k.append(" Country Code Source: ");
            A0k.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            A0k.append(" Preferred Domestic Carrier Code: ");
            A0k.append(this.preferredDomesticCarrierCode_);
        }
        return A0k.toString();
    }
}
