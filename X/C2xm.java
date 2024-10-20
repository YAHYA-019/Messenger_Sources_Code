package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2xm, reason: invalid class name */
/* loaded from: 2xm.class */
public final class C2xm extends C00q implements C00m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xm(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        1G2 A00;
        String str;
        2yD r303;
        long j;
        Object[] parentFile;
        AnonymousClass313 anonymousClass313;
        switch (this.A00) {
            case 0:
                C23s c23s = (C23s) this.A01;
                java.util.Map map = C23s.A01;
                int i = c23s.typeTag;
                if (i == 0) {
                    anonymousClass313 = c23s.modelSelectionSet();
                } else {
                    java.util.Map map2 = C23s.A01;
                    Integer valueOf = Integer.valueOf(i);
                    AnonymousClass313 anonymousClass3132 = map2.get(valueOf);
                    if (anonymousClass3132 == null) {
                        anonymousClass3132 = c23s.modelSelectionSet();
                        map2.put(valueOf, anonymousClass3132);
                    }
                    anonymousClass313 = anonymousClass3132;
                }
                int length = anonymousClass313.A00.length;
                parentFile = new Object[length];
                for (int i2 = 0; i2 < length; i2++) {
                    parentFile[i2] = AnonymousClass312.A00;
                }
                return parentFile;
            case 1:
                r303 = (2yD) ((1OU) this.A01).A02.A00.get();
                j = 36326837684557662L;
                return Boolean.valueOf(r303.AZk(j));
            case 2:
                C00091a4 c00091a4 = (C00091a4) this.A01;
                Object obj = c00091a4.A04.get();
                11T.A0A(obj);
                return new JRb(c00091a4.A00, c00091a4.A01, c00091a4.A02, (31O) obj, c00091a4.A03);
            case 3:
                ((C00091a4) this.A01).A05.get();
                return null;
            case 4:
                ((C00091a4) this.A01).A06.get();
                throw new NullPointerException("mLightSharedPreferencesFactory");
            case 5:
                parentFile = ((C23d) this.A01).A01;
                if (parentFile == 0) {
                    throw AnonymousClass001.A0N("Trying to access the LayoutCache from outside a layout call");
                }
                return parentFile;
            case 6:
                Context context = ((C1re) this.A01).A00;
                parentFile = context.getDatabasePath(DKB.A00(49)).getParentFile();
                if (parentFile == 0) {
                    return AnonymousClass001.A0D(1MH.A01(context), 4YT.A00(324));
                }
                return parentFile;
            case 7:
            case 9:
                Context context2 = FbInjector.A03;
                11T.A0A(context2);
                C1re c1re = C1re.A02;
                if (c1re == null) {
                    Context applicationContext = context2.getApplicationContext();
                    11T.A0A(applicationContext);
                    c1re = new C1re(applicationContext);
                    C1re.A02 = c1re;
                }
                11T.A0D(c1re);
                return c1re;
            case 8:
                ((C1rc) this.A01).A00.A00.get();
                Object A0A = 1Bn.A0A(16454);
                11T.A0A(A0A);
                return A0A;
            case 10:
                return ((1sO) ((C1Zg) ((C1rc) this.A01).A00.A00.get()).A03.get()).A01("db_provider_internals", "v1", "user_scope");
            case 11:
                r303 = (2yD) ((1ME) this.A01).A01.A00.get();
                j = 18299146253441709L;
                return Boolean.valueOf(r303.AZk(j));
            case 12:
                r303 = (2yD) ((1ME) this.A01).A01.A00.get();
                j = 18299146253376172L;
                return Boolean.valueOf(r303.AZk(j));
            case 13:
                r303 = (2yD) ((1ME) this.A01).A01.A00.get();
                j = 18299146253310635L;
                return Boolean.valueOf(r303.AZk(j));
            case 14:
                r303 = (2yD) ((1ME) this.A01).A01.A00.get();
                j = 18299146253507246L;
                return Boolean.valueOf(r303.AZk(j));
            case 15:
                r303 = (2yD) ((1ME) this.A01).A01.A00.get();
                j = 18299146252917418L;
                return Boolean.valueOf(r303.AZk(j));
            case 16:
                return Boolean.valueOf(((C09404q0) ((1ME) this.A01).A00.A00.get()).A01);
            case 17:
                return ((1PY) this.A01).A00.A00();
            case 18:
                List singletonList = Collections.singletonList(((C00m) this.A01).invoke());
                11T.A0A(singletonList);
                return singletonList;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                parentFile = ((C00m) this.A01).invoke();
                return parentFile;
            case 25:
                A00 = ((1Ky) this.A01).A00();
                str = "allow_carrier_pings_on_wifi";
                1G3 A0D = A00.A0D(str);
                11T.A0A(A0D);
                return A0D;
            case 26:
                A00 = ((1Ky) this.A01).A00();
                str = "allow_zero_rating_on_wifi";
                1G3 A0D2 = A00.A0D(str);
                11T.A0A(A0D2);
                return A0D2;
            case 27:
                A00 = ((1Ky) this.A01).A00();
                str = "autoflex_optin/";
                1G3 A0D22 = A00.A0D(str);
                11T.A0A(A0D22);
                return A0D22;
            case 28:
                A00 = (1G3) ((1Ky) this.A01).A03.getValue();
                str = "autoflex_optin_last_shown_time";
                1G3 A0D222 = A00.A0D(str);
                11T.A0A(A0D222);
                return A0D222;
            case 29:
                A00 = ((1Ky) this.A01).A00();
                str = "banner_notifications_content_history";
                1G3 A0D2222 = A00.A0D(str);
                11T.A0A(A0D2222);
                return A0D2222;
            case 30:
                A00 = ((1Ky) this.A01).A00();
                str = "blurred_photo_contextual_message_education_impression";
                1G3 A0D22222 = A00.A0D(str);
                11T.A0A(A0D22222);
                return A0D22222;
            case 31:
                A00 = ((1Ky) this.A01).A00();
                str = "carrier_notifications_entry_last_seen";
                1G3 A0D222222 = A00.A0D(str);
                11T.A0A(A0D222222);
                return A0D222222;
            case 32:
                A00 = ((1Ky) this.A01).A00();
                str = "carrier_signal_last_ping_times";
                1G3 A0D2222222 = A00.A0D(str);
                11T.A0A(A0D2222222);
                return A0D2222222;
            case 33:
                A00 = ((1Ky) this.A01).A00();
                str = "carrier_signal_ping_url";
                1G3 A0D22222222 = A00.A0D(str);
                11T.A0A(A0D22222222);
                return A0D22222222;
            case 34:
                return ((1LF) ((1Ky) this.A01).A00.A00.get()).A02((1G2) 1Ky.A12.getValue(), "clearable/");
            case 35:
                A00 = ((1Ky) this.A01).A00();
                str = "code_pairs";
                1G3 A0D222222222 = A00.A0D(str);
                11T.A0A(A0D222222222);
                return A0D222222222;
            case 36:
                A00 = ((1Ky) this.A01).A00();
                str = "debug_bypass_zero_balance_cooldown";
                1G3 A0D2222222222 = A00.A0D(str);
                11T.A0A(A0D2222222222);
                return A0D2222222222;
            case 37:
                A00 = ((1Ky) this.A01).A00();
                str = "debug_bypass_zero_optin_cooldown";
                1G3 A0D22222222222 = A00.A0D(str);
                11T.A0A(A0D22222222222);
                return A0D22222222222;
            case 38:
                A00 = ((1Ky) this.A01).A00();
                str = "debug_force_zero_balance";
                1G3 A0D222222222222 = A00.A0D(str);
                11T.A0A(A0D222222222222);
                return A0D222222222222;
            case 39:
                A00 = ((1Ky) this.A01).A00();
                str = "debug_force_zero_balance_timeout";
                1G3 A0D2222222222222 = A00.A0D(str);
                11T.A0A(A0D2222222222222);
                return A0D2222222222222;
            case 40:
                A00 = ((1Ky) this.A01).A00();
                str = "default_optin/";
                1G3 A0D22222222222222 = A00.A0D(str);
                11T.A0A(A0D22222222222222);
                return A0D22222222222222;
            case 41:
                A00 = ((1Ky) this.A01).A00();
                str = "dialogs/";
                1G3 A0D222222222222222 = A00.A0D(str);
                11T.A0A(A0D222222222222222);
                return A0D222222222222222;
            case 42:
                A00 = ((1Ky) this.A01).A00();
                str = "dialtone_optin/";
                1G3 A0D2222222222222222 = A00.A0D(str);
                11T.A0A(A0D2222222222222222);
                return A0D2222222222222222;
            case 43:
                A00 = ((1Ky) this.A01).A00();
                str = "dialtone_sticky_mode";
                1G3 A0D22222222222222222 = A00.A0D(str);
                11T.A0A(A0D22222222222222222);
                return A0D22222222222222222;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A00 = ((1Ky) this.A01).A00();
                str = "easy_dogfooding";
                1G3 A0D222222222222222222 = A00.A0D(str);
                11T.A0A(A0D222222222222222222);
                return A0D222222222222222222;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A00 = ((1Ky) this.A01).A00();
                str = "easy_dogfooding_balance_simulation_status";
                1G3 A0D2222222222222222222 = A00.A0D(str);
                11T.A0A(A0D2222222222222222222);
                return A0D2222222222222222222;
            case 46:
                A00 = ((1Ky) this.A01).A00();
                str = "external_zbd_state";
                1G3 A0D22222222222222222222 = A00.A0D(str);
                11T.A0A(A0D22222222222222222222);
                return A0D22222222222222222222;
            case ActionId.ON_START_END /* 47 */:
                A00 = ((1Ky) this.A01).A00();
                str = "flex_zero_balance_detection_reset_time";
                1G3 A0D222222222222222222222 = A00.A0D(str);
                11T.A0A(A0D222222222222222222222);
                return A0D222222222222222222222;
            case ActionId.QUEUED /* 48 */:
                A00 = ((1Ky) this.A01).A00();
                str = "flex_zero_balance_detection_state";
                1G3 A0D2222222222222222222222 = A00.A0D(str);
                11T.A0A(A0D2222222222222222222222);
                return A0D2222222222222222222222;
            case ActionId.IN_PROGRESS /* 49 */:
                A00 = ((1Ky) this.A01).A00();
                str = "force_torque_init";
                1G3 A0D22222222222222222222222 = A00.A0D(str);
                11T.A0A(A0D22222222222222222222222);
                return A0D22222222222222222222222;
        }
    }
}
