package com.facebook.messaging.model.threads;

import X.11T;
import X.1BL;
import X.21A;
import X.21E;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C2xc;
import X.C53v;
import X.C6jR;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.communitymessaging.model.MessengerJoinRequestApprovalSetting;
import com.facebook.workshared.syncedgroups.model.WorkSyncGroupModelData;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: GroupThreadData.class */
public final class GroupThreadData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(29);
    public final long A00;
    public final long A01;
    public final long A02;
    public final MessengerJoinRequestApprovalSetting A03;
    public final GroupThreadAssociatedObject A04;
    public final 21E A05;
    public final JoinableInfo A06;
    public final SyncedGroupData A07;
    public final WorkSyncGroupModelData A08;
    public final ImmutableList A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public GroupThreadData(21A r302) {
        this.A0A = r302.A0A;
        this.A04 = r302.A04;
        this.A0G = r302.A0D;
        this.A01 = r302.A01;
        this.A06 = r302.A06;
        this.A0B = r302.A0C;
        this.A0D = r302.A0E;
        this.A02 = r302.A02;
        this.A0E = r302.A0F;
        this.A05 = r302.A05;
        this.A03 = r302.A03;
        this.A07 = r302.A07;
        this.A08 = r302.A08;
        this.A0H = r302.A0H;
        this.A0F = r302.A0G;
        this.A00 = r302.A00;
        this.A09 = r302.A09;
        this.A0C = r302.A0B;
    }

    public GroupThreadData(Parcel parcel) {
        ImmutableList copyOf;
        this.A0A = parcel.readString();
        this.A04 = (GroupThreadAssociatedObject) parcel.readParcelable(GroupThreadAssociatedObject.class.getClassLoader());
        this.A0G = C53v.A0S(parcel);
        this.A01 = parcel.readLong();
        Parcelable readParcelable = parcel.readParcelable(JoinableInfo.class.getClassLoader());
        if (readParcelable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A06 = (JoinableInfo) readParcelable;
        this.A0B = parcel.readString();
        this.A0D = C53v.A0S(parcel);
        this.A02 = parcel.readLong();
        this.A0E = C53v.A0S(parcel);
        21E A07 = C53v.A07(parcel, 21E.class);
        if (A07 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A05 = A07;
        MessengerJoinRequestApprovalSetting messengerJoinRequestApprovalSetting = (MessengerJoinRequestApprovalSetting) C53v.A07(parcel, MessengerJoinRequestApprovalSetting.class);
        this.A03 = messengerJoinRequestApprovalSetting == null ? MessengerJoinRequestApprovalSetting.A04 : messengerJoinRequestApprovalSetting;
        this.A07 = (SyncedGroupData) parcel.readParcelable(SyncedGroupData.class.getClassLoader());
        this.A08 = (WorkSyncGroupModelData) parcel.readParcelable(WorkSyncGroupModelData.class.getClassLoader());
        this.A0H = C53v.A0S(parcel);
        this.A0F = C53v.A0S(parcel);
        this.A00 = parcel.readLong();
        this.A0C = parcel.readString();
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        ClassLoader classLoader = List.class.getClassLoader();
        if (i >= 33) {
            parcel.readList(arrayList, classLoader, Serializable.class);
        } else {
            parcel.readList(arrayList, classLoader);
        }
        if (arrayList.isEmpty()) {
            copyOf = null;
        } else {
            ArrayList A0z = 1BL.A0z(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                11T.A0I(next, AnonymousClass000.A00(0));
                A0z.add(next);
            }
            copyOf = ImmutableList.copyOf((Collection) A0z);
        }
        this.A09 = copyOf;
    }

    public GroupThreadData(MessengerJoinRequestApprovalSetting messengerJoinRequestApprovalSetting, GroupThreadAssociatedObject groupThreadAssociatedObject, 21E r304, JoinableInfo joinableInfo, SyncedGroupData syncedGroupData, WorkSyncGroupModelData workSyncGroupModelData, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        this.A0A = str;
        this.A04 = groupThreadAssociatedObject;
        this.A0G = z;
        this.A01 = j;
        this.A06 = joinableInfo;
        this.A0B = str2;
        this.A0D = z2;
        this.A02 = 0L;
        this.A0E = z3;
        this.A05 = r304;
        this.A03 = messengerJoinRequestApprovalSetting;
        this.A07 = syncedGroupData;
        this.A08 = workSyncGroupModelData;
        this.A0H = false;
        this.A0F = false;
        this.A00 = 0L;
        this.A09 = null;
        this.A0C = null;
    }

    public final C6jR A00() {
        String str = this.A0B;
        return ("GROUP".equalsIgnoreCase(str) || !"CHAT_V2".equalsIgnoreCase(str)) ? C6jR.A03 : C6jR.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r0.A00 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.model.threads.GroupThreadAssociatedObject r0 = r0.A04
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2a
            X.3pL r0 = X.EnumC00873pL.A03
            r303 = r0
            r0 = r302
            java.lang.String r0 = r0.A02
            X.3pL r0 = X.3pM.A00(r0)
            r304 = r0
            X.3pL r0 = X.EnumC00873pL.A03
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L2a
            r0 = r302
            com.facebook.messaging.model.threads.GroupThreadAssociatedFbGroup r0 = r0.A00
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L2f
        L2a:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L2f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threads.GroupThreadData.A01():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
                return false;
            }
            GroupThreadData groupThreadData = (GroupThreadData) obj;
            if (this.A0G != groupThreadData.A0G || this.A01 != groupThreadData.A01 || !11T.A0O(this.A0A, groupThreadData.A0A) || !11T.A0O(this.A04, groupThreadData.A04) || !11T.A0O(this.A06, groupThreadData.A06) || !11T.A0O(this.A0B, groupThreadData.A0B) || this.A0D != groupThreadData.A0D || this.A02 != groupThreadData.A02 || this.A0E != groupThreadData.A0E || this.A05 != groupThreadData.A05 || this.A03 != groupThreadData.A03 || !11T.A0O(this.A08, groupThreadData.A08) || this.A0H != groupThreadData.A0H || this.A0F != groupThreadData.A0F || this.A00 != groupThreadData.A00 || !11T.A0O(this.A09, groupThreadData.A09) || !11T.A0O(this.A0C, groupThreadData.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A0G), this.A0A, this.A04, this.A06, Long.valueOf(this.A01), this.A0B, Boolean.valueOf(this.A0D), Long.valueOf(this.A02), Boolean.valueOf(this.A0E), this.A05, this.A03, this.A08, Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0F), Long.valueOf(this.A00), this.A09, this.A0C});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeLong(this.A01);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A0E ? 1 : 0);
        C53v.A0J(parcel, this.A05);
        C53v.A0J(parcel, this.A03);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A0C);
        parcel.writeList(this.A09);
    }
}
