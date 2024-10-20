package com.facebook.messaging.business.inboxads.common;

import X.11T;
import X.1BL;
import X.1Du;
import X.1Kh;
import X.82M;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.EnumC08694nm;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InboxAdsData.class */
public final class InboxAdsData implements Parcelable {
    public static volatile Uri A0L;
    public static volatile Uri A0M;
    public static volatile Uri A0N;
    public static volatile Uri A0O;
    public static volatile Uri A0P;
    public static volatile InboxAdsImage A0Q;
    public static volatile User A0R;
    public static volatile ImmutableList A0S;
    public static volatile ImmutableList A0T;
    public static volatile ImmutableList A0U;
    public static final Parcelable.Creator CREATOR = new 82M(17);
    public final Uri A00;
    public final Uri A01;
    public final Uri A02;
    public final Uri A03;
    public final Uri A04;
    public final InboxAdsImage A05;
    public final User A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final Set A0K;

    public InboxAdsData(Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, InboxAdsImage inboxAdsImage, User user, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, String str5, String str6, Set set) {
        this.A00 = uri;
        this.A01 = uri2;
        this.A02 = uri3;
        C1pq.A08("adId", str);
        this.A0E = str;
        this.A07 = immutableList;
        this.A03 = uri4;
        this.A04 = uri5;
        this.A08 = immutableList2;
        C1pq.A08("clientToken", str2);
        this.A0F = str2;
        C1pq.A08("description", str3);
        this.A0G = str3;
        C1pq.A08("isBusinessActive", bool);
        this.A0A = bool;
        C1pq.A08("isDefaultWelcomeMessage", bool2);
        this.A0B = bool2;
        C1pq.A08("isEligibleForHybridPostClick", bool3);
        this.A0C = bool3;
        this.A06 = user;
        C1pq.A08("postclickSocialContext", str4);
        this.A0H = str4;
        this.A09 = immutableList3;
        C1pq.A08("shouldShowGetStarted", bool4);
        this.A0D = bool4;
        this.A05 = inboxAdsImage;
        C1pq.A08("title", str5);
        this.A0I = str5;
        C1pq.A08("welcomeMessage", str6);
        this.A0J = str6;
        this.A0K = Collections.unmodifiableSet(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxAdsData(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        InboxAdsImage inboxAdsImage = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (Uri) parcel.readParcelable(classLoader);
        }
        this.A0E = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            int readInt = parcel.readInt();
            InboxAdsMediaInfo[] inboxAdsMediaInfoArr = new InboxAdsMediaInfo[readInt];
            for (int i = 0; i < readInt; i++) {
                inboxAdsMediaInfoArr[i] = parcel.readParcelable(classLoader);
            }
            this.A07 = ImmutableList.copyOf(inboxAdsMediaInfoArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            int readInt2 = parcel.readInt();
            EnumC08694nm[] enumC08694nmArr = new EnumC08694nm[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                enumC08694nmArr[i2] = EnumC08694nm.values()[parcel.readInt()];
            }
            this.A08 = ImmutableList.copyOf(enumC08694nmArr);
        }
        this.A0F = parcel.readString();
        this.A0G = parcel.readString();
        boolean z = true;
        this.A0A = Boolean.valueOf(parcel.readInt() == 1);
        this.A0B = Boolean.valueOf(parcel.readInt() == 1);
        this.A0C = Boolean.valueOf(parcel.readInt() == 1);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (User) parcel.readParcelable(classLoader);
        }
        this.A0H = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            int readInt3 = parcel.readInt();
            InboxAdsQuickReply[] inboxAdsQuickReplyArr = new InboxAdsQuickReply[readInt3];
            for (int i3 = 0; i3 < readInt3; i3++) {
                inboxAdsQuickReplyArr[i3] = parcel.readParcelable(classLoader);
            }
            this.A09 = ImmutableList.copyOf(inboxAdsQuickReplyArr);
        }
        this.A0D = Boolean.valueOf(parcel.readInt() != 1 ? false : z);
        this.A05 = parcel.readInt() != 0 ? (InboxAdsImage) parcel.readParcelable(classLoader) : inboxAdsImage;
        this.A0I = parcel.readString();
        this.A0J = parcel.readString();
        HashSet hashSet = new HashSet();
        int readInt4 = parcel.readInt();
        for (int i4 = 0; i4 < readInt4; i4++) {
            hashSet.add(parcel.readString());
        }
        this.A0K = Collections.unmodifiableSet(hashSet);
    }

    private Uri A01() {
        if (this.A0K.contains("adHideUri")) {
            return this.A01;
        }
        if (A0M == null) {
            synchronized (this) {
                if (A0M == null) {
                    A0M = Uri.EMPTY;
                }
            }
        }
        return A0M;
    }

    private Uri A04() {
        if (this.A0K.contains("adReportUri")) {
            return this.A04;
        }
        if (A0P == null) {
            synchronized (this) {
                if (A0P == null) {
                    A0P = Uri.EMPTY;
                }
            }
        }
        return A0P;
    }

    public Uri A00() {
        if (this.A0K.contains("adHelpUri")) {
            return this.A00;
        }
        if (A0L == null) {
            synchronized (this) {
                if (A0L == null) {
                    A0L = Uri.EMPTY;
                }
            }
        }
        return A0L;
    }

    public Uri A02() {
        if (this.A0K.contains("adIconUri")) {
            return this.A02;
        }
        if (A0N == null) {
            synchronized (this) {
                if (A0N == null) {
                    A0N = Uri.EMPTY;
                }
            }
        }
        return A0N;
    }

    public Uri A03() {
        if (this.A0K.contains("adPreferenceUri")) {
            return this.A03;
        }
        if (A0O == null) {
            synchronized (this) {
                if (A0O == null) {
                    A0O = Uri.EMPTY;
                }
            }
        }
        return A0O;
    }

    public InboxAdsImage A05() {
        if (this.A0K.contains("thumbnailImage")) {
            return this.A05;
        }
        if (A0Q == null) {
            synchronized (this) {
                if (A0Q == null) {
                    A0Q = new InboxAdsImage(null, AnonymousClass001.A0v(), 0, 0);
                }
            }
        }
        return A0Q;
    }

    public User A06() {
        if (this.A0K.contains("page")) {
            return this.A06;
        }
        if (A0R == null) {
            synchronized (this) {
                if (A0R == null) {
                    1Kh r0 = new 1Kh();
                    r0.A05(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL);
                    A0R = new User(r0);
                }
            }
        }
        return A0R;
    }

    public ImmutableList A07() {
        if (this.A0K.contains("adMediaInfos")) {
            return this.A07;
        }
        if (A0S == null) {
            synchronized (this) {
                if (A0S == null) {
                    A0S = ImmutableList.of();
                }
            }
        }
        return A0S;
    }

    public ImmutableList A08() {
        if (this.A0K.contains("adTypes")) {
            return this.A08;
        }
        if (A0T == null) {
            synchronized (this) {
                if (A0T == null) {
                    A0T = ImmutableList.of();
                }
            }
        }
        return A0T;
    }

    public ImmutableList A09() {
        if (this.A0K.contains("quickReplies")) {
            return this.A09;
        }
        if (A0U == null) {
            synchronized (this) {
                if (A0U == null) {
                    A0U = ImmutableList.of();
                }
            }
        }
        return A0U;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InboxAdsData)) {
                return false;
            }
            InboxAdsData inboxAdsData = (InboxAdsData) obj;
            if (!11T.A0O(A00(), inboxAdsData.A00()) || !11T.A0O(A01(), inboxAdsData.A01()) || !11T.A0O(A02(), inboxAdsData.A02()) || !11T.A0O(this.A0E, inboxAdsData.A0E) || !11T.A0O(A07(), inboxAdsData.A07()) || !11T.A0O(A03(), inboxAdsData.A03()) || !11T.A0O(A04(), inboxAdsData.A04()) || !11T.A0O(A08(), inboxAdsData.A08()) || !11T.A0O(this.A0F, inboxAdsData.A0F) || !11T.A0O(this.A0G, inboxAdsData.A0G) || !11T.A0O(this.A0A, inboxAdsData.A0A) || !11T.A0O(this.A0B, inboxAdsData.A0B) || !11T.A0O(this.A0C, inboxAdsData.A0C) || !11T.A0O(A06(), inboxAdsData.A06()) || !11T.A0O(this.A0H, inboxAdsData.A0H) || !11T.A0O(A09(), inboxAdsData.A09()) || !11T.A0O(this.A0D, inboxAdsData.A0D) || !11T.A0O(A05(), inboxAdsData.A05()) || !11T.A0O(this.A0I, inboxAdsData.A0I) || !11T.A0O(this.A0J, inboxAdsData.A0J)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A04(A05(), C1pq.A04(this.A0D, C1pq.A04(A09(), C1pq.A04(this.A0H, C1pq.A04(A06(), C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A04(A08(), C1pq.A04(A04(), C1pq.A04(A03(), C1pq.A04(A07(), C1pq.A04(this.A0E, C1pq.A04(A02(), C1pq.A04(A01(), C1pq.A03(A00()))))))))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeString(this.A0E);
        ImmutableList immutableList = this.A07;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                parcel.writeParcelable((InboxAdsMediaInfo) A0b.next(), i);
            }
        }
        C3o5.A0d(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A04, i);
        ImmutableList immutableList2 = this.A08;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList2);
            while (A0b2.hasNext()) {
                parcel.writeInt(((EnumC08694nm) A0b2.next()).ordinal());
            }
        }
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0A.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A0B.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A0C.booleanValue() ? 1 : 0);
        C3o5.A0d(parcel, this.A06, i);
        parcel.writeString(this.A0H);
        ImmutableList immutableList3 = this.A09;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b3 = 1BL.A0b(parcel, immutableList3);
            while (A0b3.hasNext()) {
                parcel.writeParcelable((InboxAdsQuickReply) A0b3.next(), i);
            }
        }
        parcel.writeInt(this.A0D.booleanValue() ? 1 : 0);
        C3o5.A0d(parcel, this.A05, i);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        Iterator A0S2 = C3o5.A0S(parcel, this.A0K);
        while (A0S2.hasNext()) {
            C3o5.A0h(parcel, A0S2);
        }
    }
}
