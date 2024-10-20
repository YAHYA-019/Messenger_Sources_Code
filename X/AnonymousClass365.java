package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.365, reason: invalid class name */
/* loaded from: 365.class */
public final class AnonymousClass365 extends AnonymousClass366 {
    public static final C3Op A0O = new Object();
    public static final char[] A0P;
    public int A00;
    public C2vl A01;
    public C2vm A02;
    public AnonymousClass364 A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public java.util.Map A0E;
    public final int A0F;
    public final C0dp A0G;
    public final Class A0H;
    public final String A0I;
    public final String A0J;
    public final java.util.Map A0K;
    public final java.util.Map A0L;
    public final boolean A0M;
    public volatile 3J2 A0N;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Op, java.lang.Object] */
    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        11T.A0A(charArray);
        A0P = charArray;
    }

    public AnonymousClass365(Activity activity, C0dp c0dp, String str) {
        11T.A0F(c0dp, 3);
        Class<?> cls = activity.getClass();
        int hashCode = activity.hashCode();
        ArrayList A0s = AnonymousClass001.A0s();
        Intent intent = activity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("key_uri") : null;
        11T.A0F(cls, 1);
        this.A0H = cls;
        this.A0J = str;
        this.A0F = hashCode;
        this.A0I = stringExtra;
        this.A0G = c0dp;
        this.A0B = C3Op.A00();
        this.A0L = AnonymousClass001.A0u();
        this.A0K = AnonymousClass001.A0u();
        this.A0C = C2vt.A00(c0dp.now());
        this.A0M = FragmentActivity.class.isAssignableFrom(this.A0H);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            11T.A0F(fragment, 0);
            A00(fragment, this);
        }
    }

    public static final void A00(Fragment fragment, AnonymousClass365 anonymousClass365) {
        06Z childFragmentManager;
        java.util.Map map;
        int i;
        java.util.Map map2 = anonymousClass365.A0K;
        11T.A0D(map2);
        if (!1BL.A1Y(fragment, map2)) {
            Fragment fragment2 = fragment.mParentFragment;
            AnonymousClass364 anonymousClass364 = new AnonymousClass364(fragment, anonymousClass365, fragment2 != null ? 1BK.A0j(fragment2) : null);
            3J2 r0 = anonymousClass365.A0N;
            if (r0 != null) {
                1YY r02 = r0.A00;
                String str = anonymousClass364.A0B;
                ImmutableList immutableList = 1YY.A0C;
                java.util.Map map3 = r02.A0A;
                synchronized (map3) {
                    map3.put(str, new WeakReference(fragment));
                }
            }
            if (fragment2 == null) {
                map = anonymousClass365.A0L;
                11T.A0D(map);
                i = fragment.hashCode();
            } else {
                if (!1BL.A1Y(fragment2, map2)) {
                    A00(fragment2, anonymousClass365);
                    return;
                }
                AnonymousClass364 anonymousClass3642 = (AnonymousClass364) 1BL.A0j(fragment2, map2);
                if (anonymousClass3642 != null) {
                    map = anonymousClass3642.A0J;
                    i = anonymousClass364.A0F;
                }
                map2.put(1BK.A0j(fragment), anonymousClass364);
            }
            1BK.A1O(anonymousClass364, map, i);
            map2.put(1BK.A0j(fragment), anonymousClass364);
        }
        if (fragment.getHost() == null || (childFragmentManager = fragment.getChildFragmentManager()) == null || childFragmentManager.A0T.A0A() == null) {
            return;
        }
        for (Fragment fragment3 : fragment.getChildFragmentManager().A0T.A0A()) {
            if (fragment3 != null) {
                A00(fragment3, anonymousClass365);
            }
        }
    }

    public static final void A01(AnonymousClass364 anonymousClass364, AnonymousClass365 anonymousClass365) {
        Iterator A0y = AnonymousClass001.A0y(anonymousClass364.A0J);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            int A03 = AnonymousClass001.A03(A0z.getKey());
            AnonymousClass364 anonymousClass3642 = (AnonymousClass364) A0z.getValue();
            java.util.Map map = anonymousClass365.A0K;
            11T.A0D(map);
            map.remove(Integer.valueOf(A03));
            A01(anonymousClass3642, anonymousClass365);
            AnonymousClass364 anonymousClass3643 = anonymousClass365.A03;
            if (anonymousClass3643 != null && anonymousClass3643.A0F == A03) {
                anonymousClass365.A03 = null;
            }
        }
    }

    public final void A02(Fragment fragment) {
        java.util.Map map;
        AnonymousClass364 anonymousClass364 = this.A03;
        if (anonymousClass364 == null) {
            A00(fragment, this);
            map = this.A0K;
            11T.A0D(map);
        } else {
            HashSet A0v = AnonymousClass001.A0v();
            while (anonymousClass364.A0H != null) {
                Integer num = anonymousClass364.A0H;
                A0v.add(num);
                java.util.Map map2 = this.A0K;
                11T.A0D(map2);
                anonymousClass364 = (AnonymousClass364) map2.get(num);
                if (anonymousClass364 == null) {
                    break;
                }
            }
            if (1BL.A1Z(A0v, fragment.hashCode())) {
                return;
            }
            map = this.A0K;
            11T.A0D(map);
            if (!1BL.A1Y(fragment, map)) {
                A00(fragment, this);
            }
        }
        this.A03 = (AnonymousClass364) 1BL.A0j(fragment, map);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            AnonymousClass365 anonymousClass365 = (AnonymousClass365) obj;
            if (this.A0F != anonymousClass365.A0F || this.A00 != anonymousClass365.A00 || this.A0M != anonymousClass365.A0M) {
                return false;
            }
            String str = this.A0J;
            String str2 = anonymousClass365.A0J;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (!11T.A0O(this.A0H, anonymousClass365.A0H) || !11T.A0O(this.A0B, anonymousClass365.A0B) || !11T.A0O(this.A0C, anonymousClass365.A0C)) {
                return false;
            }
            String str3 = this.A0I;
            String str4 = anonymousClass365.A0I;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.A08;
            String str6 = anonymousClass365.A08;
            if (str5 != null) {
                if (!str5.equals(str6)) {
                    return false;
                }
            } else if (str6 != null) {
                return false;
            }
            String str7 = this.A0D;
            String str8 = anonymousClass365.A0D;
            if (str7 != null) {
                if (!str7.equals(str8)) {
                    return false;
                }
            } else if (str8 != null) {
                return false;
            }
            String str9 = this.A07;
            String str10 = anonymousClass365.A07;
            if (str9 != null) {
                if (!str9.equals(str10)) {
                    return false;
                }
            } else if (str10 != null) {
                return false;
            }
            Integer num = this.A04;
            Integer num2 = anonymousClass365.A04;
            if (num != null) {
                if (!num.equals(num2)) {
                    return false;
                }
            } else if (num2 != null) {
                return false;
            }
            String str11 = this.A06;
            String str12 = anonymousClass365.A06;
            if (str11 != null) {
                if (!str11.equals(str12)) {
                    return false;
                }
            } else if (str12 != null) {
                return false;
            }
            C2vl c2vl = this.A01;
            C2vl c2vl2 = anonymousClass365.A01;
            if (c2vl != null) {
                if (c2vl != c2vl2) {
                    return false;
                }
            } else if (c2vl2 != null) {
                return false;
            }
            C2vm c2vm = this.A02;
            C2vm c2vm2 = anonymousClass365.A02;
            if (c2vm != null) {
                if (c2vm != c2vm2) {
                    return false;
                }
            } else if (c2vm2 != null) {
                return false;
            }
            Long l = this.A05;
            Long l2 = anonymousClass365.A05;
            if (l != null) {
                if (!l.equals(l2)) {
                    return false;
                }
            } else if (l2 != null) {
                return false;
            }
            String str13 = this.A0A;
            String str14 = anonymousClass365.A0A;
            if (str13 != null) {
                if (!str13.equals(str14)) {
                    return false;
                }
            } else if (str14 != null) {
                return false;
            }
            String str15 = this.A09;
            String str16 = anonymousClass365.A09;
            if (str15 != null) {
                if (!str15.equals(str16)) {
                    return false;
                }
            } else if (str16 != null) {
                return false;
            }
            java.util.Map map = this.A0L;
            java.util.Map map2 = anonymousClass365.A0L;
            if (map != null) {
                if (!map.equals(map2)) {
                    return false;
                }
            } else if (map2 != null) {
                return false;
            }
            java.util.Map map3 = this.A0K;
            java.util.Map map4 = anonymousClass365.A0K;
            if (map3 != null) {
                if (!map3.equals(map4)) {
                    return false;
                }
            } else if (map4 != null) {
                return false;
            }
            AnonymousClass364 anonymousClass364 = this.A03;
            AnonymousClass364 anonymousClass3642 = anonymousClass365.A03;
            if (anonymousClass364 != null) {
                return anonymousClass364.equals(anonymousClass3642);
            }
            if (anonymousClass3642 != null) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A06 = ((((((((((((((((((((((((((((((((((((((((this.A0F * 31) + 1BL.A06(this.A0J)) * 31) + AnonymousClass002.A04(this.A0H)) * 31) + 1BL.A06(this.A0B)) * 31) + this.A00) * 31) + 1BL.A06(this.A0C)) * 31) + 1BL.A06(this.A0I)) * 31) + (this.A0M ? 1 : 0)) * 31) + 1BL.A06(this.A08)) * 31) + 1BL.A06(this.A0D)) * 31) + 1BL.A06(this.A07)) * 31) + AnonymousClass002.A04(this.A04)) * 31) + 1BL.A06(this.A06)) * 31) + AnonymousClass002.A04(this.A01)) * 31) + AnonymousClass002.A04(this.A02)) * 31) + AnonymousClass002.A04(this.A05)) * 31) + 1BL.A06(this.A0A)) * 31) + 1BL.A06(this.A09)) * 31) + AnonymousClass002.A04(this.A0L)) * 31) + AnonymousClass002.A04(this.A0K)) * 31) + AnonymousClass002.A04(this.A0E)) * 31;
        AnonymousClass364 anonymousClass364 = this.A03;
        if (anonymousClass364 != null) {
            i = anonymousClass364.hashCode();
        }
        return A06 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("\n        ActivitySession{mActivityInstanceId=");
        A0k.append(this.A0F);
        A0k.append(",\n        moduleName='");
        A0k.append(this.A0J);
        A0k.append("',\n        activityClass=");
        A0k.append(this.A0H);
        A0k.append(", sessionId='");
        A0k.append(this.A0B);
        A0k.append("',\n        subsessionId=");
        A0k.append(this.A00);
        A0k.append(",\n        subsessionTimestamp='");
        A0k.append(this.A0C);
        A0k.append("',\n        keyURI='");
        A0k.append(this.A0I);
        A0k.append("',\n        isFragmentActivity=");
        A0k.append(this.A0M);
        A0k.append(",\n        currentSurfaceLinkId='");
        A0k.append(this.A08);
        A0k.append("',\n        surfaceName='");
        A0k.append(this.A0D);
        A0k.append("',\n        bookmarkTypeName='");
        A0k.append(this.A07);
        A0k.append("',\n        badgeCount=");
        A0k.append(this.A04);
        A0k.append(",\n        promoSource='");
        A0k.append(this.A01);
        A0k.append("',\n        promoType='");
        A0k.append(this.A02);
        A0k.append("',\n        promoId=");
        A0k.append(this.A05);
        A0k.append(",\n        badgeType='");
        A0k.append(this.A06);
        A0k.append("',\n        ,originalNavigationTapPoint='");
        A0k.append(this.A0A);
        A0k.append("',\n        ,navigationTapPoint='");
        A0k.append(this.A09);
        A0k.append("',\n        ,extras=");
        A0k.append(this.A0E);
        A0k.append(",\n        fragments=");
        A0k.append(this.A0L);
        A0k.append(",\n        allFragments=");
        A0k.append(this.A0K);
        A0k.append(",\n        currentFragment=");
        A0k.append(this.A03);
        return 0Cc.A0j(AnonymousClass001.A0d("}\n        ", A0k));
    }
}
