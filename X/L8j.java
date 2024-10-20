package X;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: L8j.class */
public final class L8j {
    public final long A00;
    public final KO3 A01;
    public final KO4 A02;
    public final Set A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public L8j(KO3 ko3, KO4 ko4, Integer num, String str, String str2, List list, Set set, int i, long j, long j2, long j3) {
        long j4 = j3;
        KO4 ko42 = KO4.DOWNLOADED;
        if (ko4 != ko42 && list != null && !list.isEmpty()) {
            throw AnonymousClass001.A0L("Module files provided on wrong state.");
        }
        long j5 = 0;
        if (ko4 == KO4.DOWNLOADING || ko4 == ko42) {
            j5 = j2;
        } else {
            j4 = 0;
        }
        String str3 = null;
        Integer num2 = null;
        if (ko4 == KO4.PENDING_USER_ACTION) {
            str3 = str2;
            num2 = num;
        }
        this.A04 = i;
        this.A00 = j;
        this.A08 = str;
        this.A03 = set;
        this.A02 = ko4;
        this.A01 = ko3;
        this.A05 = j5;
        this.A06 = j4;
        this.A0A = list;
        this.A09 = str3;
        this.A07 = num2;
    }

    public static L8j A00(Bundle bundle) {
        KO4 ko4;
        KO3 ko3;
        String str;
        Integer num;
        long A05;
        int i;
        int A03 = AnonymousClass001.A03(A01(bundle, Integer.class, "protocol_version"));
        long A052 = AnonymousClass001.A05(A01(bundle, Long.class, "session_id"));
        String str2 = (String) A01(bundle, String.class, "package_name");
        String[] strArr = (String[]) A01(bundle, String[].class, "modules");
        Integer num2 = (Integer) A01(bundle, Integer.class, "status");
        int intValue = num2.intValue();
        KO4[] values = KO4.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                0fH.A0S(KO4.class, "Invalid State: %d", new Object[]{num2});
                ko4 = KO4.UNKNOWN;
                break;
            }
            ko4 = values[i2];
            if (ko4.mInstallStateId == intValue) {
                break;
            }
            i2++;
        }
        Integer num3 = (Integer) A01(bundle, Integer.class, TraceFieldType.ErrorCode);
        int intValue2 = num3.intValue();
        KO3[] values2 = KO3.values();
        int length2 = values2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                0fH.A0S(KO3.class, "Invalid Reason: %d", new Object[]{num3});
                ko3 = KO3.UNKNOWN;
                break;
            }
            ko3 = values2[i3];
            if (ko3.mReasonId == intValue2) {
                break;
            }
            i3++;
        }
        if (strArr.length == 0) {
            throw AnonymousClass001.A0N("Module names not found.");
        }
        HashSet A0w = AnonymousClass001.A0w(strArr);
        ArrayList arrayList = null;
        if (A03 <= 1 || ko4 != KO4.PENDING_USER_ACTION) {
            str = null;
            num = null;
        } else {
            str = (String) A01(bundle, String.class, "installer_pending_user_action_intent_uri");
            Integer num4 = (Integer) A01(bundle, Integer.class, 1BJ.A00(1915));
            int intValue3 = num4.intValue();
            Integer[] A00 = 0S2.A00(4);
            int length3 = A00.length;
            int i4 = 0;
            while (true) {
                if (i4 < length3) {
                    num = A00[i4];
                    switch (num.intValue()) {
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i != intValue3) {
                        i4++;
                    }
                } else {
                    0fH.A14("PendingUserActionHandlingType", "Update Ownership handling type: %d", new Object[]{num4});
                    num = 0S2.A00;
                }
            }
        }
        long j = 0;
        if (ko4 == KO4.DOWNLOADING || ko4 == KO4.DOWNLOADED) {
            j = AnonymousClass001.A05(A01(bundle, Long.class, 1BJ.A00(82)));
            A05 = AnonymousClass001.A05(A01(bundle, Long.class, 1BJ.A00(2085)));
        } else {
            A05 = 0;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("module_file_infos");
        if (ko4 == KO4.DOWNLOADED) {
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                throw AnonymousClass001.A0N("Module files not provided.");
            }
            arrayList = 1BL.A10(parcelableArrayList);
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Bundle bundle2 = (Bundle) it.next();
                arrayList.add(new L4U((Uri) L4U.A00(bundle2, Uri.class, "file_uri"), (String) L4U.A00(bundle2, String.class, "package_name"), (String) L4U.A00(bundle2, String.class, AnonymousClass000.A00(33)), AnonymousClass001.A03(L4U.A00(bundle2, Integer.class, "protocol_version")), AnonymousClass001.A03(L4U.A00(bundle2, Integer.class, 4YT.A00(465)))));
            }
        } else if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            throw AnonymousClass001.A0N("Module files provided on wrong state.");
        }
        return new L8j(ko3, ko4, num, str2, str, arrayList, A0w, A03, A052, j, A05);
    }

    public static Object A01(Bundle bundle, Class cls, String str) {
        if (!bundle.containsKey(str)) {
            throw JR1.A0n("key %s is missing but required", new Object[]{str});
        }
        Object cast = cls.cast(bundle.get(str));
        if (cast != null) {
            return cast;
        }
        throw JR1.A0n("value for required key %s is null", new Object[]{str});
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            L8j l8j = (L8j) obj;
            if (this.A04 != l8j.A04 || this.A00 != l8j.A00 || !this.A08.equals(l8j.A08) || !this.A03.equals(l8j.A03) || this.A02 != l8j.A02 || this.A01 != l8j.A01 || this.A05 != l8j.A05 || this.A06 != l8j.A06) {
                return false;
            }
            List list = this.A0A;
            if (((list == null || !list.equals(l8j.A0A)) && list != l8j.A0A) || this.A09 != l8j.A09 || this.A07 != l8j.A07) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A04), Long.valueOf(this.A00), this.A08, this.A03, this.A02, this.A01, Long.valueOf(this.A05), Long.valueOf(this.A06), this.A0A});
    }

    public String toString() {
        String str;
        String str2;
        int i;
        Integer num = this.A07;
        if (num == null || (str2 = this.A09) == null) {
            str = "";
        } else {
            switch (num.intValue()) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                default:
                    i = 0;
                    break;
            }
            str = 0Pz.A0E(i, "pendingUserActionHandlingType= ", " ,pendingUserActionIntent=", str2);
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ModuleInstallSessionState={protocol=");
        A0k.append(this.A04);
        A0k.append(4YT.A00(45));
        A0k.append(this.A00);
        A0k.append(", packageName=");
        A0k.append(this.A08);
        A0k.append(", modules=");
        A0k.append(this.A03);
        A0k.append(", status=");
        A0k.append(this.A02.name());
        A0k.append(", errorCode=");
        A0k.append(this.A01.name());
        A0k.append(", bytesDownloaded=");
        A0k.append(this.A05);
        A0k.append(", totalBytesToDownload=");
        A0k.append(this.A06);
        A0k.append(", moduleFilesCount=");
        List list = this.A0A;
        A0k.append(list == null ? 0 : list.size());
        return GOq.A12(str, A0k);
    }
}
