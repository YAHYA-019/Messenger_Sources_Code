package X;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.messengerextensions.model.MessengerExtensionProperties;
import com.facebook.messaging.games.model.InstantGameChannel;
import com.facebook.user.model.ManagingParent;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.WorkUserForeignEntityInfo;
import com.facebook.user.model.WorkUserInfo;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.facebook.user.profilepic.ProfilePicUriWithFilePath;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4yp.class */
public final class C12094yp {
    public final C00i A00;
    public final C12074yn A03 = (C12074yn) 1Bn.A0A(49415);
    public final C00i A01 = new 1BQ(83605);
    public final C12084yo A02 = (C12084yo) 1Bn.A0A(49416);

    public C12094yp(FbUserSession fbUserSession) {
        Integer num = 1Lo.A05;
        this.A00 = new 1MV(fbUserSession, 49346);
    }

    public static void A00(SQLiteDatabase sQLiteDatabase) {
        try {
            C01m.A03(sQLiteDatabase, -142284440);
        } catch (IllegalStateException e) {
            1BL.A0I().softReport("threads db closed", e);
        }
    }

    public void A01(List list) {
        RuntimeException A0s;
        String A0W;
        String A0W2;
        String A00;
        SQLiteDatabase A002 = C10654u8.A00(this.A00);
        try {
            try {
                C01m.A01(A002, 353099427);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    User user = (User) it.next();
                    ContentValues A07 = 4YU.A07();
                    A07.put("user_key", user.A0k.A05());
                    Name name = user.A0X;
                    if (name != null) {
                        A07.put("first_name", name.firstName);
                        A07.put("last_name", name.lastName);
                        A07.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, name.displayName);
                    }
                    A07.put("username", user.A1N);
                    A07.put("messenger_call_log_third_party_id", user.A1I);
                    if (user.A04() != null) {
                        PicSquare A04 = user.A04();
                        C26T c26t = C26T.A00;
                        C03353xs c03353xs = new C03353xs(c26t);
                        1Du it2 = A04.mPicSquareUrlsWithSizes.iterator();
                        while (it2.hasNext()) {
                            PicSquareUrlWithSize picSquareUrlWithSize = (PicSquareUrlWithSize) it2.next();
                            2DM A0g = 4YU.A0g(c26t);
                            A0g.A0o("url", picSquareUrlWithSize.url);
                            A0g.A0i("size", picSquareUrlWithSize.size);
                            c03353xs.A0d(A0g);
                        }
                        4YU.A1D(A07, c03353xs, "profile_pic_square");
                    }
                    int i = 1;
                    4YU.A1E(A07, "is_messenger_user", AnonymousClass001.A1N(user.A1e ? 1 : 0) ? 1 : 0);
                    4YU.A1E(A07, "allow_admin_create_appointment", AnonymousClass001.A1N(user.A1Y ? 1 : 0) ? 1 : 0);
                    4YU.A1E(A07, "is_commerce", AnonymousClass001.A1N(user.A1Z ? 1 : 0) ? 1 : 0);
                    4YU.A1E(A07, "is_partial", AnonymousClass001.A1N(user.A29 ? 1 : 0) ? 1 : 0);
                    A07.put("user_rank", Float.valueOf(user.A08));
                    A07.put("profile_type", user.A1U);
                    1Kq r0 = user.A0U;
                    if (r0 == 1Kq.A0D) {
                        0fH.A0E(C12094yp.class, "Writing an unset messaging actor type to thread users db");
                    }
                    A07.put("messaging_actor_type", r0.name());
                    4YU.A1F(A07, "is_blocked_by_viewer", user.A1q);
                    4YU.A1F(A07, "is_message_blocked_by_viewer", user.A23);
                    4YU.A1F(A07, "is_pseudo_blocked_by_viewer", user.A2A);
                    4YU.A1F(A07, "is_banned_by_page_viewer", user.A1p);
                    4YV.A16(A07, "fb_unblock_time", user.A0N);
                    Integer num = user.A0w;
                    String str = null;
                    A07.put("commerce_page_type", num == null ? null : CBP.A01(num));
                    4YU.A1F(A07, "can_viewer_message", user.A1h);
                    ImmutableList immutableList = user.A0q;
                    if (immutableList != null) {
                        2DM A0f = 4YU.A0f();
                        A0f.A0p("commerce_faq_enabled", immutableList.contains(BLW.A01));
                        A0f.A0p("in_messenger_shopping_enabled", immutableList.contains(BLW.A04));
                        A0f.A0p("commerce_nux_enabled", immutableList.contains(BLW.A02));
                        A0f.A0p("structured_menu_enabled", immutableList.contains(BLW.A06));
                        A0f.A0p("user_control_topic_manage_enabled", immutableList.contains(BLW.A07));
                        A0f.A0p("null_state_cta_button_always_enabled", immutableList.contains(BLW.A05));
                        A0f.A0p("composer_input_disabled", immutableList.contains(BLW.A03));
                        str = A0f.toString();
                    }
                    A07.put("commerce_page_settings", str);
                    4YU.A1F(A07, "is_friend", user.A1c);
                    A07.put("friendship_status", user.A0a.name());
                    4YU.A1E(A07, "mutual_friends_count", user.A0H);
                    4YV.A16(A07, "last_fetch_time", user.A00);
                    A07.put("montage_thread_fbid", String.valueOf(user.A0O));
                    4YU.A1F(A07, "is_messenger_bot", user.A1d);
                    4YU.A1F(A07, "is_vc_endpoint", user.A1f);
                    4YU.A1F(A07, "is_messenger_platform_bot", user.A26);
                    4YU.A1F(A07, "is_messenger_welcome_page_cta_enabled", user.A27);
                    4YU.A1F(A07, "is_business_active", user.A1r);
                    MessengerExtensionProperties messengerExtensionProperties = user.A0V;
                    if (messengerExtensionProperties != null) {
                        2DM A0f2 = 4YU.A0f();
                        A0f2.A0o("resume_url", messengerExtensionProperties.A02);
                        A0f2.A0o("resume_text", messengerExtensionProperties.A01);
                        A0f2.A0o("payment_policy", messengerExtensionProperties.A00);
                        A07.put("extension_properties", A0f2.toString());
                    }
                    4YU.A1F(A07, "does_accept_user_feedback", user.A1j);
                    Integer num2 = user.A0x;
                    if (num2 != null) {
                        A07.put("contact_relationship_status", C3P4.A01(num2));
                    }
                    Integer num3 = user.A0z;
                    if (num3 != null) {
                        switch (num3.intValue()) {
                            case 1:
                                A00 = "FOLLOWING";
                                break;
                            case 2:
                                A00 = AbE.A00(37);
                                break;
                            default:
                                A00 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                                break;
                        }
                        A07.put("viewer_ig_follow_status", A00);
                    }
                    4YU.A1F(A07, "is_memorialized", user.A22);
                    4YU.A1F(A07, "is_broadcast_recipient_holdout", user.A1X);
                    ImmutableList immutableList2 = user.A0u;
                    if (immutableList2 != null) {
                        A07.put("nested_menu_call_to_actions", CNx.A03(immutableList2));
                    }
                    ImmutableList immutableList3 = user.A0v;
                    if (immutableList3 != null && !immutableList3.isEmpty()) {
                        C26T c26t2 = C26T.A00;
                        C03353xs c03353xs2 = new C03353xs(c26t2);
                        1Du it3 = immutableList3.iterator();
                        while (it3.hasNext()) {
                            ManagingParent managingParent = (ManagingParent) it3.next();
                            2DM A0g2 = 4YU.A0g(c26t2);
                            A0g2.A0o("managing_parent_id", managingParent.mId);
                            c03353xs2.A0d(A0g2);
                        }
                        4YU.A1D(A07, c03353xs2, "managing_ps");
                    }
                    InstantGameChannel instantGameChannel = user.A0W;
                    if (instantGameChannel != null) {
                        C12084yo c12084yo = this.A02;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            c12084yo.A00.A0a(byteArrayOutputStream, instantGameChannel);
                        } catch (IOException unused) {
                            1BK.A09(c12084yo.A01).D0v("DbInstantGameChannelSerialization", "Failed to serialize InstantGameChannel");
                        }
                        String obj = byteArrayOutputStream.toString();
                        if (!Platform.stringIsNullOrEmpty(obj)) {
                            A07.put("instant_game_channel", obj);
                        }
                    }
                    4YU.A1E(A07, "is_aloha_proxy_confirmed", AnonymousClass001.A1N(user.A1n ? 1 : 0) ? 1 : 0);
                    ImmutableList immutableList4 = user.A0s;
                    if (immutableList4 != null && !immutableList4.isEmpty()) {
                        try {
                            A07.put("aloha_proxy_user_owners", AnonymousClass243.A00().A0W(immutableList4));
                        } catch (IOException e) {
                            A0s = 1BK.A0s("Unexpected serialization exception", e);
                            throw A0s;
                        }
                    }
                    4YU.A1F(A07, "is_message_ignored_by_viewer", user.A24);
                    ImmutableList immutableList5 = user.A0t;
                    if (immutableList5 != null && !immutableList5.isEmpty()) {
                        try {
                            A07.put("aloha_proxy_users_owned", AnonymousClass243.A00().A0W(immutableList5));
                        } catch (IOException e2) {
                            A0s = 1BK.A0s("Unexpected serialization exception", e2);
                            throw A0s;
                        }
                    }
                    4YU.A1E(A07, "is_conversation_ice_breaker_enabled", AnonymousClass001.A1N(user.A1s ? 1 : 0) ? 1 : 0);
                    4YU.A1E(A07, "is_work_user", AnonymousClass001.A1N(user.A1g ? 1 : 0) ? 1 : 0);
                    A07.put("favorite_color", user.A1D);
                    4YU.A1E(A07, "is_viewer_managing_parent", AnonymousClass001.A1N(user.A2C ? 1 : 0) ? 1 : 0);
                    4YU.A1E(A07, "is_verified", AnonymousClass001.A1N(user.A2B ? 1 : 0) ? 1 : 0);
                    ProfilePicUriWithFilePath profilePicUriWithFilePath = user.A2O;
                    if (profilePicUriWithFilePath != null) {
                        A07.put("inbox_profile_pic_uri", profilePicUriWithFilePath.profilePicUri);
                        A07.put("inbox_profile_pic_file_path", profilePicUriWithFilePath.filePath);
                    }
                    if (4YV.A1Y(this.A01)) {
                        WorkUserInfo workUserInfo = user.A0n;
                        if (workUserInfo == null) {
                            A0W = null;
                        } else {
                            try {
                                A0W = AnonymousClass243.A00().A0W(workUserInfo);
                            } catch (IOException e3) {
                                A0s = 1BK.A0s("Unexpected serialization exception", e3);
                                throw A0s;
                            }
                        }
                        A07.put("work_info", A0W);
                        WorkUserForeignEntityInfo workUserForeignEntityInfo = user.A0m;
                        if (workUserForeignEntityInfo == null) {
                            A0W2 = null;
                        } else {
                            try {
                                A0W2 = AnonymousClass243.A00().A0W(workUserForeignEntityInfo);
                            } catch (IOException e4) {
                                A0s = 1BK.A0s("Unexpected serialization exception", e4);
                                throw A0s;
                            }
                        }
                        A07.put("work_foreign_entity_info", A0W2);
                    }
                    4YU.A1E(A07, "is_ig_creator_account", AnonymousClass001.A1N(user.A1z ? 1 : 0) ? 1 : 0);
                    if (!user.A1y) {
                        i = 0;
                    }
                    4YU.A1E(A07, "is_ig_business_account", i);
                    1Ks r02 = user.A0p;
                    if (r02 != null) {
                        A07.put("restriction_type", r02.dbValue);
                    }
                    4YU.A1E(A07, "birthday_month", user.A0A);
                    4YU.A1E(A07, "birthday_day", user.A09);
                    4YV.A16(A07, "contact_capabilities", user.A0K);
                    4YV.A16(A07, "contact_capabilities2", user.A0L);
                    4YU.A1F(A07, "is_employee", user.A1a);
                    4YU.A1F(A07, "is_interop_eligible", user.A20);
                    String str2 = user.A1O;
                    if (str2 != null) {
                        A07.put("username_for_profile", str2);
                    }
                    C01m.A00(1593183113);
                    A002.replaceOrThrow("thread_users", "", A07);
                    C01m.A00(-1045975457);
                }
                A002.setTransactionSuccessful();
            } catch (SQLException e5) {
                0fH.A0K(C12094yp.class, "SQLException", e5);
                throw e5;
            } catch (IllegalStateException e6) {
                1BL.A0I().softReport("threads db closed", e6);
            }
        } finally {
            A00(A002);
        }
    }
}
