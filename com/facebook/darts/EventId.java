package com.facebook.darts;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M2S;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: EventId.class */
public final class EventId {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EventId[] A02;
    public static final EventId A03;
    public static final EventId A04;
    public static final EventId A05;
    public static final EventId A06;
    public static final EventId A07;
    public static final EventId A08;
    public static final EventId A09;
    public static final EventId A0A;
    public static final EventId A0B;
    public static final EventId A0C;
    public static final EventId A0D;
    public static final EventId A0E;
    public static final EventId A0F;
    public static final EventId A0G;
    public static final EventId A0H;
    public static final EventId A0I;
    public static final EventId A0J;
    public static final EventId A0K;
    public static final EventId A0L;
    public static final EventId A0M;
    public static final EventId A0N;
    public static final EventId A0O;
    public static final EventId A0P;
    public static final EventId A0Q;
    public static final EventId A0R;
    public static final EventId A0S;
    public static final Companion Companion;
    public final int event;

    /* loaded from: EventId$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(EventId.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v113, types: [com.facebook.darts.EventId$Companion, java.lang.Object] */
    static {
        EventId eventId = new EventId(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0, -1);
        A0R = eventId;
        EventId eventId2 = new EventId("AD_CLICK", 1, 0);
        A03 = eventId2;
        EventId eventId3 = new EventId("AD_VPVD", 2, 1);
        A08 = eventId3;
        EventId eventId4 = new EventId("ORGANIC_VPVD", 3, 2);
        A0E = eventId4;
        EventId eventId5 = new EventId("ORGANIC_CLICK", 4, 3);
        A0C = eventId5;
        EventId eventId6 = new EventId("AD_IMPRESSION", 5, 4);
        A05 = eventId6;
        EventId eventId7 = new EventId("AD_IMPRESSION_PAGE_ID", 6, 5);
        A06 = eventId7;
        EventId eventId8 = new EventId("AD_CLICK_RICH", 7, 6);
        A04 = eventId8;
        EventId eventId9 = new EventId("AD_VPVD_RICH", 8, 7);
        A09 = eventId9;
        EventId eventId10 = new EventId("ORGANIC_VPVD_RICH", 9, 8);
        A0F = eventId10;
        EventId eventId11 = new EventId("AD_IMPRESSION_RICH", 10, 9);
        A07 = eventId11;
        EventId eventId12 = new EventId("ORGANIC_VENDED_RICH", 11, 10);
        A0D = eventId12;
        EventId eventId13 = new EventId("AUCTIONABLE_VENDED_RICH", 12, 11);
        A0A = eventId13;
        EventId eventId14 = new EventId("USER_SCROLL", 13, 12);
        A0S = eventId14;
        EventId eventId15 = new EventId("BG_FETCH_ACTIVENESS_SCORE", 14, 13);
        A0B = eventId15;
        EventId eventId16 = new EventId("REACTION", 15, 14);
        A0G = eventId16;
        EventId eventId17 = new EventId("REELS_AD_CLICK", 16, 1000);
        A0H = eventId17;
        EventId eventId18 = new EventId("REELS_AD_VPVD", 17, 1001);
        A0J = eventId18;
        EventId eventId19 = new EventId("REELS_ORGANIC_CLICK", 18, 1002);
        A0K = eventId19;
        EventId eventId20 = new EventId("REELS_AD_VIEW", 19, 1003);
        A0I = eventId20;
        EventId eventId21 = new EventId("REELS_ORGANIC_LIKE", 20, 1004);
        A0M = eventId21;
        EventId eventId22 = new EventId("REELS_ORGANIC_SHARE", 21, 1005);
        A0O = eventId22;
        EventId eventId23 = new EventId("REELS_ORGANIC_COMMENT", 22, 1006);
        A0L = eventId23;
        EventId eventId24 = new EventId("REELS_ORGANIC_SAVE", 23, 1007);
        A0N = eventId24;
        EventId eventId25 = new EventId("REELS_ORGANIC_VIEW", 24, 1009);
        A0P = eventId25;
        EventId eventId26 = new EventId("REELS_STANDALONE_MULTI_ADS", 25, 1010);
        A0Q = eventId26;
        EventId[] eventIdArr = {eventId, eventId2, eventId3, eventId4, eventId5, eventId6, eventId7, eventId8, eventId9, eventId10, eventId11, eventId12, eventId13, eventId14, eventId15, eventId16, eventId17, eventId18, eventId19, eventId20, eventId21, eventId22, eventId23, eventId24, eventId25, eventId26, new EventId("REELS_HP2_AD_VIEW", 26, 1011)};
        A02 = eventIdArr;
        A01 = C00t.A00(eventIdArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M2S.A00);
    }

    public EventId(String str, int i, int i2) {
        this.event = i2;
    }

    public static EventId valueOf(String str) {
        return (EventId) Enum.valueOf(EventId.class, str);
    }

    public static EventId[] values() {
        return (EventId[]) A02.clone();
    }
}
