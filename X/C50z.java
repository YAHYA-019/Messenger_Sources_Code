package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.50z, reason: invalid class name */
/* loaded from: 50z.class */
public final class C50z {
    public static final List A06 = Arrays.asList("app_install", "registration_start", "registration_complete", "login", "thread_list_visible");
    public final Context A00;
    public final C1kw A01;
    public final FbSharedPreferences A04;
    public final 1FP A05;
    public final C00i A03 = new 1BV(49450);
    public final 1Ex A02 = (1Ex) 1Bi.A03(83426);

    public C50z() {
        Context A00 = FbInjector.A00();
        C1kw c1kw = (C1kw) 1Bi.A03(16772);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        1FP r0 = (1FP) 1Bi.A03(67765);
        this.A00 = A00;
        this.A01 = c1kw;
        this.A04 = fbSharedPreferences;
        this.A05 = r0;
    }

    public void A00(final String str) {
        this.A05.D3D(3Ds.A02, 0S2.A01, new Runnable() { // from class: X.510
            public static final String __redex_internal_original_name = "NewPlatformLogger$1";

            /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
            
                if (r304 != null) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00e6, code lost:
            
                if (r306.A01 == false) goto L67;
             */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: Exception -> 0x026e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x026e, blocks: (B:8:0x0067, B:9:0x006c, B:12:0x007c, B:14:0x0088, B:17:0x0094, B:19:0x009e, B:21:0x00a5, B:24:0x00b2, B:28:0x00c0, B:30:0x00ca, B:33:0x00d8, B:37:0x019e, B:39:0x01ac, B:41:0x01b7, B:43:0x01c6, B:45:0x01cb, B:46:0x01d0, B:51:0x01de, B:53:0x01df, B:70:0x0200, B:71:0x0201, B:74:0x0206, B:76:0x020c, B:77:0x0210, B:78:0x0218, B:79:0x021d, B:80:0x0224, B:81:0x0229, B:82:0x022e, B:83:0x0236, B:84:0x023d, B:86:0x024a, B:88:0x0251, B:89:0x0256, B:91:0x025e, B:92:0x0266, B:97:0x00ff, B:98:0x0105, B:99:0x010a, B:101:0x0118, B:106:0x0188, B:127:0x017f, B:57:0x01e7, B:59:0x01ec, B:61:0x01f2, B:63:0x01f7, B:111:0x0127, B:113:0x013a, B:116:0x0145, B:120:0x0155, B:122:0x0160, B:123:0x0169), top: B:7:0x0067, inners: #1, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00d8 A[Catch: Exception -> 0x026e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x026e, blocks: (B:8:0x0067, B:9:0x006c, B:12:0x007c, B:14:0x0088, B:17:0x0094, B:19:0x009e, B:21:0x00a5, B:24:0x00b2, B:28:0x00c0, B:30:0x00ca, B:33:0x00d8, B:37:0x019e, B:39:0x01ac, B:41:0x01b7, B:43:0x01c6, B:45:0x01cb, B:46:0x01d0, B:51:0x01de, B:53:0x01df, B:70:0x0200, B:71:0x0201, B:74:0x0206, B:76:0x020c, B:77:0x0210, B:78:0x0218, B:79:0x021d, B:80:0x0224, B:81:0x0229, B:82:0x022e, B:83:0x0236, B:84:0x023d, B:86:0x024a, B:88:0x0251, B:89:0x0256, B:91:0x025e, B:92:0x0266, B:97:0x00ff, B:98:0x0105, B:99:0x010a, B:101:0x0118, B:106:0x0188, B:127:0x017f, B:57:0x01e7, B:59:0x01ec, B:61:0x01f2, B:63:0x01f7, B:111:0x0127, B:113:0x013a, B:116:0x0145, B:120:0x0155, B:122:0x0160, B:123:0x0169), top: B:7:0x0067, inners: #1, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x01d8  */
            /* JADX WARN: Type inference failed for: r0v111, types: [X.2J3, X.51C] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 634
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass510.run():void");
            }
        }, "Log platform app event.");
    }
}
