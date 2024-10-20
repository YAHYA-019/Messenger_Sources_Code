package X;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* renamed from: X.3Xg, reason: invalid class name */
/* loaded from: 3Xg.class */
public final class C3Xg implements 1Ro {
    public static final String __redex_internal_original_name = "GetVoltronInfoMethod";
    public final 3Ly A00;

    public C3Xg(3Ly r302) {
        this.A00 = r302;
    }

    public static String A00(String... strArr) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('[');
        int length = strArr.length - 1;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 > length) {
                return AnonymousClass001.A0g(A0k, ']');
            }
            A0k.append('\"');
            A0k.append(strArr[i2]);
            A0k.append('\"');
            if (i2 != length) {
                A0k.append(',');
            }
            i = i2 + 1;
        }
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        C04083zw c04083zw = new C04083zw();
        c04083zw.A0D = "getVoltronInfo";
        c04083zw.A0F = "android_app_modules";
        c04083zw.A0E = "GET";
        c04083zw.A02();
        c04083zw.A0J = C3Pr.A00((C3Pr) obj);
        c04083zw.A06 = 0S2.A0N;
        c04083zw.A0Q = true;
        c04083zw.A0L = true;
        return c04083zw.A01();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00f4. Please report as an issue. */
    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        RuntimeException A0T;
        3Ly r0 = this.A00;
        int i = anonymousClass439.A00;
        Object obj2 = anonymousClass439.A02;
        Preconditions.checkState(obj2 instanceof InputStream, "No response input stream.");
        InputStream inputStream = (InputStream) obj2;
        if (i != 200) {
            throw AnonymousClass001.A0G(0Pz.A0T("Unexpected HTTP code ", i));
        }
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, "UTF-8"));
        try {
            jsonReader.beginObject();
            if (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (nextName.equals("data")) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        String str4 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            switch (nextName2.hashCode()) {
                                case 3355:
                                    if (!nextName2.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                                        A0T = 0Pz.A08("Unexpected name: ", nextName2);
                                        break;
                                    } else {
                                        if (str3 != null) {
                                            throw 0Pz.A08("Duplicate value for name ", nextName2);
                                        }
                                        str3 = jsonReader.nextString();
                                    }
                                case 3195150:
                                    if (!nextName2.equals("hash")) {
                                        A0T = 0Pz.A08("Unexpected name: ", nextName2);
                                        break;
                                    } else {
                                        if (str2 != null) {
                                            throw 0Pz.A08("Duplicate value for name ", nextName2);
                                        }
                                        str2 = jsonReader.nextString();
                                    }
                                case 3373707:
                                    if (!nextName2.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                        A0T = 0Pz.A08("Unexpected name: ", nextName2);
                                        break;
                                    } else {
                                        if (str != null) {
                                            throw 0Pz.A08("Duplicate value for name ", nextName2);
                                        }
                                        str = jsonReader.nextString();
                                    }
                                case 1109408053:
                                    if (!nextName2.equals("download_uri")) {
                                        A0T = 0Pz.A08("Unexpected name: ", nextName2);
                                        break;
                                    } else {
                                        if (str4 != null) {
                                            throw 0Pz.A08("Duplicate value for name ", nextName2);
                                        }
                                        str4 = jsonReader.nextString();
                                    }
                                default:
                                    A0T = 0Pz.A08("Unexpected name: ", nextName2);
                                    break;
                            }
                        }
                        jsonReader.endObject();
                        A0s.add(new 03H(str, str2, str3, str4));
                    }
                    jsonReader.endArray();
                    jsonReader.endObject();
                    jsonReader.close();
                    r0.A00 = A0s;
                    r0.A00 = A0s;
                    C3TG c3tg = r0.A01;
                    c3tg.A03(null, 1, A0s.size());
                    if (!r0.A00.isEmpty()) {
                        return null;
                    }
                    c3tg.A04(AnonymousClass001.A0T("Failed to download module - no metadata found."), 4);
                    return null;
                }
                A0T = 0Pz.A08("Expected key data, got ", nextName);
            } else {
                A0T = AnonymousClass001.A0T("No data key found");
            }
            throw A0T;
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }
}
