package X;

import android.view.View;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;

/* renamed from: X.9ph, reason: invalid class name */
/* loaded from: 9ph.class */
public final class C9ph implements View.OnClickListener {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ 1Br A02;
    public final /* synthetic */ 5zD A03;
    public final /* synthetic */ C60b A04;
    public final /* synthetic */ ThreadKey A05;
    public final /* synthetic */ ThreadSummary A06;
    public final /* synthetic */ 9XW A07;
    public final /* synthetic */ MigColorScheme A08;

    public C9ph(06Z r302, 1Br r303, 1Br r304, 5zD r305, C60b c60b, ThreadKey threadKey, ThreadSummary threadSummary, 9XW r309, MigColorScheme migColorScheme) {
        this.A06 = threadSummary;
        this.A04 = c60b;
        this.A05 = threadKey;
        this.A07 = r309;
        this.A00 = r302;
        this.A03 = r305;
        this.A08 = migColorScheme;
        this.A01 = r303;
        this.A02 = r304;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        ThreadSummary threadSummary;
        ThreadThemeInfo threadThemeInfo;
        int A05 = 0FI.A05(-1245556138);
        if (!AnonymousClass001.A1V(1Bi.A03(67703)) || (threadSummary = this.A06) == null) {
            i = -623855939;
        } else if (this.A04.A02(threadSummary)) {
            ((6Hd) 1Br.A0B(this.A01)).A00("Click on Change thread theme");
            6NA r0 = (6NA) 1Br.A0B(this.A02);
            ThreadKey threadKey = this.A05;
            r0.A05(threadKey, "admin_msg");
            9XW r02 = this.A07;
            06Z r03 = this.A00;
            5zD r04 = this.A03;
            ThreadCustomization threadCustomization = null;
            if (r04 != null) {
                threadCustomization = r04.AgN();
                threadThemeInfo = r04.BEz();
            } else {
                threadThemeInfo = null;
            }
            r02.A00(r03, 3Do.A03, threadKey, threadCustomization, r04 != null ? r04.Axg() : this.A08, threadThemeInfo, "admin_msg");
            i = -392031946;
        } else {
            i = 1777526761;
        }
        0FI.A0B(i, A05);
    }
}
