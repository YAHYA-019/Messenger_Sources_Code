package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5by, reason: invalid class name */
/* loaded from: 5by.class */
public final class C5by {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5by[] A01;
    public static final C5by A02;
    public static final C5by A03;
    public static final C5by A04;
    public static final C5by A05;
    public static final C5by A06;
    public static final C5by A07;
    public static final C5by A08;
    public static final C5by A09;
    public static final C5by A0A;
    public static final C5by A0B;
    public static final C5by A0C;
    public static final C5by A0D;
    public static final C5by A0E;
    public static final C5by A0F;
    public static final C5by A0G;
    public static final C5by A0H;
    public static final C5by A0I;
    public static final C5by A0J;
    public static final C5by A0K;
    public static final C5by A0L;
    public static final C5by A0M;
    public final int value;

    static {
        C5by c5by = new C5by("LOCAL_EVENT", 0, 2);
        A09 = c5by;
        C5by c5by2 = new C5by("CLASSIC_FRIENDS_UPDATE", 1, 3);
        A03 = c5by2;
        C5by c5by3 = new C5by("BIRTHDAY", 2, 4);
        A02 = c5by3;
        C5by c5by4 = new C5by("REELS", 3, 10);
        A0H = c5by4;
        C5by c5by5 = new C5by("NOTES", 4, 11);
        A0C = c5by5;
        C5by c5by6 = new C5by("MEMORIES", 5, 12);
        A0A = c5by6;
        C5by c5by7 = new C5by("UNJOINED_BROADCAST_CHANNEL", 6, 13);
        A0K = c5by7;
        C5by c5by8 = new C5by("JOINED_BROADCAST_CHANNEL_SNIPPET", 7, 14);
        A07 = c5by8;
        C5by c5by9 = new C5by("STORY", 8, 15);
        A0J = c5by9;
        C5by c5by10 = new C5by("LIFE_EVENT", 9, 16);
        A08 = c5by10;
        C5by c5by11 = new C5by("FRIEND_POST", 10, 17);
        A06 = c5by11;
        C5by c5by12 = new C5by("UNJOINED_BROADCAST_CHANNEL_SNIPPET", 11, 19);
        A0M = c5by12;
        C5by c5by13 = new C5by("UNJOINED_BROADCAST_CHANNEL_HSCROLL", 12, 20);
        A0L = c5by13;
        C5by c5by14 = new C5by("PEOPLE_YOU_MAY_KNOW", 13, 21);
        A0G = c5by14;
        C5by c5by15 = new C5by("MOMENT_CARD", 14, 22);
        A0B = c5by15;
        C5by c5by16 = new C5by("NUX", 15, 900);
        A0E = c5by16;
        C5by c5by17 = new C5by("STORIES_TRAY", 16, 901);
        A0I = c5by17;
        C5by c5by18 = new C5by("NULL_STATE", 17, 902);
        A0D = c5by18;
        C5by c5by19 = new C5by("END_OF_FEED", 18, 903);
        A05 = c5by19;
        C5by c5by20 = new C5by("PAGINATION_LOADER", 19, 904);
        A0F = c5by20;
        C5by c5by21 = new C5by("DEBUG_BANNER", 20, 905);
        A04 = c5by21;
        C5by[] c5byArr = {c5by, c5by2, c5by3, c5by4, c5by5, c5by6, c5by7, c5by8, c5by9, c5by10, c5by11, c5by12, c5by13, c5by14, c5by15, c5by16, c5by17, c5by18, c5by19, c5by20, c5by21, new C5by("GENERIC_ITEM", 21, 906)};
        A01 = c5byArr;
        A00 = C00t.A00(c5byArr);
    }

    public C5by(String str, int i, int i2) {
        this.value = i2;
    }

    public static C5by valueOf(String str) {
        return (C5by) Enum.valueOf(C5by.class, str);
    }

    public static C5by[] values() {
        return (C5by[]) A01.clone();
    }
}
