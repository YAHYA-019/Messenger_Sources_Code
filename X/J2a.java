package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: J2a.class */
public final class J2a implements Runnable {
    public static final String __redex_internal_original_name = "VideoExpressionLoader$loadStandardEffectsWithArtLoader$1$onLoadSucceeded$1";
    public final /* synthetic */ HsJ A00;
    public final /* synthetic */ IPz A01;
    public final /* synthetic */ I0G A02;
    public final /* synthetic */ Hz1 A03;
    public final /* synthetic */ boolean A04;

    public J2a(HsJ hsJ, IPz iPz, I0G i0g, Hz1 hz1, boolean z) {
        this.A03 = hz1;
        this.A01 = iPz;
        this.A00 = hsJ;
        this.A04 = z;
        this.A02 = i0g;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x02fd. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable, X.Huh] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        LinkedHashSet linkedHashSet;
        Number A15;
        int intValue;
        boolean z;
        H9u h9u;
        Hz1 hz1 = this.A03;
        EnumC08284mf enumC08284mf = hz1.A00;
        if (enumC08284mf != null) {
            I0G i0g = this.A02;
            IPz iPz = this.A01;
            if (enumC08284mf == EnumC08284mf.A06) {
                z = true;
                h9u = H9u.A04;
            } else {
                z = false;
                h9u = H9u.A02;
            }
            i0g.A02 = h9u;
            if (z) {
                List list = IPz.A0b;
                C00i c00i = iPz.A0H.A00;
                FbSharedPreferences A09 = 1Br.A09(((HPy) c00i.get()).A00);
                1G2 r0 = 51K.A07;
                if (1BK.A1T(A09, r0)) {
                    1Ql.A01(1Br.A08(((HPy) c00i.get()).A00), r0, false);
                }
            }
        }
        LinkedHashMap linkedHashMap = hz1.A03;
        LinkedHashSet A152 = 7zL.A15();
        LinkedHashSet A153 = 7zL.A15();
        LinkedHashSet A154 = 7zL.A15();
        LinkedHashSet A155 = 7zL.A15();
        LinkedHashSet A156 = 7zL.A15();
        LinkedHashSet A157 = 7zL.A15();
        IPz iPz2 = this.A01;
        HDY hdy = hz1.A02;
        List list2 = IPz.A0b;
        iPz2.A01 = hdy;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ?? r02 = (Huh) 1Br.A0B(iPz2.A08);
        r02.A02(new IWA(countDownLatch, 0));
        try {
            countDownLatch.await();
            HsJ hsJ = this.A00;
            ImmutableMap immutableMap = hsJ.A02;
            HrV hrV = (HrV) immutableMap.get(HCR.A08);
            if (hrV == null || hrV.A00 <= 0) {
                i = 0;
            } else {
                1Br.A0C(iPz2.A0F);
                i = 5;
            }
            EnumMap enumMap = new EnumMap(HCR.class);
            1Du it = ((ImmutableCollection) immutableMap.values()).iterator();
            while (it.hasNext()) {
                HrV hrV2 = (HrV) it.next();
                if (hrV2 != null) {
                    AnonymousClass001.A1A(hrV2.A01, enumMap, hrV2.A00);
                }
            }
            Iterator A13 = GOo.A13(linkedHashMap);
            int i2 = 0;
            while (A13.hasNext()) {
                1Du it2 = ((ImmutableCollection) A13.next()).iterator();
                while (it2.hasNext()) {
                    BaseItem baseItem = (BaseItem) it2.next();
                    if (baseItem instanceof EffectItem) {
                        EffectItem effectItem = (EffectItem) baseItem;
                        if (effectItem.A0G == H9C.A01) {
                            if (((BaseItem) effectItem).A01 != null && i2 < i) {
                                2Ff.A02(2rC.A03, (2Ff) 1Br.A0B(iPz2.A0L), (2IE) null, 2Dp.A00(((BaseItem) effectItem).A02), CallerContext.A06(IPz.class));
                                i2++;
                            }
                            HCR hcr = ((BaseItem) effectItem).A04;
                            if (hcr != null && enumMap.containsKey(hcr) && (A15 = GOn.A15(hcr, enumMap)) != null && (intValue = A15.intValue()) > 0) {
                                iPz2.A0A(hsJ.A00, effectItem, (Integer) null, false, this.A04, false, false);
                                AnonymousClass001.A1A(hcr, enumMap, intValue - 1);
                            }
                            String str = ((BaseItem) effectItem).A09;
                            if (str != null && str.equals(hsJ.A04)) {
                                iPz2.A0A(hsJ.A00, effectItem, (Integer) null, false, this.A04, false, true);
                            }
                            if (hcr != null) {
                                switch (hcr.ordinal()) {
                                    case -1:
                                    case 3:
                                        break;
                                    case 0:
                                        A153.add(baseItem);
                                        iPz2.A0A(hsJ.A00, effectItem, (Integer) null, false, this.A04, false, false);
                                        break;
                                    case 4:
                                        if (effectItem.A0F != null) {
                                            linkedHashSet = A156;
                                            linkedHashSet.add(baseItem);
                                            break;
                                        } else {
                                            String A158 = 1BK.A15(Locale.US, "Interactive effect %s without metadata", Arrays.copyOf(1BK.A1Z(effectItem.A03()), 1));
                                            C01s A04 = 1Br.A04(iPz2.A0J);
                                            0BS A01 = 0BR.A01("rtc_msqrd_art_loader", A158);
                                            A01.A00 = 1;
                                            A04.D0u(new 0BR(A01));
                                            break;
                                        }
                                    case 8:
                                        linkedHashSet = A154;
                                        linkedHashSet.add(baseItem);
                                        break;
                                    case 11:
                                        linkedHashSet = A155;
                                        linkedHashSet.add(baseItem);
                                        break;
                                    case 12:
                                        A157.add(baseItem);
                                        break;
                                }
                            }
                            linkedHashSet = A152;
                            linkedHashSet.add(baseItem);
                        }
                    }
                }
            }
            IPz.A01(iPz2).A09 = 1BL.A0a(A152);
            IPz.A01(iPz2).A08 = 1BL.A0a(A156);
            IPz.A01(iPz2).A0A = 1BL.A0a(A153);
            IPz.A01(iPz2).A06 = 1BL.A0a(A155);
            if (!((Hli) 1Br.A0B(iPz2.A0I)).A00()) {
                F8a A012 = IPz.A01(iPz2);
                A012.A03 = 1BL.A0a(A154);
                JEd jEd = A012.A00;
                if (jEd != null) {
                    jEd.BkR();
                }
            }
            iPz2.A00 = TimeUnit.MILLISECONDS.toSeconds(1Br.A01(iPz2.A0D));
            IPz.A03(iPz2, this.A02);
        } catch (InterruptedException unused) {
            throw AnonymousClass001.A0U(r02);
        }
    }
}
