package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.categorydeletion.DeleteCategoryDialogFragment;
import com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.communitymessaging.plugins.channellist.channelcreationmenu.ChannelCreationFoldersMenuItemImplementation;
import com.facebook.messaging.communitymessaging.plugins.channelorganization.managecategorymenuitems.deletecategoryitem.DeleteCategoryItemImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Cuc.class */
public final class Cuc implements DG8 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Cuc(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.DG8
    public final boolean C2c(View view) {
        String str;
        if (this.A00 != 0) {
            try {
                DeleteCategoryItemImplementation deleteCategoryItemImplementation = (DeleteCategoryItemImplementation) this.A01;
                long longValue = deleteCategoryItemImplementation.A04.longValue();
                C1776AsA c1776AsA = (C1776AsA) AbH.A14(deleteCategoryItemImplementation.A03, C1776AsA.class);
                if (c1776AsA != null) {
                    String str2 = c1776AsA.A03;
                    if (str2 != null) {
                        ThreadKey threadKey = deleteCategoryItemImplementation.A01;
                        String str3 = this.A02;
                        Bundle A05 = 1BK.A05();
                        A05.putLong("arg_category_id", longValue);
                        A05.putString("arg_category_name", str2);
                        A05.putParcelable("folder_thread_key", threadKey);
                        A05.putString("group_id", str3);
                        2Ov deleteCategoryDialogFragment = new DeleteCategoryDialogFragment();
                        deleteCategoryDialogFragment.setArguments(A05);
                        deleteCategoryDialogFragment.A0m(deleteCategoryItemImplementation.A00, "delete_category_fragment");
                        return true;
                    }
                }
                throw AnonymousClass001.A0N("Required value was null.");
            } catch (IllegalStateException unused) {
                return true;
            }
        }
        11T.A0F(view, 0);
        ChannelCreationFoldersMenuItemImplementation channelCreationFoldersMenuItemImplementation = (ChannelCreationFoldersMenuItemImplementation) this.A01;
        ParcelableSecondaryData parcelableSecondaryData = channelCreationFoldersMenuItemImplementation.A02;
        CommunityExtraData communityExtraData = (CommunityExtraData) ParcelableSecondaryData.A00(parcelableSecondaryData, CommunityExtraData.class, null);
        String str4 = communityExtraData != null ? communityExtraData.A06 : null;
        if (str4 == null) {
            throw AnonymousClass001.A0N("groupId shouldn't be null");
        }
        CommunityExtraData communityExtraData2 = (CommunityExtraData) ParcelableSecondaryData.A00(parcelableSecondaryData, CommunityExtraData.class, null);
        if (communityExtraData2 != null) {
            long j = communityExtraData2.A00;
            if (Long.valueOf(j) != null) {
                Context context = channelCreationFoldersMenuItemImplementation.A00;
                String valueOf = String.valueOf(j);
                String str5 = this.A02;
                str = "community_settings";
                7zR.A0W().A04(new CommunityMessagingLoggerModel(null, null, valueOf, str4, null, null, "create_chat_button", 11T.A0O(str5, str) ? "community_settings" : "channel_list", "render_chat_creation_sheet", "messenger", null, null));
                1Bn.A0A(147536);
                CHV.A00(new CHV(context, channelCreationFoldersMenuItemImplementation.A01, (CommunityChannelPrivacyType) null, channelCreationFoldersMenuItemImplementation.A03, str5, (String) null, (String) null, str4, (String) null, j), false);
                return true;
            }
        }
        throw AnonymousClass001.A0N("groupId shouldn't be null");
    }
}
