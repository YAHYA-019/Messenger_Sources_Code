package X;

import android.content.Context;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.model.bottomsheet.HighlightsFeedMenuItem;
import com.facebook.messaging.highlightstab.plugins.menuitem.localinjection.LocalInjectionMenuItemImplementation;
import com.facebook.messaging.highlightstab.plugins.menuitem.morerecommendedpublicchannelsmenuitem.MoreRecommendedPublicChannelsMenuItemImplementation;
import com.facebook.messaging.highlightstab.plugins.menuitem.notinterestedfeedmenuitem.NotInterestedFeedMenuItemImplementation;
import com.facebook.messaging.highlightstab.plugins.menuitem.removelocalinjection.RemoveLocalInjectionMenuItemImplementation;
import com.facebook.messaging.highlightstab.plugins.menuitem.seemorepeopleyoumayknowmenuitem.SeeMorePeopleYouMayKnowMenuItemImplementation;
import com.facebook.messaging.highlightstab.plugins.menuitem.viewonfacebookmenuitem.ViewOnFacebookMenuItemImplementation;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9w1, reason: invalid class name */
/* loaded from: 9w1.class */
public final class C9w1 implements AXv {
    public final /* synthetic */ 9JB A00;
    public final /* synthetic */ 2R0 A01;
    public final /* synthetic */ HighlightsFeedContent A02;
    public final /* synthetic */ 9JL A03;

    public C9w1(9JB r302, 2R0 r303, HighlightsFeedContent highlightsFeedContent, 9JL r305) {
        this.A01 = r303;
        this.A02 = highlightsFeedContent;
        this.A03 = r305;
        this.A00 = r302;
    }

    @Override // X.AXv
    public void C2Z(HighlightsFeedMenuItem highlightsFeedMenuItem) {
        int andIncrement;
        String str;
        int i = highlightsFeedMenuItem.A00;
        2R0.A08(i != 1 ? i != 5 ? C98S.A0U : C98S.A0D : C98S.A0H, (3Ec) null, this.A01, (HighlightsAttachmentContent) null, this.A02);
        9Gj r0 = this.A03.A00;
        9nG r02 = r0.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r03 = r02.A0F;
        r03.A08("com.facebook.messaging.highlightstab.plugins.interfaces.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
        try {
            try {
                try {
                    if (i == 7) {
                        if (9nG.A05(r02)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.highlightstab.menuitem.seemorepeopleyoumayknowmenuitem.SeeMorePeopleYouMayKnowMenuItemImplementation";
                            r03.A0A("com.facebook.messaging.highlightstab.plugins.menuitem.seemorepeopleyoumayknowmenuitem.SeeMorePeopleYouMayKnowMenuItemImplementation", str, "com.facebook.messaging.highlightstab.plugins.interfaces.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", andIncrement, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.menuitem.HighlightstabMenuitemKillSwitch", "onHighlightsFeedMenuItemClick");
                            SeeMorePeopleYouMayKnowMenuItemImplementation seeMorePeopleYouMayKnowMenuItemImplementation = r02.A04;
                            1pI r04 = seeMorePeopleYouMayKnowMenuItemImplementation.A01;
                            if (r04.BVa()) {
                                7zQ.A0g().A00(seeMorePeopleYouMayKnowMenuItemImplementation.A00).A0K(C98S.A0R, 2R7.A0I);
                                7zV.A0x(r04);
                            }
                            r03.A09(str, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement);
                            r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                        }
                        r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                    } else if (i == 5) {
                        if (9nG.A02(r02)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.highlightstab.menuitem.morerecommendedpublicchannelsmenuitem.MoreRecommendedPublicChannelsMenuItemImplementation";
                            r03.A0A("com.facebook.messaging.highlightstab.plugins.menuitem.morerecommendedpublicchannelsmenuitem.MoreRecommendedPublicChannelsMenuItemImplementation", str, "com.facebook.messaging.highlightstab.plugins.interfaces.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", andIncrement, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.menuitem.HighlightstabMenuitemKillSwitch", "onHighlightsFeedMenuItemClick");
                            MoreRecommendedPublicChannelsMenuItemImplementation moreRecommendedPublicChannelsMenuItemImplementation = r02.A01;
                            5SW r05 = 5SW.A0p;
                            ((CQo) 1Br.A0B(moreRecommendedPublicChannelsMenuItemImplementation.A02)).A0Q(r05, moreRecommendedPublicChannelsMenuItemImplementation.A03.A00);
                            8Gt.A0F.A00(moreRecommendedPublicChannelsMenuItemImplementation.A01, r05);
                            r03.A09(str, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement);
                            r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                        }
                        r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                    } else if (i == 6) {
                        if (9nG.A06(r02)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.highlightstab.menuitem.viewinchat.HighlightsViewInChatContexualMenuItemImplementation";
                            r03.A0A("com.facebook.messaging.highlightstab.plugins.menuitem.viewinchat.HighlightsViewInChatContexualMenuItemImplementation", str, "com.facebook.messaging.highlightstab.plugins.interfaces.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", andIncrement, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.menuitem.HighlightstabMenuitemKillSwitch", "onHighlightsFeedMenuItemClick");
                            r03.A09(str, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement);
                            r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                        }
                        r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                    } else if (i == 2) {
                        if (9nG.A07(r02)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.highlightstab.menuitem.viewonfacebookmenuitem.ViewOnFacebookMenuItemImplementation";
                            r03.A0A("com.facebook.messaging.highlightstab.plugins.menuitem.viewonfacebookmenuitem.ViewOnFacebookMenuItemImplementation", str, "com.facebook.messaging.highlightstab.plugins.interfaces.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", andIncrement, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.menuitem.HighlightstabMenuitemKillSwitch", "onHighlightsFeedMenuItemClick");
                            ViewOnFacebookMenuItemImplementation viewOnFacebookMenuItemImplementation = r02.A06;
                            Context context = viewOnFacebookMenuItemImplementation.A00;
                            String str2 = viewOnFacebookMenuItemImplementation.A01.A0O;
                            if (str2 == null) {
                                throw 1BK.A0h();
                            }
                            9dJ.A00(context, C5id.A10, str2);
                            r03.A09(str, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement);
                            r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                        }
                        r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                    } else if (i == 1) {
                        if (9nG.A03(r02)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.highlightstab.menuitem.notinterestedfeedmenuitem.NotInterestedFeedMenuItemImplementation";
                            r03.A0A("com.facebook.messaging.highlightstab.plugins.menuitem.notinterestedfeedmenuitem.NotInterestedFeedMenuItemImplementation", str, "com.facebook.messaging.highlightstab.plugins.interfaces.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", andIncrement, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.menuitem.HighlightstabMenuitemKillSwitch", "onHighlightsFeedMenuItemClick");
                            NotInterestedFeedMenuItemImplementation notInterestedFeedMenuItemImplementation = r02.A02;
                            1yI r06 = (1yI) 1Lm.A05(notInterestedFeedMenuItemImplementation.A00, 1Br.A03(notInterestedFeedMenuItemImplementation.A02), 67248);
                            HighlightsFeedContent highlightsFeedContent = notInterestedFeedMenuItemImplementation.A03;
                            A1d.A01(r06.A03(((AnonymousClass224) 1Br.A0B(notInterestedFeedMenuItemImplementation.A01)).A00("1299289207322385"), highlightsFeedContent.A0P, highlightsFeedContent.A0W, highlightsFeedContent.A05).A01, notInterestedFeedMenuItemImplementation, 55);
                            r03.A09(str, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement);
                            r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                        }
                        r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                    } else if (i == 3) {
                        if (9nG.A01(r02)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.highlightstab.menuitem.localinjection.LocalInjectionMenuItemImplementation";
                            r03.A0A("com.facebook.messaging.highlightstab.plugins.menuitem.localinjection.LocalInjectionMenuItemImplementation", str, "com.facebook.messaging.highlightstab.plugins.interfaces.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", andIncrement, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.menuitem.HighlightstabMenuitemKillSwitch", "onHighlightsFeedMenuItemClick");
                            LocalInjectionMenuItemImplementation localInjectionMenuItemImplementation = r02.A00;
                            5cW r07 = (5cW) 1Br.A0B(localInjectionMenuItemImplementation.A01);
                            HighlightsFeedContent highlightsFeedContent2 = localInjectionMenuItemImplementation.A02;
                            String str3 = highlightsFeedContent2.A0P;
                            11T.A0F(str3, 0);
                            5cW.A01(r07, highlightsFeedContent2, 0Pz.A0W("INJECTED_FEED_CONTENT_ID_", str3));
                            localInjectionMenuItemImplementation.A03.C4t();
                            r03.A09(str, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement);
                            r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                        }
                        r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                    } else {
                        if (i == 4 && 9nG.A04(r02)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.highlightstab.menuitem.removelocalinjection.RemoveLocalInjectionMenuItemImplementation";
                            r03.A0A("com.facebook.messaging.highlightstab.plugins.menuitem.removelocalinjection.RemoveLocalInjectionMenuItemImplementation", str, "com.facebook.messaging.highlightstab.plugins.interfaces.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", andIncrement, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.menuitem.HighlightstabMenuitemKillSwitch", "onHighlightsFeedMenuItemClick");
                            RemoveLocalInjectionMenuItemImplementation removeLocalInjectionMenuItemImplementation = r02.A03;
                            ((5cW) 1Br.A0B(removeLocalInjectionMenuItemImplementation.A01)).A02(removeLocalInjectionMenuItemImplementation.A02);
                            removeLocalInjectionMenuItemImplementation.A03.CGP();
                            r03.A09(str, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement);
                            r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                        }
                        r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                    }
                    2Ov r08 = this.A00.A00;
                    if (r08 == null || !r08.isAdded() || r08.isStateSaved()) {
                        return;
                    }
                    r08.A0o();
                } catch (Throwable th) {
                    r03.A04((Exception) null, r0, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", i);
                    throw th;
                }
            } catch (Throwable th2) {
                r03.A02((Exception) null, "messaging.highlightstab.bottomsheet.HighlightsFeedBottomSheetInterfaceSpec", "onHighlightsFeedMenuItemClick", andIncrement2);
                throw th2;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
