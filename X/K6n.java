package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: K6n.class */
public abstract class K6n extends LCw {
    public boolean A00;

    public static void A05(L9t l9t) {
        K6c k6c = l9t.A06;
        L9t.A02(k6c);
        L0g.A00();
        K6k k6k = k6c.A00;
        L0g.A00();
        k6k.A00 = System.currentTimeMillis();
    }

    public static void A06(String str, Object obj, int i) {
        String str2 = (String) Kz3.A0D.A00;
        if (android.util.Log.isLoggable(str2, i)) {
            android.util.Log.println(i, str2, LCw.A08(str, obj, (Object) null, (Object) null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, X.K1n] */
    public void A0H() {
        int i;
        int i2;
        if (!(this instanceof K6b)) {
            if (this instanceof K6h) {
                K6h k6h = (K6h) this;
                k6h.A00 = ((LCw) k6h).A00.A00.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
                return;
            }
            if (this instanceof K6l) {
                K6l k6l = (K6l) this;
                k6l.A0D("Network initialized. User agent", k6l.A01);
                return;
            }
            if (this instanceof K6g) {
                K6g k6g = (K6g) this;
                synchronized (K6g.class) {
                    K6g.A00 = k6g;
                }
                return;
            }
            if (this instanceof K6f) {
                K6f k6f = (K6f) this;
                try {
                    k6f.A0J();
                    if (AnonymousClass001.A05(Kz3.A0I.A00) > 0) {
                        Context context = ((LCw) k6f).A00.A00;
                        ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                        if (receiverInfo == null || !((ComponentInfo) receiverInfo).enabled) {
                            return;
                        }
                        LCw.A0A(k6f, "Receiver registered for local dispatch.", 2);
                        k6f.A01 = true;
                        return;
                    }
                    return;
                } catch (PackageManager.NameNotFoundException unused) {
                    return;
                }
            }
            if ((this instanceof K6a) || (this instanceof K6e)) {
                return;
            }
            if (this instanceof K6k) {
                K6k k6k = (K6k) this;
                K6m k6m = k6k.A04;
                k6m.A0H();
                ((K6n) k6m).A00 = true;
                K6l k6l2 = k6k.A07;
                k6l2.A0H();
                ((K6n) k6l2).A00 = true;
                K6i k6i = k6k.A03;
                k6i.A0H();
                ((K6n) k6i).A00 = true;
                return;
            }
            if (!(this instanceof K6d)) {
                if ((this instanceof K6m) || (this instanceof K6i) || !(this instanceof K6c)) {
                    return;
                }
                K6k k6k2 = ((K6c) this).A00;
                k6k2.A0H();
                ((K6n) k6k2).A00 = true;
                return;
            }
            K6d k6d = (K6d) this;
            L9t l9t = ((LCw) k6d).A00;
            L0g l0g = l9t.A03;
            AbstractC00481b7.A02(l0g);
            if (l0g.A05 == null) {
                synchronized (l0g) {
                    if (l0g.A05 == null) {
                        ?? obj = new Object();
                        Context context2 = l0g.A01;
                        PackageManager packageManager = context2.getPackageManager();
                        String packageName = context2.getPackageName();
                        obj.A02 = packageName;
                        obj.A03 = packageManager.getInstallerPackageName(packageName);
                        String str = null;
                        try {
                            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                            if (packageInfo != null) {
                                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    packageName = applicationLabel.toString();
                                }
                                str = packageInfo.versionName;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            android.util.Log.e("GAv4", JQy.A0s("Error retrieving package info: appName set to ", packageName));
                        }
                        obj.A00 = packageName;
                        obj.A01 = str;
                        l0g.A05 = obj;
                    }
                }
            }
            K1n k1n = l0g.A05;
            K1n k1n2 = k6d.A00;
            k1n.A03(k1n2);
            K6b k6b = l9t.A0E;
            L9t.A02(k6b);
            k6b.A0I();
            String str2 = k6b.A01;
            if (str2 != null) {
                k1n2.A00 = str2;
            }
            k6b.A0I();
            String str3 = k6b.A02;
            if (str3 != null) {
                k1n2.A01 = str3;
                return;
            }
            return;
        }
        K6b k6b2 = (K6b) this;
        L9t l9t2 = ((LCw) k6b2).A00;
        Context context3 = l9t2.A00;
        try {
            ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo(context3.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = ((PackageItemInfo) applicationInfo).metaData;
                if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0) {
                    return;
                }
                String str4 = null;
                String str5 = null;
                String str6 = null;
                int i3 = -1;
                boolean z = -1;
                try {
                    XmlResourceParser xml = l9t2.A01.getResources().getXml(i);
                    try {
                        xml.next();
                        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                            if (xml.getEventType() == 2) {
                                String lowerCase = xml.getName().toLowerCase(Locale.US);
                                if (lowerCase.equals("screenname")) {
                                    String attributeValue = xml.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    String trim = xml.nextText().trim();
                                    if (!TextUtils.isEmpty(attributeValue)) {
                                        TextUtils.isEmpty(trim);
                                    }
                                } else if (lowerCase.equals("string")) {
                                    String attributeValue2 = xml.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    String trim2 = xml.nextText().trim();
                                    if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                                        if ("ga_appName".equals(attributeValue2)) {
                                            str4 = trim2;
                                        } else if ("ga_appVersion".equals(attributeValue2)) {
                                            str5 = trim2;
                                        } else if ("ga_logLevel".equals(attributeValue2)) {
                                            str6 = trim2;
                                        } else {
                                            K6g k6g2 = l9t2.A0C;
                                            L9t.A02(k6g2);
                                            k6g2.A0F("String xml configuration name not recognized", attributeValue2);
                                        }
                                    }
                                } else if (lowerCase.equals("bool")) {
                                    String attributeValue3 = xml.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    String trim3 = xml.nextText().trim();
                                    if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                                        try {
                                            boolean parseBoolean = Boolean.parseBoolean(trim3);
                                            if ("ga_dryRun".equals(attributeValue3)) {
                                                z = parseBoolean;
                                            } else {
                                                K6g k6g3 = l9t2.A0C;
                                                L9t.A02(k6g3);
                                                k6g3.A0F("Bool xml configuration name not recognized", attributeValue3);
                                            }
                                        } catch (NumberFormatException e) {
                                            K6g k6g4 = l9t2.A0C;
                                            if (k6g4 != null) {
                                                LCw.A0B(trim3, e, (Object) null, "Error parsing bool configuration value", 5);
                                                k6g4.A0K(trim3, e, null, "Error parsing bool configuration value", 5);
                                            } else {
                                                LCw.A0B(trim3, e, (Object) null, "Error parsing bool configuration value", 5);
                                            }
                                        }
                                    }
                                } else if (lowerCase.equals("integer")) {
                                    String attributeValue4 = xml.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    String trim4 = xml.nextText().trim();
                                    if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                                        try {
                                            int parseInt = Integer.parseInt(trim4);
                                            if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                                i3 = parseInt;
                                            } else {
                                                K6g k6g5 = l9t2.A0C;
                                                L9t.A02(k6g5);
                                                k6g5.A0F("Int xml configuration name not recognized", attributeValue4);
                                            }
                                        } catch (NumberFormatException e2) {
                                            K6g k6g6 = l9t2.A0C;
                                            if (k6g6 != null) {
                                                LCw.A0B(trim4, e2, (Object) null, "Error parsing int configuration value", 5);
                                                k6g6.A0K(trim4, e2, null, "Error parsing int configuration value", 5);
                                            } else {
                                                LCw.A0B(trim4, e2, (Object) null, "Error parsing int configuration value", 5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IOException | XmlPullParserException e3) {
                        K6g k6g7 = l9t2.A0C;
                        if (k6g7 != null) {
                            A06("Error parsing tracker configuration file", e3, 6);
                            k6g7.A0K(e3, null, null, "Error parsing tracker configuration file", 6);
                        } else {
                            A06("Error parsing tracker configuration file", e3, 6);
                        }
                    }
                    LCw.A0A(k6b2, "Loading global XML config values", 2);
                    if (str4 != null) {
                        k6b2.A01 = str4;
                        k6b2.A0E("XML config - app name", str4);
                    }
                    if (str5 != null) {
                        k6b2.A02 = str5;
                        k6b2.A0E("XML config - app version", str5);
                    }
                    if (AnonymousClass001.A1T(str6)) {
                        String lowerCase2 = str6.toLowerCase(Locale.US);
                        if ("verbose".equals(lowerCase2)) {
                            i2 = 0;
                        } else if ("info".equals(lowerCase2)) {
                            i2 = 1;
                        } else if ("warning".equals(lowerCase2)) {
                            i2 = 2;
                        } else if ("error".equals(lowerCase2)) {
                            i2 = 3;
                        }
                        k6b2.A0D("XML config - log level", Integer.valueOf(i2));
                    }
                    if (i3 >= 0) {
                        k6b2.A00 = i3;
                        k6b2.A03 = true;
                        k6b2.A0E("XML config - dispatch period (sec)", Integer.valueOf(i3));
                    }
                    if (z != -1) {
                        boolean z2 = z;
                        k6b2.A05 = z2;
                        k6b2.A04 = true;
                        k6b2.A0E("XML config - dry run", Boolean.valueOf(z2));
                        return;
                    }
                    return;
                } catch (Resources.NotFoundException e4) {
                    K6g k6g8 = l9t2.A0C;
                    if (k6g8 == null) {
                        A06("inflate() called with unknown resourceId", e4, 5);
                        return;
                    } else {
                        A06("inflate() called with unknown resourceId", e4, 5);
                        k6g8.A0K(e4, null, null, "inflate() called with unknown resourceId", 5);
                        return;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e5) {
            k6b2.A0F("PackageManager doesn't know about the app package", e5);
        }
        LCw.A0A(k6b2, "Couldn't get ApplicationInfo to load global config", 5);
    }

    public final void A0I() {
        if (!this.A00) {
            throw AnonymousClass001.A0N(1BJ.A00(301));
        }
    }
}
