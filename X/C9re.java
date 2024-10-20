package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contactstab.plugins.loader.activenow.ContactsTabActiveNowLoader;
import com.facebook.messaging.contactstab.plugins.loader.montage.ContactsTabMontageLoader;
import com.facebook.messaging.contactstab.plugins.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation;
import com.facebook.messaging.highlightstab.loader.HighlightsTabFeedLoaderState;
import com.facebook.messaging.highlightstab.plugins.loader.contactstab.ContactsTabHighlightsLoader;
import com.facebook.messaging.highlightstab.plugins.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9re, reason: invalid class name */
/* loaded from: 9re.class */
public final class C9re implements C7yp {
    public ContactsTabActiveNowLoader A00;
    public ContactsTabMontageLoader A01;
    public RecommendedPublicChannelsLoaderImplementation A02;
    public ContactsTabHighlightsLoader A03;
    public ContactsTabHighlightsPymkLoader A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final Context A0A;
    public final FbUserSession A0B;
    public final C2xg A0C;
    public final 9Wz A0D;
    public final 1YC A0E = 1YC.A03;

    public C9re(Context context, FbUserSession fbUserSession, C2xg c2xg, 9Wz r305) {
        this.A0A = context;
        this.A0D = r305;
        this.A0C = c2xg;
        this.A0B = fbUserSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x009a, all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x009a, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:16:0x0071, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:21:0x0087, B:21:0x0087, B:24:0x0093, B:27:0x008e, B:29:0x0060), top: B:4:0x003b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: Exception -> 0x009a, all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x009a, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:16:0x0071, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:21:0x0087, B:21:0x0087, B:24:0x0093, B:27:0x008e, B:29:0x0060), top: B:4:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9re.A00():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[Catch: Exception -> 0x00a5, all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a5, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006f, B:17:0x009e, B:20:0x0076, B:21:0x007c, B:22:0x0081, B:23:0x0087, B:25:0x0090, B:26:0x0095, B:27:0x0099, B:27:0x0099, B:30:0x0060), top: B:4:0x003b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x00a5, all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a5, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006f, B:17:0x009e, B:20:0x0076, B:21:0x007c, B:22:0x0081, B:23:0x0087, B:25:0x0090, B:26:0x0095, B:27:0x0099, B:27:0x0099, B:30:0x0060), top: B:4:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9re.A01():boolean");
    }

    private boolean A02() {
        boolean A00;
        Object obj;
        if (this.A07 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0E;
            r0.A0B("com.facebook.messaging.contactstab.plugins.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation", "messaging.contactstab.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    if (9Fw.A00 == i) {
                        Boolean bool = 9Fw.A01;
                        if (bool != null) {
                            A00 = bool.booleanValue();
                            if (A00 || !C1ub.A03.A0K()) {
                                obj = C1Y6.A03;
                            } else {
                                this.A02 = new RecommendedPublicChannelsLoaderImplementation(this.A0A, this.A0B, this.A0D);
                                obj = C1Y6.A02;
                            }
                            this.A07 = obj;
                            r0.A07("messaging.contactstab.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A00 = 9Fw.A00(r0, atomicInteger, i);
                    if (A00) {
                    }
                    obj = C1Y6.A03;
                    this.A07 = obj;
                    r0.A07("messaging.contactstab.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A07 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.contactstab.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", andIncrement, 1BL.A1U(this.A07));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.contactstab.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", andIncrement, 1BL.A1U(this.A07));
                throw th;
            }
        }
        return 1BK.A1U(this.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x00b9, all -> 0x00c5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b9, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:16:0x0072, B:17:0x0076, B:20:0x0081, B:21:0x0087, B:22:0x008c, B:23:0x0092, B:25:0x009c, B:26:0x00a2, B:27:0x00a6, B:27:0x00a6, B:30:0x00b2, B:33:0x00ad, B:35:0x0060), top: B:4:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9re.A03():boolean");
    }

    private boolean A04() {
        boolean A00;
        Object obj;
        if (this.A09 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0E;
            r0.A0B("com.facebook.messaging.highlightstab.plugins.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    if (C9G4.A00 == i) {
                        Boolean bool = C9G4.A01;
                        if (bool != null) {
                            A00 = bool.booleanValue();
                            if (A00 || !C1ub.A03.A0E()) {
                                obj = C1Y6.A03;
                            } else {
                                this.A04 = new ContactsTabHighlightsPymkLoader(this.A0A, this.A0B, this.A0D);
                                obj = C1Y6.A02;
                            }
                            this.A09 = obj;
                            r0.A07("messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A00 = C9G4.A00(r0, atomicInteger, i);
                    if (A00) {
                    }
                    obj = C1Y6.A03;
                    this.A09 = obj;
                    r0.A07("messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A09 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", andIncrement, 1BL.A1U(this.A09));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", andIncrement, 1BL.A1U(this.A09));
                throw th;
            }
        }
        return 1BK.A1U(this.A09);
    }

    @Override // X.C7yp
    public void Bs2() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0E;
        r0.A08("com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onCreateView", andIncrement2);
        Exception e = null;
        try {
            if (A00()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.contactstab.plugins.loader.activenow.ContactsTabActiveNowLoader", "messaging.contactstab.loader.activenow.ContactsTabActiveNowLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement3, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "onCreateView");
                r0.A09("messaging.contactstab.loader.activenow.ContactsTabActiveNowLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onCreateView", andIncrement3);
            }
            if (A03()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader";
                r0.A0A("com.facebook.messaging.highlightstab.plugins.loader.contactstab.ContactsTabHighlightsLoader", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", "onCreateView");
                try {
                    try {
                        ContactsTabHighlightsLoader contactsTabHighlightsLoader = this.A03;
                        0fH.A0l("ContactsTabHighlightsLoader", "onCreateView");
                        ((C5bx) 1Br.A0B(contactsTabHighlightsLoader.A03)).A08();
                        9Y2 r02 = (9Y2) 1Br.A0B(contactsTabHighlightsLoader.A02);
                        1Ql A08 = 1Br.A08(r02.A01);
                        1G2 r03 = 1NK.A1b;
                        1Br.A0C(r02.A00);
                        A08.CaH(r03, System.currentTimeMillis());
                        A08.commit();
                        r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onCreateView", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onCreateView", andIncrement);
                    throw th;
                }
            }
            if (A01()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.contactstab.loader.montage.ContactsTabMontageLoader";
                r0.A0A("com.facebook.messaging.contactstab.plugins.loader.montage.ContactsTabMontageLoader", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "onCreateView");
                this.A01.A01();
                r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onCreateView", andIncrement);
            }
            r0.A02((Exception) null, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onCreateView", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onCreateView", andIncrement2);
            throw th2;
        }
    }

    @Override // X.C7yp
    public void C4J(boolean z) {
        String str;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0E;
        r0.A08("com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onLoadMoreContent", andIncrement);
        try {
            try {
                if (A03()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader";
                    r0.A0A("com.facebook.messaging.highlightstab.plugins.loader.contactstab.ContactsTabHighlightsLoader", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", i, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", "onLoadMoreContent");
                    try {
                        ContactsTabHighlightsLoader contactsTabHighlightsLoader = this.A03;
                        if (z) {
                            C1ub c1ub = C1ub.A03;
                            if (!c1ub.A0B() || contactsTabHighlightsLoader.A01 == null) {
                                0fH.A0j("ContactsTabHighlightsLoader", "Start PTR with HighlightsTab loader");
                                ((C5bx) 1Br.A0B(contactsTabHighlightsLoader.A03)).A07();
                            } else {
                                0fH.A0j("ContactsTabHighlightsLoader", "Start PTR with HighlightsTab view model");
                                9Ve r02 = contactsTabHighlightsLoader.A01;
                                if (r02 != null) {
                                    if (c1ub.A0M()) {
                                        r02.A00.A08(C5c2.A05, true);
                                    }
                                    C5c2 c5c2 = C5c2.A05;
                                    2aK.A03((Integer) null, 2Zo.A00(), new AJj(r02, c5c2, (0DR) null, 42, 42), r02.A03, 2);
                                }
                            }
                        } else {
                            0fH.A0j("ContactsTabHighlightsLoader", "Start Bottom loading");
                            ((C5bx) 1Br.A0B(contactsTabHighlightsLoader.A03)).A06();
                        }
                        r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onLoadMoreContent", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A01()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.contactstab.loader.montage.ContactsTabMontageLoader";
                    r0.A0A("com.facebook.messaging.contactstab.plugins.loader.montage.ContactsTabMontageLoader", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", i, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "onLoadMoreContent");
                    ContactsTabMontageLoader contactsTabMontageLoader = this.A01;
                    if (z) {
                        contactsTabMontageLoader.A02();
                    }
                    r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onLoadMoreContent", i);
                }
                r0.A02((Exception) null, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onLoadMoreContent", andIncrement);
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onLoadMoreContent", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "onLoadMoreContent", andIncrement);
            throw th2;
        }
    }

    @Override // X.C7yp
    public void D7F(C2xg c2xg) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0E;
        r0.A08("com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "updateLoaderConfig", andIncrement);
        Exception e = null;
        try {
            if (A03()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.highlightstab.plugins.loader.contactstab.ContactsTabHighlightsLoader", "messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement2, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", "updateLoaderConfig");
                try {
                    try {
                        ContactsTabHighlightsLoader contactsTabHighlightsLoader = this.A03;
                        if (!11T.A0O(contactsTabHighlightsLoader.A00, c2xg)) {
                            contactsTabHighlightsLoader.A00 = c2xg;
                            ((C5bx) 1Br.A0B(contactsTabHighlightsLoader.A03)).A0B(c2xg.A03);
                            contactsTabHighlightsLoader.A01 = (9Ve) c2xg.A01;
                        }
                        r0.A09("messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "updateLoaderConfig", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "updateLoaderConfig", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "updateLoaderConfig", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "updateLoaderConfig", andIncrement);
            throw th2;
        }
    }

    @Override // X.C7yp
    public void init() {
        String str;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0E;
        r0.A08("com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "init", andIncrement);
        try {
            try {
                if (A00()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.contactstab.loader.activenow.ContactsTabActiveNowLoader";
                    r0.A0A("com.facebook.messaging.contactstab.plugins.loader.activenow.ContactsTabActiveNowLoader", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", i, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "init");
                    try {
                        this.A00.A01();
                        r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "init", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A03()) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.highlightstab.plugins.loader.contactstab.ContactsTabHighlightsLoader", "messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement2, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", "init");
                    final ContactsTabHighlightsLoader contactsTabHighlightsLoader = this.A03;
                    9Ve r02 = contactsTabHighlightsLoader.A01;
                    if (r02 != null) {
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) contactsTabHighlightsLoader.A00.A02;
                        if (C1ub.A03.A0B()) {
                            2aK.A03((Integer) null, (0DE) null, AJi.A03(r02, contactsTabHighlightsLoader, null, 24), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), 3);
                        }
                    }
                    ((C5bx) 1Br.A0B(contactsTabHighlightsLoader.A03)).A00 = new 7yU() { // from class: X.9vo
                        public void C49(Throwable th) {
                        }

                        public void C95(8LH r302, HighlightsTabFeedLoaderState highlightsTabFeedLoaderState) {
                            List list = r302.A01;
                            0fH.A0j("ContactsTabHighlightsLoader", 0Pz.A0d("Data received. ", " items", list != null ? list.size() : 0));
                            ContactsTabHighlightsLoader.this.A04.A00(r302, highlightsTabFeedLoaderState, "HIGHLIGHTS_FEED");
                        }
                    };
                    r0.A09("messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "init", andIncrement2);
                }
                if (A04()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader";
                    r0.A0A("com.facebook.messaging.highlightstab.plugins.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", i, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", "init");
                    ContactsTabHighlightsPymkLoader contactsTabHighlightsPymkLoader = this.A04;
                    ((2ZG) 1Br.A0B(contactsTabHighlightsPymkLoader.A02)).A03(contactsTabHighlightsPymkLoader.A05, "PYMK_MESSENGER_HIGHLIGHTS_TAB", contactsTabHighlightsPymkLoader.A00);
                    r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "init", i);
                }
                if (A01()) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.contactstab.plugins.loader.montage.ContactsTabMontageLoader", "messaging.contactstab.loader.montage.ContactsTabMontageLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement3, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "init");
                    r0.A09("messaging.contactstab.loader.montage.ContactsTabMontageLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "init", andIncrement3);
                }
                r0.A02((Exception) null, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "init", andIncrement);
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "init", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "init", andIncrement);
            throw th2;
        }
    }

    @Override // X.C7yp
    public void start() {
        String str;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0E;
        r0.A08("com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "start", andIncrement);
        try {
            try {
                if (A00()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.contactstab.loader.activenow.ContactsTabActiveNowLoader";
                    r0.A0A("com.facebook.messaging.contactstab.plugins.loader.activenow.ContactsTabActiveNowLoader", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", i, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "start");
                    try {
                        this.A00.A02();
                        r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "start", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A03()) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.highlightstab.plugins.loader.contactstab.ContactsTabHighlightsLoader", "messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement2, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", "start");
                    ContactsTabHighlightsLoader contactsTabHighlightsLoader = this.A03;
                    0fH.A0j("ContactsTabHighlightsLoader", "Start");
                    C00i c00i = contactsTabHighlightsLoader.A03.A00;
                    ((C5bx) c00i.get()).A04();
                    ((C5bx) c00i.get()).A09(ASc.A00);
                    ((C5bx) c00i.get()).A03();
                    r0.A09("messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "start", andIncrement2);
                }
                if (A04()) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.highlightstab.plugins.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement3, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", "start");
                    ContactsTabHighlightsPymkLoader contactsTabHighlightsPymkLoader = this.A04;
                    C00i c00i2 = contactsTabHighlightsPymkLoader.A02.A00;
                    2ZG r02 = (2ZG) c00i2.get();
                    2VN r03 = contactsTabHighlightsPymkLoader.A04;
                    11T.A0F(r03, 0);
                    r02.A0A.add(r03);
                    contactsTabHighlightsPymkLoader.A03.A00(((2ZG) c00i2.get()).A00(contactsTabHighlightsPymkLoader.A06 ? contactsTabHighlightsPymkLoader.A01 : contactsTabHighlightsPymkLoader.A00), (Object) null, "HIGHLIGHTS_PYMK");
                    r0.A09("messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "start", andIncrement3);
                }
                if (A01()) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.contactstab.plugins.loader.montage.ContactsTabMontageLoader", "messaging.contactstab.loader.montage.ContactsTabMontageLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement4, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "start");
                    this.A01.A02();
                    r0.A09("messaging.contactstab.loader.montage.ContactsTabMontageLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "start", andIncrement4);
                }
                if (A02()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.contactstab.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation";
                    r0.A0A("com.facebook.messaging.contactstab.plugins.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", i, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "start");
                    final RecommendedPublicChannelsLoaderImplementation recommendedPublicChannelsLoaderImplementation = this.A02;
                    C00i c00i3 = recommendedPublicChannelsLoaderImplementation.A00.A00;
                    ((9Zf) c00i3.get()).A02 = new AY5() { // from class: X.9x9
                        @Override // X.AY5
                        public void C97(8Kh r302) {
                            RecommendedPublicChannelsLoaderImplementation.this.A01.A00(r302, (Object) null, "UNJOINED_BROADCAST_CHANNELS");
                        }
                    };
                    ((9Zf) c00i3.get()).A00();
                    r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "start", i);
                }
                r0.A02((Exception) null, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "start", andIncrement);
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "start", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "start", andIncrement);
            throw th2;
        }
    }

    @Override // X.C7yp
    public void stop() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0E;
        r0.A08("com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "stop", andIncrement2);
        Exception e = null;
        try {
            if (A00()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.contactstab.loader.activenow.ContactsTabActiveNowLoader";
                r0.A0A("com.facebook.messaging.contactstab.plugins.loader.activenow.ContactsTabActiveNowLoader", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "stop");
                try {
                    try {
                        this.A00.A03();
                        r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "stop", andIncrement);
                    } catch (Throwable th) {
                        r0.A04(e, str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "stop", andIncrement);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            }
            if (A03()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.highlightstab.plugins.loader.contactstab.ContactsTabHighlightsLoader", "messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement3, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", "stop");
                ContactsTabHighlightsLoader contactsTabHighlightsLoader = this.A03;
                0fH.A0j("ContactsTabHighlightsLoader", "Stop");
                ((C5bx) 1Br.A0B(contactsTabHighlightsLoader.A03)).A05();
                ((9Y2) 1Br.A0B(contactsTabHighlightsLoader.A02)).A00();
                r0.A09("messaging.highlightstab.loader.contactstab.ContactsTabHighlightsLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "stop", andIncrement3);
            }
            if (A04()) {
                int andIncrement4 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.highlightstab.plugins.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement4, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.highlightstab.plugins.loader.HighlightstabLoaderKillSwitch", "stop");
                ContactsTabHighlightsPymkLoader contactsTabHighlightsPymkLoader = this.A04;
                2ZG r02 = (2ZG) 1Br.A0B(contactsTabHighlightsPymkLoader.A02);
                2VN r03 = contactsTabHighlightsPymkLoader.A04;
                11T.A0F(r03, 0);
                r02.A0A.remove(r03);
                r0.A09("messaging.highlightstab.loader.contactstabhighlightspymk.ContactsTabHighlightsPymkLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "stop", andIncrement4);
            }
            if (A01()) {
                int andIncrement5 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.contactstab.plugins.loader.montage.ContactsTabMontageLoader", "messaging.contactstab.loader.montage.ContactsTabMontageLoader", "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement5, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "stop");
                this.A01.A03();
                r0.A09("messaging.contactstab.loader.montage.ContactsTabMontageLoader", "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "stop", andIncrement5);
            }
            if (A02()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.contactstab.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation";
                r0.A0A("com.facebook.messaging.contactstab.plugins.loader.recommendedpublicchannels.RecommendedPublicChannelsLoaderImplementation", str, "com.facebook.messaging.contactstab.plugins.interfaces.loader.ContactsTabLoaderInterfaceSpec", andIncrement, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "com.facebook.messaging.contactstab.plugins.loader.ContactstabLoaderKillSwitch", "stop");
                ((9Zf) 1Br.A0B(this.A02.A00)).A02 = null;
                r0.A09(str, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "stop", andIncrement);
            }
            r0.A02((Exception) null, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "stop", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.contactstab.loader.ContactsTabLoaderInterfaceSpec", "stop", andIncrement2);
            throw th2;
        }
    }
}
