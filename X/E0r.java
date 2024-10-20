package X;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.graphservice.interfaces.PaginableList;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: E0r.class */
public final class E0r extends 2Yf {
    public int A00;
    public int A01;
    public int A02;
    public C7z0 A03;
    public ViewerContext A04;
    public PaginableList A05;
    public 1LI A06;
    public 1Im A07;
    public 1Im A08;
    public 1Im A09;
    public 1Im A0A;
    public 1Im A0B;
    public C2ko A0C;
    public C2ko A0D;
    public C2ko A0E;
    public ELJ A0F;
    public 5TY A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    public E0r() {
        super("GraphQLPaginationSection");
        this.A0H = true;
        this.A0I = false;
        this.A00 = 1;
        this.A0J = false;
        this.A01 = 5;
        this.A02 = 10;
    }

    public Object A0W(C2ko c2ko, Object obj, Object[] objArr) {
        int i = c2ko.A02;
        if (i == -684146657) {
            C2ko A0C = 2Yg.A0C(c2ko.A01.A03.A02, (C1qb) c2ko.A00, -153942713);
            if (A0C == null) {
                return null;
            }
            A0C.A00(new Object(), AnonymousClass001.A1Z());
            return null;
        }
        if (i == -323305309) {
            C2ko A0C2 = 2Yg.A0C(c2ko.A01.A03.A02, (C1qb) c2ko.A00, 2111713739);
            if (A0C2 == null) {
                return null;
            }
            A0C2.A00(new Object(), AnonymousClass001.A1Z());
            return null;
        }
        if (i != 388289342) {
            return null;
        }
        C2ko A0C3 = 2Yg.A0C(c2ko.A01.A03.A02, (C1qb) c2ko.A00, 1954813542);
        if (A0C3 == null) {
            return null;
        }
        A0C3.A00(new Object(), AnonymousClass001.A1Z());
        return null;
    }

    public void A0X(2Yv r302, 2Yv r303) {
        E0Z e0z = (E0Z) r302;
        E0Z e0z2 = (E0Z) r303;
        e0z2.A02 = e0z.A02;
        e0z2.A00 = e0z.A00;
        e0z2.A03 = e0z.A03;
        e0z2.A01 = e0z.A01;
        e0z2.A04 = e0z.A04;
    }

    public void A0Y(C1qp c1qp) {
        if (c1qp != null) {
            this.A0G = (5TY) c1qp.A01(5TY.class);
            this.A03 = (C7z0) c1qp.A01(C7z0.class);
            this.A04 = (ViewerContext) c1qp.A01(ViewerContext.class);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.2iw, java.lang.Object] */
    public void A0a(C1qb c1qb) {
        E0Z e0z = ((2Yf) this).A03;
        C7z0 c7z0 = this.A03;
        Object A0A = 1Bn.A0A(131348);
        1Bn.A0A(131349);
        F97 f97 = new F97(c7z0, (QuickPerformanceLogger) 1Bi.A03(16520));
        ?? obj = new Object();
        Object A03 = 1Bi.A03(99916);
        e0z.A00 = 1012343311;
        e0z.A01 = f97;
        e0z.A02 = obj;
        if (A0A != null) {
            e0z.A03 = (GKa) A0A;
        }
        if (A03 != null) {
            e0z.A04 = (Ei6) A03;
        }
    }

    public boolean A0c(2Yf r302, 2Yf r303, C1qb c1qb, C1qb c1qb2) {
        return true;
    }

    public 2Ys A0d(C1qb c1qb) {
        E0Z e0z = ((2Yf) this).A03;
        PaginableList paginableList = this.A05;
        ELJ elj = this.A0F;
        1Im r0 = this.A0A;
        1Im r02 = this.A0B;
        1Im r03 = this.A08;
        1Im r04 = this.A07;
        1Im r311 = this.A09;
        1LI r05 = this.A06;
        boolean z = this.A0H;
        boolean z2 = this.A0I;
        boolean z3 = this.A0J;
        int i = this.A01;
        int i2 = this.A00;
        int i3 = this.A02;
        ViewerContext viewerContext = this.A04;
        C2iw c2iw = e0z.A02;
        GKa gKa = e0z.A03;
        LW1 lw1 = null;
        AbR abR = (AbR) 1Bn.A0E(((1Iw) c1qb).A0D, (1BY) null, 369);
        DKE.A1S(c1qb);
        if (paginableList != null) {
            lw1 = abR.A09(viewerContext, paginableList);
        }
        2Yr r06 = new 2Yr();
        E0w e0w = new E0w();
        e0w.A0E = lw1;
        e0w.A0D = elj;
        ((2Yf) e0w).A02 = c2iw;
        e0w.A07 = r0;
        e0w.A08 = r02;
        e0w.A05 = r03;
        e0w.A04 = r04;
        e0w.A0L = z3;
        e0w.A03 = 7zQ.A0T(r05);
        if (r311 == null) {
            r311 = 2Yg.A0A(c1qb, E0r.class, "GraphQLPaginationSection", -647927820);
        }
        e0w.A06 = r311;
        e0w.A09 = 2Yg.A0A(c1qb, E0r.class, "GraphQLPaginationSection", 308181934);
        e0w.A0J = z;
        e0w.A00 = i2;
        e0w.A0K = z2;
        e0w.A01 = i;
        e0w.A02 = i3;
        e0w.A0F = gKa;
        C2ko c2ko = e0w.A0C;
        if (c2ko == null) {
            c2ko = 2Yg.A0D(e0w, c1qb, 1954813542);
        }
        e0w.A0C = c2ko;
        C2ko c2ko2 = e0w.A0A;
        if (c2ko2 == null) {
            c2ko2 = 2Yg.A0D(e0w, c1qb, -153942713);
        }
        e0w.A0A = c2ko2;
        C2ko c2ko3 = e0w.A0B;
        if (c2ko3 == null) {
            c2ko3 = 2Yg.A0D(e0w, c1qb, 2111713739);
        }
        e0w.A0B = c2ko3;
        r06.A01(e0w);
        return r06.A00;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0184. Please report as an issue. */
    public Object A0e(1Im r302, Object obj) {
        F5P f5p;
        short s;
        String obj2;
        int hashCode;
        QuickPerformanceLogger quickPerformanceLogger;
        TimeUnit timeUnit;
        String str;
        int i = r302.A01;
        if (i != -647927820) {
            if (i != 308181934) {
                return null;
            }
            String str2 = ((EdO) obj).A00;
            E0Z e0z = ((2Yf) this).A03;
            F97 f97 = e0z.A01;
            int i2 = e0z.A00;
            if (str2 == null) {
                return null;
            }
            f97.A04.markerAnnotate(i2, str2.hashCode(), "is_visible", true);
            return null;
        }
        EpW epW = (EpW) obj;
        1Iv r0 = r302.A00;
        E0r e0r = r0.A01;
        C1qb c1qb = (C1qb) r0.A00;
        String str3 = epW.A05;
        Integer num = epW.A03;
        long j = epW.A01;
        int i3 = epW.A00;
        String str4 = epW.A04;
        Exception exc = epW.A02;
        E0r e0r2 = e0r;
        E0Z e0z2 = ((2Yf) this).A03;
        PaginableList paginableList = e0r2.A05;
        int i4 = e0r2.A01;
        int i5 = e0r2.A02;
        boolean z = e0r2.A0H;
        5TY r02 = e0r2.A0G;
        int i6 = e0z2.A00;
        F97 f972 = e0z2.A01;
        Ei6 ei6 = e0z2.A04;
        C2mT c2mT = (C2mT) 1Bi.A03(17093);
        if (exc != null) {
            int hashCode2 = str3.hashCode();
            String message = exc.getMessage();
            11T.A0F(message, 2);
            f972.A04.markerAnnotate(i6, hashCode2, "exception", message);
            C7z0 c7z0 = f972.A03;
            if (c7z0 != null) {
                c7z0.Bch(0Pz.A0W("pagination_", "exception"), message);
            }
        }
        int size = paginableList == null ? 0 : paginableList.mTrees.size();
        String str5 = null;
        switch (num.intValue()) {
            case 0:
                int hashCode3 = str3.hashCode();
                QuickPerformanceLogger quickPerformanceLogger2 = f972.A04;
                if (!quickPerformanceLogger2.isMarkerOn(i6, hashCode3)) {
                    quickPerformanceLogger2.markerStart(i6, hashCode3, j, TimeUnit.MILLISECONDS);
                }
                quickPerformanceLogger2.markerPoint(i6, hashCode3, "fetch_request_start", j, TimeUnit.MILLISECONDS);
                quickPerformanceLogger2.markerAnnotate(i6, hashCode3, "instance_key", hashCode3);
                F97.A00(f972, "fetch_request_start");
                if (r02 != null) {
                    str5 = r02.A03;
                }
                String A02 = c2mT.A02();
                obj2 = c2mT.A00().isPresent() ? c2mT.A00().get().toString() : "unknown";
                11T.A0F(obj2, 9);
                quickPerformanceLogger2.markerAnnotate(i6, hashCode3, "page_size", i5);
                quickPerformanceLogger2.markerAnnotate(i6, hashCode3, "at_stream", false);
                quickPerformanceLogger2.markerAnnotate(i6, hashCode3, "tail_load_offset", i4);
                quickPerformanceLogger2.markerAnnotate(i6, hashCode3, GOm.A00(7), i3);
                quickPerformanceLogger2.markerAnnotate(i6, hashCode3, "start_list_size", size);
                if (str5 != null) {
                    quickPerformanceLogger2.markerAnnotate(i6, hashCode3, 4YT.A00(77), str5);
                }
                quickPerformanceLogger2.markerAnnotate(i6, hashCode3, AnonymousClass000.A00(34), A02);
                quickPerformanceLogger2.markerAnnotate(i6, hashCode3, 1BJ.A00(49), obj2);
                quickPerformanceLogger2.markerAnnotate(i6, hashCode3, "auto_paginate", z);
                DKE.A1S(c1qb);
                return null;
            case 1:
                int hashCode4 = str3.hashCode();
                QuickPerformanceLogger quickPerformanceLogger3 = f972.A04;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                quickPerformanceLogger3.markerPoint(i6, hashCode4, "fetch_request_end", j, timeUnit2);
                quickPerformanceLogger3.markerPoint(i6, hashCode4, "data_propagation_start", j, timeUnit2);
                F97.A00(f972, "fetch_request_end");
                F5P f5p2 = ei6.A00;
                f5p2.A02.markerPoint(1012337920, f5p2.A01, "fetch_request_end", j, timeUnit2);
                DKE.A1S(c1qb);
                return null;
            case 2:
                f972.A02(i6, str3.hashCode(), j, str4);
                F5P f5p3 = ei6.A00;
                if (str4 != null) {
                    f5p3.A02.markerAnnotate(1012337920, f5p3.A01, "fail_message", str4);
                }
                F5P.A00(f5p3, j, (short) 3);
                DKE.A1S(c1qb);
                return null;
            case 3:
                int hashCode5 = str3.hashCode();
                QuickPerformanceLogger quickPerformanceLogger4 = f972.A04;
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                quickPerformanceLogger4.markerPoint(i6, hashCode5, "capped_interrupted", j, timeUnit3);
                F5P f5p4 = ei6.A00;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = f5p4.A02;
                int i7 = f5p4.A01;
                if (!lightweightQuickPerformanceLogger.isMarkerOn(1012337920, i7, false)) {
                    lightweightQuickPerformanceLogger.markerStart(1012337920, i7, j, timeUnit3);
                    String str6 = f5p4.A00;
                    if (str6 == null) {
                        str6 = C2wf.A00;
                        f5p4.A00 = str6;
                    }
                    if (str6 != null) {
                        lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, "surface_session_id", str6);
                    }
                }
                if (r02 != null) {
                    str5 = r02.A03;
                }
                String A022 = c2mT.A02();
                obj2 = c2mT.A00().isPresent() ? c2mT.A00().get().toString() : "unknown";
                11T.A0F(obj2, 7);
                lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, "page_size", i5);
                lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, "at_stream", false);
                lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, "tail_load_offset", i4);
                lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, GOm.A00(7), i3);
                lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, "start_list_size", size);
                lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, AbE.A00(562), AnonymousClass001.A1O(size));
                if (str5 != null) {
                    lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, 4YT.A00(77), str5);
                }
                lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, AnonymousClass000.A00(34), A022);
                lightweightQuickPerformanceLogger.markerAnnotate(1012337920, i7, 1BJ.A00(49), obj2);
                DKE.A1S(c1qb);
                return null;
            case 4:
                hashCode = str3.hashCode();
                quickPerformanceLogger = f972.A04;
                timeUnit = TimeUnit.MILLISECONDS;
                str = "interrupted";
                quickPerformanceLogger.markerPoint(i6, hashCode, str, j, timeUnit);
                F97.A00(f972, str);
                return null;
            case 5:
                hashCode = str3.hashCode();
                quickPerformanceLogger = f972.A04;
                timeUnit = TimeUnit.MILLISECONDS;
                quickPerformanceLogger.markerPoint(i6, hashCode, "data_propagation_end", j, timeUnit);
                str = "data_render_start";
                quickPerformanceLogger.markerPoint(i6, hashCode, str, j, timeUnit);
                F97.A00(f972, str);
                return null;
            case 6:
                F5P f5p5 = ei6.A00;
                f5p5.A02.markerAnnotate(1012337920, f5p5.A01, "end_list_size", size);
                F5P.A00(f5p5, j, (short) 2);
                hashCode = str3.hashCode();
                quickPerformanceLogger = f972.A04;
                timeUnit = TimeUnit.MILLISECONDS;
                str = "data_render_end";
                quickPerformanceLogger.markerPoint(i6, hashCode, str, j, timeUnit);
                F97.A00(f972, str);
                return null;
            case 7:
                f972.A01(i6, str3.hashCode(), j, str4);
                f5p = ei6.A00;
                if (str4 != null) {
                    f5p.A02.markerAnnotate(1012337920, f5p.A01, "end_reason", str4);
                }
                s = 4;
                F5P.A00(f5p, j, s);
                return null;
            case 8:
                int hashCode6 = str3.hashCode();
                QuickPerformanceLogger quickPerformanceLogger5 = f972.A04;
                quickPerformanceLogger5.markerAnnotate(i6, hashCode6, "end_list_size", size);
                quickPerformanceLogger5.markerEnd(i6, hashCode6, (short) 2, j, TimeUnit.MILLISECONDS);
                F97.A00(f972, "marker_end");
                f5p = ei6.A00;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = f5p.A02;
                int i8 = f5p.A01;
                lightweightQuickPerformanceLogger2.markerPoint(1012337920, i8, "END");
                lightweightQuickPerformanceLogger2.markerAnnotate(1012337920, i8, "end_list_size", size);
                s = 2;
                F5P.A00(f5p, j, s);
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        E0r e0r = (E0r) super.A0g(z);
        e0r.A06 = 4YV.A0J(e0r.A06);
        if (!z) {
            ((2Yf) e0r).A03 = new Object();
        }
        return e0r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0h(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A0E, this, r303);
        7zQ.A1H(r302, this.A0C, this, r303);
        7zQ.A1H(r302, this.A0D, this, r303);
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0r e0r = (E0r) r302;
            if (this.A0H != e0r.A0H) {
                return false;
            }
            ELJ elj = this.A0F;
            ELJ elj2 = e0r.A0F;
            if (elj != null) {
                if (!elj.equals(elj2)) {
                    return false;
                }
            } else if (elj2 != null) {
                return false;
            }
            if (this.A0I != e0r.A0I || this.A00 != e0r.A00 || this.A0J != e0r.A0J) {
                return false;
            }
            1Im r0 = this.A07;
            1Im r02 = e0r.A07;
            if (r0 != null) {
                if (!r0.A01(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            1Im r03 = this.A08;
            1Im r04 = e0r.A08;
            if (r03 != null) {
                if (!r03.A01(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            1LI r05 = this.A06;
            1LI r06 = e0r.A06;
            if (r05 != null) {
                if (!C4Cv.A05(r05, r06, z)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
            if (this.A01 != e0r.A01 || this.A02 != e0r.A02) {
                return false;
            }
            PaginableList paginableList = this.A05;
            PaginableList paginableList2 = e0r.A05;
            if (paginableList != null) {
                if (!paginableList.equals(paginableList2)) {
                    return false;
                }
            } else if (paginableList2 != null) {
                return false;
            }
            1Im r07 = this.A09;
            1Im r08 = e0r.A09;
            if (r07 != null) {
                if (!r07.A01(r08)) {
                    return false;
                }
            } else if (r08 != null) {
                return false;
            }
            1Im r09 = this.A0A;
            1Im r010 = e0r.A0A;
            if (r09 != null) {
                if (!r09.A01(r010)) {
                    return false;
                }
            } else if (r010 != null) {
                return false;
            }
            1Im r011 = this.A0B;
            1Im r012 = e0r.A0B;
            if (r011 != null) {
                if (!r011.A01(r012)) {
                    return false;
                }
            } else if (r012 != null) {
                return false;
            }
            5TY r013 = this.A0G;
            5TY r014 = e0r.A0G;
            if (r013 != null) {
                if (!r013.equals(r014)) {
                    return false;
                }
            } else if (r014 != null) {
                return false;
            }
            C7z0 c7z0 = this.A03;
            C7z0 c7z02 = e0r.A03;
            if (c7z0 != null) {
                if (!c7z0.equals(c7z02)) {
                    return false;
                }
            } else if (c7z02 != null) {
                return false;
            }
            ViewerContext viewerContext = this.A04;
            ViewerContext viewerContext2 = e0r.A04;
            if (viewerContext != null) {
                if (!viewerContext.equals(viewerContext2)) {
                    return false;
                }
            } else if (viewerContext2 != null) {
                return false;
            }
        }
        return true;
    }
}
