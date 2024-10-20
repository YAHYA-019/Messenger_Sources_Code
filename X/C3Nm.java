package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: X.3Nm, reason: invalid class name */
/* loaded from: 3Nm.class */
public final class C3Nm {
    public final 1Br A00 = 1BK.A0E();
    public final 1Br A01 = 1BK.A0C();

    public final void A00(User user, String str) {
        String[] strArr;
        String str2;
        synchronized (this) {
            if (!2yD.A03(1Br.A06(this.A01), 36310521103974715L)) {
                C00i c00i = this.A00.A00;
                FbSharedPreferences A0S = 1BK.A0S(c00i);
                1G9 r0 = C10364tD.A00;
                if (A0S.AZn(r0, false)) {
                    0fH.A0j("MessengerAccountStatusVerificationUtil", "validateLoggedInUserStatus: inconsistent data re-fetching is already scheduled");
                } else {
                    1Kh r02 = new 1Kh();
                    r02.A03(user);
                    User user2 = new User(r02);
                    String str3 = user2.A14;
                    if (str3 == null || "unknown".equals(str3) || "unset_or_unrecognized_enum_value".equals(str3)) {
                        0fH.A0j("MessengerAccountStatusVerificationUtil", "validateLoggedInUserStatus: users status is not defined");
                    } else {
                        boolean z = user2.A29;
                        if (z) {
                            if (user2.A1u) {
                                strArr = new String[1];
                                str2 = "deactivated_allowed_on_messenger";
                            } else {
                                strArr = new String[1];
                                str2 = user2.A25 ? "messenger_only_deactivated" : "messenger_only_confirmed";
                            }
                            strArr[0] = str2;
                        } else {
                            strArr = new String[]{"facebook_confirmed", "facebook_pending"};
                        }
                        ArrayList arrayList = new ArrayList(strArr.length);
                        Collections.addAll(arrayList, strArr);
                        Locale locale = Locale.getDefault();
                        11T.A0A(locale);
                        String lowerCase = str3.toLowerCase(locale);
                        11T.A0A(lowerCase);
                        boolean contains = arrayList.contains(lowerCase);
                        0fH.A13("MessengerAccountStatusVerificationUtil", "validateLoggedInUserStatus[%s]: partial=%s, deactivatedAllowedOnMessenger=%s, messengerOnlyDeactivated=%s, dataSource=%s, accountStatus=%s, statusValid=%s", new Object[]{str, Boolean.valueOf(z), Boolean.valueOf(user2.A1u), Boolean.valueOf(user2.A25), user2.A1B, str3, Boolean.valueOf(contains)});
                        if (!contains) {
                            0fH.A14("MessengerAccountStatusVerificationUtil", "validateLoggedInUserStatus: local status is inconsistent, expectedAccountStatuses=%s, localAccountStatus=%s", new Object[]{arrayList, str3});
                            1Ql.A03(r0, c00i.get(), true);
                        }
                    }
                }
            }
        }
    }
}
