package X;

import com.facebook.messaging.capability.plugins.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation;
import com.facebook.messaging.quickpromotion.chatentity.plugins.usercontrol.usercontroldataload.UserControlDataLoad;
import com.facebook.presence.note.music.musicpicker.MusicPickerBottomSheetFragment;
import java.util.Set;

/* renamed from: X.9zx, reason: invalid class name */
/* loaded from: 9zx.class */
public final class C9zx implements C1qM {
    public final int A00;
    public final Object A01;

    public C9zx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1qM
    public final void CNu(Set set) {
        2aH A0y;
        Object obj;
        int i;
        0DO aJd;
        8JG r0;
        9LY r02;
        switch (this.A00) {
            case 0:
                if (set.contains("in_thread_banners_list")) {
                    9gT r03 = (9gT) this.A01;
                    if (!r03.A05.isEmpty()) {
                        9gT.A00(r03);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (set.contains("get_account_capabilities")) {
                    0fH.A0j("MsysAccountCapabilitiesStoreImplementation", "GetAccountCapabilities SP updated!");
                    ((MsysAccountCapabilitiesStoreImplementation) this.A01).A00(null);
                    return;
                }
                return;
            case 2:
                11T.A0F(set, 0);
                if (set.contains("CUKShouldShowCombinedThreadCreation")) {
                    0fH.A0j("ThirdPartyAppsSettingsRepository", "CUKShouldShowCombinedThreadCreation store procedure changed");
                    A0y = 7zN.A0y();
                    obj = this.A01;
                    i = 8;
                    aJd = new AJd(obj, null, i);
                    2aK.A03((Integer) null, (0DE) null, aJd, A0y, 3);
                    return;
                }
                return;
            case 3:
                11T.A0F(set, 0);
                if (set.contains("CUKIsInteropOptedIn")) {
                    0fH.A0j("ThirdPartyAppsSettingsRepository", "CUKIsInteropOptedIn store procedure changed");
                    A0y = 7zN.A0y();
                    obj = this.A01;
                    i = 9;
                    aJd = new AJd(obj, null, i);
                    2aK.A03((Integer) null, (0DE) null, aJd, A0y, 3);
                    return;
                }
                return;
            case 4:
                if (set.contains(1BJ.A00(1257))) {
                    3Mo r04 = (3Mo) this.A01;
                    ((C2ba) 1Br.A0B(r04.A04)).A00(new C3b7(r04, 15));
                    return;
                }
                return;
            case 5:
                if (set.contains("events_for_thread")) {
                    C89v c89v = (C89v) this.A01;
                    synchronized (c89v) {
                        C89v.A00(c89v.A01, c89v, c89v.A00);
                    }
                    return;
                }
                return;
            case 6:
                if (set.contains("highlights_tab_fetch_range")) {
                    0fH.A0j("HighlightsTabV2BadgeController", "[HighlightsTabFetchRange] New Results Found");
                    C8rM c8rM = (C8rM) this.A01;
                    c8rM.A08.A0A(AVD.A01(c8rM, 13));
                    return;
                }
                return;
            case 7:
                C9t4 c9t4 = (C9t4) this.A01;
                if (!set.contains("get_location_addresses") || (r0 = c9t4.A00) == null) {
                    return;
                }
                A0y = 2aG.A02(c9t4.A01);
                aJd = AJi.A03(r0, c9t4, null, 32);
                2aK.A03((Integer) null, (0DE) null, aJd, A0y, 3);
                return;
            case 8:
                if (set.contains(1BJ.A00(1563))) {
                    C3Sx.A00((C3Sx) this.A01);
                    return;
                }
                return;
            case 9:
                if (set.contains("chat_entity_user_control_by_message_id")) {
                    UserControlDataLoad userControlDataLoad = (UserControlDataLoad) this.A01;
                    AnonymousClass231 anonymousClass231 = (AnonymousClass231) 1Br.A0B(userControlDataLoad.A01);
                    String str = userControlDataLoad.A00;
                    if (str == null) {
                        11T.A0L("mostRecentMessageId");
                        throw 0Q8.createAndThrow();
                    }
                    anonymousClass231.A02(userControlDataLoad.A06, str);
                    return;
                }
                return;
            default:
                if (!set.contains("music_picker_songs") || (r02 = ((C9ck) this.A01).A00) == null) {
                    return;
                }
                MusicPickerBottomSheetFragment.A05(r02.A00);
                return;
        }
    }
}
