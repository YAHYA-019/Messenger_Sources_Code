package X;

import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.1ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1ai.class */
public final class C00241ai {
    public InterfaceC00281am A00;
    public InterfaceC00281am A01;
    public boolean A02;
    public final 1Od A04;
    public final C00251aj A05;
    public final InterfaceC00281am A06;
    public final 1HN A07;
    public final C00261ak A09;
    public final C15h A0A;
    public final C15h A0B;
    public final FbSharedPreferences A08 = (FbSharedPreferences) 1Bi.A03(33013);
    public final 1I7 A03 = (1I7) 1Hv.A02(FbInjector.A00(), 65728);

    public C00241ai() {
        1Od r0 = (1Od) 1Bi.A03(16616);
        this.A04 = r0;
        C00251aj c00251aj = (C00251aj) 1Bn.A0A(16715);
        this.A05 = c00251aj;
        this.A09 = (C00261ak) 1Bi.A03(33072);
        this.A0B = new C3j9(this, 1);
        this.A0A = new C3j9(this, 2);
        this.A02 = false;
        this.A06 = new C00591bi(r0, new C00271al(new String[]{"facebook.com"}), c00251aj.A01());
        this.A07 = new 3bR(this, 1);
    }

    public InterfaceC00281am A00() {
        InterfaceC00281am interfaceC00281am;
        synchronized (this) {
            interfaceC00281am = this.A00;
            if (interfaceC00281am == null) {
                if (!this.A02) {
                    this.A02 = true;
                    this.A08.CcX(this.A07, 1Pf.A0T);
                }
                if (((Boolean) this.A0A.get()).booleanValue()) {
                    final C00261ak c00261ak = this.A09;
                    new C00591bi(this.A04, new InterfaceC00281am(c00261ak) { // from class: X.3zv
                        public final C00261ak A00;

                        {
                            this.A00 = c00261ak;
                        }

                        @Override // X.InterfaceC00281am
                        public Uri.Builder AX6() {
                            return C0A2.A03(0Pz.A0W("https://b-api.", "facebook.com")).buildUpon();
                        }

                        @Override // X.InterfaceC00281am
                        public String AX7() {
                            return null;
                        }

                        @Override // X.InterfaceC00281am
                        public String[] Ai5() {
                            return new String[]{"facebook.com"};
                        }

                        @Override // X.InterfaceC00281am
                        public Uri.Builder AoA() {
                            return C0A2.A03(0Pz.A0W("https://b-graph.", "facebook.com")).buildUpon();
                        }

                        @Override // X.InterfaceC00281am
                        public Uri.Builder AoB() {
                            throw AnonymousClass001.A0q("BootstrapHttpConfig should be used only for graph and api requests");
                        }

                        @Override // X.InterfaceC00281am
                        public Uri.Builder AoO() {
                            throw AnonymousClass001.A0q("BootstrapHttpConfig should be used only for graph and api requests");
                        }

                        @Override // X.InterfaceC00281am
                        public Uri.Builder Axy() {
                            throw AnonymousClass001.A0q("BootstrapHttpConfig should be used only for graph and api requests");
                        }

                        @Override // X.InterfaceC00281am
                        public Uri.Builder B9S() {
                            return C0A2.A03(0Pz.A0W("https://b-graph.secure.", "facebook.com")).buildUpon();
                        }

                        @Override // X.InterfaceC00281am
                        public Uri.Builder B9U() {
                            throw AnonymousClass001.A0q("BootstrapHttpConfig should be used only for graph and api requests");
                        }
                    }, this.A05.A01());
                } else {
                    interfaceC00281am = A01();
                }
                this.A00 = interfaceC00281am;
            }
        }
        return interfaceC00281am;
    }

    public InterfaceC00281am A01() {
        InterfaceC00281am interfaceC00281am;
        StringBuilder A0k;
        String str;
        synchronized (this) {
            InterfaceC00281am interfaceC00281am2 = this.A01;
            if (interfaceC00281am2 == null) {
                if (!this.A02) {
                    this.A02 = true;
                    this.A08.CcX(this.A07, 1Pf.A0T);
                }
                if (((Boolean) this.A0B.get()).booleanValue()) {
                    FbSharedPreferences fbSharedPreferences = this.A08;
                    String A3a = fbSharedPreferences.A3a(1Pf.A0b, "default");
                    String A3a2 = fbSharedPreferences.A3a(1Pf.A0Z, "");
                    String str2 = null;
                    if ("intern".equals(A3a)) {
                        A0k = AnonymousClass001.A0k();
                        str = "intern.";
                    } else if ("dev".equals(A3a)) {
                        A0k = AnonymousClass001.A0k();
                        str = "dev.";
                    } else {
                        if (!"production".equals(A3a)) {
                            String BD0 = fbSharedPreferences.BD0(1Pf.A0a);
                            if (1JF.A0B(BD0)) {
                                BD0 = "facebook.com";
                            } else {
                                try {
                                    C0A2.A03(BD0);
                                } catch (Throwable th) {
                                    0fH.A0u("DefaultServerConfig", "Failed to parse web sandbox URL", th);
                                }
                            }
                            str2 = BD0;
                        }
                        if (1JF.A0B(str2) || !1JF.A0B(A3a2)) {
                            this.A01 = new C00591bi(this.A04, new C00271al(new String[]{str2}), this.A05.A01());
                        }
                    }
                    A0k.append(str);
                    str2 = AnonymousClass001.A0d("facebook.com", A0k);
                    if (1JF.A0B(str2)) {
                    }
                    this.A01 = new C00591bi(this.A04, new C00271al(new String[]{str2}), this.A05.A01());
                }
                interfaceC00281am2 = this.A01;
                if (interfaceC00281am2 == null) {
                    interfaceC00281am2 = this.A06;
                    this.A01 = interfaceC00281am2;
                }
            }
            0fH.A0g(interfaceC00281am2.AoA(), "DefaultServerConfig", "Returning PlatformAppHttpConfig: %s");
            interfaceC00281am = this.A01;
        }
        return interfaceC00281am;
    }
}
