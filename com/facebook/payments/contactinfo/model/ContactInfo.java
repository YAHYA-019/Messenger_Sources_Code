package com.facebook.payments.contactinfo.model;

import android.os.Parcelable;
import com.google.common.base.Optional;

/* loaded from: ContactInfo.class */
public interface ContactInfo extends Parcelable {
    static String A00(Optional optional) {
        return ((ContactInfo) optional.get()).getId();
    }

    ContactInfoType Ae2();

    String Ahz();

    boolean BRe();

    String getId();
}
