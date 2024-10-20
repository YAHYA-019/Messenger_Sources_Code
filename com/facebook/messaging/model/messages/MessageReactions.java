package com.facebook.messaging.model.messages;

import X.0Px;
import X.1Du;
import X.1Mu;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import java.util.Arrays;

/* loaded from: MessageReactions.class */
public final class MessageReactions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(42);
    public final ImmutableMultimap A00;
    public final ImmutableMultimap A01;

    public MessageReactions(1Mu r302) {
        this.A00 = ImmutableListMultimap.A02(r302);
        this.A01 = A00();
    }

    public MessageReactions(Parcel parcel) {
        HashMultimap hashMultimap = new HashMultimap();
        C53v.A0E(parcel, hashMultimap);
        this.A00 = ImmutableListMultimap.A02(hashMultimap);
        this.A01 = A00();
    }

    private ImmutableListMultimap A00() {
        HashMultimap hashMultimap = new HashMultimap();
        ImmutableMultimap immutableMultimap = this.A00;
        1Du it = immutableMultimap.A0I().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            1Du it2 = immutableMultimap.AUg(next).iterator();
            while (it2.hasNext()) {
                hashMultimap.CZw(next, ((ReactionMetaData) it2.next()).A00);
            }
        }
        return ImmutableListMultimap.A02(hashMultimap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageReactions) {
            return 0Px.A00(((MessageReactions) obj).A00, this.A00);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0G(parcel, this.A00);
    }
}
