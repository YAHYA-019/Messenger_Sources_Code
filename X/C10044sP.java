package X;

import android.net.Uri;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.video.exoserviceclient.FbVpsController;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4sP, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4sP.class */
public final class C10044sP implements C4Av {
    public final 1Br A02 = 1Bu.A00(66568);
    public final 1Br A01 = 1Bq.A00(65609);
    public final 1Br A00 = 1Bq.A00(32976);

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        5Ly r0;
        boolean z = false;
        11T.A0F(r302, 0);
        if (r302.A01()) {
            C00i c00i = this.A02.A00;
            c00i.get();
            1G9 r02 = C09374px.A03;
            C09374px c09374px = (C09374px) c00i.get();
            1G9 r03 = C09374px.A03;
            ArrayList A00 = C09374px.A00(c09374px, r03);
            5L4 r04 = ((FbVpsController) this.A00.A00.get()).A0S;
            if (r04 != null && (r0 = r04.A02) != null) {
                r0.A0A(A00);
            }
            1Ql edit = ((FbSharedPreferences) ((C09374px) c00i.get()).A01.A00.get()).edit();
            11T.A0A(edit);
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                edit.Cdj(r03.A0F((String) it.next()));
            }
            edit.commit();
            0fH.A0g(0L, "CleanStoryCacheConditionalWorker", "Cleared expired story video, bytesCleared = %d");
            C03h.A01().A08();
            C03h A01 = C03h.A01();
            Integer num = 0S2.A00;
            A01.A06(num);
            c00i.get();
            C09374px c09374px2 = (C09374px) c00i.get();
            1G9 r05 = C09374px.A02;
            ArrayList A002 = C09374px.A00(c09374px2, r05);
            C03h.A01().A08();
            long A06 = C03h.A01().A06(num);
            Iterator it2 = A002.iterator();
            while (it2.hasNext()) {
                try {
                    Uri A03 = C0A2.A03((String) it2.next());
                    if (A03 != null) {
                        ((2Ff) this.A01.A00.get()).A0H(A03);
                    }
                } catch (SecurityException unused) {
                }
            }
            1Ql edit2 = ((FbSharedPreferences) ((C09374px) c00i.get()).A01.A00.get()).edit();
            11T.A0A(edit2);
            Iterator it3 = A002.iterator();
            while (it3.hasNext()) {
                edit2.Cdj(r05.A0F((String) it3.next()));
            }
            edit2.commit();
            C03h.A01().A08();
            0fH.A0g(Long.valueOf(C03h.A01().A06(num) - A06), "CleanStoryCacheConditionalWorker", "Cleared expired story photo, bytesCleared = %d");
            z = true;
        }
        return z;
    }
}
