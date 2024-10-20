package X;

import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: JxT.class */
public final class JxT extends JgV implements GGu {
    public static final String __redex_internal_original_name = "ECPContainerFragment";
    public ContextThemeWrapper A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GGu
    public boolean Bzb(Bundle bundle, int i, boolean z) {
        String str;
        if (i != 1111) {
            return false;
        }
        Fragment A0b = getChildFragmentManager().A0b("CHILD_FRAGMENT_TAG");
        if (A0b != null) {
            DKE.A1J(A0b, getChildFragmentManager());
        }
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString(DKB.A00(289));
            str2 = bundle.getString(DKB.A00(288));
        } else {
            str = null;
        }
        Object obj = requireArguments().get("ECP_CONTAINER_FRAGMENT_TYPE");
        DKC.A1U(obj);
        if (!11T.A0O(obj, "web_view_fragment")) {
            throw AnonymousClass001.A0p();
        }
        Bundle A05 = 1BK.A05();
        String string = requireArguments().getString("ECP_CONTENT_FRAGMENT_REQUEST_KEY");
        if (string == null) {
            throw 1BK.A0h();
        }
        int i2 = 0;
        if ((str2 == null || str2.length() == 0) && str != null && str.length() != 0) {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(str);
            if (11T.A0O(urlQuerySanitizer.getValue("cancel"), ConstantsKt.CAMERA_ID_BACK)) {
                i2 = 2;
            } else {
                String value = urlQuerySanitizer.getValue("ba_token");
                if (value != null) {
                    A05.putString(DKB.A00(265), value);
                }
            }
            A05.putInt(DKB.A00(264), i2);
            getParentFragmentManager().A1R(string, A05);
            Ri6.A03(this);
            return false;
        }
        A05.putString("PAYPAL_BA_LINKING_ERROR_MESSAGE_FOR_LOGGING", str2);
        i2 = 1;
        A05.putInt(DKB.A00(264), i2);
        getParentFragmentManager().A1R(string, A05);
        Ri6.A03(this);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1022478174);
        super/*androidx.fragment.app.Fragment*/.onCreate(bundle);
        0FI.A08(1915641427, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(857650437);
        ContextThemeWrapper A01 = JgV.A01(this, layoutInflater);
        this.A00 = A01;
        View inflate = layoutInflater.cloneInContext(A01).inflate(2132541884, viewGroup, false);
        0FI.A08(451865946, A02);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (X.LD1.A04(r0) != true) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r301 = this;
            r0 = 1507775862(0x59ded576, float:7.8402685E15)
            int r0 = X.0FI.A02(r0)
            r302 = r0
            r0 = r301
            r303 = r0
            r0 = r301
            super.onResume()
            r0 = r301
            android.os.Bundle r0 = r0.requireArguments()
            java.lang.String r1 = "ECP_CONTAINER_FRAGMENT_TITLE"
            java.lang.String r0 = r0.getString(r1)
            r304 = r0
            r0 = r301
            android.os.Bundle r0 = r0.requireArguments()
            r305 = r0
            java.lang.String r0 = "ECP_LAUNCH_PARAMS"
            r306 = r0
            r0 = r305
            r1 = r306
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r307 = r0
            r0 = r307
            boolean r0 = r0 instanceof com.facebookpay.expresscheckout.models.ECPPaymentRequest
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L55
            r0 = r307
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            r307 = r0
            r0 = 1
            r309 = r0
            r0 = r307
            if (r0 == 0) goto L55
            r0 = r307
            boolean r0 = X.LD1.A04(r0)
            r308 = r0
            r0 = 1
            r310 = r0
            r0 = r308
            r1 = r309
            if (r0 == r1) goto L58
        L55:
            r0 = 0
            r310 = r0
        L58:
            r0 = r301
            android.view.ContextThemeWrapper r0 = r0.A00
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L6c
            java.lang.String r0 = "viewContext"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L6c:
            r0 = r301
            android.os.Bundle r0 = r0.requireArguments()
            r305 = r0
            java.lang.String r0 = "ECP_CONTAINER_FRAGMENT_NAV_BAR_STYLE"
            r306 = r0
            r0 = r305
            r1 = r306
            java.lang.Object r0 = r0.get(r1)
            r311 = r0
            r0 = r311
            if (r0 == 0) goto Lb4
            r0 = r311
            X.KOY r0 = (X.KOY) r0
            r311 = r0
            X.GAW r0 = new X.GAW
            r312 = r0
            r0 = r312
            r1 = r301
            r2 = 2
            r0.<init>(r1, r2)
            X.SI2 r0 = X.SI2.A00
            r313 = r0
            r0 = r307
            r1 = r303
            r2 = r311
            r3 = r304
            r4 = 0
            r5 = r312
            r6 = r313
            r7 = 0
            r8 = r310
            X.R49.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -729183365(0xffffffffd4898b7b, float:-4.726005E12)
            r1 = r302
            X.0FI.A08(r0, r1)
            return
        Lb4:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxT.onResume():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Object obj = requireArguments().get("ECP_CONTAINER_FRAGMENT_TYPE");
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Bundle A05 = 1BK.A05();
        if (!11T.A0O(str, "web_view_fragment")) {
            throw AnonymousClass001.A0p();
        }
        Object obj2 = requireArguments().get("ECP_PAYPAL_BA_LOADING_URL");
        11T.A0I(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = requireArguments().get("ECP_PAYPAL_BA_ALLOWED_INTERCEPT_URL");
        11T.A0I(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        A05.putString("WEB_VIEW_URL", str2);
        A05.putStringArray("WEB_VIEW_ALLOWED_INTERCEPT_URLS", (String[]) obj3);
        A05.putBoolean("WEB_VIEW_FULL_SCREEN", true);
        Fragment A01 = C06014fk.A0A().A01(A05, str);
        C06c A09 = AbJ.A09(this);
        A01.setTargetFragment(null, 1111);
        A09.A0Q(A01, "CHILD_FRAGMENT_TAG", 2131363769);
        A09.A04();
    }
}
