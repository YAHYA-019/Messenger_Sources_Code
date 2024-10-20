package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemePayload;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeReactionAssetInfo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.37n, reason: invalid class name */
/* loaded from: 37n.class */
public final class C37n extends BBa {
    public static final String[] A07 = {"UNSET_OR_UNRECOGNIZED_ENUM_VALUE", "NORMAL", "DARK", "NONE"};
    public static final String[] A08 = {"UNSET_OR_UNRECOGNIZED_ENUM_VALUE", "DEFAULT", "DARK_MODE", "LIGHT_MODE", "DARK_OVERRIDE", "LIGHT_OVERRIDE"};
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;

    public C37n(1BO r302, FbUserSession fbUserSession) {
        super(1BV.A01((1BY) null, 49996));
        this.A01 = 1BQ.A02(84652);
        this.A06 = 1BV.A01((1BY) null, 66402);
        this.A03 = 1BQ.A02(99390);
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A05 = new 1MV(fbUserSession, (1BY) null, 84521);
        this.A04 = new 1MV(fbUserSession, (1BY) null, 49390);
        this.A02 = new 1MV(fbUserSession, (1BY) null, 84638);
    }

    public static ThreadThemeInfo A00(S2g s2g, long j) {
        int intValue;
        Uri uri;
        int intValue2;
        2xK r0 = new 2xK();
        r0.A0S = j;
        Long l = s2g.themeId;
        if (l != null) {
            r0.A0T = l.longValue();
        }
        Integer num = s2g.appColorMode;
        if (num != null && (intValue2 = num.intValue()) >= 0) {
            String[] strArr = A07;
            if (intValue2 < 4) {
                r0.A05(strArr[intValue2]);
            }
        }
        String str = s2g.fallbackColor;
        if (str != null) {
            r0.A08 = 0De.A02(str);
        }
        List list = s2g.gradientColors;
        if (list != null) {
            r0.A01(3Gb.A00(list));
        }
        String str2 = s2g.accessibilityLabel;
        if (str2 != null) {
            r0.A04(str2);
        }
        RyB ryB = s2g.backgroundAsset;
        if (ryB != null && !ryB.uriMap.isEmpty()) {
            Uri uri2 = null;
            try {
                uri2 = C0A2.A03(A01(s2g.backgroundAsset.uriMap));
            } catch (SecurityException unused) {
            }
            r0.A0V = uri2;
        }
        RyC ryC = s2g.iconAsset;
        if (ryC != null && !ryC.uriMap.isEmpty()) {
            String A0b = AnonymousClass001.A0b(48N.A03.persistentIndex, s2g.iconAsset.uriMap);
            String A0b2 = AnonymousClass001.A0b(48N.A05.persistentIndex, s2g.iconAsset.uriMap);
            if (A0b2 != null && A0b != null) {
                Uri uri3 = null;
                try {
                    uri3 = C0A2.A03(A0b2);
                } catch (SecurityException unused2) {
                }
                r0.A0Y = uri3;
                uri = null;
                try {
                    uri = C0A2.A03(A0b);
                } catch (SecurityException unused3) {
                }
            } else if (A01(s2g.iconAsset.uriMap) != null) {
                uri = null;
                try {
                    uri = C0A2.A03(A01(s2g.iconAsset.uriMap));
                } catch (SecurityException unused4) {
                }
                r0.A0Y = uri;
            }
            r0.A0W = uri;
        }
        Ryk ryk = s2g.reactionPack;
        if (ryk != null && !ryk.reactionAssets.isEmpty()) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (S1l s1l : s2g.reactionPack.reactionAssets) {
                Uri uri4 = null;
                Uri uri5 = null;
                Uri uri6 = null;
                String valueOf = String.valueOf(s1l.fbid);
                C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, valueOf);
                String str3 = s1l.reactionEmoji;
                C1pq.A08("reactionEmoji", str3);
                if (!1JF.A0B(s1l.keyframeAssetUri)) {
                    try {
                        uri4 = C0A2.A03(s1l.keyframeAssetUri);
                    } catch (SecurityException unused5) {
                    }
                }
                if (!s1l.staticAssetUriMap.isEmpty()) {
                    String A0b3 = AnonymousClass001.A0b(48N.A03.persistentIndex, s1l.staticAssetUriMap);
                    String A0b4 = AnonymousClass001.A0b(48N.A05.persistentIndex, s1l.staticAssetUriMap);
                    if (A0b3 == null || A0b4 == null) {
                        String A01 = A01(s1l.staticAssetUriMap);
                        if (A01 != null) {
                            try {
                                uri5 = C0A2.A03(A01);
                            } catch (SecurityException unused6) {
                            }
                            uri6 = uri5;
                        }
                    } else {
                        try {
                            uri6 = C0A2.A03(A0b4);
                        } catch (SecurityException unused7) {
                        }
                        try {
                            uri5 = C0A2.A03(A0b3);
                        } catch (SecurityException unused8) {
                        }
                    }
                }
                builder.m11011add((Object) new ThreadThemeReactionAssetInfo(uri4, uri5, uri6, valueOf, str3));
            }
            ImmutableList build = builder.build();
            r0.A0d = build;
            C1pq.A08("reactionAssets", build);
        }
        Integer num2 = s2g.threadViewMode;
        if (num2 != null && (intValue = num2.intValue()) >= 0) {
            String[] strArr2 = A08;
            if (intValue < 6) {
                String str4 = strArr2[intValue];
                r0.A0i = str4;
                C1pq.A08("threadViewMode", str4);
                2xK.A00(r0, "threadViewMode");
            }
        }
        String str5 = s2g.titleBarTextColor;
        if (str5 != null) {
            r0.A0Q = 0De.A02(str5);
        }
        String str6 = s2g.titleBarAttributionColor;
        if (str6 != null) {
            r0.A0N = 0De.A02(str6);
        }
        String str7 = s2g.titleBarBackgroundColor;
        if (str7 != null) {
            r0.A0O = 0De.A02(str7);
        }
        String str8 = s2g.composerBackgroundColor;
        if (str8 != null) {
            r0.A00 = 0De.A02(str8);
        }
        String str9 = s2g.composerInputBackgroundColor;
        if (str9 != null) {
            r0.A01 = 0De.A02(str9);
        }
        String str10 = s2g.composerInputPlaceholderColor;
        if (str10 != null) {
            r0.A04 = 0De.A02(str10);
        }
        List list2 = s2g.backgroundGradientColors;
        if (list2 != null) {
            ImmutableList A00 = 3Gb.A00(list2);
            r0.A0Z = A00;
            C1pq.A08("backgroundGradientColors", A00);
        }
        List list3 = s2g.inboundMessageGradientColors;
        if (list3 != null) {
            r0.A03(3Gb.A00(list3));
        }
        String str11 = s2g.titleBarButtonTintColor;
        if (str11 != null) {
            r0.A0P = 0De.A02(str11);
        }
        String str12 = s2g.composerTintColor;
        if (str12 != null) {
            r0.A05 = 0De.A02(str12);
        }
        String str13 = s2g.composerUnselectedTintColor;
        if (str13 != null) {
            r0.A06 = 0De.A02(str13);
        }
        String str14 = s2g.composerInputBorderColor;
        if (str14 != null) {
            r0.A02 = 0De.A02(str14);
        }
        Integer num3 = s2g.composerInputBorderWidth;
        if (num3 != null) {
            r0.A03 = num3.intValue();
        }
        String str15 = s2g.messageTextColor;
        if (str15 != null) {
            r0.A0J = 0De.A02(str15);
        }
        String str16 = s2g.messageBorderColor;
        if (str16 != null) {
            r0.A0F = 0De.A02(str16);
        }
        Integer num4 = s2g.messageBorderWidth;
        if (num4 != null) {
            r0.A0G = num4.intValue();
        }
        Integer num5 = s2g.messageSmallCornerRadius;
        if (num5 != null) {
            r0.A0I = num5.intValue();
        }
        Integer num6 = s2g.messageLargeCornerRadius;
        if (num6 != null) {
            r0.A0H = num6.intValue();
        }
        String str17 = s2g.inboundMessageTextColor;
        if (str17 != null) {
            r0.A0E = 0De.A02(str17);
        }
        String str18 = s2g.inboundMessageBorderColor;
        if (str18 != null) {
            r0.A0A = 0De.A02(str18);
        }
        Integer num7 = s2g.inboundMessageBorderWidth;
        if (num7 != null) {
            r0.A0B = num7.intValue();
        }
        Integer num8 = s2g.inboundMessageSmallCornerRadius;
        if (num8 != null) {
            r0.A0D = num8.intValue();
        }
        Integer num9 = s2g.inboundMessageLargeCornerRadius;
        if (num9 != null) {
            r0.A0C = num9.intValue();
        }
        String str19 = s2g.deliveryReceiptColor;
        if (str19 != null) {
            r0.A07 = 0De.A02(str19);
        }
        String str20 = s2g.tertiaryTextColor;
        if (str20 != null) {
            r0.A0M = 0De.A02(str20);
        }
        String str21 = s2g.hotLikeColor;
        if (str21 != null) {
            r0.A09 = 0De.A02(str21);
        }
        String str22 = s2g.voiceRecordSoundwaveColor;
        if (str22 != null) {
            r0.A0R = 0De.A02(str22);
        }
        String str23 = s2g.primaryButtonBackgroundColor;
        if (str23 != null) {
            r0.A0K = 0De.A02(str23);
        }
        String str24 = s2g.reactionPillBackgroundColor;
        if (str24 != null) {
            r0.A0L = 0De.A02(str24);
        }
        String str25 = s2g.variantHash;
        if (str25 != null) {
            r0.A0k = str25;
        }
        List list4 = s2g.hashProviders;
        if (list4 != null) {
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (Object obj : list4) {
                if (obj != null) {
                    builder2.m11011add(obj);
                }
            }
            r0.A02(builder2.build());
        }
        String str26 = s2g.backgroundGradients;
        if (str26 != null) {
            r0.A0h = str26;
        }
        return new ThreadThemeInfo(r0);
    }

    public static String A01(java.util.Map map) {
        1BK.A1S(!map.isEmpty());
        return 1BK.A16(AnonymousClass001.A0z(AnonymousClass001.A0y(map)));
    }

    public /* bridge */ /* synthetic */ ImmutableSet A0K(Object obj) {
        return new SingletonImmutableSet(((CNO) this.A01.get()).A01(((S2g) BI7.A00((BI7) obj, 57)).threadKey));
    }

    public /* bridge */ /* synthetic */ ImmutableSet A0L(Object obj) {
        return RegularImmutableSet.A05;
    }

    public boolean A0O(C7a c7a) {
        return true;
    }

    public Bundle A0R(ThreadSummary threadSummary, C7a c7a) {
        ImmutableMap immutableMap;
        Bundle A05 = 1BK.A05();
        S2g s2g = (S2g) BI7.A00((BI7) c7a.A02, 57);
        if (s2g != null && s2g.threadKey != null) {
            ThreadKey A01 = ((CNO) this.A01.get()).A01(s2g.threadKey);
            Long l = s2g.themeId;
            long longValue = l != null ? l.longValue() : -1;
            ThreadThemeInfo A00 = A00(s2g, longValue);
            ImmutableMap.Builder A0c = 1BK.A0c();
            String str = A00.A0k;
            if (!TextUtils.isEmpty(str)) {
                A0c.put(str, A00);
            }
            ThreadThemeInfo threadThemeInfo = null;
            Iterator it = s2g.alternativeThemes.iterator();
            while (it.hasNext()) {
                ThreadThemeInfo A002 = A00((S2g) it.next(), longValue);
                String str2 = A002.A0k;
                if (!TextUtils.isEmpty(str2)) {
                    A0c.put(str2, A002);
                }
                if ("DARK".equals(A002.A00())) {
                    threadThemeInfo = A002;
                }
            }
            2Gq r0 = new 2Gq();
            r0.A00(A00);
            r0.A00 = threadThemeInfo;
            ImmutableMap build = A0c.build();
            r0.A02 = build;
            C1pq.A08("themeVariantMap", build);
            CompositeThreadThemeInfo compositeThreadThemeInfo = new CompositeThreadThemeInfo(r0);
            this.A06.get();
            List<Rz6> list = s2g.threadThemePayloads;
            if (list == null || list.isEmpty()) {
                immutableMap = null;
            } else {
                HashMap A0u = AnonymousClass001.A0u();
                for (Rz6 rz6 : list) {
                    if (rz6 != null && !TextUtils.isEmpty(rz6.payloadKey)) {
                        long j = 0;
                        String str3 = rz6.payloadKey;
                        C1pq.A08("key", str3);
                        String str4 = rz6.value;
                        C1pq.A08("value", str4);
                        try {
                            j = Long.parseLong(rz6.expirationTimestampMs);
                        } catch (NumberFormatException e) {
                            0fH.A0z("DeltaUpdateThreadThemeHandler", "expirationTimestampMs (%s) cannot be parsed to long", e, new Object[]{rz6.expirationTimestampMs});
                        }
                        Long l2 = rz6.participantID;
                        long longValue2 = l2 != null ? l2.longValue() : 0L;
                        String str5 = rz6.payloadKey;
                        11T.A0F(str5, 0);
                        if (longValue2 != 0) {
                            str5 = StringFormatUtil.formatStrLocaleSafe("%s,%d", str5, Long.valueOf(longValue2));
                            11T.A0D(str5);
                        }
                        A0u.put(str5, new ThreadThemePayload(j, str3, longValue2, str4));
                    }
                }
                immutableMap = ImmutableMap.copyOf((java.util.Map) A0u);
            }
            4yH r02 = (4yH) this.A04.get();
            long A082 = 1BL.A08(this.A03);
            C00i c00i = r02.A04;
            ThreadSummary A0E = ((C4yz) c00i.get()).A0E(A01);
            ThreadSummary threadSummary2 = null;
            if (A0E != null) {
                C1zm c1zm = new C1zm(A0E);
                c1zm.A0D(compositeThreadThemeInfo);
                if (immutableMap == null || immutableMap.isEmpty()) {
                    c1zm.A0G(RegularImmutableMap.A03);
                } else {
                    c1zm.A0G(immutableMap);
                }
                ThreadSummary threadSummary3 = new ThreadSummary(c1zm);
                r02.A0R(threadSummary3, (ThreadSummary) null, A082);
                threadSummary2 = ((C4yz) c00i.get()).A0E(threadSummary3.A0n);
            }
            if (threadSummary2 != null) {
                A05.putParcelable("thread_theme_thread_summary", threadSummary2);
                return A05;
            }
        }
        return A05;
    }

    public void BLv(Bundle bundle, C7a c7a) {
        ThreadSummary threadSummary = (ThreadSummary) bundle.getParcelable("thread_theme_thread_summary");
        if (threadSummary != null) {
            ((C4z1) this.A02.get()).A07(threadSummary);
            CaM.A00(threadSummary.A0n, (CaM) this.A05.get());
        }
    }
}
