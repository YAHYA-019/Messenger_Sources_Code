package com.facebook.inspiration.model;

import X.11T;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.audience.model.interfaces.DirectShareAudience;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.ipc.composer.model.ComposerPageTargetData;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PendingStoryShortcutAudience.class */
public final class PendingStoryShortcutAudience implements Parcelable {
    public static volatile DirectShareAudience A04;
    public static final Parcelable.Creator CREATOR = FKf.A01(89);
    public final ViewerContext A00;
    public final ComposerPageTargetData A01;
    public final DirectShareAudience A02;
    public final Set A03;

    public PendingStoryShortcutAudience(Parcel parcel) {
        ViewerContext viewerContext = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = (DirectShareAudience) DirectShareAudience.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (ComposerPageTargetData) ComposerPageTargetData.CREATOR.createFromParcel(parcel);
        }
        this.A00 = parcel.readInt() != 0 ? (ViewerContext) ViewerContext.CREATOR.createFromParcel(parcel) : viewerContext;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public PendingStoryShortcutAudience(DirectShareAudience directShareAudience, ViewerContext viewerContext, ComposerPageTargetData composerPageTargetData, Set set) {
        this.A02 = directShareAudience;
        this.A01 = composerPageTargetData;
        this.A00 = viewerContext;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public DirectShareAudience A00() {
        if (this.A03.contains(AnonymousClass000.A00(95))) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = new DirectShareAudience(null, null, null, "", false);
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PendingStoryShortcutAudience)) {
                return false;
            }
            PendingStoryShortcutAudience pendingStoryShortcutAudience = (PendingStoryShortcutAudience) obj;
            if (!11T.A0O(A00(), pendingStoryShortcutAudience.A00()) || !11T.A0O(this.A01, pendingStoryShortcutAudience.A01) || !11T.A0O(this.A00, pendingStoryShortcutAudience.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A03(A00())));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DirectShareAudience directShareAudience = this.A02;
        if (directShareAudience == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            directShareAudience.writeToParcel(parcel, i);
        }
        ComposerPageTargetData composerPageTargetData = this.A01;
        if (composerPageTargetData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerPageTargetData.writeToParcel(parcel, i);
        }
        ViewerContext viewerContext = this.A00;
        if (viewerContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            viewerContext.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
