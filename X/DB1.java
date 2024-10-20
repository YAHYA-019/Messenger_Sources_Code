package X;

import android.graphics.Typeface;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: DB1.class */
public final class DB1 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public DB1(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = str;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        boolean z;
        2JX r307;
        if (this.A00 == 0) {
            final C10374tG c10374tG = (C10374tG) this.A01;
            final 4tW r0 = (4tW) this.A02;
            String str = this.A03;
            ImmutableMap immutableMap = C10404ta.A06;
            Uri uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
            uri.getClass();
            try {
                return c10374tG.A03.A02(new C10404ta(uri, AbH.A0B(c10374tG), new C4j5(r0, c10374tG) { // from class: X.4tc
                    public final 4tW A00;
                    public final /* synthetic */ C10374tG A01;

                    {
                        this.A01 = c10374tG;
                        this.A00 = r0;
                    }

                    @Override // X.C4j5
                    public /* bridge */ /* synthetic */ Object BMZ(InputStream inputStream, Integer num, long j) {
                        boolean z2;
                        C10374tG c10374tG2 = this.A01;
                        4tI r02 = c10374tG2.A02;
                        4tW r03 = this.A00;
                        4cU A00 = r02.A00(r03, inputStream);
                        inputStream.close();
                        File file = A00.A00;
                        if (file.exists()) {
                            try {
                                Typeface.createFromFile(file);
                                z2 = true;
                            } catch (Exception unused2) {
                                z2 = false;
                            }
                            if (z2) {
                                return Uri.fromFile(file);
                            }
                        }
                        1BK.A09(c10374tG2.A00).D0v(C10374tG.__redex_internal_original_name, AnonymousClass001.A0Z(r03, "Invalid font file: ", AnonymousClass001.A0k()));
                        throw new IOException();
                    }
                }));
            } catch (IOException e) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Error in fetchFontResource: ");
                A0k.append(str);
                1BK.A09(c10374tG.A00).softReport(C10374tG.__redex_internal_original_name, AnonymousClass001.A0Z(r0, ", ", A0k), e);
                Throwables.propagate(e);
                throw 0Q8.createAndThrow();
            }
        }
        4qC r02 = (4qC) this.A01;
        String str2 = r02.A04;
        if (str2 != null) {
            ViewerContext viewerContext = (ViewerContext) 1Bn.A0A(83431);
            ViewerContext viewerContext2 = (ViewerContext) 1Bn.A0A(33059);
            if (!str2.equals(viewerContext2 != null ? viewerContext2.mUserId : viewerContext != null ? viewerContext.mUserId : null)) {
                r02.A03 = null;
                return null;
            }
        }
        try {
            FbUserSession fbUserSession = (FbUserSession) this.A02;
            5Uj r03 = (5Uj) 1Lo.A06(fbUserSession, 49752);
            String str3 = this.A03;
            5Uf r04 = r03.A02;
            5Ug r05 = 5Ug.A04;
            boolean A02 = r04.A02(r05);
            String A00 = 4YT.A00(91);
            if (A02) {
                str3 = A00;
            }
            if (str3.equals(A00)) {
                z = false;
            } else {
                if (!str3.equals(1BJ.A00(316))) {
                    throw 1BK.A0i("invalid fetch type ", str3);
                }
                z = true;
            }
            FbUserSession fbUserSession2 = r03.A01;
            ViewerContext BHu = fbUserSession2.BHu();
            if (fbUserSession2.BKF().mIsPageContext) {
                ((1Fv) 1Bi.A03(66351)).A08(BHu);
            }
            C3sa A002 = C3sa.A00(AbF.A0H(76));
            C2ib c2ib = r03.A03;
            A002.A0A(c2ib.A00());
            A002.A00 = BHu;
            if (z) {
                A002.A09(c2ib.A00());
            }
            4YU.A1J(A002, 367103207806489L);
            1Vd A0K = 7zM.A0K(r03.A00);
            4YU.A1J(A002, 367103207806489L);
            AbstractC08294mh abstractC08294mh = (AbstractC08294mh) AbstractC05474dx.A01(5Tu.class, A0K.A09(A002));
            if (abstractC08294mh == null) {
                r307 = null;
            } else {
                if (!z) {
                    r04.A03(r05, 1BK.A0d());
                }
                r307 = (2JX) abstractC08294mh.A03;
            }
            synchronized (r02) {
                4qC.A00(r307, r02);
                r02.A00 = 1BL.A08(r02.A08);
                r02.A03 = null;
                r02.A05 = false;
                r02.A06.CkT("com.facebook.orca.ACTION_ADMINED_PAGES_UPDATED");
                4qC.A01(r02);
                C00i c00i = r02.A0C;
                ((5Uk) c00i.get()).A04();
                2JX r06 = r02.A02;
                if (r06 != null) {
                    2JX A1w = r06.A1w();
                    if (A1w != null) {
                        2JX A1n = A1w.A1n();
                        if (A1n != null) {
                            ImmutableList A2K = A1n.A2K(-64262029, 1252421754);
                            if (A2K != null) {
                                1Du it = A2K.iterator();
                                while (it.hasNext()) {
                                    2JX A0D = AbG.A0D(it);
                                    ((5Uk) c00i.get()).A05(fbUserSession, A0D.A0k(), A0D.getIntValue(-1305806265));
                                }
                            }
                        }
                    }
                }
            }
        } catch (5Tu e2) {
            synchronized (r02) {
                r02.A03 = null;
                1BK.A09(r02.A09).D0v("AdminedPagesDataStore", 0Pz.A1B("Fetch Admined Pages Error. ", e2));
            }
        }
        return r02.A02;
    }
}
