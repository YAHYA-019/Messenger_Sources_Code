package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.nativetemplates.fb.screens.common.ScreenDataFetch;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: E9t.class */
public final class E9t extends EA7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ViewerContext A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public E9t() {
        super("ScreenProps");
        this.A00 = 47251464;
    }

    public long A05() {
        return Arrays.hashCode(new Object[]{this.A05, this.A06, Integer.valueOf(this.A01), this.A07, Integer.valueOf(this.A02), this.A08, this.A09, this.A0A, this.A04});
    }

    public Bundle A06() {
        Bundle A05 = 1BK.A05();
        String str = this.A05;
        if (str != null) {
            A05.putString("customStoryRenderLocation", str);
        }
        A05.putInt("customTTRCMarkerID", this.A00);
        String str2 = this.A06;
        if (str2 != null) {
            A05.putString("formData", str2);
        }
        A05.putInt("freshCacheTTLSeconds", this.A01);
        String str3 = this.A07;
        if (str3 != null) {
            A05.putString("graphqlRequestOverrideURL", str3);
        }
        A05.putInt("maxCacheTTLSeconds", this.A02);
        A05.putInt("minifiedScreenStyle", this.A03);
        String str4 = this.A08;
        if (str4 != null) {
            A05.putString("params", str4);
        }
        String str5 = this.A09;
        if (str5 != null) {
            A05.putString("path", str5);
        }
        String str6 = this.A0A;
        if (str6 != null) {
            A05.putString("stateData", str6);
        }
        ViewerContext viewerContext = this.A04;
        if (viewerContext != null) {
            A05.putParcelable("viewerContext", viewerContext);
        }
        return A05;
    }

    public 5iK A07(5iJ r302) {
        return ScreenDataFetch.create(r302, this);
    }

    public /* bridge */ /* synthetic */ 5TY A08(Context context, Bundle bundle) {
        EA6 ea6 = new EA6(context, new E9t());
        String string = bundle.getString("customStoryRenderLocation");
        E9t e9t = ea6.A01;
        e9t.A05 = string;
        e9t.A00 = bundle.getInt("customTTRCMarkerID");
        e9t.A06 = bundle.getString("formData");
        e9t.A01 = bundle.getInt("freshCacheTTLSeconds");
        e9t.A07 = bundle.getString("graphqlRequestOverrideURL");
        e9t.A02 = bundle.getInt("maxCacheTTLSeconds");
        e9t.A03 = bundle.getInt("minifiedScreenStyle");
        BitSet bitSet = ea6.A02;
        bitSet.set(0);
        e9t.A08 = bundle.getString("params");
        bitSet.set(1);
        e9t.A09 = bundle.getString("path");
        bitSet.set(2);
        e9t.A0A = bundle.getString("stateData");
        if (bundle.containsKey("viewerContext")) {
            e9t.A04 = (ViewerContext) bundle.getParcelable("viewerContext");
        }
        return ea6.A00();
    }

    public java.util.Map A09(Context context) {
        HashMap A0u = AnonymousClass001.A0u();
        String str = this.A09;
        int i = this.A00;
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u2.put("screen_path", str);
        A0u.put("ttrc_marker_id", Integer.valueOf(i));
        A0u.put("ttrc_custom_annotations", A0u2);
        return A0u;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof E9t)) {
                return false;
            }
            E9t e9t = (E9t) obj;
            String str = this.A05;
            String str2 = e9t.A05;
            if ((str != str2 && (str == null || !str.equals(str2))) || this.A00 != e9t.A00) {
                return false;
            }
            String str3 = this.A06;
            String str4 = e9t.A06;
            if ((str3 != str4 && (str3 == null || !str3.equals(str4))) || this.A01 != e9t.A01) {
                return false;
            }
            String str5 = this.A07;
            String str6 = e9t.A07;
            if ((str5 != str6 && (str5 == null || !str5.equals(str6))) || this.A02 != e9t.A02 || this.A03 != e9t.A03) {
                return false;
            }
            String str7 = this.A08;
            String str8 = e9t.A08;
            if (str7 != str8 && (str7 == null || !str7.equals(str8))) {
                return false;
            }
            String str9 = this.A09;
            String str10 = e9t.A09;
            if (str9 != str10 && (str9 == null || !str9.equals(str10))) {
                return false;
            }
            String str11 = this.A0A;
            String str12 = e9t.A0A;
            if (str11 != str12 && (str11 == null || !str11.equals(str12))) {
                return false;
            }
            ViewerContext viewerContext = this.A04;
            ViewerContext viewerContext2 = e9t.A04;
            if (viewerContext != viewerContext2 && (viewerContext == null || !viewerContext.equals(viewerContext2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, Integer.valueOf(this.A00), this.A06, Integer.valueOf(this.A01), this.A07, Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A08, this.A09, this.A0A, this.A04});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(((5TY) this).A03);
        String str = this.A05;
        if (str != null) {
            A0k.append(" ");
            AnonymousClass001.A1D("customStoryRenderLocation", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str, A0k);
        }
        A0k.append(" ");
        A0k.append("customTTRCMarkerID");
        A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        A0k.append(this.A00);
        String str2 = this.A06;
        if (str2 != null) {
            A0k.append(" ");
            AnonymousClass001.A1D("formData", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str2, A0k);
        }
        A0k.append(" ");
        A0k.append("freshCacheTTLSeconds");
        A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        A0k.append(this.A01);
        String str3 = this.A07;
        if (str3 != null) {
            A0k.append(" ");
            AnonymousClass001.A1D("graphqlRequestOverrideURL", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str3, A0k);
        }
        A0k.append(" ");
        A0k.append("maxCacheTTLSeconds");
        A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        A0k.append(this.A02);
        A0k.append(" ");
        A0k.append("minifiedScreenStyle");
        A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        A0k.append(this.A03);
        String str4 = this.A08;
        if (str4 != null) {
            A0k.append(" ");
            AnonymousClass001.A1D("params", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str4, A0k);
        }
        String str5 = this.A09;
        if (str5 != null) {
            A0k.append(" ");
            AnonymousClass001.A1D("path", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str5, A0k);
        }
        String str6 = this.A0A;
        if (str6 != null) {
            A0k.append(" ");
            AnonymousClass001.A1D("stateData", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str6, A0k);
        }
        ViewerContext viewerContext = this.A04;
        if (viewerContext != null) {
            A0k.append(" ");
            5TY.A01(viewerContext, "viewerContext", A0k);
        }
        return A0k.toString();
    }
}
