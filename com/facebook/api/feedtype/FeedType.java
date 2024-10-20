package com.facebook.api.feedtype;

import X.0S2;
import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.C23u;
import X.FJ8;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: FeedType.class */
public final class FeedType implements Parcelable {
    public static final FeedType A03;
    public static final FeedType A04;
    public static final FeedType A05;
    public static final FeedType A06;
    public static final FeedType A07;
    public static final FeedType A08;
    public static final FeedType A09;
    public static final FeedType A0A;
    public static final FeedType A0B;
    public static final FeedType A0C;
    public static final FeedType A0D;
    public static final FeedType A0E;
    public static final FeedType A0F;
    public static final FeedType A0G;
    public static final FeedType A0H;
    public static final FeedType A0I;
    public static final FeedType A0J;
    public static final FeedType A0K;
    public static final FeedType A0L;
    public static final FeedType A0M;
    public static final FeedType A0N;
    public static final FeedType A0O;
    public static final FeedType A0P;
    public static final FeedType A0Q;
    public static final FeedType A0R;
    public static final FeedType A0S;
    public static final FeedType A0T;
    public static final FeedType A0U;
    public static final FeedType A0V;
    public static final FeedType A0W;
    public static final FeedType A0X;
    public static final FeedType A0Y;
    public static final FeedType A0Z;
    public static final FeedType A0a;
    public static final FeedType A0b;
    public static final FeedType A0c;
    public static final FeedType A0d;
    public static final FeedType A0e;
    public static final Parcelable.Creator CREATOR;
    public final Object A00;
    public final Name A01;
    public final String A02;

    /* loaded from: FeedType$Name.class */
    public final class Name implements Parcelable {
        public static final Name A02;
        public static final Name A03;
        public static final Name A04;
        public static final Name A05;
        public static final Name A06;
        public static final Name A07;
        public static final Name A08;
        public static final Name A09;
        public static final Name A0A;
        public static final Name A0B;
        public static final Name A0C;
        public static final Name A0D;
        public static final Name A0E;
        public static final Name A0F;
        public static final Name A0G;
        public static final Name A0H;
        public static final Name A0I;
        public static final Name A0J;
        public static final Name A0K;
        public static final Name A0L;
        public static final Name A0M;
        public static final Name A0N;
        public static final Name A0O;
        public static final Name A0P;
        public static final Name A0Q;
        public static final Parcelable.Creator CREATOR;
        public final Integer A00;
        public final String A01;

        static {
            Integer num = 0S2.A00;
            A0P = new Name("watch_tab_feed", num);
            A0G = new Name("fb_shorts_tab", num);
            A0O = new Name("warion_feed", num);
            A0Q = new Name("watch_topic_feed", num);
            A0L = new Name("news_feed", num);
            A0K = new Name("group_feed_type", num);
            A03 = new Name("cross_group_feed_type", num);
            A0B = new Name("cross_group_feed_trending_type", num);
            A08 = new Name("cross_group_feed_popular_type", num);
            A09 = new Name("cross_group_feed_rising_type", num);
            A05 = new Name("cross_group_feed_influential_type", num);
            A06 = new Name("cross_group_feed_joined_type", num);
            A04 = new Name("cross_group_feed_explore_type", num);
            A07 = new Name("cross_group_feed_local_type", num);
            A0A = new Name("cross_group_feed_set_type", num);
            A0N = new Name("top_stories_groups_tab", num);
            A02 = new Name("biz_disco_feed", num);
            A0M = new Name("stories_tray", num);
            Integer num2 = 0S2.A0C;
            A0C = new Name("fb_shorts", num2);
            A0J = new Name("fb_shorts_warion", num2);
            A0I = new Name("fb_shorts_vod_warion", num2);
            A0H = new Name("fb_shorts_unified_tofu", num2);
            A0E = new Name("fb_shorts_in_feed_unit", num2);
            A0D = new Name("fb_shorts_following_tab", num2);
            A0F = new Name("fb_shorts_live_tab", num2);
            CREATOR = new LGo(99);
        }

        public Name(Parcel parcel) {
            Integer num;
            String readString = parcel.readString();
            if (readString == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            this.A01 = readString;
            String readString2 = parcel.readString();
            if (readString2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            if (readString2.equals("DISK_AND_MEMORY_CACHE")) {
                num = 0S2.A00;
            } else if (readString2.equals("MEMORY_ONLY_CACHE")) {
                num = 0S2.A01;
            } else {
                if (!readString2.equals("NO_CACHE")) {
                    throw new IllegalArgumentException(readString2);
                }
                num = 0S2.A0C;
            }
            this.A00 = num;
        }

        public Name(String str, Integer num) {
            this.A01 = str;
            this.A00 = num;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Name)) {
                return false;
            }
            return 11T.A0O(this.A01, ((Name) obj).A01);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            String str;
            11T.A0F(parcel, 0);
            parcel.writeString(this.A01);
            switch (this.A00.intValue()) {
                case 1:
                    str = "MEMORY_ONLY_CACHE";
                    break;
                case 2:
                    str = "NO_CACHE";
                    break;
                default:
                    str = "DISK_AND_MEMORY_CACHE";
                    break;
            }
            parcel.writeString(str);
        }
    }

    static {
        Name name = Name.A0L;
        FeedType A00 = A00(name, "most_recent", "newsfeed_most_recent_view");
        A0P = A00;
        A0a = A00(name, "top_stories", "native_newsfeed");
        A0Y = A00(name, "seen", "native_newsfeed");
        A0D = A00(name, "favorites", "native_newsfeed");
        A0O = A00(Name.A03, "groups_tab", "native_newsfeed");
        A0N = A00(Name.A0K, "groups_mall", "native_newsfeed");
        A0B = A00(Name.A0B, "community_tab_trending", "native_newsfeed");
        A09 = A00(Name.A09, "community_tab_rising", "native_newsfeed");
        A08 = A00(Name.A08, "community_tab_popular", "native_newsfeed");
        A05 = A00(Name.A05, "community_tab_influential", "native_newsfeed");
        A06 = A00(Name.A06, "community_tab_joined", "native_newsfeed");
        A04 = A00(Name.A04, "community_tab_explore", "native_newsfeed");
        A07 = A00(Name.A07, "community_tab_local", "native_newsfeed");
        A0A = A00(Name.A0A, "community_tab_set", "native_newsfeed");
        A0d = A00(Name.A0P, "watch_tab", "native_newsfeed");
        A0I = A00(Name.A0G, "fb_shorts_tab", "native_newsfeed");
        A0c = A00(Name.A0O, "warion", "native_newsfeed");
        A0e = A00(Name.A0Q, "watch_topic_feed", "native_newsfeed");
        A0b = A00(Name.A0N, "top_stories_groups_tab", "native_newsfeed");
        A0Z = A00(Name.A0M, "stories_tray", "native_newsfeed");
        FeedType A002 = A00(Name.A0C, "fb_shorts", "native_newsfeed");
        A0E = A002;
        A0L = A00(Name.A0J, "fb_shorts_warion", A002.A02);
        A0K = A00(Name.A0I, "fb_shorts_vod_warion", "native_newsfeed");
        A0J = A00(Name.A0H, "fb_shorts_unified_tofu", "native_newsfeed");
        A0G = A00(Name.A0E, "fb_shorts_in_feed_unit", "native_newsfeed");
        A0F = A00(Name.A0D, "fb_shorts_following_tab", "native_newsfeed");
        A0H = A00(Name.A0F, "fb_shorts_live_tab", "native_newsfeed");
        A03 = A00(Name.A02, "biz_disco_feed", "native_newsfeed");
        Name name2 = A00.A01;
        String str = A00.A02;
        A0Q = A00(name2, "most_recent_all", str);
        A0R = A00(name2, "most_recent_favorites", str);
        A0S = A00(name2, "most_recent_friend", str);
        A0T = A00(name2, "most_recent_group", str);
        A0W = A00(name2, "most_recent_page", str);
        A0X = A00(name2, "most_recent_stories", str);
        A0V = A00(name2, "most_recent_notifications", str);
        A0U = A00(name2, "most_recent_marketplace", str);
        A0M = A00(name, "following_feed", "newsfeed_following_view");
        A0C = A00(name, "discover_feed", "newsfeed_discover_view");
        CREATOR = new LGo(98);
    }

    public FeedType(Parcel parcel) {
        Object A01 = parcel.readInt() == 1 ? FJ8.A01(parcel) : parcel.readValue(4YV.A0e(this));
        if (A01 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = A01;
        Parcelable readParcelable = parcel.readParcelable(Name.class.getClassLoader());
        if (readParcelable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = (Name) readParcelable;
        String readString = parcel.readString();
        this.A02 = readString == null ? "native_newsfeed" : readString;
    }

    public FeedType(Name name, Object obj, String str) {
        11T.A0F(name, 2);
        this.A00 = obj;
        this.A01 = name;
        this.A02 = str == null ? "native_newsfeed" : str;
    }

    public static FeedType A00(Name name, Object obj, String str) {
        return new FeedType(name, obj, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof FeedType)) {
                return false;
            }
            FeedType feedType = (FeedType) obj;
            if (!11T.A0O(this.A00.toString(), feedType.A00.toString()) || !11T.A0O(this.A01, feedType.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00.toString()});
    }

    public String toString() {
        return this.A00.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Object obj = this.A00;
        if (obj instanceof C23u) {
            parcel.writeInt(1);
            FJ8.A0A(parcel, (C23u) obj);
        } else {
            parcel.writeInt(0);
            parcel.writeValue(obj);
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
    }
}
