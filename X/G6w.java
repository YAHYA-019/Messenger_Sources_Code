package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.bugreporter.core.model.BugReport;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: G6w.class */
public final class G6w implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ 5TL A02;
    public final /* synthetic */ EPO A03;
    public final /* synthetic */ ImmutableMap A04;
    public final /* synthetic */ ImmutableSet A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ java.util.Map A07;

    public G6w(Context context, Uri uri, 5TL r304, EPO epo, ImmutableMap immutableMap, ImmutableSet immutableSet, List list, java.util.Map map) {
        this.A02 = r304;
        this.A06 = list;
        this.A01 = uri;
        this.A00 = context;
        this.A04 = immutableMap;
        this.A05 = immutableSet;
        this.A03 = epo;
        this.A07 = map;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        long nanoTime;
        5TL r0 = this.A02;
        ArrayList A06 = 5TL.A06(this.A06);
        C00i c00i = r0.A0B;
        File A00 = FFl.A00((FFl) c00i.get());
        do {
            nanoTime = System.nanoTime();
        } while (AnonymousClass001.A0D(A00, String.valueOf(nanoTime)).exists());
        c00i.get();
        byte[] bArr = new byte[15];
        new SecureRandom().nextBytes(bArr);
        String trim = Base64.encodeToString(bArr, 0).trim();
        ExV A05 = ((FIL) r0.A08.get()).A05(this.A00, (Bundle) null, this.A03, this.A04, this.A05, ImmutableSet.A07(r0.A0N), (BugReportAttachment) null, "624618737631578", "", "", trim, A06, AnonymousClass001.A0s(), nanoTime);
        A05.A01(this.A07);
        return new BugReport(A05);
    }
}
