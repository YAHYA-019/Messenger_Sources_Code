package X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.browser.lite.RecentTabsActivity;
import com.facebook.litho.LithoView;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatarpowerup.AvatarPowerUpSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.stickerhint.StickerHintSuggestedRow;
import java.util.List;

/* loaded from: J67.class */
public final class J67 implements 0zU {
    public final int A00;
    public final Object A01;

    public J67(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final Object emit(Object obj, 0DR r303) {
        2Xd r0;
        LithoView lithoView;
        int i;
        switch (this.A00) {
            case 0:
                ((C06i) this.A01).accept(obj);
                return 04S.A00;
            case 1:
                HBF hbf = (HBF) obj;
                if (hbf != null) {
                    IO7 io7 = (IO7) this.A01;
                    if (!io7.A02) {
                        HZV hzv = io7.A05.A06;
                        String str = hbf.key;
                        11T.A0F(str, 0);
                        HGO.A00(hzv.A00, hzv.A01, str, 38);
                    }
                }
                return 04S.A00;
            case 2:
                03Y r02 = (03Y) obj;
                Object obj2 = r02.first;
                List list = (List) r02.second;
                RecentTabsActivity recentTabsActivity = (RecentTabsActivity) this.A01;
                RecyclerView recyclerView = recentTabsActivity.A00;
                if (recyclerView != null) {
                    2Xd r03 = recyclerView.A0C;
                    if ((r03 instanceof GWP) && (r0 = (GWP) r03) != null) {
                        11T.A0F(list, 0);
                        ((GWP) r0).A00 = list;
                        List list2 = ((GWP) r0).A02;
                        C2hy A00 = C2hw.A00(new GVx(list2, list), true);
                        list2.clear();
                        list2.addAll(((GWP) r0).A00);
                        A00.A02(r0);
                        RecyclerView recyclerView2 = recentTabsActivity.A00;
                        if (recyclerView2 != null) {
                            recyclerView2.A0u(AnonymousClass001.A04(((GWP) r0).A00));
                            if (obj2 == EKs.A03 && list.isEmpty()) {
                                lithoView = recentTabsActivity.A01;
                                if (lithoView != null) {
                                    i = 0;
                                    lithoView.setVisibility(i);
                                }
                                11T.A0L("emptyLayout");
                                throw 0Q8.createAndThrow();
                            }
                            lithoView = recentTabsActivity.A01;
                            if (lithoView != null) {
                                i = 8;
                                lithoView.setVisibility(i);
                            }
                            11T.A0L("emptyLayout");
                            throw 0Q8.createAndThrow();
                        }
                    }
                    return 04S.A00;
                }
                11T.A0L("tabsGrid");
                throw 0Q8.createAndThrow();
            case 3:
                List list3 = (List) obj;
                AvatarPowerUpSuggestedRow avatarPowerUpSuggestedRow = (AvatarPowerUpSuggestedRow) this.A01;
                C9gP c9gP = avatarPowerUpSuggestedRow.A0F;
                11T.A0F(list3, 0);
                c9gP.A04 = list3;
                C9gP.A00(c9gP);
                AvatarPowerUpSuggestedRow.A00(avatarPowerUpSuggestedRow);
                if (1BK.A1Y(list3)) {
                    ((9bU) 1Br.A0B(avatarPowerUpSuggestedRow.A08)).A00(C93k.A00);
                }
                return 04S.A00;
            default:
                List list4 = (List) obj;
                StickerHintSuggestedRow stickerHintSuggestedRow = (StickerHintSuggestedRow) this.A01;
                if (stickerHintSuggestedRow.A03) {
                    IFE ife = stickerHintSuggestedRow.A09;
                    ife.A0A = list4;
                    ife.A08();
                }
                return 04S.A00;
        }
    }
}
