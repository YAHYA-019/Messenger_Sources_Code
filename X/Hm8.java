package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* loaded from: Hm8.class */
public final class Hm8 {
    public final /* synthetic */ IQ1 A00;

    public Hm8(IQ1 iq1) {
        this.A00 = iq1;
    }

    public void A00(EffectItem effectItem, I4D i4d, int i) {
        IQ1 iq1 = this.A00;
        CallerContext callerContext = IQ1.A1m;
        if (i == 1) {
            if (iq1.A08 == null || IQ1.A0D(iq1, effectItem, i4d)) {
                return;
            }
            iq1.A08.A09(effectItem, i4d);
            return;
        }
        GnK A00 = IBw.A00(iq1);
        if (A00.A1b()) {
            boolean z = effectItem != null ? effectItem.A0o : false;
            if (i4d != null && !z) {
                5WA r0 = (5WA) A00.A0B.get();
                String str = i4d.A0R;
                int hashCode = str.hashCode();
                QuickPerformanceLogger quickPerformanceLogger = r0.A00;
                quickPerformanceLogger.markerStart(5505092, hashCode);
                quickPerformanceLogger.markerTag(5505092, hashCode, 0Pz.A0W("product_name:", r0.A01));
                quickPerformanceLogger.markerTag(5505092, hashCode, 0Pz.A0W("type:", "mask"));
                quickPerformanceLogger.markerTag(5505092, hashCode, 0Pz.A0W("name:", str));
            }
            ICU icu = A00.A01.A01;
            if (icu.A04 == null || icu.A05 == null) {
                C00i c00i = icu.A0M.A00;
                ((HpG) c00i.get()).A00 = true;
                I3u i3u = new I3u((HiR) 1Br.A0B(icu.A0O));
                C00i c00i2 = icu.A0N.A00;
                HgT A02 = ((I3l) c00i2.get()).A02();
                String str2 = icu.A0h;
                i3u.A01(new Hie(((I3l) c00i2.get()).A01(), I3l.A00((I3l) c00i2.get(), 0, false, false), new FrameBrightnessDataProviderConfig(0, 0, 0, 7, null), (FbP) 1Br.A0B(icu.A0I), (HpG) c00i.get(), 1Br.A04(icu.A0L), str2, null), A02);
                Ij0 A002 = i3u.A00();
                icu.A05 = A002;
                Ida ida = icu.A0C;
                IEE iee = ((Gtk) ((JPh) ida.AdC(JPh.A00))).A02;
                11T.A0I(iee, "null cannot be cast to non-null type com.facebook.cameracore.audio.fbaaudiopipeline.AudioPipelineControllerInterface");
                C1F6 A0I = GOp.A0I(icu.A0G);
                Context applicationContext = icu.A01.getApplicationContext();
                HTL htl = new HTL(icu);
                1Br.A0C(icu.A0H);
                Hg1 hg1 = icu.A0Z;
                ExecutorService A1G = GOp.A1G(icu.A0P);
                H4T h4t = icu.A0W;
                2Wo r02 = h4t.A0C;
                2Wo r03 = h4t.A0D;
                HTP htp = new HTP(iee);
                ida.AdD(JQ8.A00);
                boolean A01 = Gtk.A01(str2);
                Context A012 = FbInjector.A01();
                AbL.A0y(A0I);
                try {
                    IP3 ip3 = new IP3(applicationContext, AbG.A0H(A0I), htl, htp, hg1, A002, r02, r03, str2, A1G, A01);
                    1Bn.A0K();
                    FbInjector.A04(A012);
                    icu.A04 = ip3;
                    JPy jPy = (JPy) ida.AdC(JPy.A01);
                    icu.A02 = jPy;
                    if (jPy != null) {
                        I4u i4u = ((C2415Gcc) jPy).A03;
                        ArrayList A0t = AnonymousClass001.A0t(1);
                        A0t.add(A002);
                        i4u.A02(A0t);
                    }
                } catch (Throwable th) {
                    1Bn.A0K();
                    FbInjector.A04(A012);
                    throw th;
                }
            }
            FbUserSession A0F = 4YV.A0F(icu.A01);
            IP3 ip32 = icu.A04;
            if (ip32 != null) {
                ip32.A00(A0F, effectItem, i4d);
            }
            if (i4d != null && !z) {
                ((5WA) A00.A0B.get()).A00.markerEnd(5505092, i4d.A0R.hashCode(), (short) 2);
            }
        }
        IDa iDa = iq1.A1P;
        C6x1 A04 = iDa.A04();
        I4q Aio = iq1.A1Q.Aio();
        Iterator it = iDa.A07.iterator();
        while (it.hasNext()) {
            IFM A0m = GOn.A0m(it);
            A0m.A0M(A04, Aio);
            A0m.A0O(A04, Aio);
        }
    }
}
