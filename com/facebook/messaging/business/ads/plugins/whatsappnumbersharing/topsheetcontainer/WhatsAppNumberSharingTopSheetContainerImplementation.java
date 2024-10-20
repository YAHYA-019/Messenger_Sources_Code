package com.facebook.messaging.business.ads.plugins.whatsappnumbersharing.topsheetcontainer;

import X.1LI;
import X.6Qc;
import X.6Qf;
import X.7zS;
import X.8gW;
import X.SGg;
import android.content.Context;
import android.net.Uri;
import com.facebook.litho.LithoView;
import com.facebook.messaging.composer.model.ComposerTopSheetOpenParams;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: WhatsAppNumberSharingTopSheetContainerImplementation.class */
public final class WhatsAppNumberSharingTopSheetContainerImplementation {
    public LithoView A00;
    public ComposerTopSheetOpenParams A01;
    public ThreadViewColorScheme A02;
    public boolean A03;
    public final Context A04;
    public final 6Qc A05;
    public final 6Qf A06;

    public WhatsAppNumberSharingTopSheetContainerImplementation(Context context, 6Qc r303, 6Qf r304) {
        7zS.A16(1, context, r304, r303);
        this.A04 = context;
        this.A06 = r304;
        this.A05 = r303;
        this.A03 = true;
    }

    public static final void A00(Uri uri, WhatsAppNumberSharingTopSheetContainerImplementation whatsAppNumberSharingTopSheetContainerImplementation, String str, String str2) {
        ThreadViewColorScheme threadViewColorScheme = whatsAppNumberSharingTopSheetContainerImplementation.A02;
        if (threadViewColorScheme == null || !whatsAppNumberSharingTopSheetContainerImplementation.A03 || uri == null) {
            return;
        }
        1LI r0 = new 8gW(uri, threadViewColorScheme, str, str2, new SGg(uri, whatsAppNumberSharingTopSheetContainerImplementation, str, str2));
        LithoView lithoView = whatsAppNumberSharingTopSheetContainerImplementation.A00;
        if (lithoView != null) {
            lithoView.A0x(r0);
        }
    }
}
