package X;

import com.facebook.notifications.constants.push.NotificationType;
import java.util.Locale;
import kotlin.enums.EnumEntries;

/* renamed from: X.7t2, reason: invalid class name */
/* loaded from: 7t2.class */
public final class C7t2 {
    public static final 7yC A00(String str) {
        String str2;
        int i;
        Object obj;
        EnumEntries enumEntries = NotificationType.A01;
        if (str != null) {
            str2 = str.toUpperCase(Locale.ROOT);
            11T.A0A(str2);
        } else {
            str2 = null;
        }
        NotificationType A00 = C7le.A00(str2);
        if (A00 == NotificationType.A2i || A00 == NotificationType.A2h) {
            i = 82232;
        } else if (A00 == NotificationType.A3s) {
            i = 68170;
        } else if (A00 == NotificationType.A3D) {
            i = 82227;
        } else if (A00 == NotificationType.A3Z) {
            i = 82242;
        } else if (A00 == NotificationType.A2O) {
            i = 82234;
        } else if (A00 == NotificationType.A3P) {
            i = 82247;
        } else if (A00 == NotificationType.A2c) {
            i = 83866;
        } else if (A00 == NotificationType.A3m) {
            i = 82209;
        } else if (A00 == NotificationType.A3v || A00 == NotificationType.A3u || A00 == NotificationType.A3w || A00 == NotificationType.A3x || A00 == NotificationType.A3y) {
            i = 82253;
        } else if (A00 == NotificationType.A2x) {
            i = 82218;
        } else if (A00 == NotificationType.A3t || A00 == NotificationType.A4o) {
            i = 83408;
        } else if (A00 == NotificationType.A0Y || A00 == NotificationType.A3n || A00 == NotificationType.A0X) {
            i = 83407;
        } else if (A00 == NotificationType.A3o) {
            i = 83409;
        } else if (A00 == NotificationType.A3E) {
            i = 82228;
        } else if (A00 == NotificationType.A3H) {
            i = 82229;
        } else if (A00 == NotificationType.A4r) {
            i = 82210;
        } else if (A00 == NotificationType.A3G) {
            i = 83412;
        } else if (A00 == NotificationType.A2Y) {
            i = 82213;
        } else if (A00 == NotificationType.A3O) {
            i = 82235;
        } else if (A00 == NotificationType.A2B) {
            i = 82224;
        } else {
            if (A00 == NotificationType.A3W) {
                obj = 1Bi.A03(83413);
                return (7yC) obj;
            }
            if (A00 == NotificationType.A26) {
                i = 83405;
            } else {
                i = 83867;
                if (0QD.A0k(C7my.A01, A00)) {
                    i = 82230;
                }
            }
        }
        obj = 1Bn.A0A(i);
        return (7yC) obj;
    }
}
