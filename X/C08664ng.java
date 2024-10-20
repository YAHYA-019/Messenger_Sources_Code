package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.facebook.messaging.montage.model.cards.MontageReshareContentSticker;
import com.facebook.messaging.montage.model.cards.MontageTagSticker;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ng.class */
public final class C08664ng {
    public final C00i A02 = new 1BQ(16772);
    public final C00i A00 = new 1BQ(16634);
    public final C00i A01 = new 1BV(66122);

    /* JADX WARN: Type inference failed for: r0v19, types: [X.2J3, X.4nu] */
    public static void A00(C08664ng c08664ng, String str, java.util.Map map) {
        2Jy r0 = new 2Jy(str);
        r0.A0D("pigeon_reserved_keyword_module", "messaging_montage");
        2Jy.A03(r0, map, false);
        C1kw c1kw = (C1kw) c08664ng.A02.get();
        if (C08744nu.A00 == null) {
            synchronized (C08744nu.class) {
                if (C08744nu.A00 == null) {
                    C08744nu.A00 = new C2J3(c1kw);
                }
            }
        }
        C08744nu.A00.A03(r0);
    }

    public void A01(HCb hCb, String str) {
        1UG A08 = 1BK.A08(1BK.A07(this.A00), "ls_montage_composer");
        if (A08.isSampled()) {
            A08.A7R("entrypoint", str);
            A08.A5c(hCb, "action");
            A08.A7R("art_item_type", "");
            A08.A7R("art_item_id", "");
            A08.BZL();
        }
    }

    public void A02(HCb hCb, String str, String str2, String str3) {
        1UG A08 = 1BK.A08(1BK.A07(this.A00), "ls_montage_composer");
        if (A08.isSampled()) {
            A08.A7R("entrypoint", str);
            A08.A5c(hCb, "action");
            A08.A7R("art_item_type", str2);
            A08.A7R("art_item_id", str3);
            A08.BZL();
        }
    }

    public void A03(Message message, NavigationTrigger navigationTrigger, java.util.Map map) {
        String str;
        MediaResource mediaResource;
        5HP r0;
        message.getClass();
        map.put("montage_thread_fbid", message.A1g);
        map.put("message_source", message.A1l);
        ImmutableList immutableList = message.A0r;
        String A00 = GOm.A00(366);
        if (immutableList != null && !immutableList.isEmpty() && 4YU.A0T(immutableList, 0).A08 != null) {
            map.put(A00, Long.toString(4YU.A0T(immutableList, 0).A08.A03));
        }
        ImmutableList immutableList2 = message.A0z;
        if (!immutableList2.isEmpty() && ((r0 = (mediaResource = (MediaResource) immutableList2.get(0)).A0Q) == 5HP.A0H || r0 == 5HP.A06)) {
            map.put(A00, Long.toString(4YU.A06(mediaResource.A08)));
        }
        ImmutableList immutableList3 = message.A0w;
        if (immutableList3 != null && !immutableList3.isEmpty()) {
            ImmutableList.Builder A0h = 4YU.A0h();
            1Du it = immutableList3.iterator();
            while (it.hasNext()) {
                MontageFeedbackOverlay montageFeedbackOverlay = (MontageFeedbackOverlay) it.next();
                MontageReshareContentSticker montageReshareContentSticker = montageFeedbackOverlay.A07;
                if (montageReshareContentSticker == null) {
                    MontageTagSticker montageTagSticker = montageFeedbackOverlay.A0A;
                    if (montageTagSticker != null && "PEOPLE".equals(montageTagSticker.A02)) {
                        String str2 = montageTagSticker.A01;
                        if (!str2.isEmpty()) {
                            A0h.m11011add((Object) str2);
                        }
                    }
                } else if (montageReshareContentSticker.A01().equals(H9K.A02) && (str = montageReshareContentSticker.A04) != null) {
                    map.put("reshare_story_id", str);
                }
            }
            ImmutableList build = A0h.build();
            if (!build.isEmpty()) {
                map.put("mention_ids", Integer.toString(build.size()));
            }
        }
        A04(navigationTrigger, map);
    }

    public void A04(NavigationTrigger navigationTrigger, java.util.Map map) {
        if (navigationTrigger != null) {
            String str = navigationTrigger.A05;
            boolean z = -1;
            switch (str.hashCode()) {
                case 244808489:
                    if (str.equals("messenger_montage_quick_cam")) {
                        z = false;
                        break;
                    }
                    break;
                case 542567654:
                    if (str.equals("messenger_montage_viewer")) {
                        z = true;
                        break;
                    }
                    break;
                case 618524045:
                    if (str.equals("messenger_montage_inbox_composer")) {
                        z = 2;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                    str = "montage_quick_cam";
                    break;
                case true:
                    str = "montage_forward_flow";
                    break;
                case true:
                    str = AnonymousClass001.A0b("entry_point", map);
                    if (1JF.A0A(str)) {
                        str = "inbox_composer";
                        break;
                    }
                    break;
            }
            map.put("entry_point", str);
        }
        C7pb c7pb = (C7pb) this.A01.get();
        String A00 = GOm.A00(20);
        String str2 = (String) map.get(A00);
        String A002 = GOm.A00(21);
        String str3 = (String) map.get(A002);
        String str4 = (String) map.get("entry_point");
        String str5 = (String) map.get("message_source");
        String str6 = (String) map.get("montage_thread_fbid");
        String str7 = (String) map.get("recipient_ids");
        String str8 = (String) map.get("sent_to_montage");
        HrZ hrZ = (HrZ) c7pb.A00.get();
        String str9 = str4;
        String str10 = str3;
        if (!((HnY) hrZ.A00.A00.get()).A00()) {
            1UG A003 = 1UD.A00((04J) hrZ.A01.A00.get(), 1ZG.A01, GOm.A00(74));
            if (A003.isSampled()) {
                A003.A7R("action", "share_media_action");
                if (str4 == null) {
                    str9 = "";
                }
                A003.A7R("entry_point", str9);
                if (str3 == null) {
                    str10 = "";
                }
                A003.A7R(GOm.A00(294), str10);
                A003.BZL();
            }
        }
        1UG A004 = 1UD.A00((04J) c7pb.A01.get(), 1ZG.A01, "montage_post");
        if (A004.isSampled()) {
            if (str2 == null) {
                str2 = "";
            }
            A004.A7R(A00, str2);
            if (str3 == null) {
                str3 = "";
            }
            A004.A7R(A002, str3);
            if (str4 == null) {
                str4 = "";
            }
            A004.A7R("entry_point", str4);
            if (str5 == null) {
                str5 = "";
            }
            A004.A7R("message_source", str5);
            long j = -1;
            A004.A6H("montage_thread_fbid", Long.valueOf(str6 != null ? Long.parseLong(str6) : -1));
            A004.A7R(1BJ.A00(211), "");
            A004.A7R(1BJ.A00(212), AnonymousClass000.A00(97));
            A004.A7R("pigeon_reserved_keyword_module", "messaging_montage");
            if (str7 != null) {
                j = Long.parseLong(str7);
            }
            A004.A6H("recipient_ids", Long.valueOf(j));
            if (str8 == null) {
                str8 = "";
            }
            A004.A7R("sent_to_montage", str8);
            A004.BZL();
        }
    }
}
