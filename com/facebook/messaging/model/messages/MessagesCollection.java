package com.facebook.messaging.model.messages;

import X.0Pz;
import X.0fH;
import X.1BL;
import X.1Du;
import X.4YU;
import X.4YV;
import X.5Q0;
import X.82M;
import X.AnonymousClass001;
import X.C1q7;
import X.C53v;
import X.C5pv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: MessagesCollection.class */
public final class MessagesCollection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(44);
    public final ThreadKey A00;
    public final ImmutableList A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public MessagesCollection(C5pv c5pv) {
        ImmutableList A03;
        ThreadKey threadKey = c5pv.A00;
        this.A00 = threadKey;
        ImmutableList immutableList = c5pv.A01;
        this.A01 = immutableList;
        this.A02 = c5pv.A03;
        this.A03 = c5pv.A04;
        this.A04 = c5pv.A05;
        if (threadKey == null) {
            0fH.A0o("MessagesCollection", "Null thread key");
        }
        if (!c5pv.A02 || (A03 = A03(immutableList)) == null) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[");
        1Du it = A03.iterator();
        while (it.hasNext()) {
            A0k.append(5Q0.A04(4YU.A0V(it)));
        }
        A0k.append("]");
        0fH.A0o("MessagesCollection", 0Pz.A0V("Thread messages were not in order, messages=", A0k));
    }

    public MessagesCollection(Parcel parcel) {
        this.A00 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        this.A01 = ImmutableList.copyOf((Collection) parcel.createTypedArrayList(Message.CREATOR));
        this.A02 = C53v.A0S(parcel);
        this.A03 = C53v.A0S(parcel);
        this.A04 = C53v.A0S(parcel);
    }

    public static C5pv A00(MessagesCollection messagesCollection) {
        C5pv c5pv = new C5pv();
        c5pv.A00 = messagesCollection.A00;
        c5pv.A01(messagesCollection.A01);
        c5pv.A03 = messagesCollection.A02;
        c5pv.A04 = messagesCollection.A03;
        c5pv.A05 = messagesCollection.A04;
        return c5pv;
    }

    public static MessagesCollection A01(Message message) {
        C5pv c5pv = new C5pv();
        c5pv.A00 = message.A0V;
        c5pv.A01(ImmutableList.of((Object) message));
        c5pv.A03 = false;
        c5pv.A05 = false;
        return new MessagesCollection(c5pv);
    }

    public static MessagesCollection A02(ThreadKey threadKey) {
        C5pv c5pv = new C5pv();
        c5pv.A00 = threadKey;
        c5pv.A01(ImmutableList.of());
        c5pv.A03 = true;
        c5pv.A05 = false;
        return new MessagesCollection(c5pv);
    }

    public static ImmutableList A03(ImmutableList immutableList) {
        int size = immutableList.size();
        ImmutableList immutableList2 = null;
        long j = Long.MAX_VALUE;
        Message message = null;
        long j2 = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            Message message2 = (Message) immutableList.get(i2);
            if (!message2.A21) {
                if (message2.A05 <= j || C1q7.A00(message2) <= j2) {
                    j = message2.A05;
                    j2 = C1q7.A00(message2);
                    message = message2;
                } else {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    Preconditions.checkNotNull(message, "moreRecentMessage cannot be null because the if condition is always false for the first loop");
                    builder.m11011add((Object) message);
                    builder.m11011add((Object) message2);
                    int i3 = i2 + 1;
                    if (i3 < size) {
                        builder.m11011add(immutableList.get(i3));
                    }
                    immutableList2 = builder.build();
                }
            }
            i = i2 + 1;
        }
        return immutableList2;
    }

    public Message A04() {
        ImmutableList immutableList = this.A01;
        if (immutableList.isEmpty()) {
            return null;
        }
        return (Message) immutableList.get(0);
    }

    public Message A05() {
        ImmutableList immutableList = this.A01;
        if (immutableList.isEmpty()) {
            return null;
        }
        return (Message) immutableList.get(immutableList.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r302 <= r301.A01.size()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06(int r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L18
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A01
            int r0 = r0.size()
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 > r1) goto L1a
        L18:
            r0 = 1
            r303 = r0
        L1a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.messages.MessagesCollection.A06(int):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MessagesCollection messagesCollection = (MessagesCollection) obj;
            if (this.A02 != messagesCollection.A02 || this.A03 != messagesCollection.A03 || this.A04 != messagesCollection.A04 || !Objects.equal(this.A00, messagesCollection.A00) || !Objects.equal(this.A01, messagesCollection.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, Boolean.valueOf(this.A02), Boolean.valueOf(this.A03), Boolean.valueOf(this.A04)});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[\n");
        ImmutableList immutableList = this.A01;
        int min = Math.min(immutableList.size(), 10) - 1;
        int i = 0;
        while (i < min) {
            4YU.A1S(5Q0.A04((Message) immutableList.get(i)), "\n", A0k);
            i++;
        }
        int min2 = Math.min(immutableList.size(), 50) - 1;
        while (i < min2) {
            Message message = (Message) immutableList.get(i);
            String str = message.A1V;
            long j = message.A05;
            StringBuilder A0n = AnonymousClass001.A0n(str);
            A0n.append(" ");
            A0n.append(j);
            A0k.append(AnonymousClass001.A0d("\n", A0n));
            i++;
        }
        if ((immutableList.size() - i) - 1 > 0) {
            A0k.append(0Pz.A0D((immutableList.size() - i) - 1, " more...\n"));
        }
        if (!immutableList.isEmpty()) {
            4YU.A1S(5Q0.A04((Message) immutableList.get(immutableList.size() - 1)), "\n", A0k);
        }
        A0k.append("]");
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("threadKey", this.A00);
        stringHelper.add("includesFirstMessageInThread", this.A02);
        stringHelper.add("includesLastMessageInThread", this.A03);
        stringHelper.add("numberOfMessages", immutableList.size());
        return 4YV.A0s(stringHelper, A0k.toString(), "messages");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeTypedList(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
