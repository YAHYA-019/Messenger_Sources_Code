package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.facebook.common.util.TriState;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: D2e.class */
public final class D2e implements GGf {
    public static final ImmutableList A07 = ImmutableList.of((Object) "com.facebook.browser.lite.BrowserLiteActivity", (Object) "com.facebook.browser.lite.BrowserLiteFallbackActivity", (Object) "com.facebook.browser.lite.BrowserLite2Activity", (Object) "com.facebook.browser.lite.BrowserLiteInMainProcessActivity");
    public List A00;
    public final C01s A01;
    public final C00i A02;
    public final AnonymousClass244 A03;
    public final Context A04;
    public final 2BQ A05;
    public final String A06;

    public D2e() {
        Context A0J = 7zP.A0J();
        1BQ A00 = 1BQ.A00();
        AnonymousClass244 A0s = AbI.A0s();
        C01s A0I = 1BL.A0I();
        2BQ r0 = (2BQ) 1Bi.A03(16922);
        this.A04 = A0J;
        this.A06 = A0J.getPackageName();
        this.A02 = A00;
        this.A03 = A0s;
        this.A01 = A0I;
        this.A05 = r0;
        String BCy = ((2yD) A00.get()).BCy(36873625677856893L);
        this.A00 = AnonymousClass001.A0s();
        try {
            this.A00 = (List) this.A03.A0Q(new BJe(this), BCy);
        } catch (IOException e) {
            this.A01.softReport("getWhitelistedUrlsList", e.getMessage(), e);
        }
    }

    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        String valueOf = String.valueOf(intent.getData());
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (AnonymousClass001.A0i(it).equals(valueOf)) {
                return TriState.YES;
            }
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (A07.contains(component.getClassName())) {
                return TriState.NO;
            }
            if (this.A06.equals(component.getPackageName())) {
                this.A01.D0v("fix:shall_start_internal_activity_instead", String.valueOf(intent));
                return TriState.YES;
            }
        }
        return TriState.UNSET;
    }
}
