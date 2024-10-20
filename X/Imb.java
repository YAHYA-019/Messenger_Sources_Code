package X;

import android.net.Uri;
import com.facebook.cameracore.mediapipeline.services.weather.WeatherData;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: Imb.class */
public final class Imb implements Function {
    public final int A00;
    public final Object A01;

    public Imb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object obj2;
        IMJ imj;
        HCR hcr;
        2JY r0;
        2JY A0B;
        ImmutableList A0a;
        String A0l;
        String A0l2;
        2JY r02;
        2JY A0B2;
        Object obj3;
        2JY A0B3;
        Object obj4;
        2JY A0B4;
        switch (this.A00) {
            case 0:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                Object obj5 = null;
                obj2 = obj5;
                if (abstractC08294mh != null) {
                    Object obj6 = abstractC08294mh.A03;
                    obj2 = obj5;
                    if (obj6 != null) {
                        2JY A0K = AbF.A0K((2JY) obj6, 2JX.class, -886547336);
                        obj2 = obj5;
                        if (A0K != null) {
                            2JY A0B5 = 1BK.A0B(A0K, 2JX.class, -318567584, 1496416202);
                            obj2 = obj5;
                            if (A0B5 != null) {
                                2JY A0B6 = 1BK.A0B(A0B5, 2JX.class, 1223440372, 1738951884);
                                obj2 = obj5;
                                if (A0B6 != null) {
                                    TreeJNI A0L = A0B6.A0L(-1723832340, 2JX.class, 300017964);
                                    obj2 = obj5;
                                    if (A0L != null) {
                                        2JY A0B7 = 1BK.A0B(A0B6, 2JX.class, 2003163454, 1232684307);
                                        obj2 = obj5;
                                        if (A0B7 != null) {
                                            2JY A0B8 = 1BK.A0B(A0B7, 2JX.class, 321701236, -1109277745);
                                            obj2 = obj5;
                                            if (A0B8 != null) {
                                                String A0t = A0B7.A0t(GraphQLStringDefUtil.A00(), "GraphQLInspirationsWeatherConditionsCode", 1326621460);
                                                obj2 = obj5;
                                                if (A0t != null) {
                                                    IPI ipi = (IPI) this.A01;
                                                    if (ipi.A03 != null) {
                                                        1BK.A1E(ipi.A0E).execute(new Iow(this));
                                                    }
                                                    int intValue = A0L.getIntValue(-1880608562);
                                                    int intValue2 = A0L.getIntValue(1053806206);
                                                    int intValue3 = A0L.getIntValue(-1844506131);
                                                    int intValue4 = A0L.getIntValue(1388504029);
                                                    String A0r = A0B8.A0r(3594628);
                                                    A0r.getClass();
                                                    boolean equals = A0r.toUpperCase().equals("CELSIUS");
                                                    float f = 0.0f;
                                                    float doubleValue = (float) A0B8.getDoubleValue(111972721);
                                                    if (equals) {
                                                        f = doubleValue;
                                                        doubleValue = 0.0f;
                                                    }
                                                    ipi.A06 = A0B7.A0r(1870005699);
                                                    ipi.A00 = A0B7.getDoubleValue(1726810768);
                                                    HyG weatherData = new WeatherData(intValue, intValue2, intValue3, intValue4, f, doubleValue, A0r.equals("CELSIUS") ? "C" : "F", A0t);
                                                    ipi.A02 = weatherData;
                                                    obj2 = weatherData;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                obj2 = new C4P3();
                return obj2;
            case 2:
            case 3:
                obj2 = ((2V0) obj).A01();
                return obj2;
            case 4:
                AbstractC08294mh abstractC08294mh2 = (AbstractC08294mh) obj;
                GgH ggH = (Hty) this.A01;
                2JX r309 = null;
                if ((abstractC08294mh2 != null ? abstractC08294mh2.A01 : null) == EnumC08284mf.A06) {
                    C00i c00i = ggH.A05.A00;
                    FbSharedPreferences A09 = 1Br.A09(((HPy) c00i.get()).A00);
                    1G2 r03 = 51K.A07;
                    if (1BK.A1T(A09, r03)) {
                        1Ql.A01(1Br.A08(((HPy) c00i.get()).A00), r03, false);
                    }
                }
                if (abstractC08294mh2 != null && (r02 = (2JY) abstractC08294mh2.A03) != null && (A0B2 = 1BK.A0B(r02, 2JX.class, -1400770771, 124682352)) != null) {
                    r309 = 1BL.A0L(A0B2, 883555422, -1491423041);
                }
                ggH.A00 = r309;
                1Hz r04 = new 1Hz();
                if (ggH instanceof GgH) {
                    GgH ggH2 = ggH;
                    imj = (IMJ) 4YU.A0n(4YV.A0F(ggH2.A02), ggH2.A01, 98491);
                    hcr = ggH2.A04;
                } else if (ggH instanceof C2526GgG) {
                    C2526GgG c2526GgG = (C2526GgG) ggH;
                    imj = (IMJ) 4YU.A0n(4YV.A0F(((Hty) c2526GgG).A02), c2526GgG.A02, 98491);
                    hcr = c2526GgG.A04;
                } else if (ggH instanceof GgE) {
                    GgE ggE = (GgE) ggH;
                    imj = (IMJ) 4YU.A0n(1Br.A03(ggE.A02), ggE.A00, 98491);
                    hcr = ggE.A03;
                } else if (ggH instanceof GgD) {
                    GgD ggD = (GgD) ggH;
                    imj = (IMJ) 4YU.A0n(1Br.A03(ggD.A02), ggD.A00, 98491);
                    hcr = ggD.A03;
                } else if (ggH instanceof GgF) {
                    GgF ggF = (GgF) ggH;
                    imj = (IMJ) 4YU.A0n(4YV.A0F(ggF.A02), ggF.A00, 98491);
                    hcr = ggF.A02;
                } else {
                    GgC ggC = (GgC) ggH;
                    imj = (IMJ) 4YU.A0n(1Fw.A04(ggC.A00), ggC.A01, 98491);
                    hcr = ggC.A03;
                }
                ImmutableList A06 = imj.A06(hcr);
                r04.A08(A06);
                if (abstractC08294mh2 != null && (r0 = (2JY) abstractC08294mh2.A03) != null && (A0B = 1BK.A0B(r0, 2JX.class, -1400770771, 124682352)) != null && (A0a = A0B.A0a(945634367, 2JX.class)) != null) {
                    Iterator it = A0a.iterator();
                    while (it.hasNext()) {
                        2JY A0P = 7zL.A0P(it);
                        if (A0P != null) {
                            2JY A0N = 7zL.A0N(A0P, 2JX.class, 787855950, 2044509322);
                            11T.A0A(A0N);
                            HCR A01 = ((Hty) ggH).A01();
                            I04 i04 = (I04) 1Br.A0B(((Hty) ggH).A03);
                            11T.A0F(A01, 4);
                            2JX A0K2 = A0N.A0K(-837826370, 2JX.class, 340043451);
                            11T.A0A(A0K2);
                            I0h A00 = HHD.A00(A0K2, i04, A01, (String) null, (String) null, (String) null);
                            Uri uri = null;
                            if (A00 != null) {
                                2JY A0B9 = 1BK.A0B(A0N, 2JX.class, -506198829, -1176362986);
                                if (A0B9 != null && (A0l2 = A0B9.A0l()) != null) {
                                    uri = C0A2.A03(A0l2);
                                }
                                2JY A0B10 = 1BK.A0B(A0N, 2JX.class, -256642941, -1018253678);
                                if (A0B10 != null && (A0l = A0B10.A0l()) != null) {
                                    C0A2.A03(A0l);
                                }
                                A00.A0E = uri;
                                EffectItem effectItem = new EffectItem(A00);
                                if (!(A06 instanceof Collection) || !A06.isEmpty()) {
                                    Iterator it2 = A06.iterator();
                                    while (it2.hasNext()) {
                                        if (11T.A0O(((BaseItem) it2.next()).A09, ((BaseItem) effectItem).A09)) {
                                            break;
                                        }
                                    }
                                }
                                r04.A05(effectItem);
                            }
                        }
                    }
                }
                Object asList = r04.A07().asList();
                11T.A0A(asList);
                obj2 = asList;
                return obj2;
            case 5:
                AbstractC08294mh abstractC08294mh3 = (AbstractC08294mh) obj;
                if (abstractC08294mh3 == null || (obj3 = abstractC08294mh3.A03) == null || (A0B3 = 1BK.A0B((2JY) obj3, 2JX.class, -301163301, -1860908225)) == null) {
                    throw AnonymousClass001.A0L("Couldn't get a CoWatch session");
                }
                obj2 = new RIr(1BK.A0B(A0B3, 2JX.class, 1705130161, -1456046302).A0K(-37529164, GhB.class, -1549490698), A0B3.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerLivingRoomEvent", -1138096756));
                return obj2;
            case 6:
                AbstractC08294mh abstractC08294mh4 = (AbstractC08294mh) obj;
                if (abstractC08294mh4 == null || (obj4 = abstractC08294mh4.A03) == null || (A0B4 = 1BK.A0B((2JY) obj4, 2JX.class, 1245767082, 1055669794)) == null) {
                    throw AnonymousClass001.A0L("Maybe invalid living Room Id");
                }
                A0B4.A0r(1210412029);
                obj2 = new Object();
                return obj2;
            case 7:
                obj2 = null;
                return obj2;
            case 8:
                ThreadSummary threadSummary = (ThreadSummary) obj;
                HyG hyG = threadSummary != null ? threadSummary.A1e : null;
                ((I43) this.A01).A04 = hyG;
                obj2 = hyG;
                return obj2;
            case 9:
                Euz euz = (Euz) this.A01;
                obj2 = new Elq((ELQ) obj, euz.A00, euz.A01);
                return obj2;
            case 10:
            case 11:
            default:
                AbstractC08294mh abstractC08294mh5 = (AbstractC08294mh) obj;
                obj2 = I5H.A00((I5H) this.A01, abstractC08294mh5 != null ? abstractC08294mh5.A03 : null, null);
                return obj2;
            case 12:
                obj2 = ((5HV) this.A01).A08((MediaResource) obj);
                return obj2;
            case 13:
                obj2 = HxR.A01((2JX) ((AbstractC08294mh) obj).A03);
                return obj2;
        }
    }
}
