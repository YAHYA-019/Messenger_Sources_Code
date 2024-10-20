package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.4wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4wj.class */
public final class C11454wj {
    public static final C0dr A02;
    public final C11384wc A00;
    public final QuickPerformanceLogger A01;

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        11T.A0A(awakeTimeSinceBootClock);
        A02 = awakeTimeSinceBootClock;
    }

    public C11454wj(C11384wc c11384wc, QuickPerformanceLogger quickPerformanceLogger) {
        11T.A0F(quickPerformanceLogger, 1);
        this.A01 = quickPerformanceLogger;
        this.A00 = c11384wc;
    }

    public final Integer A00(Long l, int i, int i2) {
        int i3;
        if (this.A00.A00.AZk(36311839668243983L)) {
            i3 = i2 == 0 ? C04I.A00().hashCode() : i2;
            QuickPerformanceLogger quickPerformanceLogger = this.A01;
            if (l == null) {
                quickPerformanceLogger.markerStart(i, i3, false);
            } else {
                quickPerformanceLogger.markerStartWithCancelPolicy(i, false, i3, l.longValue(), TimeUnit.MILLISECONDS);
            }
        } else {
            i3 = i2;
        }
        if (i2 == 0) {
            return Integer.valueOf(i3);
        }
        return null;
    }

    public final void A01(Integer num, Long l, int i) {
        if (!this.A00.A00.AZk(36311839668243983L) || num == null) {
            return;
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        if (l == null) {
            quickPerformanceLogger.markerEnd(i, num.intValue(), (short) 2);
        } else {
            quickPerformanceLogger.markerEnd(i, num.intValue(), (short) 2, l.longValue(), TimeUnit.MILLISECONDS);
        }
    }

    public final void A02(Integer num, Long l, String str, int i) {
        if (!this.A00.A00.AZk(36311839668243983L) || num == null) {
            return;
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        if (l == null) {
            quickPerformanceLogger.markerPoint(i, num.intValue(), str);
        } else {
            quickPerformanceLogger.markerPoint(i, num.intValue(), str, l.longValue(), TimeUnit.MILLISECONDS);
        }
    }

    public final void A03(Integer num, String str, String str2, int i) {
        if (!this.A00.A00.AZk(36311839668243983L) || num == null) {
            return;
        }
        this.A01.markerAnnotate(i, num.intValue(), str, str2);
    }

    public final void A04(JSONObject jSONObject) {
        int i;
        Iterator<String> keys;
        if (this.A00.A00.AZk(36311839668243983L)) {
            String optString = jSONObject.optString("markerID");
            String optString2 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            11T.A0D(optString);
            switch (optString.hashCode()) {
                case -1302779920:
                    if (optString.equals("JS_MARKER")) {
                        i = 772802650;
                        break;
                    } else {
                        return;
                    }
                case -774331922:
                    if (optString.equals("JS_SET_PAYMENT_VALUES")) {
                        i = 772810608;
                        break;
                    } else {
                        return;
                    }
                case -404306583:
                    if (optString.equals("JS_AUTOFILL_PING")) {
                        i = 772803488;
                        break;
                    } else {
                        return;
                    }
                case -230162796:
                    if (optString.equals("JS_SET_CONTACT_VALUES")) {
                        i = 772807851;
                        break;
                    } else {
                        return;
                    }
                case 997599488:
                    if (optString.equals("JS_FIND_ALL_PAYMENT_FIELDS")) {
                        i = 772802242;
                        break;
                    } else {
                        return;
                    }
                case 1242941368:
                    if (optString.equals("JS_REQUEST_AUTOFILL")) {
                        i = 772812940;
                        break;
                    } else {
                        return;
                    }
                case 2118983270:
                    if (optString.equals("JS_PAGE_FORM_CALLBACK")) {
                        i = 772816680;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                int optInt = jSONObject.optInt("instanceKey", 0);
                JSONObject optJSONObject = jSONObject.optJSONObject(AnonymousClass000.A00(ActionId.CONNECTIVITY_CHANGED));
                if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                    while (keys.hasNext()) {
                        String A0i = AnonymousClass001.A0i(keys);
                        this.A01.markerAnnotate(intValue, optInt, A0i, optJSONObject.optString(A0i));
                    }
                }
                if (optString2 != null) {
                    int hashCode = optString2.hashCode();
                    if (hashCode == 68795) {
                        if (optString2.equals("END")) {
                            this.A01.markerEnd(intValue, optInt, (short) 2);
                        }
                    } else if (hashCode == 76307824) {
                        if (optString2.equals("POINT")) {
                            this.A01.markerPoint(intValue, optInt, jSONObject.optString(Property.SYMBOL_PLACEMENT_POINT));
                        }
                    } else if (hashCode == 79219778 && optString2.equals("START")) {
                        this.A01.markerStart(intValue, optInt);
                    }
                }
            }
        }
    }
}
