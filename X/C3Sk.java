package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeReactionAssetInfo;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3Sk, reason: invalid class name */
/* loaded from: 3Sk.class */
public final class C3Sk {
    public final C00i A00 = 1BV.A00(116312);

    public static String A00(C00i c00i, ImmutableList.Builder builder) {
        return ((C3RJ) c00i.get()).A04(builder.build());
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, C3Sk c3Sk, ThreadThemeInfo threadThemeInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(threadThemeInfo.A0T));
        contentValues.put("normal_theme_id", Long.valueOf(threadThemeInfo.A0S));
        contentValues.put("app_color_mode", threadThemeInfo.A00());
        Uri uri = threadThemeInfo.A0V;
        if (uri != null) {
            contentValues.put("large_background_uri", uri.toString());
        }
        Uri uri2 = threadThemeInfo.A0Y;
        if (uri2 != null) {
            contentValues.put("small_icon_asset_uri", uri2.toString());
        }
        Uri uri3 = threadThemeInfo.A0W;
        if (uri3 != null) {
            contentValues.put("large_icon_asset_uri", uri3.toString());
        }
        ImmutableList immutableList = threadThemeInfo.A0d;
        if (!immutableList.isEmpty()) {
            ImmutableList.Builder builder = ImmutableList.builder();
            ImmutableList.Builder builder2 = ImmutableList.builder();
            ImmutableList.Builder builder3 = ImmutableList.builder();
            ImmutableList.Builder builder4 = ImmutableList.builder();
            ImmutableList.Builder builder5 = ImmutableList.builder();
            int size = immutableList.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                ThreadThemeReactionAssetInfo threadThemeReactionAssetInfo = (ThreadThemeReactionAssetInfo) immutableList.get(i2);
                String str = "";
                String str2 = 1JF.A0B(threadThemeReactionAssetInfo.A03) ? str : threadThemeReactionAssetInfo.A03;
                String str3 = 1JF.A0B(threadThemeReactionAssetInfo.A04) ? str : threadThemeReactionAssetInfo.A04;
                String obj = threadThemeReactionAssetInfo.A00 == null ? str : threadThemeReactionAssetInfo.A00.toString();
                String obj2 = threadThemeReactionAssetInfo.A02 == null ? str : threadThemeReactionAssetInfo.A02.toString();
                if (threadThemeReactionAssetInfo.A01 != null) {
                    str = threadThemeReactionAssetInfo.A01.toString();
                }
                builder.m11011add((Object) str2);
                builder2.m11011add((Object) str3);
                builder3.m11011add((Object) obj);
                builder4.m11011add((Object) obj2);
                builder5.m11011add((Object) str);
                i = i2 + 1;
            }
            C00i c00i = c3Sk.A00;
            contentValues.put("reaction_asset_ids", A00(c00i, builder));
            contentValues.put("reaction_emojis", A00(c00i, builder2));
            contentValues.put("reaction_kf_uris", A00(c00i, builder3));
            contentValues.put("small_reaction_static_uris", A00(c00i, builder4));
            contentValues.put("small_reaction_static_uris", A00(c00i, builder5));
        }
        contentValues.put("view_mode", threadThemeInfo.A01());
        C00i c00i2 = c3Sk.A00;
        contentValues.put("background_gradient_colors", ((C3RJ) c00i2.get()).A03(threadThemeInfo.A0Z));
        contentValues.put("title_bar_background_color", Integer.valueOf(threadThemeInfo.A0O));
        contentValues.put("title_bar_attribution_color", Integer.valueOf(threadThemeInfo.A0N));
        contentValues.put("composer_background_color", Integer.valueOf(threadThemeInfo.A00));
        contentValues.put("inbound_message_gradient_colors", ((C3RJ) c00i2.get()).A03(threadThemeInfo.A0c));
        contentValues.put("inbound_message_border_color", Integer.valueOf(threadThemeInfo.A0A));
        contentValues.put("inbound_message_border_width", Integer.valueOf(threadThemeInfo.A0B));
        contentValues.put("inbound_message_large_corner_radius", Integer.valueOf(threadThemeInfo.A0C));
        contentValues.put("inbound_message_small_corner_radius", Integer.valueOf(threadThemeInfo.A0D));
        contentValues.put("inbound_message_text_color", Integer.valueOf(threadThemeInfo.A0E));
        contentValues.put("message_border_color", Integer.valueOf(threadThemeInfo.A0F));
        contentValues.put("message_border_width", Integer.valueOf(threadThemeInfo.A0G));
        contentValues.put("message_large_corner_radius", Integer.valueOf(threadThemeInfo.A0H));
        contentValues.put("message_small_corner_radius", Integer.valueOf(threadThemeInfo.A0I));
        contentValues.put("message_text_color", Integer.valueOf(threadThemeInfo.A0J));
        contentValues.put("fallback_color", Integer.valueOf(threadThemeInfo.A08));
        contentValues.put("gradient_colors", ((C3RJ) c00i2.get()).A03(threadThemeInfo.A0a));
        contentValues.put("accessibility_label", threadThemeInfo.A0e);
        contentValues.put("title_bar_text_color", Integer.valueOf(threadThemeInfo.A0Q));
        contentValues.put("title_bar_button_tint_color", Integer.valueOf(threadThemeInfo.A0P));
        contentValues.put("composer_input_background_color", Integer.valueOf(threadThemeInfo.A01));
        contentValues.put("composer_input_placeholder_color", Integer.valueOf(threadThemeInfo.A04));
        contentValues.put("composer_input_border_color", Integer.valueOf(threadThemeInfo.A02));
        contentValues.put("composer_input_border_width", Integer.valueOf(threadThemeInfo.A03));
        contentValues.put("composer_tint_color", Integer.valueOf(threadThemeInfo.A05));
        contentValues.put("composer_unselected_tint_color", Integer.valueOf(threadThemeInfo.A06));
        contentValues.put("delivery_receipt_color", Integer.valueOf(threadThemeInfo.A07));
        contentValues.put("tertiary_text_color", Integer.valueOf(threadThemeInfo.A0M));
        contentValues.put("hot_like_color", Integer.valueOf(threadThemeInfo.A09));
        contentValues.put("primary_button_background_color", Integer.valueOf(threadThemeInfo.A0K));
        contentValues.put("voice_record_soundwave_color", Integer.valueOf(threadThemeInfo.A0R));
        contentValues.put("reaction_pill_background_color", Integer.valueOf(threadThemeInfo.A0L));
        contentValues.put("variant_hash", threadThemeInfo.A0k);
        C3RJ c3rj = (C3RJ) c00i2.get();
        ImmutableList immutableList2 = threadThemeInfo.A0b;
        String str4 = null;
        if (!09K.A01(immutableList2)) {
            try {
                str4 = c3rj.A00.A0W(immutableList2);
            } catch (2LD e) {
                1BK.A09(c3rj.A01).softReport("DbThreadThemeSerialization", 0Pz.A0V("Failed to serialize list ", immutableList2), e);
            }
        }
        contentValues.put("hash_providers", str4);
        contentValues.put("background_gradients", threadThemeInfo.A0h);
        C01m.A00(-909695443);
        sQLiteDatabase.replaceOrThrow(4YT.A00(1524), null, contentValues);
        C01m.A00(-1370536476);
        contentValues.clear();
    }
}
