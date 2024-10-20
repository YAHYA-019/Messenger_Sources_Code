package com.facebook.contacts.protocol.push;

import X.1Du;
import X.1Js;
import X.4YU;
import X.AnonymousClass001;
import X.C1r4;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.graphql.Contact;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: ContactsMessengerUserMap.class */
public final class ContactsMessengerUserMap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(40);
    public final ImmutableMap A00;

    public ContactsMessengerUserMap(Parcel parcel) {
        this.A00 = ImmutableMap.copyOf((Map) parcel.readHashMap(ContactsMessengerUserMap.class.getClassLoader()));
    }

    public ContactsMessengerUserMap(List list) {
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Contact contact = (Contact) it.next();
            if (C1r4.A03.contains(contact.mContactProfileType)) {
                A0u.put(new UserKey(1Js.A03, contact.mProfileFbid), Boolean.valueOf(contact.mIsMessengerUser));
            }
        }
        this.A00 = ImmutableMap.copyOf((Map) A0u);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        1Du A0i = 4YU.A0i(this.A00);
        while (A0i.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0i);
            A0k.append(A0z.getKey());
            A0k.append("->");
            A0k.append(A0z.getValue() != null ? A0z.getValue() : "null");
            A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        return A0k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }
}
