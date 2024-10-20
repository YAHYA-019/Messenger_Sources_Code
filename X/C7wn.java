package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: X.7wn, reason: invalid class name */
/* loaded from: 7wn.class */
public final class C7wn implements 5Yt {
    public static final C7wn A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7wn, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.messaging.highlightstab.model.HighlightsFeedContent", obj, 52);
        pluginGeneratedSerialDescriptor.A01("contentId", false);
        pluginGeneratedSerialDescriptor.A01("primaryTitle", false);
        pluginGeneratedSerialDescriptor.A01("feedType", false);
        pluginGeneratedSerialDescriptor.A01("secondaryTitle", true);
        pluginGeneratedSerialDescriptor.A01("mediaUrl", true);
        pluginGeneratedSerialDescriptor.A01("contextLine", true);
        pluginGeneratedSerialDescriptor.A01("threadId", true);
        pluginGeneratedSerialDescriptor.A01("thumbnailUrl", true);
        pluginGeneratedSerialDescriptor.A01("bluePostUrl", true);
        pluginGeneratedSerialDescriptor.A01("secondaryThumbnailUrl", true);
        pluginGeneratedSerialDescriptor.A01("eventTimestampMs", true);
        pluginGeneratedSerialDescriptor.A01("eventInterestedNum", true);
        pluginGeneratedSerialDescriptor.A01("eventGoingNum", true);
        pluginGeneratedSerialDescriptor.A01("folderKey", true);
        pluginGeneratedSerialDescriptor.A01("folderGroupId", true);
        pluginGeneratedSerialDescriptor.A01("bannerText", true);
        pluginGeneratedSerialDescriptor.A01("mediaHeight", true);
        pluginGeneratedSerialDescriptor.A01("mediaWidth", true);
        pluginGeneratedSerialDescriptor.A01("mediaType", true);
        pluginGeneratedSerialDescriptor.A01("messageId", true);
        pluginGeneratedSerialDescriptor.A01("mediaPreviewUrl", true);
        pluginGeneratedSerialDescriptor.A01("messageRecipientName", true);
        pluginGeneratedSerialDescriptor.A01("messageRecipientId", true);
        pluginGeneratedSerialDescriptor.A01("mediaId", true);
        pluginGeneratedSerialDescriptor.A01("isThreadJoined", true);
        pluginGeneratedSerialDescriptor.A01("rankingServiceId", true);
        pluginGeneratedSerialDescriptor.A01("requestId", true);
        pluginGeneratedSerialDescriptor.A01("rankingScore", true);
        pluginGeneratedSerialDescriptor.A01("reactionList", true);
        pluginGeneratedSerialDescriptor.A01("replyMessageList", true);
        pluginGeneratedSerialDescriptor.A01("immersiveMessageList", true);
        pluginGeneratedSerialDescriptor.A01("attachmentList", true);
        pluginGeneratedSerialDescriptor.A01("messageAttachmentList", true);
        pluginGeneratedSerialDescriptor.A01("memberList", true);
        pluginGeneratedSerialDescriptor.A01("birthdayGenAiContent", true);
        pluginGeneratedSerialDescriptor.A01("event", true);
        pluginGeneratedSerialDescriptor.A01("messageTimeStamp", true);
        pluginGeneratedSerialDescriptor.A01("contextLineBoldIndexPositions", true);
        pluginGeneratedSerialDescriptor.A01("isSeen", true);
        pluginGeneratedSerialDescriptor.A01("threadType", true);
        pluginGeneratedSerialDescriptor.A01("contentTimestampMs", true);
        pluginGeneratedSerialDescriptor.A01("requestTimeStampMs", true);
        pluginGeneratedSerialDescriptor.A01("scenario", true);
        pluginGeneratedSerialDescriptor.A01("secondaryMessageId", true);
        pluginGeneratedSerialDescriptor.A01("absolutePositionInFeed", true);
        pluginGeneratedSerialDescriptor.A01("capabilities", true);
        pluginGeneratedSerialDescriptor.A01("dominantColor", true);
        pluginGeneratedSerialDescriptor.A01("threadInviteLink", true);
        pluginGeneratedSerialDescriptor.A01("contentSubtype", true);
        pluginGeneratedSerialDescriptor.A01("momentCardType", true);
        pluginGeneratedSerialDescriptor.A01("isFullScreen", true);
        pluginGeneratedSerialDescriptor.A01("tapToFullscreen", true);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = HighlightsFeedContent.A0t;
        5Yu[] r02 = new 5Yu[52];
        5Yu r03 = 5ZL.A01;
        Lv8 lv8 = Lv8.A00;
        5Yu A002 = KZ3.A00(r03);
        5Yu A003 = KZ3.A00(r03);
        5Yu A004 = KZ3.A00(r03);
        5ZP r04 = 5ZP.A00;
        5Yu A005 = KZ3.A00(r04);
        5Yu A006 = KZ3.A00(r03);
        5Yu A007 = KZ3.A00(r03);
        5Yu A008 = KZ3.A00(r03);
        5Yu A009 = KZ3.A00(r04);
        5Yu A0010 = KZ3.A00(lv8);
        5Yu A0011 = KZ3.A00(lv8);
        5Yu A0012 = KZ3.A00(r04);
        5Yu A0013 = KZ3.A00(r04);
        5Yu A0014 = KZ3.A00(r03);
        5Yu A0015 = KZ3.A00(lv8);
        5Yu A0016 = KZ3.A00(lv8);
        5Yu A0017 = KZ3.A00(lv8);
        5Yu A0018 = KZ3.A00(r03);
        5Yu A0019 = KZ3.A00(r03);
        5Yu A0020 = KZ3.A00(r03);
        5Yu A0021 = KZ3.A00(r04);
        5Yu A0022 = KZ3.A00(r03);
        Lv3 lv3 = Lv3.A00;
        System.arraycopy(new 5Yu[]{KZ3.A00(Lv6.A00), r0[28], r0[29], r0[30], r0[31], r0[32], r0[33], r0[34], r0[35], KZ3.A00(r04), KZ3.A00(r03), KZ3.A00(lv3), KZ3.A00(lv8), KZ3.A00(r04), KZ3.A00(r04), KZ3.A00(lv8), KZ3.A00(r03), lv8, KZ3.A00(r04), KZ3.A00(r03), KZ3.A00(r03), KZ3.A00(r04), KZ3.A00(r03), lv3, lv3}, 1BK.A1W(new 5Yu[]{r03, r03, lv8, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, KZ3.A00(lv3), KZ3.A00(r03), KZ3.A00(r03)}, r02) ? 1 : 0, r02, 27, 25);
        return r02;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x00cf. Please report as an issue. */
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        int i4;
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yw[] r0 = HighlightsFeedContent.A0t;
        Long l = null;
        Long l2 = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        Long l3 = null;
        String str = null;
        Long l4 = null;
        String str2 = null;
        Long l5 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Long l6 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        Long l7 = null;
        Integer num3 = null;
        Integer num4 = null;
        Long l8 = null;
        Long l9 = null;
        String str14 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Long l10 = null;
        String str18 = null;
        Boolean bool2 = null;
        String str19 = null;
        String str20 = null;
        Double d = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        boolean z3 = true;
        do {
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    str6 = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                    i7 |= 1;
                    break;
                case 1:
                    str7 = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                    i7 |= 2;
                    break;
                case 2:
                    i6 = ABn.AM4(pluginGeneratedSerialDescriptor, 2);
                    i7 |= 4;
                    break;
                case 3:
                    str8 = (String) ABn.AM9(str8, 5ZL.A01, pluginGeneratedSerialDescriptor, 3);
                    i7 |= 8;
                    break;
                case 4:
                    str9 = (String) ABn.AM9(str9, 5ZL.A01, pluginGeneratedSerialDescriptor, 4);
                    i7 |= 16;
                    break;
                case 5:
                    str10 = (String) ABn.AM9(str10, 5ZL.A01, pluginGeneratedSerialDescriptor, 5);
                    i7 |= 32;
                    break;
                case 6:
                    l6 = (Long) ABn.AM9(l6, 5ZP.A00, pluginGeneratedSerialDescriptor, 6);
                    i7 |= 64;
                    break;
                case 7:
                    str11 = (String) ABn.AM9(str11, 5ZL.A01, pluginGeneratedSerialDescriptor, 7);
                    i7 |= 128;
                    break;
                case 8:
                    str12 = (String) ABn.AM9(str12, 5ZL.A01, pluginGeneratedSerialDescriptor, 8);
                    i7 |= 256;
                    break;
                case 9:
                    str13 = (String) ABn.AM9(str13, 5ZL.A01, pluginGeneratedSerialDescriptor, 9);
                    i7 |= 512;
                    break;
                case 10:
                    l7 = (Long) ABn.AM9(l7, 5ZP.A00, pluginGeneratedSerialDescriptor, 10);
                    i7 |= 1024;
                    break;
                case 11:
                    num3 = (Integer) ABn.AM9(num3, Lv8.A00, pluginGeneratedSerialDescriptor, 11);
                    i7 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                    break;
                case 12:
                    num4 = (Integer) ABn.AM9(num4, Lv8.A00, pluginGeneratedSerialDescriptor, 12);
                    i4 = i7 | RequestDefragmentingOutputStream.BODY_BUFFER_SIZE;
                    i7 = i4;
                    break;
                case 13:
                    l8 = 4YV.A0k(l8, pluginGeneratedSerialDescriptor, ABn, 13);
                    i4 = i7 | 8192;
                    i7 = i4;
                    break;
                case 14:
                    l9 = 4YV.A0k(l9, pluginGeneratedSerialDescriptor, ABn, 14);
                    i4 = i7 | Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                    i7 = i4;
                    break;
                case 15:
                    str14 = 4YV.A0w(str14, pluginGeneratedSerialDescriptor, ABn, 15);
                    i3 = 32768;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 16:
                    num5 = (Integer) ABn.AM9(num5, Lv8.A00, pluginGeneratedSerialDescriptor, 16);
                    i3 = 65536;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 17:
                    num6 = (Integer) ABn.AM9(num6, Lv8.A00, pluginGeneratedSerialDescriptor, 17);
                    i3 = 131072;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 18:
                    num7 = (Integer) ABn.AM9(num7, Lv8.A00, pluginGeneratedSerialDescriptor, 18);
                    i3 = 262144;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 19:
                    str15 = 4YV.A0w(str15, pluginGeneratedSerialDescriptor, ABn, 19);
                    i3 = 524288;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 20:
                    str16 = 4YV.A0w(str16, pluginGeneratedSerialDescriptor, ABn, 20);
                    i3 = 1048576;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 21:
                    str17 = 4YV.A0w(str17, pluginGeneratedSerialDescriptor, ABn, 21);
                    i3 = 2097152;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 22:
                    l10 = 4YV.A0k(l10, pluginGeneratedSerialDescriptor, ABn, 22);
                    i3 = 4194304;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 23:
                    str18 = 4YV.A0w(str18, pluginGeneratedSerialDescriptor, ABn, 23);
                    i3 = 8388608;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 24:
                    bool2 = (Boolean) ABn.AM9(bool2, Lv3.A00, pluginGeneratedSerialDescriptor, 24);
                    i3 = 16777216;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 25:
                    str19 = 4YV.A0w(str19, pluginGeneratedSerialDescriptor, ABn, 25);
                    i3 = 33554432;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 26:
                    str20 = 4YV.A0w(str20, pluginGeneratedSerialDescriptor, ABn, 26);
                    i3 = 67108864;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 27:
                    d = (Double) ABn.AM9(d, Lv6.A00, pluginGeneratedSerialDescriptor, 27);
                    i3 = 134217728;
                    i4 = i3 | i7;
                    i7 = i4;
                    break;
                case 28:
                    list = (List) ABn.AMB(list, r0[28], pluginGeneratedSerialDescriptor, 28);
                    i2 = 268435456;
                    i7 |= i2;
                    break;
                case 29:
                    list2 = (List) ABn.AMB(list2, r0[29], pluginGeneratedSerialDescriptor, 29);
                    i2 = 536870912;
                    i7 |= i2;
                    break;
                case 30:
                    list3 = (List) ABn.AMB(list3, r0[30], pluginGeneratedSerialDescriptor, 30);
                    i2 = 1073741824;
                    i7 |= i2;
                    break;
                case 31:
                    list4 = (List) ABn.AMB(list4, r0[31], pluginGeneratedSerialDescriptor, 31);
                    i2 = (-1) << (-1);
                    i7 |= i2;
                    break;
                case 32:
                    list5 = (List) ABn.AMB(list5, r0[32], pluginGeneratedSerialDescriptor, 32);
                    i5 |= 1;
                    break;
                case 33:
                    list6 = (List) ABn.AMB(list6, r0[33], pluginGeneratedSerialDescriptor, 33);
                    i5 |= 2;
                    break;
                case 34:
                    list7 = (List) ABn.AMB(list7, r0[34], pluginGeneratedSerialDescriptor, 34);
                    i5 |= 4;
                    break;
                case 35:
                    list8 = (List) ABn.AMB(list8, r0[35], pluginGeneratedSerialDescriptor, 35);
                    i5 |= 8;
                    break;
                case 36:
                    l3 = 4YV.A0k(l3, pluginGeneratedSerialDescriptor, ABn, 36);
                    i5 |= 16;
                    break;
                case 37:
                    str4 = 4YV.A0w(str4, pluginGeneratedSerialDescriptor, ABn, 37);
                    i5 |= 32;
                    break;
                case 38:
                    bool = (Boolean) ABn.AM9(bool, Lv3.A00, pluginGeneratedSerialDescriptor, 38);
                    i5 |= 64;
                    break;
                case 39:
                    num2 = (Integer) ABn.AM9(num2, Lv8.A00, pluginGeneratedSerialDescriptor, 39);
                    i5 |= 128;
                    break;
                case 40:
                    l = 4YV.A0k(l, pluginGeneratedSerialDescriptor, ABn, 40);
                    i5 |= 256;
                    break;
                case 41:
                    l2 = 4YV.A0k(l2, pluginGeneratedSerialDescriptor, ABn, 41);
                    i5 |= 512;
                    break;
                case 42:
                    num = (Integer) ABn.AM9(num, Lv8.A00, pluginGeneratedSerialDescriptor, 42);
                    i5 |= 1024;
                    break;
                case 43:
                    str3 = 4YV.A0w(str3, pluginGeneratedSerialDescriptor, ABn, 43);
                    i5 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                    break;
                case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                    i8 = ABn.AM4(pluginGeneratedSerialDescriptor, 44);
                    i5 |= RequestDefragmentingOutputStream.BODY_BUFFER_SIZE;
                    break;
                case ActionId.ON_CREATE_VIEW_END /* 45 */:
                    l5 = 4YV.A0k(l5, pluginGeneratedSerialDescriptor, ABn, 45);
                    i5 |= 8192;
                    break;
                case 46:
                    str2 = 4YV.A0w(str2, pluginGeneratedSerialDescriptor, ABn, 46);
                    i5 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                    break;
                case ActionId.ON_START_END /* 47 */:
                    str5 = 4YV.A0w(str5, pluginGeneratedSerialDescriptor, ABn, 47);
                    i = 32768;
                    i5 |= i;
                    break;
                case ActionId.QUEUED /* 48 */:
                    l4 = 4YV.A0k(l4, pluginGeneratedSerialDescriptor, ABn, 48);
                    i = 65536;
                    i5 |= i;
                    break;
                case ActionId.IN_PROGRESS /* 49 */:
                    str = 4YV.A0w(str, pluginGeneratedSerialDescriptor, ABn, 49);
                    i = 131072;
                    i5 |= i;
                    break;
                case 50:
                    z = ABn.ALn(pluginGeneratedSerialDescriptor, 50);
                    i = 262144;
                    i5 |= i;
                    break;
                case ActionId.UNKNOWN /* 51 */:
                    z2 = ABn.ALn(pluginGeneratedSerialDescriptor, 51);
                    i = 524288;
                    i5 |= i;
                    break;
                default:
                    throw new M9V(ALu);
            }
        } while (z3);
        ABn.AQH(pluginGeneratedSerialDescriptor);
        return new HighlightsFeedContent(bool2, bool, d, num3, num4, num5, num6, num7, num2, num, l6, l7, l8, l9, l10, l3, l, l2, l5, l4, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str4, str3, str2, str5, str, list, list2, list3, list4, list5, list6, list7, list8, i7, i5, i6, i8, z, z2);
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) obj;
        boolean A1X = 1BL.A1X(encoder, highlightsFeedContent);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Zd ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = HighlightsFeedContent.A0t;
        ABo.AQ0(highlightsFeedContent.A0P, pluginGeneratedSerialDescriptor, 0);
        ABo.AQ0(highlightsFeedContent.A0Z, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.APr(pluginGeneratedSerialDescriptor, 2, highlightsFeedContent.A05);
        boolean z = ABo.A04.A09;
        if (z || highlightsFeedContent.A0d != null) {
            ABo.APv(highlightsFeedContent.A0d, 5ZL.A01, pluginGeneratedSerialDescriptor, 3);
        }
        if (z || highlightsFeedContent.A0V != null) {
            ABo.APv(highlightsFeedContent.A0V, 5ZL.A01, pluginGeneratedSerialDescriptor, 4);
        }
        if (z || highlightsFeedContent.A0Q != null) {
            ABo.APv(highlightsFeedContent.A0Q, 5ZL.A01, pluginGeneratedSerialDescriptor, 5);
        }
        if (z || highlightsFeedContent.A0M != null) {
            ABo.APv(highlightsFeedContent.A0M, 5ZP.A00, pluginGeneratedSerialDescriptor, 6);
        }
        if (z || highlightsFeedContent.A0f != null) {
            ABo.APv(highlightsFeedContent.A0f, 5ZL.A01, pluginGeneratedSerialDescriptor, 7);
        }
        if (z || highlightsFeedContent.A0O != null) {
            ABo.APv(highlightsFeedContent.A0O, 5ZL.A01, pluginGeneratedSerialDescriptor, 8);
        }
        if (z || highlightsFeedContent.A0c != null) {
            ABo.APv(highlightsFeedContent.A0c, 5ZL.A01, pluginGeneratedSerialDescriptor, 9);
        }
        if (z || highlightsFeedContent.A0H != null) {
            ABo.APv(highlightsFeedContent.A0H, 5ZP.A00, pluginGeneratedSerialDescriptor, 10);
        }
        if (z || highlightsFeedContent.A0A != null) {
            ABo.APv(highlightsFeedContent.A0A, Lv8.A00, pluginGeneratedSerialDescriptor, 11);
        }
        if (z || highlightsFeedContent.A09 != null) {
            ABo.APv(highlightsFeedContent.A09, Lv8.A00, pluginGeneratedSerialDescriptor, 12);
        }
        if (z || highlightsFeedContent.A0J != null) {
            ABo.APv(highlightsFeedContent.A0J, 5ZP.A00, pluginGeneratedSerialDescriptor, 13);
        }
        if (z || highlightsFeedContent.A0I != null) {
            ABo.APv(highlightsFeedContent.A0I, 5ZP.A00, pluginGeneratedSerialDescriptor, 14);
        }
        if (z || highlightsFeedContent.A0N != null) {
            ABo.APv(highlightsFeedContent.A0N, 5ZL.A01, pluginGeneratedSerialDescriptor, 15);
        }
        if (z || highlightsFeedContent.A0B != null) {
            ABo.APv(highlightsFeedContent.A0B, Lv8.A00, pluginGeneratedSerialDescriptor, 16);
        }
        if (z || highlightsFeedContent.A0D != null) {
            ABo.APv(highlightsFeedContent.A0D, Lv8.A00, pluginGeneratedSerialDescriptor, 17);
        }
        if (z || highlightsFeedContent.A0C != null) {
            ABo.APv(highlightsFeedContent.A0C, Lv8.A00, pluginGeneratedSerialDescriptor, 18);
        }
        if (z || highlightsFeedContent.A0W != null) {
            ABo.APv(highlightsFeedContent.A0W, 5ZL.A01, pluginGeneratedSerialDescriptor, 19);
        }
        if (z || highlightsFeedContent.A0U != null) {
            ABo.APv(highlightsFeedContent.A0U, 5ZL.A01, pluginGeneratedSerialDescriptor, 20);
        }
        if (z || highlightsFeedContent.A0X != null) {
            ABo.APv(highlightsFeedContent.A0X, 5ZL.A01, pluginGeneratedSerialDescriptor, 21);
        }
        if (z || highlightsFeedContent.A0K != null) {
            ABo.APv(highlightsFeedContent.A0K, 5ZP.A00, pluginGeneratedSerialDescriptor, 22);
        }
        if (z || highlightsFeedContent.A0T != null) {
            ABo.APv(highlightsFeedContent.A0T, 5ZL.A01, pluginGeneratedSerialDescriptor, 23);
        }
        if (z || highlightsFeedContent.A07 != null) {
            ABo.APv(highlightsFeedContent.A07, Lv3.A00, pluginGeneratedSerialDescriptor, 24);
        }
        if (z || highlightsFeedContent.A0a != null) {
            ABo.APv(highlightsFeedContent.A0a, 5ZL.A01, pluginGeneratedSerialDescriptor, 25);
        }
        if (z || highlightsFeedContent.A0b != null) {
            ABo.APv(highlightsFeedContent.A0b, 5ZL.A01, pluginGeneratedSerialDescriptor, 26);
        }
        if (z || highlightsFeedContent.A08 != null) {
            ABo.APv(highlightsFeedContent.A08, Lv6.A00, pluginGeneratedSerialDescriptor, 27);
        }
        if (z || !11T.A0O(highlightsFeedContent.A0m, C0ty.A00)) {
            ABo.APw(highlightsFeedContent.A0m, r0[28], pluginGeneratedSerialDescriptor, 28);
        }
        if (z || !11T.A0O(highlightsFeedContent.A0n, C0ty.A00)) {
            ABo.APw(highlightsFeedContent.A0n, r0[29], pluginGeneratedSerialDescriptor, 29);
        }
        if (z || !11T.A0O(highlightsFeedContent.A0j, C0ty.A00)) {
            ABo.APw(highlightsFeedContent.A0j, r0[30], pluginGeneratedSerialDescriptor, 30);
        }
        if (z || !11T.A0O(highlightsFeedContent.A0g, C0ty.A00)) {
            ABo.APw(highlightsFeedContent.A0g, r0[31], pluginGeneratedSerialDescriptor, 31);
        }
        if (z || !11T.A0O(highlightsFeedContent.A0l, C0ty.A00)) {
            ABo.APw(highlightsFeedContent.A0l, r0[32], pluginGeneratedSerialDescriptor, 32);
        }
        if (z || !11T.A0O(highlightsFeedContent.A0k, C0ty.A00)) {
            ABo.APw(highlightsFeedContent.A0k, r0[33], pluginGeneratedSerialDescriptor, 33);
        }
        if (z || !11T.A0O(highlightsFeedContent.A0h, C0ty.A00)) {
            ABo.APw(highlightsFeedContent.A0h, r0[34], pluginGeneratedSerialDescriptor, 34);
        }
        if (z || !11T.A0O(highlightsFeedContent.A0i, C0ty.A00)) {
            ABo.APw(highlightsFeedContent.A0i, r0[35], pluginGeneratedSerialDescriptor, 35);
        }
        if (z || highlightsFeedContent.A0L != null) {
            ABo.APv(highlightsFeedContent.A0L, 5ZP.A00, pluginGeneratedSerialDescriptor, 36);
        }
        if (z || highlightsFeedContent.A0R != null) {
            ABo.APv(highlightsFeedContent.A0R, 5ZL.A01, pluginGeneratedSerialDescriptor, 37);
        }
        if (z || highlightsFeedContent.A06 != null) {
            ABo.APv(highlightsFeedContent.A06, Lv3.A00, pluginGeneratedSerialDescriptor, 38);
        }
        if (z || highlightsFeedContent.A0E != null) {
            ABo.APv(highlightsFeedContent.A0E, Lv8.A00, pluginGeneratedSerialDescriptor, 39);
        }
        if (z || highlightsFeedContent.A02 != null) {
            ABo.APv(highlightsFeedContent.A02, 5ZP.A00, pluginGeneratedSerialDescriptor, 40);
        }
        if (z || highlightsFeedContent.A03 != null) {
            ABo.APv(highlightsFeedContent.A03, 5ZP.A00, pluginGeneratedSerialDescriptor, 41);
        }
        if (z || highlightsFeedContent.A01 != null) {
            ABo.APv(highlightsFeedContent.A01, Lv8.A00, pluginGeneratedSerialDescriptor, 42);
        }
        if (z || highlightsFeedContent.A04 != null) {
            ABo.APv(highlightsFeedContent.A04, 5ZL.A01, pluginGeneratedSerialDescriptor, 43);
        }
        if (z || highlightsFeedContent.A00 != -1) {
            ABo.APr(pluginGeneratedSerialDescriptor, 44, highlightsFeedContent.A00);
        }
        if (z || highlightsFeedContent.A0F != null) {
            ABo.APv(highlightsFeedContent.A0F, 5ZP.A00, pluginGeneratedSerialDescriptor, 45);
        }
        if (z || highlightsFeedContent.A0S != null) {
            ABo.APv(highlightsFeedContent.A0S, 5ZL.A01, pluginGeneratedSerialDescriptor, 46);
        }
        if (z || highlightsFeedContent.A0e != null) {
            ABo.APv(highlightsFeedContent.A0e, 5ZL.A01, pluginGeneratedSerialDescriptor, 47);
        }
        if (z || highlightsFeedContent.A0G != null) {
            ABo.APv(highlightsFeedContent.A0G, 5ZP.A00, pluginGeneratedSerialDescriptor, 48);
        }
        if (z || highlightsFeedContent.A0Y != null) {
            ABo.APv(highlightsFeedContent.A0Y, 5ZL.A01, pluginGeneratedSerialDescriptor, 49);
        }
        if (z || highlightsFeedContent.A0p != A1X) {
            ABo.APg(pluginGeneratedSerialDescriptor, 50, highlightsFeedContent.A0p);
        }
        if (z || highlightsFeedContent.A0q != A1X) {
            ABo.APg(pluginGeneratedSerialDescriptor, 51, highlightsFeedContent.A0q);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
