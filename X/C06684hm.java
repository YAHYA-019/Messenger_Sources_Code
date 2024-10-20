package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.facebook.inject.FbInjector;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hm.class */
public class C06684hm implements 2Ib {
    public static final 2Ib A00 = new Object();

    public static void A02(String str, Throwable th) {
        android.util.Log.e("FwdControllerListener2", 0Pz.A0W(1BJ.A00(772), str), th);
    }

    public void Bvs(Object obj) {
        C06664hk c06664hk;
        Integer num;
        4hQ r309;
        if (this instanceof C06674hl) {
            C06674hl c06674hl = (C06674hl) this;
            long A01 = c06674hl.A03.A01();
            c06664hk = c06674hl.A02;
            num = 0S2.A0j;
            11T.A0F(num, 0);
            c06664hk.A0E = Long.valueOf(A01);
            c06674hl.A01.Bgh(c06664hk, num);
            r309 = c06674hl.A00;
            if (r309 == null) {
                return;
            }
        } else {
            if (this instanceof C06714hp) {
                List list = ((C06714hp) this).A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        try {
                            ((2Ib) list.get(i)).Bvs(obj);
                        } catch (Exception e) {
                            A02("onEmptyEvent", e);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        return;
                    }
                }
                return;
            }
            if (!(this instanceof 6A0)) {
                return;
            }
            6A0 r0 = (6A0) this;
            c06664hk = r0.A02;
            num = 0S2.A0j;
            11T.A0F(num, 0);
            r309 = r0.A01;
        }
        r309.Bgh(c06664hk, num);
    }

    public void Bxq(5CI r302, String str, Throwable th) {
        if (this instanceof 6A0) {
            6A0 r0 = (6A0) this;
            long now = r0.A00.now();
            C06664hk c06664hk = r0.A02;
            c06664hk.A0A = r302;
            c06664hk.A02 = now;
            c06664hk.A0N = str;
            c06664hk.A0V = th;
            Integer num = 0S2.A0Y;
            11T.A0F(num, 0);
            4hQ r02 = r0.A01;
            r02.Bgh(c06664hk, num);
            Integer num2 = 0S2.A0C;
            c06664hk.A0D = num2;
            c06664hk.A08 = now;
            r02.Bgn(c06664hk, num2);
            return;
        }
        if (this instanceof C06714hp) {
            11T.A0F(str, 0);
            List list = ((C06714hp) this).A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    try {
                        ((2Ib) list.get(i)).Bxq(r302, str, th);
                    } catch (Exception e) {
                        A02("onFailure", e);
                    }
                } catch (IndexOutOfBoundsException unused) {
                    return;
                }
            }
            return;
        }
        if (this instanceof C06674hl) {
            C06674hl c06674hl = (C06674hl) this;
            11T.A0F(str, 0);
            4hY r03 = c06674hl.A03;
            long millis = TimeUnit.NANOSECONDS.toMillis(r03.A01());
            C06664hk c06664hk2 = c06674hl.A02;
            c06664hk2.A0A = r302;
            c06664hk2.A02 = millis;
            c06664hk2.A0N = str;
            c06664hk2.A0V = th;
            if (th != null) {
                c06664hk2.A0O = th.getMessage();
                int Aku = c06674hl.A04.Aku();
                if (Aku != 0) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    int min = Math.min(stackTrace.length, Aku);
                    int i2 = 0;
                    if (min >= 0) {
                        while (true) {
                            1BK.A1R(A0k, stackTrace[i2]);
                            A0k.append("\n");
                            if (i2 == min) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    c06664hk2.A0P = 11T.A02(A0k);
                }
                c06664hk2.A0C = r03.A03(th);
            }
            C06674hl.A00(c06664hk2, c06674hl, 0S2.A0Y);
            if (c06674hl.A05 || !c06674hl.A04.BCj()) {
                Integer num3 = 0S2.A0C;
                c06664hk2.A0D = num3;
                c06664hk2.A08 = millis;
                c06674hl.A01.Bgn(c06664hk2, num3);
                4hQ r04 = c06674hl.A00;
                if (r04 != null) {
                    r04.Bgn(c06664hk2, num3);
                }
            }
        }
    }

    public void Byd(5CI r302, Object obj, String str) {
        DisplayMetrics displayMetrics;
        if (this instanceof C06714hp) {
            11T.A0F(str, 0);
            List list = ((C06714hp) this).A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    try {
                        ((2Ib) list.get(i)).Byd(r302, obj, str);
                    } catch (Exception e) {
                        A02("onFinalImageSet", e);
                    }
                } catch (IndexOutOfBoundsException unused) {
                    return;
                }
            }
            return;
        }
        if (!(this instanceof C06674hl)) {
            if (this instanceof 6A0) {
                6A0 r0 = (6A0) this;
                long now = r0.A00.now();
                C06664hk c06664hk = r0.A02;
                c06664hk.A0A = r302;
                c06664hk.A03 = now;
                c06664hk.A06 = now;
                c06664hk.A0N = str;
                c06664hk.A0I = obj;
                Integer num = 0S2.A0N;
                11T.A0F(num, 0);
                r0.A01.Bgh(c06664hk, num);
                return;
            }
            return;
        }
        C06674hl c06674hl = (C06674hl) this;
        11T.A0F(str, 0);
        long millis = TimeUnit.NANOSECONDS.toMillis(c06674hl.A03.A01());
        C06664hk c06664hk2 = c06674hl.A02;
        c06664hk2.A0A = r302;
        c06664hk2.A03 = millis;
        c06664hk2.A06 = millis;
        c06664hk2.A0N = str;
        c06664hk2.A0I = obj;
        Context A002 = FbInjector.A00();
        11T.A0A(A002);
        Resources resources = A002.getResources();
        c06664hk2.A0B = (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? null : Integer.valueOf(displayMetrics.densityDpi);
        C06674hl.A00(c06664hk2, c06674hl, 0S2.A0N);
    }

    public void C2C(String str) {
        if (!(this instanceof C06714hp)) {
            return;
        }
        11T.A0F(str, 0);
        List list = ((C06714hp) this).A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            try {
                try {
                    ((2Ib) list.get(i2)).C2C(str);
                } catch (Exception e) {
                    A02("onIntermediateImageFailed", e);
                }
                i = i2 + 1;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void C2E(String str, Object obj) {
        if (this instanceof C06674hl) {
            C06674hl c06674hl = (C06674hl) this;
            2Ec r0 = (2Ec) obj;
            11T.A0F(str, 0);
            long A01 = c06674hl.A03.A01();
            C06664hk c06664hk = c06674hl.A02;
            c06664hk.A04 = TimeUnit.NANOSECONDS.toMillis(A01);
            c06664hk.A0N = str;
            c06664hk.A0I = r0;
            c06664hk.A0X = false;
            if (r0 != null) {
                int i = ((C06784hw) r0.B5c()).A00;
                c06664hk.A0a.add(new 03Y((i < 0 || i >= 15) ? 0Pz.A0T("quality-", i) : C7mr.A00[i], Long.valueOf(A01)));
                c06664hk.A0X = true;
            }
            C06674hl.A00(c06664hk, c06674hl, 0S2.A0C);
            return;
        }
        if (this instanceof C06714hp) {
            11T.A0F(str, 0);
            List list = ((C06714hp) this).A00;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    try {
                        ((2Ib) list.get(i2)).C2E(str, obj);
                    } catch (Exception e) {
                        A02("onIntermediateImageSet", e);
                    }
                } catch (IndexOutOfBoundsException unused) {
                    return;
                }
            }
            return;
        }
        if (this instanceof 6A0) {
            6A0 r02 = (6A0) this;
            long now = r02.A00.now();
            C06664hk c06664hk2 = r02.A02;
            c06664hk2.A04 = now;
            c06664hk2.A0N = str;
            c06664hk2.A0I = obj;
            Integer num = 0S2.A0C;
            11T.A0F(num, 0);
            r02.A01.Bgh(c06664hk2, num);
        }
    }

    public void CG8(5CI r302, String str) {
        if (this instanceof C06714hp) {
            11T.A0F(str, 0);
            List list = ((C06714hp) this).A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    try {
                        ((2Ib) list.get(i)).CG8(r302, str);
                    } catch (Exception e) {
                        A02("onRelease", e);
                    }
                } catch (IndexOutOfBoundsException unused) {
                    return;
                }
            }
            return;
        }
        if (!(this instanceof C06674hl)) {
            if (this instanceof 6A0) {
                6A0 r0 = (6A0) this;
                long now = r0.A00.now();
                C06664hk c06664hk = r0.A02;
                c06664hk.A0A = r302;
                c06664hk.A0N = str;
                Integer num = 0S2.A0u;
                11T.A0F(num, 0);
                4hQ r02 = r0.A01;
                r02.Bgh(c06664hk, num);
                if (r0.A03) {
                    Integer num2 = 0S2.A0C;
                    c06664hk.A0D = num2;
                    c06664hk.A08 = now;
                    r02.Bgn(c06664hk, num2);
                    return;
                }
                return;
            }
            return;
        }
        C06674hl c06674hl = (C06674hl) this;
        11T.A0F(str, 0);
        long A01 = c06674hl.A03.A01();
        long millis = TimeUnit.NANOSECONDS.toMillis(A01);
        C06664hk c06664hk2 = c06674hl.A02;
        c06664hk2.A0A = r302;
        c06664hk2.A0N = str;
        c06664hk2.A0G = Long.valueOf(A01);
        C06674hl.A00(c06664hk2, c06674hl, 0S2.A0u);
        if ((c06674hl.A05 || !c06674hl.A04.BCj()) && c06674hl.A06) {
            Integer num3 = 0S2.A0C;
            c06664hk2.A0D = num3;
            c06664hk2.A08 = millis;
            c06674hl.A01.Bgn(c06664hk2, num3);
            4hQ r03 = c06674hl.A00;
            if (r03 != null) {
                r03.Bgn(c06664hk2, num3);
            }
        }
    }

    public void COD(5CI r302, Object obj, String str) {
        C06664hk c06664hk;
        Integer num;
        4hQ r313;
        if (this instanceof 6A0) {
            6A0 r0 = (6A0) this;
            long now = r0.A00.now();
            c06664hk = r0.A02;
            c06664hk.A02();
            c06664hk.A05 = now;
            c06664hk.A0N = str;
            c06664hk.A0H = obj;
            c06664hk.A0A = r302;
            num = 0S2.A01;
            11T.A0F(num, 0);
            r313 = r0.A01;
            r313.Bgh(c06664hk, num);
            if (!r0.A03) {
                return;
            }
            c06664hk.A0D = num;
            c06664hk.A09 = now;
        } else {
            if (this instanceof C06714hp) {
                11T.A0F(str, 0);
                List list = ((C06714hp) this).A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        try {
                            ((2Ib) list.get(i)).COD(r302, obj, str);
                        } catch (Exception e) {
                            A02("onSubmit", e);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        return;
                    }
                }
                return;
            }
            if (!(this instanceof C06674hl)) {
                return;
            }
            C06674hl c06674hl = (C06674hl) this;
            11T.A0F(str, 0);
            long millis = TimeUnit.NANOSECONDS.toMillis(c06674hl.A03.A01());
            c06664hk = c06674hl.A02;
            c06664hk.A02();
            c06664hk.A05 = millis;
            c06664hk.A0N = str;
            c06664hk.A0H = obj;
            c06664hk.A0A = r302;
            if (c06664hk.A09 == -1) {
                C06674hl.A01(c06674hl);
            }
            num = 0S2.A01;
            C06674hl.A00(c06664hk, c06674hl, num);
            if ((!c06674hl.A05 && c06674hl.A04.BCj()) || !c06674hl.A06) {
                return;
            }
            c06664hk.A0D = num;
            c06664hk.A09 = millis;
            C06674hl.A01(c06674hl);
            c06674hl.A01.Bgn(c06664hk, num);
            r313 = c06674hl.A00;
            if (r313 == null) {
                return;
            }
        }
        r313.Bgn(c06664hk, num);
    }
}
