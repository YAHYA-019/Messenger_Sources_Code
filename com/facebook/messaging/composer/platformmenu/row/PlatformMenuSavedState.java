package com.facebook.messaging.composer.platformmenu.row;

import X.11T;
import X.1BL;
import X.7zL;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* loaded from: PlatformMenuSavedState.class */
public final class PlatformMenuSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(19);
    public final ThreadKey A00;
    public final Stack A01;
    public final boolean A02;

    public PlatformMenuSavedState(ThreadKey threadKey, Stack stack, boolean z) {
        1BL.A1F(stack, threadKey);
        this.A01 = stack;
        this.A00 = threadKey;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Stack stack = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            11T.A0A(pop);
            A0s.add(new PlatformMenuRowList((List) pop));
        }
        parcel.writeTypedList(A0s);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
