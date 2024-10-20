package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.business.search.model.PlatformSearchData;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ae8, reason: case insensitive filesystem */
/* loaded from: Ae8.class */
public final class C1330Ae8 implements DIn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DK4 A01;
    public final /* synthetic */ 8B6 A02;
    public final /* synthetic */ AeL A03;
    public final /* synthetic */ AcX A04;
    public final /* synthetic */ C1315Adt A05;
    public final /* synthetic */ ImmutableList.Builder A06;

    public C1330Ae8(DK4 dk4, 8B6 r303, AeL aeL, AcX acX, C1315Adt c1315Adt, ImmutableList.Builder builder, int i) {
        this.A03 = aeL;
        this.A02 = r303;
        this.A04 = acX;
        this.A01 = dk4;
        this.A00 = i;
        this.A05 = c1315Adt;
        this.A06 = builder;
    }

    @Override // X.DIn
    public void D9q(PlatformSearchGameData platformSearchGameData) {
        11T.A0F(platformSearchGameData, 0);
        AcX acX = this.A04;
        String valueOf = String.valueOf(acX.A07(Crv.A00));
        AdZ adZ = this.A03.A04;
        String str = ((PlatformSearchData) platformSearchGameData).A02.A00(50).url;
        11T.A09(str);
        String str2 = ((PlatformSearchData) platformSearchGameData).A01.displayName;
        8B6 r0 = this.A02;
        53N r02 = acX.A0A;
        11T.A09(r02);
        DK4 dk4 = this.A01;
        DataSourceIdentifier dataSourceIdentifier = acX.A09;
        11T.A09(dataSourceIdentifier);
        int i = this.A00;
        int i2 = i / 4;
        RankingLoggingItem rankingLoggingItem = acX.A04;
        ImmutableList A0e = 7zN.A0e(valueOf);
        boolean A1T = AnonymousClass001.A1T(acX.A07(this.A05));
        11T.A0F(valueOf, 0);
        C1326Ae4 c1326Ae4 = new C1326Ae4(null, rankingLoggingItem, dataSourceIdentifier, r02, dk4, A0e, null, null, valueOf, null, i2, i, 0, false, A1T);
        try {
            Uri A03 = C0A2.A03(str);
            if (A03 != null) {
                C2q1 c2q1 = C2q0.A08;
                11T.A0B(c2q1);
                C1u3 c1u3 = AdZ.A0M;
                this.A06.m11011add((Object) new 8B3(r0, c1326Ae4, C5z6.A01(str2, 2), AdZ.A06(adZ, c2q1, ((2fZ) 1Br.A0B(adZ.A0F)).A0B(A03, C2fd.A0T)), adZ.A0H));
                return;
            }
        } catch (SecurityException unused) {
        }
        throw 1BK.A0h();
    }

    @Override // X.DIn
    public void D9r(PlatformSearchUserData platformSearchUserData) {
        11T.A0F(platformSearchUserData, 0);
        AeL aeL = this.A03;
        AdZ adZ = aeL.A04;
        1Kh A0y = AbF.A0y();
        String str = platformSearchUserData.A04;
        A0y.A05(str);
        A0y.A0t = ((PlatformSearchData) platformSearchUserData).A01.displayName;
        A0y.A0g = ((PlatformSearchData) platformSearchUserData).A02;
        A0y.A01(1Kq.A07);
        A0y.A1p = platformSearchUserData.A06;
        User A0w = AbF.A0w(A0y);
        8B6 r0 = this.A02;
        11T.A09(str);
        AcX acX = this.A04;
        53N r02 = acX.A0A;
        11T.A09(r02);
        DK4 dk4 = this.A01;
        DataSourceIdentifier dataSourceIdentifier = acX.A09;
        11T.A09(dataSourceIdentifier);
        int i = this.A00;
        C1326Ae4 c1326Ae4 = new C1326Ae4(null, acX.A04, dataSourceIdentifier, r02, dk4, 7zN.A0e(str), null, null, str, null, i / 4, i, 0, false, AnonymousClass001.A1T(acX.A07(this.A05)));
        Context context = aeL.A00;
        C2fd c2fd = C2fd.A0T;
        if (A0w.A0E() && A0w.A1r) {
            c2fd = C2fd.A01;
            ((7XR) 1Br.A0B(adZ.A05)).A00(A0w.A13, 0S2.A00);
        }
        C1u3 c1u3 = AdZ.A0M;
        C2fr A0R = ((2fZ) 1Br.A0B(adZ.A0F)).A0R(A0w, c2fd);
        C2q1 c2q1 = C2q0.A08;
        11T.A0B(c2q1);
        this.A06.m11011add((Object) new 8B3(r0, c1326Ae4, adZ.A0A(context, A0w), AdZ.A06(adZ, c2q1, A0R), adZ.A0H));
    }

    @Override // X.DIn
    public void D9s(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        AeL aeL = this.A03;
        AdZ adZ = aeL.A04;
        8B6 r0 = this.A02;
        AcX acX = this.A04;
        53N r02 = acX.A0A;
        11T.A09(r02);
        DK4 dk4 = this.A01;
        DataSourceIdentifier dataSourceIdentifier = acX.A09;
        11T.A09(dataSourceIdentifier);
        int i = this.A00;
        int i2 = i / 4;
        RankingLoggingItem rankingLoggingItem = acX.A04;
        C00i c00i = aeL.A03.A00;
        boolean A03 = ((AnonymousClass545) c00i.get()).A03(threadSummary);
        ImmutableList A00 = AnonymousClass545.A00((AnonymousClass545) c00i.get(), threadSummary, true);
        11T.A0A(A00);
        String valueOf = String.valueOf(threadSummary.A0n.A04);
        Long A0b = AbL.A0b(threadSummary.A0l);
        11T.A0F(valueOf, 0);
        C1326Ae4 c1326Ae4 = new C1326Ae4(null, rankingLoggingItem, dataSourceIdentifier, r02, dk4, A00, null, A0b, valueOf, null, i2, i, 0, A03, false);
        C2q1 c2q1 = C2q0.A08;
        11T.A0B(c2q1);
        this.A06.m11011add((Object) new 8B3(r0, c1326Ae4, adZ.A0C(threadSummary), AdZ.A06(adZ, c2q1, AdZ.A01(threadSummary, adZ)), adZ.A0H));
    }

    @Override // X.DIn
    public void D9t(C1772As6 c1772As6) {
        11T.A0F(c1772As6, 0);
        AeL aeL = this.A03;
        AdZ adZ = aeL.A04;
        8B6 r0 = this.A02;
        String str = c1772As6.A05;
        AcX acX = this.A04;
        53N r02 = acX.A0A;
        11T.A09(r02);
        DK4 dk4 = this.A01;
        DataSourceIdentifier dataSourceIdentifier = acX.A09;
        11T.A09(dataSourceIdentifier);
        int i = this.A00;
        int i2 = i / 4;
        RankingLoggingItem rankingLoggingItem = acX.A04;
        ImmutableList A0b = 1BK.A0b();
        8B3 r317 = null;
        Uri uri = null;
        11T.A0G(str, 0, r02);
        C1326Ae4 c1326Ae4 = new C1326Ae4(null, rankingLoggingItem, dataSourceIdentifier, r02, dk4, A0b, null, null, str, null, i2, i, 0, false, false);
        String str2 = c1772As6.A04;
        String str3 = c1772As6.A07;
        if (str2 != null && str3 != null) {
            try {
                uri = C0A2.A03(str2);
            } catch (SecurityException unused) {
            }
            Uri uri2 = null;
            try {
                uri2 = C0A2.A03(str3);
            } catch (SecurityException unused2) {
            }
            Long l = c1772As6.A03;
            MigColorScheme migColorScheme = adZ.A0H;
            11T.A0F(migColorScheme, 0);
            if (uri == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            if (uri2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            r317 = new 8B3(r0, c1326Ae4, (55A) null, new AnonymousClass591(uri, uri2, migColorScheme, l), migColorScheme);
        }
        CIx cIx = (CIx) 1Lm.A05(aeL.A00, aeL.A01, 84246);
        8Li r03 = new 8Li(0S2.A00, str, i);
        String str4 = r03.A03;
        if (str4 != null) {
            cIx.A04.put(str4, r03);
        }
        if (r317 != null) {
            this.A06.m11011add((Object) r317);
        }
    }

    @Override // X.DIn
    public void D9u(MessageSearchMessageModel messageSearchMessageModel) {
    }

    @Override // X.DIn
    public void D9v(MessageSearchThreadModel messageSearchThreadModel) {
    }

    @Override // X.DIn
    public void D9x(User user) {
        C1314Ads A00;
        11T.A0F(user, 0);
        AeL aeL = this.A03;
        AdZ adZ = aeL.A04;
        8B6 r0 = this.A02;
        AcX acX = this.A04;
        53N r02 = acX.A0A;
        11T.A09(r02);
        DK4 dk4 = this.A01;
        DataSourceIdentifier dataSourceIdentifier = acX.A09;
        11T.A09(dataSourceIdentifier);
        int i = this.A00;
        int i2 = i / 4;
        RankingLoggingItem rankingLoggingItem = acX.A04;
        Context context = aeL.A00;
        if (AbL.A1Z(1Bu.A06(context, 65819))) {
            C1316Adu c1316Adu = (C1316Adu) 1Bu.A06(context, 83553);
            UserKey userKey = user.A0k;
            11T.A0A(userKey);
            A00 = c1316Adu.A00(userKey);
        } else {
            A00 = null;
        }
        boolean A04 = ((AnonymousClass545) 1Br.A0B(aeL.A03)).A04(ImmutableList.of((Object) user));
        String str = user.A13;
        ImmutableList A0e = 7zN.A0e(str);
        boolean A1T = AnonymousClass001.A1T(acX.A07(this.A05));
        11T.A0A(str);
        C1326Ae4 c1326Ae4 = new C1326Ae4(A00, rankingLoggingItem, dataSourceIdentifier, r02, dk4, A0e, AbstractC1327Ae5.A00(user.A0a), null, str, null, i2, i, 0, A04, A1T);
        59C A002 = 5OL.A00(AbF.A1B(user));
        if (A002 != null) {
            C2fr A08 = AdZ.A08(adZ, user, 0S2.A00);
            C2q1 c2q1 = C2q0.A08;
            11T.A0B(c2q1);
            this.A06.m11011add((Object) new 8B3(r0, c1326Ae4, A002, AdZ.A06(adZ, c2q1, A08), adZ.A0H));
        }
    }
}
