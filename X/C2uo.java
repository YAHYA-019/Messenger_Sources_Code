package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.2uo, reason: invalid class name */
/* loaded from: 2uo.class */
public final class C2uo {
    public static final C2uh A02 = new C2uh("SplitInstallInfoProvider");
    public final Context A00;
    public final String A01;

    public C2uo(Context context) {
        this.A00 = context;
        this.A01 = context.getPackageName();
    }

    public static final HashSet A00(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = A01(packageInfo).iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (!A0i.startsWith("config.") && !A0i.contains(".config.")) {
                hashSet.add(A0i);
            }
        }
        return hashSet;
    }

    public static final HashSet A01(PackageInfo packageInfo) {
        Bundle bundle = ((PackageItemInfo) packageInfo.applicationInfo).metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                A02.A01("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        C2uh c2uh = A02;
        if (strArr == null) {
            c2uh.A01("No splits are found or app cannot be found in package manager.", new Object[0]);
            return hashSet;
        }
        c2uh.A01("Adding splits from package manager: %s", Arrays.toString(strArr));
        Collections.addAll(hashSet, strArr);
        return hashSet;
    }

    public final C3Nk A02(Bundle bundle) {
        C2uh c2uh;
        Object[] objArr;
        String str;
        String str2;
        String str3;
        C3Nk c3Nk = null;
        if (bundle == null) {
            c2uh = A02;
            objArr = new Object[0];
            str = "No metadata found in Context.";
        } else {
            int i = bundle.getInt("com.android.vending.splits");
            if (i != 0) {
                try {
                    XmlResourceParser xml = this.A00.getResources().getXml(i);
                    HashMap A0u = AnonymousClass001.A0u();
                    while (xml.next() != 1) {
                        try {
                            if (xml.getEventType() == 2) {
                                if (xml.getName().equals("splits")) {
                                    while (xml.next() != 3) {
                                        if (xml.getEventType() == 2) {
                                            if (xml.getName().equals("module")) {
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 >= xml.getAttributeCount()) {
                                                        break;
                                                    }
                                                    if (xml.getAttributeName(i2).equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                                        String attributeValue = xml.getAttributeValue(i2);
                                                        if (attributeValue != null) {
                                                            while (xml.next() != 3) {
                                                                if (xml.getEventType() == 2) {
                                                                    if (xml.getName().equals("language")) {
                                                                        while (xml.next() != 3) {
                                                                            if (xml.getEventType() == 2) {
                                                                                if (xml.getName().equals("entry")) {
                                                                                    int i3 = 0;
                                                                                    while (true) {
                                                                                        if (i3 >= xml.getAttributeCount()) {
                                                                                            str2 = null;
                                                                                            break;
                                                                                        }
                                                                                        if (xml.getAttributeName(i3).equals("key")) {
                                                                                            str2 = xml.getAttributeValue(i3);
                                                                                            break;
                                                                                        }
                                                                                        i3++;
                                                                                    }
                                                                                    int i4 = 0;
                                                                                    while (true) {
                                                                                        if (i4 >= xml.getAttributeCount()) {
                                                                                            str3 = null;
                                                                                            break;
                                                                                        }
                                                                                        if (xml.getAttributeName(i4).equals("split")) {
                                                                                            str3 = xml.getAttributeValue(i4);
                                                                                            break;
                                                                                        }
                                                                                        i4++;
                                                                                    }
                                                                                    int i5 = 1;
                                                                                    while (true) {
                                                                                        int next = xml.next();
                                                                                        if (next == 2) {
                                                                                            i5++;
                                                                                        } else if (next == 3) {
                                                                                            i5--;
                                                                                        } else {
                                                                                            continue;
                                                                                        }
                                                                                        if (i5 == 0) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (str2 != null && str3 != null) {
                                                                                        if (!A0u.containsKey(str2)) {
                                                                                            A0u.put(str2, AnonymousClass001.A0u());
                                                                                        }
                                                                                        ((java.util.Map) A0u.get(str2)).put(attributeValue, str3);
                                                                                    }
                                                                                } else {
                                                                                    int i6 = 1;
                                                                                    while (true) {
                                                                                        int next2 = xml.next();
                                                                                        if (next2 == 2) {
                                                                                            i6++;
                                                                                        } else if (next2 == 3) {
                                                                                            i6--;
                                                                                        } else {
                                                                                            continue;
                                                                                        }
                                                                                        if (i6 != 0) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        int i7 = 1;
                                                                        while (true) {
                                                                            int next3 = xml.next();
                                                                            if (next3 == 2) {
                                                                                i7++;
                                                                            } else if (next3 == 3) {
                                                                                i7--;
                                                                            } else {
                                                                                continue;
                                                                            }
                                                                            if (i7 != 0) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                            }
                                            int i8 = 1;
                                            while (true) {
                                                int next4 = xml.next();
                                                if (next4 == 2) {
                                                    i8++;
                                                } else if (next4 == 3) {
                                                    i8--;
                                                } else {
                                                    continue;
                                                }
                                                if (i8 != 0) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int i9 = 1;
                                    while (true) {
                                        int next5 = xml.next();
                                        if (next5 == 2) {
                                            i9++;
                                        } else if (next5 == 3) {
                                            i9--;
                                        } else {
                                            continue;
                                        }
                                        if (i9 != 0) {
                                        }
                                    }
                                }
                            }
                        } catch (IOException | IllegalStateException | XmlPullParserException e) {
                            android.util.Log.e("SplitInstall", "Error while parsing splits.xml", e);
                            c3Nk = null;
                        }
                    }
                    HashMap A0u2 = AnonymousClass001.A0u();
                    Iterator A0x = AnonymousClass001.A0x(A0u);
                    while (A0x.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(A0x);
                        A0u2.put(A0z.getKey(), Collections.unmodifiableMap(new HashMap((java.util.Map) A0z.getValue())));
                    }
                    new C3Nk(Collections.unmodifiableMap(A0u2));
                    if (c3Nk == null) {
                        c2uh = A02;
                        objArr = new Object[0];
                        str = "Can't parse languages metadata.";
                    }
                    return c3Nk;
                } catch (Resources.NotFoundException unused) {
                    A02.A04("Resource with languages metadata doesn't exist.", new Object[0]);
                    return null;
                }
            }
            c2uh = A02;
            objArr = new Object[0];
            str = "No metadata found in AndroidManifest.";
        }
        c2uh.A04(str, objArr);
        return c3Nk;
    }

    public final HashSet A03() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.A00.getPackageManager().getPackageInfo(this.A01, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            A02.A02("App is not found in PackageManager", AnonymousClass001.A1Z());
            packageInfo = null;
        }
        return (packageInfo == null || packageInfo.applicationInfo == null) ? AnonymousClass001.A0v() : A00(packageInfo);
    }
}
