package X;

import android.graphics.Rect;
import com.facebook.acra.constants.ActionId;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: Gul.class */
public final class Gul extends I82 implements Cloneable {
    public Rect A00;
    public Rect A01;
    public IBB A02;
    public IBB A03;
    public IBB A04;
    public IBB A05;
    public IBB A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Double A0M;
    public Double A0N;
    public Double A0O;
    public Float A0P;
    public Float A0Q;
    public Float A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public Integer A0d;
    public Integer A0e;
    public Integer A0f;
    public Integer A0g;
    public Integer A0h;
    public Integer A0i;
    public Long A0j;
    public Long A0k;
    public Long A0l;
    public String A0m;
    public HashMap A0n;
    public List A0o;
    public List A0p;
    public float[] A0q;
    public int[] A0r;
    public final int[] A0s = GOn.A1b();
    public final I1R A0t;

    public Gul(I1R i1r) {
        List list = Collections.EMPTY_LIST;
        this.A0o = list;
        this.A0p = list;
        this.A0X = 0;
        this.A0i = 0;
        this.A0R = Float.valueOf(-1.0f);
        this.A0W = 0;
        this.A0K = false;
        this.A0H = false;
        this.A0I = false;
        this.A0J = false;
        this.A0A = false;
        this.A0L = false;
        this.A0E = false;
        this.A07 = false;
        this.A0n = AnonymousClass001.A0u();
        this.A0D = false;
        this.A08 = true;
        this.A0Y = 0;
        this.A0h = 7zN.A0h();
        this.A0S = 0;
        this.A0U = 0;
        this.A0a = 0;
        this.A0b = 0;
        this.A0e = 0;
        this.A0f = 0;
        this.A0d = 0;
        this.A0Z = 0;
        Long A0j = 4YV.A0j();
        this.A0j = A0j;
        Float A0f = 7zN.A0f();
        this.A0P = A0f;
        this.A0T = 1;
        this.A0g = 0;
        this.A0V = 1;
        this.A0k = A0j;
        Double valueOf = Double.valueOf(0.0d);
        this.A0M = valueOf;
        this.A0O = valueOf;
        this.A0N = valueOf;
        this.A0m = "";
        this.A09 = true;
        this.A0Q = A0f;
        this.A0B = false;
        this.A0c = 0;
        this.A0C = false;
        this.A0t = i1r;
    }

    public static void A00(Gul gul, HX7 hx7, int i) {
        gul.A02(hx7, Integer.valueOf(i));
    }

    public static void A01(Gul gul, HX7 hx7, boolean z) {
        gul.A02(hx7, Boolean.valueOf(z));
    }

    private void A02(HX7 hx7, Object obj) {
        int i = hx7.A00;
        Rect rect = null;
        int i2 = 0;
        switch (i) {
            case 0:
                this.A0A = (Boolean) obj;
                return;
            case 1:
                this.A0L = (Boolean) obj;
                return;
            case 2:
                if (GOp.A1Y(I1R.A0O, this.A0t)) {
                    obj.getClass();
                    boolean A1V = AnonymousClass001.A1V(obj);
                    int i3 = 0;
                    if (A1V) {
                        i3 = 17;
                    }
                    A00(this, I82.A0s, i3);
                    if (A1V) {
                        A01(this, I82.A0r, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A0K = (Boolean) obj;
                return;
            case 4:
                this.A0H = (Boolean) obj;
                return;
            case 5:
                this.A0E = (Boolean) obj;
                return;
            case 6:
                this.A07 = (Boolean) obj;
                return;
            case 7:
            case 16:
            case 20:
            case 28:
            case 29:
            case 40:
            case 41:
            case 43:
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
            case ActionId.PHOTO_CAPTURED /* 59 */:
            case ActionId.COUNTER /* 61 */:
            default:
                throw GOp.A16("Cannot directly set: ", i);
            case 8:
                this.A0J = (Boolean) obj;
                return;
            case 9:
                this.A0Y = (Integer) obj;
                return;
            case 10:
                obj.getClass();
                int A03 = AnonymousClass001.A03(obj);
                if (A03 != -1) {
                    i2 = A03;
                }
                this.A0X = Integer.valueOf(i2);
                return;
            case 11:
                this.A0S = (Integer) obj;
                return;
            case 12:
                this.A0U = (Integer) obj;
                return;
            case 13:
                this.A0W = (Integer) obj;
                return;
            case 14:
                this.A0a = (Integer) obj;
                return;
            case 15:
                this.A0b = (Integer) obj;
                return;
            case 17:
                this.A0e = (Integer) obj;
                return;
            case 18:
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return;
            case 19:
                this.A0f = (Integer) obj;
                return;
            case 21:
                this.A0d = (Integer) obj;
                return;
            case 22:
                this.A0Z = (Integer) obj;
                return;
            case 23:
                this.A0g = (Integer) obj;
                return;
            case 24:
                this.A0h = (Integer) obj;
                return;
            case 25:
                this.A0i = (Integer) obj;
                return;
            case 26:
                this.A0R = (Float) obj;
                return;
            case 27:
                this.A0k = (Long) obj;
                return;
            case 30:
                this.A0M = (Double) obj;
                return;
            case 31:
                this.A0O = (Double) obj;
                return;
            case 32:
                this.A0N = (Double) obj;
                return;
            case 33:
                IBB ibb = (IBB) obj;
                this.A04 = ibb;
                if (ibb != null) {
                    rect = new Rect(0, 0, ibb.A02, ibb.A01);
                }
                this.A01 = rect;
                return;
            case 34:
                IBB ibb2 = (IBB) obj;
                this.A03 = ibb2;
                if (ibb2 != null) {
                    rect = new Rect(0, 0, ibb2.A02, ibb2.A01);
                }
                this.A00 = rect;
                return;
            case 35:
                this.A05 = (IBB) obj;
                return;
            case 36:
                this.A02 = (IBB) obj;
                return;
            case 37:
                this.A0o = HwV.A00((List) obj);
                return;
            case 38:
                this.A0p = HwV.A00((List) obj);
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length != 2) {
                    return;
                }
                int[] iArr2 = this.A0s;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                return;
            case 42:
                this.A0m = (String) obj;
                return;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                this.A0D = (Boolean) obj;
                return;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                this.A08 = (Boolean) obj;
                return;
            case 46:
                this.A0j = (Long) obj;
                return;
            case ActionId.ON_START_END /* 47 */:
                this.A0V = (Integer) obj;
                return;
            case ActionId.QUEUED /* 48 */:
                this.A0P = (Float) obj;
                return;
            case ActionId.IN_PROGRESS /* 49 */:
                this.A0q = (float[]) obj;
                return;
            case 50:
                this.A0T = (Integer) obj;
                return;
            case ActionId.UNKNOWN /* 51 */:
                this.A0r = (int[]) obj;
                return;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                this.A09 = (Boolean) obj;
                return;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                this.A0Q = (Float) obj;
                return;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                this.A0n = (HashMap) obj;
                return;
            case ActionId.QUEUEING_FAIL /* 56 */:
                this.A0B = (Boolean) obj;
                return;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                this.A06 = (IBB) obj;
                return;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                this.A0I = (Boolean) obj;
                return;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                this.A0l = (Long) obj;
                return;
            case 63:
                this.A0F = (Boolean) obj;
                return;
            case 64:
                this.A0G = (Boolean) obj;
                return;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                this.A0c = (Integer) obj;
                return;
        }
    }

    public boolean A06(Hqp hqp) {
        boolean z;
        if (hqp.A10) {
            A00(this, I82.A0B, hqp.A0B);
            z = true;
        } else {
            z = false;
        }
        if (hqp.A0w) {
            A00(this, I82.A09, hqp.A0A);
            z = true;
        }
        if (hqp.A1F) {
            A01(this, I82.A0W, hqp.A1E);
            z = true;
        }
        if (hqp.A1i) {
            A01(this, I82.A0Z, hqp.A1h);
            z = true;
        }
        if (hqp.A1Z) {
            A01(this, I82.A0Y, hqp.A1Y);
            z = true;
        }
        if (hqp.A1Q) {
            A01(this, I82.A0X, hqp.A1P);
            z = true;
        }
        if (hqp.A1b) {
            A01(this, I82.A0r, hqp.A1a);
            z = true;
        }
        if (hqp.A0l) {
            A01(this, I82.A0P, hqp.A0k);
            z = true;
        }
        if (hqp.A0p) {
            A01(this, I82.A0R, hqp.A0o);
            z = true;
        }
        if (hqp.A1W) {
            A00(this, I82.A0o, hqp.A0K);
            z = true;
        }
        if (hqp.A1V) {
            A02(I82.A0n, hqp.A1o);
            z = true;
        }
        if (hqp.A12) {
            A00(this, I82.A0D, hqp.A0C);
            z = true;
        }
        if (hqp.A0j) {
            A01(this, I82.A0O, hqp.A0i);
            z = true;
        }
        if (hqp.A1M) {
            A02(I82.A0d, Float.valueOf(hqp.A04));
            z = true;
        }
        if (hqp.A14) {
            A01(this, I82.A0U, hqp.A13);
            z = true;
        }
        if (hqp.A0f) {
            A01(this, I82.A0M, hqp.A0e);
            z = true;
        }
        if (hqp.A0d) {
            A02(I82.A02, hqp.A0Y);
            z = true;
        }
        if (hqp.A1j) {
            A00(this, I82.A0z, hqp.A0N);
            z = true;
        }
        if (hqp.A0b) {
            A00(this, I82.A00, hqp.A06);
            z = true;
        }
        if (hqp.A0t) {
            A00(this, I82.A07, hqp.A08);
            z = true;
        }
        if (hqp.A1J) {
            A00(this, I82.A0a, hqp.A0E);
            z = true;
        }
        if (hqp.A1K) {
            A00(this, I82.A0b, hqp.A0F);
            z = true;
        }
        if (hqp.A1L) {
            A02(I82.A0c, hqp.A0S);
            z = true;
        }
        if (hqp.A1S) {
            A00(this, I82.A0i, hqp.A0I);
            z = true;
        }
        if (hqp.A1R) {
            A00(this, I82.A0g, hqp.A0H);
            z = true;
        }
        if (hqp.A1I) {
            A00(this, I82.A0L, hqp.A0D);
            z = true;
        }
        if (hqp.A0z) {
            A02(I82.A0A, Long.valueOf(hqp.A0P));
            z = true;
        }
        if (hqp.A0u) {
            A00(this, I82.A08, hqp.A09);
            z = true;
        }
        if (hqp.A0c) {
            A02(I82.A01, Float.valueOf(hqp.A03));
            z = true;
        }
        if (hqp.A0q) {
            A02(I82.A04, hqp.A1m);
            z = true;
        }
        if (hqp.A0r) {
            A00(this, I82.A05, hqp.A07);
            z = true;
        }
        if (hqp.A0s) {
            A02(I82.A06, hqp.A1n);
            z = true;
        }
        if (hqp.A1c) {
            A00(this, I82.A0s, hqp.A0L);
            z = true;
        }
        if (hqp.A1l) {
            A00(this, I82.A11, hqp.A0O);
            z = true;
        }
        if (hqp.A1d) {
            A02(I82.A0t, Float.valueOf(hqp.A05));
            z = true;
        }
        if (hqp.A19) {
            A02(I82.A0I, Long.valueOf(hqp.A0Q));
            z = true;
        }
        if (hqp.A15) {
            A02(I82.A0E, Double.valueOf(hqp.A00));
            z = true;
        }
        if (hqp.A17) {
            A02(I82.A0G, Double.valueOf(hqp.A02));
            z = true;
        }
        if (hqp.A16) {
            A02(I82.A0F, Double.valueOf(hqp.A01));
            z = true;
        }
        if (hqp.A18) {
            A02(I82.A0H, hqp.A0X);
            z = true;
        }
        if (hqp.A11) {
            A02(I82.A0C, hqp.A0Z);
            z = true;
        }
        if (hqp.A1O) {
            A02(I82.A0f, hqp.A0a);
            z = true;
        }
        if (hqp.A1X) {
            A02(I82.A0q, hqp.A0U);
            z = true;
        }
        if (hqp.A1T) {
            A02(I82.A0k, hqp.A0T);
            z = true;
        }
        if (hqp.A1k) {
            A02(I82.A10, hqp.A0W);
            z = true;
        }
        if (hqp.A1g) {
            A02(I82.A0y, hqp.A0V);
            z = true;
        }
        if (hqp.A0y) {
            A01(this, I82.A0S, hqp.A0x);
            z = true;
        }
        if (hqp.A0h) {
            A01(this, I82.A0N, hqp.A0g);
            z = true;
        }
        if (hqp.A0v) {
            A02(I82.A0l, null);
            z = true;
        }
        if (hqp.A0n) {
            A01(this, I82.A0Q, hqp.A0m);
            z = true;
        }
        if (hqp.A1N) {
            A00(this, I82.A0e, hqp.A0G);
            z = true;
        }
        if (hqp.A1e) {
            A02(I82.A0v, Long.valueOf(hqp.A0R));
            z = true;
        }
        if (hqp.A1B) {
            A01(this, I82.A0J, hqp.A1A);
            z = true;
        }
        if (!hqp.A1D) {
            return z;
        }
        A01(this, I82.A0K, hqp.A1C);
        return true;
    }

    public Object clone() {
        return super.clone();
    }
}
