package com.facebook.phonenumbers;

import X.0Pz;
import X.4YU;
import X.AnonymousClass001;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: PhoneNumberMatch.class */
public final class PhoneNumberMatch {
    public final Phonenumber$PhoneNumber number;
    public final String rawString;
    public final int start;

    public PhoneNumberMatch(int i, String str, Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (i < 0) {
            throw AnonymousClass001.A0L("Start index must be >= 0.");
        }
        if (str == null) {
            throw null;
        }
        this.start = i;
        this.rawString = str;
        this.number = phonenumber$PhoneNumber;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PhoneNumberMatch)) {
                return false;
            }
            PhoneNumberMatch phoneNumberMatch = (PhoneNumberMatch) obj;
            if (this.rawString.equals(phoneNumberMatch.rawString) && this.start == phoneNumberMatch.start && this.number.equals(phoneNumberMatch.number)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 4YU.A04(Integer.valueOf(this.start), this.rawString, this.number);
    }

    public String toString() {
        int i = this.start;
        String str = this.rawString;
        return 0Pz.A0x("PhoneNumberMatch [", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, ") ", str, i, i + str.length());
    }
}
