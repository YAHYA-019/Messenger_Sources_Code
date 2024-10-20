package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.inject.FbInjector;

/* renamed from: X.4n2, reason: invalid class name */
/* loaded from: 4n2.class */
public final class C4n2 implements InterfaceC08314mj {
    public final C00i A00 = new 1BQ(16634);
    public final Context A02 = FbInjector.A00();
    public final C00i A01 = new 1BQ(16385);

    @Override // X.InterfaceC08314mj
    public 2Jy AU5(String str, long j) {
        Context context = this.A02;
        final C08474n3 c08474n3 = new C08474n3(this);
        OptSvcAnalyticsStore.consumeEvents(context, ((2yD) c08474n3.A00.A01.get()).AZk(36314824661016826L), 100, new OptSvcAnalyticsStore.EventConsumer() { // from class: X.4n4
            @Override // com.facebook.common.dextricks.OptSvcAnalyticsStore.EventConsumer
            public void consume(String str2, java.util.Map map) {
                if (OdexSchemeArtXdex.Dex2OatProgressListener.EVENT_NAME.equals(str2)) {
                    C08474n3 c08474n32 = C08474n3.this;
                    String A0b = AnonymousClass001.A0b(AnonymousClass000.A00(92), map);
                    if (TextUtils.isEmpty(A0b)) {
                        return;
                    }
                    try {
                        if (Integer.parseInt(A0b) == BuildConstants.A01()) {
                            String str3 = (String) map.get(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME);
                            String A0b2 = AnonymousClass001.A0b("duration", map);
                            String A0b3 = AnonymousClass001.A0b(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, map);
                            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(A0b2) || TextUtils.isEmpty(A0b3)) {
                                0fH.A0n("OptSvcEventReporterDelegate", "Dropping malformed OptsvcEvent.");
                                return;
                            }
                            try {
                                int parseInt = Integer.parseInt(A0b2);
                                int parseInt2 = Integer.parseInt(A0b3);
                                String A0b4 = AnonymousClass001.A0b(OptSvcAnalyticsStore.LOGGING_KEY_STEP, map);
                                String A0b5 = AnonymousClass001.A0b(OptSvcAnalyticsStore.LOGGING_KEY_EXIT_CODE, map);
                                Integer num = null;
                                if (A0b5 != null) {
                                    try {
                                        num = Integer.valueOf(Integer.parseInt(A0b5));
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                String str4 = (String) map.get(OptSvcAnalyticsStore.LOGGING_KEY_DETAIL_MSG);
                                Integer valueOf = Integer.valueOf(parseInt);
                                0fH.A0b(str3, A0b4, valueOf, "OptSvcEventReporterDelegate", "Reporting event (%s, %s) duration = %d");
                                2R2 r0 = new 2R2(1UD.A00(1BK.A07(c08474n32.A00.A00), 1ZG.A03, "optsvc_event"), 263);
                                if (4YU.A1X(r0)) {
                                    r0.A0C("duration_ms", valueOf);
                                    r0.A0E(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME, str3);
                                    r0.A0E(OptSvcAnalyticsStore.LOGGING_KEY_STEP, A0b4);
                                    r0.A0C(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Integer.valueOf(parseInt2));
                                    if (num != null) {
                                        r0.A0C("exit_status", num);
                                    }
                                    if (str4 != null) {
                                        r0.A0E(OptSvcAnalyticsStore.LOGGING_KEY_DETAIL_MSG, str4);
                                    }
                                    r0.BZL();
                                }
                            } catch (NumberFormatException e) {
                                0fH.A11("OptSvcEventReporterDelegate", "Dropping malformed OptsvcEvent. durationStr: %s, attemptStr: %s", e, new Object[]{A0b2, A0b3});
                            }
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
            }
        });
        return null;
    }
}
