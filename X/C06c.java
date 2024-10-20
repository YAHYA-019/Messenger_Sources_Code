package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.06c, reason: invalid class name */
/* loaded from: 06c.class */
public final class C06c implements C06d, C06e {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public CharSequence A08;
    public CharSequence A09;
    public String A0A;
    public ArrayList A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public ArrayList A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final C06l A0K;
    public final 06Z A0L;
    public final ClassLoader A0M;

    public C06c(06Z r302) {
        C06l A0d = r302.A0d();
        06V r0 = r302.A05;
        ClassLoader classLoader = r0 != null ? r0.A01.getClassLoader() : null;
        this.A0C = new ArrayList();
        this.A0H = true;
        this.A0G = false;
        this.A0K = A0d;
        this.A0M = classLoader;
        this.A07 = -1;
        this.A0I = false;
        this.A0L = r302;
    }

    public C06c(C06c c06c) {
        06Z r0 = c06c.A0L;
        C06l A0d = r0.A0d();
        06V r02 = r0.A05;
        ClassLoader classLoader = r02 != null ? r02.A01.getClassLoader() : null;
        this.A0C = AnonymousClass001.A0s();
        this.A0H = true;
        this.A0G = false;
        this.A0K = A0d;
        this.A0M = classLoader;
        Iterator it = c06c.A0C.iterator();
        while (it.hasNext()) {
            this.A0C.add(new C09x((C09x) it.next()));
        }
        this.A02 = c06c.A02;
        this.A03 = c06c.A03;
        this.A04 = c06c.A04;
        this.A05 = c06c.A05;
        this.A06 = c06c.A06;
        this.A0F = c06c.A0F;
        this.A0H = c06c.A0H;
        this.A0A = c06c.A0A;
        this.A00 = c06c.A00;
        this.A08 = c06c.A08;
        this.A01 = c06c.A01;
        this.A09 = c06c.A09;
        if (c06c.A0D != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            this.A0D = A0s;
            A0s.addAll(c06c.A0D);
        }
        if (c06c.A0E != null) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            this.A0E = A0s2;
            A0s2.addAll(c06c.A0E);
        }
        this.A0G = c06c.A0G;
        this.A07 = -1;
        this.A0I = false;
        this.A0L = c06c.A0L;
        this.A0J = c06c.A0J;
        this.A07 = c06c.A07;
        this.A0I = c06c.A0I;
    }

    public static int A00(C06c c06c, boolean z) {
        if (c06c.A0J) {
            throw AnonymousClass001.A0N("commit already called");
        }
        if (06Z.A0O(2)) {
            AnonymousClass002.A0X(c06c, "Commit: ", AnonymousClass001.A0k());
            PrintWriter printWriter = new PrintWriter((Writer) new 0UE());
            c06c.A0T(printWriter, "  ", true);
            printWriter.close();
        }
        c06c.A0J = true;
        c06c.A07 = c06c.A0F ? c06c.A0L.A0Z.getAndIncrement() : -1;
        c06c.A0L.A1M(c06c, z);
        return c06c.A07;
    }

    private void A0R(Fragment fragment, String str, int i, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            0AW.A09(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw 0Pz.A07("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Can't change tag of fragment ");
                A0k.append(fragment);
                A0k.append(": was ");
                A0k.append(fragment.mTag);
                A0k.append(" now ");
                throw AnonymousClass002.A0F(str, A0k);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder A0k2 = AnonymousClass001.A0k();
                A0k2.append("Can't add fragment ");
                A0k2.append(fragment);
                A0k2.append(" with tag ");
                A0k2.append(str);
                throw AnonymousClass002.A0D(" to container view with no id", A0k2);
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder A0k3 = AnonymousClass001.A0k();
                A0k3.append("Can't change container ID of fragment ");
                A0k3.append(fragment);
                A0k3.append(": was ");
                A0k3.append(fragment.mFragmentId);
                throw AnonymousClass001.A0N(AnonymousClass001.A0e(" now ", A0k3, i));
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        A0S(new C09x(fragment, i2));
        fragment.mFragmentManager = this.A0L;
    }

    public Fragment A01(Fragment fragment, ArrayList arrayList) {
        Fragment fragment2;
        Fragment fragment3 = fragment;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList2 = this.A0C;
            if (i2 >= arrayList2.size()) {
                return fragment3;
            }
            C09x c09x = (C09x) arrayList2.get(i2);
            int i3 = c09x.A00;
            if (i3 != 1) {
                if (i3 == 2) {
                    fragment2 = c09x.A05;
                    int i4 = fragment2.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList.get(size);
                        if (fragment4.mContainerId == i4) {
                            if (fragment4 == fragment2) {
                                z = true;
                            } else {
                                if (fragment4 == fragment3) {
                                    arrayList2.add(i2, new C09x(fragment4, 9, true));
                                    i2++;
                                    fragment3 = null;
                                }
                                C09x c09x2 = new C09x(fragment4, 3, true);
                                c09x2.A01 = c09x.A01;
                                c09x2.A03 = c09x.A03;
                                c09x2.A02 = c09x.A02;
                                c09x2.A04 = c09x.A04;
                                arrayList2.add(i2, c09x2);
                                arrayList.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        arrayList2.remove(i2);
                        i2--;
                    } else {
                        c09x.A00 = 1;
                        c09x.A08 = true;
                        arrayList.add(fragment2);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(c09x.A05);
                    Fragment fragment5 = c09x.A05;
                    if (fragment5 == fragment3) {
                        arrayList2.add(i2, new C09x(fragment5, 9));
                        i2++;
                        fragment3 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        arrayList2.add(i2, new C09x(fragment3, 9, true));
                        c09x.A08 = true;
                        i2++;
                        fragment3 = c09x.A05;
                    }
                }
                i = i2 + 1;
            }
            fragment2 = c09x.A05;
            arrayList.add(fragment2);
            i = i2 + 1;
        }
    }

    public Fragment A02(Fragment fragment, ArrayList arrayList) {
        ArrayList arrayList2 = this.A0C;
        int size = arrayList2.size() - 1;
        while (true) {
            int i = size;
            if (i < 0) {
                return fragment;
            }
            C09x c09x = (C09x) arrayList2.get(i);
            int i2 = c09x.A00;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c09x.A05;
                            break;
                        case 10:
                            c09x.A06 = c09x.A07;
                            break;
                    }
                    size = i - 1;
                }
                arrayList.add(c09x.A05);
                size = i - 1;
            }
            arrayList.remove(c09x.A05);
            size = i - 1;
        }
    }

    public void A03() {
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C09x c09x = (C09x) arrayList.get(size);
            if (c09x.A08) {
                if (c09x.A00 == 8) {
                    c09x.A08 = false;
                    size--;
                    arrayList.remove(size);
                } else {
                    int i = c09x.A05.mContainerId;
                    c09x.A00 = 2;
                    c09x.A08 = false;
                    int i2 = size;
                    while (true) {
                        int i3 = i2 - 1;
                        if (i3 >= 0) {
                            C09x c09x2 = (C09x) arrayList.get(i3);
                            if (c09x2.A08 && c09x2.A05.mContainerId == i) {
                                arrayList.remove(i3);
                                size--;
                            }
                            i2 = i3;
                        }
                    }
                }
            }
        }
    }

    public void A04() {
        A00(this, false);
    }

    public void A05() {
        A00(this, true);
    }

    public void A06() {
        A08();
        this.A0L.A1N(this, false);
    }

    public void A07() {
        A08();
        this.A0L.A1N(this, true);
    }

    public void A08() {
        if (this.A0F) {
            throw AnonymousClass001.A0N("This transaction is already being added to the back stack");
        }
        this.A0H = false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0065. Please report as an issue. */
    public void A09() {
        06Z r305;
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            C09x c09x = (C09x) arrayList.get(i2);
            Fragment fragment = c09x.A05;
            if (fragment != null) {
                fragment.mBeingSaved = this.A0I;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.A06);
                fragment.setSharedElementNames(this.A0D, this.A0E);
            }
            int i3 = c09x.A00;
            switch (i3) {
                case 1:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    06Z r0 = this.A0L;
                    r0.A1G(fragment, false);
                    r0.A0f(fragment);
                    i = i2 + 1;
                case 2:
                default:
                    throw 0Pz.A04("Unknown cmd: ", i3);
                case 3:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    this.A0L.A1B(fragment);
                    i = i2 + 1;
                case 4:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    this.A0L.A19(fragment);
                    i = i2 + 1;
                case 5:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    this.A0L.A1G(fragment, false);
                    06Z.A0F(fragment);
                    i = i2 + 1;
                case 6:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    this.A0L.A17(fragment);
                    i = i2 + 1;
                case 7:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    06Z r02 = this.A0L;
                    r02.A1G(fragment, false);
                    r02.A16(fragment);
                    i = i2 + 1;
                case 8:
                    r305 = this.A0L;
                    r305.A1D(fragment);
                    i = i2 + 1;
                case 9:
                    r305 = this.A0L;
                    fragment = null;
                    r305.A1D(fragment);
                    i = i2 + 1;
                case 10:
                    this.A0L.A1F(fragment, c09x.A06);
                    i = i2 + 1;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00b1. Please report as an issue. */
    public void A0A() {
        06Z r305;
        ArrayList arrayList = this.A0C;
        int size = arrayList.size() - 1;
        while (true) {
            int i = size;
            if (i < 0) {
                return;
            }
            C09x c09x = (C09x) arrayList.get(i);
            Fragment fragment = c09x.A05;
            if (fragment != null) {
                fragment.mBeingSaved = this.A0I;
                fragment.setPopDirection(true);
                int i2 = this.A06;
                int i3 = 4100;
                if (i2 == 4097) {
                    i3 = 8194;
                } else if (i2 == 8194) {
                    i3 = 4097;
                } else if (i2 != 8197) {
                    if (i2 != 4099) {
                        i3 = 8197;
                        if (i2 != 4100) {
                            i3 = 0;
                        }
                    } else {
                        i3 = 4099;
                    }
                }
                fragment.setNextTransition(i3);
                fragment.setSharedElementNames(this.A0E, this.A0D);
            }
            int i4 = c09x.A00;
            switch (i4) {
                case 1:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    06Z r0 = this.A0L;
                    r0.A1G(fragment, true);
                    r0.A1B(fragment);
                    size = i - 1;
                case 2:
                default:
                    throw 0Pz.A04("Unknown cmd: ", i4);
                case 3:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    this.A0L.A0f(fragment);
                    size = i - 1;
                case 4:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    06Z.A0F(fragment);
                    size = i - 1;
                case 5:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    06Z r02 = this.A0L;
                    r02.A1G(fragment, true);
                    r02.A19(fragment);
                    size = i - 1;
                case 6:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    this.A0L.A16(fragment);
                    size = i - 1;
                case 7:
                    fragment.setAnimations(c09x.A01, c09x.A02, c09x.A03, c09x.A04);
                    06Z r03 = this.A0L;
                    r03.A1G(fragment, true);
                    r03.A17(fragment);
                    size = i - 1;
                case 8:
                    r305 = this.A0L;
                    fragment = null;
                    r305.A1D(fragment);
                    size = i - 1;
                case 9:
                    r305 = this.A0L;
                    r305.A1D(fragment);
                    size = i - 1;
                case 10:
                    this.A0L.A1F(fragment, c09x.A07);
                    size = i - 1;
            }
        }
    }

    public void A0B(int i) {
        if (!this.A0F) {
            return;
        }
        if (06Z.A0O(2)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Bump nesting in ");
            A0k.append(this);
            android.util.Log.v("FragmentManager", AnonymousClass001.A0e(" by ", A0k, i));
        }
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return;
            }
            C09x c09x = (C09x) arrayList.get(i3);
            Fragment fragment = c09x.A05;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
                if (06Z.A0O(2)) {
                    StringBuilder A0k2 = AnonymousClass001.A0k();
                    A0k2.append("Bump nesting of ");
                    A0k2.append(c09x.A05);
                    A0k2.append(" to ");
                    A0k2.append(c09x.A05.mBackStackNesting);
                    android.util.Log.v("FragmentManager", A0k2.toString());
                }
            }
            i2 = i3 + 1;
        }
    }

    public void A0C(int i, int i2) {
        A0D(i, i2, 0, 0);
    }

    public void A0D(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A05 = i4;
    }

    public final void A0E(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        A0P(fragment, str, viewGroup.getId());
    }

    public void A0F(Fragment fragment) {
        A0S(new C09x(fragment, 7));
    }

    public void A0G(Fragment fragment) {
        06Z r0 = fragment.mFragmentManager;
        if (r0 != null && r0 != this.A0L) {
            throw 0Pz.A07("Cannot detach Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager.");
        }
        A0S(new C09x(fragment, 6));
    }

    public void A0H(Fragment fragment) {
        06Z r0 = fragment.mFragmentManager;
        if (r0 != null && r0 != this.A0L) {
            throw 0Pz.A07("Cannot hide Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager.");
        }
        A0S(new C09x(fragment, 4));
    }

    public void A0I(Fragment fragment) {
        06Z r0 = fragment.mFragmentManager;
        if (r0 != null && r0 != this.A0L) {
            throw 0Pz.A07("Cannot remove Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager.");
        }
        A0S(new C09x(fragment, 3));
    }

    public void A0J(Fragment fragment) {
        06Z r0 = fragment.mFragmentManager;
        if (r0 != null && r0 != this.A0L) {
            throw 0Pz.A07("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager.");
        }
        A0S(new C09x(fragment, 8));
    }

    public void A0K(Fragment fragment) {
        06Z r0 = fragment.mFragmentManager;
        if (r0 != null && r0 != this.A0L) {
            throw 0Pz.A07("Cannot show Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager.");
        }
        A0S(new C09x(fragment, 5));
    }

    public void A0L(Fragment fragment, int i) {
        A0R(fragment, null, i, 1);
    }

    public void A0M(Fragment fragment, int i) {
        A0Q(fragment, null, i);
    }

    public void A0N(Fragment fragment, Lifecycle.State state) {
        06Z r0 = fragment.mFragmentManager;
        06Z r02 = this.A0L;
        if (r0 != r02) {
            throw AnonymousClass002.A0C(r02, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ", AnonymousClass001.A0k());
        }
        A0S(new C09x(fragment, state));
    }

    public void A0O(Fragment fragment, String str) {
        A0R(fragment, str, 0, 1);
    }

    public void A0P(Fragment fragment, String str, int i) {
        A0R(fragment, str, i, 1);
    }

    public void A0Q(Fragment fragment, String str, int i) {
        if (i == 0) {
            throw AnonymousClass001.A0L("Must use non-zero containerViewId");
        }
        A0R(fragment, str, i, 2);
    }

    public void A0S(C09x c09x) {
        this.A0C.add(c09x);
        c09x.A01 = this.A02;
        c09x.A02 = this.A03;
        c09x.A03 = this.A04;
        c09x.A04 = this.A05;
    }

    public void A0T(PrintWriter printWriter, String str, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A0A);
            printWriter.print(" mIndex=");
            printWriter.print(this.A07);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A0J);
            if (this.A06 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                AnonymousClass002.A0U(printWriter, this.A06);
            }
            if (this.A02 != 0 || this.A03 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                AnonymousClass002.A0U(printWriter, this.A02);
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A03));
            }
            if (this.A04 != 0 || this.A05 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                AnonymousClass002.A0U(printWriter, this.A04);
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A05));
            }
            if (this.A01 != 0 || this.A09 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                AnonymousClass002.A0U(printWriter, this.A01);
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A09);
            }
            if (this.A00 != 0 || this.A08 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                AnonymousClass002.A0U(printWriter, this.A00);
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A08);
            }
        }
        ArrayList arrayList = this.A0C;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            C09x c09x = (C09x) arrayList.get(i2);
            int i3 = c09x.A00;
            switch (i3) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = 0Pz.A0T("cmd=", i3);
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c09x.A05);
            if (z) {
                if (c09x.A01 != 0 || c09x.A02 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    AnonymousClass002.A0U(printWriter, c09x.A01);
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c09x.A02));
                }
                if (c09x.A03 != 0 || c09x.A04 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    AnonymousClass002.A0U(printWriter, c09x.A03);
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c09x.A04));
                }
            }
            i = i2 + 1;
        }
    }

    public final void A0U(Class cls, int i) {
        C06l c06l = this.A0K;
        if (c06l == null) {
            throw AnonymousClass001.A0N("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.A0M;
        if (classLoader == null) {
            throw AnonymousClass001.A0N("The FragmentManager must be attached to itshost to create a Fragment");
        }
        A0Q(c06l.A02(classLoader, cls.getName()), null, i);
    }

    public void A0V(String str) {
        if (!this.A0H) {
            throw AnonymousClass001.A0N("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.A0F = true;
        this.A0A = str;
    }

    @Override // X.C06d
    public boolean AU4(ArrayList arrayList, ArrayList arrayList2) {
        if (06Z.A0O(2)) {
            AnonymousClass002.A0X(this, "Run: ", AnonymousClass001.A0k());
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.A0F) {
            return true;
        }
        this.A0L.A09.add(this);
        return true;
    }

    public String toString() {
        StringBuilder A0l = AnonymousClass001.A0l(128);
        AnonymousClass002.A0W(this, "BackStackEntry{", A0l);
        int i = this.A07;
        if (i >= 0) {
            A0l.append(" #");
            A0l.append(i);
        }
        String str = this.A0A;
        if (str != null) {
            A0l.append(" ");
            A0l.append(str);
        }
        return AnonymousClass001.A0d("}", A0l);
    }
}
