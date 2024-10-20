package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.events.creation.CommunityMessagingEventCreationViewData$CommunityInfo;
import com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D8t.class */
public final class D8t implements Runnable {
    public static final String __redex_internal_original_name = "BaseEventCreationFragment$eventCreationStatusListener$1$onCreationSuccess$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AbstractC1551Al6 A02;

    public D8t(AbstractC1551Al6 abstractC1551Al6, long j, long j2) {
        this.A02 = abstractC1551Al6;
        this.A00 = j;
        this.A01 = j2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.B4M, X.Al6, androidx.fragment.app.Fragment] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        CommunityMessagingEventCreationViewData$CommunityInfo communityMessagingEventCreationViewData$CommunityInfo;
        Long A0e;
        AbstractC1551Al6 abstractC1551Al6 = this.A02;
        long j = this.A01;
        if (abstractC1551Al6 instanceof B4N) {
            B4N b4n = (B4N) abstractC1551Al6;
            View view = b4n.A00;
            if (view != null) {
                view.post(new D5X(b4n));
                return;
            }
            str = "containerView";
        } else {
            ?? r0 = (B4M) abstractC1551Al6;
            if (CNk.A00((AbstractC1551Al6) r0).A0A) {
                B4M.A06(r0);
                6HS r02 = (6HS) 7zO.A0m((Fragment) r0, 50024);
                String str2 = r0.A03;
                if (str2 == null || (A0e = 0CW.A0e(str2)) == null) {
                    return;
                }
                r02.A07(ThreadKey.A03(A0e.longValue()), "standalone_event_association");
                return;
            }
            DIQ diq = r0.A03;
            if (diq != null) {
                Parcelable BC7 = diq.BC7();
                String str3 = (!(BC7 instanceof CommunityMessagingEventCreationViewData$CommunityInfo) || (communityMessagingEventCreationViewData$CommunityInfo = (CommunityMessagingEventCreationViewData$CommunityInfo) BC7) == null) ? null : communityMessagingEventCreationViewData$CommunityInfo.A00;
                CGp cGp = (CGp) 7zO.A0l((Fragment) r0, 83009);
                FbUserSession fbUserSession = r0.A00;
                if (fbUserSession == null) {
                    str = "fbUserSession";
                } else {
                    Context requireContext = r0.requireContext();
                    ThreadKey A03 = ThreadKey.A03(j);
                    1pI r03 = r0.A01;
                    if (r03 == null) {
                        str = "contentViewManager";
                    } else {
                        Long valueOf = Long.valueOf(r0.A00);
                        CommunityChannelPrivacyType communityChannelPrivacyType = CommunityChannelPrivacyType.PUBLIC;
                        LithoView lithoView = r0.A02;
                        if (lithoView != null) {
                            cGp.A01(requireContext, lithoView, fbUserSession, r03, communityChannelPrivacyType, A03, valueOf, B4M.__redex_internal_original_name, str3, B4M.__redex_internal_original_name, (String) null, false);
                            return;
                        }
                        str = "titlebarView";
                    }
                }
            } else {
                str = "eventCreationViewData";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
