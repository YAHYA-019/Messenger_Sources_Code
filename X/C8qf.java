package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8qf, reason: invalid class name */
/* loaded from: 8qf.class */
public final class C8qf extends 2Yf {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public FbUserSession A06;
    public 2YJ A07;
    public 9Wy A08;
    public C9yk A09;
    public MigColorScheme A0A;
    public ImmutableList A0B;

    public C8qf() {
        super("MontageGridLayout");
        this.A00 = -1;
    }

    public void A0Q(C1qb c1qb) {
        9Wy r0 = this.A08;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void A0T(C1qb c1qb) {
        if (c1qb.A0J() != null) {
            c1qb.A0G(7zR.A0N(), "updateState:MontageGridLayout.setIsDataBound");
        }
    }

    public void A0X(2Yv r302, 2Yv r303) {
        ((C8oh) r303).A00 = ((C8oh) r302).A00;
    }

    public void A0Z(2Yy r302, C1qb c1qb, int i, int i2, int i3, long j, boolean z, boolean z2) {
        int i4;
        9H6 r0 = (9H6) 1Bn.A0A(68047);
        1FP r02 = (1FP) 1Bi.A03(67765);
        FbUserSession A00 = C54z.A00(c1qb);
        Context context = ((1Iw) c1qb).A0D;
        6Bd r03 = (6Bd) 1Lo.A04(context, A00, (1BY) null, 49985);
        6Bf r04 = (6Bf) 1Lo.A04(context, A00, (1BY) null, 49987);
        C00i c00i = r03.A00;
        if (1BK.A0U(c00i).isMarkerOn(5505216)) {
            1BK.A0U(c00i).markerPoint(5505216, "tray_items_rendered");
            AtomicBoolean atomicBoolean = r03.A01;
            if (atomicBoolean.get()) {
                1BK.A0U(c00i).markerEnd(5505216, (short) 2);
                atomicBoolean.set(false);
            } else {
                0fH.A0j("ContactsMontageTrayTTILogger", "Can't end trace with success as montages are not loaded.");
            }
        }
        synchronized (r04) {
            C00i c00i2 = r04.A00;
            if (1BK.A0U(c00i2).isMarkerOn(5510782)) {
                1BK.A0U(c00i2).markerPoint(5510782, "tray_items_rendered");
                if (r04.A06 == null || r04.A06.A01().size() <= 0) {
                    if (r04.A06 != null) {
                        9hS r05 = r04.A06;
                        synchronized (r05) {
                            try {
                                i4 = r05.A00;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } else {
                        i4 = 0;
                    }
                    1BK.A0U(c00i2).markerAnnotate(5510782, "tray_image_count_outstanding", i4);
                    1BK.A0U(c00i2).markerAnnotate(5510782, "end_reason", "non_empty_with_tiles");
                    1BK.A0U(c00i2).markerEnd(5510782, (short) 2);
                    6Bf.A00(r04);
                    r04.A02.set(false);
                } else {
                    9hS r06 = r04.A06;
                    if (r06.A06) {
                        synchronized (r06) {
                            try {
                                if (r06.A07) {
                                    boolean z3 = false;
                                    r06.A07 = false;
                                    boolean z4 = r06.A01;
                                    int i5 = r06.A00;
                                    if (i5 == 0) {
                                        z3 = true;
                                    } else {
                                        0fH.A0e("messenger_montage_thumbnail", Integer.valueOf(i5), "VisibleImageTracker", "(%s) Waiting for %d images...");
                                    }
                                    if (z3) {
                                        9hS.A00(r06, z4);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    }
                }
            } else {
                0fH.A0k("PeopleMontageTrayRenderTTILogger", "markMontageTilesRendered called before starting marker");
            }
        }
        r02.D3D(3Ds.A04, 0S2.A01, new ACy(r0), "montage_homebase_voltron_prefetch");
    }

    public void A0a(C1qb c1qb) {
        ((C8oh) ((2Yf) this).A03).A00 = false;
    }

    public 2Ys A0d(C1qb c1qb) {
        C8oh c8oh = (C8oh) ((2Yf) this).A03;
        ImmutableList immutableList = this.A0B;
        int i = this.A00;
        if (c8oh.A00) {
            float f = 0.0f / 0.0f;
            if (i != -1) {
                2Yg.A0G(c1qb, i + 1, (int) ((7zQ.A0L(c1qb).densityDpi / 160.0f) * 100.0f));
            }
        }
        2Yr A0l = 7zL.A0l();
        C2hf A0s = 7zM.A0s(c1qb, immutableList);
        A0s.A04(2Yg.A06(c1qb, C8qf.class, "MontageGridLayout"));
        A0s.A03(2Yg.A08(c1qb, C8qf.class, "MontageGridLayout"));
        A0s.A05(2Yg.A07(c1qb, C8qf.class, "MontageGridLayout"));
        A0l.A00(A0s);
        return A0l.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r0 == r0.A01) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
    
        r311 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        if (r0.A06 == r0.A06) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8qf.A0e(X.1Im, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        2Yf A0g = super.A0g(z);
        if (!z) {
            A0g.A03 = new Object();
        }
        return A0g;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qf c8qf = (C8qf) r302;
            FbUserSession fbUserSession = this.A06;
            FbUserSession fbUserSession2 = c8qf.A06;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            if (this.A00 != c8qf.A00) {
                return false;
            }
            2YJ r0 = this.A07;
            2YJ r02 = c8qf.A07;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            if (this.A01 != c8qf.A01) {
                return false;
            }
            C9yk c9yk = this.A09;
            C9yk c9yk2 = c8qf.A09;
            if (c9yk != null) {
                if (!c9yk.equals(c9yk2)) {
                    return false;
                }
            } else if (c9yk2 != null) {
                return false;
            }
            MigColorScheme migColorScheme = this.A0A;
            MigColorScheme migColorScheme2 = c8qf.A0A;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            ImmutableList immutableList = this.A0B;
            ImmutableList immutableList2 = c8qf.A0B;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            if (this.A02 != c8qf.A02) {
                return false;
            }
            9Wy r03 = this.A08;
            9Wy r04 = c8qf.A08;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            if (this.A03 != c8qf.A03 || this.A04 != c8qf.A04 || this.A05 != c8qf.A05) {
                return false;
            }
        }
        return true;
    }
}
