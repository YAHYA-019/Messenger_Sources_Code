package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.art.CompositionInfo;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: I9l.class */
public abstract class I9l {
    public static int A00(C6r6 c6r6) {
        switch (c6r6.ordinal()) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
                return 0;
            case 33:
            case 34:
                return 2;
            case 38:
                return 3;
            case 39:
                return 18;
            default:
                return 999;
        }
    }

    public static ImmutableMap A01(MontageCard montageCard, String str, String str2, boolean z) {
        String str3 = str2;
        if (!str2.contains("{")) {
            str3 = 0Pz.A0z("{\"r\":\"", str2, "\",\"u\":", z ? "548653741981572" : "", "}");
        }
        return ImmutableMap.of((Object) "ld", (Object) str3, (Object) "montage_viewer", (Object) 0Pz.A0j(Long.toString(montageCard.A03), ":", montageCard.A0E), (Object) 4YT.A00(1304), (Object) str, (Object) "contacts_tab", z ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
    }

    public static String A02(List list) {
        int i;
        int i2;
        C26T c26t = C26T.A00;
        C03353xs c03353xs = new C03353xs(c26t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CompositionInfo compositionInfo = (CompositionInfo) it.next();
            2DM A0g = 4YU.A0g(c26t);
            A0g.A0o("application", HIL.A00(compositionInfo.A0C));
            A0g.A0o("art_picker_source", HIK.A00(compositionInfo.A0B));
            A0g.A0o("art_id", compositionInfo.A0D);
            int i3 = compositionInfo.A00;
            if (i3 != -1) {
                A0g.A0i("carousel_index", i3);
            }
            String str = compositionInfo.A0E;
            if (str != null) {
                A0g.A0o("doodle_brush", str);
                if (str.equals("PEN") && (i2 = compositionInfo.A05) != 0) {
                    A0g.A0o("doodle_color", Integer.toHexString(i2).toUpperCase(Locale.US));
                }
                if (str.equals("EMOJI") && (i = compositionInfo.A06) != -1) {
                    A0g.A0o("doodle_emoji", Integer.toHexString(i).toUpperCase(Locale.US));
                }
                int i4 = compositionInfo.A07;
                if (i4 != -1) {
                    A0g.A0i("doodle_width", i4);
                }
            }
            int i5 = compositionInfo.A09;
            if (i5 != 0) {
                A0g.A0o(DKB.A00(ActionId.PREV_ACTIVITY_PAUSE), Integer.toHexString(i5).toUpperCase(Locale.US));
            }
            String str2 = compositionInfo.A0L;
            if (!TextUtils.isEmpty(str2)) {
                A0g.A0o("text_style", str2);
            }
            int i6 = compositionInfo.A0A;
            if (i6 != -1) {
                A0g.A0i("text_length", i6);
            }
            String str3 = compositionInfo.A0K;
            if (!TextUtils.isEmpty(str3)) {
                A0g.A0o("smart_sticker_style", str3);
            }
            String str4 = compositionInfo.A0F;
            if (!TextUtils.isEmpty(str4)) {
                A0g.A0o("interactive_sticker_style", str4);
            }
            if (compositionInfo.A08 != -1) {
                A0g.A0i("color_adjustment_brightness", compositionInfo.A01);
                A0g.A0i("color_adjustment_contrast", compositionInfo.A02);
                A0g.A0i("color_adjustment_saturation", compositionInfo.A03);
                A0g.A0i("color_adjustment_temperature", compositionInfo.A04);
            }
            String str5 = compositionInfo.A0J;
            if (!Platform.stringIsNullOrEmpty(str5)) {
                A0g.A0o("section_id", str5);
            }
            String str6 = compositionInfo.A0I;
            if (!Platform.stringIsNullOrEmpty(str6)) {
                A0g.A0o(TraceFieldType.RequestID, str6);
            }
            String str7 = compositionInfo.A0H;
            if (!TextUtils.isEmpty(str7)) {
                A0g.A0o("photo_sticker_shape", str7);
            }
            String str8 = compositionInfo.A0G;
            if (str8 != null) {
                A0g.A0o("media_matrix", str8);
            }
            c03353xs.A0d(A0g);
        }
        return c03353xs.toString();
    }

    public static HashMap A03(Bundle bundle) {
        HashMap A0u = AnonymousClass001.A0u();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("art_overlay");
        if (parcelableArrayList != null) {
            A0u.put("composition_info", A02(parcelableArrayList));
        }
        String string = bundle.getString("montage_background_color");
        if (!1JF.A0B(string)) {
            A0u.put("background_color", string);
        }
        String string2 = bundle.getString("montage_composer_entry_point");
        if (!1JF.A0B(string2)) {
            A0u.put("entry_point", string2);
        }
        String string3 = bundle.getString("composition_session_id");
        if (!1JF.A0B(string3)) {
            A0u.put("composition_session_id", string3);
        }
        return A0u;
    }
}
