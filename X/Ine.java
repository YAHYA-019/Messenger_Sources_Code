package X;

import android.net.Uri;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.montage.model.art.ArtAsset;
import com.facebook.messaging.montage.model.art.ArtItem;
import com.facebook.messaging.montage.model.art.ImageAsset;
import com.facebook.messaging.montage.model.art.TextAsset;
import com.facebook.models.ModelMetadata;
import com.facebook.rtc.launch.CallStartOutcome;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: Ine.class */
public final class Ine implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Ine(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static final ArrayList A00(ImmutableList immutableList, ImmutableList immutableList2) {
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            2JX A0D = AbG.A0D(it);
            2JY A0I = AbF.A0I(A0D, -102393834);
            if (A0I != null && A0I.A0l() != null) {
                A0s.add(new ImageAsset(A0D));
            }
        }
        1Du it2 = immutableList2.iterator();
        while (it2.hasNext()) {
            A0s.add(new TextAsset(AbG.A0D(it2)));
        }
        return A0s;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                IQS iqs = (IQS) this.A02;
                C7pa c7pa = (C7pa) this.A01;
                List list = IQS.A09;
                4YV.A11(iqs.A05).execute(new J0N(c7pa, iqs, th));
                return;
            case 1:
                return;
            case 2:
                4zJ A0U = AbstractC2326GOr.A0U(th);
                String str = 5Js.A02;
                5Jr r0 = (5Jr) this.A01;
                A0U.A05(str, " Retrieval of model %s version %s failed, error : %s ", new Object[]{r0.A03, Long.valueOf(r0.A00), th});
                return;
            default:
                11T.A0F(th, 0);
                4zI.A03.A02("RtcLauncherImpl", "joinMultiwayCall fail to get outcome of startMultiwayCallInternal", th, new Object[0]);
                return;
        }
    }

    public void onSuccess(Object obj) {
        Object obj2;
        2JY A0T;
        2JY A0T2;
        2JY A0B;
        String A0l;
        String A0l2;
        switch (this.A00) {
            case 0:
                Uri uri = null;
                if (obj == null || (obj2 = ((AbstractC08294mh) obj).A03) == null) {
                    IQS iqs = (IQS) this.A02;
                    C7pa c7pa = (C7pa) this.A01;
                    List list = IQS.A09;
                    4YV.A11(iqs.A05).execute(new J0N(c7pa, iqs, (Throwable) null));
                    return;
                }
                2JY r0 = (2JY) obj2;
                if (r0 == null || (A0T2 = r0.A0T(2JX.class, 1927467784)) == null || (A0B = 1BK.A0B(A0T2, GhX.class, -1045292299, 1433846567)) == null) {
                    IQS iqs2 = (IQS) this.A02;
                    List list2 = IQS.A09;
                    C01s A04 = 1Br.A04(iqs2.A04);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("MessengerMontageArtPickerComposition model is null for sectionId: ");
                    C7pa c7pa2 = (C7pa) this.A01;
                    A0k.append(c7pa2.A01);
                    A0k.append(", compositionId: ");
                    A0k.append(c7pa2.A00);
                    A0k.append(", andsectionTitle: ");
                    A04.D0v("ArtItemLoader", AnonymousClass001.A0d((r0 == null || (A0T = r0.A0T(2JX.class, 1927467784)) == null) ? null : A0T.A0r(-1308851074), A0k));
                    4YV.A11(iqs2.A05).execute(new J0N(c7pa2, iqs2, (Throwable) null));
                    return;
                }
                List list3 = IQS.A09;
                C7pa c7pa3 = (C7pa) this.A01;
                String str = c7pa3.A01;
                String A0r = A0T2.A0r(-1308851074);
                String A0r2 = A0B.A0r(-538310583);
                String A0t = A0B.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerMontageCompositionBakeType", -326499872);
                2JY A0B2 = 1BK.A0B(A0B, GhW.class, 1330532588, -1922803995);
                2JY A0B3 = 1BK.A0B(A0B, GhS.class, 1430247244, 1666496619);
                ImmutableList A0c = A0B.A0c(233872103, 2JX.class, 2086273132);
                if (A0c == null) {
                    A0c = 1BK.A0b();
                }
                ImmutableList A0c2 = A0B.A0c(-1204326699, 2JX.class, -1929595768);
                if (A0c2 == null) {
                    A0c2 = 1BK.A0b();
                }
                ImmutableList A0c3 = A0B.A0c(-1753640102, 2JX.class, 2086273132);
                if (A0c3 == null) {
                    A0c3 = 1BK.A0b();
                }
                ImmutableList A0c4 = A0B.A0c(809769986, 2JX.class, -1929595768);
                if (A0c4 == null) {
                    A0c4 = 1BK.A0b();
                }
                ArrayList A00 = A00(A0c, A0c2);
                ArrayList A002 = A00(A0c3, A0c4);
                Uri uri2 = null;
                if (A0B2 != null && (A0l2 = A0B2.A0l()) != null) {
                    try {
                        uri = C0A2.A03(A0l2);
                    } catch (SecurityException unused) {
                    }
                }
                if (A0B3 != null && (A0l = A0B3.A0l()) != null) {
                    try {
                        uri2 = C0A2.A03(A0l);
                    } catch (SecurityException unused2) {
                    }
                }
                if (A0t == null) {
                    A0t = "";
                }
                HC2 A003 = HC2.A00(A0t);
                11T.A0A(A003);
                HkK hkK = new HkK();
                hkK.A0E = A0r2;
                hkK.A02 = A003;
                A00.getClass();
                hkK.A08 = ImmutableList.copyOf((Collection) A00);
                hkK.A09 = ImmutableList.sortedCopyOf(C1zA.A00(ArtAsset.A00), A002);
                hkK.A01 = uri;
                hkK.A00 = uri2;
                hkK.A0A = str;
                hkK.A0B = A0r;
                ArtItem artItem = new ArtItem(hkK);
                IQS iqs3 = (IQS) this.A02;
                4YV.A11(iqs3.A05).execute(new J0M(c7pa3, iqs3, artItem));
                return;
            case 1:
                Hbu hbu = (Hbu) this.A02;
                6IM r02 = hbu.A00;
                Iterator it = hbu.A01.iterator();
                while (it.hasNext()) {
                    r02.A0L.remove(it.next());
                }
                return;
            case 2:
                ModelMetadata modelMetadata = (ModelMetadata) obj;
                if (modelMetadata == null) {
                    4zJ r03 = 4zI.A03;
                    String str2 = 5Js.A02;
                    5Jr r04 = (5Jr) this.A01;
                    r03.A05(str2, " model %s version %s - metadata is null, model path null", GOo.A1b(r04.A03, r04.A00));
                    return;
                }
                5Jr r05 = (5Jr) this.A01;
                String asset = modelMetadata.getAsset(r05.A02);
                4zJ r06 = 4zI.A03;
                String str3 = 5Js.A02;
                String str4 = r05.A03;
                r06.A05(str3, " Retrieval of model %s version %s was successful, model path: %s", new Object[]{str4, Long.valueOf(r05.A00), asset});
                5Js r07 = (5Js) this.A02;
                if (asset == null) {
                    r06.A08(str3, " %s cannot save null model path", new Object[]{str4});
                    return;
                }
                1G2 r08 = r05.A01;
                r06.A05(str3, "   %s saving model path with key %s  and path %s ", new Object[]{str4, r08.toString(), asset});
                1Ql A08 = 1Br.A08(r07.A00);
                A08.CaL(r08, asset);
                A08.commit();
                return;
            default:
                CallStartOutcome callStartOutcome = (CallStartOutcome) obj;
                11T.A0F(callStartOutcome, 0);
                if (callStartOutcome.A00()) {
                    return;
                }
                String str5 = callStartOutcome.A01;
                if (str5 == null) {
                    str5 = "MultiwayCallFailed";
                }
                ((JMR) this.A02).ARr(str5);
                ((IEA) this.A01).A06("join_multiway_call", str5);
                return;
        }
    }
}
