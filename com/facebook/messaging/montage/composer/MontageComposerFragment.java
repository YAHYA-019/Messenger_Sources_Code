package com.facebook.messaging.montage.composer;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1HH;
import X.1I0;
import X.1Lo;
import X.1Um;
import X.1X9;
import X.1iF;
import X.2EU;
import X.2Ov;
import X.2Pf;
import X.2S0;
import X.2yD;
import X.4uZ;
import X.5Q1;
import X.5VV;
import X.5WA;
import X.6KV;
import X.6Oe;
import X.C00i;
import X.C0et;
import X.C2767Gnk;
import X.C5fi;
import X.C6r6;
import X.C6x1;
import X.C6x3;
import X.C6x4;
import X.C7re;
import X.C7vi;
import X.C9lD;
import X.DLP;
import X.GOm;
import X.GSj;
import X.GUI;
import X.H4K;
import X.H9e;
import X.HAq;
import X.HSP;
import X.HpN;
import X.HqO;
import X.I2a;
import X.I2u;
import X.I4q;
import X.I8Y;
import X.IBw;
import X.ICe;
import X.IDa;
import X.IFM;
import X.IFl;
import X.IPp;
import X.IQ1;
import X.IWN;
import X.JD0;
import X.JEm;
import X.JF1;
import X.JF2;
import X.JLh;
import X.N83;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.media.editing.MultimediaEditorPhotoImageViewer;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView;
import com.facebook.messaging.montage.composer.capturebutton.CaptureButton;
import com.facebook.messaging.montage.composer.doodle.TextColorLayout;
import com.facebook.messaging.montage.composer.mention.MentionSuggestionView;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.montage.model.art.ArtItem;
import com.facebook.messaging.montage.model.art.CompositionInfo;
import com.facebook.messaging.montage.util.customimage.MontageCustomImageUtil;
import com.facebook.messaging.photos.editing.TextStylesLayout;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageComposerFragment.class */
public class MontageComposerFragment extends 2Ov implements 2S0 {
    public LiveData A00;
    public HSP A01;
    public ThreadSummary A02;
    public IQ1 A03;
    public JF1 A04;
    public JD0 A05;
    public JLh A06;
    public JF2 A07;
    public MontageComposerFragmentParams A0B;
    public NavigationTrigger A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0H;
    public FbUserSession A0I;
    public 6KV A0J;
    public JEm A0K;
    public IBw A0L;
    public MontageCustomImageUtil A0M;
    public Integer A0N;
    public boolean A0O;
    public final C00i A0U = new 1BV(this, 84066);
    public final C00i A0Z = new 1BV(this, 585);
    public final C00i A0c = new 1HH(this, 115994);
    public final C00i A0X = new 1BV(115381);
    public final C00i A0Y = new 1BQ(33013);
    public final C00i A0a = new 1BV(115935);
    public final C00i A0f = new 1BV(67012);
    public final C00i A0g = new 1BV(65571);
    public final C00i A0d = new 1BQ(83604);
    public final C00i A0W = new 1BQ(16511);
    public final C00i A0e = new 1BV(98321);
    public final C00i A0V = new 1BV(114702);
    public final C00i A0T = new 1BQ(115936);
    public final C00i A0b = new 1BV(115978);
    public final C00i A0R = new 1BV(68513);
    public final C00i A0P = new 1BV(115979);
    public final C00i A0Q = new 1BQ(68523);
    public final C00i A0S = new 1BQ(67528);
    public C6x3 A09 = C6x3.A04;
    public C6r6 A0A = C6r6.A12;
    public boolean A0G = false;
    public C7re A08 = new C7re(null, null, null, false);

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.messaging.montage.composer.MontageComposerFragment, androidx.fragment.app.Fragment] */
    public static MontageComposerFragment A05(MontageComposerFragmentParams montageComposerFragmentParams, NavigationTrigger navigationTrigger) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("navigation_trigger", navigationTrigger);
        montageComposerFragmentParams.getClass();
        bundle.putParcelable("params", montageComposerFragmentParams);
        ?? montageComposerFragment = new MontageComposerFragment();
        montageComposerFragment.setArguments(bundle);
        return montageComposerFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0210, code lost:
    
        if (r0 != (-1)) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06() {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.A06():void");
    }

    private void A07() {
        0fH.A0g(this.A0N, "MontageComposerFragment", "Unlocking orientation : %s");
        if (this.A0J != null && this.A0d.get() != C0et.A0g) {
            this.A0J.A05(-1);
        }
        this.A0N = null;
    }

    public static void A08(MontageComposerFragment montageComposerFragment) {
        6KV r0 = montageComposerFragment.A0J;
        if (r0 != null) {
            if (montageComposerFragment.A0N == null) {
                Integer valueOf = Integer.valueOf(r0.A01());
                montageComposerFragment.A0N = valueOf;
                0fH.A0g(valueOf, "MontageComposerFragment", "Locking orientation to %s");
            }
            montageComposerFragment.A0J.A05(montageComposerFragment.A0N.intValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.A0a == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams r0 = r0.A0B
            r303 = r0
            r0 = 2
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = r303
            boolean r0 = r0.A0a
            r305 = r0
            r0 = 2132608338(0x7f1d0552, float:2.0871642E38)
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L20
        L1b:
            r0 = 2132608337(0x7f1d0551, float:2.087164E38)
            r306 = r0
        L20:
            r0 = r301
            r1 = r304
            r2 = r306
            r0.A0g(r1, r2)
            r0 = r301
            r1 = r302
            android.app.Dialog r0 = super.A0n(r1)
            r307 = r0
            r0 = r307
            r1 = 0
            r0.setCanceledOnTouchOutside(r1)
            X.IGa r0 = new X.IGa
            r303 = r0
            r0 = r303
            r1 = r301
            r2 = 1
            r0.<init>(r1, r2)
            r0 = r307
            r1 = r303
            r0.setOnKeyListener(r1)
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    public void A0o() {
        JLh jLh = this.A06;
        if (jLh != null) {
            jLh.BuE();
        }
        if (((0D2) this).A01 != null) {
            super/*X.0D2*/.A0p();
        } else {
            A07();
        }
    }

    public void A0p() {
        JLh jLh = this.A06;
        if (jLh != null) {
            jLh.BuE();
        }
        if (((0D2) this).A01 != null) {
            super/*X.0D2*/.A0p();
        } else {
            A07();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0159, code lost:
    
        if (r305 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0097, code lost:
    
        if (r0.A0z() == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A13(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.A13(android.os.Bundle):void");
    }

    public 1iF A17() {
        return new 1iF(366696498039554L);
    }

    public H9e A1C() {
        if (((0D2) this).A01 == null && this.A05 == null) {
            return null;
        }
        return H9e.A02;
    }

    public ImmutableSet A1D() {
        1I0 r0 = new 1I0(4);
        r0.A08(this.A0B.A0L);
        r0.A08(((5VV) this.A0e.get()).A01(this.A0B.A05));
        return r0.A07();
    }

    public void A1E() {
        IQ1 iq1 = this.A03;
        boolean z = true;
        if (iq1 != null) {
            z = false;
            iq1.A0N(false);
            IWN iwn = this.A03.A1Q;
            iwn.Chb(0, false);
            iwn.Chb(1, false);
            iwn.Chb(1, true);
            this.A03.A0I();
        }
        this.A0O = z;
    }

    public void A1F(ArtItem artItem, boolean z) {
        this.A0H = false;
        this.A08 = new C7re(null, null, null, false);
        if (artItem != null) {
            if (A1C() != H9e.A02 || this.A03 == null) {
                this.A08 = new C7re(null, artItem, null, z);
                return;
            }
            I2u i2u = new I2u();
            i2u.A0D = artItem.A09;
            i2u.A0B = 0S2.A0Y;
            this.A03.A1Q.A8h(artItem, new CompositionInfo(i2u), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00eb, code lost:
    
        if (r0.A04 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0154, code lost:
    
        if (r0.A02 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0211, code lost:
    
        if (r0.A02 != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1G(android.view.KeyEvent r302) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.A1G(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.A1Q.Bkd() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bkd() {
        /*
            r301 = this;
            r0 = r301
            X.IQ1 r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1b
            r0 = r302
            X.IWN r0 = r0.A1Q
            r302 = r0
            r0 = r302
            boolean r0 = r0.Bkd()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L63
        L1b:
            r0 = 0
            r304 = r0
            r0 = r301
            r0.A07()
            r0 = r301
            X.00i r0 = r0.A0V
            java.lang.Object r0 = r0.get()
            X.HrZ r0 = (X.HrZ) r0
            r305 = r0
            r0 = r301
            X.6r6 r0 = r0.A0A
            r306 = r0
            r0 = r301
            java.lang.String r0 = r0.A0D
            r307 = r0
            r0 = r305
            r1 = r306
            r2 = r307
            java.lang.String r3 = "exit_montage"
            r0.A00(r1, r2, r3)
            r0 = r301
            X.JLh r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L56
            r0 = r302
            r0.BuE()
        L56:
            r0 = r301
            X.IQ1 r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L63
            r0 = r302
            r0.A0G()
        L63:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.Bkd():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        if (r307 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachFragment(androidx.fragment.app.Fragment r302) {
        /*
            r301 = this;
            r0 = r301
            X.IBw r0 = r0.A0L
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7c
            r0 = r301
            com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams r0 = r0.A0B
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L7c
            r0 = r301
            X.00i r0 = r0.A0W
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            r0 = r302
            boolean r0 = r0 instanceof X.JOH
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L7c
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = r302
            X.1pK r0 = (X.1pK) r0
            r302 = r0
            r0 = r302
            r304 = r0
            r0 = r302
            X.JOH r0 = (X.JOH) r0
            X.6x1 r0 = r0.Aba()
            r306 = r0
            r0 = r303
            java.util.Map r0 = r0.A07
            r304 = r0
            r0 = r304
            r1 = r306
            java.lang.Object r0 = r0.get(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L7d
            r0 = r303
            java.util.Map r0 = r0.A08
            r1 = r306
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L72
            r0 = r304
            java.lang.Object r0 = r0.get()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L7d
        L72:
            r0 = r302
            r1 = r303
            X.IBw.A02(r0, r1)
            r0 = r302
            r1 = r303
            X.IBw.A01(r0, r1)
        L7c:
            return
        L7d:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r307
            if (r0 != r1) goto L8b
            r0 = 1
            r305 = r0
        L8b:
            r0 = r305
            com.google.common.base.Preconditions.checkArgument(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.onAttachFragment(androidx.fragment.app.Fragment):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        IQ1 iq1 = this.A03;
        if (iq1 != null) {
            IFl iFl = iq1.A1C;
            if (iFl.A0c()) {
                C5fi.A01(iFl.A0j);
                I8Y i8y = iFl.A0B;
                if (i8y != null) {
                    i8y.A01();
                }
            }
            HAq hAq = iFl.A0M;
            if (hAq == HAq.A0N || hAq == HAq.A0E || hAq == HAq.A0L) {
                IFl.A0B(iFl, HAq.A0G);
            }
            IDa iDa = iq1.A1P;
            C6x1 A04 = iDa.A04();
            I4q Aio = iq1.A1Q.Aio();
            Iterator it = iDa.A07.iterator();
            while (it.hasNext()) {
                ((IFM) it.next()).A0L(A04, Aio);
            }
            I2a i2a = iFl.A0E;
            if (i2a != null) {
                CircularArtPickerView circularArtPickerView = i2a.A02;
                if (circularArtPickerView != null) {
                    i2a.A05.removeView(circularArtPickerView);
                    i2a.A02 = null;
                }
                View view = i2a.A00;
                if (view != null) {
                    i2a.A05.removeView(view);
                    i2a.A00 = null;
                }
            }
            I2a i2a2 = iFl.A0D;
            if (i2a2 != null) {
                CircularArtPickerView circularArtPickerView2 = i2a2.A02;
                if (circularArtPickerView2 != null) {
                    i2a2.A05.removeView(circularArtPickerView2);
                    i2a2.A02 = null;
                }
                View view2 = i2a2.A00;
                if (view2 != null) {
                    i2a2.A05.removeView(view2);
                    i2a2.A00 = null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x00e2, code lost:
    
        if (r0.contains(r307) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005d, code lost:
    
        if (X.HJN.A00(r0.getDecorView()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            r301 = this;
            r0 = -303268821(0xffffffffedec7c2b, float:-9.1485715E27)
            int r0 = X.0FI.A02(r0)
            r305 = r0
            r0 = r301
            X.00i r0 = r0.A0b
            java.lang.Object r0 = r0.get()
            X.Hx8 r0 = (X.Hx8) r0
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.Hx8.A00(r0)
            r306 = r0
            r0 = 481237970(0x1caf1bd2, float:1.158772E-21)
            r307 = r0
            java.lang.String r0 = "fragment_on_create_view"
            r308 = r0
            r0 = r306
            r1 = r307
            r2 = r308
            r0.markerPoint(r1, r2)
            r0 = r301
            boolean r0 = r0.A1B()
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L60
            r0 = r301
            android.app.Activity r0 = r0.A16()
            android.view.Window r0 = r0.getWindow()
            r310 = r0
            java.lang.String r0 = "getHostingActivity().getWindow() should not be null"
            r1 = r310
            X.02W.A03(r0, r1)
            r0 = r310
            android.view.View r0 = r0.getDecorView()
            r308 = r0
            r0 = r308
            boolean r0 = X.HJN.A00(r0)
            r307 = r0
            r0 = 1
            r309 = r0
            r0 = r307
            if (r0 != 0) goto L66
        L60:
            r0 = 0
            r309 = r0
            r0 = 0
            r308 = r0
        L66:
            r0 = r301
            r1 = r309
            r0.A0F = r1
            r0 = r301
            android.app.Dialog r0 = r0.A01
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lcb
            r0 = r308
            android.view.Window r0 = r0.getWindow()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lcb
            r0 = r306
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.addFlags(r1)
            r0 = r306
            r1 = 2
            r0.clearFlags(r1)
            r0 = r306
            r1 = 16
            r0.setSoftInputMode(r1)
            r0 = r301
            boolean r0 = r0.A0F
            r309 = r0
            r0 = r309
            if (r0 != 0) goto Laf
            r0 = 67109120(0x4000100, float:1.5046787E-36)
            r309 = r0
            r0 = r306
            r1 = r309
            r0.addFlags(r1)
        Laf:
            r0 = r301
            boolean r0 = r0.A0F
            r307 = r0
            r0 = 5381(0x1505, float:7.54E-42)
            r309 = r0
            r0 = r307
            if (r0 == 0) goto Lc4
            r0 = 4352(0x1100, float:6.098E-42)
            r309 = r0
        Lc4:
            r0 = r306
            r1 = r309
            X.1tJ.A04(r0, r1)
        Lcb:
            r0 = r302
            r1 = 2132542662(0x7f1c04c6, float:2.0738435E38)
            r2 = r303
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r310 = r0
            r0 = 1020766883(0x3cd7aaa3, float:0.026326483)
            r1 = r305
            X.0FI.A08(r0, r1)
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        GUI gui;
        TextColorLayout textColorLayout;
        DLP dlp;
        int A02 = 0FI.A02(-290234986);
        IQ1 iq1 = this.A03;
        if (iq1 != null) {
            IFl iFl = iq1.A1C;
            TextStylesLayout textStylesLayout = iFl.A0K;
            if (textStylesLayout != null && (dlp = (textColorLayout = textStylesLayout.A02).A07) != null) {
                dlp.A01();
                textColorLayout.A07 = null;
            }
            H4K h4k = iFl.A0H;
            if (h4k != null && (gui = h4k.A01) != null) {
                GSj gSj = gui.A00;
                if (gSj == null) {
                    11T.A0L("doodleDrawable");
                    throw 0Q8.createAndThrow();
                }
                2EU.A04(gSj.A01);
                gSj.A01 = null;
            }
            I8Y i8y = iFl.A0B;
            if (i8y != null) {
                2EU.A04(i8y.A03);
                2EU.A04(i8y.A02);
            }
            MentionSuggestionView mentionSuggestionView = iFl.A0F;
            if (mentionSuggestionView != null) {
                DLP dlp2 = mentionSuggestionView.A08;
                if (dlp2 != null) {
                    dlp2.A01();
                }
                mentionSuggestionView.A08 = null;
            }
            IFl.A05(iFl);
            MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = iq1.A1F.A02;
            if (multimediaEditorPhotoImageViewer != null) {
                2EU.A04(multimediaEditorPhotoImageViewer.A03);
            }
            IDa iDa = iq1.A1P;
            if (iDa != null) {
                Iterator it = iDa.A07.iterator();
                while (it.hasNext()) {
                    ((IFM) it.next()).A0G();
                }
            }
            ICe iCe = iq1.A08;
            if (iCe != null) {
                iCe.A03();
                iq1.A08 = null;
            }
            ((2Pf) iq1.A1I.A00.get()).A00();
            ((5WA) iq1.A0j.get()).A00.markerEnd(5505192, (short) 4);
            if (iq1.A1H.A00.A1P.A04() == C6x1.A02) {
                IQ1.A08(iq1);
            }
            if (iq1.A0p.get() != null) {
                IQ1.A07(iq1);
            }
            IPp iPp = iq1.A1K;
            ICe iCe2 = iPp.A00;
            if (iCe2 != null) {
                iCe2.A03();
                iPp.A00 = null;
            }
            IWN iwn = iq1.A1Q;
            iwn.Ct2(null);
            if (iwn.Afb() == C6x4.A06 && iq1.A1N.A0A != C6r6.A0z) {
                ((C9lD) iq1.A11.get()).A03(iq1.A0C);
            }
            IQ1.A05(iq1);
        }
        A07();
        super.onDestroy();
        LiveData liveData = this.A00;
        if (liveData != null) {
            liveData.removeObservers(this);
        }
        0FI.A08(1346138358, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1160382558);
        super.onDestroyView();
        if (this.A0K != null) {
            C00i c00i = this.A0c;
            if (c00i.get() != null) {
                HqO hqO = (HqO) c00i.get();
                JEm jEm = this.A0K;
                Set set = hqO.A08;
                jEm.getClass();
                set.remove(jEm);
            }
        }
        0FI.A08(-989624578, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        HpN hpN;
        int A02 = 0FI.A02(849971002);
        super/*androidx.fragment.app.Fragment*/.onPause();
        this.A0G = false;
        A06();
        IQ1 iq1 = this.A03;
        IWN iwn = iq1.A1Q;
        if (!iwn.BTP()) {
            iwn.BdJ();
        }
        ICe iCe = iq1.A08;
        if (iCe != null && (hpN = iCe.A00) != null) {
            hpN.A00();
        }
        C2767Gnk c2767Gnk = iq1.A1J.A00;
        if (c2767Gnk != null && ((IFM) c2767Gnk).A06.A02.BJH()) {
            C2767Gnk.A00(((IFM) c2767Gnk).A05, c2767Gnk);
            CaptureButton captureButton = c2767Gnk.A02;
            if (captureButton != null) {
                captureButton.A05();
            }
        }
        MontageComposerFragment montageComposerFragment = iq1.A1N;
        if (montageComposerFragment.A02 != null && ((2yD) iq1.A0h.get()).AZk(36325252842869256L)) {
            Context context = iq1.A0I;
            FbUserSession fbUserSession = iq1.A0L;
            ThreadSummary threadSummary = montageComposerFragment.A02;
            boolean AsL = iwn.AsL();
            11T.A0F(context, 0);
            1BL.A1F(fbUserSession, threadSummary);
            MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04(context, fbUserSession, (1BY) null, 65962);
            long j = threadSummary.A0n.A01;
            Integer valueOf = Integer.valueOf(AsL ? 1 : 0);
            C7vi c7vi = new MailboxCallback() { // from class: X.7vi
                @Override // com.facebook.msys.mca.MailboxCallback
                public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                    if (AnonymousClass001.A1V(obj)) {
                        return;
                    }
                    0fH.A0j("ViewOnceStateManager", "failed to update ephemeral media status");
                }
            };
            1Um A0O = 1BK.A0O(mailboxFeature, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            int A00 = 4uZ.A00(A0P, (1X9) null);
            TraceInfo A022 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamClientThreadUpdateEphemeralMediaStatus");
            A0P.Cu4(c7vi);
            if (!A0O.Cj2(new N83(A00, 3, j, mailboxFeature, A0P, valueOf))) {
                A0P.cancel(false);
                4uZ.A03(A00);
                4uZ.A05((LoggingOption) null, A022, "MailboxTam", "runTamClientThreadUpdateEphemeralMediaStatus");
            }
            PlatformLogger.platformEventLog(5);
        }
        if (this.A03.A0O() || ((5Q1) this.A0a.get()).A02()) {
            HqO hqO = (HqO) this.A0c.get();
            if (hqO.A02) {
                hqO.A02 = false;
                hqO.A06.disable();
                hqO.A03.unregisterComponentCallbacks(hqO.A07);
            }
        }
        6Oe r0 = (6Oe) this.A0f.get();
        FbUserSession fbUserSession2 = this.A0I;
        fbUserSession2.getClass();
        r0.A00(getContext() != null ? getContext() : FbInjector.A00(), fbUserSession2, this.A0B.A05, false);
        0FI.A08(1057652507, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014d A[LOOP:0: B:22:0x0141->B:24:0x014d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.onResume():void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        MediaResource AtC;
        bundle.putString(GOm.A00(39), this.A0D);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        IQ1 iq1 = this.A03;
        if (iq1 != null) {
            IWN iwn = iq1.A1Q;
            if (!iwn.BRq() || (AtC = iwn.AtC()) == null) {
                return;
            }
            bundle.putParcelable("last_opened_media_resource", AtC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(1088550090);
        super/*X.0D2*/.onStart();
        6Oe r0 = (6Oe) this.A0f.get();
        FbUserSession fbUserSession = this.A0I;
        fbUserSession.getClass();
        r0.A00(getContext() != null ? getContext() : FbInjector.A00(), fbUserSession, this.A0B.A05, true);
        0FI.A08(-298058693, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(162079722);
        IQ1 iq1 = this.A03;
        if (iq1 != null) {
            ((2Pf) iq1.A1I.A00.get()).A00();
        }
        super/*X.0D2*/.onStop();
        0FI.A08(-1479613056, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x06e3, code lost:
    
        if (r301.A0H == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x06e6, code lost:
    
        r301.A08 = new X.C7re(null, null, null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0710, code lost:
    
        if (A1C() != r0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0713, code lost:
    
        r0 = r301.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x071b, code lost:
    
        if (r0 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x071e, code lost:
    
        r0.A1Q.D4a();
        r313 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x072e, code lost:
    
        r301.A0H = r313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0737, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x073d, code lost:
    
        A1F(r0.A01, r0.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x075e, code lost:
    
        if (r301.A05 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0761, code lost:
    
        r301.A03.A0M(X.H9e.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0242, code lost:
    
        if (r0.A1A() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0250, code lost:
    
        r332 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025c, code lost:
    
        if (r0.A1F() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025f, code lost:
    
        r332 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0267, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x026a, code lost:
    
        r333 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0276, code lost:
    
        if (r0.A01 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x027f, code lost:
    
        X.11T.A0F(r0, 0);
        r0.A01(r0, r0, null, r0, r331, r332, r333);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0279, code lost:
    
        r333 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x024d, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01cc, code lost:
    
        if (r0.A03 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01e5, code lost:
    
        if (java.lang.Boolean.valueOf(r313).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02a0, code lost:
    
        r0 = r301.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02b3, code lost:
    
        if (r301.A0B.A06 != r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x02b8, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x02bb, code lost:
    
        r0 = (X.C9lD) r301.A0Q.get();
        r0 = r301.A0D;
        r0 = r0.A00();
        r0.A02(r0, r301.A0B.A04, r0);
        ((X.I8L) r301.A0P.get()).A02(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0301, code lost:
    
        r0 = r301.A03;
        r0 = r301.A0c;
        r0.A0K(((X.HqO) r0.get()).A01);
        r0 = (X.HqO) r0.get();
        r0 = new X.IUb(r301);
        r301.A0K = r0;
        r0.A08.add(r0);
        r301.A0J = ((X.82O) r301.A0g.get()).A00(getContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0378, code lost:
    
        if (r301.A0O == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x037b, code lost:
    
        A1E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x037f, code lost:
    
        X.Hx8.A00((X.Hx8) r0.get()).markerPoint(481237970, "fragment_before_reveal_state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x03a2, code lost:
    
        if (((X.0D2) r301).A01 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x03a5, code lost:
    
        r0 = r301.A03;
        r0 = X.H9e.A02;
        r0.A0M(r0);
        r0 = r301.A08;
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x03c6, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x03c9, code lost:
    
        r301.A0H = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x03de, code lost:
    
        if (A1C() != r0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x03e1, code lost:
    
        r0 = r301.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x03e9, code lost:
    
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03ec, code lost:
    
        r0.A0L((X.Hio) null, r0, 3);
        r0 = r301.A08;
        r323 = new X.C7re(r0.A00, r0.A01, null, r0.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x042b, code lost:
    
        r301.A08 = r323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x043c, code lost:
    
        if (((X.0D2) r301).A01.getWindow() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x043f, code lost:
    
        ((X.0D2) r301).A01.getWindow().setSoftInputMode(32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0457, code lost:
    
        r0 = r301.A0B;
        r0 = r0.A0N;
        r334 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x046c, code lost:
    
        if (r0 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x046f, code lost:
    
        r324 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0475, code lost:
    
        r0 = r0.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x047e, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0481, code lost:
    
        r326 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0487, code lost:
    
        r0 = r0.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0490, code lost:
    
        if (r0 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0493, code lost:
    
        r335 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00f9, code lost:
    
        if (r0.A0P != X.C5ew.HD) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0499, code lost:
    
        r0 = r0.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04a2, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x04a5, code lost:
    
        r334 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04ac, code lost:
    
        r302.setPadding(r324, r326, r335, r334);
        X.Hx8.A00((X.Hx8) r0.get()).markerPoint(481237970, "fragment_before_open_media_editor");
        r309 = r301.A0B.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x04df, code lost:
    
        if (r309 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x04e2, code lost:
    
        r336 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04e5, code lost:
    
        r0 = r301.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x04f4, code lost:
    
        if (r0 == X.C6r6.A09) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0500, code lost:
    
        if (r0 == X.C6r6.A0I) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0513, code lost:
    
        if (X.C6r6.A04.equals(r0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0526, code lost:
    
        if (X.C6r6.A0n.equals(r0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0539, code lost:
    
        if (X.C6r6.A0o.equals(r0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x053c, code lost:
    
        r302.post(new X.J0J(r301, r309, r336));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0569, code lost:
    
        if (X.C6r6.A0O.equals(r301.A0A) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0577, code lost:
    
        if (r301.A0B.A0B == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x057a, code lost:
    
        r302.post(new X.Iqc(r301));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x058d, code lost:
    
        X.Hx8.A00((X.Hx8) r0.get()).markerEnd(481237970, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05a3, code lost:
    
        r0 = r309.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x05b3, code lost:
    
        if (r0 != X.5HP.A0F) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x05b6, code lost:
    
        r301.A03.A1Q.CW0(r309, r336);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x05d6, code lost:
    
        if (r0 != X.5HP.A0H) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x05d9, code lost:
    
        r301.A03.A1Q.CW1(r309, r336);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x05f1, code lost:
    
        if (r303 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0604, code lost:
    
        if (r303.getParcelable("last_opened_media_resource") == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0607, code lost:
    
        r309 = (com.facebook.ui.media.attachments.model.MediaResource) r303.getParcelable("last_opened_media_resource");
        r336 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0618, code lost:
    
        if (r309 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x061e, code lost:
    
        r335 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0628, code lost:
    
        r326 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0632, code lost:
    
        r324 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x063c, code lost:
    
        r323 = new X.C7re(null, null, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0654, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x065d, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0660, code lost:
    
        r301.A0H = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0675, code lost:
    
        if (A1C() != r0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0678, code lost:
    
        r0 = r301.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0680, code lost:
    
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0683, code lost:
    
        r0.A1P.A06(r0, false);
        r0 = r301.A08;
        r323 = new X.C7re(null, r0.A01, r0.A02, r0.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x06c3, code lost:
    
        r323 = new X.C7re(r0, null, null, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 1933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewStateRestored(Bundle bundle) {
        int A02 = 0FI.A02(572620799);
        super/*X.0D2*/.onViewStateRestored(bundle);
        View view = this.mView;
        if (view != null) {
            view.setVisibility(0);
        }
        0FI.A08(-1607936466, A02);
    }
}
