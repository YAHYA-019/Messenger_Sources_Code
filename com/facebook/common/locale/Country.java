package com.facebook.common.locale;

import X.0Pz;
import X.0Q8;
import X.DKf;
import X.DM5;
import android.os.Parcelable;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutionException;

/* loaded from: Country.class */
public final class Country extends LocaleMember {
    public static final DM5 A02 = new DM5(0);
    public static final Country A01 = A00(null, "US");
    public static final Country A00 = A00(null, "IN");
    public static final Parcelable.Creator CREATOR = DKf.A00(96);

    public static Country A00(Country country, String str) {
        IllegalArgumentException A05;
        LocaleMember localeMember;
        try {
            DM5 dm5 = A02;
            if (str != null) {
                int length = str.length();
                if (length == 2) {
                    try {
                        Object obj = dm5.A01.get(str);
                        obj.getClass();
                        localeMember = (LocaleMember) obj;
                    } catch (ExecutionException e) {
                        Throwables.propagate(e);
                        A05 = 0Q8.createAndThrow();
                    }
                } else if (length == 3) {
                    Object obj2 = dm5.A00.get();
                    obj2.getClass();
                    localeMember = (LocaleMember) ((ImmutableMap) obj2).get(str);
                    if (localeMember == null) {
                        A05 = 0Pz.A05("Not a legal code: ", str);
                        throw A05;
                    }
                }
                return (Country) localeMember;
            }
            A05 = 0Pz.A05("Not a legal code: ", str);
            throw A05;
        } catch (IllegalArgumentException e2) {
            if (country != null) {
                return country;
            }
            throw e2;
        }
    }
}
